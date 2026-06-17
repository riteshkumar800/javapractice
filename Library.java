public class Library {

    String name;
    int year;
    Book[] books;// library has a book, but book is a different thing means if library destroyed books will still be there


    Library(String name, int year, Book[] books ){
        this.name=name;
        this.year=year;
        this.books=books;
    }

    void displayInfo(){
        System.out.println("The "+ this.year+  " " + this.name);
        System.out.println("Books available: ");
        for(Book book: books){
            System.out.println(book.displayInfo());
        }
    }
    
}
