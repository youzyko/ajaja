public class Reservation  {
    //필드
    String [][] seat; //자리
    String seatNum;
    int reservationSeatNum;
    Movie movie;

    public Reservation(){
        super();  //object클래스의 기본 생성자를 호출
        movie = new Movie("어바웃타임", 90, "로맨스", "라이언", 15);
        seat=new String[3][5];
        reservationSeatNum=1000;
    }


    public Movie todayshow(){
        return movie;
    }

    public String SeatCheck(String seat,int j){
        if(seat==null){
            return j+"[===]";
        }else {
            return j+"[XXX]";
        }
    }




    //메서드



}
