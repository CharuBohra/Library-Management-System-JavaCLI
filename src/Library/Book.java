package Library;

public class Book {
    private String name;        //title
    private String author;      //author
    private String publisher;   //publisher
    private String address;     //Collection Location
    private String status;      //Borrowing Status
    private int qty;            //Copies for sale
    private double price;       //Price
    private int borrowCopies;   //Copies for Borrowing

    public Book(){ }

    public Book(String name,String author,String publisher, String address,int qty,double price,int borrowCopies)
    {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.address = address;
        this.qty = qty;
        this.price = price;
        this.borrowCopies = borrowCopies;
    }

    public String toString(){
        String text = "Book Name : "+name+"\n"+
                "Book Author : "+author+"\n"+
                "Book Publisher : "+publisher+"\n"+
                "Book Collection Address : "+address+"\n"+
                "Quantity : "+String.valueOf(qty)+"\n"+
                "Price : "+String.valueOf(price)+"\n"+
                "Borrowing Copies : "+String.valueOf(borrowCopies);
        return text;
    }

    public int getBorrowCopies() {
        return borrowCopies;
    }

    public void setBorrowCopies(int borrowCopies) {
        this.borrowCopies = borrowCopies;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString2(){
        String text = name+"<N/>" +author+"<N/>"
                +publisher+"<N/>" +address+"<N/>"
                +String.valueOf(qty)+"<N/>"
                +String.valueOf(price)+"<N/>"
                +String.valueOf(borrowCopies);
        return text;
    }

}
