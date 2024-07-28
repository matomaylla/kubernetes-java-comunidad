package com.matomaylla.demoPod.controller;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PodInfoController {
    private final String podName;
    private final String instanceId;
 
    public PodInfoController(@Value("${POD_NAME:Unknown}") String podName) {
        this.podName = podName;
        this.instanceId = UUID.randomUUID().toString();
    }

    @GetMapping("/")
    public String getPodInfo() {
        return String.format("Pod Name: %s, Instance ID: %s", podName, instanceId);
    }
}
