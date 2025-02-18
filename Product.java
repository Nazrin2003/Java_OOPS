public class Product
{
    int pcode,price;
    String pname;
    public static void main(String args[])
    {
        Product p1=new Product();
        Product p2=new Product();
        Product p3=new Product();

        p1.pcode=1;
        p1.price=10;
        p1.pname="Pen";

        p2.pcode=2;
        p2.price=5;
        p2.pname="Pencil";
       
        p3.pcode=3;
        p3.price=60;
        p3.pname="Book";

        System.out.println("Product Code: " + p1.pcode);
        System.out.println("Product Name: " + p1.pname);
        System.out.println("Price: " + p1.price+"\n");

        System.out.println("Product Code: " + p2.pcode);
        System.out.println("Product Name: " + p2.pname);
        System.out.println("Price: " + p2.price+"\n");

        System.out.println("Product Code: " + p3.pcode);
        System.out.println("Product Name: " + p3.pname);
        System.out.println("Price: " + p3.price+"\n");
       
       
            if(p1.price<p2.price)
            {
                if(p1.price<p3.price)
                    System.out.println("Price of "+p1.pname+" is smaller");        
                else
                    System.out.println("Price of "+p3.pname+" is smaller");
            }
            else if (p2.price<p3.price)
            {
                System.out.println("Price of "+p2.pname+" is smaller");
            }
            else
            {
                System.out.println(p3.pname+" is smaller");
            }
                 
    }
}