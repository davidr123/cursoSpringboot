package com.bolsadeideas.springboot.web.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bolsadeideas.springboot.web.app.models.Usuario;

 @Controller 
 @RequestMapping("/app")
//  (marca la calse con tipo controlador)
public class IndexController {
    //En este RequestMapping se puede poner una ruta la que sa y siempre va a apuntar 
    // al ambiente o de manera local que se este escuchado ejemplo localhost:8000/index
    @GetMapping({"/index", "/", "/home"})
//Cuando usamos Getmapping podemos, usarle con rutas diferentes     
    public String index(Model model){
        model.addAttribute("titulo", "THAÍS TE AMO MI AMOR I MIS YOU");
        return "index";
    }

    @GetMapping("/perfil")
    public String perfil(Model model){
        Usuario usuario = new Usuario();
        usuario.setNombre("Freddy");
        usuario.setApellido(("Rada"));
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "El perfil de usuario es:".concat(usuario.getNombre()));
        return "perfil";
    }
    
}
