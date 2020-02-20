/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTest;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author larik
 */
public class HashTest {
    public static void main(String[] args) {
        //        File f = new File("src/PracticeProblem/a_example.in");
//        File f = new File("src/PracticeProblem/b_small.in");
//        File f = new File("src/PracticeProblem/c_medium.in");
        File f = new File("src/PracticeProblem/d_quite_big.in");
//        File f = new File("src/PracticeProblem/e_also_big.in");
        Scanner scan = new Scanner(f);
        int totalSlices = scan.nextInt();
        int totalPizzas = scan.nextInt();
        int[] pizzaSlices = new int[totalPizzas];
        int[] answer = new int[totalPizzas];
        for (int i = 0; i < pizzaSlices.length; i++) {
            pizzaSlices[i] = scan.nextInt();
        }
        //System.out.println(Arrays.toString(pizzas));
        int slices = 0;
        int pizzas = 0;
        for(int i = 1; slices < totalSlices && pizzas < totalPizzas && i <= totalPizzas; i++){
            if(slices + pizzaSlices[totalPizzas - i] <= totalSlices){
                slices += pizzaSlices[totalPizzas - i];
                answer[totalPizzas - i] = 1;
                pizzas++;
            }
        }
        //PrintStream fw = new PrintStream(new File("a_example.txt"));
        System.out.println(pizzas);
        //fw.println(pizzas);
        int totalSum = 0;
        for (int i = 0; i < answer.length; i++) {
            if(answer[i] == 1){
                System.out.print(i + " ");
                totalSum += pizzaSlices[i];
                //fw.print(i + " ");
            }
        }
        System.out.println("");
        System.out.println(totalSum);
        //fw.println("");
        //fw.close();
        
    }
}
