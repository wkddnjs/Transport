public class Transport {
    int trans_Num ;
    int fuelStatus = 100;
    int velocity =0;
    int chagedVelocity;
    int nowPassengers;
    int maxPassengers;

    public void startTransport(){

        System.out.println("운행을 시작합니다.");

    }

    public int changeVelocity( int change) {

        this.chagedVelocity = change;

        return this.chagedVelocity;

   }

   public String statusChange(String statusChange){


       return this.statusChange(statusChange);

   }

   public int addPassenger(int addPassenger){


       return this.nowPassengers += addPassenger;


   }





}
