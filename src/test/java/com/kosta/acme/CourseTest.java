package com.kosta.acme;

import com.kosta.acme.course.Course;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = AcmeApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)

public class CourseTest {
    @Autowired
    private TestRestTemplate template;  //rest test template 이 있음.
    @Test
    public void createCourse(){
        //given
        Course course = new Course("SW300", 2, 20, 8, 300000);
        //when
        template.postForEntity("http://localhost:8080/courses", course, Course.class);
        //ten
        ResponseEntity<Course> courseResponseEntity = template.getForEntity("http://localhost:8080/courses/1", Course.class);
        assertEquals(courseResponseEntity.getBody().getTitle(), course.getTitle());
    }
}
