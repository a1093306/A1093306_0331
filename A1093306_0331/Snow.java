public class Snow extends Human{
    public String skill;
    Snow(String name, double height, int weight, int rate, String gender,String skill){
        super(name,height,weight,rate,gender);
        this.skill=skill;
    }
    void show(){
        System.out.printf("%s:%s , %s:%.1f , %s:%d , %s:%d , %s:%s , %s:%s%n","姓名",this.name,"身高(公尺)",this.height,"體重(公斤)",this.weight,"速度(公尺/分鐘)",this.rate,"性別",this.gender,"冰凍技能",this.skill);
    }
    double distance(int x,double y){
        double dis=x*y*this.rate*2;
        return dis;
    }
    int distance(int x){
        int dis=x*this.rate*2;
        return dis;
    }
}
