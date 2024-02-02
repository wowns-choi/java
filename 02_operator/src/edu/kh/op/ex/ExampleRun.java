package edu.kh.op.ex;

public class ExampleRun {

	public static void main (String[] args) {
		//다른 패키지에 있는 클래스를 부르려면 import를 해야한다.
		//근데 같은 패키지에 있으므로 굳이 import를 하지 않아도 된다.
		OpExample opexam = new OpExample();
		opexam.ex1();
		opexam.ex2();
		opexam.ex3();
		opexam.ex4();
		
	}
}
