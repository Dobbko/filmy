package pl.zajecia.filmy.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class VideoCassete {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String title;
    private LocalDate prodactionYear;

    public VideoCassete() {
    }

    public VideoCassete(Long id, String title, LocalDate prodactionYear) {
        this.id = id;
        this.title = title;
        this.prodactionYear = prodactionYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getProdactionYear() {
        return prodactionYear;
    }

    public void setProdactionYear(LocalDate prodactionYear) {
        this.prodactionYear = prodactionYear;
    }
}
