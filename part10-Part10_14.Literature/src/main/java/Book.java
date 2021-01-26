/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Book implements Comparable<Book> {

    private String bookName;
    private int ageRating;

    public Book(String bookName, int ageRating) {
        this.bookName = bookName;
        this.ageRating = ageRating;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getAgeRating() {
        return this.ageRating;
    }

    @Override
    public int compareTo(Book book) {

        if (this.ageRating < book.ageRating) {

            return -1;
        } else if (this.ageRating == book.ageRating) {

            return 0;
        }

//return this.bookName.compareTo(book.bookName);
        return 1;
    }

    public String toString() {
        return this.bookName + " (recommended for " + this.ageRating + " year-olds or older)";
    }

}
