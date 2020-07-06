#include<stdio.h>
//연속된 숫자는 싫어
int main()
{
	int a[] = { 1,1,3,3,0,1,1 };
	int r[sizeof(a)/sizeof(int)];
	int i, c = 0;
	for(i = 0; i < sizeof(a); i++) {
		if (i == sizeof(a) - 1) r[c] = a[i];
		else if (a[i] != a[i + 1]) r[c++] = a[i];

	}
	for (i = 0; i < c; i++) {
		printf("%d", r[i]);
	}
}
//첫번째 값은 무조건 받아와야한다.
//두번째 값은 첫번째 값과 비교를 한 후 같으면 배열에 넣지 않는다.
//만약에 다르다면 배열에 추가 후 세번째 값을 불러온다.
//배열은 리턴을 하고 나면 끝
