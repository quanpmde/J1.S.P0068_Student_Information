/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Student;
import repository.StudentRepository;
import view.Menu;


public class StudentController extends Menu{
    protected static String[] mc = {"Enter student information",
                                    "Display student information", "Exit"};
    protected StudentRepository repo;
    protected Student student;
    
    public StudentController(){
        super("====== Collection Sort Program ======", mc);
        repo = new StudentRepository();
        student = new Student();
    }

    @Override
    public void execute(int choice) {
        switch(choice){
            case 1:{
                repo.adding(student.getStudents(), new Student());
                break;
            }
            case 2:{
                repo.display(student.getStudents());
                break;
            }
            case 3:{
                System.out.println("EXIT...");
                System.exit(0);
            }
            default:{
                System.out.println("No such choice!");
            }
        }
    }
}