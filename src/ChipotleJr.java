import java.util.Arrays;
import java.util.Random;

public class ChipotleJr {
    public static void main(String[] args){


        String ingredients[] = {"rice", "meat", "beans", "salsa", "veggies", "cheese", "guac", "sourcream"};
        String[] rice = {"white", "brown", "none"};
        String meat[]= {"chicken", "steak", "carnitas", "chorizo", "sofritas", "veggies"};
        String beans[]= {"pinto", "black", "none"};
        String salsa[] = {"mild", "medium", "hot", "none", "all"};
        String veggies[] = {"lettuce", "fajita veggies", "none", "all"};
        boolean cheese;
        boolean guac;
        boolean queso;
        boolean sourcream;
        Random rnd = new Random();

        int numIng;
        int r;


        //loop to find number of ingredients to go into burrito with minimum of 5
        numIng = rnd.nextInt(4)+5;
        String burrito[] = new String [numIng];
        System.out.println("# of ingredients is "+ numIng);

        int randoms[] = new int [numIng];

        //creates array for which types of ingredients will go in this burrito
        //2nd for loop checks if that type of ingredient is already chosen for burrito
//        for( int i = 0; i<numIng; i++) {
//            do {
//                rndIng = rnd.nextInt(numIng);
//
//
//                String typeIng = ingredients[rndIng];
//                System.out.println("ingredient is: " + rndIng + ": " + typeIng);
//                for (int j = 0; j <= i; j++) {
//                    if (typeIng == burrito[j]) {
//                        break;
//                    } else {
//                        burrito[i] = typeIng;
//                    }
//                }
//            }
//        }

        for( int i = 1; i<=numIng; i++) {
            r = rnd.nextInt(numIng);
            String typeIng = ingredients[r];
            for (int j = 0; j<i; j++) {

                System.out.println(j +"/"+r +"/" + typeIng);
                if (typeIng!= burrito[j]){
                    burrito[i-1] = typeIng;
                }

            }
            System.out.println();
        }



        System.out.println(Arrays.toString(burrito));



    }
}
