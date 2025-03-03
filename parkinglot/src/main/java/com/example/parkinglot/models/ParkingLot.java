package com.example.parkinglot.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
@Builder
public class ParkingLot {
    String name;
    String address;
    List<ParkingSlot> parkingSlots;
    List<Gate> entryGates;
    List<Gate> exitGates;
}
