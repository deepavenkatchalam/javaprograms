package com.ex;

class City
{
  public String name;
  public long population;

void display()
{
	System.out.println("city name:" +name);
	System.out.println("population:" +population);
}
public class Ex_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City metro1,metro2;
		
		metro1=new City();
		metro2=new City();
		
		metro1.name="mumbai";
		metro2.population=23456788;
		System.out.println("details of metro city1:");
		metro1.display();
		
		metro2.name="pune";
		metro2.population=78878954;
		System.out.println("details of metro city2:");
		metro2.display();
	}

	}

}
