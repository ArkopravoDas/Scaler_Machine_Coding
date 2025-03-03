package com.example.parkinglot.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
public class ParkingSlot {
    int id;
    int floor;
    VehicleType vehicleType;
    SlotState slotState;
    Vehicle vehicle;
    SlotType slotType;
}
