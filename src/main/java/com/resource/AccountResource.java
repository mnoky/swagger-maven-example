package com.resource;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.ws.rs.PathParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(value = "/", description = "Description of API")
@RequestMapping("/app")
@ResponseStatus(HttpStatus.OK)
public class AccountResource {


    @ApiOperation(value = "Resets password")
    @RequestMapping(value = "/rest/password/{password}",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> resetPassword(
            @PathVariable @PathParam("password") String password) {
        return null;
    }

    @ApiOperation(value = "Retrieves users")
    @RequestMapping(value = "/users",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String getUsers() {
        return null;
    }

    @ApiOperation(value = "Retrieves users XML")
    @RequestMapping(value = "/users",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_XML_VALUE)
    public String getUsersXml() {
        return null;
    }

    @ApiOperation(value = "Update user")
    @RequestMapping(value = "/users/{userId}/{someToken}",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateUser(@PathVariable @PathParam("userId") String userId,
                                             @PathVariable @PathParam("someToken") String someToken) {
        return null;
    }

}
