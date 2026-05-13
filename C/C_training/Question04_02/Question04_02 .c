#include <stdio.h>

int main(void)
{
	printf("処理を開始します\n");

	int iNumber = 9;


	if (iNumber >= 10) {
		printf("iNumber の値は 10 以上です。\n");
	}
	else {
		printf("iNumber の値は 10 未満です。\n");
	}

	printf("処理を終了します。\n");
	return 0;
}