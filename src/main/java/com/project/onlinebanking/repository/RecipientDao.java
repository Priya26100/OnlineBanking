package com.project.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.onlinebanking.entity.Recipient;

import java.util.List;


public interface RecipientDao extends CrudRepository<Recipient, Long> {

    List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}