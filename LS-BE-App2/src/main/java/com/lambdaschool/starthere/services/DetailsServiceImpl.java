package com.lambdaschool.starthere.services;

import com.lambdaschool.starthere.models.Details;
import com.lambdaschool.starthere.repository.DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;

@Service(value = "detailsService")
public class DetailsServiceImpl implements DetailsService
{
    @Autowired
    private DetailsRepository detailsrepos;

    @Override
    public ArrayList<Details> findAll()
    {
        ArrayList<Details> list = new ArrayList<>();
        detailsrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public ArrayList<Details> findAllPageable(Pageable pageable)
    {
        ArrayList<Details> list = new ArrayList<>();
        detailsrepos.findAll(pageable).iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Details findDetailsById(long id) throws EntityNotFoundException
    {
        return detailsrepos.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Long.toString(id)));
    }

    @Override
    public Details save(Details details)
    {

        return detailsrepos.save(details);
    }

    @Transactional
    @Override
    public void delete(long id)
    {
        detailsrepos.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Details id " + id + " not found!"));
        detailsrepos.deleteById(id);
    }

}
