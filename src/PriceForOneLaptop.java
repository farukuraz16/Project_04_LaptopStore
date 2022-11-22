import java.util.ArrayList;

public class PriceForOneLaptop {


    public int getPrice(int laptopID){
        Data pcPrice = new Data();

        ArrayList<String> pc = pcPrice.AllData(laptopID);//burası bize bir arraylist call edeceği için pc adında bir array list olşutruduk.

        int totalAmount=Calculation.getSize(pc)+Calculation.getRam(pc)+Calculation.getCPU(pc)+Calculation.getColor(pc);



        return totalAmount;
    }
}
