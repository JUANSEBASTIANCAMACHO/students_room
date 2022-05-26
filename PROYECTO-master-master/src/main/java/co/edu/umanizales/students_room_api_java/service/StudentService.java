package co.edu.umanizales.students_room_api_java.service;

import co.edu.umanizales.students_room_api_java.model.Pet;
import co.edu.umanizales.students_room_api_java.model.Student;
import co.edu.umanizales.students_room_api_java.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students;

    public StudentService() {
        students= new ArrayList<>();
        students.add(new Student("1234555",
                "Carlos Loaiza",2000000,'M',
                true,"3016052808"));
        students.add(new Student("2343434",
                "Lucas Villegas",1000001,'M',
                true,"3057707378"));
        students.add(new Student("23434343",
                "Catherine Betancurt",0,'F',
                false,"3057707378"));

    }

    public List<Student> getAllStudents()
    {
        return students;
    }

    public float getPercentageByGender(char gender)
    {
        int count=0;
        for(Student student:students)
        {
            if(student.getGender()==gender)
            {
                count++;
            }
        }
        return count/(float)students.size();
    }

    public List<Student> getStudentsWork()
    {
        List<Student> studentsWork = new ArrayList<>();
        for(Student student:students)
        {
            if(student.isJob() && student.getSalary() > 1000000)
            {
                studentsWork.add(student);
            }
        }
        return studentsWork;
    }

    public List<Student> getStudentsWorkBysalary
            (char gender, double salary){
        List<Student> studentsWork= new ArrayList<>();
        for(Student student:students)
        {
            if(student.isJob() && student.getGender()==gender
                    && student.getSalary()>= salary)
            {
                studentsWork.add(student);
            }
        }
        return studentsWork;
    }
}
