# StringBuilder

---

## StringBuilder란?

StirngBuilder은 String과 무엇이 다를까? StringBuilder는 가변의 성질을 가지고있다. 반면 기존 String은 불변객체로 변하지 않는다. 예를 들어 String str1, str2; 가 있을때 str1+str2명령을 수행하면 새로운 String을 추가하여 둘의 더한 값을 넣게 된다. 이때 메모리를 할당하고 해체하는 작업이 추가되어 여러 문장을 더할때 매우 비효율적이게 된다. 그러나 StringBuilder는 문자열을 더할때 기존 데이터에 더하는 방식을 사용하여 효율적으로 좋다.

## 사용법

StringBuilder에는 append()가 있는데, 이는 문자열을 더하는 역할을 한다. 만들어진 문자열을 출력하기 위해서는 toString()을 사용해야 한다.

~~~java
StringBuilder (변수이름) = new StringBuilder();
~~~



~~~java
StringBuilder sb = new StringBuilder();
sb.append("abc");												//append()는 두 문자열을 더하는 함수
sb.append("def");
System.out.println(sb.toString());			//출력할 때 toString 사용
~~~

---

# Package

---

## 패키지(Package)

package는 우리가 흔히 우리가 파일을 일관성있는 이름으로 정렬하여 여러 폴더로 정리하듯이 여러 클래스들을 비슷한것끼리 모아 분류하는 것이다. 예를 들어 HelloWorld와 HelloCountry라는 클래스들이 있다고 가정할 때 Hello라는 패키지로 분류하면 될것이다. 또한 분류할 때 package 라는 키워드를 사용한다.

~~~java
package test.hello;

public class HelloWorld{
}
~~~

~~~java
package test.hello;

public class HelloCountry{
}
~~~

이렇게 작성한다면 intelli J 프로젝트가 저장된 파일로 들어가보면 test/hello에 저 두 클래스가 존제하는 것을 볼 수 있을 것이다.

~~~
src/test/hello/HelloWorld/java
src/test/hello/HelloWorld.class
src/test/hello/HelloCountry.java
src/test/hello/HelloCountry.class
~~~

이런식으로 저장되어 있을 것이다.

---

## 서브패키지(Subpackage)

subpackage는 간단하게 말해서 package속에 하위 package를 만드는 것이다.

~~~java
package test.hello.hi;

public class HiWorld{
}
~~~

다음과 같이 쓴다면 test/hello/hi에 저장이 되는 것이다. 우리가 윈도우에서 폴더속에 또다른 폴더를 만들듯 계속해서 이어나갈 수 있다.

~~~
src/test/hello/hi/HiWorld.java
src/test/hello/hi/HiWorld.class
src/test/hello/HelloWorld/java
src/test/hello/HelloWorld.class
src/test/hello/HelloCountry.java
src/test/hello/HelloCountry.class
~~~

이런식으로 저장되어 있을 것이다.

---

## 패키지 사용

다른 클래스에서 HelloWorld 클래스를 사용하려면 다음과 같이 import 를 해야한다.

~~~java
import test.hello.HelloWorld;		//hello패키지안에 HelloWorld를 import
import test.hello.*;						//hello패키지안에 모든 클래스 import
~~~

위와 같이 *를 이용하면 hello내에 모든 클래스를 import하게 된다. 같은 패키지내에 있을경우 따로 import를 하지않아도 클래스를 이용가능하다.

---



