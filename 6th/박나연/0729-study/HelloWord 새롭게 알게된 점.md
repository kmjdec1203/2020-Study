## 앱 실행

__새롭게알게된 점들__<img src="C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20200731171142005.png" alt="image-20200731171142005" style="zoom:50%;" />

1. 안드로이드 폰으로도 앱 실행이 가능하다는 점.
2. 에뮬레이터 실행하는 방법.
3. 안드로이드 스튜디오만 있다면 어디서든지 개발이 가능하다.

-------------------------------------------

## 사용자 인터페이스 빌드

![img](https://developer.android.com/images/viewgroup_2x.png)

+ android 앱의 사용자 인터페이스 (UI)는 레이아웃 및 위젯의 계층 구조로 빌드된다.레이아웃은 `ViewGroup`객체로, 화면에서 하위 뷰의 지정 방식을 제어하는 컨데이너이다. 위젯은 `view` 객체로, 버튼 및 텍스트 상자와 같은 UI 구성요소이다.
+ 해당 그림은 레이아웃에서 `ViewGroup` 객체가 분기를 형성하고 `View` 객체를 포함하는 방식을 보여준다.

-----------------------------------

### UI 문자열 변경

-------------------------

![img](https://developer.android.com/training/basics/firstapp/images/add-string_2x.png)

+ 유조 인터페이스가 있는 제품의 설명서를 번역할 때, 표시되는 말들이 이미 여러 언어로 정의되어 있기 때문에, 그것들이 설령 부적절하다고 해도, 번역사들이 임의로 번역할 수 없다.
+ 이것을 처리하는 두 가지 방법이 있다.
  + 번역사에게 다국어 문자열 테이블을 제공한다.
  + 문서에서 유저 인터페이스에 표시되는 말들을 찾아 대상 언어의 것들로 바꾼 뒤, 그 문서를 번역사에게 제공한다.

----------------

#### 체인

+ 둘 이상의 뷰 간에 존재하는 양방향 제약조건이다.
+ 체인을 이용하면 체인으로 연결된 뷰를 일관성 있게 레이아웃 할 수 있다.

-------------------------

### Send 버튼에 응답

----------------------------------



```java
 public class MainActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        //사용자가 Send 버튼을 누를 때 응답한다.
     public void sendMessage(View view) {
            // 버튼을 하고 무엇을 할지
        }
    }
```

+ Send 버튼을 탭할 때 호출되는 `MainActivity`클래스에 메서드를 추가한다.
+ Android Studio에서는 메서드 인수로 사용되는 `View`클래스를 결정할 수 없으므로 오류가 발생할 수 도 있다. 오류를 해결하기 위해  `View`선언을 클릭하고 커서를 그 위에 둔 채로 Alt+Enter를 눌러 빠른 수정을 실행한다.

----------------------------------

### 인텐드 빌드

--------------------------

`intent`는 개별 구성요소간에 런타임 바인딩을 제공하는 객체이다. `intent`는 어떤 작업을 하려는 앱의 의도를 나타낸다. 매우 다양한 작업에 인텐트를 사용할 수 있지만 이 과정에서는 인테트가 다른 활동을 시작한다.

```java
 public class MainActivity extends AppCompatActivity {
        public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        //사용자가 Send 버튼을 누를 때 응답한다.
        public void sendMessage(View view) {
            Intent intent = new Intent(this, DisplayMessageActivity.class);
            EditText editText = (EditText) findViewById(R.id.editText);
            String message = editText.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
    }
```

__`sendMessage()`에서 이루어지는 작업은 다음과 같다.__

+ `Intent` 생성자는 두 매개변수 `Context`와 `Class`를 사용한다.

  `Context` 매개변수가 먼저 사용됩니다. `Activity` 클래스가 `Context`의 서브클래스이기 때문이다.

  이 경우 시스템에서 `Intent,`를 전달하는 앱 구성요소의 `Class` 매개변수는 시작할 활동이다.

+ `putExtra()` 메서드는 `EditText` 값을 인텐트에 추가한다. `Intent`는 데이터 유형을 *extras*라는 키-값 쌍으로 전달할 수 있다.

  다음 활동에서 키를 사용하여 텍스트 값을 검색하기 때문에 키는 공개 상수 `EXTRA_MESSAGE`이다. 앱의 패키지 이름을 접두사로 사용해 인텐트 extras의 키를 정의하는 것이 좋다. 그러면 앱이 다른 앱과 상호작용하는 경우 키가 고유하게 유지된다.

+ `startActivity()` 메서드는 `Intent`로 지정된 `DisplayMessageActivity`의 인스턴스를 시작합니다. 이제 클래스를 만들어야 한다.

--------------------------

### 메시지 표시

------------

전달된 메시지를 표시한다.

```java
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        
        //이 코드를 실행한 의도를 가져오고 문자열을 추출
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // 레이아웃의 TextView를 캡처하고 문자열을 텍스트로 설정
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
```

