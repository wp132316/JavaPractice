package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		
		int avg_pay = 1700000;
		int staff = 3;
		int store = 1500;
		long year_pay = (long)avg_pay*staff*store*12;
		  
		System.out.println("<< 디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : " + String.format("%,d", avg_pay) + "원");
		System.out.println("점포 내 직원 수 : " + String.format("%,d", staff) + "명");
		System.out.println("점포 수 : " + String.format("%,d", store) + "개");
		System.out.println("연간 인건비 : " + String.format("%,d", year_pay) + "원");

	}

}
