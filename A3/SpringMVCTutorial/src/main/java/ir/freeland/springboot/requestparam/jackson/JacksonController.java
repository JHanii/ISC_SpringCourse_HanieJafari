package ir.freeland.springboot.requestparam.jackson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/jakson")
public class JacksonController {

	@Autowired
	Shop shop;
	
    private static Logger log = LoggerFactory.getLogger(JacksonController.class);

    @PostMapping("/request/product")
    public ResponseEntity<HttpStatus> postController(@RequestBody Product product) {
        log.debug(product.toString());
        return ResponseEntity.ok(HttpStatus.OK);
    }
    
    @GetMapping("/get/shop")
    @ResponseBody
    public Shop postController() {
    	log.debug(shop.toString());
        return shop;
    }

}