package homework10;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        final LocalDate dateAfter = LocalDate.of(2021, 10, 1);
        final LocalDate dateBefore = LocalDate.of(2021, 11, 1);
        final LocalDate dayOrder = LocalDate.of(2021, 11, 15);
        Product p1 = new Product(1, "item1", "books", 10D);
        Product p2 = new Product(2, "item2", "books", 550D);
        Product p3 = new Product(3, "item3", "books", 900D);
        Product p4 = new Product(4, "item4", "devices", 400D);
        Product p5 = new Product(5, "item5", "books", 500D);
        Product p6 = new Product(6, "item6", "child", 700D);
        Product p7 = new Product(7, "item7", "devices", 800D);
        Product p8 = new Product(8, "item8", "child", 900D);
        Product p9 = new Product(9, "item9", "toy", 200D);
        Product p10 = new Product(10, "item10", "toy", 300D);

        Customer c1 = new Customer(1, "name1", 21);
        Customer c2 = new Customer(2, "name2", 22);
        Customer c3 = new Customer(3, "name3", 23);
        Customer c4 = new Customer(4, "name4", 24);
        Customer c5 = new Customer(5, "name5", 25);
        List<Product> list1 = new ArrayList<>();
        list1.add(p1);
        list1.add(p2);
        list1.add(p5);
        list1.add(p7);
        list1.add(p8);
        list1.add(p9);
        List<Product> list2 = new ArrayList<>();
        list2.add(p3);
        list2.add(p4);
        list1.add(p8);
        List<Product> list3 = new ArrayList<>();
        list2.add(p1);
        list2.add(p4);
        list2.add(p5);
        list1.add(p9);
        list1.add(p10);
        List<Product> list4 = new ArrayList<>();
        list2.add(p2);
        list2.add(p6);
        list2.add(p7);
        list1.add(p9);
        list1.add(p10);
        Order order1 = new Order(1, "in progress", LocalDate.of(2021, 11, 8), LocalDate.of(2021, 11, 9), (ArrayList<Product>) list1, c1);
        Order order2 = new Order(2, "in progress", LocalDate.of(2021, 10, 12), LocalDate.of(2021, 11, 12), (ArrayList<Product>) list2, c2);
        Order order3 = new Order(3, "in progress", LocalDate.of(2021, 11, 15), LocalDate.of(2021, 11, 16), (ArrayList<Product>) list3, c3);
        Order order4 = new Order(4, "in progress", LocalDate.of(2021, 11, 15), LocalDate.of(2021, 11, 18), (ArrayList<Product>) list4, c4);
        ArrayList<Order> listOrders = new ArrayList<>();
        listOrders.add(order1);
        listOrders.add(order2);
        listOrders.add(order3);
        listOrders.add(order4);

        ListIterator<Order> listIterator = listOrders.listIterator();
//Task1
        System.out.println("task 1 list of products category==books, price>100");
        while (listIterator.hasNext()) {
            Order order = listIterator.next();
            order.getProducts().stream().takeWhile(product -> !product.equals(null))
                    .filter(product -> product.getCategory().equals("books"))
                    .filter(product -> product.getPrice() > 100)
                    .map(product -> product.toString())
                    .forEach(System.out::println);
        }
//Task2
        System.out.println();
        System.out.println("task 2 list orders category==child");

        reIterator(listOrders, listIterator);
        while (listIterator.hasNext()) {


            Order order = listIterator.next();
            order.getProducts().stream().takeWhile(product -> !product.equals(null))

                    .filter(product -> product.getCategory().equals("child"))
                    .map(product -> product.toString())
                    .forEach(System.out::println);
        }

//Task 3
        System.out.println();
        System.out.println("task 3 list products  category==toy and  discount 10%");
        reIterator(listOrders, listIterator);
        while (listIterator.hasNext()) {


            Order order = listIterator.next();
            order.getProducts().stream()
                    .filter(product -> product.getCategory().equals("toy"))
                    .map(product -> product.getPrice() * 0.9D + " " + product.getCategory() + " " + product.getName())
                    .forEach(System.out::println);

        }

        //Task 4
        System.out.println();
        System.out.println("task 4  order_date between 01.10.2021 AND  01.11.2021, tier level==2");
        Stream<Order> stream = Stream.of(order1, order2, order3);
        stream
                .filter(order -> order.getOrderDate().isBefore(dateBefore))
                .filter(order -> order.getOrderDate().isAfter(dateAfter))
                .filter(ord -> !(ord.getCustomer().getTier() == 2))
                .map(order -> order.getProducts().toString())
                .forEach(System.out::println);

        //Task 5
        System.out.println();
        System.out.println("task 5  product-book price=cheapest");
        Stream<Order> stream2 = Stream.of(order1, order2, order3);
        stream2
                .map(order -> order.getProducts())
                .flatMap(products -> products.stream())
                .filter(product -> product.getCategory() == "books")
                .map(product -> product.getPrice() + " " + product.getName() + " " + product.getCategory())
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println();
        System.out.println("task 6  3 last orders");
        Stream<Order> stream3 = Stream.of(order1, order2, order3, order4);
        stream3
                .map(order -> order.getOrderDate() + " id=" + order.getId())
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
        System.out.println();
        System.out.println("task 7  orders from  15.11.2021 ");
        Stream<Order> stream4 = Stream.of(order1, order2, order3, order4);
        stream4

                .filter(order -> order.getOrderDate().equals(dayOrder))
                .collect(Collectors.toList())
                .stream()
                .map(order -> order.getProducts().toString() + "date=" + order.getOrderDate())
                .forEach(System.out::println);
        System.out.println();
        System.out.println("task 8   Map<Order, Double> with orders and sum of prices");
        Map<Order, Double> map = new HashMap<>();
        reIterator(listOrders, listIterator);
        while (listIterator.hasNext()) {
            Order order = listIterator.next();
            double sum = order.getProducts().stream()
                    .mapToDouble(p -> p.getPrice()).sum();
            map.put(order, sum);
        }
        System.out.println(map.toString());
    }

    private static void reIterator(List<Order> listOrders, ListIterator<Order> listIterator) {
        for (int i = 0; i < listOrders.size(); i++) {
            Order o = listIterator.previous();
        }
    }


}
