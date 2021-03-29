package model;
public class Hospital {
    private int hospitalId;
    private String hospitalName;
    private String location;

    public void setHospitalId(int hospitalId){
        this.hospitalId=hospitalId;
    }

    public void setHospitalName(String hospitalName){
        this.hospitalName=hospitalName;
    }

    public void setLocation(String location){
        this.location=location;
    }

    public String getLocation(){
        return location;
    }

    public String getHospitalName(){
        return hospitalName;
    }

    public int getHospitalId(){
        return hospitalId;
    }
}
