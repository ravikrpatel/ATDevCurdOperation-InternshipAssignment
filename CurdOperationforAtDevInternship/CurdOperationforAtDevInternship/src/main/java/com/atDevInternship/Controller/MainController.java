package com.atDevInternship.Controller;

import com.atDevInternship.Entity.Student;
import com.atDevInternship.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class MainController {
    @Autowired
    private StudentServices services;
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return services.addStudent(student);
    }
    @PostMapping("/addAllStudents")
    public List<Student> addAllStudent(@RequestBody List<Student> students){
        return services.saveAllStudents(students);
    }
    @GetMapping("getOneStudent/{id}")
    public Student getOneStudent(@PathVariable int id){
        return services.getOneStudent(id);
    }
    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent(){
        return services.getAllStudent();
    }
    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return services.updateStudent(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStduent(@PathVariable int id){
        return services.deleteStudent(id);
    }

}
