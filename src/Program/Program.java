package Program;

import Factory.FactoryLine;
import products.*;

import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void run(){
        String[] products = {"Bed", "Sofa", "Bookcase", "Dresser", "Table","Chair"};
        FactoryLine fact=new FactoryLine();
        Sofa sofa = new Sofa();
        Bed bed = new Bed();
        Bookcase bookcase = new Bookcase();
        Table table = new Table();
        Dresser dresser = new Dresser();
        Chair chair = new Chair();
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int fro=fact.front;
        int user=scan.nextInt();
        for(int j=0;j<user;j++) {
            Random item_2=new Random();
            int r1;
            r1=item_2.nextInt(3);
            if(r1==0) {
                Random item=new Random();
                int r2;
                r2=item.nextInt(6);
                fact.Enqueue(products[r2]);
                if (products[r2].equals("Bed")) {
                    bed.setCount(bed.getCount()+1);
                }
                else if (products[r2].equals("Sofa")) {
                    sofa.setCount(sofa.getCount()+1);
                }
                else if (products[r2].equals("Dresser")) {
                    dresser.setCount(dresser.getCount()+1);
                }
                else if (products[r2].equals("Table")) {
                    table.setCount(table.getCount()+1);
                }
                else if (products[r2].equals("Bookcase")) {
                    bookcase.setCount(bookcase.getCount()+1);
                }
                else if(products[r2].equals("Chair")){
                    chair.setCount(chair.getCount()+1);
                }
            }
            else if(r1==1) {
                if (fact.isEmpty()) {
                    System.out.println("FAIL. Factory line is empty");
                }
                else if (fact.queue[fro].equals("Table")){
                    table.getTableWare().push("Table");
                    System.out.println("Storage Chief storing Table,SUCCESS,Table stored in Table warehouse ");
                    fact.Dequeue();
                    table.setCount(table.getCount()-1);
                    fro++;
                }
                else if (fact.queue[fro].equals("Bed")){
                    bed.getBedWare().push("Bed");
                    System.out.println("Storage Chief storing Bed,SUCCESS,Bed stored in Bed warehouse ");
                    fact.Dequeue();
                    bed.setCount(bed.getCount()-1);
                    fro++;
                }
                else if (fact.queue[fro].equals("Dresser")){
                    dresser.getDresserWare().push("Dresser");
                    System.out.println("Storage Chief storing Dresser , SUCCESS , Dresser stored in Dresser warehouse ");
                    fact.Dequeue();
                    dresser.setCount(dresser.getCount()-1);
                    fro++;
                }
                else if (fact.queue[fro].equals("Sofa")){
                    sofa.getSofaWare().push("Sofa");
                    System.out.println("Storage Chief storing Sofa, SUCCESS , Sofa stored in Sofa warehouse ");
                    fact.Dequeue();
                    sofa.setCount(sofa.getCount()-1);
                    fro++;
                }
                else if (fact.queue[fro].equals("Bookcase")){
                    bookcase.getBookcaseWare().push("Bookcase");
                    System.out.println("Storage Chief storing Bookcase,SUCCESS,Bookcase stored in Bookcase warehouse ");
                    fact.Dequeue();
                    bookcase.setCount(bookcase.getCount()-1);
                    fro++;
                }else if (fact.queue[fro].equals("Chair")){
                    chair.getChairWare().push("Chair");
                    System.out.println("Storage Chief storing Chair,SUCCESS,Chair stored in Chair warehouse ");
                    fact.Dequeue();
                    chair.setCount(chair.getCount()-1);
                    fro++;
                }
            }
            else if(r1==2) {
                Random item=new Random();
                int r2;
                r2=item.nextInt(6);
                if(products[r2].equals("Sofa")) {
                    if(sofa.getSofaWare().pop()!=null){
                        System.out.println("Customer buying Sofa, SUCCESS, Customer bought Sofa ");
                    }else{
                        System.out.println("Customer buying Sofa, FAIL, Sofa warehouse is empty ");
                    }
                }
                else if(products[r2].equals("Bookcase")) {
                    if(bookcase.getBookcaseWare().pop()!=null){
                        System.out.println("Customer buying Bookcase, SUCCESS, Customer bought Bookcase ");
                    }else{
                        System.out.println("Customer buying Bookcase, FAIL, Bookcase warehouse is empty ");
                    }
                }
                else if(products[r2].equals("Dresser")) {
                    if(dresser.getDresserWare().pop()!=null){
                        System.out.println("Customer buying Dresser, SUCCESS, Customer bought Dresser ");
                    }else{
                        System.out.println("Customer buying Dresser, FAIL, Dresser warehouse is empty ");
                    }
                }
                else if(products[r2].equals("Bed")) {
                    if(bed.getBedWare().pop()!=null){
                        System.out.println("Customer buying Bed, SUCCESS, Customer bought Bed ");
                    }else{
                        System.out.println("Customer buying Bed, FAIL, Bed warehouse is empty ");
                    }
                }
                else if(products[r2].equals("Table")) {
                    if(table.getTableWare().pop()!=null){
                        System.out.println("Customer buying Table, SUCCESS, Customer bought Table ");
                    }else{
                        System.out.println("Customer buying Table, FAIL, Table warehouse is empty ");
                    }
                }
                else if (products[r2].equals("Chair")){
                    if(chair.getChairWare().pop()!=null){
                        System.out.println("Customer buying Chair, SUCCESS, Customer bought Chair ");
                    }else{
                        System.out.println("Customer buying Chair, FAIL, Chair warehouse is empty ");
                    }
                }
            }else{
                System.out.println("Check Random");
            }
        }
        System.out.println("REPORT:");
        System.out.println("Amount of Bed in Factory Line:"+" "+bed.getCount());
        System.out.println("Amount of Sofa in Factory Line:"+" "+sofa.getCount());
        System.out.println("Amount of  Bookcase  in Factory Line:"+" "+bookcase.getCount());
        System.out.println("Amount of  Dresser  in Factory Line:"+" "+dresser.getCount());
        System.out.println("Amount of  Table  in Factory Line:"+" "+table.getCount());
        System.out.println("Amount of  Chair  in Factory Line:"+" "+chair.getCount());
        System.out.println("/////////////////////////////////////////////////////////////////////");
        System.out.println("Amount of Bed in Bed Warehouse:"+" "+bed.getBedWare().getWcount());
        System.out.println("Amount of Sofa in Sofa Warehouse:"+" "+sofa.getSofaWare().getWcount());
        System.out.println("Amount of Bookcase in Bookcase Warehouse:"+" "+bookcase.getBookcaseWare().getWcount());
        System.out.println("Amount of Dresser in Dresser Warehouse:"+" "+dresser.getDresserWare().getWcount());
        System.out.println("Amount of Table in Table Warehouse:"+" "+table.getTableWare().getWcount());
        System.out.println("Amount of Chair in Table Warehouse:"+" "+chair.getChairWare().getWcount());
        System.out.println("/////////////////////////////////////////////////////////////////////");
        System.out.println("Amount of Bed Sold:"+" "+bed.getBedWare().getCusCount());
        System.out.println("Amount of Sofa Sold:"+" "+sofa.getSofaWare().getCusCount());
        System.out.println("Amount of Bookcase Sold:"+" "+bookcase.getBookcaseWare().getCusCount());
        System.out.println("Amount of Dresser Sold:"+" "+dresser.getDresserWare().getCusCount());
        System.out.println("Amount of Table Sold:"+" "+table.getTableWare().getCusCount());
        System.out.println("Amount of Chair Sold:"+" "+chair.getChairWare().getCusCount());
    }
}
