package com.atDevInternship.Services;

import com.atDevInternship.Entity.Student;
import com.atDevInternship.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {
    @Autowired
    private StudentRepository repository;

    public Student addStudent(Student student){
        return repository.save(student);
    }

    public List<Student> saveAllStudents(List<Student> students){
        return repository.saveAll(students);
    }

    public Student getOneStudent(int id){
        return repository.findById(id).orElse(null);
    }

    public List<Student> getAllStudent(){
        return repository.findAll();
    }

    public Student updateStudent(Student student){
        Student existingStud=repository.findById(student.getId()).orElse(null);
        existingStud.setEmail(student.getEmail());
        existingStud.setName(student.getName());
        existingStud.setGrade(student.getGrade());
        existingStud.setPercentage(student.getPercentage());
        existingStud.setSubject(student.getSubject());
        return repository.save(existingStud);
    }

    public String deleteStudent(int id){
        repository.deleteById(id);
        return "student remove:" + id;
    }



}
