package com.example.MathOperations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ResultController {
		MathOperations math=new MathOperations();
		
		@GetMapping("/factorial")
		public IntResults factorialResult(@RequestParam(name="input",defaultValue="1")int input) {
			long result=math.factorial(input);
			IntResults result2=new IntResults(result);
			return result2;
			
		}
		@GetMapping("/power")
		public IntResults powerResult(@RequestParam(name="base",defaultValue="1")int base,@RequestParam(name="power",defaultValue="1")int power) {
			
			long result=math.power(base, power);
			return new IntResults(result);
			
		}
		@GetMapping("/random_ınt")
		public IntResults getRandomInt(@RequestParam(name="DownLimit",defaultValue="1")int downLimit,
				@RequestParam(name="UpLimit",defaultValue="10")int upLimit) {
				
			int result=math.random(downLimit, upLimit);
			IntResults result2=new IntResults(result);
			
			return result2;
		}
		@GetMapping("/sqrt")
		public DoubleResults sqrt(@RequestParam(name="input",defaultValue="1")double input) {
				
			double result=math.sqrt(input);
			DoubleResults result2=new DoubleResults(result);
			
			return result2;
		}
		@GetMapping("/is_prime")
		public IntResults isPrime(@RequestParam(name="input",defaultValue="1")int input) {
				
			int result=math.isPrime(input);
			IntResults result2=new IntResults(result);
			
			return result2;
		}
		
		
}
