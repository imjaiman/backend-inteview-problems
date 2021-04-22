package com.practice.backend.apis.service;

import com.practice.backend.apis.model.DemoRequest;
import com.practice.backend.apis.util.GenericResponse;

/**
 * @author a13219026
 * @date 2021-04-23 12:01 AM
 */

public interface DemoService {
    GenericResponse demoPost(DemoRequest demoRequest);
}
