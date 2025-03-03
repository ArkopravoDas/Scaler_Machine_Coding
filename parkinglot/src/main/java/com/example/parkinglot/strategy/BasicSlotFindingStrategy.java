package com.example.parkinglot.strategy;

import com.example.parkinglot.models.ParkingLot;
import com.example.parkinglot.models.ParkingSlot;
import com.example.parkinglot.models.SlotState;
import com.example.parkinglot.models.Vehicle;

import java.util.List;

public class BasicSlotFindingStrategy implements SlotFindingStrategy {
    public ParkingSlot findParkingSlot(ParkingLot parkingLot, Vehicle vehicle) {
        List<ParkingSlot> parkingSlotList = parkingLot.getParkingSlots();

        for(ParkingSlot parkingSlot : parkingSlotList){
            if(parkingSlot.getSlotState().equals(SlotState.FREE) && parkingSlot.getVehicleType().equals(vehicle.getVehicleType())) {
                return parkingSlot;
            }
        }
        return null;
    }
}
