package model;
class Hospital {
    private int hospitalId;
    private String location;

    public void setHospitalId(int hospitalId){
        this.hospitalId=hospitalId;
    }

    public void setLocation(String location){
        this.location=location;
    }

    public String getLocation(){
        return location;
    }

    public int getHospitalId(){
        return hospitalId;
    }
}
