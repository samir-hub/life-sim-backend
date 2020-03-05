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

    @ApiModelProperty(name = "city",
                      value = "User's city size",
                      example = "Small City")
    private String city;

    @ApiModelProperty(name = "colindex",
                      value = "Cost of living index",
                      example = "No College")
    private String colindex;

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

    @ApiModelProperty(name = "",
                      value = "localpurchasingpowerindex",
                      example = "Small City")
    private String localpurchasingpowerindex;



    @ApiModelProperty(name = "user", value = "user that the details are for", required = true, example = "User 20")
    @ManyToOne
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties("details")
    private User user;

    public Details()
    {
    }

    public Details(String education, String major, String city, String colindex, String rentindex, String colplusrentindex, String groceriesindex, String restaurantpriceindex, String localpurchasingpowerindex, User user)
    {
        this.education = education;
        this.major = major;
        this.city = city;
        this.colindex = colindex;
        this.rentindex = rentindex;
        this.colplusrentindex = colplusrentindex;
        this.groceriesindex = groceriesindex;
        this.restaurantpriceindex = restaurantpriceindex;
        this.localpurchasingpowerindex = localpurchasingpowerindex;
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

    public String getLocalpurchasingpowerindex()
    {
        return localpurchasingpowerindex;
    }

    public void setLocalpurchasingpowerindex(String localpurchasingpowerindex)
    {
        this.localpurchasingpowerindex = localpurchasingpowerindex;
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
