package n8;

import androidx.work.k;
import c9.q;
import c9.v;
import g8.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n8.d;
import n8.f;
import u7.x;
/* compiled from: SpliceInfoDecoder.java */
/* loaded from: classes.dex */
public final class c extends k {

    /* renamed from: b  reason: collision with root package name */
    public final q f25921b = new q();

    /* renamed from: c  reason: collision with root package name */
    public final x f25922c = new x();

    /* renamed from: d  reason: collision with root package name */
    public v f25923d;

    @Override // androidx.work.k
    public final g8.a k(g8.d dVar, ByteBuffer byteBuffer) {
        a.b eVar;
        boolean z10;
        long j10;
        long j11;
        ArrayList arrayList;
        long j12;
        long j13;
        boolean z11;
        boolean z12;
        boolean z13;
        int i6;
        int i10;
        int i11;
        boolean z14;
        boolean z15;
        boolean z16;
        long j14;
        long j15;
        boolean z17;
        boolean z18;
        List list;
        long j16;
        long j17;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        int i12;
        int i13;
        int i14;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        long j18;
        boolean z27;
        long j19;
        v vVar = this.f25923d;
        if (vVar == null || dVar.C != vVar.d()) {
            v vVar2 = new v(dVar.f6362y);
            this.f25923d = vVar2;
            vVar2.a(dVar.f6362y - dVar.C);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        q qVar = this.f25921b;
        qVar.y(array, limit);
        x xVar = this.f25922c;
        xVar.n(array, limit);
        xVar.r(39);
        long i15 = (xVar.i(1) << 32) | xVar.i(32);
        xVar.r(20);
        int i16 = xVar.i(12);
        int i17 = xVar.i(8);
        qVar.B(14);
        if (i17 != 0) {
            if (i17 != 255) {
                long j20 = 0;
                long j21 = 1;
                long j22 = -9223372036854775807L;
                if (i17 != 4) {
                    if (i17 != 5) {
                        if (i17 != 6) {
                            eVar = null;
                        } else {
                            v vVar3 = this.f25923d;
                            long a10 = g.a(i15, qVar);
                            eVar = new g(a10, vVar3.b(a10));
                        }
                    } else {
                        v vVar4 = this.f25923d;
                        long r = qVar.r();
                        if ((qVar.q() & 128) != 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        List emptyList = Collections.emptyList();
                        if (!z18) {
                            int q10 = qVar.q();
                            if ((q10 & 128) != 0) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            if ((q10 & 64) != 0) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            if ((q10 & 32) != 0) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            if ((q10 & 16) != 0) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            if (z24 && !z26) {
                                j18 = g.a(i15, qVar);
                            } else {
                                j18 = -9223372036854775807L;
                            }
                            if (!z24) {
                                int q11 = qVar.q();
                                ArrayList arrayList2 = new ArrayList(q11);
                                for (int i18 = 0; i18 < q11; i18++) {
                                    int q12 = qVar.q();
                                    if (!z26) {
                                        j19 = g.a(i15, qVar);
                                    } else {
                                        j19 = -9223372036854775807L;
                                    }
                                    arrayList2.add(new d.b(q12, j19, vVar4.b(j19)));
                                }
                                emptyList = arrayList2;
                            }
                            if (z25) {
                                long q13 = qVar.q();
                                if ((q13 & 128) != 0) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                j22 = ((((q13 & 1) << 32) | qVar.r()) * 1000) / 90;
                            } else {
                                z27 = false;
                            }
                            int v10 = qVar.v();
                            int q14 = qVar.q();
                            z22 = z27;
                            i14 = qVar.q();
                            list = emptyList;
                            z19 = z23;
                            i12 = v10;
                            i13 = q14;
                            j17 = j22;
                            long j23 = j18;
                            z21 = z26;
                            z20 = z24;
                            j16 = j23;
                        } else {
                            list = emptyList;
                            j16 = -9223372036854775807L;
                            j17 = -9223372036854775807L;
                            z19 = false;
                            z20 = false;
                            z21 = false;
                            z22 = false;
                            i12 = 0;
                            i13 = 0;
                            i14 = 0;
                        }
                        eVar = new d(r, z18, z19, z20, z21, j16, vVar4.b(j16), list, z22, j17, i12, i13, i14);
                    }
                } else {
                    int q15 = qVar.q();
                    ArrayList arrayList3 = new ArrayList(q15);
                    int i19 = 0;
                    while (i19 < q15) {
                        long r10 = qVar.r();
                        if ((qVar.q() & 128) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        if (!z10) {
                            int q16 = qVar.q();
                            if ((q16 & 128) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((q16 & 64) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if ((q16 & 32) != 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z15) {
                                j14 = qVar.r();
                            } else {
                                j14 = -9223372036854775807L;
                            }
                            if (!z15) {
                                int q17 = qVar.q();
                                ArrayList arrayList5 = new ArrayList(q17);
                                for (int i20 = 0; i20 < q17; i20++) {
                                    arrayList5.add(new f.b(qVar.q(), qVar.r()));
                                }
                                arrayList4 = arrayList5;
                            }
                            if (z16) {
                                long q18 = qVar.q();
                                j11 = 0;
                                if ((q18 & 128) != 0) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                j10 = 1;
                                j15 = ((((q18 & 1) << 32) | qVar.r()) * 1000) / 90;
                            } else {
                                j10 = 1;
                                j11 = 0;
                                j15 = -9223372036854775807L;
                                z17 = false;
                            }
                            z13 = z17;
                            arrayList = arrayList4;
                            z11 = z14;
                            z12 = z15;
                            j12 = j14;
                            j13 = j15;
                            i6 = qVar.v();
                            i10 = qVar.q();
                            i11 = qVar.q();
                        } else {
                            j10 = j21;
                            j11 = j20;
                            arrayList = arrayList4;
                            j12 = -9223372036854775807L;
                            j13 = -9223372036854775807L;
                            z11 = false;
                            z12 = false;
                            z13 = false;
                            i6 = 0;
                            i10 = 0;
                            i11 = 0;
                        }
                        arrayList3.add(new f.c(r10, z10, z11, z12, arrayList, j12, z13, j13, i6, i10, i11));
                        i19++;
                        j20 = j11;
                        j21 = j10;
                    }
                    eVar = new f(arrayList3);
                }
            } else {
                long r11 = qVar.r();
                int i21 = i16 - 4;
                byte[] bArr = new byte[i21];
                qVar.b(0, bArr, i21);
                eVar = new a(r11, bArr, i15);
            }
        } else {
            eVar = new e();
        }
        if (eVar == null) {
            return new g8.a(new a.b[0]);
        }
        return new g8.a(eVar);
    }
}
