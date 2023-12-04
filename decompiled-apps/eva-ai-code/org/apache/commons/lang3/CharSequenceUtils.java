package org.apache.commons.lang3;
/* loaded from: classes5.dex */
public class CharSequenceUtils {
    private static final int NOT_FOUND = -1;
    static final int TO_STRING_LIMIT = 16;

    public static CharSequence subSequence(CharSequence charSequence, int i) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.subSequence(i, charSequence.length());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int indexOf(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(i, i2);
        }
        int length = charSequence.length();
        if (i2 < 0) {
            i2 = 0;
        }
        if (i < 65536) {
            for (int i3 = i2; i3 < length; i3++) {
                if (charSequence.charAt(i3) == i) {
                    return i3;
                }
            }
        }
        if (i <= 1114111) {
            char[] chars = Character.toChars(i);
            while (i2 < length - 1) {
                char charAt = charSequence.charAt(i2);
                int i4 = i2 + 1;
                char charAt2 = charSequence.charAt(i4);
                if (charAt == chars[0] && charAt2 == chars[1]) {
                    return i2;
                }
                i2 = i4;
            }
            return -1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int indexOf(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(charSequence2.toString(), i);
        }
        if (charSequence instanceof StringBuilder) {
            return ((StringBuilder) charSequence).indexOf(charSequence2.toString(), i);
        }
        if (charSequence instanceof StringBuffer) {
            return ((StringBuffer) charSequence).indexOf(charSequence2.toString(), i);
        }
        return charSequence.toString().indexOf(charSequence2.toString(), i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int lastIndexOf(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(i, i2);
        }
        int length = charSequence.length();
        if (i2 < 0) {
            return -1;
        }
        if (i2 >= length) {
            i2 = length - 1;
        }
        if (i < 65536) {
            for (int i3 = i2; i3 >= 0; i3--) {
                if (charSequence.charAt(i3) == i) {
                    return i3;
                }
            }
        }
        if (i <= 1114111) {
            char[] chars = Character.toChars(i);
            if (i2 == length - 1) {
                return -1;
            }
            while (i2 >= 0) {
                char charAt = charSequence.charAt(i2);
                char charAt2 = charSequence.charAt(i2 + 1);
                if (chars[0] == charAt && chars[1] == charAt2) {
                    return i2;
                }
                i2--;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int lastIndexOf(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence2 instanceof String) {
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf((String) charSequence2, i);
            }
            if (charSequence instanceof StringBuilder) {
                return ((StringBuilder) charSequence).lastIndexOf((String) charSequence2, i);
            }
            if (charSequence instanceof StringBuffer) {
                return ((StringBuffer) charSequence).lastIndexOf((String) charSequence2, i);
            }
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        if (i > length) {
            i = length;
        }
        if (i >= 0 && length2 >= 0 && length2 <= length) {
            if (length2 == 0) {
                return i;
            }
            if (length2 <= 16) {
                if (charSequence instanceof String) {
                    return ((String) charSequence).lastIndexOf(charSequence2.toString(), i);
                }
                if (charSequence instanceof StringBuilder) {
                    return ((StringBuilder) charSequence).lastIndexOf(charSequence2.toString(), i);
                }
                if (charSequence instanceof StringBuffer) {
                    return ((StringBuffer) charSequence).lastIndexOf(charSequence2.toString(), i);
                }
            }
            if (i + length2 > length) {
                i = length - length2;
            }
            char charAt = charSequence2.charAt(0);
            while (true) {
                if (charSequence.charAt(i) != charAt) {
                    i--;
                    if (i < 0) {
                        return -1;
                    }
                } else if (checkLaterThan1(charSequence, charSequence2, length2, i)) {
                    return i;
                } else {
                    i--;
                    if (i < 0) {
                        break;
                    }
                }
            }
        }
        return -1;
    }

    private static boolean checkLaterThan1(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        int i3 = 1;
        for (int i4 = i - 1; i3 <= i4; i4--) {
            if (charSequence.charAt(i2 + i3) != charSequence2.charAt(i3) || charSequence.charAt(i2 + i4) != charSequence2.charAt(i4)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    public static char[] toCharArray(CharSequence charSequence) {
        int length = StringUtils.length(charSequence);
        if (length == 0) {
            return ArrayUtils.EMPTY_CHAR_ARRAY;
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).toCharArray();
        }
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = charSequence.charAt(i);
        }
        return cArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean regionMatches(CharSequence charSequence, boolean z, int i, CharSequence charSequence2, int i2, int i3) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(z, i, (String) charSequence2, i2, i3);
        }
        int length = charSequence.length() - i;
        int length2 = charSequence2.length() - i2;
        if (i < 0 || i2 < 0 || i3 < 0 || length < i3 || length2 < i3) {
            return false;
        }
        while (true) {
            int i4 = i3 - 1;
            if (i3 <= 0) {
                return true;
            }
            int i5 = i + 1;
            char charAt = charSequence.charAt(i);
            int i6 = i2 + 1;
            char charAt2 = charSequence2.charAt(i2);
            if (charAt != charAt2) {
                if (!z) {
                    return false;
                }
                char upperCase = Character.toUpperCase(charAt);
                char upperCase2 = Character.toUpperCase(charAt2);
                if (upperCase != upperCase2 && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                    return false;
                }
            }
            i = i5;
            i3 = i4;
            i2 = i6;
        }
    }
}
