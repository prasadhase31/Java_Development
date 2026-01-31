package orderpkg;

import bookpkg.Book;

public class BuyBook {

    public static void main(String[] args) {

        Book book = new Book(101, "Java Programming", "James Gosling", 500);

        Order order = new Order(1001, 501, "Prasad", 2);

        order.calculateTotal(book.getDiscountPrice());

        System.out.println("----- Book Details -----");
        book.displayBookDetails();

        System.out.println("\n----- Order Details -----");
        order.displayOrderDetails();
    }
}
