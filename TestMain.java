package pack04;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Test01[] Arr = new Test01[3];
		Arr[0]=new Human();
		Arr[1]=new Zzang();
		Arr[2]=new Zzin();
		
		int inputData=0;
		
		while(true) {
			System.out.println("직업을 선택하세요");
			System.out.println("1.사람 2.일찐 3. 찐따");
			
			while(true) {
				try {
					inputData = Integer.parseInt(sc.nextLine());
					break;
				}catch (Exception e) {
					System.out.println("1~3까지의 수를 고르세요");
				}
				
			}
			
			
			if(inputData==1) {
				System.out.println("사람을 선택하셨습니다.");
				break;
			}
			else if(inputData==2) {
				System.out.println("일찐을 선택하셨습니다.");
				break;
			}
			else if(inputData==3) {
				System.out.println("찐따를 선택하셨습니다.");
				break;
			}
			else {
				System.out.println("1~3까지 수를 골라주세요");
			}
		}
		
		
		
		while(true) {
			
			System.out.println("1.특징 2.이동 3.공격");
			int inputData2=0;
			while(true) {
				try {
					inputData2 = Integer.parseInt(sc.nextLine());
					break;
				}catch (Exception e) {
					System.out.println("1~3입력하세요");
				}
				
			
			}
			
			if(inputData2==1) {
				Arr[inputData-1].character();
			}
			else if(inputData2==2) {
				Arr[inputData-1].move();
			}
			else if(inputData2==3) {
				Arr[inputData-1].attack();
			}
			else {
				System.out.println("1~3입력하세요");
		}
			
		}
		
		
	}
	
	
	
	
}
