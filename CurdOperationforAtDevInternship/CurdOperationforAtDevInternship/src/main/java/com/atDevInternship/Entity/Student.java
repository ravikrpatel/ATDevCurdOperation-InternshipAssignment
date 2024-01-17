package com.atDevInternship.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@ToString
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;
    String name;
    String email;
    String grade;
    String subject;
    int percentage;
}
