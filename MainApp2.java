import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;
public class MainApp2{
    public static void main(String[] args){
        Book b1 = new Book("Java Programming", "James Gosling");
        Member m1 = new Member("Piyush", 101);
        Transaction t1 = new Transaction();
        b1.displayBook();
        m1.displayMember();
        t1.issueBook("Java Programming", "Piyush");
    }
}