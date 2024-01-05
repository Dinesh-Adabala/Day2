public class PowerBillDetails {
   private String ownerName ;
    private String address ;
    private int uscNo;
    private int previousUnits;
    private int presentUnits;
    private int totalUnitsCharged;
    private double costOfUnit = 9.86;
   private   double totalBillAmount;
   public PowerBillDetails(String ownerName, String address, int uscNo, int previousUnits, int presentUnits){
            this.ownerName=ownerName;
            this.address=address;
            this.uscNo=uscNo;
            this.previousUnits=previousUnits;
            this.presentUnits=presentUnits;
            //this.totalUnitsCharged=totalUnitsCharged;
            //this.totalBillAmount=totalBillAmount;
    }

   public double calculation(){
        totalUnitsCharged=presentUnits-previousUnits;
        totalBillAmount=costOfUnit*totalUnitsCharged;
       System.out.println("Owner Name  :"+ownerName+"  Address  :"+address+"  USC Number  :"+uscNo+"  Previous Units  :"+previousUnits+"  Present Units   :"+presentUnits+"  Total Units Charged  :"+totalUnitsCharged+" Total Amount To Pay  "+totalBillAmount);
        return totalBillAmount;
    }
}
