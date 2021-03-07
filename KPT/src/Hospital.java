class Hospital {
    private int hospital_id;
    private String location;

    public void setHospitalId(int hospital_id){
        this.hospital_id=hospital_id;
    }

    public void setLocation(String location){
        this.location=location;
    }

    public String getLocation(){
        return location;
    }

    public int getHospitalID(){
        return hospital_id;
    }
}
