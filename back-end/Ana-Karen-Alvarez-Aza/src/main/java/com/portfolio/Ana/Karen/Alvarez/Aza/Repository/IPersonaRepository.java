
package com.portfolio.Ana.Karen.Alvarez.Aza.Repository;

import com.portfolio.Ana.Karen.Alvarez.Aza.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona,Long>{
    
}
