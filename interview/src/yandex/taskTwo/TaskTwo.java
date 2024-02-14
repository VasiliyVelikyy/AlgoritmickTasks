package yandex.taskTwo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//реализовтаь мультиитератор который итерируеться сначала по 1 му затем по 2му итератору
//как изменить реализацию, если итераторов было бы много
public class TaskTwo {
    public static void main(String[] args) {
        List listOne = Arrays.asList(1, 2, 3, 4);
        List listTwo = Arrays.asList(5, 6, 7);
        List listThree = Arrays.asList(88, 89, 90);

        System.out.println("twoIterators is ");
        TwoIterators twoIterators = new TwoIterators(listOne.iterator(), listTwo.iterator());

        int iterationsSize = listOne.size() + listTwo.size(); //+ 1;

        for (int i = 0; i < iterationsSize; i++) {
            twoIterators.remove();
            System.out.println(twoIterators.next());
        }

        System.out.println("multiIterators is ");
        MultiIterators multiIterators = new MultiIterators(
                new Iterator[]{
                        listOne.iterator(),
                        listTwo.iterator(),
                        listThree.iterator()});

        iterationsSize = listOne.size() + listTwo.size() + listThree.size();

        for (int i = 0; i < iterationsSize + 1; i++) {
            //  multiIterators.remove();
            System.out.println(multiIterators.next());
        }
    }
}




