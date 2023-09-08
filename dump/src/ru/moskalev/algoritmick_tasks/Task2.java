package ru.moskalev.algoritmick_tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String sizeArray = scanner.nextLine();
            System.out.println(enterNumber(Integer.parseInt(sizeArray), scanner));


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }

    private static boolean enterNumber(int sizeArray, Scanner scanner) {
       List<Pair> list=new ArrayList<>();
        for (int i = 0; i <sizeArray ; i++) {
            String pairStr=scanner.nextLine();
            String[]coordinate=pairStr.split(" ");
            Pair pair =new Pair(Integer.parseInt(coordinate[0]),Integer.parseInt(coordinate[1]));
            list.add(pair);

        }


        for (int i = 0; i <list.size() ; i++) {
            int x1=list.get(i).x;
            int y1=list.get(i).y;
            for (int j = 0; j < list.size(); j++) {
                if(j!=i){

                }
            }
        }






        for (int i = 0; i <list.size() ; i++) {
            int x1=list.get(i).x;
            int y1=list.get(i).y;
            for (int j = 0; j < list.size(); j++) {
                if(j!=i){
                    int x2=list.get(j).x;
                    int y2=list.get(j).y;
                    if(( x2==y1 && y2==x2) || (x2==-y2 && y1==-x2)){
                        for (int k = 0; k < list.size() ; k++) {
                            if(j!=i && i!=k){
                            int x3=list.get(k).x;
                            int y3=list.get(k).y;
                                if((x3==-y2 && x2==x3) || (-x2==y3 && -x2==y3)){
                                    for (int l = 0; l < list.size(); l++) {
                                        if(j!=i && i!=k &&i!=l){

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }


        }
        return false;
    }

   static class Pair{
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
