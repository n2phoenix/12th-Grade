import java.util.*;
class stringLink
{
    char c;
    stringLink next;
    stringLink prev;
    void create (stringLink first)
    {
        Scanner in = new Scanner (System.in);
        stringLink last;
        System.out.println ("Enter string: ");
        String s = in.nextLine();
        int len = s.length();
        last = first;
        last.c = s.charAt (0);

        for (int i = 1; i < len; i++)
        {
            stringLink x = new stringLink();
            x.c = s.charAt (i);
            last.next = x;
            last = x;
        }
    }

    void print (stringLink first)
    {
        stringLink last = new stringLink();
        last = first;
        
        while (last != null)
        {
            System.out.println (last.c + "/");
            last = last.next;
        }
    }

    void check (stringLink first)
    {
        String forward = "";
        String backward = "";
        stringLink last = new stringLink();
        last = first;
        byte flag = 0;
        
        while (last != null)
        {
            forward += last.c + "";
            last = last.next;
        }

        while (last != null)
        if (flag == 0)
            System.out.println ("The string is a palindrome! ");
        else
            System.out.println ("The string is not a palindrome! ");
    }
}