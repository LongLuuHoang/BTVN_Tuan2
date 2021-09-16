package com.example.btvn_tuan2.conroller;
import com.example.btvn_tuan2.conroller.StudentController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.btvn_tuan2.Service.Impl;
import org.springframework.web.bind.annotation.RestController;


public class StudentController {
    @Autowired
    private Impl impl;
}