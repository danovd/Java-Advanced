package _13_Defining_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _01_Car_Info {
    public static class Car {
       private String brand;
       private String model;
       private int horsePower;

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }
        public void carInfo(){
            System.out.printf("The car is: %s %s – %d HP.", this.brand, this.model, this.horsePower);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<Car> cars = new ArrayList<>();
        while(n-- >= 0){
            String [] car = sc.nextLine().split("\\s+");
            Car current = new Car();
            current.setBrand(car[0]);
            current.setModel(car[1]);
            current.setHorsePower(Integer.parseInt(car[2]));
            cars.add(current);
        }

        cars.forEach(Car::carInfo);
    }
}
