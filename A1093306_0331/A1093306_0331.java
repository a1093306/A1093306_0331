import java.util.*;
public class A1093306_0331 {
    public static void main(String[] args) {
        Animal.showinfo();
        Animal a=new Animal("雪寶", 1.1 , 52 , 100);
        Animal b=new Animal("驢子", 1.5 , 99 , 200);
        Human c=new Human("阿克", 1.9 , 80 , 150 , "男");
        Human d=new Human("漢斯", 1.8 , 78 , 130 , "男");
        Human e=new Human("安那", 1.7 , 48 , 120 , "女");
        Snow f=new Snow("愛沙", 1.7 , 50 , 120 , "女" , "Yes");
        a.show();
        b.show();
        c.show();
        d.show();
        e.show();
        f.show();
        System.out.println();
        Scanner input=new Scanner(System.in);
        int time;
        double acceleration;
        
        //a
        do{
            System.out.printf("請輸入%s奔跑時間(分鐘):",a.name);
            time=Math.round(input.nextFloat());
        }while(time<=0);
        do{
            System.out.printf("請輸入%s奔跑加速度:",a.name);
            acceleration=input.nextDouble();
        }while(acceleration<0);
        if(acceleration==0){
        System.out.printf("%s的奔跑距離為:%d公尺%n",a.name,a.distance(time));
        }else{
        System.out.printf("%s的奔跑距離為:%.2f公尺%n",a.name,a.distance(time,acceleration));
        }
        System.out.println("-".repeat(30));

        //b
        do{
            System.out.printf("請輸入%s奔跑時間(分鐘):",b.name);
            time=Math.round(input.nextFloat());
        }while(time<=0);
        do{
            System.out.printf("請輸入%s奔跑加速度:",b.name);
            acceleration=input.nextDouble();
        }while(acceleration<0);
        if(acceleration==0){
        System.out.printf("%s的奔跑距離為:%d公尺%n",b.name,b.distance(time));
        }else{
        System.out.printf("%s的奔跑距離為:%.2f公尺%n",b.name,b.distance(time,acceleration));
        }
        System.out.println("-".repeat(30));

        //c
        do{
            System.out.printf("請輸入%s奔跑時間(分鐘):",c.name);
            time=Math.round(input.nextFloat());
        }while(time<=0);
        do{
            System.out.printf("請輸入%s奔跑加速度:",c.name);
            acceleration=input.nextDouble();
        }while(acceleration<0);
        if(acceleration==0){
        System.out.printf("%s的奔跑距離為:%d公尺%n",c.name,c.distance(time));
        }else{
        System.out.printf("%s的奔跑距離為:%.2f公尺%n",c.name,c.distance(time,acceleration));
        }
        System.out.println("-".repeat(30));

        //d
        do{
            System.out.printf("請輸入%s奔跑時間(分鐘):",d.name);
            time=Math.round(input.nextFloat());
        }while(time<=0);
        do{
            System.out.printf("請輸入%s奔跑加速度:",d.name);
            acceleration=input.nextDouble();
        }while(acceleration<0);
        if(acceleration==0){
        System.out.printf("%s的奔跑距離為:%d公尺%n",d.name,d.distance(time));
        }else{
        System.out.printf("%s的奔跑距離為:%.2f公尺%n",d.name,d.distance(time,acceleration));
        }
        System.out.println("-".repeat(30));
        
        //e
        do{
            System.out.printf("請輸入%s奔跑時間(分鐘):",e.name);
            time=Math.round(input.nextFloat());
        }while(time<=0);
        do{
            System.out.printf("請輸入%s奔跑加速度:",e.name);
            acceleration=input.nextDouble();
        }while(acceleration<0);
        if(acceleration==0){
        System.out.printf("%s的奔跑距離為:%d公尺%n",e.name,e.distance(time));
        }else{
        System.out.printf("%s的奔跑距離為:%.2f公尺%n",e.name,e.distance(time,acceleration));
        }
        System.out.println("-".repeat(30));

        //f
        do{
            System.out.printf("請輸入%s奔跑時間(分鐘):",f.name);
            time=Math.round(input.nextFloat());
        }while(time<=0);
        do{
            System.out.printf("請輸入%s奔跑加速度:",f.name);
            acceleration=input.nextDouble();
        }while(acceleration<0);
        if(acceleration==0){
        System.out.printf("%s的奔跑距離為:%d公尺%n",f.name,f.distance(time));
        }else{
        System.out.printf("%s的奔跑距離為:%.2f公尺%n",f.name,f.distance(time,acceleration));
        }
        System.out.println("-".repeat(30));
    }
    
}
