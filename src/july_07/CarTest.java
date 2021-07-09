package july_07;

import java.util.Scanner;

public class CarTest {

    public static void main(String[] args) {
        Car lamborghini = new Car("람보르기니", "Blue", 280 , 0);
        System.out.println("superCar.carName = " + lamborghini.carName);
        System.out.println("superCar.color = " + lamborghini.color);
        System.out.println("superCar.maxSpeed = " + lamborghini.maxSpeed);


//        lamborghini.enginOn();

//        lamborghini.thisCarName();
//        lamborghini.paramCarName(lamborghini);
//        System.out.println("이 차의 최고 속력은 = " + lamborghini.getMaxSpeed() + "Km 입니다.");
//
//        lamborghini.changColor("purple");
//        System.out.println("변경된 색상 = " + lamborghini.getColor());
//
//        Car car = new Car();
//        car.methodInCall();
//
        Scanner sc = new Scanner(System.in);
//


        while (true) {
                System.out.println("입력하세요");
                int num = sc.nextInt();
                if(num == 1) lamborghini.speedUp(10);
                else if(num == 2) lamborghini.speedDown();
                else {
                    lamborghini.enginOff();
                    break;
                }
        }
    }
}
