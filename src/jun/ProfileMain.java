package jun;

public class ProfileMain {
    /*
        변수의 자료형
           1. 자료형이란 ??
                - 자료형은 표현하고자 하는 데이터가 갖는 형(정수는 int , 실수는 Double, float)
           2. 자료형 종류
                - 자료형은 기본자료형과 참조자료형이 존재한다.

                - 기본자료형(일반 숫자나 참,거짓 , 'a' 와 같은 일반 값을 저장하고 싶을때)
                        (1) byte
                        (2) char
                        (3) short
                        (4) int
                        (5) long
                        (6) float
                        (7) double
                        (8) boolean

                - 참조자료형(객체의 주소값을 저장 하고싶을때 , 주소값을 알아야 객체.name 이런식으로 접근할 수 가 있어요)
                       (1) String(저번에 잘못알려줫오요!!.. ㅈㅅ    String도 클래스에요)
                       (2) 모든 클래스는 참조자료형이 될수있다.(Profile , String 등등 무수히 많은)
                            *서정이가 만든 Profile 클래스도 참조 자료형으로 나타낼수 있오!!!

          3. 변수란 무엇인가??
               - 변수는 값을 저장하는 공간이다 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
               - 변수를 "선언" 하기 위해서는 "자료형 변수이름;" 으로 만들어야한다.
               - 변수에 값을 넣는 행위를 "초기화" 한다 라고 표현해요
               - int var1; 은 변수를 "선언" 만 한거고 int var1 = 1; 은 변수를 "선언" 과 동시에 "초기화" 했다고 표현해요
                  * int var1; - 변수선언(값 저장공간 만듬)
                    var1 = 1; - 변수 초기화(저장공간에 값을 넣음)
                    이렇게 두줄 코드를 친것과

                    int var1 = 1; 이렇게 한줄만 친것이 똑같은 효과에요

               - 변수 선언과 동시에 초기화 예)
                 ex1) int var1 = 1;
                       * 1 이라는 정수값을 넣기 위해 자료형을 기본자료형 int로 표현하고 변수이름을 var1 이라고 했다.

                 ex2) String name = "원석";
                       * "wonSeok" 이라는 문자열값을 넣기위해 자료형을 참조자료형 String으로 표현하고 변수이름을 name이라고 했다.
                       * 문자열은 굉장히 독특한게 "원석" 이렇게만하면 이거 자체가 객체로 만들어짐 그래서 참조자료형에 담는거에요
                           그냥 일반값 같은데 신기하죠 ... 나도 그래요 ..
                           String name = "원석";  이랑 String name = new String("원석") 같은 효과를 내요

     */
    public static void main(String[] args) {
        Profile wonseok = new Profile("나원석",28,"백수");
        System.out.println("이름 = " + wonseok.name);
        System.out.println("나이 = " + wonseok.age);
        System.out.println("직업 = " + wonseok.job);

        wonseok.voidTest1();
    }
}
