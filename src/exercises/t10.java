package exercises;

import java.util.ArrayList;
import java.util.List;
public class t10 {
    public static void main(String[] args){
        List list=new ArrayList();
        try {
            while(true) {
                list.add(new Object());
            }
        } catch (Exception e) {
            System.exit(0);
        }
    }
}
