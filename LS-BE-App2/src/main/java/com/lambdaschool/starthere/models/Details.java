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

    @ApiModelProperty(name = "state",
                      value = "Does the user's state collect income tax?",
                      example = "No State Income Tax")
    private String state;

    @ApiModelProperty(name = "city",
                      value = "User's city size",
                      example = "Small City")
    private String city;

    @ApiModelProperty(name = "col",
                      value = "User's cost of living",
                      example = "Low Cost of Living")
    private String col;

    @ApiModelProperty(name = "user", value = "user that the details are for", required = true, example = "User 20")
    @ManyToOne
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties("details")
    private User user;

    public Details()
    {
    }

    public Details(String education, String major, String state, String city, String col, User user)
    {
        this.education = education;
        this.major = major;
        this.state = state;
        this.city = city;
        this.col = col;
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

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getCol()
    {
        return col;
    }

    public void setCol(String col)
    {
        this.col = col;
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
