package ir.freeland.springboot.requestparam.assignment;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AssignmentController {
	
    //Get Book by id
    @GetMapping("/get/books/{id}")
    @ResponseBody
    public String getBookById(@PathVariable String id){
        return "ID: " + id;
    }
    
    //Post Create Book
    @PostMapping("/post/book/create")
    @ResponseBody
    public String addBook(@RequestParam(name = "id") String bookId, @RequestParam String name){ 
        return "ID: " + bookId;
    }
    
    // Put Book by id
    @PutMapping("/put/books/{id}")
    @ResponseBody
    public String updateBook(@RequestBody Book book, @PathVariable String id){
    	book.update(book.findById(id));
        return "book number " + id + " has been updated";
    }
    
    //Delete Book by id
    @DeleteMapping("/delete/books/{id}")
    @ResponseBody
    public String deleteBook(@PathVariable String id) {
    	Book book = new Book();
        book.deleteById(id);
        return "book number " + id + " has been deleted";
    }
    
}
