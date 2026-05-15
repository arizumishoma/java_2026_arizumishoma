#include <stdio.h>
#include <stdbool.h>

typedef char String[1024];

int main(void)
{
	String strInput = "";
	int inum = 0;

	while (true) {
		printf("5 ˆÈã‚Ì”’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢\n");
		scanf("%s", strInput);
		inum = atoi(strInput);
		if (inum >= 5) {
			printf("5 ˆÈã‚Ì”’l‚ª“ü—Í‚³‚ê‚Ü‚µ‚½\n");
			printf("ˆ—‚ğI—¹‚µ‚Ü‚·\n");
			break;
		}
	}

	return 0;
}