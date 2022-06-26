package com.jasonmicroservices.tutor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.GenerationType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tutor {

    @Id
    @SequenceGenerator(
            name = "tutor_id_sequence",
            sequenceName = "tutor_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tutor_id_sequence"
    )
    private int id;
    private String firstName;
    private String lastName;
    private String email;
}
