#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{
	srand((unsigned)time(NULL));
	int r = rand() % 100;
	if (50>= r )
	{
		printf("値は%d判断結果は、50 未満でした", r);
	}
	else
	
	{
		printf("値は%d判断結果は、50 以上でした", r);
	}
	
	return 0;
}