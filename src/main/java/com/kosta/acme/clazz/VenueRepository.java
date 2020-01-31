package com.kosta.acme.clazz;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {
}
