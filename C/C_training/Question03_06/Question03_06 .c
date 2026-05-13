#include <stdio.h>

int main(void)
{
	int inum1 = 15;
	int inum2 = 5;
	printf("1 回目 割り算の結果は、%d、",inum1/inum2);
	printf("余りは、%d\n", inum1 % inum2);
	inum2++;
	printf("2 回目 割り算の結果は、%d、", inum1 / inum2);
	printf("余りは、%d\n", inum1 % inum2);
	inum2++;
	printf("3 回目 割り算の結果は、%d、", inum1 / inum2);
	printf("余りは、%d\n", inum1 % inum2);
	
	return 0;
}