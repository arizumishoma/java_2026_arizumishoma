#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
typedef char String[1024];

int main(void)

{
	int scores[] = { 31,41,59,26,53,58,97,93,23,84 };
	int sum = 0;
	String input;
	printf("10～99 の 2 桁の数値を入力してください:");
	scanf("%s",input);
	int a = atoi(input);
	bool b = false;
	int j = 0;
	for (int i = 0; i < 10; i++) {
		if (a == scores[i]) {
			j = i;
			b = true;
		}

	}
	
	if (b == true){
		printf("%d は、%d の位置に見つかりました",a,j+1);
	}
	else{
		printf("%d は、見つかりませんでした ", a);
	}

	return 0;
}