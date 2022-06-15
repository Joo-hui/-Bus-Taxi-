public class Taxi extends Car implements AddPerson, ConChange, oilcheck, Station, Fee, Distance{
    int basicfee;    //기본요금
    int addfee;     // 추가 요금
    int price;


    public Taxi(int number, int oil, int spd, int maxPerson, int basicfee, int addfee, int price) {
        super(number, oil, spd, maxPerson);
        this.basicfee = basicfee;
        this.addfee = addfee;
        this.price = price;
    }

    @Override
    public void addPerson(int p) {


        if(p >=5 ){
            System.out.println("최대 승객 수 초과");
        } else {
            System.out.println("탑승 승객 수 : " + p);
            System.out.println("잔여 승객 수 : " + (maxPerson - p));
        }


    }

    @Override
    public void conChange() {
        System.out.println("상태 : " + "일반");
    }

    @Override
    public void oilcheck(int y) {
        oil = oil + y;
        if(oil <= 0) {
            System.out.println("주유필요");
        }else {
            System.out.println("주유량 : " + oil);
        }

        System.out.println("주유량 : " + oil);

    }

    @Override
    public void station(String s) {
        System.out.println("목적지 : " + s);


    }
    @Override
    public void fee(int f) {
        System.out.println("지불할 요금 : " + f);
    }

    @Override
    public void distance(int d) {
        System.out.println("목적지까지 거리 : " + d +"km");
        int z = basicfee + ((d-1) * addfee);
        System.out.println("지불할 요금 :" + z);

        price += z;
    }
    public void price() {
        System.out.println("누적 요금 : " + price);

    }

    public void setFee(){
        System.out.println(basicfee);
    }
}
