package com.example.callpanel.service;

import com.example.callpanel.model.entities.Call;
import com.example.callpanel.repository.CallRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CallService {
    private final CallRepository repository;

    public CallService(CallRepository repository) {
        this.repository = repository;
    }

    public Call save(Call call) {
        return repository.save(call);
    }

    public List<Call> findAll() {
        return repository.findAll();
    }
}