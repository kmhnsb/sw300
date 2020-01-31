package com.kosta.acme.customer;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
