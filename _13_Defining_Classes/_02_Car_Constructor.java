package _13_Defining_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02_Car_Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<Car> cars = new ArrayList<>();
        while(n-- >= 1){
            String [] car = sc.nextLine().split("\\s+");
            String brand = car[0];
            String model = "";
            int horses = -1;
            if(car.length >= 2){
            model = car[1];
            };
            if(car.length >= 3) {
                horses = Integer.parseInt(car[2]);
            };
            Car current = new Car(brand, model, horses);
            cars.add(current);
        }

        cars.forEach(e -> System.out.printf("The car is: %s %s - %d HP.\n", e.getBrand(), e.model, e.getHorsePower()));
    }








    public static class Car {
        private String brand = "";
        private String model = "unknown";
        private int horsePower = -1;

        public Car(String brand, String model, int horsePower) {
            this.brand = brand;
            this.model = model;
            this.horsePower = horsePower;
        }

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



}
