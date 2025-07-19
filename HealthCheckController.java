package com.aibot.reviewer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Health Check Controller for verifying service status.
 */
@RestController
@RequestMapping("/api/health")
public class HealthCheckController {

    /**
     * Endpoint to verify the API is alive.
     *
     * @return HTTP 200 OK with a simple status message.
     */
    @GetMapping
    public ResponseEntity<String> healthCheck() {
        return new ResponseEntity<>("Service is up and running.", HttpStatus.OK);
    }
    public void helperMethod(){
        System.out.pritln("It's all about just testing again now");
        System.out.pritln("Adding new line for testing again");
    }
}
