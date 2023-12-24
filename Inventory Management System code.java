//INVENTORY MANAGEMENT SYSTEM PROJECT
//This project used to maintain the product details and manage several methods
//Using java programming to do Inventory Management System
import java.util.*;
class Products12{
    Scanner d1=new Scanner(System.in);
    public int Product_id;
    public String Product_name;
    public int Product_price;
    public int quantity;
    public Products12(int Product_id1,String Product_name1,int Product_price1,int quantity1){
        this.Product_id=Product_id1;
        this.Product_name=Product_name1;
        this.Product_price=Product_price1;
        this.quantity=quantity1;
    }
    //Displaying the product details by using display methods
    public void display_productID(){
        System.out.println("Product ID:"+Product_id);
    }
    public void display_productName(){
        System.out.println("Product name:"+Product_name);
    }
    public void display_productPrice(){
        System.out.println("Product Price:"+Product_price);
    }
    public void display_quantity(){
        System.out.println("Product quantity:"+quantity);
    }

    //updating the produuct details by using conditional statements
    public void update_details(){
        System.out.println("Update the old product details to New:");
        System.out.println("1.update new product Price");
        System.out.println("2.update Quantity");
        System.out.println("3.update product Name");
        System.out.println("4.update product ID");
        
        System.out.println("Enter the choice:");
        int choice =d1.nextInt();

        if(choice==1){
            System.out.println("Enter the new price:");
            int new_price=d1.nextInt();
            this.Product_price=new_price;
            System.out.println();
            System.out.println("Succesfully updated Price");
        }
        else if(choice==2){
            System.out.println("Enter the quantity:");
            int new_quantity=d1.nextInt();
            this.quantity=new_quantity;
            System.out.println("Succesfully updated Quantity");
        }
        else if(choice==3){
            System.out.println("Enter the new Product Name:");
            String new_name1=d1.next();
            this.Product_name=new_name1;
            System.out.println("Succesfully updated Name");
        }
        else if(choice==4){
            System.out.println("Enter the new Product id to update the old:");
            int new_id=d1.nextInt();
            this.Product_id=new_id;
             System.out.println("Succesfully updated Id");
        }
        else{
            System.out.println("INVALID CHOICE!!!");
        }
    }
    
    //getting the values after updation using update_details method
    public void display_updatedValues(){
        System.out.println("Updated Product Details:");
        System.out.println("Product ID:"+Product_id);
        System.out.println("Product Name:"+Product_name);
        System.out.println("Product Price:"+Product_price);
        System.out.println("Product Quantity:"+quantity);
        
    }
    
}

//This class used to record the sales details and tracking sales data will become easier to identify 
//Through this class we can analyse the products will restock and it will notify us to products quantities are less
class sales_recording{
    public int sales_id;
    public int Product_id;
    public int price_sold;
    public int quantity_sold;
    //This constructor used to initialize the values 
    public sales_recording(int sales_id1,int Product_id1,int price_sold1,int quantity_sold1){
        this.sales_id=sales_id1;
        this.Product_id=Product_id1;
        this.price_sold=price_sold1;
        this.quantity_sold=quantity_sold1;
      }
      //Used to print the details of the sales
    public void sales_details(){
        System.out.println("Sales id :"+sales_id);
        System.out.println("Product_id:"+Product_id);
        System.out.println("quantity items sold:"+quantity_sold);
    }
}



class Inventory{
    public static void main(String[] args) {
      Scanner d2=new Scanner(System.in);
      List<Products12> list1=new ArrayList<Products12>();     
        System.out.println("****INVENTORY MANAGEMENT SYSTEM METHODS****");
        System.out.println("Enter product details:");
        //Input the details of product by user method
        System.out.println("Enter Product Id:");
        int Product_id1=d2.nextInt();
        System.out.println("Enter the Product Name:");
        String Product_name1=d2.next();
        System.out.println("Enter the Product price:");
        int Product_price1=d2.nextInt();
        System.out.println("Enter the Quantity:");
        int quantity1=d2.nextInt();
        //Creating the object and intializing the values 
        Products12 obj1=new Products12(Product_id1,Product_name1,Product_price1,quantity1);
        list1.add(obj1);
    while(true){    
        System.out.println();//Inventory management methods
        System.out.println("Select below the choice:");
        System.out.println("1.update the values");
        System.out.println("2.After updation values");
        System.out.println("3.Adding products");
        System.out.println("4.Removing products");
        System.out.println("5.Transverse all the products");
        System.out.println("6.stack tracking"); 
        System.out.println("7.sales recording");
        System.out.println("8.After selling records");
        System.out.println("9.Report Generation");
        System.out.println("Enter the choice:");//Selecting the above methods by user methods
        int choice=d2.nextInt();
        switch(choice){
        case 1:
              //To update the details of old 
              obj1.update_details();
              break;
        case 2:
              //Displaying the updated values
              obj1.display_updatedValues();
              break;
              
        case 3:
              //Adding the new products items to stock
              System.out.println("Enter the details to add new Product:");
              System.out.println("Enter Product Id:");
              int Product_idA=d2.nextInt();
              System.out.println("Enter the Product Name:");
              String Product_nameA=d2.next();
              System.out.println("Enter the Product price:");
              int Product_priceA=d2.nextInt();
              System.out.println("Enter the Quantity:");
              int quantityA=d2.nextInt();
              Products12 first_obj=new Products12(Product_idA,Product_nameA,Product_priceA,quantityA);
              list1.add(first_obj);
              break;
             
        case 4:
              //Removing the products from stock
              System.out.println("Removing the products:");
              System.out.println("Enter the correct product ID to remove:");
              int id1=d2.nextInt();
              for(Products12 b:list1){
                  if(id1==b.Product_id){
                    list1.remove(id1);
                    System.out.println("Product IDNo."+id1+" removed succesfully");
                     }
                 }
               break;
               
        case 5:
             //Transversing the all the products 
             //Displaying the all products and items in inventory management 
             System.out.println("Transversing all the products");
             for(Products12 b:list1){
             System.out.println("Product No:"+b.Product_id);
             System.out.println("Product Name:"+b.Product_name);
             System.out.println("Product Price:"+b.Product_price);
             System.out.println("Quantity:"+b.quantity);
               }
            break;
        case 6:
            //Stock tracking the products by based on the number of product quantities are there
            System.out.println("Tracking all the products");
            for(Products12 b:list1){
                     if(b.quantity<3){ 
                     System.out.println("Notification Stock is less!!!");
                     System.out.println("Product item "+b.Product_name+" consists of "+b.quantity);
                     System.out.println("restock the product item!!!");
                          }
                      }
            break;
        case 7:
             //sales recording used  to store the details of sales and updates the stock by removing the selled items 
             //Taking sales inputs from the user 
             System.out.println("Enter the sales id:");
             int sales_idB=d2.nextInt();
             System.out.println("Enter the sales Product id:");
             int Sproduct_idB=d2.nextInt();
             System.out.println("Enter the product price sold:");
             int sold_priceB=d2.nextInt();
             System.out.println("Enter the quantity sold:");
             int quantity_soldB=d2.nextInt();
             sales_recording obj10=new sales_recording(sales_idB,Sproduct_idB,sold_priceB,quantity_soldB);
             for(Products12 b1:list1)
                  {
                    if(b1.Product_id==Sproduct_idB){
                         //total product quantities subtracted by saled quantites
                          b1.quantity=(b1.quantity)-(quantity_soldB);
                         //update the products price to sales price
                          b1.Product_price=sold_priceB;
                       }
                   }
            break;
            
        case 8:
            //After selling the products and displaying them
            System.out.println("After selling the products are:");
            for(Products12 b1:list1){
                System.out.println("Product No:"+b1.Product_id);
                System.out.println("Product Name:"+b1 .Product_name);
                System.out.println("Product Price:"+b1.Product_price);
                System.out.println("Quantity:"+b1.quantity);
                 }
            break;     
        case 9:
             //Report generation for the Inventory management system
             //we can generate the report based on the selling the products and comparing the product quantites
            System.out.println("Report Generation:");
            for(Products12 b1:list1){
                      //Using the conditional statements we can give report based the number of quantities
                      if(b1.quantity<5){
                      System.out.println("More selling!!!");
                      System.out.println("Product ID No."+b1.Product_id+" & Product Name:"+b1.Product_name);
                      System.out.println("Product item is selling more!!!");
                      System.out.println(b1.Product_name+" product contains only"+b1.quantity+"quantites");
                     }
                     if(b1.quantity>15){
                       System.out.println("Less selling!!!");
                       System.out.println("Product ID No."+b1.Product_id+"& Product Name:"+b1.Product_name);
                       System.out.println("Item is not selling more!!!");
                       System.out.println("Stock contains more number of quantities");
                      }
                    if(b1.quantity>=5 && b1.quantity<=15){
                     System.out.println("Medium selling");
                     System.out.println("Product ID No."+b1.Product_id+"& Product Name:"+b1.Product_name);
                    System.out.println("Item is selling medium level");
                    System.out.println("Stock contains not more and less quantites");
                           }
                    }
            break;
        default:
                   System.out.println("INVALID OPTION");
            break;
        
        }
    }     
 } 
}
