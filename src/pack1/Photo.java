package pack1;

public class Photo {
    //照片类的属性
    int ISO;
    double aperture;
    String shutter;
    int focal;
    double memory;
    String theme;
    String format;
    String imageFile;
    String time;
    String photographer;
    String photoName;
    String place;

    public Photo(String photoName,int ISO, double aperture, String shutter, int focal, double memory, String theme, String format, String imageFile, String time, String photographer,String place) {
        this.photoName=photoName;
        this.ISO = ISO;
        this.aperture = aperture;
        this.shutter = shutter;
        this.focal = focal;
        this.memory = memory;
        this.theme = theme;
        this.format = format;
        this.imageFile = imageFile;
        this.time = time;
        this.photographer = photographer;
        this.place=place;
        System.out.println("摄影师"+photographer+"在"+place+"拍摄的照片是"+photoName+",ISO是"+ISO+",光圈是"+aperture+",快门是"+shutter+",焦距是"+focal+",内存是"+memory+",主题是"+theme+",格式是"+format+",存的文件是"+imageFile+",拍摄日期是"+time);
    }

    public void display(int ISO,double aperture, String shutter, int focal, double memory, String theme, String format){
    //展示照片
        this.ISO = ISO;
        this.aperture = aperture;
        this.shutter = shutter;
        this.focal = focal;
        this.memory = memory;
        this.theme = theme;
        this.format = format;
    }

    public void share(String theme,String time, String photographer){
        //分享照片
        this.theme = theme;
        this.time = time;
        this.photographer = photographer;
    }

    public void save(String format,double memory,String imageFile){
        //保存照片
        this.memory=memory;
        this.imageFile = imageFile;
        this.format = format;
    }

    public void markSystem(int light,int composition,int action){
        //评分系统，三项都是0--100分，构图占40%，光照和动作分别占30%，最后取总分为评分
        double mark;
        mark=light*0.3+composition*0.4+action*0.3;
        System.out.println(photoName+"的评分是："+mark);
    }
}
