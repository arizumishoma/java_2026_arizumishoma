#include <stdio.h> 
typedef char String[1024];

int main(void) {

	typedef struct {
		int iEnglish;
		int iMath;
		int iHistory;
		int iScience;
		int iGeography;
		double  average;
	} Score;
	Score scoa  = { 0,0,0,0,0,0.0 };

	String strInput = "";

	printf("英語の点数を入力してください:");
	scanf("%s", strInput);
	scoa.iEnglish = atoi(strInput);

	printf("数学の点数を入力してください:");
	scanf("%s", strInput);
	scoa.iMath = atoi(strInput);

	printf("歴史の点数を入力してください:");
	scanf("%s", strInput);
	scoa.iHistory = atoi(strInput);

	printf("科学の点数を入力してください:");
	scanf("%s", strInput);
	scoa.iScience = atoi(strInput);

	printf("地理の点数を入力してください:");
	scanf("%s", strInput);
	scoa.iGeography = atoi(strInput);

 	int iSum = scoa.iEnglish + scoa.iMath + scoa.iHistory + scoa.iScience + scoa.iGeography;

	printf("5 科目の合計点 : %d 点\n", iSum);
	printf("5 科目の平均点 : %.1f 点\n", (double)iSum / 5);

	if ()
	{
		printf("");
	}
	else if () {
		printf("");

	}
	else if () {
		printf("");

	}
	else
	{
		printf("");
	}

	return 0;
}