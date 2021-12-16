package amdocs.spring.estudies;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String mensagem(){
        return "Projeto JAVA com cara de Organizado e funcional";
    }
    
}
