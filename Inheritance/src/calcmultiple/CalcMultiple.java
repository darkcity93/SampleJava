package calcmultiple;

import calcminus.CalcMinus; //package.ClassName
//import calcminus.*; // calcminus ��Ű���� �ִ� ��� Ŭ������ ����Ʈ(����)

public class CalcMultiple extends CalcMinus {
	public CalcMultiple() {
		super();
	}
	
	public CalcMultiple(int sum) {
		super(sum);
	}
	
	public int computeMultiple(int x) {
		this.sum *= x;
		return this.sum;
	}
	
	
	
	

}
