package dev.delts.jobaro.controller;

import dev.delts.jobaro.service.JobApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job_applications")
public class JobApplicationController {
    private JobApplicationService jobApplicationService;

    public JobApplicationController(JobApplicationService service) {
        this.jobApplicationService = service;
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello was called");
        return "Hello";
    }
}
