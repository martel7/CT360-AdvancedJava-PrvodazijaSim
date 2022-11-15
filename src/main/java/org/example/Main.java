package org.example;

import entities.Human;
import entities.Man;
import entities.Marriage;
import entities.Woman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Man> men = new ArrayList<Man>();
        String[] menNames = new String[]{
                "Pera", "Mika", "Laza", "Zika", "Aleksa"
        };

        List<Woman> women = new ArrayList<Woman>();
        String[] womenNames = new String[]{
                "Natalija", "Andjela", "Sara", "Isidora", "Stefana"
        };

        int n = menNames.length;

        //Init people
        for(int i = 0; i < n; i++){
            ArrayList<Integer> ranking = new ArrayList<Integer>();
            for (int k = 0; k < n; k++) ranking.add(k);
            Collections.shuffle(ranking);

            men.add(new Man(menNames[i], ranking));

            ranking = new ArrayList<Integer>();
            for (int k = 0; k < n; k++) ranking.add(k);
            Collections.shuffle(ranking);

            women.add(new Woman(womenNames[i], ranking));
        }

        for(Man m : men){
            System.out.println(m.toString());
        }
        System.out.println("-------------------------------------------------");
        for(Woman w : women){
            System.out.println(w.toString());
        }

        //Arrange marriages
        List<Marriage> marriages = new ArrayList<Marriage>();

        for(Man man : men){
            for(int i = 0; i < n; i++)
                if(!women.get(man.ranking.get(i)).taken){
                    marriages.add(
                            new Marriage(man.name, women.get(man.ranking.get(i)).name)
                    );
                    women.get(man.ranking.get(i)).taken = true;

                    break;
                }
        }

        System.out.println("-------------------------------------------------");
        for(Marriage m : marriages)
            System.out.println(m.toString());
    }
}

class Helper{

    public int checkStability(List<Marriage> marriages){

        return -1;
    }
}