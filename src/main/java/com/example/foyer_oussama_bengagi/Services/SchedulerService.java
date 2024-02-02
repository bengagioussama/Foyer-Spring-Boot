package com.example.foyer_oussama_bengagi.Services;

import com.example.foyer_oussama_bengagi.DAO.Entities.Reservation;
import com.example.foyer_oussama_bengagi.DAO.Repository.ReservationRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Component
public class SchedulerService {
    private static final Logger log = LoggerFactory.getLogger(SchedulerService.class);
    ReservationRepository reservationRepository;

    @Scheduled(cron = "5 * * * * *")
    public void runEveryMinute() {
        System.out.println("Hello world");
    }


    @Scheduled(cron = "* * 9 30 * JUN")
    public void annulerReservation() {
        List<Reservation> res = reservationRepository.findAll();


    }
}
