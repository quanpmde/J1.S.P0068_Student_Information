/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import data_access.StudentDao;
import java.util.List;
import model.Student;

public class StudentRepository implements IStudentRepository {
    @Override
    public void adding(List<Student> students, Student new_student){
        StudentDao.Instance().adding(students, new_student);
    }
    
    @Override
    public void display(List<Student> students){
        if(students.isEmpty()){
            System.out.println("List is empty");
            return;
        }
        StudentDao.Instance().display(students);
    }
}