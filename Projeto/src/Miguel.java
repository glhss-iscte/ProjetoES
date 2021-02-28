
public class Miguel {
	private int num;

	public Miguel(int num) {
		this.num = num;
	}
	
	public void Par() {
		if(num%2==0) {
			System.out.println("É Par!!");
		}
		else{
			System.out.println("Não é Par!!");
		}
	}	
	
	
	
	public static void main(String[] args) {
		Miguel m = new Miguel(3);
		m.Par();

	}

}
