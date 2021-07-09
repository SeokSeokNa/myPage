package july_07;

public class SuperCar {
    String name;
    String color;
    String carNum;

    public SuperCar(String name, String color, String carNum) {
        this.name = name;
        this.color = color;
        this.carNum = carNum;
    }


    public void enginOn() {
        System.out.println("자동차 시동을 켭니다. 부르릉~~");
    }
}
