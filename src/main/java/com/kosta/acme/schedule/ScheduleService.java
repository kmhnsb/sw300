package com.kosta.acme.schedule;

import com.kosta.acme.clazz.Clazz;
import com.kosta.acme.course.Course;

import java.util.List;

public interface ScheduleService {
    //use case : course 의 특정 id 주면 detail 을 가져온다.
    List<Course> getCourses();
    Course getDetailOfCourse(Long courseId);
    List<Clazz> detailOfClassesForCourses(Long courseId);
    Clazz detailOfClazz(Long clazzId);
    //clazz day, instructor, venue associate.
    void associateInstructorForClazzDay(Long clazzDayId, Long instructorId);
    void associateVenueForClazzDay(Long clazzDayId, Long venueId);

}
