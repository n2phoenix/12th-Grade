class Library
{
    String name; String author; double pr;

    Library(String n, String a, double p)
    {
        name = n;
        author = a;
        pr = p;
    }
    
    void show()
    {
        System.out.println ("Name of the book: " + name);
        System.out.println ("Author's name: " + author);
        System.out.println ("Price of the book: " + pr);
    }
}