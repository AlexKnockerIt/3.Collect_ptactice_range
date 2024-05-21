import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Range> myList = new ArrayList<>();
        myList.add(new Range(1,5));
        myList.add(new Range(3,7));
        myList.add(new Range(8,10));
        myList.add(new Range(11,15));
        myList.add(new Range(13,14));

        for (int i = 0; i < myList.size() - 1; i++) {
            for (int j = i + 1; j < myList.size(); j++) {
                if (myList.get(i).getLeftBorder() > myList.get(j).getLeftBorder()) {
                    Range tmp = myList.get(j);
                    myList.set(j,myList.get(i));
                    myList.set(i,tmp);
                }
            }
        }

        for (int i = 0; i < myList.size() - 1; i++) {
            for (int j = i + 1; j < myList.size(); j++) {
                if (myList.get(i).getRightBorder() > myList.get(j).getLeftBorder()) {
                    if(myList.get(i).getRightBorder() < myList.get(j).getRightBorder()){
                        myList.get(i).setRightBorder(myList.get(j).getRightBorder());
                    }
                    myList.remove(j);
                    j--;
                }
            }
        }
        System.out.println(myList);
    }
}