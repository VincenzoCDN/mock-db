package co.develhope.mockdb.entities;

import javax.persistence.*;

@Entity
@Table(name = "Enroll")
public class Enrollment {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int idStudent;

    @Column(nullable = false)
    private String idClass;
}
