public class Movie {
    //필드
    String moviename; //영화제목
    int runtime; //상영시간
    String genre; //장르
    String director; //감독
    int audience; //
    //생성자

    public Movie(String moviename,int runtime,String genre,String director,int audience){
        super(); //기본생성자 호출
        this.moviename=moviename;
        this.runtime=runtime;
        this.genre=genre;
        this.director=director;
        this.audience=audience;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    public int getAudience() {
        return audience;
    }

    public void setAudience(int audience) {
        this.audience = audience;
    }
//메서드
    @Override
    public String toString(){
        return moviename+"\t\t"+runtime+"분\t\t"+genre+"\t\t"+director+"\t\t"+" "+audience+"명";
    }


}
