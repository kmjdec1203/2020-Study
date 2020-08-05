#include<stdio.h>

int main()
{
	int a;
	scanf_s("%d", &a);
	if (a % 2 == 0)
	{
		printf("\"Even\"");
	}
	else{
		printf("\"Odd\"");
	}
	return 0;
}