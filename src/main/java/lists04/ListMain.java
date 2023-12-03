package lists04;

import java.util.*;
import java.util.stream.Collectors;

public class ListMain {
    public static void main(String... args) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(100);
        ArrayList arrayList3 = new ArrayList(arrayList2);

        ArrayList<String> colors = new ArrayList<String>();
        List arrayList4 = new ArrayList();
        Collection arrayList5 = new ArrayList();

        colors.add("red");
        colors.add("yellow");
        colors.add("blue");
        colors.add(1, "orange");

        for(int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        System.out.println("---------------------");

        for(String color: colors) {
            System.out.println(color);
        }

        System.out.println("---------------------");

        colors.remove("orange");
        colors.remove(0);


        colors.forEach(color -> {
            System.out.println(color);
        });

        System.out.println("---------------------");
        for(int i = 0; i < colors.size(); i++) {
            colors.remove(i);
            //it left the value blue, because while it removed the yellow it reduced the size of array
        }

        System.out.println(colors);

//        for(String color: colors) {
//            colors.remove(color);
        //Runtime error: ConcurrentModificationException
//        }

        System.out.println("-----------ArrayToList   ListToArray----------");
        Object[] colorObjArray = colors.toArray();
        String[] colorArray = colors.toArray(new String[0]);

        String[] shapes = new String[]{"square", "circle", "triangle"};
        List shapeList = Arrays.asList(shapes);
        System.out.println(shapeList);

        System.out.println(shapeList.getClass().getName());
        //java.util.Arrays$ArrayList - fixed size list,
        //you can change elements but cant remove them


        System.out.println(colors.getClass().getName());

        List shapeList2 = List.of(shapes); //immutable list
       //shapeList2.add("rectangle");
        /*
        Exception in thread "main" java.lang.UnsupportedOperationException
	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
         */

        List<String> shapeList3 = new ArrayList<>();
        for(String shape: shapes) {
            shapeList3.add(shape);
        }
        System.out.println(shapeList3);

        Object[] shapes2 = shapeList3.toArray();

        System.out.println("-----------LinkedList----------");

        LinkedList<String> orders = new LinkedList<>();
        orders.add("order 1");
        orders.add("order 2");
        orders.add("order 3");
        System.out.println(orders);
        orders.addFirst("order 4");
        orders.addLast("order 5");
        System.out.println(orders);
        orders.removeFirst();
        orders.removeLast();
        System.out.println(orders);

        System.out.println("-----------Sorting Lists---------");

        List numberList = new ArrayList();
        numberList.add(10);
        numberList.add(5);
        numberList.add(1);
        numberList.add(3);
        numberList.add(9);

        System.out.println(numberList);
        Collections.sort(numberList);
        System.out.println(numberList);

        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Everest", 8848));
        mountains.add(new Mountain("Matterhorn", 4478));
        mountains.add(new Mountain("K2", 8611));

        Collections.sort(mountains);
        System.out.println(mountains.stream().
                map(Mountain::getName).
                collect(Collectors.toList()));

        Comparator<Mountain> mountainComparator = new Comparator<Mountain>() {
            @Override
            public int compare(Mountain o1, Mountain o2) {
                return o2.getHeight() - o1.getHeight();
            }
        };

        Collections.sort(mountains, mountainComparator);
        System.out.println(mountains.stream().
                map(Mountain::getName).
                collect(Collectors.toList()));

        Comparator<Mountain> mountainComparator2 = (m1, m2) ->
                m2.getHeight() - m1.getHeight();


    }

}
