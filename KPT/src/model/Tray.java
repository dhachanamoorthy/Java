package model;
class Tray {
    private int trayId;
    private int chargesPerDay;
    private int repId;

    public void setTrayId(int trayId){
        this.trayId=trayId;
    }

    public void setChargesPerDay(int chargesPerDay){
        this.chargesPerDay=chargesPerDay;
    }

    public void setRepId(int trayId){
        this.trayId=trayId;
    }

    public int getTrayID(){
        return trayId;
    }

    public int getChargesPerDay(){
        return chargesPerDay;
    }

    public int getRepID(){
        return repId;
    } 
}
