package belajarjava.application;

import belajarjava.data.Company;

public class CompannyApp {

    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Rumah Kodingku");

        Company.Employee employee = company.new Employee();
        employee.setName("Thomas");

        System.out.println(employee.getCompany());

        
    }
}
