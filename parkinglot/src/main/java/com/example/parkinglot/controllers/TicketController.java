package com.example.parkinglot.controllers;

import com.example.parkinglot.dtos.CreateTicket;
import com.example.parkinglot.dtos.UserTicket;
import com.example.parkinglot.models.Ticket;
import com.example.parkinglot.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping(value = "/ticket")
    public @ResponseBody UserTicket createTicket(@RequestBody(required=false) CreateTicket createTicket) {
        System.out.println("Create ticket endpoint called.");
        System.out.println(createTicket);
        ticketService.createTicket();
        return new UserTicket();
    }
}
