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
			System.out.println("������ �����ϼ���");
			System.out.println("1.��� 2.���� 3. ���");
			
			while(true) {
				try {
					inputData = Integer.parseInt(sc.nextLine());
					break;
				}catch (Exception e) {
					System.out.println("1~3������ ���� ������");
				}
				
			}
			
			
			if(inputData==1) {
				System.out.println("����� �����ϼ̽��ϴ�.");
				break;
			}
			else if(inputData==2) {
				System.out.println("������ �����ϼ̽��ϴ�.");
				break;
			}
			else if(inputData==3) {
				System.out.println("����� �����ϼ̽��ϴ�.");
				break;
			}
			else {
				System.out.println("1~3���� ���� ����ּ���");
			}
		}
		
		
		
		while(true) {
			
			System.out.println("1.Ư¡ 2.�̵� 3.����");
			int inputData2=0;
			while(true) {
				try {
					inputData2 = Integer.parseInt(sc.nextLine());
					break;
				}catch (Exception e) {
					System.out.println("1~3�Է��ϼ���");
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
				System.out.println("1~3�Է��ϼ���");
		}
			
		}
		
		
	}
	
	
	
	
}
