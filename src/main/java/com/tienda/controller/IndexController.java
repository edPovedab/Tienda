package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Eduardo
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {
        //model.addAttribute("attribute", "value");
        return "index";
    }
    @RequestMapping("/contacto")
    public String contacto(Model model) {
        //model.addAttribute("attribute", "value");
        //Long idUsuario = (Long)session.getAttribute("idUsuario");
        return "contacto";
    }

}
