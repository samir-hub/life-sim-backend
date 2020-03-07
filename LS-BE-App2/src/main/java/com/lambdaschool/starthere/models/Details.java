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
    private String avgmajor;

    @ApiModelProperty(name = "lowmajor",
                      value = "25th percentile salary for major",
                      example = "30000")
    private String lowmajor;

    @ApiModelProperty(name = "highmajor",
                      value = "75th percentile salary for major",
                      example = "60000")
    private String highmajor;


    @ApiModelProperty(name = "city",
                      value = "User's city size",
                      example = "Small City")
    private String city;

    @ApiModelProperty(name = "colindex",
                      value = "Cost of living index",
                      example = "No College")
    private String colindex;

    @ApiModelProperty(name = "avgrent",
                      value = "Average rent for 1 bedroom apartment",
                      example = "Small City")
    private String avgrent;

    @ApiModelProperty(name = "avgwage",
                      value = "Average yearly wage",
                      example = "No College")
    private String avgwage;

    @ApiModelProperty(name = "rentindex",
                      value = "Major for User",
                      example = "Business")
    private String rentindex;

    @ApiModelProperty(name = "colplusrentindex",
                      value = "User's city size",
                      example = "Small City")
    private String colplusrentindex;

    @ApiModelProperty(name = "groceriesindex",
                      value = "Education for User",
                      example = "No College")
    private String groceriesindex;

    @ApiModelProperty(name = "restaurantpriceindex",
                      value = "Major for User",
                      example = "Business")
    private String restaurantpriceindex;


    @ApiModelProperty(name = "user", value = "user that the details are for", required = true, example = "User 20")
    @ManyToOne
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties("details")
    private User user;

    public Details()
    {
    }

    public Details(String education, String major, String avgmajor, String lowmajor, String highmajor, String city, String colindex, String avgrent, String avgwage, String rentindex, String colplusrentindex, String groceriesindex, String restaurantpriceindex, User user)
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

    public String getAvgmajor()
    {
        return avgmajor;
    }

    public void setAvgmajor(String avgmajor)
    {
        this.avgmajor = avgmajor;
    }

    public String getLowmajor()
    {
        return lowmajor;
    }

    public void setLowmajor(String lowmajor)
    {
        this.lowmajor = lowmajor;
    }

    public String getHighmajor()
    {
        return highmajor;
    }

    public void setHighmajor(String highmajor)
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

    public String getColindex()
    {
        return colindex;
    }

    public void setColindex(String colindex)
    {
        this.colindex = colindex;
    }

    public String getAvgrent()
    {
        return avgrent;
    }

    public void setAvgrent(String avgrent)
    {
        this.avgrent = avgrent;
    }

    public String getAvgwage()
    {
        return avgwage;
    }

    public void setAvgwage(String avgwage)
    {
        this.avgwage = avgwage;
    }

    public String getRentindex()
    {
        return rentindex;
    }

    public void setRentindex(String rentindex)
    {
        this.rentindex = rentindex;
    }

    public String getColplusrentindex()
    {
        return colplusrentindex;
    }

    public void setColplusrentindex(String colplusrentindex)
    {
        this.colplusrentindex = colplusrentindex;
    }

    public String getGroceriesindex()
    {
        return groceriesindex;
    }

    public void setGroceriesindex(String groceriesindex)
    {
        this.groceriesindex = groceriesindex;
    }

    public String getRestaurantpriceindex()
    {
        return restaurantpriceindex;
    }

    public void setRestaurantpriceindex(String restaurantpriceindex)
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
