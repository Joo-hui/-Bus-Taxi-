public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus(1, 100, 0, 4, 0, "일반", 1000);
        Bus bus2 = new Bus(2, 100, 0, 4, 0, "일반", 1000);

        if (bus1.number != bus2.number) {
            System.out.println("번호가 다름");
        }

        bus1.addPerson(2);

        bus1.oilcheck(-50);
        bus1.conChange();
        bus1.oilcheck(10);
        System.out.println(bus1.con + "중");
        bus1.addPerson(45);
        bus1.addPerson(5);
        bus1.oilcheck(-55);
        bus1.conChange();
        if(bus1.oil <= 5) {
            System.out.println("주유 필요");
            System.out.println("**************************************");
        }

        Taxi taxi1 = new Taxi(1234, 100, 0, 4,3000, 1000, 0);
        Taxi taxi2 = new Taxi(4321, 100, 0, 4,3000, 1000, 0);

        if(taxi1.number != taxi2.number){
            System.out.println("번호가 다름");
        }
        System.out.println(taxi1.oil);
        taxi1.conChange();
        taxi1.addPerson(2);
        System.out.println("기본 요금 확인 : " + taxi1.basicfee);
        taxi1.station("서울역");
        taxi1.distance(2);
        System.out.println("상태 : " + "운행중");
        taxi1.oilcheck(-80);
        taxi1.addPerson(5);
        taxi1.addPerson(3);
        System.out.println("기본 요금 확인 : " + taxi1.basicfee);
        taxi1.station("구로디지털단지역");
        taxi1.distance(12);
        taxi1.oilcheck(-20);
        if(taxi1.oil == 0) {
            System.out.println("상태 : " + "운행불가");
        }
        taxi1.price();
        taxi1.setFee();




    }
}
