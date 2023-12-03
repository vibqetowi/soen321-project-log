package com.google.common.io;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import kotlin.jvm.internal.h;
/* loaded from: classes.dex */
public abstract class BaseEncoding {

    /* renamed from: a  reason: collision with root package name */
    public static final c f9523a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* loaded from: classes.dex */
    public static final class DecodingException extends IOException {
        public DecodingException(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f9524a;

        /* renamed from: b  reason: collision with root package name */
        public final char[] f9525b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9526c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9527d;

        /* renamed from: e  reason: collision with root package name */
        public final int f9528e;
        public final int f;

        /* renamed from: g  reason: collision with root package name */
        public final byte[] f9529g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean[] f9530h;

        public a(String str, char[] cArr) {
            String str2;
            boolean z10;
            boolean z11;
            this.f9524a = str;
            cArr.getClass();
            this.f9525b = cArr;
            try {
                int b10 = pc.a.b(cArr.length, RoundingMode.UNNECESSARY);
                this.f9527d = b10;
                int min = Math.min(8, Integer.lowestOneBit(b10));
                try {
                    this.f9528e = 8 / min;
                    this.f = b10 / min;
                    this.f9526c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i6 = 0; i6 < cArr.length; i6++) {
                        char c10 = cArr[i6];
                        if (c10 < 128) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            if (bArr[c10] == -1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                bArr[c10] = (byte) i6;
                            } else {
                                throw new IllegalArgumentException(h.P("Duplicate character: %s", Character.valueOf(c10)));
                            }
                        } else {
                            throw new IllegalArgumentException(h.P("Non-ASCII character: %s", Character.valueOf(c10)));
                        }
                    }
                    this.f9529g = bArr;
                    boolean[] zArr = new boolean[this.f9528e];
                    for (int i10 = 0; i10 < this.f; i10++) {
                        zArr[pc.a.a(i10 * 8, this.f9527d, RoundingMode.CEILING)] = true;
                    }
                    this.f9530h = zArr;
                } catch (ArithmeticException e10) {
                    String str3 = new String(cArr);
                    if (str3.length() != 0) {
                        str2 = "Illegal alphabet ".concat(str3);
                    } else {
                        str2 = new String("Illegal alphabet ");
                    }
                    throw new IllegalArgumentException(str2, e10);
                }
            } catch (ArithmeticException e11) {
                throw new IllegalArgumentException(defpackage.b.h(35, "Illegal alphabet length ", cArr.length), e11);
            }
        }

        public final int a(char c10) {
            String str;
            String str2;
            if (c10 > 127) {
                String valueOf = String.valueOf(Integer.toHexString(c10));
                if (valueOf.length() != 0) {
                    str2 = "Unrecognized character: 0x".concat(valueOf);
                } else {
                    str2 = new String("Unrecognized character: 0x");
                }
                throw new DecodingException(str2);
            }
            byte b10 = this.f9529g[c10];
            if (b10 == -1) {
                if (c10 > ' ' && c10 != 127) {
                    StringBuilder sb2 = new StringBuilder(25);
                    sb2.append("Unrecognized character: ");
                    sb2.append(c10);
                    throw new DecodingException(sb2.toString());
                }
                String valueOf2 = String.valueOf(Integer.toHexString(c10));
                if (valueOf2.length() != 0) {
                    str = "Unrecognized character: 0x".concat(valueOf2);
                } else {
                    str = new String("Unrecognized character: 0x");
                }
                throw new DecodingException(str);
            }
            return b10;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Arrays.equals(this.f9525b, ((a) obj).f9525b);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f9525b);
        }

        public final String toString() {
            return this.f9524a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends d {

        /* renamed from: d  reason: collision with root package name */
        public final char[] f9531d;

        public b(a aVar) {
            super(aVar, null);
            boolean z10;
            this.f9531d = new char[512];
            char[] cArr = aVar.f9525b;
            if (cArr.length == 16) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.t(z10);
            for (int i6 = 0; i6 < 256; i6++) {
                char[] cArr2 = this.f9531d;
                cArr2[i6] = cArr[i6 >>> 4];
                cArr2[i6 | 256] = cArr[i6 & 15];
            }
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        public final int b(byte[] bArr, CharSequence charSequence) {
            if (charSequence.length() % 2 != 1) {
                int i6 = 0;
                int i10 = 0;
                while (i6 < charSequence.length()) {
                    char charAt = charSequence.charAt(i6);
                    a aVar = this.f9532b;
                    bArr[i10] = (byte) ((aVar.a(charAt) << 4) | aVar.a(charSequence.charAt(i6 + 1)));
                    i6 += 2;
                    i10++;
                }
                return i10;
            }
            throw new DecodingException(defpackage.b.h(32, "Invalid input length ", charSequence.length()));
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        public final void d(StringBuilder sb2, byte[] bArr, int i6) {
            sc.b.y(0, 0 + i6, bArr.length);
            for (int i10 = 0; i10 < i6; i10++) {
                int i11 = bArr[0 + i10] & 255;
                char[] cArr = this.f9531d;
                sb2.append(cArr[i11]);
                sb2.append(cArr[i11 | 256]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.d
        public final BaseEncoding g(a aVar) {
            return new b(aVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends d {
        public c(String str, String str2, Character ch2) {
            this(new a(str, str2.toCharArray()), ch2);
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        public final int b(byte[] bArr, CharSequence charSequence) {
            CharSequence e10 = e(charSequence);
            int length = e10.length();
            a aVar = this.f9532b;
            if (aVar.f9530h[length % aVar.f9528e]) {
                int i6 = 0;
                int i10 = 0;
                while (i6 < e10.length()) {
                    int i11 = i6 + 1;
                    int i12 = i11 + 1;
                    int a10 = (aVar.a(e10.charAt(i6)) << 18) | (aVar.a(e10.charAt(i11)) << 12);
                    int i13 = i10 + 1;
                    bArr[i10] = (byte) (a10 >>> 16);
                    if (i12 < e10.length()) {
                        int i14 = i12 + 1;
                        int a11 = a10 | (aVar.a(e10.charAt(i12)) << 6);
                        int i15 = i13 + 1;
                        bArr[i13] = (byte) ((a11 >>> 8) & 255);
                        if (i14 < e10.length()) {
                            int i16 = i14 + 1;
                            int a12 = a11 | aVar.a(e10.charAt(i14));
                            i10 = i15 + 1;
                            bArr[i15] = (byte) (a12 & 255);
                            i6 = i16;
                        } else {
                            i6 = i14;
                            i10 = i15;
                        }
                    } else {
                        i10 = i13;
                        i6 = i12;
                    }
                }
                return i10;
            }
            throw new DecodingException(defpackage.b.h(32, "Invalid input length ", e10.length()));
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        public final void d(StringBuilder sb2, byte[] bArr, int i6) {
            int i10 = 0;
            int i11 = 0 + i6;
            sc.b.y(0, i11, bArr.length);
            while (i6 >= 3) {
                int i12 = i10 + 1;
                int i13 = i12 + 1;
                int i14 = ((bArr[i10] & 255) << 16) | ((bArr[i12] & 255) << 8) | (bArr[i13] & 255);
                a aVar = this.f9532b;
                sb2.append(aVar.f9525b[i14 >>> 18]);
                char[] cArr = aVar.f9525b;
                sb2.append(cArr[(i14 >>> 12) & 63]);
                sb2.append(cArr[(i14 >>> 6) & 63]);
                sb2.append(cArr[i14 & 63]);
                i6 -= 3;
                i10 = i13 + 1;
            }
            if (i10 < i11) {
                f(sb2, bArr, i10, i11 - i10);
            }
        }

        @Override // com.google.common.io.BaseEncoding.d
        public final BaseEncoding g(a aVar) {
            return new c(aVar, null);
        }

        public c(a aVar, Character ch2) {
            super(aVar, ch2);
            sc.b.t(aVar.f9525b.length == 64);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends BaseEncoding {

        /* renamed from: b  reason: collision with root package name */
        public final a f9532b;

        /* renamed from: c  reason: collision with root package name */
        public final Character f9533c;

        public d(String str, String str2, Character ch2) {
            this(new a(str, str2.toCharArray()), ch2);
        }

        @Override // com.google.common.io.BaseEncoding
        public int b(byte[] bArr, CharSequence charSequence) {
            int i6;
            int i10;
            CharSequence e10 = e(charSequence);
            int length = e10.length();
            a aVar = this.f9532b;
            if (aVar.f9530h[length % aVar.f9528e]) {
                int i11 = 0;
                int i12 = 0;
                while (i11 < e10.length()) {
                    long j10 = 0;
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        i6 = aVar.f9527d;
                        i10 = aVar.f9528e;
                        if (i13 >= i10) {
                            break;
                        }
                        j10 <<= i6;
                        if (i11 + i13 < e10.length()) {
                            j10 |= aVar.a(e10.charAt(i14 + i11));
                            i14++;
                        }
                        i13++;
                    }
                    int i15 = aVar.f;
                    int i16 = (i15 * 8) - (i14 * i6);
                    int i17 = (i15 - 1) * 8;
                    while (i17 >= i16) {
                        bArr[i12] = (byte) ((j10 >>> i17) & 255);
                        i17 -= 8;
                        i12++;
                    }
                    i11 += i10;
                }
                return i12;
            }
            throw new DecodingException(defpackage.b.h(32, "Invalid input length ", e10.length()));
        }

        @Override // com.google.common.io.BaseEncoding
        public void d(StringBuilder sb2, byte[] bArr, int i6) {
            sc.b.y(0, 0 + i6, bArr.length);
            int i10 = 0;
            while (i10 < i6) {
                a aVar = this.f9532b;
                f(sb2, bArr, 0 + i10, Math.min(aVar.f, i6 - i10));
                i10 += aVar.f;
            }
        }

        @Override // com.google.common.io.BaseEncoding
        public final CharSequence e(CharSequence charSequence) {
            Character ch2 = this.f9533c;
            if (ch2 == null) {
                return charSequence;
            }
            char charValue = ch2.charValue();
            int length = charSequence.length();
            do {
                length--;
                if (length < 0) {
                    break;
                }
            } while (charSequence.charAt(length) == charValue);
            return charSequence.subSequence(0, length + 1);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!this.f9532b.equals(dVar.f9532b) || !f6.b.v0(this.f9533c, dVar.f9533c)) {
                return false;
            }
            return true;
        }

        public final void f(StringBuilder sb2, byte[] bArr, int i6, int i10) {
            boolean z10;
            sc.b.y(i6, i6 + i10, bArr.length);
            a aVar = this.f9532b;
            int i11 = 0;
            if (i10 <= aVar.f) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.t(z10);
            long j10 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                j10 = (j10 | (bArr[i6 + i12] & 255)) << 8;
            }
            int i13 = aVar.f9527d;
            int i14 = ((i10 + 1) * 8) - i13;
            while (i11 < i10 * 8) {
                sb2.append(aVar.f9525b[((int) (j10 >>> (i14 - i11))) & aVar.f9526c]);
                i11 += i13;
            }
            Character ch2 = this.f9533c;
            if (ch2 != null) {
                while (i11 < aVar.f * 8) {
                    sb2.append(ch2.charValue());
                    i11 += i13;
                }
            }
        }

        public BaseEncoding g(a aVar) {
            return new d(aVar, null);
        }

        public final int hashCode() {
            return this.f9532b.hashCode() ^ Arrays.hashCode(new Object[]{this.f9533c});
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            a aVar = this.f9532b;
            sb2.append(aVar.f9524a);
            if (8 % aVar.f9527d != 0) {
                Character ch2 = this.f9533c;
                if (ch2 == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(ch2);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        public d(a aVar, Character ch2) {
            aVar.getClass();
            this.f9532b = aVar;
            boolean z10 = true;
            if (ch2 != null) {
                char charValue = ch2.charValue();
                byte[] bArr = aVar.f9529g;
                if (charValue < bArr.length && bArr[charValue] != -1) {
                    z10 = false;
                }
            }
            sc.b.m(ch2, "Padding character %s was already in alphabet", z10);
            this.f9533c = ch2;
        }
    }

    static {
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public final byte[] a(String str) {
        try {
            CharSequence e10 = e(str);
            int length = (int) (((((d) this).f9532b.f9527d * e10.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int b10 = b(bArr, e10);
            if (b10 != length) {
                byte[] bArr2 = new byte[b10];
                System.arraycopy(bArr, 0, bArr2, 0, b10);
                return bArr2;
            }
            return bArr;
        } catch (DecodingException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public abstract int b(byte[] bArr, CharSequence charSequence);

    public final String c(byte[] bArr) {
        int length = bArr.length;
        sc.b.y(0, length + 0, bArr.length);
        a aVar = ((d) this).f9532b;
        StringBuilder sb2 = new StringBuilder(pc.a.a(length, aVar.f, RoundingMode.CEILING) * aVar.f9528e);
        try {
            d(sb2, bArr, length);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract void d(StringBuilder sb2, byte[] bArr, int i6);

    public abstract CharSequence e(CharSequence charSequence);
}
