package secondTASK;

import java.sql.SQLOutput;
import java.util.stream.IntStream;

public class SecondTask {
    public static void main(String[] args) {
        MyFunctionalInterfac2 command1 = (a) -> System.out.println("command1 receive String ="+a);

        String string1 = "for command1";
        command1.mymethod(string1);


        String string = "for command2";
        MyFunctionalInterfac2 command2 = SecondTask::myfunction;
        command2.mymethod(string);

        //anon
        String string3 = "for command3";
        MyFunctionalInterfac2 command3 = new MyFunctionalInterfac2() {
            @Override
            public void mymethod(String string) {
                System.out.println("hello from"+string);
            }
        };
        command3.mymethod(string3);


        String string4 = "for command4";
        MyFunctionalInterfac2 command4 = new Customer();
        command4.mymethod(string4);







    }

    static void myfunction(String a){
         System.out.println("command1 receive String ="+a);
    }

}
