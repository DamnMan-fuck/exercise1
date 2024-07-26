package pack1;

public class Scene {
    //场景类的属性
    String type;
    String background;

    public Scene(String type, String background) {
        this.type=type;
        this.background = background;
    }

    //场景类的方法
    public String getScene(){
        return type;
    }

    public void Lighting(int time){
        //得到光照参数
        if(time>=6&&time<=18){
            switch (time){
                case 6:
                case 7:
                case 8:
                    System.out.println(time+"点"+getScene()+"的光照条件是60");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(time+"点"+getScene()+"的光照条件是100");
                    break;
                case 12:
                case 13:
                case 14:
                    System.out.println(time+"点"+getScene()+"的光照条件是80");
                    break;
                case 15:
                case 16:
                case 17:
                case 18:
                    System.out.println(time+"点"+getScene()+"的光照条件是40");
                    break;

            }
        }
    }

    public String getBackground(){
        //设置背景
        return background;
    }
}
