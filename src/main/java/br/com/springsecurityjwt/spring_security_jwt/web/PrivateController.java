package br.com.springsecurityjwt.spring_security_jwt.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


//Recurso que tera a rota protegida.
@RestController
@RequestMapping("private")
public class PrivateController {

    @GetMapping
    public String getMessage() {
        return "Hello from private API controller";
    }
    

}
 