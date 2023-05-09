public class Singer extends Person{
    private String bandName;
    public Singer (String name,String designation, String bandName){
        super(name,designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    void singing(){
        System.out.println(getName()+" has a perfect voice");
    }
    void playingGuitar(){
        System.out.println(bandName+" has a group for beginner guitar players");
    }

    @Override
    public String toString() {
        return "Singer- " +
                " name: " + getName() + '\'' +
                " designation: " + getDesignation() + '\'' +
                " bandName: " + bandName + '\'' ;

    }
}
