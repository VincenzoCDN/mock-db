package co.develhope.mockdb.entities;

import javax.persistence.*;

@Entity
@Table(name = "Class")
public class SchoolClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length=50)
    private String title;

    @Column(nullable = false, length=50)
    private String description;

    public SchoolClass(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public SchoolClass() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
