package DlcB.N7;

public class VisibleBlocks {
    void doStuff(){
        int x = 0;
        for (int y = 0; y < 5; y++){
            x = x + y;
        }
//        x = x * y; // Не скомпилируется. у за пределами области видимости
    }
}
