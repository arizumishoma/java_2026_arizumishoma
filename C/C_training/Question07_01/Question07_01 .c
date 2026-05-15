#include <stdio.h> 

int main(void) {

	  
	  int sub[5];
	  sub[0] = 88;
	  sub[1] = 63;
	  sub[2] = 54;
	  sub[3] = 76;
	  sub[4] = 45;

	int iSum = sub[0] + sub[1] + sub[2] + sub[3] + sub[4];

	printf("5 科目の合計点 : %d 点\n", iSum);
	printf("5 科目の平均点 : %.1f 点\n", (double)iSum / 5);

	return 0;
}