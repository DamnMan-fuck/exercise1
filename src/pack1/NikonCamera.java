package pack1;

public class NikonCamera extends Camera{
    //抽象类Camera的子类（尼康相机类）
    private String method;//私有属性method

    public NikonCamera(String model, String brand, String shootMode) {
        //尼康相机构造方法
        super(model, brand, shootMode);//继承父类相机类的属性
        System.out.println("相机是"+brand+"，模特是"+model+",拍摄模式是"+shootMode);
    }

    //相机类方法

    //子类实现抽象类的抽象方法
    public void shootingMethod(){
        this.method=method;
    }

}
