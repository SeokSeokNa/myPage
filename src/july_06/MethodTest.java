package july_06;

public class MethodTest {
    public static void main(String[] args) {

        People seo = new People();
        /*
          메소드를 호출
            - 메소드의 호출은 메소드를 실행시킨다는 의미야 !!
            - 메소드 호출방법은 메소드이름 + () 를 하면된다.
            - 메소드를 호출하려면 해당 메소드를 선언해둔 클래스로 부터 객체를 얻고나서 호출해야한다!!!
              (여기서는 People객체를 seo 라는 참조변수에 넣어뒀으니 seo.메소드이름() 으로 호출하면된다.
         */
        seo.hello(); // People 클래스에 선언해 둔 "hello" 라는 이름을 가진 메소드를 호출
        seo.run();   // People 클래스에 선언해 둔 "run"   라는 이름을 가진 메소드를 호출
    }

}
