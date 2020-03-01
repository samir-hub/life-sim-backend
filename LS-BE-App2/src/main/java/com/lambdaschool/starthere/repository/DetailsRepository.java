package com.lambdaschool.starthere.repository;

import com.lambdaschool.starthere.models.Details;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DetailsRepository extends PagingAndSortingRepository<Details, Long>
{
}
