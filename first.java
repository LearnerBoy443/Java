class Box{
    double height;
    double width;
    double length;
    void box_square(double sides){
         height =  width =  length =  sides;
    }
    void box(double length,double height,double width){
        this.length = length;
        this.height = height;
        this.width = width;
    }
    double volume(){
        double volume=length*height*width;      
        System.out.println("Volume of the box is"+ volume);
        return volume;    
    }
}
class Main{
    public static void main(String[] args) {
        Box box = new Box();
        box.box(10,20,40);
        box.box_square(20);
        box.volume();
    }
}