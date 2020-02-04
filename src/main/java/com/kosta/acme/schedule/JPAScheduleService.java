package com.kosta.acme.schedule;

import com.kosta.acme.clazz.Clazz;
import com.kosta.acme.clazz.ClazzDay;
import com.kosta.acme.clazz.ClazzDayRepository;
import com.kosta.acme.course.Course;
import com.kosta.acme.course.CourseRepository;
import com.kosta.acme.sme.Instructor;
import com.kosta.acme.sme.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class JPAScheduleService implements ScheduleService {
    @Autowired
    private CourseRepository courseRepo;
    @Autowired
    private ClazzDayRepository clazzDayRepo;
    @Autowired
    private InstructorRepository instructorRepo;
    @Override
    public List<Course> getCourses() {
        List<Course> result = (List<Course>) courseRepo.findAll();
        return result;
    }

    @Override
    public Course getDetailOfCourse(Long courseId) {
        return null;
    }

    @Override
    public List<Clazz> detailOfClassesForCourses(Long courseId) {
        return null;
    }

    @Override
    public Clazz detailOfClazz(Long clazzId) {
        return null;
    }

    @Override
    public void associateInstructorForClazzDay(Long clazzDayId, Long instructorId) {
        final Optional <ClazzDay> clazzDayResult = clazzDayRepo.findById(clazzDayId);
        final Optional <Instructor> instructorResult = instructorRepo.findById(instructorId);
        if (clazzDayResult.isPresent() && instructorResult.isPresent()) {
            Instructor instructor = instructorResult.get();
            instructor.addClazzDay(clazzDayResult.get());
            instructorRepo.save(instructor);
        }
        //실제로 여기에 associate rule 이 들어가야 하는데 이런 validation 은 domain 에 넣어줘야 한다. addClazzDay 가 associate class day 로 됨.

    }

    @Override
    public void associateVenueForClazzDay(Long clazzDayId, Long venueId) {

    }
}
