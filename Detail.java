class Detail
{
    String name;
    String addr;
    int tel;
    int rent;
    
    Detail (String n, String a, int t, int r)
    {
        name = n;
        addr = a;
        tel = t;
        rent = r;
    }
    
    void show()
    {
        System.out.println ("Name: " + name);
        System.out.println ("Address: " + addr);
        System.out.println ("Telephone no: " + tel);
        System.out.println ("Rent: " + rent);
    }
}