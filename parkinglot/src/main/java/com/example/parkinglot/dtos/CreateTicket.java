package com.example.parkinglot.dtos;

import com.example.parkinglot.models.SlotType;
import com.example.parkinglot.models.VehicleType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CreateTicket {
    String vehicleRegNo;
    VehicleType vehicleType;
    Long gateId;
    SlotType slotType;

}
