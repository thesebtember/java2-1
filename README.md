# 요셉 학번202130218
# 4월 12일 강의
static 멤버
객체 생성과 non-static 멤버의 생성
    non-static 멤버는 객체가 생성될 때, 객체마다 생긴다]

static 멤버의 생성
static 멤버는 클래스당 하나만 생성
객체들에 의해 공유됨

static 멤버 사용
클래스 이름으로 접근 가능
객체의 멤버로 접근 가능
non-static 멤버는 클래스 이름으로 접근 안 됨

static의 활용
전역 변수와 전역 함수를 만들 때 활용
공유 멤버를 만들고자 할 때
    static으로 선언한 멤버는 클래스의 객체들 사이에 공유

static 메소드의 제약 조건 1
    static 메소드는 오직 static 멤버만 접근 가능
객체가 생성되지 않은 상황에서도 static 메소드는 실행될 수 있기 때
문에, non-static 멤버 활용 불가
non-static 메소드는 static 멤버 사용 가능

static 메소드의 제약 조건 2
    static 메소드는 this 사용불가
static 메소드는 객체 없이도 사용 가능하므로, this 레퍼런스 사용할
수 없음

final 클래스와 메소드
final 클래스 - 더 이상 클래스 상속 불가능
final 메소드 - 더 이상 오버라이딩 불가능

final 필드
final 필드, 상수 선언
    상수를 선언할 때 사용
    상수 필드는 선언 시에 초기 값을 지정하여야 한다
    상수 필드는 실행 중에 값을 변경할 수 없다

클래스 상속과 객체
상속 선언
    extends 키워드로 선언
        부모 클래스를 물려받아 확장한다는 의미
    부모 클래스 -> 슈퍼클래스(super class)
    자식 클래스 -> 서브클래스(sub class)
        ColorPoint는 Point를 물려 받으므로 Point에 선언된 필드와 메소드 선언 필요없음

자바 상속의 특징
클래스 다중 상속(multiple inheritance) 불허
    c++는 다중 상속 가능
        c++는 다중 상속으로 멤버가 중복생성되는 문제 있음
    자바는 인터페이스(interface)의 다중 상속 허용
모든 자바 클래스는 묵시적으로 Object클래스 상속받음
    java.lang.Object는 클래스는 모든 클래스의 슈퍼클래스

슈퍼 클래스의 멤버에 대한 서브 클래스의 접근
슈퍼 클래스의 private 멤버
    서브 클래스에서 접근할 수 없음
슈퍼 클래스의 디폴트 멤버
    서브 클래스가 동일한 패키지에 있을 때, 접근 가능
슈퍼 클래스의 public 멤버
    서브 클래스는 항상 접근 가능
슈퍼 클래스의 protected 멤버
    같은 패키지 내의 모든 클래스 접근 허용
    패키지 여부와 상관없이 서브 클래스는 접근 가능

##3월 29일 강의 
식별자, 문자열, 변수와 선언, 리터럴, 식과 연산자, 연산
반복문과 배열 등을 배움.
## 3월 22일 강의
var 키워드
java 10부터 도입
기존의 변수 선언 방식 : 변수의 타입 반드시 지정
var 키워드
타입을 생략하고 변수 선언 가능
컴파일러가 추론하여 변수 타입 결정
변수 선언 시 초깃값이 주어지지 않으면 컴파일 오류
var는 지역 변수 선언에만 한정
## 3월 15일 강의
내용 정리

이번에는 올리지않음.
