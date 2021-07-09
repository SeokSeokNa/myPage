package july_07;

public class Car {
    String carName;
    String color;
    int maxSpeed;
    int curSpeed;


    public Car() {
        this("기본차","black",100 , 0);
    }

    public Car(String carName, String color, int maxSpeed , int curSpeed) {
        this.carName = carName;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.curSpeed = curSpeed;
    }

    public void enginOn() {
        System.out.println("자동차 시동을 켭니다. 부르르릉!!");
    }

    public void enginOff() {
        System.out.println("자동차 시동을 끕니다. 털터터러러러...");
    }

    public void speedUp(int speed) {
        curSpeed += speed;
        System.out.println("테스트 = "+curSpeed);
        if (curSpeed < maxSpeed) {
            System.out.println("현재 속도는 = " + curSpeed);
        } else {
            System.out.println("최고 속력보다 속도가 빠를수 없습니다.");
        }
    }

    public void speedDown() {
        if (curSpeed > 0) {
            curSpeed -= 10;
            System.out.println("현재 속도는 = " + curSpeed);
        } else {
            System.out.println("현재 속도는 0 입니다.");
        }
    }

    public void thisCarName() {
        System.out.println(carName);
    }

    public void paramCarName(Car car) {
        System.out.println(car.carName);
    }

    public String getCarName() {
        return carName;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void changColor(String color) {
        System.out.println("현재 색상은 " + this.color + " 입니다.");
        System.out.println("고객님이 원하는데로 "+ color+" 색상으로 변경하겠습니다.");
        this.color = color;
    }

    //클래스 내부에서 메소드안에서 다른 메소드 호출하기
    //같은 클래스 안에 있어야만 가능한일이다.
    public void methodInCall() {
        System.out.println(getCarName());
        System.out.println(getColor());
        System.out.println(getMaxSpeed());
    }


}
