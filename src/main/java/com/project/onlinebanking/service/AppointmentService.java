package com.project.onlinebanking.service;

import java.util.List;

import com.project.onlinebanking.entity.Appointment;


public interface AppointmentService {

    Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}