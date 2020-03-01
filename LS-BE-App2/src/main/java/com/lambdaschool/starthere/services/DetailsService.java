package com.lambdaschool.starthere.services;

import com.lambdaschool.starthere.models.Details;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface DetailsService
{
    ArrayList<Details> findAllPageable(Pageable pageable);

    ArrayList<Details> findAll();

    Details findDetailsById(long id);

    Details save (Details details);

    void delete(long id);

}
