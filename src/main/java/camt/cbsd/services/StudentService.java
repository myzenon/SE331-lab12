package camt.cbsd.services;

import camt.cbsd.entity.RegisterEntity;
import camt.cbsd.entity.Student;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Dto on 3/11/2017.
 */
public interface StudentService {
    List<Student> getStudents();
    Student findById(long id);
    Student addStudent(Student student);
    Student getStudentForTransfer(String username);
    Student addStudent(Student student, String imageFileName, BufferedImage image) throws IOException;
    List<Student> queryStudent(String query);
    Student addStudent(RegisterEntity registerEntity);
}
