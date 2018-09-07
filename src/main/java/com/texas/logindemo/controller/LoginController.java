
package com.texas.logindemo.controller;

import com.texas.logindemo.dto.LoginDto;
import java.util.HashMap;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Yubaraj
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    
    @PostMapping
    public ResponseEntity<Object> login(@RequestBody LoginDto loginDto){
        System.out.println("Username "+loginDto.getUsername());
        System.out.println("Password "+loginDto.getPassword());
        HashMap<String, String> response = new HashMap<>();
        response.put("response", "Success");
        return new ResponseEntity<Object>(response,HttpStatus.OK);
    }
}
