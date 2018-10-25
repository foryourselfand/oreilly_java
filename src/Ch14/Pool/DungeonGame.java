package Ch14.Pool;

import java.io.Serializable;

public class DungeonGame implements Serializable {
    public int x = 3;
    transient long y = 4;
    private short z = 5;

    long getY() {
        return y;
    }

    int getX(){
        return  x;
    }

    short getZ(){
        return z;
    }
}
