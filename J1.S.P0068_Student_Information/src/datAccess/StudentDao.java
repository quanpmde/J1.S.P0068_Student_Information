/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_access;

import common.Library;
import common.Validation;
import java.util.Collections;
import java.util.List;
import model.Student;

public class StudentDao {

    private static StudentDao instance = null;
    protected Validation valid = new Validation();

    public static StudentDao Instance() {
        if (instance == null) {
            synchronized (StudentDao.class) {
                if (instance == null) {
                    instance = new StudentDao();
                }
            }
        }
        return instance;
    }

    public void adding(List<Student> students, Student new_student) {
        String choice = "Y";
        while(choice.equalsIgnoreCase("Y")){
            new_student.setName(valid.inputString("Enter name"));
            new_student.setClasses(valid.inputString("Enter class"));
            new_student.setMark(valid.inputInt("Enter mark", 0, 100));
            students.add(new_student);
            Collections.sort(students, new Library());
            choice = valid.inputStringMatch("Do you want to enter more student information?(Y/N)", "[YNyn]");
        }
    }

    public void display(List<Student> students) {
        int count = 1;
        for (Student student : students) {
            System.out.println("-------------Student " + count+"-------------");
            System.out.println(student.toString());
            count++;
        }
    }
}
