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

    @ApiModelProperty(name = "avgrent",
                      value = "Average rent for 1 bedroom apartment",
                      example = "Small City")
    private int avgrent;

    @ApiModelProperty(name = "avgwage",
                      value = "Average yearly wage",
                      example = "No College")
    private int avgwage;

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


    @ApiModelProperty(name = "user", value = "user that the details are for", required = true, example = "User 20")
    @ManyToOne
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties("details")
    private User user;

    public Details()
    {
    }

    public Details(String education, String major, float avgmajor, float lowmajor, float highmajor, String city, float colindex, int avgrent, int avgwage, float rentindex, float colplusrentindex, float groceriesindex, float restaurantpriceindex, User user)
    {
        this.education = education;
        this.major = major;
        this.avgmajor = avgmajor;
        this.lowmajor = lowmajor;
        this.highmajor = highmajor;
        this.city = city;
        this.colindex = colindex;
        this.avgrent = avgrent;
        this.avgwage = avgwage;
        this.rentindex = rentindex;
        this.colplusrentindex = colplusrentindex;
        this.groceriesindex = groceriesindex;
        this.restaurantpriceindex = restaurantpriceindex;
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

    public int getAvgrent()
    {
        return avgrent;
    }

    public void setAvgrent(int avgrent)
    {
        this.avgrent = avgrent;
    }

    public int getAvgwage()
    {
        return avgwage;
    }

    public void setAvgwage(int avgwage)
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

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}
