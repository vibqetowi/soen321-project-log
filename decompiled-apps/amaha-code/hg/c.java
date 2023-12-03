package hg;

import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
/* compiled from: PDF417HighLevelEncoder.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f17601c;

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f17599a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, JsonWriter.COMMA, JsonWriter.SEMI, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f17600b = {59, 60, 62, 64, JsonWriter.ARRAY_START, JsonWriter.ESCAPE, JsonWriter.ARRAY_END, 95, 96, 126, 33, 13, 9, JsonWriter.COMMA, JsonWriter.SEMI, 10, 45, 46, 36, 47, JsonWriter.QUOTE, 124, 42, 40, 41, 63, JsonWriter.OBJECT_START, JsonWriter.OBJECT_END, 39, 0};

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f17602d = new byte[128];

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f17603e = StandardCharsets.ISO_8859_1;

    static {
        byte[] bArr = new byte[128];
        f17601c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i6 = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f17599a;
            if (i10 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i10];
            if (b10 > 0) {
                f17601c[b10] = (byte) i10;
            }
            i10++;
        }
        Arrays.fill(f17602d, (byte) -1);
        while (true) {
            byte[] bArr3 = f17600b;
            if (i6 < bArr3.length) {
                byte b11 = bArr3[i6];
                if (b11 > 0) {
                    f17602d[b11] = (byte) i6;
                }
                i6++;
            } else {
                return;
            }
        }
    }

    public static void a(byte[] bArr, int i6, int i10, StringBuilder sb2) {
        int i11;
        if (i6 == 1 && i10 == 0) {
            sb2.append((char) 913);
        } else if (i6 % 6 == 0) {
            sb2.append((char) 924);
        } else {
            sb2.append((char) 901);
        }
        if (i6 >= 6) {
            char[] cArr = new char[5];
            i11 = 0;
            while ((0 + i6) - i11 >= 6) {
                long j10 = 0;
                for (int i12 = 0; i12 < 6; i12++) {
                    j10 = (j10 << 8) + (bArr[i11 + i12] & 255);
                }
                for (int i13 = 0; i13 < 5; i13++) {
                    cArr[i13] = (char) (j10 % 900);
                    j10 /= 900;
                }
                for (int i14 = 4; i14 >= 0; i14--) {
                    sb2.append(cArr[i14]);
                }
                i11 += 6;
            }
        } else {
            i11 = 0;
        }
        while (i11 < 0 + i6) {
            sb2.append((char) (bArr[i11] & 255));
            i11++;
        }
    }

    public static void b(int i6, int i10, String str, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i10 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i11 = 0;
        while (i11 < i10) {
            sb3.setLength(0);
            int min = Math.min(44, i10 - i11);
            StringBuilder sb4 = new StringBuilder("1");
            int i12 = i6 + i11;
            sb4.append(str.substring(i12, i12 + min));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            int length = sb3.length();
            while (true) {
                length--;
                if (length >= 0) {
                    sb2.append(sb3.charAt(length));
                }
            }
            i11 += min;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x000e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102 A[EDGE_INSN: B:86:0x0102->B:72:0x0102 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(CharSequence charSequence, int i6, int i10, StringBuilder sb2, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        StringBuilder sb3 = new StringBuilder(i10);
        int i12 = i11;
        int i13 = 0;
        while (true) {
            int i14 = i6 + i13;
            char charAt = charSequence.charAt(i14);
            byte[] bArr = f17602d;
            byte[] bArr2 = f17601c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        byte b10 = bArr[charAt];
                        if (b10 != -1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            sb3.append((char) b10);
                        } else {
                            sb3.append((char) 29);
                            i12 = 0;
                        }
                    } else {
                        byte b11 = bArr2[charAt];
                        if (b11 != -1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            sb3.append((char) b11);
                        } else if (e(charAt)) {
                            sb3.append((char) 28);
                            i12 = 0;
                        } else if (d(charAt)) {
                            sb3.append((char) 27);
                            i12 = 1;
                        } else {
                            int i15 = i14 + 1;
                            if (i15 < i10) {
                                if (bArr[charSequence.charAt(i15)] != -1) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    sb3.append((char) 25);
                                    i12 = 3;
                                }
                            }
                            sb3.append((char) 29);
                            sb3.append((char) bArr[charAt]);
                        }
                    }
                } else if (d(charAt)) {
                    if (charAt == ' ') {
                        sb3.append((char) 26);
                    } else {
                        sb3.append((char) (charAt - 'a'));
                    }
                } else if (e(charAt)) {
                    sb3.append((char) 27);
                    sb3.append((char) (charAt - 'A'));
                } else {
                    if (bArr2[charAt] != -1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        sb3.append((char) 28);
                        i12 = 2;
                    } else {
                        sb3.append((char) 29);
                        sb3.append((char) bArr[charAt]);
                    }
                }
                i13++;
                if (i13 < i10) {
                    break;
                }
            } else {
                if (e(charAt)) {
                    if (charAt == ' ') {
                        sb3.append((char) 26);
                    } else {
                        sb3.append((char) (charAt - 'A'));
                    }
                } else if (d(charAt)) {
                    sb3.append((char) 27);
                    i12 = 1;
                } else {
                    if (bArr2[charAt] != -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        sb3.append((char) 28);
                        i12 = 2;
                    } else {
                        sb3.append((char) 29);
                        sb3.append((char) bArr[charAt]);
                    }
                }
                i13++;
                if (i13 < i10) {
                }
            }
        }
        int length = sb3.length();
        char c10 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            if (i16 % 2 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                c10 = (char) (sb3.charAt(i16) + (c10 * 30));
                sb2.append(c10);
            } else {
                c10 = sb3.charAt(i16);
            }
        }
        if (length % 2 != 0) {
            sb2.append((char) ((c10 * 30) + 29));
        }
        return i12;
    }

    public static boolean d(char c10) {
        if (c10 != ' ') {
            if (c10 < 'a' || c10 > 'z') {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean e(char c10) {
        if (c10 != ' ') {
            if (c10 < 'A' || c10 > 'Z') {
                return false;
            }
            return true;
        }
        return true;
    }
}
