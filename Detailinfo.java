/*Define an interface DetailInfo to declare methods display ( ) & count ( ). Another class Person
contains a static data member maxcount, instance member name & method display ( ) to display name
of a person, count the no. of characters present in the name of the person. */
interface DetailInfo
{
    void display();
    int count();
}
class man implements DetailInfo
{
    static int maxcount = 15;
    String name;
    public man(String name)
    {
        this.name = name;
    }
    public void display()
    {
        System.out.println("Name: " + name);
    }
    public int count()
    {
        return name.length();
    }
}
class HelloWorld {
    public static void main(String[] args)
    {
        man p = new man("Aditya");
        p.display();
        int count=p.count();
        System.out.println("Name length: " + count);
    }
}