# Java String builder

> <u>String</u>을 만드는 객체이다.
>
> > String이란 **String**은 문자들의 배열(sequence)입니다. 하지만 **자바**에서 **String**은 문자들의 배열을 나타내는 객체입니다

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

