package maven6;

public class Solution
{
    public static void main(String []args)
    {
        CustomList<Integer> a=new CustomList<Integer>();
        a.add(10);
        a.add(15);
        a.add(20);
        a.add(10);
        System.out.println("The CustomList Elements are : "+a);
        System.out.println("The Third element in CustomList is : "+a.get(2));
        //deleting the element
        a.remove(3);
        System.out.println("CustomList after deleting 10 : "+a);
        System.out.println("Size of the CustomList is : "+a.size());
    }
}
