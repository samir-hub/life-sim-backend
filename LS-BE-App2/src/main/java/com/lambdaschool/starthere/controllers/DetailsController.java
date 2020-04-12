package com.lambdaschool.starthere.controllers;

import com.lambdaschool.starthere.models.Details;
import com.lambdaschool.starthere.services.UserService;
import com.lambdaschool.starthere.services.DetailsService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/")
public class DetailsController
{
    @Autowired
    private DetailsService detailsService;

    @Autowired
    private UserService userService;

    @ApiOperation(value= "return all Details", response= Details.class, responseContainer = "List")

    @ApiImplicitParams({
                               @ApiImplicitParam(name = "page", dataType = "integer", paramType = "query",
                                                 value = "Results page you want to retrieve (0..N)"),
                               @ApiImplicitParam(name = "size", dataType = "integer", paramType = "query",
                                                 value = "Number of records per page."),
                               @ApiImplicitParam(name = "sort", allowMultiple = true, dataType = "string", paramType = "query",
                                                 value = "Sorting criteria in the format: property(,asc|desc). " +
                                                         "Default sort order is ascending. " +
                                                         "Multiple sort criteria are supported.")})
    //http://localhost:2019/details/details/paging/?page=1&size=10
    //http://localhost:2019/details/details/paging/?sort=city&sort=name
    @GetMapping(value = "details/details/paging", produces = {"application/json"})
    public ResponseEntity<?> listAllDetailsByPage(@PageableDefault(page=0,
                                                                   size=3)
                                                          Pageable pageable)
    {
        ArrayList<Details> myDetails = detailsService.findAllPageable(pageable);
        return new ResponseEntity<>(myDetails, HttpStatus.OK);
    }


    @GetMapping(value = "details/details", produces = {"application/json"})
    public ResponseEntity<?> listAllDetails()
    {
        ArrayList<Details> myDetails = detailsService.findAll();
        return new ResponseEntity<>(myDetails, HttpStatus.OK);
    }

    //http://localhost:2019/details/details/2
    @GetMapping(value = "details/details/{detailsid}",
                produces = {"application/json"})
    public ResponseEntity<?> getDetailsById(
            @PathVariable
                    Long detailsid)
    {
        Details d = detailsService.findDetailsById(detailsid);
        return new ResponseEntity<>(d, HttpStatus.OK);
    }

    // POST http://localhost:2019/details/user/1
    @PostMapping(value = "/details/user/{userid}",
                 consumes = {"application/json"},
                 produces = {"application/json"})
    public ResponseEntity<?> addNewDetails(@Valid
                                           @RequestBody
                                                   Details newDetails,
                                           @PathVariable long userid)
    {   newDetails.setUser(userService.findUserById(userid));
        detailsService.save(newDetails);
        return new ResponseEntity<>(newDetails, HttpStatus.CREATED);
    }

    @PutMapping(value = "data/details/{detailsid}")
    public ResponseEntity<?> updateDetailsById(
            @RequestBody
                    Details updateDetails,
            @PathVariable
                    long detailsid)
    {
        detailsService.update(updateDetails, detailsid);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // http://localhost:2019/data/details/1
    @DeleteMapping("data/details/{detailsid}")
    public ResponseEntity<?> deleteDetailsById(
            @PathVariable
                    long detailsid)
    {
        detailsService.delete(detailsid);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
