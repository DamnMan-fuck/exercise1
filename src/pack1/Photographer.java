package pack1;

/**
 * /**
 *  *
 *  * 题目背景扩展：
 *  * 小a和小b是专业摄影师，分别使用尼康和佳能相机。小c是模特。每位摄影师可以为模特拍摄照片，并且可以对照片进行后期处理。
 *  *
 *  * 每个摄影师都有自己的摄影风格，并且会根据不同的场景选择不同的拍摄模式（如人像模式、风景模式等）。模特也有自己的风格和需求，需要与摄影师进行沟通以达到最佳拍摄效果。
 *  *
 *  * 要求：
 *  * 类和对象：定义摄影师、模特、相机、照片、场景等类。每个类应包含相应的属性和方法。
 *  * 继承：定义一个基类Camera，并派生出NikonCamera和CanonCamera两个子类。
 *  * 多态：每个相机类应有一个拍摄方法，具体实现由子类定义，并在摄影师类中调用此方法。
 *  * 封装：保护相机类的某些属性不被直接访问。
 *  * 抽象类和接口：定义一个抽象类Photographer，并派生出NikonPhotographer和CanonPhotographer两个具体类。使用接口定义后期处理功能。
 *  * 组合：摄影师类中应包含一个相机对象，并通过组合的方式实现。
 *  * 异常处理：在拍摄过程中添加异常处理，处理可能出现的错误，例如相机没电等。
 *  * 类的关系图：画出类的关系图，展示类之间的继承、实现和组合关系。
 *  * 相机设置：每个相机应有不同的设置（如ISO、光圈、快门速度等），并在拍摄前进行配置。
 *  * 多场景拍摄：每个摄影师可以选择不同的场景进行拍摄，每个场景有不同的光照条件和背景。
 *  * 后期处理效果：定义不同的后期处理效果（如黑白、复古、锐化等），并让摄影师选择和应用。
 *  * 模特反馈：模特可以对照片提出反馈，并根据反馈进行再拍摄。
 *  * 摄影比赛：摄影师可以参加比赛，根据照片质量评分。
 *  * 扩展要求：
 *  * 照片评分：为每张照片定义一个评分系统，根据光照、构图、模特姿势等因素进行评分。
 *  * 拍摄计划：摄影师可以制定拍摄计划，包括拍摄时间、地点、模特、拍摄风格等。
 *  * 模特档案：定义模特的档案，包括姓名、年龄、身高、风格等。
 *  * 动态光照：场景中的光照条件可以随时间变化。
 *  * 摄影团队：定义一个摄影团队，团队中可以包含多个摄影师和模特。
 *  * 拍摄历史：记录每次拍摄的历史，包括拍摄时间、地点、参数、照片等。
 *  */

public abstract class Photographer {
    //抽象类：摄影师类
    // 创建摄影师类的属性
    String name;
    String useCamera;
    int age;
    String style;
    int workingTime;
    private  Scene scene;
    private Photo photo;
    private Photo photo1;


    public Photographer(String name,String useCamera,int age,String style,int workingTime){
        //摄影师类的构造方法
        this.name=name;
        this.age=age;
        this.style=style;
        this.useCamera=useCamera;
        this.workingTime=workingTime;
    }

    public void takePhoto(Camera c2){
        //拍摄方法，创建一个相机类对象，调用电量方法规避没电情况
        c2.setPower(60);
        c2.getPower();
        if(c2.getPower()<=0)
            System.out.println("电量过低不能拍摄");
        else
            System.out.println("摄影师正在拍摄照片");
    }

    public void editPhoto(Photo ph1,String name,int m){
        //接口方法实现照片后期处理，有三种处理效果
        switch (m){
            case 0:
                System.out.println(name+"给照片添加复古滤镜");
                break;
            case 1:
                System.out.println(name+"给照片添加黑白滤镜");
                break;
            case 2:
                System.out.println(name+"给照片添加锐化效果");
                break;
        }
    }

    public void printPhoto(){
        //打印方法
        System.out.println("摄影师正在打印照片");
    }

    public void capture(Camera c1){
        //摄影师调用相机对象c1的拍摄方法
        c1.shootingMethod();
    }

    public void jionMatch(String photoName){
        /*
        给定照片质量等级，给与评分
        if(mass>=1&&mass<=5)
            switch (mass){
                case 1:
                    System.out.println(photoName+"的质量是1,照片的评分是20");
                    break;
                case 2:
                    System.out.println(photoName+"的质量是2,照片的评分是40");
                    break;
                case 3:
                    System.out.println(photoName+"的质量是3,照片的评分是60");
                    break;
                case 4:
                    System.out.println(photoName+"的质量是4,照片的评分是80");
                    break;
                case 5:
                    System.out.println(photoName+"的质量是5,照片的评分是100");
                    break;
         */
        System.out.println(photoName+"参加比赛");
    }

    public void shootingPlan(String time,String place,Model model,String style){
        //拍照计划
        System.out.println("摄影计划的时间是"+time+",地点是"+place+",模特是"+model.name+",风格是"+style);
    }

    public void shootingHistory(Photo photo){
        //拍照历史，某张照片被拍时候的信息
        System.out.println("拍摄时间是"+photo.time+",地点是"+photo.place+",ISO是"+photo.ISO+",光圈是"+photo.aperture+",快门是"+photo.shutter+",照片是"+photo.photoName);
    }
}
