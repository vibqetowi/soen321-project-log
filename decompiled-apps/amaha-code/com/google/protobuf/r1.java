package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
/* compiled from: Utf8.java */
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f10029a;

    /* compiled from: Utf8.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i6) {
            if (!d(b11)) {
                if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !d(b12) && !d(b13)) {
                    int i10 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                    cArr[i6] = (char) ((i10 >>> 10) + 55232);
                    cArr[i6 + 1] = (char) ((i10 & 1023) + 56320);
                    return;
                }
            }
            throw InvalidProtocolBufferException.c();
        }

        public static void b(byte b10, byte b11, char[] cArr, int i6) {
            if (b10 >= -62 && !d(b11)) {
                cArr[i6] = (char) (((b10 & 31) << 6) | (b11 & 63));
                return;
            }
            throw InvalidProtocolBufferException.c();
        }

        public static void c(byte b10, byte b11, byte b12, char[] cArr, int i6) {
            if (!d(b11) && ((b10 != -32 || b11 >= -96) && ((b10 != -19 || b11 < -96) && !d(b12)))) {
                cArr[i6] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                return;
            }
            throw InvalidProtocolBufferException.c();
        }

        public static boolean d(byte b10) {
            if (b10 > -65) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public static String b(ByteBuffer byteBuffer, int i6, int i10) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            if ((i6 | i10 | ((byteBuffer.limit() - i6) - i10)) >= 0) {
                int i11 = i6 + i10;
                char[] cArr = new char[i10];
                int i12 = 0;
                while (i6 < i11) {
                    byte b10 = byteBuffer.get(i6);
                    if (b10 >= 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        break;
                    }
                    i6++;
                    cArr[i12] = (char) b10;
                    i12++;
                }
                int i13 = i12;
                while (i6 < i11) {
                    int i14 = i6 + 1;
                    byte b11 = byteBuffer.get(i6);
                    if (b11 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        int i15 = i13 + 1;
                        cArr[i13] = (char) b11;
                        i6 = i14;
                        while (true) {
                            i13 = i15;
                            if (i6 >= i11) {
                                break;
                            }
                            byte b12 = byteBuffer.get(i6);
                            if (b12 >= 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                break;
                            }
                            i6++;
                            i15 = i13 + 1;
                            cArr[i13] = (char) b12;
                        }
                    } else {
                        if (b11 < -32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            if (i14 < i11) {
                                a.b(b11, byteBuffer.get(i14), cArr, i13);
                                i6 = i14 + 1;
                                i13++;
                            } else {
                                throw InvalidProtocolBufferException.c();
                            }
                        } else {
                            if (b11 < -16) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                if (i14 < i11 - 1) {
                                    int i16 = i14 + 1;
                                    a.c(b11, byteBuffer.get(i14), byteBuffer.get(i16), cArr, i13);
                                    i6 = i16 + 1;
                                    i13++;
                                } else {
                                    throw InvalidProtocolBufferException.c();
                                }
                            } else if (i14 < i11 - 2) {
                                int i17 = i14 + 1;
                                byte b13 = byteBuffer.get(i14);
                                int i18 = i17 + 1;
                                a.a(b11, b13, byteBuffer.get(i17), byteBuffer.get(i18), cArr, i13);
                                i13 = i13 + 1 + 1;
                                i6 = i18 + 1;
                            } else {
                                throw InvalidProtocolBufferException.c();
                            }
                        }
                    }
                }
                return new String(cArr, 0, i13);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i6), Integer.valueOf(i10)));
        }

        public abstract String a(int i6, byte[] bArr, int i10);

        public abstract String c(ByteBuffer byteBuffer, int i6, int i10);

        public abstract int d(CharSequence charSequence, byte[] bArr, int i6, int i10);

        public abstract int e(int i6, int i10, int i11, byte[] bArr);
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes.dex */
    public static final class c extends b {
        @Override // com.google.protobuf.r1.b
        public final String a(int i6, byte[] bArr, int i10) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            if ((i6 | i10 | ((bArr.length - i6) - i10)) >= 0) {
                int i11 = i6 + i10;
                char[] cArr = new char[i10];
                int i12 = 0;
                while (i6 < i11) {
                    byte b10 = bArr[i6];
                    if (b10 >= 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        break;
                    }
                    i6++;
                    cArr[i12] = (char) b10;
                    i12++;
                }
                int i13 = i12;
                while (i6 < i11) {
                    int i14 = i6 + 1;
                    byte b11 = bArr[i6];
                    if (b11 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        int i15 = i13 + 1;
                        cArr[i13] = (char) b11;
                        i6 = i14;
                        while (true) {
                            i13 = i15;
                            if (i6 >= i11) {
                                break;
                            }
                            byte b12 = bArr[i6];
                            if (b12 >= 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                break;
                            }
                            i6++;
                            i15 = i13 + 1;
                            cArr[i13] = (char) b12;
                        }
                    } else {
                        if (b11 < -32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            if (i14 < i11) {
                                a.b(b11, bArr[i14], cArr, i13);
                                i6 = i14 + 1;
                                i13++;
                            } else {
                                throw InvalidProtocolBufferException.c();
                            }
                        } else {
                            if (b11 < -16) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                if (i14 < i11 - 1) {
                                    int i16 = i14 + 1;
                                    a.c(b11, bArr[i14], bArr[i16], cArr, i13);
                                    i6 = i16 + 1;
                                    i13++;
                                } else {
                                    throw InvalidProtocolBufferException.c();
                                }
                            } else if (i14 < i11 - 2) {
                                int i17 = i14 + 1;
                                byte b13 = bArr[i14];
                                int i18 = i17 + 1;
                                a.a(b11, b13, bArr[i17], bArr[i18], cArr, i13);
                                i13 = i13 + 1 + 1;
                                i6 = i18 + 1;
                            } else {
                                throw InvalidProtocolBufferException.c();
                            }
                        }
                    }
                }
                return new String(cArr, 0, i13);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i6), Integer.valueOf(i10)));
        }

        @Override // com.google.protobuf.r1.b
        public final String c(ByteBuffer byteBuffer, int i6, int i10) {
            return b.b(byteBuffer, i6, i10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            return r10 + r0;
         */
        @Override // com.google.protobuf.r1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int d(CharSequence charSequence, byte[] bArr, int i6, int i10) {
            int i11;
            int i12;
            int i13;
            char charAt;
            int length = charSequence.length();
            int i14 = i10 + i6;
            int i15 = 0;
            while (i15 < length && (i13 = i15 + i6) < i14 && (charAt = charSequence.charAt(i15)) < 128) {
                bArr[i13] = (byte) charAt;
                i15++;
            }
            int i16 = i6 + i15;
            while (i15 < length) {
                char charAt2 = charSequence.charAt(i15);
                if (charAt2 < 128 && i16 < i14) {
                    i11 = i16 + 1;
                    bArr[i16] = (byte) charAt2;
                } else {
                    if (charAt2 < 2048 && i16 <= i14 - 2) {
                        int i17 = i16 + 1;
                        bArr[i16] = (byte) ((charAt2 >>> 6) | 960);
                        i16 = i17 + 1;
                        bArr[i17] = (byte) ((charAt2 & '?') | 128);
                    } else if ((charAt2 < 55296 || 57343 < charAt2) && i16 <= i14 - 3) {
                        int i18 = i16 + 1;
                        bArr[i16] = (byte) ((charAt2 >>> '\f') | 480);
                        int i19 = i18 + 1;
                        bArr[i18] = (byte) (((charAt2 >>> 6) & 63) | 128);
                        i11 = i19 + 1;
                        bArr[i19] = (byte) ((charAt2 & '?') | 128);
                    } else if (i16 <= i14 - 4) {
                        int i20 = i15 + 1;
                        if (i20 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i20);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i21 = i16 + 1;
                                bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                                int i22 = i21 + 1;
                                bArr[i21] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i23 = i22 + 1;
                                bArr[i22] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i16 = i23 + 1;
                                bArr[i23] = (byte) ((codePoint & 63) | 128);
                                i15 = i20;
                            } else {
                                i15 = i20;
                            }
                        }
                        throw new d(i15 - 1, length);
                    } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i12 = i15 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                        throw new d(i15, length);
                    } else {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i16);
                    }
                    i15++;
                }
                i16 = i11;
                i15++;
            }
            return i16;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
            if (r15[r13] > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
            if (r15[r13] > (-65)) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
            if (r15[r13] > (-65)) goto L48;
         */
        @Override // com.google.protobuf.r1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int e(int i6, int i10, int i11, byte[] bArr) {
            byte b10;
            int i12;
            if (i6 != 0) {
                if (i10 >= i11) {
                    return i6;
                }
                byte b11 = (byte) i6;
                if (b11 < -32) {
                    if (b11 >= -62) {
                        i12 = i10 + 1;
                    }
                    return -1;
                } else if (b11 < -16) {
                    byte b12 = (byte) (~(i6 >> 8));
                    if (b12 == 0) {
                        int i13 = i10 + 1;
                        byte b13 = bArr[i10];
                        if (i13 >= i11) {
                            return r1.d(b11, b13);
                        }
                        i10 = i13;
                        b12 = b13;
                    }
                    if (b12 <= -65 && ((b11 != -32 || b12 >= -96) && (b11 != -19 || b12 < -96))) {
                        i12 = i10 + 1;
                    }
                    return -1;
                } else {
                    byte b14 = (byte) (~(i6 >> 8));
                    if (b14 == 0) {
                        int i14 = i10 + 1;
                        b14 = bArr[i10];
                        if (i14 >= i11) {
                            return r1.d(b11, b14);
                        }
                        i10 = i14;
                        b10 = 0;
                    } else {
                        b10 = (byte) (i6 >> 16);
                    }
                    if (b10 == 0) {
                        int i15 = i10 + 1;
                        byte b15 = bArr[i10];
                        if (i15 >= i11) {
                            return r1.e(b11, b14, b15);
                        }
                        i10 = i15;
                        b10 = b15;
                    }
                    if (b14 <= -65) {
                        if ((((b14 + 112) + (b11 << 28)) >> 30) == 0 && b10 <= -65) {
                            i12 = i10 + 1;
                        }
                    }
                    return -1;
                }
                i10 = i12;
            }
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 >= i11) {
                return 0;
            }
            while (i10 < i11) {
                int i16 = i10 + 1;
                byte b16 = bArr[i10];
                if (b16 < 0) {
                    if (b16 < -32) {
                        if (i16 >= i11) {
                            return b16;
                        }
                        if (b16 >= -62) {
                            i10 = i16 + 1;
                            if (bArr[i16] > -65) {
                            }
                        }
                        return -1;
                    } else if (b16 < -16) {
                        if (i16 >= i11 - 1) {
                            return r1.a(i16, bArr, i11);
                        }
                        int i17 = i16 + 1;
                        byte b17 = bArr[i16];
                        if (b17 <= -65 && ((b16 != -32 || b17 >= -96) && (b16 != -19 || b17 < -96))) {
                            i10 = i17 + 1;
                            if (bArr[i17] > -65) {
                            }
                        }
                        return -1;
                    } else if (i16 >= i11 - 2) {
                        return r1.a(i16, bArr, i11);
                    } else {
                        int i18 = i16 + 1;
                        byte b18 = bArr[i16];
                        if (b18 <= -65) {
                            if ((((b18 + 112) + (b16 << 28)) >> 30) == 0) {
                                int i19 = i18 + 1;
                                if (bArr[i18] <= -65) {
                                    i10 = i19 + 1;
                                    if (bArr[i19] > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                }
                i10 = i16;
            }
            return 0;
        }
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes.dex */
    public static class d extends IllegalArgumentException {
        public d(int i6, int i10) {
            super(defpackage.b.j("Unpaired surrogate at index ", i6, " of ", i10));
        }
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes.dex */
    public static final class e extends b {
        public static int f(long j10, byte[] bArr, int i6, int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return r1.e(i6, q1.i(bArr, j10), q1.i(bArr, j10 + 1));
                    }
                    throw new AssertionError();
                }
                return r1.d(i6, q1.i(bArr, j10));
            }
            b bVar = r1.f10029a;
            if (i6 > -12) {
                return -1;
            }
            return i6;
        }

        @Override // com.google.protobuf.r1.b
        public final String a(int i6, byte[] bArr, int i10) {
            Charset charset = y.f10086a;
            String str = new String(bArr, i6, i10, charset);
            if (!str.contains("�")) {
                return str;
            }
            if (Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i6, i10 + i6))) {
                return str;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // com.google.protobuf.r1.b
        public final String c(ByteBuffer byteBuffer, int i6, int i10) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            if ((i6 | i10 | ((byteBuffer.limit() - i6) - i10)) >= 0) {
                long j10 = q1.f10019c.j(q1.f10022g, byteBuffer) + i6;
                long j11 = i10 + j10;
                char[] cArr = new char[i10];
                int i11 = 0;
                while (j10 < j11) {
                    byte h10 = q1.h(j10);
                    if (h10 >= 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        break;
                    }
                    j10++;
                    cArr[i11] = (char) h10;
                    i11++;
                }
                while (true) {
                    int i12 = i11;
                    while (j10 < j11) {
                        long j12 = j10 + 1;
                        byte h11 = q1.h(j10);
                        if (h11 >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            cArr[i12] = (char) h11;
                            i12++;
                            j10 = j12;
                            while (j10 < j11) {
                                byte h12 = q1.h(j10);
                                if (h12 >= 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (!z11) {
                                    break;
                                }
                                j10++;
                                cArr[i12] = (char) h12;
                                i12++;
                            }
                        } else {
                            if (h11 < -32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                if (j12 < j11) {
                                    j10 = j12 + 1;
                                    a.b(h11, q1.h(j12), cArr, i12);
                                    i12++;
                                } else {
                                    throw InvalidProtocolBufferException.c();
                                }
                            } else {
                                if (h11 < -16) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    if (j12 < j11 - 1) {
                                        long j13 = j12 + 1;
                                        a.c(h11, q1.h(j12), q1.h(j13), cArr, i12);
                                        i12++;
                                        j10 = j13 + 1;
                                    } else {
                                        throw InvalidProtocolBufferException.c();
                                    }
                                } else if (j12 < j11 - 2) {
                                    long j14 = j12 + 1;
                                    byte h13 = q1.h(j12);
                                    long j15 = j14 + 1;
                                    byte h14 = q1.h(j14);
                                    j10 = j15 + 1;
                                    a.a(h11, h13, h14, q1.h(j15), cArr, i12);
                                    i11 = i12 + 1 + 1;
                                } else {
                                    throw InvalidProtocolBufferException.c();
                                }
                            }
                        }
                    }
                    return new String(cArr, 0, i12);
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i6), Integer.valueOf(i10)));
        }

        @Override // com.google.protobuf.r1.b
        public final int d(CharSequence charSequence, byte[] bArr, int i6, int i10) {
            long j10;
            char c10;
            long j11;
            int i11;
            long j12;
            long j13;
            char charAt;
            long j14 = i6;
            long j15 = i10 + j14;
            int length = charSequence.length();
            if (length <= i10 && bArr.length - i10 >= i6) {
                int i12 = 0;
                while (true) {
                    j10 = 1;
                    c10 = 128;
                    if (i12 >= length || (charAt = charSequence.charAt(i12)) >= 128) {
                        break;
                    }
                    q1.s(bArr, (byte) charAt, j14);
                    i12++;
                    j14 = 1 + j14;
                }
                if (i12 == length) {
                    return (int) j14;
                }
                while (i12 < length) {
                    char charAt2 = charSequence.charAt(i12);
                    if (charAt2 < c10 && j14 < j15) {
                        j11 = j14 + j10;
                        q1.s(bArr, (byte) charAt2, j14);
                    } else {
                        if (charAt2 < 2048 && j14 <= j15 - 2) {
                            long j16 = j14 + j10;
                            q1.s(bArr, (byte) ((charAt2 >>> 6) | 960), j14);
                            q1.s(bArr, (byte) ((charAt2 & '?') | 128), j16);
                            j13 = j16 + j10;
                            j12 = j10;
                        } else if ((charAt2 < 55296 || 57343 < charAt2) && j14 <= j15 - 3) {
                            long j17 = j14 + j10;
                            q1.s(bArr, (byte) ((charAt2 >>> '\f') | 480), j14);
                            long j18 = j17 + j10;
                            q1.s(bArr, (byte) (((charAt2 >>> 6) & 63) | 128), j17);
                            q1.s(bArr, (byte) ((charAt2 & '?') | 128), j18);
                            j11 = j18 + 1;
                        } else if (j14 <= j15 - 4) {
                            int i13 = i12 + 1;
                            if (i13 != length) {
                                char charAt3 = charSequence.charAt(i13);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    long j19 = j14 + 1;
                                    q1.s(bArr, (byte) ((codePoint >>> 18) | 240), j14);
                                    long j20 = j19 + 1;
                                    q1.s(bArr, (byte) (((codePoint >>> 12) & 63) | 128), j19);
                                    long j21 = j20 + 1;
                                    q1.s(bArr, (byte) (((codePoint >>> 6) & 63) | 128), j20);
                                    j12 = 1;
                                    j13 = j21 + 1;
                                    q1.s(bArr, (byte) ((codePoint & 63) | 128), j21);
                                    i12 = i13;
                                } else {
                                    i12 = i13;
                                }
                            }
                            throw new d(i12 - 1, length);
                        } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i11 = i12 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i11)))) {
                            throw new d(i12, length);
                        } else {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j14);
                        }
                        i12++;
                        c10 = 128;
                        long j22 = j12;
                        j14 = j13;
                        j10 = j22;
                    }
                    j13 = j11;
                    j12 = 1;
                    i12++;
                    c10 = 128;
                    long j222 = j12;
                    j14 = j13;
                    j10 = j222;
                }
                return (int) j14;
            }
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i6 + i10));
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
            if (com.google.protobuf.q1.i(r28, r8) > (-65)) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
            if (com.google.protobuf.q1.i(r28, r8) > (-65)) goto L31;
         */
        @Override // com.google.protobuf.r1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int e(int i6, int i10, int i11, byte[] bArr) {
            int i12;
            byte b10;
            long j10;
            if ((i10 | i11 | (bArr.length - i11)) >= 0) {
                long j11 = i10;
                long j12 = i11;
                if (i6 != 0) {
                    if (j11 >= j12) {
                        return i6;
                    }
                    byte b11 = (byte) i6;
                    if (b11 < -32) {
                        if (b11 >= -62) {
                            j10 = j11 + 1;
                        }
                        return -1;
                    } else if (b11 < -16) {
                        byte b12 = (byte) (~(i6 >> 8));
                        if (b12 == 0) {
                            long j13 = j11 + 1;
                            b12 = q1.i(bArr, j11);
                            if (j13 >= j12) {
                                return r1.d(b11, b12);
                            }
                            j11 = j13;
                        }
                        if (b12 <= -65 && ((b11 != -32 || b12 >= -96) && (b11 != -19 || b12 < -96))) {
                            j10 = j11 + 1;
                        }
                        return -1;
                    } else {
                        byte b13 = (byte) (~(i6 >> 8));
                        if (b13 == 0) {
                            long j14 = j11 + 1;
                            b13 = q1.i(bArr, j11);
                            if (j14 >= j12) {
                                return r1.d(b11, b13);
                            }
                            j11 = j14;
                            b10 = 0;
                        } else {
                            b10 = (byte) (i6 >> 16);
                        }
                        if (b10 == 0) {
                            long j15 = j11 + 1;
                            b10 = q1.i(bArr, j11);
                            if (j15 >= j12) {
                                return r1.e(b11, b13, b10);
                            }
                            j11 = j15;
                        }
                        if (b13 <= -65 && (((b13 + 112) + (b11 << 28)) >> 30) == 0 && b10 <= -65) {
                            long j16 = j11 + 1;
                            if (q1.i(bArr, j11) <= -65) {
                                j11 = j16;
                            }
                        }
                        return -1;
                    }
                    j11 = j10;
                }
                int i13 = (int) (j12 - j11);
                if (i13 < 16) {
                    i12 = 0;
                } else {
                    int i14 = 8 - (((int) j11) & 7);
                    long j17 = j11;
                    i12 = 0;
                    while (true) {
                        if (i12 >= i14) {
                            while (true) {
                                int i15 = i12 + 8;
                                if (i15 > i13 || (q1.o(q1.f + j17, bArr) & (-9187201950435737472L)) != 0) {
                                    break;
                                }
                                j17 += 8;
                                i12 = i15;
                            }
                            while (true) {
                                if (i12 < i13) {
                                    long j18 = j17 + 1;
                                    if (q1.i(bArr, j17) < 0) {
                                        break;
                                    }
                                    i12++;
                                    j17 = j18;
                                } else {
                                    i12 = i13;
                                    break;
                                }
                            }
                        } else {
                            long j19 = j17 + 1;
                            if (q1.i(bArr, j17) < 0) {
                                break;
                            }
                            i12++;
                            j17 = j19;
                        }
                    }
                }
                int i16 = i13 - i12;
                long j20 = j11 + i12;
                while (true) {
                    byte b14 = 0;
                    while (true) {
                        if (i16 <= 0) {
                            break;
                        }
                        long j21 = j20 + 1;
                        byte i17 = q1.i(bArr, j20);
                        if (i17 >= 0) {
                            i16--;
                            j20 = j21;
                            b14 = i17;
                        } else {
                            j20 = j21;
                            b14 = i17;
                            break;
                        }
                    }
                    if (i16 == 0) {
                        return 0;
                    }
                    int i18 = i16 - 1;
                    if (b14 < -32) {
                        if (i18 == 0) {
                            return b14;
                        }
                        i16 = i18 - 1;
                        if (b14 < -62) {
                            break;
                        }
                        long j22 = j20 + 1;
                        if (q1.i(bArr, j20) > -65) {
                            break;
                        }
                        j20 = j22;
                    } else if (b14 < -16) {
                        if (i18 < 2) {
                            return f(j20, bArr, b14, i18);
                        }
                        i16 = i18 - 2;
                        long j23 = j20 + 1;
                        byte i19 = q1.i(bArr, j20);
                        if (i19 > -65 || ((b14 == -32 && i19 < -96) || (b14 == -19 && i19 >= -96))) {
                            break;
                        }
                        j20 = j23 + 1;
                        if (q1.i(bArr, j23) > -65) {
                            break;
                        }
                    } else if (i18 < 3) {
                        return f(j20, bArr, b14, i18);
                    } else {
                        i16 = i18 - 3;
                        long j24 = j20 + 1;
                        byte i20 = q1.i(bArr, j20);
                        if (i20 > -65 || (((i20 + 112) + (b14 << 28)) >> 30) != 0) {
                            break;
                        }
                        long j25 = j24 + 1;
                        if (q1.i(bArr, j24) > -65) {
                            break;
                        }
                        long j26 = j25 + 1;
                        if (q1.i(bArr, j25) > -65) {
                            break;
                        }
                        j20 = j26;
                    }
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    static {
        boolean z10;
        b cVar;
        if (q1.f10021e && q1.f10020d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !com.google.protobuf.d.a()) {
            cVar = new e();
        } else {
            cVar = new c();
        }
        f10029a = cVar;
    }

    public static int a(int i6, byte[] bArr, int i10) {
        byte b10 = bArr[i6 - 1];
        int i11 = i10 - i6;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return e(b10, bArr[i6], bArr[i6 + 1]);
                }
                throw new AssertionError();
            }
            return d(b10, bArr[i6]);
        }
        if (b10 > -12) {
            b10 = -1;
        }
        return b10;
    }

    public static String b(ByteBuffer byteBuffer, int i6, int i10) {
        b bVar = f10029a;
        bVar.getClass();
        if (byteBuffer.hasArray()) {
            return bVar.a(byteBuffer.arrayOffset() + i6, byteBuffer.array(), i10);
        } else if (byteBuffer.isDirect()) {
            return bVar.c(byteBuffer, i6, i10);
        } else {
            return b.b(byteBuffer, i6, i10);
        }
    }

    public static int c(CharSequence charSequence) {
        int length = charSequence.length();
        int i6 = 0;
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = charSequence.length();
                while (i10 < length2) {
                    char charAt2 = charSequence.charAt(i10);
                    if (charAt2 < 2048) {
                        i6 += (127 - charAt2) >>> 31;
                    } else {
                        i6 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i10) >= 65536) {
                                i10++;
                            } else {
                                throw new d(i10, length2);
                            }
                        }
                    }
                    i10++;
                }
                i11 += i6;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    public static int d(int i6, int i10) {
        if (i6 <= -12 && i10 <= -65) {
            return i6 ^ (i10 << 8);
        }
        return -1;
    }

    public static int e(int i6, int i10, int i11) {
        if (i6 <= -12 && i10 <= -65 && i11 <= -65) {
            return (i6 ^ (i10 << 8)) ^ (i11 << 16);
        }
        return -1;
    }

    public static boolean f(int i6, byte[] bArr, int i10) {
        if (f10029a.e(0, i6, i10, bArr) != 0) {
            return false;
        }
        return true;
    }
}
