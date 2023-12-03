package aw;

import kotlin.jvm.internal.i;
import zv.e;
import zv.q;
import zv.u;
/* compiled from: -Buffer.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f3901a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(gv.a.f16927b);
        i.f(bytes, "(this as java.lang.String).getBytes(charset)");
        f3901a = bytes;
    }

    public static final String a(e eVar, long j10) {
        i.g(eVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (eVar.m(j11) == ((byte) 13)) {
                String l02 = eVar.l0(j11);
                eVar.skip(2L);
                return l02;
            }
        }
        String l03 = eVar.l0(j10);
        eVar.skip(1L);
        return l03;
    }

    public static final int b(e eVar, q options, boolean z10) {
        int i6;
        int i10;
        boolean z11;
        byte[] bArr;
        int i11;
        u uVar;
        i.g(eVar, "<this>");
        i.g(options, "options");
        u uVar2 = eVar.f39884u;
        int i12 = -2;
        if (uVar2 == null) {
            if (z10) {
                return -2;
            }
            return -1;
        }
        int i13 = uVar2.f39919b;
        int i14 = uVar2.f39920c;
        byte[] bArr2 = uVar2.f39918a;
        u uVar3 = uVar2;
        int i15 = 0;
        int i16 = -1;
        loop0: while (true) {
            int i17 = i15 + 1;
            int[] iArr = options.f39908v;
            int i18 = iArr[i15];
            int i19 = i17 + 1;
            int i20 = iArr[i17];
            if (i20 != -1) {
                i16 = i20;
            }
            if (uVar3 == null) {
                break;
            }
            if (i18 < 0) {
                int i21 = (i18 * (-1)) + i19;
                while (true) {
                    int i22 = i13 + 1;
                    int i23 = i19 + 1;
                    if ((bArr2[i13] & 255) != iArr[i19]) {
                        return i16;
                    }
                    if (i23 == i21) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i22 == i14) {
                        i.d(uVar3);
                        u uVar4 = uVar3.f;
                        i.d(uVar4);
                        i11 = uVar4.f39919b;
                        int i24 = uVar4.f39920c;
                        bArr = uVar4.f39918a;
                        if (uVar4 == uVar2) {
                            if (!z11) {
                                break loop0;
                            }
                            i14 = i24;
                            uVar = null;
                        } else {
                            uVar = uVar4;
                            i14 = i24;
                        }
                    } else {
                        u uVar5 = uVar3;
                        bArr = bArr2;
                        i11 = i22;
                        uVar = uVar5;
                    }
                    if (z11) {
                        i6 = iArr[i23];
                        i10 = i11;
                        bArr2 = bArr;
                        uVar3 = uVar;
                        break;
                    }
                    i13 = i11;
                    bArr2 = bArr;
                    i19 = i23;
                    uVar3 = uVar;
                }
            } else {
                int i25 = i13 + 1;
                int i26 = bArr2[i13] & 255;
                int i27 = i19 + i18;
                while (i19 != i27) {
                    if (i26 == iArr[i19]) {
                        i6 = iArr[i19 + i18];
                        if (i25 == i14) {
                            uVar3 = uVar3.f;
                            i.d(uVar3);
                            i10 = uVar3.f39919b;
                            i14 = uVar3.f39920c;
                            bArr2 = uVar3.f39918a;
                            if (uVar3 == uVar2) {
                                uVar3 = null;
                            }
                        } else {
                            i10 = i25;
                        }
                    } else {
                        i19++;
                    }
                }
                return i16;
            }
            if (i6 >= 0) {
                return i6;
            }
            i15 = -i6;
            i13 = i10;
            i12 = -2;
        }
        if (z10) {
            return i12;
        }
        return i16;
    }
}
