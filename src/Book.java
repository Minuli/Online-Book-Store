/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minuli Lokuliyanage
 */
class Book {
    private String bookID,bookName,author,publisher;
    private int publishedYear;
    private double price;
    
    public Book(String bookID,String bookName,String author,String publisher,int publishedYear,double price)
    {
        this.bookID=bookID;
        this.bookName=bookName;
        this.author=author;
        this.publisher=publisher;
        this.publishedYear=publishedYear;
        this.price=price;
    }
    
    public String getbookID()
    {
        return bookID;
    }
    
    public String getbookName()
    {
        return bookName;
    }
    public String getauthor()
    {
        return author;
    }
    public String getpublisher()
    {
        return publisher;
    }
   
    public int getpublishedYear()
    {
        return publishedYear;
    }
    public double getprice()
    {
        return price;
    }
    
}
