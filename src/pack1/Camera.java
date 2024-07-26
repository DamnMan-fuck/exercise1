package pack1;

public abstract class Camera {//抽象类
    //相机类属性
    String brand;
    String model;
    String shootMode;
    private double exposureType;
    int power;
    int ISO;
    double aperture;
    String shutter;

    public Camera(String model, String brand, String shootMode) {
        this.model = model;
        this.brand = brand;
        this.shootMode = shootMode;

    }

    //相机类方法
    public void takePicture(){
        //拍摄照片
        System.out.println("相机正在拍摄照片");
    }

    public void adjustExposure(double exposureType){
        //调整曝光参数
        this.exposureType=exposureType;
    }

    public void switchMode(String shootMode){
        //切换拍摄模式
        this.shootMode=shootMode;
    }

    //创建抽象方法
    public abstract void shootingMethod();

    public void setPower(int power){
        this.power=power;
    }

    public int getPower(){
        return power;
    }

    public void parameterSet(int ISO, double aperture, String shutter){
        this.ISO = ISO;
        this.aperture = aperture;
        this.shutter = shutter;
        System.out.println("相机参数分别是：ISO："+ISO+",光圈："+aperture+",快门："+shutter);
    }
}
