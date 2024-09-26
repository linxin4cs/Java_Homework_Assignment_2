package homework2;

import java.io.*;


public class SaveFunc {
	public static void main(String args[]) {
		Car car1 = new Car("car00231", Make.AUDI, Model.MPV, 2018, Color.GREEN, 20000.00, 10077);
		Car car2 = new Car("car00302", Make.BENZ, Model.SUV, 2014, Color.BLACK, 18000.00, 10031);
		Car car3 = new Car("car00441", Make.BMW, Model.VAN, 2015, Color.WHITE, 19000.00, 10045);
		Car car4 = new Car("car00551", Make.AUDI, Model.SEDAN, 2020, Color.GREY, 22000.00, 10099);
		Car car5 = new Car("car00221", Make.PORSCHE, Model.SUV, 2015, Color.RED, 14000.00, 10056);
		Car car6 = new Car("car00121", Make.VOLKSWAGEN, Model.MPV, 2010, Color.GREEN, 10000.00, 10012);
		
		Car[] carList = {car1, car2, car3, car4, car5, car6};
		Make givenMake = Make.AUDI;
		Model givenModel = Model.SUV;
		int usedYears = 8;
		int givenYearOfManufacture = 2015;
		double givenPrice = 17000.00;
		
		try {
			BufferedWriter writer1 = new BufferedWriter(new FileWriter("list1.csv"));
			writer1.write("Id,Make,Model,Year of manufacture,Color,Price,Registeration Number");
			writer1.newLine();
			
			for(Car car: carList) {
				if(car.getMake() == givenMake) {
					writer1.write(car.getId()+","+car.getMake().name()+","+car.getModel().name()+","+car.getYearOfManufacture()+","+car.getColor().name()+","+car.getPrice()+","+car.getRegisterNumber());
					writer1.newLine();
				}
			}
			
			writer1.close();
			
			System.out.println("List 1 has been saved successfully");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedWriter writer2 = new BufferedWriter(new FileWriter("list2.csv"));
			writer2.write("Id,Make,Model,Year of manufacture,Color,Price,Registeration Number");
			writer2.newLine();
			
			for(Car car: carList) {
				if(car.getModel() == givenModel && 2024 - car.getYearOfManufacture() > usedYears) {
					writer2.write(car.getId()+","+car.getMake().name()+","+car.getModel().name()+","+car.getYearOfManufacture()+","+car.getColor().name()+","+car.getPrice()+","+car.getRegisterNumber());
					writer2.newLine();
				}
			}
			
			writer2.close();
			
			System.out.println("List 2 has been saved successfully");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedWriter writer3 = new BufferedWriter(new FileWriter("list3.csv"));
			writer3.write("Id,Make,Model,Year of manufacture,Color,Price,Registeration Number");
			writer3.newLine();
			
			for(Car car: carList) {
				if(car.getYearOfManufacture() == givenYearOfManufacture && car.getPrice() > givenPrice) {
					writer3.write(car.getId()+","+car.getMake().name()+","+car.getModel().name()+","+car.getYearOfManufacture()+","+car.getColor().name()+","+car.getPrice()+","+car.getRegisterNumber());
					writer3.newLine();
				}
			}
			
			writer3.close();
			
			System.out.println("List 3 has been saved successfully");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	
		
	}
}
	