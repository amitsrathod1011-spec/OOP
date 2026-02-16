package com.abstraction;

public class VHybridCar implements VElectricVehicle , VFuelVehicle {
	@Override
	public void chargeBattery() {
		System.out.println("Charging the battery of the hybrid car 🔋");
	}
	@Override
	public void fillFuel() {
		System.out.println("Filling fuel in the hybrid car ⛽");
	}
	public static void main(String[] args) {
		VHybridCar v= new VHybridCar();
		v.chargeBattery();
		v.fillFuel();
	}
}
