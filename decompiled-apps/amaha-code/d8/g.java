package d8;

import com.google.android.exoplayer2.n;
import com.google.common.collect.l0;
import com.google.common.collect.s;
import d8.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: DefaultTsPayloadReaderFactory.java */
/* loaded from: classes.dex */
public final class g implements d0.c {

    /* renamed from: a  reason: collision with root package name */
    public final int f12386a;

    /* renamed from: b  reason: collision with root package name */
    public final List<com.google.android.exoplayer2.n> f12387b;

    public g() {
        s.b bVar = com.google.common.collect.s.f9446v;
        l0 l0Var = l0.f9412y;
        this.f12386a = 0;
        this.f12387b = l0Var;
    }

    @Override // d8.d0.c
    public final d0 a(int i6, d0.b bVar) {
        if (i6 != 2) {
            String str = bVar.f12345a;
            if (i6 != 3 && i6 != 4) {
                if (i6 != 21) {
                    if (i6 != 27) {
                        if (i6 != 36) {
                            if (i6 != 89) {
                                if (i6 != 138) {
                                    if (i6 != 172) {
                                        if (i6 != 257) {
                                            if (i6 != 134) {
                                                if (i6 != 135) {
                                                    switch (i6) {
                                                        case 15:
                                                            if (c(2)) {
                                                                return null;
                                                            }
                                                            return new t(new f(false, str));
                                                        case 16:
                                                            return new t(new l(new e0(b(bVar))));
                                                        case 17:
                                                            if (c(2)) {
                                                                return null;
                                                            }
                                                            return new t(new p(str));
                                                        default:
                                                            switch (i6) {
                                                                case 128:
                                                                    break;
                                                                case 129:
                                                                    break;
                                                                case 130:
                                                                    if (!c(64)) {
                                                                        return null;
                                                                    }
                                                                    break;
                                                                default:
                                                                    return null;
                                                            }
                                                    }
                                                }
                                                return new t(new b(str));
                                            } else if (c(16)) {
                                                return null;
                                            } else {
                                                return new y(new s("application/x-scte35"));
                                            }
                                        }
                                        return new y(new s("application/vnd.dvb.ait"));
                                    }
                                    return new t(new d(str));
                                }
                                return new t(new h(str));
                            }
                            return new t(new i(bVar.f12346b));
                        }
                        return new t(new n(new z(b(bVar))));
                    } else if (c(4)) {
                        return null;
                    } else {
                        return new t(new m(new z(b(bVar)), c(1), c(8)));
                    }
                }
                return new t(new o());
            }
            return new t(new q(str));
        }
        return new t(new k(new e0(b(bVar))));
    }

    public final List<com.google.android.exoplayer2.n> b(d0.b bVar) {
        boolean z10;
        String str;
        int i6;
        List<byte[]> list;
        boolean z11;
        boolean c10 = c(32);
        List<com.google.android.exoplayer2.n> list2 = this.f12387b;
        if (c10) {
            return list2;
        }
        c9.q qVar = new c9.q(bVar.f12347c);
        while (qVar.f5188c - qVar.f5187b > 0) {
            int q10 = qVar.q();
            int q11 = qVar.f5187b + qVar.q();
            if (q10 == 134) {
                ArrayList arrayList = new ArrayList();
                int q12 = qVar.q() & 31;
                for (int i10 = 0; i10 < q12; i10++) {
                    String n10 = qVar.n(3);
                    int q13 = qVar.q();
                    if ((q13 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i6 = q13 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i6 = 1;
                    }
                    byte q14 = (byte) qVar.q();
                    qVar.B(1);
                    if (z10) {
                        if ((q14 & 64) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        list = Collections.singletonList(z11 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    n.a aVar = new n.a();
                    aVar.f6665k = str;
                    aVar.f6658c = n10;
                    aVar.C = i6;
                    aVar.f6667m = list;
                    arrayList.add(new com.google.android.exoplayer2.n(aVar));
                }
                list2 = arrayList;
            }
            qVar.A(q11);
        }
        return list2;
    }

    public final boolean c(int i6) {
        if ((i6 & this.f12386a) != 0) {
            return true;
        }
        return false;
    }
}
