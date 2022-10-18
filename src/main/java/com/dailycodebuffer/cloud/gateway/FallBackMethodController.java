package com.dailycodebuffer.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/truckServiceFallBack")
    public String truckServiceFallBackMethod() {
        return "Truck Service is taking longer than Expected." +
                " Please try again later";
    }
}
