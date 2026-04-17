class Flowerrose1{
    void show()
    {
        System.out.println("I am Red rose");
    }
}
class Flowerrose2 extends Flowerrose1 {
    void show()
    {
        System.out.println("I am Yellow rose");
    }
}

class Flowerrose3 extends Flowerrose2{
    void show()
    {
        System.out.println("I am Pink rose");
    }
}





public class Flower
{
    public static void main(String[] args) {
        Flowerrose3 f1= new Flowerrose3();
        f1.show();
    }
}
