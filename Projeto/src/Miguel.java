
public class Miguel {
	private int num;

	public Miguel(int num) {
		this.num = num;
	}
	
	public void Par() {
		if(num%2==0) {
			System.out.println("� Par!!");
		}
		else{
			System.out.println("N�o � Par!!");
		}
	}	
	
	
	
	public static void main(String[] args) {
		Miguel m = new Miguel(3);
		m.Par();

	}

}
