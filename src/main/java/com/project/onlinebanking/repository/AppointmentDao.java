package com.project.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.onlinebanking.entity.Appointment;

import java.util.List;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}