import src.Overload;

abstract class Product {
    public String getpID() {
        return pID;
    }

    public void setpID(String pId) {
        this.pID = pID;
    }

    private String pID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    public void setProductDetails(String pID,String Name,double Price){
        setpID(pID);
        setName(Name);
        setPrice(Price);

    }

    public void printProductDeatils(){
        System.out.println("Product ID: "+getpID());
        System.out.println("Name: "+getName());
        System.out.println("Price: "+getPrice()+"/=");
    }


   // public abstract void setProductDetails(String pID, String Name, double Price, String brand, String technology);

    //public abstract void setProductDetails(String pID, String Name, double Price, int ram, String os, int sdCard);
}

class LedTv extends Product{
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String brand;

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    private String technology;

    @Overload
    public void setProductDetails(String pID, String Name, double Price,String brand,String technology) {
        super.setProductDetails(pID, Name, Price);
        setBrand(brand);
        setTechnology(technology);
    }



    @Override
    public void printProductDeatils() {
        super.printProductDeatils();
        System.out.println("Brand: "+getBrand());
        System.out.println("Technology: "+getTechnology());
    }
}

class MobilePhone extends Product{
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    private int ram;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    private String os;

    public int getSdCard() {
        return sdCard;
    }

    public void setSdCard(int sdCard) {
        this.sdCard = sdCard;
    }

    private int sdCard;



    @Overload
    public void setProductDetails(String pID,String Name, double Price, int ram, String os, int sdCard) {
        super.setProductDetails(pID, Name, Price);
        setRam(ram);
        setOs(os);
        setSdCard(sdCard);
    }

    @Override
    public void printProductDeatils() {
        super.printProductDeatils();
        System.out.println("Ram: "+getRam());
        System.out.println("Os: "+getOs());
        System.out.println("SD Card: "+getSdCard());
    }

}

public class OnlineShop {
    public static void main(String[] args){
        LedTv obj1=new LedTv();
        MobilePhone obj2=new MobilePhone();

        obj1.setProductDetails("0001","Samsung QN 85 A",150000,"Samsung","LED");
        obj1.printProductDeatils();
        System.out.println("......................................................................................");
        obj2.setProductDetails("0002","Huawei nova 9 SE",120000,8,"android",16);
        obj2.printProductDeatils();
    }
}




