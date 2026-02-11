package com.inheritance;

public class Rmain {
	public static void main(String[] args) {
		RPassenger p = new RPassenger();
        p.passengerInfo();
        System.out.println(p.Service());

        RTicket t = new RTicket();
        t.ticketInfo();
        System.out.println(t.Service());

        RTrain tr = new RTrain();
        tr.trainInfo();
        System.out.println(tr.Service());
	}
}
