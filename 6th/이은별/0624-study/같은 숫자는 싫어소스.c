#include<stdio.h>
//���ӵ� ���ڴ� �Ⱦ�
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
//ù��° ���� ������ �޾ƿ;��Ѵ�.
//�ι�° ���� ù��° ���� �񱳸� �� �� ������ �迭�� ���� �ʴ´�.
//���࿡ �ٸ��ٸ� �迭�� �߰� �� ����° ���� �ҷ��´�.
//�迭�� ������ �ϰ� ���� ��
