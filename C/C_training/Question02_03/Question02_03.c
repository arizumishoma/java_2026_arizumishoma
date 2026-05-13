#include <stdio.h>
typedef char String[1024];
int main(void)
{
	int inum1 = 12;
	double dnum1 =  20.58;
	String str = "‚±‚ñ‚É‚¿‚Í";
	printf("%d\n",inum1);
	printf("%.2f%\n",dnum1);
	printf("%s\n",str);
	return 0;
}