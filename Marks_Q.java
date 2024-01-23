import java.util.*;
public class Marks_Q {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner (System.in);
				
				//to pass, per subject marks >=33 & Average >=40
				
				System.out.println("Enter marks of subject 1");
				int sub1 = sc.nextInt();
				System.out.println("Enter marks of subject 2");
				int sub2 = sc.nextInt();
				System.out.println("Enter marks of subject 3");
				int sub3 = sc.nextInt();
				
				int average = (sub1+sub2+sub3)/3;
				System.out.println("Average: "+average);
				
				if(average>=40 && sub1>=33 && sub2>=33 && sub3>=33) {
					System.out.println("The student is passed");
				}else {
					System.out.println("Failed");
				}
				
			}

		


	

}
