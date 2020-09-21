package utilities;

public class Utilities {

    public boolean isInArea(int position) {
        if (position <= 100 && position >= -100) {
            return true;
        }
        return false;
    }
}
