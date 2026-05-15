#include <stdio.h>
#include <stdlib.h>

typedef char String[1024];

int mathMax(int x, int y)
{
	int ans = y;
	if (x > y) {
		ans = x ;
	}
	return ans;
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
	ans1 = mathMax(x,y);
	printf("1 ‰ñ–Ú‚Æ 2 ‰ñ–Ú‚Å‘å‚«‚¢’l‚Í %d ‚Å‚·", ans1);

	return 0;
}