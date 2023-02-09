package days01;
// '//' 슬래쉬두개는 한줄 설명(주석)을 사용할때 앞에 씁니다
// 여러줄에 걸쳐 주석 처리를 하려면
/*
.....
 */

// 위와 같이  /* ~ */ 포시로 감쌉니다
// 주석처리 : 실행은 되지 않고 실행 코드와 같이 위치하면서 프로그램 또는 코드에 대한
// 안내, 설명으로 사용합니다.

// 자바프로그래밍은 클래스단위로 구성(작성)되고 실행됩니다.
// 저장된 클래스의 파일명과 작성된 클래스의 이름은 반드시 같아야 합니다
public class JAVA_First {
	public static void main(String[] args) {
		// System.out.printf();
		// 괄호 안의 큰따옴표 안쪽의 문자들을 화면에 그데로 출력하는 명령어입니다.
		System.out.printf("겁나 쉬운 자바 프로그래밍~!");
		// 자바 프로그램은 하나의 명령어가 끝날때마자 ';' 을 표시하여
		// 문장(명령)의 끝을 표시합니다.
		
		// 겁나 쉬운 자바 프로그래밍~!   이 문장을 세번 화면에 출력하고 싶다면
		// 명령을 두번 더 쓰면 됩니다
		System.out.printf("겁나 쉬운 자바 프로그래밍~!");
		System.out.printf("겁나 쉬운 자바 프로그래밍~!");
		// 별도의 표시 없이 System.out.plintf  을 여러번 명령하면, 
		// 두번의 며령이건 세번의 명령이건 모두 한줄에 출력하려 고합니다.
		// dd
	}
}