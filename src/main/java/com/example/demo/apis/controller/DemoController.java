package com.example.demo.apis.controller;


import com.example.demo.apis.model.DemoRequest;
import com.example.demo.apis.service.DemoService;
import com.example.demo.apis.util.Constant;
import com.example.demo.apis.util.GenericResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author a13219026
 * @date 2021-04-23 12:01 AM
 */


@Slf4j
@RestController
@RequestMapping(value = Constant.BASE_SERVICE_URL)
public class DemoController {

    @Autowired
    private DemoService demoService;

    @PostMapping(value = Constant.DEMO_POST, produces = "application/json")
    public ResponseEntity<?> demoPost(@RequestBody DemoRequest demoRequest){
        GenericResponse response =  demoService.demoPost(demoRequest);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
