package Intermediate;

import static java.lang.System.exit;

public class IceCream extends DesertItem{

    public String Unit = "Rupees";
    public int unitConversion = 20;
    public int numberUnits = 0;


    public int getCost(int numberUnits) {
        System.out.println("The cost of a single unit is" +unitConversion);
        System.out.println("The cost for the " +numberUnits +"IceCream is: ");
        return numberUnits*unitConversion;
    }

    public void updateUnits(int units){
        numberUnits += units;
        System.out.println("The number of Units after updating is" + numberUnits);
    }

    public void orderUnits(int units){
        if(numberUnits == 0){
            System.out.println("The number of units is zero therefore no order can be taken");
            exit(0);
        }else{
            numberUnits -= units;
        }
    }

    public void getNumberOfItems(){
        System.out.println(numberUnits);
    }
}