package ictcg.com.stringtest;

public class StringBufferVsBuilderTest {

	public static void main (String[] args) {
		
		StringSpeedTester stringSpeedTesterr = new StringSpeedTester();
		
		long loops = 100000L;
		long tBuff = stringSpeedTesterr.testStringBufferSpeed(loops);
		long tBuil = stringSpeedTesterr.testStringBuilderSpeed(loops);
		System.out.println("Iterations: " + loops);
		System.out.println("String buffer  : " + tBuff + " millisec.");
		System.out.println("String builder : " + tBuil + " millisec.");
		
		loops = 10000000L;
		tBuff = stringSpeedTesterr.testStringBufferSpeed(loops);
		tBuil = stringSpeedTesterr.testStringBuilderSpeed(loops);
		System.out.println("Iterations: " + loops);
		System.out.println("String buffer  : " + tBuff + " millisec.");
		System.out.println("String builder : " + tBuil + " millisec.");
		
		
	}
	

}
