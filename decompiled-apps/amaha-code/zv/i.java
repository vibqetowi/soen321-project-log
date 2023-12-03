package zv;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.Arrays;
/* compiled from: ByteString.kt */
/* loaded from: classes2.dex */
public class i implements Serializable, Comparable<i> {

    /* renamed from: x  reason: collision with root package name */
    public static final i f39888x;

    /* renamed from: u  reason: collision with root package name */
    public final byte[] f39889u;

    /* renamed from: v  reason: collision with root package name */
    public transient int f39890v;

    /* renamed from: w  reason: collision with root package name */
    public transient String f39891w;

    /* compiled from: ByteString.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:62:0x00b6 A[LOOP:1: B:16:0x003f->B:62:0x00b6, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00f6 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00b4 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static i a(String str) {
            int i6;
            int i10;
            boolean z10;
            boolean z11;
            boolean z12;
            int i11;
            int i12;
            char charAt;
            kotlin.jvm.internal.i.g(str, "<this>");
            byte[] bArr = b0.f39881a;
            int length = str.length();
            while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
                length = i12;
            }
            int i13 = (int) ((length * 6) / 8);
            byte[] bArr2 = new byte[i13];
            int i14 = 0;
            if (length > 0) {
                int i15 = 0;
                i6 = 0;
                int i16 = 0;
                i10 = 0;
                while (true) {
                    int i17 = i15 + 1;
                    char charAt2 = str.charAt(i15);
                    if ('A' <= charAt2 && charAt2 <= 'Z') {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i11 = charAt2 - 'A';
                    } else {
                        if ('a' <= charAt2 && charAt2 <= 'z') {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            i11 = charAt2 - 'G';
                        } else {
                            if ('0' <= charAt2 && charAt2 <= '9') {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                i11 = charAt2 + 4;
                            } else if (charAt2 != '+' && charAt2 != '-') {
                                if (charAt2 != '/' && charAt2 != '_') {
                                    if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                                        break;
                                    }
                                    if (i17 < length) {
                                        i14 = i16;
                                        break;
                                    }
                                    i15 = i17;
                                } else {
                                    i11 = 63;
                                }
                            } else {
                                i11 = 62;
                            }
                        }
                    }
                    i10 = (i10 << 6) | i11;
                    i16++;
                    if (i16 % 4 == 0) {
                        int i18 = i6 + 1;
                        bArr2[i6] = (byte) (i10 >> 16);
                        int i19 = i18 + 1;
                        bArr2[i18] = (byte) (i10 >> 8);
                        i6 = i19 + 1;
                        bArr2[i19] = (byte) i10;
                    }
                    if (i17 < length) {
                    }
                }
            } else {
                i6 = 0;
                i10 = 0;
            }
            int i20 = i14 % 4;
            if (i20 != 1) {
                if (i20 != 2) {
                    if (i20 == 3) {
                        int i21 = i10 << 6;
                        int i22 = i6 + 1;
                        bArr2[i6] = (byte) (i21 >> 16);
                        i6 = i22 + 1;
                        bArr2[i22] = (byte) (i21 >> 8);
                    }
                } else {
                    bArr2[i6] = (byte) ((i10 << 12) >> 16);
                    i6++;
                }
                if (i6 != i13) {
                    bArr2 = Arrays.copyOf(bArr2, i6);
                    kotlin.jvm.internal.i.f(bArr2, "java.util.Arrays.copyOf(this, newSize)");
                }
                if (bArr2 == null) {
                    return new i(bArr2);
                }
                return null;
            }
            bArr2 = null;
            if (bArr2 == null) {
            }
        }

        public static i b(String str) {
            boolean z10;
            int i6 = 0;
            if (str.length() % 2 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                int i10 = length - 1;
                if (i10 >= 0) {
                    while (true) {
                        int i11 = i6 + 1;
                        int i12 = i6 * 2;
                        bArr[i6] = (byte) (sc.b.j(str.charAt(i12 + 1)) + (sc.b.j(str.charAt(i12)) << 4));
                        if (i11 > i10) {
                            break;
                        }
                        i6 = i11;
                    }
                }
                return new i(bArr);
            }
            throw new IllegalArgumentException(kotlin.jvm.internal.i.n(str, "Unexpected hex string: ").toString());
        }

        public static i c(String str) {
            kotlin.jvm.internal.i.g(str, "<this>");
            byte[] bytes = str.getBytes(gv.a.f16927b);
            kotlin.jvm.internal.i.f(bytes, "(this as java.lang.String).getBytes(charset)");
            i iVar = new i(bytes);
            iVar.f39891w = str;
            return iVar;
        }

        public static i d(byte[] bArr) {
            i iVar = i.f39888x;
            int length = bArr.length;
            ta.v.m(bArr.length, 0, length);
            int i6 = length + 0;
            ca.a.I(i6, bArr.length);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i6);
            kotlin.jvm.internal.i.f(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            return new i(copyOfRange);
        }
    }

    static {
        new a();
        f39888x = new i(new byte[0]);
    }

    public i(byte[] data) {
        kotlin.jvm.internal.i.g(data, "data");
        this.f39889u = data;
    }

    public static final i l(byte... data) {
        kotlin.jvm.internal.i.g(data, "data");
        byte[] copyOf = Arrays.copyOf(data, data.length);
        kotlin.jvm.internal.i.f(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new i(copyOf);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        boolean z10;
        int readInt = objectInputStream.readInt();
        int i6 = 0;
        if (readInt >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            byte[] bArr = new byte[readInt];
            while (i6 < readInt) {
                int read = objectInputStream.read(bArr, i6, readInt - i6);
                if (read != -1) {
                    i6 += read;
                } else {
                    throw new EOFException();
                }
            }
            i iVar = new i(bArr);
            Field declaredField = i.class.getDeclaredField("u");
            declaredField.setAccessible(true);
            declaredField.set(this, iVar.f39889u);
            return;
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Integer.valueOf(readInt), "byteCount < 0: ").toString());
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f39889u.length);
        objectOutputStream.write(this.f39889u);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(i iVar) {
        i other = iVar;
        kotlin.jvm.internal.i.g(other, "other");
        int h10 = h();
        int h11 = other.h();
        int min = Math.min(h10, h11);
        for (int i6 = 0; i6 < min; i6++) {
            int k10 = k(i6) & 255;
            int k11 = other.k(i6) & 255;
            if (k10 != k11) {
                if (k10 < k11) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        if (h10 == h11) {
            return 0;
        }
        if (h10 < h11) {
        }
    }

    public String d() {
        byte[] bArr = this.f39889u;
        byte[] map = b0.f39881a;
        kotlin.jvm.internal.i.g(bArr, "<this>");
        kotlin.jvm.internal.i.g(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i6 = 0;
        int i10 = 0;
        while (i6 < length) {
            int i11 = i6 + 1;
            byte b10 = bArr[i6];
            int i12 = i11 + 1;
            byte b11 = bArr[i11];
            int i13 = i12 + 1;
            byte b12 = bArr[i12];
            int i14 = i10 + 1;
            bArr2[i10] = map[(b10 & 255) >> 2];
            int i15 = i14 + 1;
            bArr2[i14] = map[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i16 = i15 + 1;
            bArr2[i15] = map[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i10 = i16 + 1;
            bArr2[i16] = map[b12 & 63];
            i6 = i13;
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i17 = i6 + 1;
                byte b13 = bArr[i6];
                byte b14 = bArr[i17];
                int i18 = i10 + 1;
                bArr2[i10] = map[(b13 & 255) >> 2];
                int i19 = i18 + 1;
                bArr2[i18] = map[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
                bArr2[i19] = map[(b14 & 15) << 2];
                bArr2[i19 + 1] = (byte) 61;
            }
        } else {
            byte b15 = bArr[i6];
            int i20 = i10 + 1;
            bArr2[i10] = map[(b15 & 255) >> 2];
            int i21 = i20 + 1;
            bArr2[i20] = map[(b15 & 3) << 4];
            byte b16 = (byte) 61;
            bArr2[i21] = b16;
            bArr2[i21 + 1] = b16;
        }
        return new String(bArr2, gv.a.f16927b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int h10 = iVar.h();
            byte[] bArr = this.f39889u;
            if (h10 == bArr.length && iVar.n(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public i f(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f39889u, 0, h());
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.i.f(digestBytes, "digestBytes");
        return new i(digestBytes);
    }

    public int h() {
        return this.f39889u.length;
    }

    public int hashCode() {
        int i6 = this.f39890v;
        if (i6 == 0) {
            int hashCode = Arrays.hashCode(this.f39889u);
            this.f39890v = hashCode;
            return hashCode;
        }
        return i6;
    }

    public String i() {
        byte[] bArr = this.f39889u;
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        int i6 = 0;
        int i10 = 0;
        while (i6 < length) {
            byte b10 = bArr[i6];
            i6++;
            int i11 = i10 + 1;
            char[] cArr2 = sc.b.f31420u;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] j() {
        return this.f39889u;
    }

    public byte k(int i6) {
        return this.f39889u[i6];
    }

    public boolean n(int i6, int i10, int i11, byte[] other) {
        kotlin.jvm.internal.i.g(other, "other");
        if (i6 >= 0) {
            byte[] bArr = this.f39889u;
            if (i6 <= bArr.length - i11 && i10 >= 0 && i10 <= other.length - i11 && ta.v.f(i6, i10, i11, bArr, other)) {
                return true;
            }
        }
        return false;
    }

    public boolean p(i other, int i6) {
        kotlin.jvm.internal.i.g(other, "other");
        return other.n(0, 0, i6, this.f39889u);
    }

    public i r() {
        byte b10;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f39889u;
            if (i6 < bArr.length) {
                byte b11 = bArr[i6];
                byte b12 = (byte) 65;
                if (b11 >= b12 && b11 <= (b10 = (byte) 90)) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    kotlin.jvm.internal.i.f(copyOf, "java.util.Arrays.copyOf(this, size)");
                    copyOf[i6] = (byte) (b11 + 32);
                    for (int i10 = i6 + 1; i10 < copyOf.length; i10++) {
                        byte b13 = copyOf[i10];
                        if (b13 >= b12 && b13 <= b10) {
                            copyOf[i10] = (byte) (b13 + 32);
                        }
                    }
                    return new i(copyOf);
                }
                i6++;
            } else {
                return this;
            }
        }
    }

    public byte[] t() {
        byte[] bArr = this.f39889u;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.i.f(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x00fe, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x010f, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x011e, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0130, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x013d, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0187, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0198, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01a9, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x01b8, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x01ce, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x01db, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x01e2, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0223, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0226, code lost:
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x009a, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00a9, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00b4, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0226 A[EDGE_INSN: B:270:0x0226->B:247:0x0226 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0226 A[EDGE_INSN: B:275:0x0226->B:247:0x0226 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0226 A[EDGE_INSN: B:280:0x0226->B:247:0x0226 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0226 A[EDGE_INSN: B:292:0x0226->B:247:0x0226 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0226 A[EDGE_INSN: B:298:0x0226->B:247:0x0226 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z10;
        boolean z11;
        i iVar;
        int i6;
        byte b10;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i11;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        int i12;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        int i13;
        boolean z32;
        boolean z33;
        boolean z34;
        byte[] bArr = this.f39889u;
        if (bArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        loop0: while (true) {
            if (i14 >= length) {
                break;
            }
            byte b11 = bArr[i14];
            if (b11 >= 0) {
                int i17 = i15 + 1;
                if (i15 == 64) {
                    break;
                }
                if (b11 != 10 && b11 != 13) {
                    if (b11 >= 0 && b11 <= 31) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        if (Byte.MAX_VALUE <= b11 && b11 <= 159) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (!z17) {
                            z16 = false;
                            if (z16) {
                                break;
                            }
                        }
                    }
                    z16 = true;
                    if (z16) {
                    }
                }
                if (b11 == 65533) {
                    break;
                }
                if (b11 < 65536) {
                    i6 = 1;
                } else {
                    i6 = 2;
                }
                i16 += i6;
                i14++;
                while (true) {
                    i15 = i17;
                    if (i14 < length && (b10 = bArr[i14]) >= 0) {
                        i14++;
                        i17 = i15 + 1;
                        if (i15 == 64) {
                            break loop0;
                        }
                        if (b10 != 10 && b10 != 13) {
                            if (b10 >= 0 && b10 <= 31) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                if (Byte.MAX_VALUE <= b10 && b10 <= 159) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (!z14) {
                                    z13 = false;
                                    if (z13) {
                                        break loop0;
                                    }
                                }
                            }
                            z13 = true;
                            if (z13) {
                            }
                        }
                        if (b10 == 65533) {
                            break loop0;
                        }
                        if (b10 < 65536) {
                            i10 = 1;
                        } else {
                            i10 = 2;
                        }
                        i16 += i10;
                    }
                }
            } else if ((b11 >> 5) == -2) {
                int i18 = i14 + 1;
                if (length > i18) {
                    byte b12 = bArr[i18];
                    if ((b12 & 192) == 128) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        int i19 = (b11 << 6) ^ (b12 ^ 3968);
                        if (i19 >= 128) {
                            int i20 = i15 + 1;
                            if (i15 == 64) {
                                break;
                            }
                            if (i19 != 10 && i19 != 13) {
                                if (i19 >= 0 && i19 <= 31) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                if (!z19) {
                                    if (127 <= i19 && i19 <= 159) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    if (!z21) {
                                        z20 = false;
                                        if (z20) {
                                            break;
                                        }
                                    }
                                }
                                z20 = true;
                                if (z20) {
                                }
                            }
                            if (i19 == 65533) {
                                break;
                            }
                            if (i19 < 65536) {
                                i11 = 1;
                            } else {
                                i11 = 2;
                            }
                            i16 += i11;
                            hs.k kVar = hs.k.f19476a;
                            i14 += 2;
                            i15 = i20;
                        }
                    }
                }
            } else if ((b11 >> 4) == -2) {
                int i21 = i14 + 2;
                if (length > i21) {
                    byte b13 = bArr[i14 + 1];
                    if ((b13 & 192) == 128) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    if (z22) {
                        byte b14 = bArr[i21];
                        if ((b14 & 192) == 128) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        if (z23) {
                            int i22 = (b11 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                            if (i22 >= 2048) {
                                if (55296 <= i22 && i22 <= 57343) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                if (!z24) {
                                    int i23 = i15 + 1;
                                    if (i15 == 64) {
                                        break;
                                    }
                                    if (i22 != 10 && i22 != 13) {
                                        if (i22 >= 0 && i22 <= 31) {
                                            z25 = true;
                                        } else {
                                            z25 = false;
                                        }
                                        if (!z25) {
                                            if (127 <= i22 && i22 <= 159) {
                                                z27 = true;
                                            } else {
                                                z27 = false;
                                            }
                                            if (!z27) {
                                                z26 = false;
                                                if (z26) {
                                                    break;
                                                }
                                            }
                                        }
                                        z26 = true;
                                        if (z26) {
                                        }
                                    }
                                    if (i22 == 65533) {
                                        break;
                                    }
                                    if (i22 < 65536) {
                                        i12 = 1;
                                    } else {
                                        i12 = 2;
                                    }
                                    i16 += i12;
                                    hs.k kVar2 = hs.k.f19476a;
                                    i14 += 3;
                                    i15 = i23;
                                }
                            }
                        }
                    }
                }
            } else if ((b11 >> 3) == -2) {
                int i24 = i14 + 3;
                if (length > i24) {
                    byte b15 = bArr[i14 + 1];
                    if ((b15 & 192) == 128) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    if (z28) {
                        byte b16 = bArr[i14 + 2];
                        if ((b16 & 192) == 128) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        if (z29) {
                            byte b17 = bArr[i24];
                            if ((b17 & 192) == 128) {
                                z30 = true;
                            } else {
                                z30 = false;
                            }
                            if (z30) {
                                int i25 = (b11 << 18) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                                if (i25 <= 1114111) {
                                    if (55296 <= i25 && i25 <= 57343) {
                                        z31 = true;
                                    } else {
                                        z31 = false;
                                    }
                                    if (!z31) {
                                        if (i25 >= 65536) {
                                            int i26 = i15 + 1;
                                            if (i15 == 64) {
                                                break;
                                            }
                                            if (i25 != 10 && i25 != 13) {
                                                if (i25 >= 0 && i25 <= 31) {
                                                    z32 = true;
                                                } else {
                                                    z32 = false;
                                                }
                                                if (!z32) {
                                                    if (127 <= i25 && i25 <= 159) {
                                                        z34 = true;
                                                    } else {
                                                        z34 = false;
                                                    }
                                                    if (!z34) {
                                                        z33 = false;
                                                        if (z33) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                z33 = true;
                                                if (z33) {
                                                }
                                            }
                                            if (i25 == 65533) {
                                                break;
                                            }
                                            if (i25 < 65536) {
                                                i13 = 1;
                                            } else {
                                                i13 = 2;
                                            }
                                            i16 += i13;
                                            hs.k kVar3 = hs.k.f19476a;
                                            i14 += 4;
                                            i15 = i26;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i16 == -1) {
            if (this.f39889u.length <= 64) {
                return "[hex=" + i() + ']';
            }
            StringBuilder sb2 = new StringBuilder("[size=");
            sb2.append(this.f39889u.length);
            sb2.append(" hex=");
            byte[] bArr2 = this.f39889u;
            if (64 <= bArr2.length) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (64 == bArr2.length) {
                    iVar = this;
                } else {
                    ca.a.I(64, bArr2.length);
                    byte[] copyOfRange = Arrays.copyOfRange(bArr2, 0, 64);
                    kotlin.jvm.internal.i.f(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
                    iVar = new i(copyOfRange);
                }
                sb2.append(iVar.i());
                sb2.append("…]");
                return sb2.toString();
            }
            throw new IllegalArgumentException(defpackage.c.s(new StringBuilder("endIndex > length("), this.f39889u.length, ')').toString());
        }
        String u10 = u();
        String substring = u10.substring(0, i16);
        kotlin.jvm.internal.i.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String F0 = gv.n.F0(gv.n.F0(gv.n.F0(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i16 < u10.length()) {
            return "[size=" + this.f39889u.length + " text=" + F0 + "…]";
        }
        return "[text=" + F0 + ']';
    }

    public final String u() {
        String str = this.f39891w;
        if (str == null) {
            byte[] j10 = j();
            kotlin.jvm.internal.i.g(j10, "<this>");
            String str2 = new String(j10, gv.a.f16927b);
            this.f39891w = str2;
            return str2;
        }
        return str;
    }

    public void v(e buffer, int i6) {
        kotlin.jvm.internal.i.g(buffer, "buffer");
        buffer.y0(0, this.f39889u, i6);
    }
}
