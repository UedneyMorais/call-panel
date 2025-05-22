package com.example.callpanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.callpanel.model.entities.Call;

public interface CallRepository extends JpaRepository<Call, Long> {
}