package sub1;

public class SetJumsu {
	
	public static int[] SetJumsu() {
		int[] num = {90, 80, 100, 60 ,70};
		return num;
	}
	
	public static void main(String[] args) {
		
		int total = 0;
		int avg = 0;
		int[]arJumsu = SetJumsu();
		for(int i=0; i<arJumsu.length; i++) {
			total += arJumsu[i];		
		}
		
		avg = total/arJumsu.length;
		System.out.println("ÃÑÁ¡Àº : "+total);
		System.out.println("Æò±ÕÀº : "+avg);
		
	}

}
