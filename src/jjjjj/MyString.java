package jjjjj;

public class MyString {
    private final char[] str;

    public MyString(char... str) {
        this.str = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof MyString other) {
            for (int i = 0; i < str.length; i++) {
                if (str[i] != other.str[i]) {
                    return false;
                }
                else return true;
            }
        }
        return false;
    }
}
