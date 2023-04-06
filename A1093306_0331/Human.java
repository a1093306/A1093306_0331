public class Human extends Animal{
    public String gender;
    Human(String name, double height, int weight, int rate, String gender){
        super(name,height,weight,rate);
        this.gender=gender;
    }
    void show(){
        System.out.printf("%s:%s , %s:%.1f , %s:%d , %s:%d , %s:%s%n","姓名",this.name,"身高(公尺)",this.height,"體重(公斤)",this.weight,"速度(公尺/分鐘)",this.rate,"性別",this.gender);
    }
}
