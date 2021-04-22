package com.example.demo.apis.service;

import com.example.demo.apis.model.DemoRequest;
import com.example.demo.apis.util.GenericResponse;

/**
 * @author a13219026
 * @date 2021-04-23 12:01 AM
 */

public interface DemoService {
    GenericResponse demoPost(DemoRequest demoRequest);
}
