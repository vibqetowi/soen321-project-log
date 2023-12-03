package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class r0 extends c3<r0, q0> implements d4 {
    private static final r0 zzai;
    private j3<x1> zzA;
    private int zzB;
    private int zzC;
    private x0 zzD;
    private int zzE;
    private p0 zzF;
    private j3<x0> zzG;
    private x0 zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private d2 zzO;
    private m0 zzP;
    private e0 zzQ;
    private i1 zzR;
    private w1 zzS;
    private l1 zzT;
    private j3<k0> zzU;
    private int zzV;
    private p1 zzW;
    private j3<n0> zzX;
    private boolean zzY;
    private boolean zzZ;
    private int zzaa;
    private g0 zzab;
    private u1 zzac;
    private f1 zzad;
    private o1 zzae;
    private a2 zzaf;
    private s0 zzag;
    private int zzb;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private d1 zzi;
    private t1 zzj;
    private c1 zzk;
    private a1 zzl;
    private o0 zzm;
    private r1 zzn;
    private i0 zzo;
    private c2 zzp;
    private z0 zzr;
    private z zzs;
    private n1 zzu;
    private j3<e1> zzx;
    private j3<g1> zzy;
    private j3<t0> zzz;
    private byte zzah = 2;
    private String zzq = "";
    private String zzt = "";
    private String zzv = "";
    private f3 zzw = d3.f7510x;

    static {
        r0 r0Var = new r0();
        zzai = r0Var;
        c3.f(r0.class, r0Var);
    }

    public r0() {
        m4<Object> m4Var = m4.f7592x;
        this.zzx = m4Var;
        this.zzy = m4Var;
        this.zzz = m4Var;
        this.zzA = m4Var;
        this.zzG = m4Var;
        this.zzU = m4Var;
        this.zzX = m4Var;
    }

    public static q0 i() {
        return zzai.d();
    }

    public static q0 k(r0 r0Var) {
        q0 d10 = zzai.d();
        d10.e(r0Var);
        return d10;
    }

    public static /* synthetic */ void n(r0 r0Var, long j10) {
        r0Var.zzb |= 2;
        r0Var.zzg = j10;
    }

    public static /* synthetic */ void o(r0 r0Var, String str) {
        str.getClass();
        r0Var.zzb |= 16384;
        r0Var.zzt = str;
    }

    public static /* synthetic */ void p(r0 r0Var, String str) {
        r0Var.zzb |= 65536;
        r0Var.zzv = str;
    }

    public static /* synthetic */ void q(r0 r0Var, int i6) {
        r0Var.zzb |= 268435456;
        r0Var.zzN = i6;
    }

    public static /* synthetic */ void s(r0 r0Var, m0 m0Var) {
        r0Var.zzP = m0Var;
        r0Var.zzb |= 1073741824;
    }

    public static /* synthetic */ void t(r0 r0Var, k0 k0Var) {
        int i6;
        j3<k0> j3Var = r0Var.zzU;
        if (!j3Var.a()) {
            int size = j3Var.size();
            if (size == 0) {
                i6 = 10;
            } else {
                i6 = size + size;
            }
            r0Var.zzU = j3Var.D(i6);
        }
        r0Var.zzU.add(k0Var);
    }

    public static /* synthetic */ void v(r0 r0Var, g0 g0Var) {
        r0Var.zzab = g0Var;
        r0Var.zze |= 256;
    }

    @Override // com.google.android.gms.internal.cast.c3
    public final Object c(c3 c3Var, int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            byte b10 = 0;
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (c3Var != null) {
                                b10 = 1;
                            }
                            this.zzah = b10;
                            return null;
                        }
                        return zzai;
                    }
                    return new q0(0);
                }
                return new r0();
            }
            return new n4(zzai, "\u00016\u0000\u0002\u000166\u0000\b\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\nဉ\b\u000bဉ\t\fဉ\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u000f\u0011ဈ\u0010\u0012\u0016\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017ဌ\u0011\u0018ဉ\u0015\u0019\u001b\u001aဉ\u0016\u001bဌ\u0018\u001cင\u0019\u001dင\u001a\u001eင\u001b\u001fဆ\u001c ဉ\u001d!ဉ\u001e\"ဉ\u001f#ဌ\u0012$ဉ\u0013%ᐉ &ဉ!'ဉ\"(\u001b)ဌ#*ဉ$+\u001b,ဌ\u0017-ဇ%.ဇ&/ဌ'0ဉ(1င\u00142ဉ)3ဉ*4ဉ+5ဉ,6ဉ-", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", kotlin.jvm.internal.h.D, "zzi", "zzj", "zzk", "zzl", "zzm", "zzt", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzu", "zzv", "zzw", "zzx", e1.class, "zzy", g1.class, "zzz", t0.class, "zzA", x1.class, "zzB", kotlin.jvm.internal.b0.C, "zzF", "zzG", x0.class, "zzH", "zzJ", kotlin.jvm.internal.b0.A, "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzC", hc.d.Q, "zzD", "zzR", "zzS", "zzT", "zzU", k0.class, "zzV", g.f7526j, "zzW", "zzX", n0.class, "zzI", g.f, "zzY", "zzZ", "zzaa", w.f7669w, "zzab", "zzE", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        }
        return Byte.valueOf(this.zzah);
    }

    public final m0 h() {
        m0 m0Var = this.zzP;
        if (m0Var == null) {
            return m0.k();
        }
        return m0Var;
    }
}
