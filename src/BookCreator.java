public class BookCreator {
    private String bookName;
    private String author;
    private double price;
    private int qty;

    public BookCreator(String bookName, String author, double price, int qty){
        setBookName(bookName);
        setAuthor(author);
        setPrice(price);
        setQuantity(qty);

    }
    public String getBookNameName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){

        this.author=author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){

        this.price=price;
    }
    public int getQuantity(){
        return qty;
    }
    public void setQuantity(int qty){

        this.qty=qty;
    }
}
