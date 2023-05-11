package pl.edu.vistula.firstprojectjavaspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
//@RestController
public class HelloController {

    @GetMapping(value =  "/")
    public String hello() { return "Hello Vistula, in my First Spring controller."; }

    @GetMapping( "/greeting")
    public String greeting(Model model , @RequestParam(name="name", required = false, defaultValue="World") String name) {
        model.addAttribute( "name",name);
        return "greeting";
    }
    //http://localhost:8080/greeting?name=Vistula

}
