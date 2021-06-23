package jgomez.springframework.spring5petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Class OwnerController
 *
 * @author Joan Gomez
 * @version 1.0
 **/
@Controller
public class OwnerController {

    @RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
    public String listOwners() {
        return "owners/index";
    }

}
