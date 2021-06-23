package jgomez.springframework.spring5petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Class VetController
 *
 * @author Joan Gomez
 * @version 1.0
 **/
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String list() {
        return "vets/index";
    }

}
