
package com.portfolio.Ana.Karen.Alvarez.Aza.Controller;

import com.portfolio.Ana.Karen.Alvarez.Aza.Entity.Persona;
import com.portfolio.Ana.Karen.Alvarez.Aza.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public String createPersona()
}
