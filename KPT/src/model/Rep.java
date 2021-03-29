package model;
public class Rep {
    private int repId;
    private String repName;
    private String location;

    public void setRepId(int repId){
        this.repId=repId;
    }

    public void setRepName(String repName){
        this.repName=repName;
    }

    public void setLocation(String location){
        this.location=location;
    }

    public int getRepId(){
        return repId;
    }

    public String getRepName(){
        return repName;
    }

    public String getLocation(){
        return location;
    }
}
