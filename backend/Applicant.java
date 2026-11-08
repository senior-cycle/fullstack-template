public class Applicant {
    String name;
    String ID;
    float fund;
    String use;
    float trueUse;
    void setData(String name,String ID,int fund){
        this.name = name;
        this.ID = ID;
        this.fund = fund;
    }
    //需要花费
    void setUse(String use){
        this.use = use;
    }
    //实际花费
    void setTrueUse(float trueUse){
        this.trueUse = trueUse;
    }
}
