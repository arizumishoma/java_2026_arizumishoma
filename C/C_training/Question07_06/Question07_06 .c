#include <stdio.h>
#include <stdlib.h>
typedef char String[1024];



int main(void) {

	typedef struct {
		char name;
		int iEnglish;
		int iMath;
		int iHistory;
		int iScience;
		int iGeography;
		int iSum;
		double  average;

	} Score;

	Score scores[3];

	for (int i = 0; i < 3; i++) {
		Score scoa = { 0,0,0,0,0,0.0,0 };
		String strInput = "";
		printf(" ---%d 人目の情報を入力してください---\n",i+1);

		printf("苗字の頭文字をアルファベット 1 文字で入力してください:");
		scanf("%s", strInput);
		scoa.name = strInput[0];

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

		scoa.iSum = scoa.iEnglish + scoa.iMath + scoa.iHistory + scoa.iScience + scoa.iGeography;
		scoa.average = (double)scoa.iSum / 5;

		scores[i] = scoa;

		
	}

	
	for (int i = 0; i < 3; i++) {
		printf(" ---%c さんのテスト結果--- \n", scores[i].name);
		printf("5 科目の合計点 : %d 点\n", scores[i].iSum);
		printf("5 科目の平均点 : %.1f 点\n", scores[i].average);
	}



	return 0;
}