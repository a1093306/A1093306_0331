public class Animal {
    public String name;
    public double height;
    public int weight;
    public int rate;
    Animal(String name, double height, int weight, int rate){
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.rate=rate;
    }
    void show(){
        System.out.printf("%s:%s , %s:%.1f , %s:%d , %s:%d%n","姓名",this.name,"身高(公尺)",this.height,"體重(公斤)",this.weight,"速度(公尺/分鐘)",this.rate);
    }
    double distance(int x,double y){
        double dis=x*y*this.rate;
        return dis;
    }
    int distance(int x){
        int dis=x*this.rate;
        return dis;
    }
    public static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}
