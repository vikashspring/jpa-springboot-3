package com.vikash.jpa.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
//@Table(name = "AUTHOR_TBL")
public class Author {

    @Id
    @GeneratedValue
    /*
            (
            strategy = GenerationType.TABLE,
            //generator = "author_sequence"
            generator = "author_id_gen"
    )
    @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1
    )
    @TableGenerator(
            name = "author_id_gen",
            table = "id_generator",
            pkColumnName = "id_name",
            valueColumnName = "id_value",
            allocationSize = 1

    )

     */
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

    /*@Column(
            updatable = false,
            nullable = false

    )
    private LocalDateTime createdAt;

    @Column(
            insertable = false
    )
    private LocalDateTime lastModified;*/
}
