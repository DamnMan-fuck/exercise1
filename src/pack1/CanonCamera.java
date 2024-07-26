package pack1;

public class CanonCamera extends Camera{//抽象类Camera的子类
    private String method;

    public CanonCamera(String model, String brand, String shootMode) {
        super(model, brand, shootMode);
    }

    //子类实现抽象类抽象方法
    public void shootingMethod(){
        this.method=method;
    }

    //相机类方法
}
