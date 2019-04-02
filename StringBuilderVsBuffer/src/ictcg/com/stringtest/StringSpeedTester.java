package ictcg.com.stringtest;

public class StringSpeedTester {
	
	public long testStringBufferSpeed(long loopNumber) {
		
		long elapsedTime = System.currentTimeMillis();
		StringBuffer sbuff = new StringBuffer("Buf");
		for(int i = 0; i<loopNumber; i++){
			sbuff.append("Buf");
		}
		elapsedTime = System.currentTimeMillis() - elapsedTime;
		return elapsedTime;
	}

	public long testStringBuilderSpeed(long loopNumber) {
		
		long elapsedTime = System.currentTimeMillis();
		StringBuilder sbuil = new StringBuilder("Bui");
		for(int i = 0; i<loopNumber; i++){
			sbuil.append("Bui");
		}
		elapsedTime = System.currentTimeMillis() - elapsedTime;
		return elapsedTime;
	}
}
