package eu;
/* compiled from: BitEncoding.java */
/* loaded from: classes2.dex */
public final class a {
    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        "true".equals(str);
    }

    public static /* synthetic */ void a(int i6) {
        String str;
        int i10;
        if (i6 != 1 && i6 != 3 && i6 != 6 && i6 != 8 && i6 != 10 && i6 != 12 && i6 != 14) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 1 && i6 != 3 && i6 != 6 && i6 != 8 && i6 != 10 && i6 != 12 && i6 != 14) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        if (i6 != 1 && i6 != 3 && i6 != 6 && i6 != 8 && i6 != 10 && i6 != 12 && i6 != 14) {
            objArr[0] = "data";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        }
        if (i6 != 1) {
            if (i6 != 3) {
                if (i6 != 6) {
                    if (i6 != 8) {
                        if (i6 != 10) {
                            if (i6 != 12) {
                                if (i6 != 14) {
                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
                                } else {
                                    objArr[1] = "decode7to8";
                                }
                            } else {
                                objArr[1] = "combineStringArrayIntoBytes";
                            }
                        } else {
                            objArr[1] = "dropMarker";
                        }
                    } else {
                        objArr[1] = "decodeBytes";
                    }
                } else {
                    objArr[1] = "splitBytesToStringArray";
                }
            } else {
                objArr[1] = "encode8to7";
            }
        } else {
            objArr[1] = "encodeBytes";
        }
        switch (i6) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String format = String.format(str, objArr);
        if (i6 == 1 || i6 == 3 || i6 == 6 || i6 == 8 || i6 == 10 || i6 == 12 || i6 == 14) {
            throw new IllegalStateException(format);
        }
    }

    public static byte[] b(String[] strArr) {
        if (strArr != null) {
            if (strArr.length > 0 && !strArr[0].isEmpty()) {
                char charAt = strArr[0].charAt(0);
                if (charAt == 0) {
                    String[] strArr2 = (String[]) strArr.clone();
                    strArr2[0] = strArr2[0].substring(1);
                    int i6 = 0;
                    for (String str : strArr2) {
                        i6 += str.length();
                    }
                    byte[] bArr = new byte[i6];
                    int i10 = 0;
                    for (String str2 : strArr2) {
                        int length = str2.length();
                        int i11 = 0;
                        while (i11 < length) {
                            bArr[i10] = (byte) str2.charAt(i11);
                            i11++;
                            i10++;
                        }
                    }
                    return bArr;
                } else if (charAt == 65535) {
                    strArr = (String[]) strArr.clone();
                    strArr[0] = strArr[0].substring(1);
                }
            }
            int i12 = 0;
            for (String str3 : strArr) {
                i12 += str3.length();
            }
            byte[] bArr2 = new byte[i12];
            int i13 = 0;
            for (String str4 : strArr) {
                int length2 = str4.length();
                int i14 = 0;
                while (i14 < length2) {
                    bArr2[i13] = (byte) str4.charAt(i14);
                    i14++;
                    i13++;
                }
            }
            for (int i15 = 0; i15 < i12; i15++) {
                bArr2[i15] = (byte) ((bArr2[i15] + Byte.MAX_VALUE) & 127);
            }
            int i16 = (i12 * 7) / 8;
            byte[] bArr3 = new byte[i16];
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < i16; i19++) {
                i17++;
                int i20 = i18 + 1;
                bArr3[i19] = (byte) (((bArr2[i17] & 255) >>> i18) + ((bArr2[i17] & ((1 << i20) - 1)) << (7 - i18)));
                if (i18 == 6) {
                    i17++;
                    i18 = 0;
                } else {
                    i18 = i20;
                }
            }
            return bArr3;
        }
        a(7);
        throw null;
    }
}
