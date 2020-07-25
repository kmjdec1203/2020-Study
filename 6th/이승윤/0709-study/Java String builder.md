# Java String builder

> <u>String</u>을 만드는 객체이다.
>
> > **String**은 문자들의 배열(sequence)입니다. 하지만 **자바**에서 **String**은 문자들의 배열을 나타내는 객체입니다

**StringBuilder (변수 이름)=new StringBuilder();**

```java
public class practice1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hi");
        sb.append("bye");
        System.out.println(sb.toString());
    }
}
// 이렇게 하면 StringBuilder 변수 밑에 밑줄 생기는데
// 너무 짧은데 왜 이렇게 쓰냐고 뭐라 하는거임
```

--> 위의 코드처럼 하면 hibye 라고 출력됨

**여기서 잠깐!!!!!**

> append란? : 문자열을 더하는 역할을 한다

>toString()은? : 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드.

____

## StringBuilder와 String의 차이점

> **String 불변 StringBuilder 가변**
>
> 속도 : StringBuilder > String
>
> --> 연산을 할 때마다 새로운 문자열 객체를 생성하기 때문이다.
>
> 반복문을 이용하는 경우 StringBuilder 사용하기



1. String은 불변(immutable)의 속성을 갖는다

   > String 객체가 한번 생성되면 할당된 메모리 공간이 변하지 않는다.

   ```java
   String a="hi";
   String b="bye";
   System.out.println(a+b);
   
   /*문자열에 `+연산자` 등을 이용하여 다른 문자열을 추가할 때 기존 문자열에 새로운 문자열이 추가되는것이 아니라 **새로운 문자열 객체를 만들고** 그 객체를 참조함.*/
   ```

   + 변하지 않는 문자열을 자주 읽어들이는 경우 사용
   + 문자열 추가, 수정, 삭제 등의 연산이 빈번하게 발생할 때 사용하면, 힙 메모리 부족으로 어플리케이션 성능에 치명적인 영향을 끼침.
   + 문자열 연산이 적을 때 사용

2. StringBuilder(StringBuffer도) 가변(mutable)성을 가진다

   ```java
   StringBuilder sb = new StringBuilder();
   sb.append("hi");
   sb.append("bye");
   System.out.println(sb.toString());
   ```

   + 문자열의 추가, 수정, 삭제가 빈번하게 발생할 경우 사용
   + 문자열 연산이 많을 때/ 동기화가 필요 없을 때 사용

   

   

++ StringBuffer는 여러 <u>스레드</u>에서 접근할 경우 그 내용에 대해 안전성을 보장한다(ThreadSafe)

> Thread(스레드)
>
> : 어떤 프로그램 내에서, 특히 프로세스 내에서 실행되는 흐름의 단위.
>
> 스레드 ID, PC(program counter),레지스터 집합, 스택으로 구성
>
> 같은 프로세스에 속한 다른 스레드와 코드, 데이터 섹션, 열린 파일이나 신호와 같은 운영체제 자원들을 공유함.
>
> +Multi Treade(멀티스레드) : 하나의 프로그램에 동시에 여러개의 일을 수행할 수 있도록 해주는 것
>
> +단일 스레드 : 프로세스에 하나의 제어 모델이 있음

++StringBuilder의 경우 단일 스레드에서만 접근을 하는 경우 안정성 보장

--> 상황에 따라 조화롭게 사용하기