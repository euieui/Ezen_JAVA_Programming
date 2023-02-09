package days10;
// 리턴값이 존재하는 메소드의 선언
// 메서드 호출 후 메서드에서 계산되어 진 결과를 호출한 지점에서 사용하고자 할때
// return 명령으로 호출된 지점으로 전달할 수 있습니다.

public class Method06 {

	public static void main(String[] args) {
		int num = 77;
		int p = squar(num);
		System.out.printf("%d",p); 
		
		int max_result = max(10,5,17);
		// 리턴값은 메서드 호출 명령 대신 왼쪽 변수에 저장되도록 위치하게 됩니다.
		System.out.printf("\n가장 큰숫자는 ? -> %d\n",max_result);

	}
	// num -> k   k*k -> c   c-> p  --0 방금 이거 변수 다르게 하셨는데 이거 헷갈리는 사람 확실히 있을 듯
	// 리턴 값의 타입이 선언된 메소드는 실행의 결과를 호출한 지점으로 반환할 수 있습니다.
	// 리턴 값이 있는 메서드 생성시 void 를 썻던 자리에 리턴값의 자료형을 써줍니다.
	public static int squar(int k) {  // 뒤질라게 재밌다 어카냐 이렇게 막꼬여있는게 이리 재밌냐ㅋㅋㅋ
		int c = k*k;
		return c;
	}
	// 메소드의 실행 결과를 호출한 지점으로 반환하기 위해서는 사용되는 return 키워드
	// return 키워드의 우항에 값 또는 변수 또는 수식이 존재하는 경우
	// 우항의 값 또는 실행 결과를 메소드를 호출한 지점으로 반환(리턴)
	
	public static int max(int a ,int b , int c) {
		int mv;
		if(a>b) mv = a;
		else mv = b;
		if (mv<c) mv = c;
		return mv;
		
	}
	// 매서드 사용에 따른 매서드 형태
	   // abc() - 전달인수 없고 리턴값도 없는 형태
	   // abc(10,20) - 전달인수 2개, 리턴값 없음
	   // k = abc() - 전달인수 없고, 리턴값 있는 형태
	   // k = abc(10,20) 전달인수 2개 ,리턴값 있음
	   
	   // ※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※ 중요함
	   // 개발자 필요에 의해 만들어지는 메서드는 반드시 클래스 안에 정의 되어야 하며
	   // 생성된 메서들 간에는 자유롭게 서로를 호출하여 사용할 수 있습니다.
	   // 그들은 그들을 둘러싼 클래스에 속해 있는 멤버들이라고도 부릅니다.
	   // main 메서드는 제외 - man을 호출한다는건 프로그램을 시작한다는 뜻
	   // ※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※ 중요함
	
	

}