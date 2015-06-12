import java.util.*;
public class book
{
    String author, title;
    int bookcode;
    double cost;
    book next;

    void create (book first)
    {
        Scanner in = new Scanner (System.in);
        book last;
        first.read();
        System.out.println ("Enter number of books: ");
        int n = Integer.parseInt (in.nextLine());
        last = first;

        for (int i = 0; i < n - 1; i++)
        {
            book x = new book();
            x.read();
            x.next = null;
            last.next = x;
            last = x;
        }
    }

    void read()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter title, author name, book code and book cost");
        title = in.nextLine();
        author = in.nextLine();
        bookcode = Integer.parseInt (in.nextLine());
        cost = Double.parseDouble (in.nextLine());
    }

    void print(book first)
    {
        book last = new book();
        last = first;

        while (last != null)
        {
            System.out.println ("Title, author name, book code and book cost: ");
            System.out.println (last.title);
            System.out.println (last.author);
            System.out.println (last.bookcode);
            System.out.println (last.cost);
            last = last.next;
        }
    }

    void max_cost (book first)
    {
        book last = new book();
        last = first;
        book max = new book();
        max = first;

        while (last != null)
        {
            if (max.cost < last.cost)
                max = last;
            last = last.next;
        }

        System.out.println ("Most expensive book: ");
        System.out.println (max.title);
        System.out.println (max.author);
        System.out.println (max.bookcode);
        System.out.println (max.cost);
    }

    void search (book first, String t)
    {
        book last = new book();
        last = first;
        book sch = new book();

        while (last != null)
        {
            if (last.title.equalsIgnoreCase (t))
                sch = last;
            last = last.next;
        }

        System.out.println ("Found book: ");
        System.out.println (sch.title);
        System.out.println (sch.author);
        System.out.println (sch.bookcode);
        System.out.println (sch.cost);
    }

    void join (book first, book root)
    {
        book last = new book();
        last = first;

        create (root);

        while (last != null)
            last = last.next;

        last = root;
    }
    
    void insertfirst (book first, book n) //If n has only one node
    {
        n.next = first;
        first = n;
        print (first);
    }

    void insertafter (book first, book n, int x)
    {
        int a = 0;
        book last;
        last = first;

        while (a != x + 1)
        {
            last = last.next;
            a++;
        }
        book temp = last;
        last = n;
        n.next = temp;
    }
}