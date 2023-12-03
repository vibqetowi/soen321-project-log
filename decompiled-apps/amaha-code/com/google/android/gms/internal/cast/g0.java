package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class g0 extends c3<g0, f0> implements d4 {
    private static final g3<Integer, d0> zzi = new tr.r((Object) null);
    private static final g0 zzj;
    private int zzb;
    private k0 zze;
    private j1 zzf;
    private j3<h1> zzg = m4.f7592x;
    private f3 zzh = d3.f7510x;

    static {
        g0 g0Var = new g0();
        zzj = g0Var;
        c3.f(g0.class, g0Var);
    }

    public static f0 h() {
        return zzj.d();
    }

    public static /* synthetic */ void k(g0 g0Var, k0 k0Var) {
        g0Var.zze = k0Var;
        g0Var.zzb |= 1;
    }

    public static void l(g0 g0Var, ArrayList arrayList) {
        int i6;
        f3 f3Var = g0Var.zzh;
        if (!((h2) f3Var).f7545u) {
            d3 d3Var = (d3) f3Var;
            int i10 = d3Var.f7512w;
            if (i10 == 0) {
                i6 = 10;
            } else {
                i6 = i10 + i10;
            }
            if (i6 >= i10) {
                g0Var.zzh = new d3(Arrays.copyOf(d3Var.f7511v, i6), d3Var.f7512w);
            } else {
                throw new IllegalArgumentException();
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((d3) g0Var.zzh).g(((d0) it.next()).f7509u);
        }
    }

    @Override // com.google.android.gms.internal.cast.c3
    public final Object c(c3 c3Var, int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return zzj;
                    }
                    return new f0(0);
                }
                return new g0();
            }
            return new n4(zzj, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001e", new Object[]{"zzb", "zze", "zzf", "zzg", h1.class, "zzh", kotlin.jvm.internal.b0.D});
        }
        return (byte) 1;
    }
}
