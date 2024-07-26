package pack1;

public class NikonPhotographer extends Photographer implements editPhoto{
    //摄影师类的子类（尼康摄影师类），并且连接接口editPhoto
    public NikonPhotographer(String name,String useCamera,int age,String style,int workingTime){
        super(name,useCamera,age,style,workingTime);//super继承父类的属性
        System.out.println("尼康摄影师的名字是"+name+",使用的相机型号是"+useCamera+",年龄是"+age+",风格是"+style+",工作年限是"+workingTime);
    }



    public void setScene1(Scene sceneA){
        //摄影师创建场景对象，后续可以通过创建摄影师对象来确定场景选择，并且应场景对象调用，可实现对场景背景选择
        System.out.println("选择场景类型是"+sceneA.getScene()+",背景是"+sceneA.getBackground());
    }
}
