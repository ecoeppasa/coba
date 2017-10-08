/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author elko
 */
@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping(value = "hello")
    public String hello(){
        
        return "hello teman";
    }
}
