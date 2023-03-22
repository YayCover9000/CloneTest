public class CloneTest {
    private String Movie;

    private int Aufenthaltsdauer;

    //Konstrucktor
    public CloneTest (String Movie, int Aufenthaltsdauer) {
        // this.Movie = Movie;
        // this.Aufenthaltsdauer = Aufenthaltsdauer;
        this.setMovie(Movie); //Setter Aufruf meistens besser
        this.setAufenthaltsdauer(Aufenthaltsdauer);

    }
    // Setter
    public void setMovie (String Movie) {
        this.Movie = Movie;
    }
    public void setAufenthaltsdauer (int Aufenthaltsdauer) {
        this.Aufenthaltsdauer = Aufenthaltsdauer;
    }
    //Getter
    public String getMovie () {
        return Movie;
    }
    public int getAufenthaltsdauer () {
        return Aufenthaltsdauer;
    }
    //CLone
    public Object clone () { // Betitelung wichtig
        CloneTest cloneWert;
        cloneWert = new CloneTest(this.Movie, this.Aufenthaltsdauer);
        return cloneWert;
    }
    //Modifiziert werte
    public void changeViewTime() {
        Aufenthaltsdauer += 1;
    }
    public void changeMovie() {
        Movie = "HotDog";
    }

}
