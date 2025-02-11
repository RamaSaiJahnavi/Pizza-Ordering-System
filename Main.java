// You are using Java
import java.util.Scanner;
class PizzaHouse
{ 
    
    int arr[];
    PizzaHouse(int a[])
    {
        arr=a;
    }
    Scanner sc=new Scanner(System.in);
    void placeorder(String pizza,int ec[],int c[],int price[])
    {
        if(pizza.equals("Regular"))
        {
            System.out.println("Please enter the quantity: ");
            int quantity=sc.nextInt();
            price[0]=price[0]+quantity*199;
            arr[0]=arr[0]+quantity;
        }
        else if(pizza.equals("Medium"))
        {
            System.out.println("Please enter the quantity: ");
            int quantity1=sc.nextInt();
            price[0]=price[0]+quantity1*299;
            arr[1]=arr[1]+quantity1;
        }
        else if(pizza.equals("Large"))
        {
            System.out.println("Please enter the quantity: ");
            int quantity2=sc.nextInt();
            price[0]=price[0]+quantity2*399;
            arr[2]=arr[2]+quantity2;
        }
        else if(pizza.equals("Place Order"))
        {
            System.out.println("Do you prefer Extra cheese for Rs.30: Yes/No");
            String option=sc.next();
            if(option.equals("Yes") || option.equals("yes") || option.equals("y") || option.equals("Y"));
            {
                price[0]=price[0]+30;
                ec[0]=1;
            }
            System.out.println("Do you prefer Coke for Rs.99: Yes/No");
            String option1=sc.next();
            if(option1.equals("Yes") || option1.equals("yes") || option1.equals("y") || option1.equals("Y"))
            {
                price[0]=price[0]+99;
                c[0]=1;
            }
            System.out.println("Total Bill: "+price[0]);
        }
    }
}
class Main 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String size[]=new String[3];
        size[0]="Regular";
        size[1]="Medium";
        size[2]="Large";
        int arr[]=new int[3];
        int p[]=new int[3];
        p[0]=199;
        p[1]=299;
        p[2]=399;
        int ec[]=new int[1];
        int c[]=new int[1];
        int price[]=new int[1];
        ec[0]=0;
        c[0]=0;
        for(int i=0;i<3;i++)
        {
            arr[i]=0;
        }
        while(true)
        {
            System.out.println("Menu:\n 1.Regular -Rs.199\n 2.Medium -Rs.299\n 3.Large -Rs.399\n 4.Place order");
            System.out.println("Please Enter the Choice: ");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    PizzaHouse ob=new PizzaHouse(arr);
                    ob.placeorder("Regular",ec,c,price);
                    break;
                case 2:
                    PizzaHouse ob1=new PizzaHouse(arr);
                    ob1.placeorder("Medium",ec,c,price);
                    break;
                case 3:
                    PizzaHouse ob2=new PizzaHouse(arr);
                    ob2.placeorder("Large",ec,c,price);
                    break;
                case 4:
                    PizzaHouse ob3=new PizzaHouse(arr);
                    ob3.placeorder("Place Order",ec,c,price);
                    break;
                default:
                    System.out.print("Sorry Not Available Right Now\n");
                    break;
            }
            if(choice==4)
            {
                break;
            }
        }
        System.out.println("\n\n\nxxxxxxxxxxxxxxxxx\n");
        System.out.println("\tPizzaHouse\n");
        System.out.println("OrderID: 12308734");
        System.out.println("Items: ");
        System.out.println("    Size: "+"   Quantity:  "+"  Price:");
        for(int i=0;i<3;i++)
        {
            if(arr[i]!=0)
            {
                System.out.println("    "+size[i]+"      "+arr[i]+"        "+arr[i]+"x"+p[i]);
            }
        }
        System.out.println();
        if(ec[0]==1)
        {
            System.out.println("Prefered Extra cheese     30");
        }
        if(c[0]==1)
        {
            System.out.println("Prefered for a Coke       99");
        }
        System.out.println("\nTotal Bill:\t\t"+price[0]);
        System.out.println("\nxxxxxxxxxxxxxxxxx");
        sc.close();
    }
}