import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {

	public static void main(String[] args) {
//FASE 1
//Crea una variable int por cada uno de los billetes que existen, desde 5€ a 500€. Tendrás que crear otra variable para guardar
//el precio total de la comida. 
		
		int five = 5;
		int ten = 10;
		int twenty = 20;
		int fifty = 50;
		int hundred = 100;
		int twohundred = 200;
		int fivehundred = 500;
		
		
		
		
//Crea dos arrays, uno donde guardaremos el menú (5 plats) y otro donde guardaremos el precio de cada
//plato.
		
		
		
		String [] menu = new String [5];
		
		
		
		int [] price = new int [5]; 
		
//FASE 2
		
//Con un bucle for tenemos que rellenar los dos arrays anteriomente creados. Añadiremos el nombre del plato y después
//el precio.
		
		for (int i = 0; i < menu.length; i++){
		    
			System.out.println("Enter 1 dish: ");
			Scanner askDish = new Scanner(System.in);
			String currentDish = askDish.nextLine();
	    
			menu[i] = currentDish;
		}
		
		
		
		for (int i = 0; i < price.length; i++){
		    
			System.out.println("Enter the price for the dish: " + menu[i]);
			Scanner askPrice = new Scanner(System.in);
			int currentPrice = askPrice.nextInt();
	    
			price[i] = currentPrice;
		}
		
		
		
		
//Una vez estén llenos los dos arrays tenemos que mostrarlos y preguntar qué se quiere comer. 
//Guardaremos la información en una lista usando el bucle while.
//Tenemos que preguntar si se quiere seguir pidiendo comida. Puedes usar el sistema (1:si/0:No)		
		
		

		System.out.println("The offered dishes are ");
		
		for (int i = 0; i < price.length; i++){
			System.out.println(menu[i] + "=" + price[i]);
		}
		
		
		String currentDish;
		
		int moreFood = 1;
		
		Scanner askFood = new Scanner (System.in);
		ArrayList<String> chosenMeal = new ArrayList<String>();
		
		int counter = 0;
		
		do { System.out.println("What do you want to eat? ");
			currentDish = askFood.next();
			chosenMeal.add(currentDish);
			if (counter != 0) {
				askFood.nextLine();
			}
			System.out.println("Are you still hungry? ");
			moreFood = askFood.nextInt();
			counter++;
			}
			while (moreFood == 1);
		
		
//FASE 3
// Una vez hemos acabado de pedir la comida, tendremos que comparar la lista con el array que hemos hecho al principio.
// En el caso de que la información que hemos introducido en la lista coincida con la del array, tendremos que
// sumar el precio del producto pedido; en el caso contrario tendremos que mostrar un mensaje que diga que el producto
// que hemos pedido no existe.
		
		
		int totalPrice=0;
		List<String> notInMenu = new ArrayList<String>();
		
		for(int i = 0; i < chosenMeal.size(); i++){
			boolean exists = false;
			for(int j = 0; j < menu.length; j++){
				if (menu[j].equals(chosenMeal.get(i))){
					totalPrice = totalPrice + price[j];
					exists = true;
				} 
			} 
			if(!exists){
				notInMenu.add(chosenMeal.get(i));
				exists = false;
			}

		}
		
		System.out.println("The total amount is: " + totalPrice);
		
		System.out.println("The following was not in the menu");
		System.out.println(notInMenu.toString());
				
	
	}
		
}


