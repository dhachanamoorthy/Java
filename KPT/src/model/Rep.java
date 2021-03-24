package model;
public class Rep {
    private int repId;
    private String location;

    public void setRepId(int repId){
        this.repId=repId;
    }

    public void setRepName(String name){
        this.repName=repName;
    }

    public void setLocation(String location){
        this.location=location;
    }

    public int getRepID(){
        return repId;
    }

    public String getRepName(){
        return repName;
    }

    public String getLocation(){
        return location;
    }
}
