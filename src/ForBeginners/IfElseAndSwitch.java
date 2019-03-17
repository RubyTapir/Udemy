package ForBeginners;

public class IfElseAndSwitch {
    public static void main(String[] args) {
        int i = 4;
        if (i>10) {
            System.out.println("i больше пяти");
        }
        else if (i<10 && i>5){
            System.out.println("i такое-то сякое-то");
        }
        else {
            System.out.println("Всё хорошо!");
        }

        int b = 95;
        if (b>50) {
            System.out.println("i>50");
            if (i>90) {
                System.out.println("i>90");
            }
            else {
                System.out.println("i<=90");  //вложенные условия, ветвящиеся
            }
        }
        else {
            System.out.println("i<=50");
        }

        int c = 3;
        switch (c) {
            case 1:
                System.out.println("Number 1");
                break;
            case 2:
                System.out.println("Number 2");    //оператор switch
                break;
            case 3:
                System.out.println("Mumber-umber");
                break;
            default:
                System.out.println("I'm poor old nigga...");
        }
    }
}
