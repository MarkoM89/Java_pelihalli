package com.github.javapelihalli;

import java.io.IOException;
import java.util.Random;

import javafx.fxml.FXML;

public class NopallaArvontaController {


    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void heitaNoppia() {
        
        Random random = new Random();
        int[] nopat = new int[3];

         nopat[0] = random.nextInt(1, 7);
         nopat[1] = random.nextInt(1, 7);
         nopat[2] = random.nextInt(1, 7);


         System.out.println("Nopan arvot olivat:");

          for(int i = 0; i<nopat.length; i++){

            switch (nopat[i]) {
                
                case 1 -> {System.out.println(" -------");
                           System.out.println("|       |");
                           System.out.println("|   o   |");
                           System.out.println("|       |");
                           System.out.println(" -------");}

                case 2 -> {System.out.println(" -------");
                          System.out.println("|o      |");
                          System.out.println("|       |");
                          System.out.println("|      o|");
                          System.out.println(" -------");}

                case 3 -> {System.out.println(" -------");
                          System.out.println("|o      |");
                          System.out.println("|   o   |");
                          System.out.println("|      o|");
                          System.out.println(" -------");}

                case 4 -> {System.out.println(" -------");
                          System.out.println("|o     o|");
                          System.out.println("|       |");
                          System.out.println("|o     o|");
                          System.out.println(" -------");}

                case 5 -> {System.out.println(" -------");
                          System.out.println("|o     o|");
                          System.out.println("|   o   |");
                          System.out.println("|o     o|");
                          System.out.println(" -------");}

                case 6 -> {System.out.println(" -------");
                          System.out.println("|o     o|");
                          System.out.println("|o     o|");
                          System.out.println("|o     o|");
                          System.out.println(" -------");}
                
            }
         }


    }

}
