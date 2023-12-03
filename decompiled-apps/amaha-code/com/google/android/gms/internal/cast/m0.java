package com.google.android.gms.internal.cast;

import com.theinnerhour.b2b.utils.Constants;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class m0 extends c3<m0, l0> implements d4 {
    private static final m0 zzp;
    private int zzb;
    private x0 zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private v1 zzm;
    private int zzn;
    private int zzo;

    static {
        m0 m0Var = new m0();
        zzp = m0Var;
        c3.f(m0.class, m0Var);
    }

    public static l0 h() {
        return zzp.d();
    }

    public static l0 i(m0 m0Var) {
        l0 d10 = zzp.d();
        d10.e(m0Var);
        return d10;
    }

    public static m0 k() {
        return zzp;
    }

    public static /* synthetic */ void n(m0 m0Var, x0 x0Var) {
        m0Var.zze = x0Var;
        m0Var.zzb |= 1;
    }

    public static /* synthetic */ void o(m0 m0Var, boolean z10) {
        m0Var.zzb |= 2;
        m0Var.zzf = z10;
    }

    public static /* synthetic */ void p(m0 m0Var, long j10) {
        m0Var.zzb |= 4;
        m0Var.zzg = j10;
    }

    public static /* synthetic */ void q(m0 m0Var, int i6) {
        m0Var.zzb |= 64;
        m0Var.zzk = i6;
    }

    public static /* synthetic */ void s(m0 m0Var, int i6) {
        m0Var.zzb |= 128;
        m0Var.zzl = i6;
    }

    public static /* synthetic */ void t(m0 m0Var, int i6) {
        m0Var.zzb |= Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
        m0Var.zzo = i6;
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
                        return zzp;
                    }
                    return new l0(0);
                }
                return new m0();
            }
            return new n4(zzp, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007င\u0006\bင\u0007\tဉ\b\nဌ\t\u000bင\n", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", kotlin.jvm.internal.b0.f23453y, "zzj", g.f7519b, "zzk", "zzl", "zzm", "zzn", g.f7522e, "zzo"});
        }
        return (byte) 1;
    }
}
