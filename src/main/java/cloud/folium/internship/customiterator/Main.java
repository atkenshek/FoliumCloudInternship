package cloud.folium.internship.customiterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        MyIterator myIterator = new MyIterator(list);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(List.of(4, 5, 6));
        list.add(7);

        while (myIterator.hasNext()) {
            System.out.print(myIterator.next() + " ");
        }
    }
}
