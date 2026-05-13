#include <stdio.h>

int main(void)
{
	char cnum1;
	short snum1;
	int inum1;
	long lnum1;
	float fnum1;
	double dnum1;

	printf("sizeof char %dバイト\n",sizeof(cnum1));
	printf("sizeof short %dバイト\n", sizeof(snum1));
	printf("sizeof int %dバイト\n", sizeof(inum1));
	printf("sizeof long %dバイト\n", sizeof(lnum1));
	printf("sizeof float %d バイト\n", sizeof(fnum1));
	printf("sizeof double %d バイト\n", sizeof(dnum1)); 

	return 0;
}