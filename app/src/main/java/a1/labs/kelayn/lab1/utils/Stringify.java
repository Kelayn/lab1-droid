package a1.labs.kelayn.lab1.utils;

import android.os.Build;

import java.text.MessageFormat;

public class Stringify {
    public String getNumberOrdinal(Number number) {

        String format = "{0,spellout}";

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return android.icu.text.MessageFormat.format(format, number);
        } else {
            return MessageFormat.format(format, number);
        }
    }
}
