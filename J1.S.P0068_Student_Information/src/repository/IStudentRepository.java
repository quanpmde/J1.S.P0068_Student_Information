/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;
import model.Student;

/**
 *
 * @author Admin
 */
public interface IStudentRepository {

    void adding(List<Student> students, Student new_student);

    void display(List<Student> students);
    
}