package model;
public class Tray {
    private int trayId;
    private int chargesPerDay;
    private int repId;

    public void setTrayId(int trayId){
        this.trayId=trayId;
    }

    public void setChargesPerDay(int chargesPerDay){
        this.chargesPerDay=chargesPerDay;
    }

    public void setRepId(int repId){
        this.repId=repId;
    }

    public int getTrayId(){
        return trayId;
    }

    public int getChargesPerDay(){
        return chargesPerDay;
    }

    public int getRepId(){
        return repId;
    } 
}
