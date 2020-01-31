package com.kosta.acme.course;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
