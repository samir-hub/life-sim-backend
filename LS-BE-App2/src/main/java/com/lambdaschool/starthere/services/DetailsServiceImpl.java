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

    @Override
    public Details update(Details details, long id)
    {
        Details currentDetails = detailsrepos.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Long.toString(id)));

        if (details.getRent() != 0.0)
        {
            currentDetails.setRent(details.getRent());
        } else {
            currentDetails.setRent(currentDetails.getRent());
        }

        if (details.getAvgmajor() != 0.0)
        {
            currentDetails.setAvgmajor(details.getAvgmajor());
        } else {
            currentDetails.setAvgmajor(currentDetails.getAvgmajor());
        }

        if (details.getUtilities() != 0.0)
        {
            currentDetails.setUtilities(details.getUtilities());
        } else {
            currentDetails.setUtilities(currentDetails.getUtilities());
        }

        if (details.getGroceries() != 0.0)
        {
            currentDetails.setGroceries(details.getGroceries());
        }else {
            currentDetails.setGroceries(currentDetails.getGroceries());
        }

        if (details.getRestaurant() != 0.0)
        {
            currentDetails.setRestaurant(details.getRestaurant());
        }else {
            currentDetails.setRestaurant(currentDetails.getRestaurant());
        }

        if (details.getPremiums() != 0.0)
        {
            currentDetails.setPremiums(details.getPremiums());
        }else {
            currentDetails.setPremiums(currentDetails.getPremiums());
        }

        if (details.getMedExpenses() != 0.0)
        {
            currentDetails.setMedExpenses(details.getMedExpenses());
        }else {
            currentDetails.setMedExpenses(currentDetails.getMedExpenses());
        }

        if (details.getCell() != 0.0)
        {
            currentDetails.setCell(details.getCell());
        }else {
            currentDetails.setCell(currentDetails.getCell());
        }

        if (details.getInternet()!= 0.0)
        {
            currentDetails.setInternet(details.getInternet());
        }else {
            currentDetails.setInternet(currentDetails.getInternet());
        }

        if (details.getTv() != 0.0)
        {
            currentDetails.setTv(details.getTv());
        }else {
            currentDetails.setTv(currentDetails.getTv());
        }

        if (details.getStudentLoans() != 0.0)
        {
            currentDetails.setStudentLoans(details.getStudentLoans());
        }else {
            currentDetails.setStudentLoans(currentDetails.getStudentLoans());
        }

        if (details.getCarPayment() != 0.0)
        {
            currentDetails.setCarPayment(details.getCarPayment());
        }else {
            currentDetails.setCarPayment(currentDetails.getCarPayment());
        }

        if (details.getInsurance() != 0.0)
        {
            currentDetails.setInsurance(details.getInsurance());
        }else {
            currentDetails.setInsurance(currentDetails.getInsurance());
        }

        if (details.getGas() != 0.0)
        {
            currentDetails.setGas(details.getGas());
        }else {
            currentDetails.setGas(currentDetails.getGas());
        }

        if (details.getCarMaintenance() != 0.0)
        {
            currentDetails.setCarMaintenance(details.getCarMaintenance());
        }else {
            currentDetails.setCarMaintenance(currentDetails.getCarMaintenance());
        }

        if (details.getClothing() != 0.0)
        {
            currentDetails.setClothing(details.getClothing());
        }else {
            currentDetails.setClothing(currentDetails.getClothing());
        }

        if (details.getEntertainment() != 0.0)
        {
            currentDetails.setEntertainment(details.getEntertainment());
        }else {
            currentDetails.setEntertainment(currentDetails.getEntertainment());
        }

        if (details.getpOther() != 0.0)
        {
            currentDetails.setpOther(details.getpOther());
        }else {
            currentDetails.setpOther(currentDetails.getpOther());
        }

        return detailsrepos.save(currentDetails);
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
