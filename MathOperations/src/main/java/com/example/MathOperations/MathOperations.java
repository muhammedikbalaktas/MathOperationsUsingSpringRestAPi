package com.example.MathOperations;
import java.util.Random;

public class MathOperations {
	Random random=new Random();
	long factorial(int input) {
		int result=1;
		if(input ==0||input ==1) return 1;
		else {
			for(int i=1;i<=input;i++) {
				result=result*i;
				
			}
		}
		
		
		return result;
	}
	long power(int base,int power) {
		
		
		long result=1;
		if(base==0&power==0)return 0;
		else if(base==0)return 0;
		else if(power==1)return 1;
		else {
			for(int i=0;i<power;i++) {
				result*=base;
			}
		}
		return result;
	}
	int random(int downLimit,int upLimit) {
		int result=random.nextInt(downLimit, upLimit+1);
		
		
		
		
		return result;
	}
	double sqrt(double input) {
		
		return Math.sqrt(input);
		
	}
	int isPrime(int number) {
		if (number<=1)return 0;
		if(number==2||number==3)return 1;
		for(int i=2;i<number;i++) {
			if(number%i==0)return 0;
			
		}
		
		
		
		return 1;
	}

}
