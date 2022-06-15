public class Bus extends Car implements AddPerson, ConChange,oilcheck{
    int nowperson;
    String con;
    int charge;


    public Bus(int number, int oil, int spd, int maxPerson, int nowperson, String con, int charge) {
        super(number, oil, spd, maxPerson);
        this.nowperson = nowperson;
        this.con = con;
        this.charge = charge;
    }

    @Override
    public void addPerson(int p) {
        if(p > 30) {
            System.out.println("최대 승객 수 초과");
        }else {
            System.out.println("탑승 승객 수 : " + p);
            System.out.println("잔여 승객 수 : " + (maxPerson - p));
            System.out.println("요금확인 : " + (p * 1000));
        }
    }

    @Override
    public void conChange() {
        System.out.println("차고지행");
    }

    @Override
    public void oilcheck(int y) {
        oil = oil + y;
        System.out.println("주유량 : " + oil);

    }


}
