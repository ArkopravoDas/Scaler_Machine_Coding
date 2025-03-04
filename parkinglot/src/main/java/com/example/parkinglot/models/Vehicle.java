package com.example.parkinglot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
public class Vehicle {
    String regNo;
    VehicleType vehicleType;
}
