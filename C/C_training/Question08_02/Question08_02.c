#include <stdio.h>
#include <stdlib.h>

typedef char String[1024];

int mathMaxCheck(int x, int y)
{
	int susi;
	if (x > y) {
		susi = 1;
	}
	else if (x == y) {
		susi == 2;
	}
	else {
		susi = 3;
	}
	
	return susi;
}

int main(void)
{
	String input = "";

	printf("2 Œ…‚Ì”’l‚ğ 2 ‰ñ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢\n");
	printf("1‰ñ–Ú:");
	scanf("%s", input);
	int x = atoi(input);

	printf("2‰ñ–Ú:");
	scanf("%s", input);
	int y = atoi(input);

	int ans1;
	ans1 = mathMax(x, y);

	switch (ans1) {
		case 1:
			printf("1 ‰ñ–Ú:%s\n");
			break;
		case 2:
			printf("2 ‰ñ–Ú:%s\n");
			break;
		case 3:
			printf("");
			break;
		default:;
		
	}


	printf("”’l‚Ì”äŠr‚ğ‚µ‚Ü‚·%n1 ‰ñ–Ú‚Æ 2 ‰ñ–Ú‚Å‘å‚«‚¢’l‚Í %d ‚Å‚·", ans1);

	return 0;
}