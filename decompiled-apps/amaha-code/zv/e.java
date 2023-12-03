package zv;

import com.appsflyer.R;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.theinnerhour.b2b.utils.Constants;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
/* compiled from: Buffer.kt */
/* loaded from: classes2.dex */
public final class e implements h, g, Cloneable, ByteChannel {

    /* renamed from: u  reason: collision with root package name */
    public u f39884u;

    /* renamed from: v  reason: collision with root package name */
    public long f39885v;

    @Override // zv.h
    public final boolean B() {
        if (this.f39885v == 0) {
            return true;
        }
        return false;
    }

    public final void B0(i byteString) {
        kotlin.jvm.internal.i.g(byteString, "byteString");
        byteString.v(this, byteString.h());
    }

    @Override // zv.h
    public final void C0(long j10) {
        if (this.f39885v >= j10) {
            return;
        }
        throw new EOFException();
    }

    @Override // zv.g
    public final /* bridge */ /* synthetic */ g E0(long j10) {
        M0(j10);
        return this;
    }

    @Override // zv.h
    public final int F0(q options) {
        kotlin.jvm.internal.i.g(options, "options");
        int b10 = aw.a.b(this, options, false);
        if (b10 == -1) {
            return -1;
        }
        skip(options.f39907u[b10].h());
        return b10;
    }

    public final long G(byte b10, long j10, long j11) {
        long j12;
        u uVar;
        long j13 = j10;
        boolean z10 = false;
        long j14 = 0;
        if (0 <= j13 && j13 <= j11) {
            z10 = true;
        }
        if (z10) {
            long j15 = this.f39885v;
            if (j11 > j15) {
                j12 = j15;
            } else {
                j12 = j11;
            }
            if (j13 == j12 || (uVar = this.f39884u) == null) {
                return -1L;
            }
            if (j15 - j13 < j13) {
                while (j15 > j13) {
                    uVar = uVar.f39923g;
                    kotlin.jvm.internal.i.d(uVar);
                    j15 -= uVar.f39920c - uVar.f39919b;
                }
                while (j15 < j12) {
                    int min = (int) Math.min(uVar.f39920c, (uVar.f39919b + j12) - j15);
                    for (int i6 = (int) ((uVar.f39919b + j13) - j15); i6 < min; i6++) {
                        if (uVar.f39918a[i6] == b10) {
                            return (i6 - uVar.f39919b) + j15;
                        }
                    }
                    j15 += uVar.f39920c - uVar.f39919b;
                    uVar = uVar.f;
                    kotlin.jvm.internal.i.d(uVar);
                    j13 = j15;
                }
                return -1L;
            }
            while (true) {
                long j16 = (uVar.f39920c - uVar.f39919b) + j14;
                if (j16 > j13) {
                    break;
                }
                uVar = uVar.f;
                kotlin.jvm.internal.i.d(uVar);
                j14 = j16;
            }
            while (j14 < j12) {
                int min2 = (int) Math.min(uVar.f39920c, (uVar.f39919b + j12) - j14);
                for (int i10 = (int) ((uVar.f39919b + j13) - j14); i10 < min2; i10++) {
                    if (uVar.f39918a[i10] == b10) {
                        return (i10 - uVar.f39919b) + j14;
                    }
                }
                j14 += uVar.f39920c - uVar.f39919b;
                uVar = uVar.f;
                kotlin.jvm.internal.i.d(uVar);
                j13 = j14;
            }
            return -1L;
        }
        throw new IllegalArgumentException(("size=" + this.f39885v + " fromIndex=" + j13 + " toIndex=" + j11).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093 A[EDGE_INSN: B:42:0x0093->B:37:0x0093 ?: BREAK  , SYNTHETIC] */
    @Override // zv.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long I0() {
        int i6;
        if (this.f39885v != 0) {
            int i10 = 0;
            long j10 = 0;
            boolean z10 = false;
            do {
                u uVar = this.f39884u;
                kotlin.jvm.internal.i.d(uVar);
                int i11 = uVar.f39919b;
                int i12 = uVar.f39920c;
                while (i11 < i12) {
                    byte b10 = uVar.f39918a[i11];
                    byte b11 = (byte) 48;
                    if (b10 >= b11 && b10 <= ((byte) 57)) {
                        i6 = b10 - b11;
                    } else {
                        byte b12 = (byte) 97;
                        if ((b10 >= b12 && b10 <= ((byte) R.styleable.AppCompatTheme_textAppearanceLargePopupMenu)) || (b10 >= (b12 = (byte) 65) && b10 <= ((byte) 70))) {
                            i6 = (b10 - b12) + 10;
                        } else if (i10 != 0) {
                            z10 = true;
                            if (i11 != i12) {
                                this.f39884u = uVar.a();
                                v.a(uVar);
                            } else {
                                uVar.f39919b = i11;
                            }
                            if (!z10) {
                                break;
                            }
                        } else {
                            throw new NumberFormatException(kotlin.jvm.internal.i.n(ta.v.Q(b10), "Expected leading [0-9a-fA-F] character but was 0x"));
                        }
                    }
                    if (((-1152921504606846976L) & j10) == 0) {
                        j10 = (j10 << 4) | i6;
                        i11++;
                        i10++;
                    } else {
                        e eVar = new e();
                        eVar.N0(j10);
                        eVar.L0(b10);
                        throw new NumberFormatException(kotlin.jvm.internal.i.n(eVar.k0(), "Number too large: "));
                    }
                }
                if (i11 != i12) {
                }
                if (!z10) {
                }
            } while (this.f39884u != null);
            this.f39885v -= i10;
            return j10;
        }
        throw new EOFException();
    }

    public final long J(i targetBytes, long j10) {
        boolean z10;
        int i6;
        int i10;
        int i11;
        int i12;
        kotlin.jvm.internal.i.g(targetBytes, "targetBytes");
        long j11 = 0;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            u uVar = this.f39884u;
            if (uVar != null) {
                long j12 = this.f39885v;
                if (j12 - j10 < j10) {
                    while (j12 > j10) {
                        uVar = uVar.f39923g;
                        kotlin.jvm.internal.i.d(uVar);
                        j12 -= uVar.f39920c - uVar.f39919b;
                    }
                    byte[] bArr = targetBytes.f39889u;
                    if (bArr.length == 2) {
                        byte b10 = bArr[0];
                        byte b11 = bArr[1];
                        while (j12 < this.f39885v) {
                            i11 = (int) ((uVar.f39919b + j10) - j12);
                            int i13 = uVar.f39920c;
                            while (i11 < i13) {
                                byte b12 = uVar.f39918a[i11];
                                if (b12 != b10 && b12 != b11) {
                                    i11++;
                                } else {
                                    i12 = uVar.f39919b;
                                    return (i11 - i12) + j12;
                                }
                            }
                            j12 += uVar.f39920c - uVar.f39919b;
                            uVar = uVar.f;
                            kotlin.jvm.internal.i.d(uVar);
                            j10 = j12;
                        }
                    } else {
                        while (j12 < this.f39885v) {
                            i11 = (int) ((uVar.f39919b + j10) - j12);
                            int i14 = uVar.f39920c;
                            while (i11 < i14) {
                                byte b13 = uVar.f39918a[i11];
                                int length = bArr.length;
                                int i15 = 0;
                                while (i15 < length) {
                                    byte b14 = bArr[i15];
                                    i15++;
                                    if (b13 == b14) {
                                        i12 = uVar.f39919b;
                                        return (i11 - i12) + j12;
                                    }
                                }
                                i11++;
                            }
                            j12 += uVar.f39920c - uVar.f39919b;
                            uVar = uVar.f;
                            kotlin.jvm.internal.i.d(uVar);
                            j10 = j12;
                        }
                    }
                } else {
                    while (true) {
                        long j13 = (uVar.f39920c - uVar.f39919b) + j11;
                        if (j13 > j10) {
                            break;
                        }
                        uVar = uVar.f;
                        kotlin.jvm.internal.i.d(uVar);
                        j11 = j13;
                    }
                    byte[] bArr2 = targetBytes.f39889u;
                    if (bArr2.length == 2) {
                        byte b15 = bArr2[0];
                        byte b16 = bArr2[1];
                        while (j11 < this.f39885v) {
                            i6 = (int) ((uVar.f39919b + j10) - j11);
                            int i16 = uVar.f39920c;
                            while (i6 < i16) {
                                byte b17 = uVar.f39918a[i6];
                                if (b17 != b15 && b17 != b16) {
                                    i6++;
                                } else {
                                    i10 = uVar.f39919b;
                                    return (i6 - i10) + j11;
                                }
                            }
                            j11 += uVar.f39920c - uVar.f39919b;
                            uVar = uVar.f;
                            kotlin.jvm.internal.i.d(uVar);
                            j10 = j11;
                        }
                    } else {
                        while (j11 < this.f39885v) {
                            i6 = (int) ((uVar.f39919b + j10) - j11);
                            int i17 = uVar.f39920c;
                            while (i6 < i17) {
                                byte b18 = uVar.f39918a[i6];
                                int length2 = bArr2.length;
                                int i18 = 0;
                                while (i18 < length2) {
                                    byte b19 = bArr2[i18];
                                    i18++;
                                    if (b18 == b19) {
                                        i10 = uVar.f39919b;
                                        return (i6 - i10) + j11;
                                    }
                                }
                                i6++;
                            }
                            j11 += uVar.f39920c - uVar.f39919b;
                            uVar = uVar.f;
                            kotlin.jvm.internal.i.d(uVar);
                            j10 = j11;
                        }
                    }
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Long.valueOf(j10), "fromIndex < 0: ").toString());
    }

    @Override // zv.h
    public final InputStream J0() {
        return new a();
    }

    public final void K0(z source) {
        kotlin.jvm.internal.i.g(source, "source");
        do {
        } while (source.o0(this, 8192L) != -1);
    }

    @Override // zv.h
    public final String L(long j10) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            byte b10 = (byte) 10;
            long G = G(b10, 0L, j11);
            if (G != -1) {
                return aw.a.a(this, G);
            }
            if (j11 < this.f39885v && m(j11 - 1) == ((byte) 13) && m(j11) == b10) {
                return aw.a.a(this, j11);
            }
            e eVar = new e();
            j(eVar, 0L, Math.min(32, this.f39885v));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f39885v, j10) + " content=" + eVar.e0().i() + (char) 8230);
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Long.valueOf(j10), "limit < 0: ").toString());
    }

    public final void L0(int i6) {
        u w02 = w0(1);
        int i10 = w02.f39920c;
        w02.f39920c = i10 + 1;
        w02.f39918a[i10] = (byte) i6;
        this.f39885v++;
    }

    public final e M0(long j10) {
        boolean z10;
        byte[] bArr;
        int i6 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i6 == 0) {
            L0(48);
        } else {
            int i10 = 1;
            if (i6 < 0) {
                j10 = -j10;
                if (j10 < 0) {
                    R0("-9223372036854775808");
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if (j10 < 100000000) {
                if (j10 < 10000) {
                    if (j10 < 100) {
                        if (j10 >= 10) {
                            i10 = 2;
                        }
                    } else if (j10 < 1000) {
                        i10 = 3;
                    } else {
                        i10 = 4;
                    }
                } else if (j10 < 1000000) {
                    if (j10 < 100000) {
                        i10 = 5;
                    } else {
                        i10 = 6;
                    }
                } else if (j10 < 10000000) {
                    i10 = 7;
                } else {
                    i10 = 8;
                }
            } else if (j10 < 1000000000000L) {
                if (j10 < 10000000000L) {
                    if (j10 < 1000000000) {
                        i10 = 9;
                    } else {
                        i10 = 10;
                    }
                } else if (j10 < 100000000000L) {
                    i10 = 11;
                } else {
                    i10 = 12;
                }
            } else if (j10 < 1000000000000000L) {
                if (j10 < 10000000000000L) {
                    i10 = 13;
                } else if (j10 < 100000000000000L) {
                    i10 = 14;
                } else {
                    i10 = 15;
                }
            } else if (j10 < 100000000000000000L) {
                if (j10 < 10000000000000000L) {
                    i10 = 16;
                } else {
                    i10 = 17;
                }
            } else if (j10 < 1000000000000000000L) {
                i10 = 18;
            } else {
                i10 = 19;
            }
            if (z10) {
                i10++;
            }
            u w02 = w0(i10);
            int i11 = w02.f39920c + i10;
            while (true) {
                bArr = w02.f39918a;
                if (j10 == 0) {
                    break;
                }
                long j11 = 10;
                i11--;
                bArr[i11] = aw.a.f3901a[(int) (j10 % j11)];
                j10 /= j11;
            }
            if (z10) {
                bArr[i11 - 1] = (byte) 45;
            }
            w02.f39920c += i10;
            this.f39885v += i10;
        }
        return this;
    }

    public final e N0(long j10) {
        if (j10 == 0) {
            L0(48);
        } else {
            long j11 = (j10 >>> 1) | j10;
            long j12 = j11 | (j11 >>> 2);
            long j13 = j12 | (j12 >>> 4);
            long j14 = j13 | (j13 >>> 8);
            long j15 = j14 | (j14 >>> 16);
            long j16 = j15 | (j15 >>> 32);
            long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
            long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
            long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
            long j20 = j19 + (j19 >>> 8);
            long j21 = j20 + (j20 >>> 16);
            int i6 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
            u w02 = w0(i6);
            int i10 = w02.f39920c;
            for (int i11 = (i10 + i6) - 1; i11 >= i10; i11--) {
                w02.f39918a[i11] = aw.a.f3901a[(int) (15 & j10)];
                j10 >>>= 4;
            }
            w02.f39920c += i6;
            this.f39885v += i6;
        }
        return this;
    }

    public final void O0(int i6) {
        u w02 = w0(4);
        int i10 = w02.f39920c;
        int i11 = i10 + 1;
        byte[] bArr = w02.f39918a;
        bArr[i10] = (byte) ((i6 >>> 24) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i6 >>> 16) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i6 >>> 8) & 255);
        bArr[i13] = (byte) (i6 & 255);
        w02.f39920c = i13 + 1;
        this.f39885v += 4;
    }

    public final void P0(int i6) {
        u w02 = w0(2);
        int i10 = w02.f39920c;
        int i11 = i10 + 1;
        byte[] bArr = w02.f39918a;
        bArr[i10] = (byte) ((i6 >>> 8) & 255);
        bArr[i11] = (byte) (i6 & 255);
        w02.f39920c = i11 + 1;
        this.f39885v += 2;
    }

    public final void Q0(int i6, int i10, String string) {
        boolean z10;
        boolean z11;
        boolean z12;
        char charAt;
        char c10;
        boolean z13;
        kotlin.jvm.internal.i.g(string, "string");
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 >= i6) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i10 <= string.length()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    while (i6 < i10) {
                        char charAt2 = string.charAt(i6);
                        if (charAt2 < 128) {
                            u w02 = w0(1);
                            int i11 = w02.f39920c - i6;
                            int min = Math.min(i10, 8192 - i11);
                            int i12 = i6 + 1;
                            byte[] bArr = w02.f39918a;
                            bArr[i6 + i11] = (byte) charAt2;
                            while (true) {
                                i6 = i12;
                                if (i6 >= min || (charAt = string.charAt(i6)) >= 128) {
                                    break;
                                }
                                i12 = i6 + 1;
                                bArr[i6 + i11] = (byte) charAt;
                            }
                            int i13 = w02.f39920c;
                            int i14 = (i11 + i6) - i13;
                            w02.f39920c = i13 + i14;
                            this.f39885v += i14;
                        } else {
                            if (charAt2 < 2048) {
                                u w03 = w0(2);
                                int i15 = w03.f39920c;
                                byte[] bArr2 = w03.f39918a;
                                bArr2[i15] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i15 + 1] = (byte) ((charAt2 & '?') | 128);
                                w03.f39920c = i15 + 2;
                                this.f39885v += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i16 = i6 + 1;
                                if (i16 < i10) {
                                    c10 = string.charAt(i16);
                                } else {
                                    c10 = 0;
                                }
                                if (charAt2 <= 56319) {
                                    if (56320 <= c10 && c10 <= 57343) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        int i17 = (((charAt2 & 1023) << 10) | (c10 & 1023)) + 65536;
                                        u w04 = w0(4);
                                        int i18 = w04.f39920c;
                                        byte[] bArr3 = w04.f39918a;
                                        bArr3[i18] = (byte) ((i17 >> 18) | 240);
                                        bArr3[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                                        bArr3[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                                        bArr3[i18 + 3] = (byte) ((i17 & 63) | 128);
                                        w04.f39920c = i18 + 4;
                                        this.f39885v += 4;
                                        i6 += 2;
                                    }
                                }
                                L0(63);
                                i6 = i16;
                            } else {
                                u w05 = w0(3);
                                int i19 = w05.f39920c;
                                byte[] bArr4 = w05.f39918a;
                                bArr4[i19] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i19 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i19 + 2] = (byte) ((charAt2 & '?') | 128);
                                w05.f39920c = i19 + 3;
                                this.f39885v += 3;
                            }
                            i6++;
                        }
                    }
                    return;
                }
                StringBuilder u10 = defpackage.c.u("endIndex > string.length: ", i10, " > ");
                u10.append(string.length());
                throw new IllegalArgumentException(u10.toString().toString());
            }
            throw new IllegalArgumentException(defpackage.b.j("endIndex < beginIndex: ", i10, " < ", i6).toString());
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Integer.valueOf(i6), "beginIndex < 0: ").toString());
    }

    public final void R0(String string) {
        kotlin.jvm.internal.i.g(string, "string");
        Q0(0, string.length(), string);
    }

    @Override // zv.h
    public final long S(e eVar) {
        long j10 = this.f39885v;
        if (j10 > 0) {
            eVar.n(this, j10);
        }
        return j10;
    }

    public final void S0(int i6) {
        boolean z10;
        String str;
        if (i6 < 128) {
            L0(i6);
        } else if (i6 < 2048) {
            u w02 = w0(2);
            int i10 = w02.f39920c;
            byte[] bArr = w02.f39918a;
            bArr[i10] = (byte) ((i6 >> 6) | 192);
            bArr[i10 + 1] = (byte) ((i6 & 63) | 128);
            w02.f39920c = i10 + 2;
            this.f39885v += 2;
        } else {
            int i11 = 0;
            if (55296 <= i6 && i6 <= 57343) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                L0(63);
            } else if (i6 < 65536) {
                u w03 = w0(3);
                int i12 = w03.f39920c;
                byte[] bArr2 = w03.f39918a;
                bArr2[i12] = (byte) ((i6 >> 12) | 224);
                bArr2[i12 + 1] = (byte) (((i6 >> 6) & 63) | 128);
                bArr2[i12 + 2] = (byte) ((i6 & 63) | 128);
                w03.f39920c = i12 + 3;
                this.f39885v += 3;
            } else if (i6 <= 1114111) {
                u w04 = w0(4);
                int i13 = w04.f39920c;
                byte[] bArr3 = w04.f39918a;
                bArr3[i13] = (byte) ((i6 >> 18) | 240);
                bArr3[i13 + 1] = (byte) (((i6 >> 12) & 63) | 128);
                bArr3[i13 + 2] = (byte) (((i6 >> 6) & 63) | 128);
                bArr3[i13 + 3] = (byte) ((i6 & 63) | 128);
                w04.f39920c = i13 + 4;
                this.f39885v += 4;
            } else {
                if (i6 != 0) {
                    char[] cArr = sc.b.f31420u;
                    char[] cArr2 = {cArr[(i6 >> 28) & 15], cArr[(i6 >> 24) & 15], cArr[(i6 >> 20) & 15], cArr[(i6 >> 16) & 15], cArr[(i6 >> 12) & 15], cArr[(i6 >> 8) & 15], cArr[(i6 >> 4) & 15], cArr[i6 & 15]};
                    while (i11 < 8 && cArr2[i11] == '0') {
                        i11++;
                    }
                    if (i11 >= 0) {
                        if (i11 <= 8) {
                            str = new String(cArr2, i11, 8 - i11);
                        } else {
                            throw new IllegalArgumentException(defpackage.c.q("startIndex: ", i11, " > endIndex: 8"));
                        }
                    } else {
                        throw new IndexOutOfBoundsException(defpackage.c.q("startIndex: ", i11, ", endIndex: 8, size: 8"));
                    }
                } else {
                    str = "0";
                }
                throw new IllegalArgumentException(kotlin.jvm.internal.i.n(str, "Unexpected code point: 0x"));
            }
        }
    }

    @Override // zv.g
    public final /* bridge */ /* synthetic */ g T(String str) {
        R0(str);
        return this;
    }

    @Override // zv.h
    public final String V(Charset charset) {
        return h0(this.f39885v, charset);
    }

    @Override // zv.g
    public final /* bridge */ /* synthetic */ g Z(long j10) {
        N0(j10);
        return this;
    }

    public final void a() {
        skip(this.f39885v);
    }

    public final byte[] c0(long j10) {
        boolean z10;
        int i6 = 0;
        if (j10 >= 0 && j10 <= 2147483647L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f39885v >= j10) {
                int i10 = (int) j10;
                byte[] bArr = new byte[i10];
                while (i6 < i10) {
                    int read = read(bArr, i6, i10 - i6);
                    if (read != -1) {
                        i6 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Long.valueOf(j10), "byteCount: ").toString());
    }

    @Override // zv.z
    public final a0 d() {
        return a0.f39875d;
    }

    @Override // zv.h
    public final boolean d0(long j10) {
        if (this.f39885v >= j10) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final e clone() {
        e eVar = new e();
        if (this.f39885v != 0) {
            u uVar = this.f39884u;
            kotlin.jvm.internal.i.d(uVar);
            u c10 = uVar.c();
            eVar.f39884u = c10;
            c10.f39923g = c10;
            c10.f = c10;
            for (u uVar2 = uVar.f; uVar2 != uVar; uVar2 = uVar2.f) {
                u uVar3 = c10.f39923g;
                kotlin.jvm.internal.i.d(uVar3);
                kotlin.jvm.internal.i.d(uVar2);
                uVar3.b(uVar2.c());
            }
            eVar.f39885v = this.f39885v;
        }
        return eVar;
    }

    public final i e0() {
        return p(this.f39885v);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                long j10 = this.f39885v;
                e eVar = (e) obj;
                if (j10 == eVar.f39885v) {
                    if (j10 != 0) {
                        u uVar = this.f39884u;
                        kotlin.jvm.internal.i.d(uVar);
                        u uVar2 = eVar.f39884u;
                        kotlin.jvm.internal.i.d(uVar2);
                        int i6 = uVar.f39919b;
                        int i10 = uVar2.f39919b;
                        long j11 = 0;
                        while (j11 < this.f39885v) {
                            long min = Math.min(uVar.f39920c - i6, uVar2.f39920c - i10);
                            if (0 < min) {
                                long j12 = 0;
                                do {
                                    j12++;
                                    int i11 = i6 + 1;
                                    byte b10 = uVar.f39918a[i6];
                                    int i12 = i10 + 1;
                                    if (b10 == uVar2.f39918a[i10]) {
                                        i10 = i12;
                                        i6 = i11;
                                    }
                                } while (j12 < min);
                                if (i6 == uVar.f39920c) {
                                    u uVar3 = uVar.f;
                                    kotlin.jvm.internal.i.d(uVar3);
                                    i6 = uVar3.f39919b;
                                    uVar = uVar3;
                                }
                                if (i10 != uVar2.f39920c) {
                                    uVar2 = uVar2.f;
                                    kotlin.jvm.internal.i.d(uVar2);
                                    i10 = uVar2.f39919b;
                                }
                                j11 += min;
                            } else {
                                if (i6 == uVar.f39920c) {
                                }
                                if (i10 != uVar2.f39920c) {
                                }
                                j11 += min;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long f0() {
        int i6;
        String str;
        long j10 = 0;
        if (this.f39885v != 0) {
            int i10 = 0;
            long j11 = -7;
            boolean z10 = false;
            boolean z11 = false;
            do {
                u uVar = this.f39884u;
                kotlin.jvm.internal.i.d(uVar);
                int i11 = uVar.f39919b;
                int i12 = uVar.f39920c;
                while (i11 < i12) {
                    byte b10 = uVar.f39918a[i11];
                    byte b11 = (byte) 48;
                    if (b10 >= b11 && b10 <= ((byte) 57)) {
                        int i13 = b11 - b10;
                        int i14 = (j10 > (-922337203685477580L) ? 1 : (j10 == (-922337203685477580L) ? 0 : -1));
                        if (i14 >= 0 && (i14 != 0 || i13 >= j11)) {
                            j10 = (j10 * 10) + i13;
                        } else {
                            e eVar = new e();
                            eVar.M0(j10);
                            eVar.L0(b10);
                            if (!z10) {
                                eVar.readByte();
                            }
                            throw new NumberFormatException(kotlin.jvm.internal.i.n(eVar.k0(), "Number too large: "));
                        }
                    } else if (b10 == ((byte) 45) && i10 == 0) {
                        j11--;
                        z10 = true;
                    } else {
                        z11 = true;
                        break;
                    }
                    i11++;
                    i10++;
                }
                if (i11 == i12) {
                    this.f39884u = uVar.a();
                    v.a(uVar);
                } else {
                    uVar.f39919b = i11;
                }
                if (z11) {
                    break;
                }
            } while (this.f39884u != null);
            long j12 = this.f39885v - i10;
            this.f39885v = j12;
            if (z10) {
                i6 = 2;
            } else {
                i6 = 1;
            }
            if (i10 < i6) {
                if (j12 != 0) {
                    if (z10) {
                        str = "Expected a digit";
                    } else {
                        str = "Expected a digit or '-'";
                    }
                    StringBuilder d10 = v.g.d(str, " but was 0x");
                    d10.append(ta.v.Q(m(0L)));
                    throw new NumberFormatException(d10.toString());
                }
                throw new EOFException();
            } else if (!z10) {
                return -j10;
            } else {
                return j10;
            }
        }
        throw new EOFException();
    }

    public final long h() {
        long j10 = this.f39885v;
        if (j10 == 0) {
            return 0L;
        }
        u uVar = this.f39884u;
        kotlin.jvm.internal.i.d(uVar);
        u uVar2 = uVar.f39923g;
        kotlin.jvm.internal.i.d(uVar2);
        int i6 = uVar2.f39920c;
        if (i6 < 8192 && uVar2.f39922e) {
            j10 -= i6 - uVar2.f39919b;
        }
        return j10;
    }

    public final String h0(long j10, Charset charset) {
        boolean z10;
        kotlin.jvm.internal.i.g(charset, "charset");
        int i6 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i6 >= 0 && j10 <= 2147483647L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f39885v >= j10) {
                if (i6 == 0) {
                    return "";
                }
                u uVar = this.f39884u;
                kotlin.jvm.internal.i.d(uVar);
                int i10 = uVar.f39919b;
                if (i10 + j10 > uVar.f39920c) {
                    return new String(c0(j10), charset);
                }
                int i11 = (int) j10;
                String str = new String(uVar.f39918a, i10, i11, charset);
                int i12 = uVar.f39919b + i11;
                uVar.f39919b = i12;
                this.f39885v -= j10;
                if (i12 == uVar.f39920c) {
                    this.f39884u = uVar.a();
                    v.a(uVar);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Long.valueOf(j10), "byteCount: ").toString());
    }

    public final int hashCode() {
        u uVar = this.f39884u;
        if (uVar == null) {
            return 0;
        }
        int i6 = 1;
        do {
            int i10 = uVar.f39920c;
            for (int i11 = uVar.f39919b; i11 < i10; i11++) {
                i6 = (i6 * 31) + uVar.f39918a[i11];
            }
            uVar = uVar.f;
            kotlin.jvm.internal.i.d(uVar);
        } while (uVar != this.f39884u);
        return i6;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j(e out, long j10, long j11) {
        kotlin.jvm.internal.i.g(out, "out");
        ta.v.m(this.f39885v, j10, j11);
        if (j11 != 0) {
            out.f39885v += j11;
            u uVar = this.f39884u;
            while (true) {
                kotlin.jvm.internal.i.d(uVar);
                long j12 = uVar.f39920c - uVar.f39919b;
                if (j10 < j12) {
                    break;
                }
                j10 -= j12;
                uVar = uVar.f;
            }
            while (j11 > 0) {
                kotlin.jvm.internal.i.d(uVar);
                u c10 = uVar.c();
                int i6 = c10.f39919b + ((int) j10);
                c10.f39919b = i6;
                c10.f39920c = Math.min(i6 + ((int) j11), c10.f39920c);
                u uVar2 = out.f39884u;
                if (uVar2 == null) {
                    c10.f39923g = c10;
                    c10.f = c10;
                    out.f39884u = c10;
                } else {
                    u uVar3 = uVar2.f39923g;
                    kotlin.jvm.internal.i.d(uVar3);
                    uVar3.b(c10);
                }
                j11 -= c10.f39920c - c10.f39919b;
                uVar = uVar.f;
                j10 = 0;
            }
        }
    }

    @Override // zv.h
    public final String j0() {
        return L(Long.MAX_VALUE);
    }

    public final String k0() {
        return h0(this.f39885v, gv.a.f16927b);
    }

    public final String l0(long j10) {
        return h0(j10, gv.a.f16927b);
    }

    public final byte m(long j10) {
        ta.v.m(this.f39885v, j10, 1L);
        u uVar = this.f39884u;
        if (uVar != null) {
            long j11 = this.f39885v;
            if (j11 - j10 < j10) {
                while (j11 > j10) {
                    uVar = uVar.f39923g;
                    kotlin.jvm.internal.i.d(uVar);
                    j11 -= uVar.f39920c - uVar.f39919b;
                }
                return uVar.f39918a[(int) ((uVar.f39919b + j10) - j11)];
            }
            long j12 = 0;
            while (true) {
                int i6 = uVar.f39920c;
                int i10 = uVar.f39919b;
                long j13 = (i6 - i10) + j12;
                if (j13 > j10) {
                    return uVar.f39918a[(int) ((i10 + j10) - j12)];
                }
                uVar = uVar.f;
                kotlin.jvm.internal.i.d(uVar);
                j12 = j13;
            }
        } else {
            kotlin.jvm.internal.i.d(null);
            throw null;
        }
    }

    @Override // zv.x
    public final void n(e source, long j10) {
        boolean z10;
        u uVar;
        boolean z11;
        int i6;
        u uVar2;
        boolean z12;
        u b10;
        int i10;
        kotlin.jvm.internal.i.g(source, "source");
        if (source != this) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ta.v.m(source.f39885v, 0L, j10);
            while (j10 > 0) {
                u uVar3 = source.f39884u;
                kotlin.jvm.internal.i.d(uVar3);
                int i11 = uVar3.f39920c;
                kotlin.jvm.internal.i.d(source.f39884u);
                if (j10 < i11 - uVar.f39919b) {
                    u uVar4 = this.f39884u;
                    if (uVar4 != null) {
                        uVar2 = uVar4.f39923g;
                    } else {
                        uVar2 = null;
                    }
                    if (uVar2 != null && uVar2.f39922e) {
                        long j11 = uVar2.f39920c + j10;
                        if (uVar2.f39921d) {
                            i10 = 0;
                        } else {
                            i10 = uVar2.f39919b;
                        }
                        if (j11 - i10 <= 8192) {
                            u uVar5 = source.f39884u;
                            kotlin.jvm.internal.i.d(uVar5);
                            uVar5.d(uVar2, (int) j10);
                            source.f39885v -= j10;
                            this.f39885v += j10;
                            return;
                        }
                    }
                    u uVar6 = source.f39884u;
                    kotlin.jvm.internal.i.d(uVar6);
                    int i12 = (int) j10;
                    if (i12 > 0 && i12 <= uVar6.f39920c - uVar6.f39919b) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        if (i12 >= 1024) {
                            b10 = uVar6.c();
                        } else {
                            b10 = v.b();
                            int i13 = uVar6.f39919b;
                            is.i.I1(0, i13, i13 + i12, uVar6.f39918a, b10.f39918a);
                        }
                        b10.f39920c = b10.f39919b + i12;
                        uVar6.f39919b += i12;
                        u uVar7 = uVar6.f39923g;
                        kotlin.jvm.internal.i.d(uVar7);
                        uVar7.b(b10);
                        source.f39884u = b10;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                u uVar8 = source.f39884u;
                kotlin.jvm.internal.i.d(uVar8);
                long j12 = uVar8.f39920c - uVar8.f39919b;
                source.f39884u = uVar8.a();
                u uVar9 = this.f39884u;
                if (uVar9 == null) {
                    this.f39884u = uVar8;
                    uVar8.f39923g = uVar8;
                    uVar8.f = uVar8;
                } else {
                    u uVar10 = uVar9.f39923g;
                    kotlin.jvm.internal.i.d(uVar10);
                    uVar10.b(uVar8);
                    u uVar11 = uVar8.f39923g;
                    if (uVar11 != uVar8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        kotlin.jvm.internal.i.d(uVar11);
                        if (uVar11.f39922e) {
                            int i14 = uVar8.f39920c - uVar8.f39919b;
                            u uVar12 = uVar8.f39923g;
                            kotlin.jvm.internal.i.d(uVar12);
                            int i15 = 8192 - uVar12.f39920c;
                            u uVar13 = uVar8.f39923g;
                            kotlin.jvm.internal.i.d(uVar13);
                            if (uVar13.f39921d) {
                                i6 = 0;
                            } else {
                                u uVar14 = uVar8.f39923g;
                                kotlin.jvm.internal.i.d(uVar14);
                                i6 = uVar14.f39919b;
                            }
                            if (i14 <= i15 + i6) {
                                u uVar15 = uVar8.f39923g;
                                kotlin.jvm.internal.i.d(uVar15);
                                uVar8.d(uVar15, i14);
                                uVar8.a();
                                v.a(uVar8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                source.f39885v -= j12;
                this.f39885v += j12;
                j10 -= j12;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // zv.z
    public final long o0(e sink, long j10) {
        boolean z10;
        kotlin.jvm.internal.i.g(sink, "sink");
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long j11 = this.f39885v;
            if (j11 == 0) {
                return -1L;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            sink.n(this, j10);
            return j10;
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Long.valueOf(j10), "byteCount < 0: ").toString());
    }

    @Override // zv.h
    public final i p(long j10) {
        boolean z10;
        if (j10 >= 0 && j10 <= 2147483647L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f39885v >= j10) {
                if (j10 >= 4096) {
                    i v02 = v0((int) j10);
                    skip(j10);
                    return v02;
                }
                return new i(c0(j10));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Long.valueOf(j10), "byteCount: ").toString());
    }

    public final int p0() {
        int i6;
        int i10;
        int i11;
        if (this.f39885v != 0) {
            byte m10 = m(0L);
            boolean z10 = false;
            if ((m10 & 128) == 0) {
                i6 = m10 & Byte.MAX_VALUE;
                i10 = 1;
                i11 = 0;
            } else if ((m10 & 224) == 192) {
                i6 = m10 & 31;
                i10 = 2;
                i11 = 128;
            } else if ((m10 & 240) == 224) {
                i6 = m10 & 15;
                i10 = 3;
                i11 = Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
            } else if ((m10 & 248) == 240) {
                i6 = m10 & 7;
                i10 = 4;
                i11 = 65536;
            } else {
                skip(1L);
                return 65533;
            }
            long j10 = i10;
            if (this.f39885v >= j10) {
                if (1 < i10) {
                    int i12 = 1;
                    while (true) {
                        int i13 = i12 + 1;
                        long j11 = i12;
                        byte m11 = m(j11);
                        if ((m11 & 192) == 128) {
                            i6 = (i6 << 6) | (m11 & 63);
                            if (i13 >= i10) {
                                break;
                            }
                            i12 = i13;
                        } else {
                            skip(j11);
                            return 65533;
                        }
                    }
                }
                skip(j10);
                if (i6 > 1114111) {
                    return 65533;
                }
                if (55296 <= i6 && i6 <= 57343) {
                    z10 = true;
                }
                if (z10 || i6 < i11) {
                    return 65533;
                }
                return i6;
            }
            StringBuilder u10 = defpackage.c.u("size < ", i10, ": ");
            u10.append(this.f39885v);
            u10.append(" (to read code point prefixed 0x");
            u10.append(ta.v.Q(m10));
            u10.append(')');
            throw new EOFException(u10.toString());
        }
        throw new EOFException();
    }

    public final i q0() {
        boolean z10;
        long j10 = this.f39885v;
        if (j10 <= 2147483647L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return v0((int) j10);
        }
        throw new IllegalStateException(kotlin.jvm.internal.i.n(Long.valueOf(j10), "size > Int.MAX_VALUE: ").toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.i.g(sink, "sink");
        u uVar = this.f39884u;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), uVar.f39920c - uVar.f39919b);
        sink.put(uVar.f39918a, uVar.f39919b, min);
        int i6 = uVar.f39919b + min;
        uVar.f39919b = i6;
        this.f39885v -= min;
        if (i6 == uVar.f39920c) {
            this.f39884u = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    @Override // zv.h
    public final byte readByte() {
        if (this.f39885v != 0) {
            u uVar = this.f39884u;
            kotlin.jvm.internal.i.d(uVar);
            int i6 = uVar.f39919b;
            int i10 = uVar.f39920c;
            int i11 = i6 + 1;
            byte b10 = uVar.f39918a[i6];
            this.f39885v--;
            if (i11 == i10) {
                this.f39884u = uVar.a();
                v.a(uVar);
            } else {
                uVar.f39919b = i11;
            }
            return b10;
        }
        throw new EOFException();
    }

    @Override // zv.h
    public final int readInt() {
        if (this.f39885v >= 4) {
            u uVar = this.f39884u;
            kotlin.jvm.internal.i.d(uVar);
            int i6 = uVar.f39919b;
            int i10 = uVar.f39920c;
            if (i10 - i6 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            int i11 = i6 + 1;
            byte[] bArr = uVar.f39918a;
            int i12 = i11 + 1;
            int i13 = ((bArr[i6] & 255) << 24) | ((bArr[i11] & 255) << 16);
            int i14 = i12 + 1;
            int i15 = i13 | ((bArr[i12] & 255) << 8);
            int i16 = i14 + 1;
            int i17 = i15 | (bArr[i14] & 255);
            this.f39885v -= 4;
            if (i16 == i10) {
                this.f39884u = uVar.a();
                v.a(uVar);
            } else {
                uVar.f39919b = i16;
            }
            return i17;
        }
        throw new EOFException();
    }

    @Override // zv.h
    public final short readShort() {
        if (this.f39885v >= 2) {
            u uVar = this.f39884u;
            kotlin.jvm.internal.i.d(uVar);
            int i6 = uVar.f39919b;
            int i10 = uVar.f39920c;
            if (i10 - i6 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            int i11 = i6 + 1;
            byte[] bArr = uVar.f39918a;
            int i12 = i11 + 1;
            int i13 = ((bArr[i6] & 255) << 8) | (bArr[i11] & 255);
            this.f39885v -= 2;
            if (i12 == i10) {
                this.f39884u = uVar.a();
                v.a(uVar);
            } else {
                uVar.f39919b = i12;
            }
            return (short) i13;
        }
        throw new EOFException();
    }

    @Override // zv.h
    public final void skip(long j10) {
        while (j10 > 0) {
            u uVar = this.f39884u;
            if (uVar != null) {
                int min = (int) Math.min(j10, uVar.f39920c - uVar.f39919b);
                long j11 = min;
                this.f39885v -= j11;
                j10 -= j11;
                int i6 = uVar.f39919b + min;
                uVar.f39919b = i6;
                if (i6 == uVar.f39920c) {
                    this.f39884u = uVar.a();
                    v.a(uVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // zv.g
    public final /* bridge */ /* synthetic */ g t0(int i6, byte[] bArr, int i10) {
        y0(i6, bArr, i10);
        return this;
    }

    public final String toString() {
        return q0().toString();
    }

    @Override // zv.h
    public final long u(i targetBytes) {
        kotlin.jvm.internal.i.g(targetBytes, "targetBytes");
        return J(targetBytes, 0L);
    }

    public final i v0(int i6) {
        if (i6 == 0) {
            return i.f39888x;
        }
        ta.v.m(this.f39885v, 0L, i6);
        u uVar = this.f39884u;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i6) {
            kotlin.jvm.internal.i.d(uVar);
            int i13 = uVar.f39920c;
            int i14 = uVar.f39919b;
            if (i13 != i14) {
                i11 += i13 - i14;
                i12++;
                uVar = uVar.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i12];
        int[] iArr = new int[i12 * 2];
        u uVar2 = this.f39884u;
        int i15 = 0;
        while (i10 < i6) {
            kotlin.jvm.internal.i.d(uVar2);
            bArr[i15] = uVar2.f39918a;
            i10 += uVar2.f39920c - uVar2.f39919b;
            iArr[i15] = Math.min(i10, i6);
            iArr[i15 + i12] = uVar2.f39919b;
            uVar2.f39921d = true;
            i15++;
            uVar2 = uVar2.f;
        }
        return new w(bArr, iArr);
    }

    public final u w0(int i6) {
        boolean z10 = true;
        if ((i6 < 1 || i6 > 8192) ? false : false) {
            u uVar = this.f39884u;
            if (uVar == null) {
                u b10 = v.b();
                this.f39884u = b10;
                b10.f39923g = b10;
                b10.f = b10;
                return b10;
            }
            u uVar2 = uVar.f39923g;
            kotlin.jvm.internal.i.d(uVar2);
            if (uVar2.f39920c + i6 <= 8192 && uVar2.f39922e) {
                return uVar2;
            }
            u b11 = v.b();
            uVar2.b(b11);
            return b11;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @Override // zv.g
    public final g write(byte[] source) {
        kotlin.jvm.internal.i.g(source, "source");
        y0(0, source, source.length);
        return this;
    }

    @Override // zv.g
    public final /* bridge */ /* synthetic */ g writeByte(int i6) {
        L0(i6);
        return this;
    }

    @Override // zv.g
    public final /* bridge */ /* synthetic */ g writeInt(int i6) {
        O0(i6);
        return this;
    }

    @Override // zv.g
    public final /* bridge */ /* synthetic */ g writeShort(int i6) {
        P0(i6);
        return this;
    }

    public final void y0(int i6, byte[] source, int i10) {
        kotlin.jvm.internal.i.g(source, "source");
        long j10 = i10;
        ta.v.m(source.length, i6, j10);
        int i11 = i10 + i6;
        while (i6 < i11) {
            u w02 = w0(1);
            int min = Math.min(i11 - i6, 8192 - w02.f39920c);
            int i12 = i6 + min;
            is.i.I1(w02.f39920c, i6, i12, source, w02.f39918a);
            w02.f39920c += min;
            i6 = i12;
        }
        this.f39885v += j10;
    }

    @Override // zv.g
    public final /* bridge */ /* synthetic */ g z(i iVar) {
        B0(iVar);
        return this;
    }

    /* compiled from: Buffer.kt */
    /* loaded from: classes2.dex */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(e.this.f39885v, (long) SubsamplingScaleImageView.TILE_SIZE_AUTO);
        }

        @Override // java.io.InputStream
        public final int read() {
            e eVar = e.this;
            if (eVar.f39885v > 0) {
                return eVar.readByte() & 255;
            }
            return -1;
        }

        public final String toString() {
            return e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] sink, int i6, int i10) {
            kotlin.jvm.internal.i.g(sink, "sink");
            return e.this.read(sink, i6, i10);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.i.g(source, "source");
        int remaining = source.remaining();
        int i6 = remaining;
        while (i6 > 0) {
            u w02 = w0(1);
            int min = Math.min(i6, 8192 - w02.f39920c);
            source.get(w02.f39918a, w02.f39920c, min);
            i6 -= min;
            w02.f39920c += min;
        }
        this.f39885v += remaining;
        return remaining;
    }

    public final int read(byte[] sink, int i6, int i10) {
        kotlin.jvm.internal.i.g(sink, "sink");
        ta.v.m(sink.length, i6, i10);
        u uVar = this.f39884u;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(i10, uVar.f39920c - uVar.f39919b);
        int i11 = uVar.f39919b;
        is.i.I1(i6, i11, i11 + min, uVar.f39918a, sink);
        int i12 = uVar.f39919b + min;
        uVar.f39919b = i12;
        this.f39885v -= min;
        if (i12 == uVar.f39920c) {
            this.f39884u = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    @Override // zv.g
    public final g H() {
        return this;
    }

    @Override // zv.h, zv.g
    public final e c() {
        return this;
    }

    @Override // zv.z, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // zv.g, zv.x, java.io.Flushable
    public final void flush() {
    }
}
