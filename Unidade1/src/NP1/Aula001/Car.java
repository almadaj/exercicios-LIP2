package NP1.Aula001;
    public class Car {
        int numberWheels;
        int numberDoors;
        String color;
        Car(){
            System.out.println("Car created!");
            numberDoors = 4;
            numberWheels = 4;
            color = "red";
        }
        void accelerate(){
            System.out.println("Vrummm");
        }
        void brake(){
            System.out.println("Breeaaaking...");
        }

        void listInfo(){
            System.out.println(color);
            System.out.println(numberDoors);
            System.out.println(numberWheels);
        }
    }
