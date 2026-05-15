#include <stdio.h>
#include <stdlib.h>

typedef char String[1024];


const double TAX8 = 0.08;
const double TAX10 = 0.1;

double  tax10Calc(int x)
{
	int ans=x*TAX10;
	return ans;
}

double  tax8Calc(int x)
{
	int ans = x * TAX8;
	return ans;
}

int main(void)
{
	String input = "";

	printf("‚¨•Ù“–‚Ì–{‘Ì‰¿Ši‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n");
	scanf("%s", input);
	int honntai = atoi(input);

	int shouhi8 = tax8Calc(honntai);
	int zeikomi8 = honntai + shouhi8;
	printf("Å‚İ(8%%)‰¿Ši : %d ‰~\n", zeikomi8);
	printf("Á”ïÅŠz(8%%)  : %d ‰~\n", shouhi8);

	int shouhi10 = tax10Calc(honntai);
	int zeikomi10 = honntai + shouhi10;
	printf("Å‚İ(10%%)‰¿Ši : %d ‰~\n", zeikomi10);
	printf("Á”ïÅŠz(10%%)  : %d ‰~\n", shouhi10);

	return 0;
}