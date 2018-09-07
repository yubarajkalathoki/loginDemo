/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.texas.logindemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Yubaraj
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    
    @GetMapping
    public void printHello(){
        System.out.println("Hello!");
    }
    
     @GetMapping("/response")
    public String returnResponse(){
        return "Neha Baral";
    }
}
