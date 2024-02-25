package org.example;

class PartTimeEmployee extends Employee{
  private int hoursWork;
  private double hourlyRate;
  public PartTimeEmployee(String name, int id, int hoursWork, double hourlyRate ) {
    super(name, id);
    this.hoursWork=hoursWork;
    this.hourlyRate=hourlyRate;
  }

  @Override
  public double calculateSalary(){
    return hoursWork * hourlyRate;
  }
}
