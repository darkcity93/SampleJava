package calc;

public class Calc {
	protected int sum; // ����������� �ڽ� Ŭ�������� ���� ���
		
	public Calc(){
		this.sum = 0;
	}
	
	public Calc(int sum){
		this.sum = sum;
	}
	
	public int compute(int x) {
		this.sum += x;
		return this.sum;
	}
	
	public int getSum() {
		return this.sum;
	}
	
	public static void main(String[] args) {
		Calc calc = new Calc(1000);
		int sum = calc.compute(10);
		System.out.println("Calc:sum=" + sum);
		//System.out.println("Calc:sum=" + calc.sum);
		System.out.println("Calc:sum=" + calc.getSum());
	}


}
