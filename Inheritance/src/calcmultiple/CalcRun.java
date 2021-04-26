package calcmultiple;

public class CalcRun {

	
	public static void main(String[] args) {
		CalcMultiple calc = new CalcMultiple(10);
		calc.compute(30);       // plus
		calc.computeMinus(20);       // minus
		int sum = calc.computeMultiple(2);    // multiple
		System.out.println("Calc:sum=" + sum);
		System.out.println("Calc:sum=" + calc.getSum());
		
		//CalcRun은 Calc로부터 상속되지 않았으므로 Calc.sum에 접근할 수 없다.
		//System.out.println("Calc:sum=" + calc.sum);

	}
	
}
