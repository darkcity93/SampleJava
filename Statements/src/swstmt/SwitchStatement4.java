package swstmt;
/*
 * 조건문: switch
 * [문제] 등급에 따른 점수 환산
 * 난수를 등급단위로 발생시켜서 (A~F)
 * 각 등급에 따라 아래와 같은 점수를 배정하라.
 * A:100, B:90, C:80, D:70, E:60, F:50
 */
public class SwitchStatement4 {

	public static void main(String[] args) {
		// String area = "서울";
		// String area = "대전";
		String area = "부산";
		
		String areano = "";
		
		switch(area) {
		case "서울":
			areano = "02";
			break;
			
		case "대전":
			areano = "042";
			break;
			
		case "부산":
			areano = "051";
			break;
		}
		
		System.out.printf("지역번호: %s(%s)\n",  area, areano);
	}
}
