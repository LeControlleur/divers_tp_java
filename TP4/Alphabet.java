public class Alphabet {

	public static void main(String args[])
	{
		
		String tab[] = {
		              "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r",
		              "s","t","u","v","w","x","y","z",
		};
		
		//************************** NORMAL **********************************
		System.out.println("************************** NORMAL **********************************");
		
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i].toUpperCase() + " ");
		}
		
		System.out.println("\n");
		
		
		//************************* INVERSE *****************************************
		
		System.out.println("************************* INVERSE *****************************************");
		
		for(int i=0; i< tab.length; i++){
	        String tmp = tab[i];
	        System.out.print(tab[tab.length-i-1].toUpperCase() + " ");
	    }
		
		//***************************************************************************
		
		System.out.println("\n");
		
		//************************ NORMAL AVEC DES PAS DE 2 **************************************
		
		System.out.println("************************ NORMAL AVEC DES PAS DE 2 **************************************");
		
		for (int i = 0; i < tab.length; i += 2) {
			System.out.print(tab[i].toUpperCase() + "  ");
		}
		
		System.out.println("\n");
		
		for (int i = 1; i < tab.length; i += 2) {
			System.out.print(" " + tab[i].toUpperCase() + " ");
		}
		
		System.out.println("\n");
		
		//************************ INVERSE AVEC DES PAS DE 2 **********************************
		
		System.out.println("************************ INVERSE AVEC DES PAS DE 2 **************************************");
		
		for(int i=0; i< tab.length; i += 2){
	        String tmp = tab[i];
	        System.out.print(tab[tab.length-i-1].toUpperCase() + "  ");
	    }
		
		System.out.println("\n");
		
		for(int i=1; i< tab.length; i +=2){
	        String tmp = tab[i];
	        System.out.print(" " + tab[tab.length-i-1].toUpperCase() + " ");
	    }
		
	}
	
	

}
