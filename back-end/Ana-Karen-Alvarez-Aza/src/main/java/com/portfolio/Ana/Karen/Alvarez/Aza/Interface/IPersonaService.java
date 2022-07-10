
package com.portfolio.Ana.Karen.Alvarez.Aza.Interface;

import com.portfolio.Ana.Karen.Alvarez.Aza.Entity.Persona;
import java.util.List;


public interface IPersonaService {
   //Traer una persona//

    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona//
    public void savePersona (Persona persona);
    
    //Eliminar un obj por busqueda ID//
    public void deletePersona (Long id);
    
    //Buscar una persona por ID//
    public Persona findPersona (Long id); 
}
