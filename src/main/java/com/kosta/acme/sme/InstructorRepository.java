package com.kosta.acme.sme;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface InstructorRepository extends PagingAndSortingRepository <Instructor, Long> {
}
