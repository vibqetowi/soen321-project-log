package com.google.firebase.database.core.utilities;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.firebase.database.snapshot.ChildKey;
import java.util.Random;
/* loaded from: classes.dex */
public class PushIdGenerator {
    private static final int MAX_KEY_LEN = 786;
    private static final char MAX_PUSH_CHAR = 'z';
    private static final char MIN_PUSH_CHAR = '-';
    private static final String PUSH_CHARS = "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz";
    private static final Random randGen = new Random();
    private static long lastPushTime = 0;
    private static final int[] lastRandChars = new int[12];

    public static synchronized String generatePushChildName(long j10) {
        boolean z10;
        boolean z11;
        String sb2;
        synchronized (PushIdGenerator.class) {
            boolean z12 = true;
            if (j10 == lastPushTime) {
                z10 = true;
            } else {
                z10 = false;
            }
            lastPushTime = j10;
            char[] cArr = new char[8];
            StringBuilder sb3 = new StringBuilder(20);
            for (int i6 = 7; i6 >= 0; i6--) {
                cArr[i6] = PUSH_CHARS.charAt((int) (j10 % 64));
                j10 /= 64;
            }
            if (j10 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Utilities.hardAssert(z11);
            sb3.append(cArr);
            if (!z10) {
                for (int i10 = 0; i10 < 12; i10++) {
                    lastRandChars[i10] = randGen.nextInt(64);
                }
            } else {
                incrementArray();
            }
            for (int i11 = 0; i11 < 12; i11++) {
                sb3.append(PUSH_CHARS.charAt(lastRandChars[i11]));
            }
            if (sb3.length() != 20) {
                z12 = false;
            }
            Utilities.hardAssert(z12);
            sb2 = sb3.toString();
        }
        return sb2;
    }

    private static void incrementArray() {
        for (int i6 = 11; i6 >= 0; i6--) {
            int[] iArr = lastRandChars;
            int i10 = iArr[i6];
            if (i10 != 63) {
                iArr[i6] = i10 + 1;
                return;
            }
            iArr[i6] = 0;
        }
    }

    public static final String predecessor(String str) {
        Validation.validateNullableKey(str);
        Integer tryParseInt = Utilities.tryParseInt(str);
        if (tryParseInt != null) {
            if (tryParseInt.intValue() == Integer.MIN_VALUE) {
                return ChildKey.MIN_KEY_NAME;
            }
            return String.valueOf(tryParseInt.intValue() - 1);
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (sb2.charAt(sb2.length() - 1) == '-') {
            if (sb2.length() == 1) {
                return String.valueOf((int) SubsamplingScaleImageView.TILE_SIZE_AUTO);
            }
            return sb2.substring(0, sb2.length() - 1);
        }
        sb2.setCharAt(sb2.length() - 1, PUSH_CHARS.charAt(PUSH_CHARS.indexOf(sb2.charAt(sb2.length() - 1)) - 1));
        sb2.append(new String(new char[786 - sb2.length()]).replace("\u0000", "z"));
        return sb2.toString();
    }

    public static final String successor(String str) {
        Validation.validateNullableKey(str);
        Integer tryParseInt = Utilities.tryParseInt(str);
        if (tryParseInt != null) {
            if (tryParseInt.intValue() == Integer.MAX_VALUE) {
                return String.valueOf((char) MIN_PUSH_CHAR);
            }
            return String.valueOf(tryParseInt.intValue() + 1);
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (sb2.length() < MAX_KEY_LEN) {
            sb2.append(MIN_PUSH_CHAR);
            return sb2.toString();
        }
        int length = sb2.length() - 1;
        while (length >= 0 && sb2.charAt(length) == 'z') {
            length--;
        }
        if (length == -1) {
            return ChildKey.MAX_KEY_NAME;
        }
        int i6 = length + 1;
        sb2.replace(length, i6, String.valueOf(PUSH_CHARS.charAt(PUSH_CHARS.indexOf(sb2.charAt(length)) + 1)));
        return sb2.substring(0, i6);
    }
}
