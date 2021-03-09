package model;
class Rep {
    private int repId;
    private String location;

    public void setRepId(int repId){
        this.repId=repId;
    }

    public void setLocation(String location){
        this.location=location;
    }

    public String getLocation(){
        return location;
    }

    public int getRepID(){
        return repId;
    }
}
