package pack1;

public class Model {
    //模特类的属性
    double height;
    double weight;
    int age;
    String style;
    String name;

    public Model(double height, double weight, int age, String style, String name) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.style = style;
        this.name = name;
        System.out.println("模特"+name+"的身高是"+height+",体重是"+weight+",年龄是"+age+",风格是"+style);
    }

    //模特类方法
    public void adjustAction(){
        System.out.println("模特正在调整动作");
    }

    public void changeOutfit(){
        System.out.println("模特正在更改造型");
    }

    public void feedback(String pname,int n,Photo photo){
        this.name=name;
        if(n==0)//n=0表示模特不满意照片
            System.out.println("模特"+name+"不满意"+photo.photoName);
        else if(n==1)//模特满意照片
            System.out.println("模特"+name+"满意"+photo.photoName);
        else
            System.out.println("输入无效");
    }

    public void modelFile(){
        System.out.println("模特"+name+"的身高是"+height+",体重是"+weight+",年龄是"+age+",风格是"+style);
    }
}
