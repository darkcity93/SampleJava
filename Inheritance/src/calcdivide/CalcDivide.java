package calcdivide;

import calcmultiple.CalcMultiple; //package.ClassName
//import calcminus.*; // calcminus ��Ű���� �ִ� ��� Ŭ������ ����Ʈ(����)

public class CalcDivide extends CalcMultiple {
	public CalcDivide() {
		super();
	}
	
	public CalcDivide(int sum) {
		super(sum);
	}
	/*
	 * final �޼ҵ�
	 */
	
	public final int computeDivide(int x) {
		this.sum /= x;
		return this.sum;
	}
	
	
	
	

}
