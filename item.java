import java.util.*;
class item
{
    String item_name;
    int item_code, item_cost, item_qty;
    item next, prev;
    
    void create (item first)
    {
        Scanner in = new Scanner (System.in);
        item last;
        System.out.println ("Enter number of items: ");
        int n = Integer.parseInt (in.nextLine());
        last = first;
        
        for (int i = 0; i <= n - 1; i++)
        {
            item x = new item();
            x.read();
            x.next = null;
            last.next = x;
            x.prev = last;
            last = x;
        }
    }
    
    void read()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter name, item code, item cost and quantity: ");
        item_name = in.nextLine();
        item_code = Integer.parseInt (in.nextLine());
        item_cost = Integer.parseInt (in.nextLine());
        item_qty = Integer.parseInt (in.nextLine());
    }
    
    void printforward (item first)
    {
        item last = new item();
        last = first;

        while (last != null)
        {
            System.out.println ("Name, item code, item cost and quantity: ");
            System.out.println (last.item_name);
            System.out.println (last.item_code);
            System.out.println (last.item_cost);
            System.out.println (last.item_qty);
            last = last.next;
        }
    }
    
    void printreverse (item first)
    {
        item last;
        last = first;

        while (last.next != null)
        last = last.next;
        
        while (last != null)
        {
            System.out.println ("Name, item code, item cost and quantity: ");
            System.out.println (last.item_name);
            System.out.println (last.item_code);
            System.out.println (last.item_cost);
            System.out.println (last.item_qty);
            last = last.prev;
        }
    }
}