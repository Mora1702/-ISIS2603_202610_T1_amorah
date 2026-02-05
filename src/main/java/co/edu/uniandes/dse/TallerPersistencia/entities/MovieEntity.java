package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class MovieEntity extends BaseEntity{
    private String title;
    private Integer releaseYear;
    @ManyToOne
    private DirectorEntity director;
    @ManyToMany
    private List<GenreEntity> genres = new ArrayList<>();
    @OneToOne (cascade = CascadeType.ALL, orphanRemoval =true)
    private ScriptEntity script;
}
