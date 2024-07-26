package pack1;

public class photographerTeam {
    public static void main(String[] args){
        //创建一个尼康相机对象，一个佳能相机对象，用尼康相机设置传输并且进行拍照
        NikonCamera NcameraA=new NikonCamera("小c","Z30","自动");
        CanonCamera CcameraA=new CanonCamera("小c","60d","手动");
        NcameraA.parameterSet(100,2.8,"1/200");
        NcameraA.takePicture();
        System.out.println(" ");

        //创建一个尼康摄影师对象，一个佳能摄影师对象，两个场景对象
        // 尼康摄影师选择场景A，场景A的光照条件是中午12点的光照
        //佳能摄影师选择场景B，场景B的光照条件是下午16点的光照
        NikonPhotographer NP1=new NikonPhotographer("小a","Z30",26,"气质美学",5);
        CanonPhotographer CP1=new CanonPhotographer("小b","60d",20,"生活人像",2);
        Scene sceneA=new Scene("seaside","自然");
        Scene sceneB=new Scene("forest","纹理");
        NP1.setScene1(sceneA);
        sceneA.Lighting(12);
        CP1.setScene1(sceneB);
        sceneB.Lighting(16);
        System.out.println(" ");

        //尼康摄影师和佳能摄影师分别用相机拍照
        //创建两个照片对象，两个摄影师分别对照片进行后期处理
        NP1.takePhoto(NcameraA);
        CP1.takePhoto(CcameraA);
        Photo ph1=new Photo("照片1",100,2.8,"1/100",18,4,"私房","jpg","私房","2024.5.4","小a","花果园");
        Photo ph2=new Photo("照片2",300,5.6,"1/500",200,6,"动漫cos","jpg","漫展","2024.6.4","小b","万达广场");
        NP1.editPhoto(ph1,"小a",1);//m={0，1，2}，0代表复古，1代表黑白，2代表锐化
        CP1.editPhoto(ph2,"小b",2);
        System.out.println(" ");

        //创建一个模特对象小c，模特对两个照片的反馈，不满意的照片重新拍摄
        Model md1=new Model(170,90,24,"清纯","小c");
        md1.feedback("小b",1,ph2);
        md1.feedback("小a",0,ph1);
        NP1.takePhoto(NcameraA);
        Photo ph3=new Photo("照片3",100,2.8,"1/100",18,4,"私房","jpg","私房","2024.5.4","小a","花果园");
        NP1.editPhoto(ph3,"小a",0);
        md1.feedback("小a",1,ph3);
        System.out.println(" ");

        //两个摄影师拿照片去比赛，以光照条件，构图和模特动作三个标准来评判，得到评分
        NP1.jionMatch("照片1");
        ph1.markSystem(70,70,80);
        NP1.jionMatch("照片3");
        ph1.markSystem(60,70,90);
        CP1.jionMatch("照片2");
        ph1.markSystem(80,100,80);
        System.out.println(" ");

        //尼康摄影师制定拍摄计划，时间，地点，模特，风格
        NP1.shootingPlan("12.30","万达广场",md1,"日系");
        System.out.println(" ");

        //模特档案
        md1.modelFile();
        System.out.println(" ");

        //拍摄历史
        NP1.shootingHistory(ph1);
        System.out.println(" ");
    }
}
