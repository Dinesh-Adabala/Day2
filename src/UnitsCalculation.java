public class UnitsCalculation {
    public static void main(String []args){
        PowerBillDetails Dinesh = new PowerBillDetails("Dinesh","5-96,mainroad,Amalapuram",1419789,66789,78567);
        PowerBillDetails Tarun = new  PowerBillDetails("Tarun","7-96,main road,Amalapuram",457892,63456,65789);
        PowerBillDetails Meher = new PowerBillDetails("Meher","6-89,main road,Amalapuram",12345,73654,89567);
        Dinesh.calculation();
        Tarun.calculation();
        Meher.calculation();
    }
    }



