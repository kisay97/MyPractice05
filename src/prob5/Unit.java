package prob5;

public class Unit {
	// 현재 위치
	private int x;
	private int y;

	void move(int x, int y) {
		/* 지정된 위치로 이동 */
		this.x = x;
		this.y = y;
	}

	void stop() {
		/* 현재 위치에 정지 */
		System.out.println("장비를 정지합니다.");
	}
}
