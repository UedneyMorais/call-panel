package com.example.callpanel.controller;

import com.example.callpanel.model.entities.Call;
import com.example.callpanel.service.CallService;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calls")
public class CallController {

    private final CallService callService;
    private final SimpMessagingTemplate messagingTemplate;
    
    public CallController(CallService callService, SimpMessagingTemplate messagingTemplate) {
        this.callService = callService;
        this.messagingTemplate = messagingTemplate;
    }

    @PostMapping
    public Call createCall(@RequestBody Call call) {
        Call saved = callService.save(call);
        messagingTemplate.convertAndSend("/topic/calls", saved);
        return saved;
    }

    @GetMapping
    public List<Call> getAllCalls() {
        return callService.findAll();
    }
}