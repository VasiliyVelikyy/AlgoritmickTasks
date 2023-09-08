package task_of_the_day;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Test {
    public static void main(String[] args) throws IOException {
            Scanner scanner = null;
            try {
                scanner = new Scanner(System.in);
                String sizeArray = scanner.nextLine();
               List list=enterNumber(Integer.parseInt(sizeArray), scanner);
               checkSq(list);
                int sqCount = getCountOfSq(list);
                System.out.println(sqCount);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (scanner != null)
                    scanner.close();
            }

    }

    private static void checkSq(List<Point> list) {
        for (int i = 0; i < list.size(); i++) {
            int x1=list.get(i).getX();
            int y1=list.get(i).getY();
            for (int j = 0; j < list.size();j++) {
                if(j!=i){
                    int x2=list.get(j).getX();
                    int y2=list.get(j).getY();
                    if((x2==y1 && y2==x1) || x2==-x1 && y2==x1){
                        for (int k = 0; k <list.size() ; k++) {
                            if(j!=i && i!=k){
                                int x3=list.get(k).getX();
                                int y3=list.get(k).getY();

                            }
                        }
                    }
                }

            }
        }
    }

    private static  List<Point> enterNumber(int sizeArray, Scanner scanner) {
        List<Point>listPoints=new ArrayList<>();
        for (int i = 0; i <sizeArray ; i++) {
            String pairStr=scanner.nextLine();
            String[]coordinate=pairStr.split(" ");
            Point point =new Point(Integer.parseInt(coordinate[0]),Integer.parseInt(coordinate[1]));
            listPoints.add(point);
        }
        return listPoints;
    }


    public static int getCountOfSq(List<Point> points){
        int pairsCounter = 0;
        for(int i = 0; i < points.size(); i++){
            for(int b = i + 1; b < points.size(); b++){
                if(isSquare(points.get(i), points.get(b)) && hasAnotherPairForSquare(points.get(i), points.get(b), points)){
                    pairsCounter++;
                }
            }
        }
        if(pairsCounter % 2 == 1){
            throw new Error("FATAL error");
        }
        return pairsCounter / 2;
    }

    public static boolean hasAnotherPairForSquare(Point first, Point second, List<Point> points){
        return points.contains(new Point(first.getX(), second.getY())) && points.contains(new Point(second.getX(), first.getY()));
    }

    private static boolean isSquare(Point first, Point second){
        if(first.getX() == second.getX() || first.getY() == second.getY() ){
            return false;
        }
        if(getDistanceBetween(first.getX(), second.getX()) == getDistanceBetween(first.getY(), second.getY())){
            return true;
        }
        return false;
    }

    public static int getDistanceBetween(int first, int second){ // Возможно, неоптимизированно, на скорую руку. O(3).
        if(first >= 0){
            if(second >= 0){
                return Math.abs(first - second);
            } else {
                return first - second;
            }
        } else {
            if(second >= 0){
                return second - first;
            } else {
                return Math.abs(first - second);
            }
        }
    }

    static class Point{
        private int x;
        private int y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        int getX(){
            return x;
        }
        int getY(){
            return y;
        }

        @Override
        public boolean equals(Object o){
            if(o == null || !(o instanceof Point)){
                return false;
            }
            if(((Point) o).getX() == x && ((Point) o).getY() == y){
                return true;
            }
            return false;
        }

        @Override
        public String toString(){
            return "x: " + x + ", y: " + y;
        }
    }
}