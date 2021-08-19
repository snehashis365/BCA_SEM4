class Box{
    int width;
    int length;
    Box(int w, int l){
        width = w;
        length = l;
    }
    int area(){
        return width * length;
    }
}

public class Boxsub extends Box{
    int height;
    public Boxsub(int w, int l, int h){
        super(w, l);
        height = h;
    }
    public int volume(){
        return super.area() * height;
    }
    public static void main(String[] args){
        Boxsub box = new Boxsub(2,3,4);
        System.out.println("Area: " + box.area());
        System.out.println("Volume: " + box.volume());
    }
}