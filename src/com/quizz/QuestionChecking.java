package com.quizz;

public class QuestionChecking {
	
	public boolean checkig(char ch,int n)
	{
		char answersKey[]= {'B','A','A','B','C'};
		if (ch==answersKey[n]) {
			return true;
		} else {
			return false;
		}
	}

}
