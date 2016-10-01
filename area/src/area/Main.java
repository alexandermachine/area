package area;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static ArrayList<Figure> list = new ArrayList<Figure>();
	static Scanner sc;
	static Random rand = new Random();
	public static void main(String[] args){
		
		//���������� ���-�� ������ �� �����		
			System.out.println("������� ����������� ���������������: ");
			int a = scNext();
			
			System.out.println("������� ����������� ������: ");
			int b = scNext();
			
			System.out.println("������� ����������� �������������: ");
			int c = scNext();
			
		//��������� � ��������� ������� �����, ������� ����� ������������
			for(int i = 0;i<a;i++){
				list.add(new Rectangle(rand.nextInt(9)+1,rand.nextInt(9)+1));
			}
			
			for(int i = 0;i<b;i++){
				list.add(new Round(rand.nextInt(9)+1));
			}
			
			for(int i = 0;i<c;i++){
				list.add(new Triangle(rand.nextInt(9)+1,rand.nextInt(9)+1));
			}
		//������� ������� ������ ������
			for (Figure l : list) {
				System.out.println(l.getClass()+"  "+l.getArea());
				
			}

	}
	
	static int scNext(){
		sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();			
			if(a < 0 )
				throw new IllegalValueExeption();			
			return a;
			} catch (IllegalValueExeption e) {
				System.out.println("������: �� ����� ������������� �����");
				return 0;
			}
			catch (java.util.InputMismatchException e) {
				System.out.println("������: ������������ ����");
				return 0;
			}

		
		
	}
}
