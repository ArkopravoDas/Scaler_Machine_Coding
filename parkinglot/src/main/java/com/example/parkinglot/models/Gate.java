package com.example.parkinglot.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@Data
public class Gate {
    int id;
    GateType gateType;
    int operatorId;
    ParkingLot parkingLot;
}

// id | gateType | operator_id | parking_lot_id