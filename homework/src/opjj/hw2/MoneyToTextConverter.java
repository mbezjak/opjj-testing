package opjj.hw2;

import java.math.BigDecimal;

public final class MoneyToTextConverter {

    private static final String[] FROM_0_TO_20 = { "nula", "jedna", "dvije",
            "tri", "četiri", "pet", "šest", "sedam", "osam", "devet", "deset",
            "jedanaest", "dvanaest", "trinaest", "četrnaest", "petnaest",
            "šesnaest", "sedamnaest", "osamnaest", "devetnaest" };

    private static final String[] TENTHS = { "dvadeset", "trideset",
            "četrdeset", "pedeset", "šezdeset", "sedamdeset", "osamdeset",
            "devedeset" };

    public String convert(BigDecimal money) {
        if (money == null) {
            throw new IllegalArgumentException("No conversion for null");
        }

        return fromInteger(money.abs().intValue()) + " kuna";
    }

    private String fromInteger(int n) {
        if (n < 20) {
            return FROM_0_TO_20[n];
        } else if (n < 100) {
            int div = n / 10;
            int mod = n % 10;
            int arrayStartsAt20Offset = 2;
            return TENTHS[div - arrayStartsAt20Offset] + continuationFor(mod);
        } else if (n < 1000) {
            return scale(n, 100, "stotina");
        } else {
            return scale(n, 1000, "tisuća");
        }
    }

    private String continuationFor(int n) {
        return n == 0 ? "" : " " + fromInteger(n);
    }

    private String scale(int n, int s, String text) {
        int div = n / s;
        int mod = n % s;
        return fromInteger(div) + " " + text + continuationFor(mod);
    }

}
