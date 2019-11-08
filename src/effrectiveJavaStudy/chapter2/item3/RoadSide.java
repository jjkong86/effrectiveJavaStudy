package effrectiveJavaStudy.chapter2.item3;

public enum RoadSide {
	Left("왼쪽", -1),
	RIGHT("오른쪽", 1);
	
	private String side;
	private int num;
	
	private RoadSide() {}
	private RoadSide(String side, int num) {
		this.side = side;
		this.num = num;
	}
	public String getSide() {
		return side;
	}
	public int getNum() {
		return num;
	}
	
	public static void main(String[] args) {
		RoadSide left = RoadSide.Left;
		RoadSide right = RoadSide.RIGHT;
		System.out.println(left.getSide() + " : "+left.num);
		System.out.println(right.getSide() + " : "+right.num);
	}
}
