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
		
		//определяем кол-во каждий их фигур		
			System.out.println("Введите колличество прямоугольников: ");
			int a = scNext();
			
			System.out.println("Введите колличество кругов: ");
			int b = scNext();
			
			System.out.println("Введите колличество треугольников: ");
			int c = scNext();
			
		//добавляем в коллекцию столько фигур, сколько задал пользователь
			for(int i = 0;i<a;i++){
				list.add(new Rectangle(rand.nextInt(9)+1,rand.nextInt(9)+1));
			}
			
			for(int i = 0;i<b;i++){
				list.add(new Round(rand.nextInt(9)+1));
			}
			
			for(int i = 0;i<c;i++){
				list.add(new Triangle(rand.nextInt(9)+1,rand.nextInt(9)+1));
			}
		//Выводим площадь каждой фигуры
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
				System.out.println("Ошибка: Вы ввели отрицательное число");
				return 0;
			}
			catch (java.util.InputMismatchException e) {
				System.out.println("Ошибка: неккоректный ввод");
				return 0;
			}

		
		
	}
}
