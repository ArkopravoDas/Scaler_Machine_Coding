package com.example.parkinglot.controllers;

import com.example.parkinglot.dtos.CreateTicket;
import com.example.parkinglot.dtos.UserTicket;
import com.example.parkinglot.models.Ticket;
import com.example.parkinglot.models.Vehicle;
import com.example.parkinglot.services.TicketService;
import org.springframework.web.bind.annotation.*;

@RestController()
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping(value = "/ticket")
    public @ResponseBody UserTicket createTicket(@RequestBody CreateTicket createTicket) {
        System.out.println("Create ticket endpoint called.");
        // System.out.println(createTicket);
        Vehicle vehicle = new Vehicle(createTicket.getVehicleRegNo(), createTicket.getVehicleType());

        Ticket ticket = ticketService.createTicket(vehicle, createTicket.getGateId());

        // Save to ticket repository
        // ticketRepository.save(Ticket)

        return getUserTicket(ticket);
    }

    private static UserTicket getUserTicket(Ticket ticket) {
        return UserTicket.builder()
                .ticketId((long)ticket.getId())
                .floorNumber(ticket.getParkingSlot().getFloor())
                .slotId(ticket.getParkingSlot().getId())
                .time(ticket.getIssueTime())
                .build();
    }
}
