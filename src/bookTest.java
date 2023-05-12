public class bookTest {
    public static void main(String[] args) {


        Author author1 = new Author("Roald Dahl", "rold@gmail.com", "female");
        BookCreator book1 = new BookCreator("Matilda", "author1", 20.50, 20);
        System.out.println("Author name is: " + author1.getName() + "   Author email is : " + author1.getEmail() + "  Author gender is: " + author1.getGender());
        System.out.println("Book name is:  " + book1.getBookNameName() + "  price is: " + book1.getPrice() + "  quantity " + book1.getQuantity());

    }
}
