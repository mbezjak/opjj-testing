package opjj.hw5;

public final class EncodedMessages {

    public static final String MESSAGE_1 = "'Purjudpplqj lv olnh vha: rqh plvwdnh dqg brx duh surylglqj vxssruw iru d olihwlph.' -- Mlfkdho Slqc";
    public static final String MESSAGE_2 = "'Aalpnh rdst ph xu iwt vjn lwd tcsh je bpxcipxcxcv ndjg rdst xh kxdatci ehnrwdepiw lwd zcdlh lwtgt ndj axkt.' -- Mpgixc Gdasxcv";

    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();

        // change shift to decode messages; consider using for loop
        int shift1 = 0;
        int shift2 = 0;

        String m1 = cipher.decode(MESSAGE_1, shift1);
        String m2 = cipher.decode(MESSAGE_2, shift2);
        System.out.println(m1);
        System.out.println(m2);
    }

}
