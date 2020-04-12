package com.lambdaschool.starthere.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import java.util.ArrayList;

@ApiModel(value="Details", description = "The user's details.")
@Entity
@Table(name = "details")
public class Details extends Auditable
{
    @ApiModelProperty(name = "detailsid",
                      value = "primary key for the Details",
                      required = true,
                      example = "1")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long detailsid;

    @ApiModelProperty(name = "education",
                      value = "Education for User",
                      example = "No College")
    private String education;

    @ApiModelProperty(name = "major",
                      value = "Major for User",
                      example = "Business")
    private String major;

    @ApiModelProperty(name = "avgmajor",
                      value = "Average salary for major",
                      example = "50000")
    private float avgmajor;

    @ApiModelProperty(name = "lowmajor",
                      value = "25th percentile salary for major",
                      example = "30000")
    private float lowmajor;

    @ApiModelProperty(name = "highmajor",
                      value = "75th percentile salary for major",
                      example = "60000")
    private float highmajor;


    @ApiModelProperty(name = "city",
                      value = "User's city size",
                      example = "Small City")
    private String city;

    @ApiModelProperty(name = "colindex",
                      value = "Cost of living index",
                      example = "No College")
    private float colindex;

    @ApiModelProperty(name = "rent",
                      value = "Average rent for 1 bedroom apartment",
                      example = "1000")
    private float rent;

    @ApiModelProperty(name = "avgwage",
                      value = "Average yearly wage",
                      example = "No College")
    private float avgwage;

    @ApiModelProperty(name = "rentindex",
                      value = "Major for User",
                      example = "Business")
    private float rentindex;

    @ApiModelProperty(name = "colplusrentindex",
                      value = "User's city size",
                      example = "Small City")
    private float colplusrentindex;

    @ApiModelProperty(name = "groceriesindex",
                      value = "Education for User",
                      example = "No College")
    private float groceriesindex;

    @ApiModelProperty(name = "restaurantpriceindex",
                      value = "Major for User",
                      example = "Business")
    private float restaurantpriceindex;

    @ApiModelProperty(name = "utilities",
                      value = "Monthly utility bill for user",
                      example = "50")
    private float utilities;

    @ApiModelProperty(name = "groceries",
                      value = "Monthly grocery bill for user",
                      example = "500")
    private float groceries;

    @ApiModelProperty(name = "restaurant",
                      value = "Monthly restaurant bill for user",
                      example = "50")
    private float restaurant;

    @ApiModelProperty(name = "premiums",
                      value = "Monthly medical premiums for user",
                      example = "60")
    private float premiums;


    @ApiModelProperty(name = "medExpenses",
                      value = "Monthly medical expenses for user",
                      example = "40")
    private float medExpenses;

    @ApiModelProperty(name = "carPayment",
                      value = "Monthly car payment for user",
                      example = "300")
    private float carPayment;

    @ApiModelProperty(name = "insurance",
                      value = "Monthly insurance bill for user",
                      example = "200")
    private float insurance;

    @ApiModelProperty(name = "gas",
                      value = "Monthly gasoline cost for user",
                      example = "50")
    private float gas;

    @ApiModelProperty(name = "carMaintenance",
                      value = "Monthly car maintenance cost for user",
                      example = "500")
    private float carMaintenance;

    @ApiModelProperty(name = "internet",
                      value = "Monthly internet bill for user",
                      example = "50")
    private float internet;

    @ApiModelProperty(name = "cell",
                      value = "Monthly cell phone bill for user",
                      example = "60")
    private float cell;


    @ApiModelProperty(name = "tv",
                      value = "Monthly tv bill for user",
                      example = "40")
    private float tv;

    @ApiModelProperty(name = "studentLoans",
                      value = "Monthly student loans bill for user",
                      example = "300")
    private float studentLoans;

    @ApiModelProperty(name = "clothing",
                      value = "Monthly clothing cost for user",
                      example = "20")
    private float clothing;

    @ApiModelProperty(name = "entertainment",
                      value = "Monthly entertainment cost for user",
                      example = "30")
    private float entertainment;

    @ApiModelProperty(name = "pOther",
                      value = "Monthly cost for other personal items for user",
                      example = "20")
    private float pOther;

    @ApiModelProperty(name = "user", value = "user that the details are for", required = true, example = "User 20")
    @ManyToOne
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties("details")
    private User user;

    public Details()
    {
    }

    public Details(String education, String major, float avgmajor, float lowmajor, float highmajor, String city, float colindex, float rent, float avgwage, float rentindex, float colplusrentindex, float groceriesindex, float restaurantpriceindex, float utilities, float groceries, float restaurant, float premiums, float medExpenses, float carPayment, float insurance, float gas, float carMaintenance, float internet, float cell, float tv, float studentLoans, float clothing, float entertainment, float pOther, User user)
    {
        this.education = education;
        this.major = major;
        this.avgmajor = avgmajor;
        this.lowmajor = lowmajor;
        this.highmajor = highmajor;
        this.city = city;
        this.colindex = colindex;
        this.rent = rent;
        this.avgwage = avgwage;
        this.rentindex = rentindex;
        this.colplusrentindex = colplusrentindex;
        this.groceriesindex = groceriesindex;
        this.restaurantpriceindex = restaurantpriceindex;
        this.utilities = utilities;
        this.groceries = groceries;
        this.restaurant = restaurant;
        this.premiums = premiums;
        this.medExpenses = medExpenses;
        this.carPayment = carPayment;
        this.insurance = insurance;
        this.gas = gas;
        this.carMaintenance = carMaintenance;
        this.internet = internet;
        this.cell = cell;
        this.tv = tv;
        this.studentLoans = studentLoans;
        this.clothing = clothing;
        this.entertainment = entertainment;
        this.pOther = pOther;
        this.user = user;
    }

    public long getDetailsid()
    {
        return detailsid;
    }

    public void setDetailsid(long detailsid)
    {
        this.detailsid = detailsid;
    }

    public String getEducation()
    {
        return education;
    }

    public void setEducation(String education)
    {
        this.education = education;
    }

    public String getMajor()
    {
        return major;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public float getAvgmajor()
    {
        return avgmajor;
    }

    public void setAvgmajor(float avgmajor)
    {
        this.avgmajor = avgmajor;
    }

    public float getLowmajor()
    {
        return lowmajor;
    }

    public void setLowmajor(float lowmajor)
    {
        this.lowmajor = lowmajor;
    }

    public float getHighmajor()
    {
        return highmajor;
    }

    public void setHighmajor(float highmajor)
    {
        this.highmajor = highmajor;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public float getColindex()
    {
        return colindex;
    }

    public void setColindex(float colindex)
    {
        this.colindex = colindex;
    }

    public float getRent()
    {
        return rent;
    }

    public void setRent(float rent)
    {
        this.rent = rent;
    }

    public float getAvgwage()
    {
        return avgwage;
    }

    public void setAvgwage(float avgwage)
    {
        this.avgwage = avgwage;
    }

    public float getRentindex()
    {
        return rentindex;
    }

    public void setRentindex(float rentindex)
    {
        this.rentindex = rentindex;
    }

    public float getColplusrentindex()
    {
        return colplusrentindex;
    }

    public void setColplusrentindex(float colplusrentindex)
    {
        this.colplusrentindex = colplusrentindex;
    }

    public float getGroceriesindex()
    {
        return groceriesindex;
    }

    public void setGroceriesindex(float groceriesindex)
    {
        this.groceriesindex = groceriesindex;
    }

    public float getRestaurantpriceindex()
    {
        return restaurantpriceindex;
    }

    public void setRestaurantpriceindex(float restaurantpriceindex)
    {
        this.restaurantpriceindex = restaurantpriceindex;
    }

    public float getUtilities()
    {
        return utilities;
    }

    public void setUtilities(float utilities)
    {
        this.utilities = utilities;
    }

    public float getGroceries()
    {
        return groceries;
    }

    public void setGroceries(float groceries)
    {
        this.groceries = groceries;
    }

    public float getRestaurant()
    {
        return restaurant;
    }

    public void setRestaurant(float restaurant)
    {
        this.restaurant = restaurant;
    }

    public float getPremiums()
    {
        return premiums;
    }

    public void setPremiums(float premiums)
    {
        this.premiums = premiums;
    }

    public float getMedExpenses()
    {
        return medExpenses;
    }

    public void setMedExpenses(float medExpenses)
    {
        this.medExpenses = medExpenses;
    }

    public float getCarPayment()
    {
        return carPayment;
    }

    public void setCarPayment(float carPayment)
    {
        this.carPayment = carPayment;
    }

    public float getInsurance()
    {
        return insurance;
    }

    public void setInsurance(float insurance)
    {
        this.insurance = insurance;
    }

    public float getGas()
    {
        return gas;
    }

    public void setGas(float gas)
    {
        this.gas = gas;
    }

    public float getCarMaintenance()
    {
        return carMaintenance;
    }

    public void setCarMaintenance(float carMaintenance)
    {
        this.carMaintenance = carMaintenance;
    }

    public float getInternet()
    {
        return internet;
    }

    public void setInternet(float internet)
    {
        this.internet = internet;
    }

    public float getCell()
    {
        return cell;
    }

    public void setCell(float cell)
    {
        this.cell = cell;
    }

    public float getTv()
    {
        return tv;
    }

    public void setTv(float tv)
    {
        this.tv = tv;
    }

    public float getStudentLoans()
    {
        return studentLoans;
    }

    public void setStudentLoans(float studentLoans)
    {
        this.studentLoans = studentLoans;
    }

    public float getClothing()
    {
        return clothing;
    }

    public void setClothing(float clothing)
    {
        this.clothing = clothing;
    }

    public float getEntertainment()
    {
        return entertainment;
    }

    public void setEntertainment(float entertainment)
    {
        this.entertainment = entertainment;
    }

    public float getpOther()
    {
        return pOther;
    }

    public void setpOther(float pOther)
    {
        this.pOther = pOther;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}
