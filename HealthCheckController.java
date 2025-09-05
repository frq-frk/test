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
        System.out.pritln("@EnableScheduling annotation was missing. added it let's check");
        System.out.pritln("some error while fetching commit files, let's check");
        System.out.pritln("Added transactional on worker method to keep dp session active, let's check");
        System.out.pritln("updated prompt to get response in diff format, let's check try agin n again just trying");
    }
}


// Suggested Fix by AI:
```diff
@@ -25,5 +25,6 @@ public void helperMethod() {
         System.out.println("Adding new line for testing again");
         System.out.println("@EnableScheduling annotation was missing. Added it, let's check.");
         System.out.println("Some error occurred while fetching commit files, let's check.");
+        System.out.println("Added @Transactional on worker method to keep database session active, let's check.");
     }
 }
```