package calcdivide;

import calcmultiple.CalcMultiple; //package.ClassName
//import calcminus.*; // calcminus 패키지에 있는 모든 클래스를 임포트(포함)

public class CalcDivide extends CalcMultiple {
	public CalcDivide() {
		super();
	}
	
	public CalcDivide(int sum) {
		super(sum);
	}
	/*
	 * final 메소드
	 */
	
	public final int computeDivide(int x) {
		this.sum /= x;
		return this.sum;
	}
	
	
	
	

}
