package com.project.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.onlinebanking.entity.PrimaryTransaction;

import java.util.List;


public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}