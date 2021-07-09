package jun;

public class Profile {
    String name;
    int age;
    String job;


    public Profile(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void voidTest1() {
        System.out.println(1+1);
        //리턴 해줄값 없음
    }


    public int intTest2() {
        int result = 1;
        // 정수 리턴해줘야함함
       return  1;
    }
}
