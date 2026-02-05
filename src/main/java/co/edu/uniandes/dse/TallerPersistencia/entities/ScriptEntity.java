package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class ScriptEntity extends BaseEntity {
    private String originalName;
    private String name;
    @OneToOne(mappedBy = "script")
    private MovieEntity movie;
    
}
