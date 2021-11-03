package org.generation.dependencies_injection;

import org.generation.dependencies_injection.model.Student;
import org.generation.dependencies_injection.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final List<Student> studentList = new ArrayList<>();

    public StudentServiceImpl() {
        addStudents();
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public void delete(Student student) {
        studentList.remove(student);
    }

    @Override
    public List<Student> all() {
        return studentList;
    }

    @Override
    public Student findById(String id) {
        return studentList.get(Integer.parseInt(id));
    }

    private void addStudents() {
        studentList.add(new Student("1", 1, "Victor", "Ramón", 1));
        studentList.add(new Student("2", 2, "Susana", "Horia", 2));
        studentList.add(new Student("3", 3, "Maria", "Rico", 1));
        studentList.add(new Student("4", 4, "Erick", "Perez", 3));
    }
}
