package ir.freeland.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SampleController {

    @GetMapping("/sample")
    public String showForm() {
        return "sample";
    }
    
    @GetMapping("/sample2")
    public String showForm2() {
        return "sample2";
    }
    
    @GetMapping("/sample3")
    public String showForm3() {
        return "sample3";
    }
    @GetMapping("/sample4")
    public String showForm4() {
        return "sample4";
    }
    
    @GetMapping("/registerform")
    public String showRegisterForm() {
        return "registerform";
    }
    
    @PostMapping("/result")
    public String showResult() {
        return "result";
    }
    
    @GetMapping("/assignmentRegisterform")
    public String showAssignmentRegisterForm() {
        return "assignmentRegisterform";
    }
    
    @PostMapping("/assignmentResult")
    public String showAssignmentResult() {
        return "assignmentResult";
    }
}
