/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myweather.restful.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author zack
 */
@Path("departments")
public class DepartmentService {
    @GET
    @Path("hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String helloworld(){
        return "hello world";
    
    }
    
}
