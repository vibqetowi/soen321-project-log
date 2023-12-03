package com.google.android.gms.internal.measurement;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class v2 extends w5 implements w6 {
    public static final /* synthetic */ int zza = 0;
    private static final v2 zzd;
    private String zzA;
    private long zzB;
    private int zzC;
    private String zzD;
    private String zzE;
    private boolean zzF;
    private b6 zzG;
    private String zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private String zzL;
    private long zzM;
    private long zzN;
    private String zzO;
    private String zzP;
    private int zzQ;
    private String zzR;
    private y2 zzS;
    private z5 zzT;
    private long zzU;
    private long zzV;
    private String zzW;
    private String zzX;
    private int zzY;
    private boolean zzZ;
    private String zzaa;
    private boolean zzab;
    private r2 zzac;
    private String zzad;
    private b6 zzae;
    private String zzaf;
    private int zze;
    private int zzf;
    private int zzg;
    private b6 zzh;
    private b6 zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private int zzs;
    private String zzt;
    private String zzu;
    private String zzv;
    private long zzw;
    private long zzx;
    private String zzy;
    private boolean zzz;

    static {
        v2 v2Var = new v2();
        zzd = v2Var;
        w5.n(v2.class, v2Var);
    }

    public v2() {
        e7 e7Var = e7.f8360x;
        this.zzh = e7Var;
        this.zzi = e7Var;
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzt = "";
        this.zzu = "";
        this.zzv = "";
        this.zzy = "";
        this.zzA = "";
        this.zzD = "";
        this.zzE = "";
        this.zzG = e7Var;
        this.zzH = "";
        this.zzL = "";
        this.zzO = "";
        this.zzP = "";
        this.zzR = "";
        this.zzT = x5.f8687x;
        this.zzW = "";
        this.zzX = "";
        this.zzaa = "";
        this.zzad = "";
        this.zzae = e7Var;
        this.zzaf = "";
    }

    public static /* synthetic */ void A0(v2 v2Var, int i6, e3 e3Var) {
        v2Var.V0();
        v2Var.zzi.set(i6, e3Var);
    }

    public static /* synthetic */ void B0(v2 v2Var, e3 e3Var) {
        v2Var.V0();
        v2Var.zzi.add(e3Var);
    }

    public static /* synthetic */ void C0(v2 v2Var, int i6) {
        v2Var.V0();
        v2Var.zzi.remove(i6);
    }

    public static /* synthetic */ void D0(v2 v2Var, long j10) {
        v2Var.zze |= 2;
        v2Var.zzj = j10;
    }

    public static u2 D1() {
        return (u2) zzd.q();
    }

    public static /* synthetic */ void E0(v2 v2Var, long j10) {
        v2Var.zze |= 4;
        v2Var.zzk = j10;
    }

    public static /* synthetic */ void F0(v2 v2Var, long j10) {
        v2Var.zze |= 8;
        v2Var.zzl = j10;
    }

    public static /* synthetic */ void G0(v2 v2Var, long j10) {
        v2Var.zze |= 16;
        v2Var.zzm = j10;
    }

    public static /* synthetic */ void H0(v2 v2Var) {
        v2Var.zze &= -17;
        v2Var.zzm = 0L;
    }

    public static /* synthetic */ void I0(v2 v2Var, long j10) {
        v2Var.zze |= 32;
        v2Var.zzn = j10;
    }

    public static /* synthetic */ void J(v2 v2Var) {
        v2Var.zze &= SubsamplingScaleImageView.TILE_SIZE_AUTO;
        v2Var.zzO = zzd.zzO;
    }

    public static /* synthetic */ void J0(v2 v2Var) {
        v2Var.zze &= -33;
        v2Var.zzn = 0L;
    }

    public static /* synthetic */ void K(v2 v2Var, int i6) {
        v2Var.zzf |= 2;
        v2Var.zzQ = i6;
    }

    public static /* synthetic */ void K0(v2 v2Var) {
        v2Var.zze |= 64;
        v2Var.zzo = "android";
    }

    public static /* synthetic */ void L(v2 v2Var, int i6, m2 m2Var) {
        v2Var.U0();
        v2Var.zzh.set(i6, m2Var);
    }

    public static /* synthetic */ void L0(v2 v2Var, String str) {
        str.getClass();
        v2Var.zze |= 128;
        v2Var.zzp = str;
    }

    public static /* synthetic */ void M(v2 v2Var, String str) {
        str.getClass();
        v2Var.zzf |= 4;
        v2Var.zzR = str;
    }

    public static /* synthetic */ void M0(v2 v2Var) {
        v2Var.zze &= -129;
        v2Var.zzp = zzd.zzp;
    }

    public static void N(v2 v2Var, ArrayList arrayList) {
        int i6;
        z5 z5Var = v2Var.zzT;
        if (!((s4) z5Var).f8591u) {
            x5 x5Var = (x5) z5Var;
            int i10 = x5Var.f8689w;
            if (i10 == 0) {
                i6 = 10;
            } else {
                i6 = i10 + i10;
            }
            if (i6 >= i10) {
                v2Var.zzT = new x5(Arrays.copyOf(x5Var.f8688v, i6), x5Var.f8689w);
            } else {
                throw new IllegalArgumentException();
            }
        }
        r4.f(arrayList, v2Var.zzT);
    }

    public static /* synthetic */ void N0(v2 v2Var, String str) {
        str.getClass();
        v2Var.zze |= 256;
        v2Var.zzq = str;
    }

    public static /* synthetic */ void O(v2 v2Var, m2 m2Var) {
        v2Var.U0();
        v2Var.zzh.add(m2Var);
    }

    public static /* synthetic */ void O0(v2 v2Var) {
        v2Var.zze &= -257;
        v2Var.zzq = zzd.zzq;
    }

    public static /* synthetic */ void P(v2 v2Var, long j10) {
        v2Var.zzf |= 16;
        v2Var.zzU = j10;
    }

    public static /* synthetic */ void P0(v2 v2Var, String str) {
        str.getClass();
        v2Var.zze |= 512;
        v2Var.zzr = str;
    }

    public static /* synthetic */ void Q(v2 v2Var, long j10) {
        v2Var.zzf |= 32;
        v2Var.zzV = j10;
    }

    public static /* synthetic */ void Q0(v2 v2Var, int i6) {
        v2Var.zze |= Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
        v2Var.zzs = i6;
    }

    public static /* synthetic */ void R(v2 v2Var, String str) {
        v2Var.zzf |= 128;
        v2Var.zzX = str;
    }

    public static /* synthetic */ void R0(v2 v2Var, String str) {
        str.getClass();
        v2Var.zze |= Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
        v2Var.zzt = str;
    }

    public static /* synthetic */ void S(v2 v2Var, ArrayList arrayList) {
        v2Var.U0();
        r4.f(arrayList, v2Var.zzh);
    }

    public static /* synthetic */ void S0(v2 v2Var, String str) {
        str.getClass();
        v2Var.zze |= 4096;
        v2Var.zzu = str;
    }

    public static /* synthetic */ void U(v2 v2Var, String str) {
        str.getClass();
        v2Var.zze |= 8192;
        v2Var.zzv = str;
    }

    public static /* synthetic */ void V(v2 v2Var, long j10) {
        v2Var.zze |= 16384;
        v2Var.zzw = j10;
    }

    public static /* synthetic */ void W(v2 v2Var) {
        v2Var.zze |= 32768;
        v2Var.zzx = 74029L;
    }

    public static /* synthetic */ void X(v2 v2Var, String str) {
        str.getClass();
        v2Var.zze |= 65536;
        v2Var.zzy = str;
    }

    public static /* synthetic */ void Y(v2 v2Var) {
        v2Var.zze &= -65537;
        v2Var.zzy = zzd.zzy;
    }

    public static /* synthetic */ void Z(v2 v2Var, boolean z10) {
        v2Var.zze |= 131072;
        v2Var.zzz = z10;
    }

    public static /* synthetic */ void a0(v2 v2Var) {
        v2Var.zze &= -131073;
        v2Var.zzz = false;
    }

    public static /* synthetic */ void b0(v2 v2Var, String str) {
        v2Var.zze |= 262144;
        v2Var.zzA = str;
    }

    public static /* synthetic */ void c0(v2 v2Var) {
        v2Var.zze &= -262145;
        v2Var.zzA = zzd.zzA;
    }

    public static /* synthetic */ void d0(v2 v2Var, long j10) {
        v2Var.zze |= 524288;
        v2Var.zzB = j10;
    }

    public static /* synthetic */ void e0(v2 v2Var, int i6) {
        v2Var.zze |= 1048576;
        v2Var.zzC = i6;
    }

    public static /* synthetic */ void f0(v2 v2Var, String str) {
        v2Var.zze |= 2097152;
        v2Var.zzD = str;
    }

    public static /* synthetic */ void g0(v2 v2Var) {
        v2Var.zze &= -2097153;
        v2Var.zzD = zzd.zzD;
    }

    public static /* synthetic */ void h0(v2 v2Var, String str) {
        str.getClass();
        v2Var.zze |= 4194304;
        v2Var.zzE = str;
    }

    public static /* synthetic */ void i0(v2 v2Var) {
        v2Var.zze |= 8388608;
        v2Var.zzF = false;
    }

    public static /* synthetic */ void j0(v2 v2Var, ArrayList arrayList) {
        b6 b6Var = v2Var.zzG;
        if (!b6Var.c()) {
            v2Var.zzG = w5.j(b6Var);
        }
        r4.f(arrayList, v2Var.zzG);
    }

    public static void k0(v2 v2Var) {
        v2Var.zzG = e7.f8360x;
    }

    public static /* synthetic */ void l0(v2 v2Var, String str) {
        v2Var.zze |= 16777216;
        v2Var.zzH = str;
    }

    public static /* synthetic */ void m0(v2 v2Var, int i6) {
        v2Var.zze |= 33554432;
        v2Var.zzI = i6;
    }

    public static /* synthetic */ void n0(v2 v2Var) {
        v2Var.zze |= 1;
        v2Var.zzg = 1;
    }

    public static /* synthetic */ void o0(v2 v2Var) {
        v2Var.zze &= -268435457;
        v2Var.zzL = zzd.zzL;
    }

    public static /* synthetic */ void p0(v2 v2Var, long j10) {
        v2Var.zze |= 536870912;
        v2Var.zzM = j10;
    }

    public static /* synthetic */ void u0(v2 v2Var, String str) {
        str.getClass();
        v2Var.zzf |= 8192;
        v2Var.zzad = str;
    }

    public static /* synthetic */ void v0(v2 v2Var) {
        v2Var.zzf &= -8193;
        v2Var.zzad = zzd.zzad;
    }

    public static /* synthetic */ void w0(v2 v2Var, Set set) {
        b6 b6Var = v2Var.zzae;
        if (!b6Var.c()) {
            v2Var.zzae = w5.j(b6Var);
        }
        r4.f(set, v2Var.zzae);
    }

    public static void x0(v2 v2Var) {
        v2Var.zzh = e7.f8360x;
    }

    public static /* synthetic */ void y0(v2 v2Var, String str) {
        str.getClass();
        v2Var.zzf |= 16384;
        v2Var.zzaf = str;
    }

    public static /* synthetic */ void z0(v2 v2Var, int i6) {
        v2Var.U0();
        v2Var.zzh.remove(i6);
    }

    public final String A() {
        return this.zzD;
    }

    public final long A1() {
        return this.zzj;
    }

    public final String B() {
        return this.zzp;
    }

    public final long B1() {
        return this.zzx;
    }

    public final String C() {
        return this.zzo;
    }

    public final m2 C1(int i6) {
        return (m2) this.zzh.get(i6);
    }

    public final String D() {
        return this.zzy;
    }

    public final String E() {
        return this.zzad;
    }

    public final String F() {
        return this.zzr;
    }

    public final e3 F1(int i6) {
        return (e3) this.zzi.get(i6);
    }

    public final b6 G() {
        return this.zzG;
    }

    public final String G1() {
        return this.zzR;
    }

    public final b6 H() {
        return this.zzh;
    }

    public final String H1() {
        return this.zzu;
    }

    public final b6 I() {
        return this.zzi;
    }

    public final String I1() {
        return this.zzA;
    }

    public final String J1() {
        return this.zzt;
    }

    public final int T() {
        return this.zzI;
    }

    public final int T0() {
        return this.zzC;
    }

    public final void U0() {
        b6 b6Var = this.zzh;
        if (!b6Var.c()) {
            this.zzh = w5.j(b6Var);
        }
    }

    public final void V0() {
        b6 b6Var = this.zzi;
        if (!b6Var.c()) {
            this.zzi = w5.j(b6Var);
        }
    }

    public final boolean W0() {
        if ((this.zze & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public final boolean X0() {
        if ((this.zzf & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Y0() {
        if ((this.zze & 524288) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Z0() {
        if ((this.zzf & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean a1() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean b1() {
        if ((this.zze & 16384) != 0) {
            return true;
        }
        return false;
    }

    public final boolean c1() {
        if ((this.zze & 131072) != 0) {
            return true;
        }
        return false;
    }

    public final boolean d1() {
        if ((this.zze & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean e1() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f1() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g1() {
        if ((this.zzf & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h1() {
        if ((this.zze & 8388608) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i1() {
        if ((this.zzf & 8192) != 0) {
            return true;
        }
        return false;
    }

    public final boolean j1() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k1() {
        if ((this.zze & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l1() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m1() {
        if ((this.zze & 32768) != 0) {
            return true;
        }
        return false;
    }

    public final int n1() {
        return this.zzh.size();
    }

    public final int o1() {
        return this.zzg;
    }

    public final int p1() {
        return this.zzQ;
    }

    public final boolean q0() {
        return this.zzz;
    }

    public final int q1() {
        return this.zzs;
    }

    public final boolean r0() {
        return this.zzF;
    }

    public final int r1() {
        return this.zzi.size();
    }

    public final boolean s0() {
        if ((this.zze & 33554432) != 0) {
            return true;
        }
        return false;
    }

    public final long s1() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.measurement.w5
    public final Object t(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return zzd;
                    }
                    return new u2(0);
                }
                return new v2();
            }
            return new f7(zzd, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.", new Object[]{"zze", "zzf", "zzg", "zzh", m2.class, "zzi", e3.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", i2.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", f2.f8375a, "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf"});
        }
        return (byte) 1;
    }

    public final boolean t0() {
        if ((this.zze & 1048576) != 0) {
            return true;
        }
        return false;
    }

    public final long t1() {
        return this.zzB;
    }

    public final String u() {
        return this.zzv;
    }

    public final long u1() {
        return this.zzU;
    }

    public final String v() {
        return this.zzX;
    }

    public final long v1() {
        return this.zzl;
    }

    public final String w() {
        return this.zzq;
    }

    public final long w1() {
        return this.zzw;
    }

    public final String x() {
        return this.zzO;
    }

    public final long x1() {
        return this.zzn;
    }

    public final String y() {
        return this.zzH;
    }

    public final long y1() {
        return this.zzm;
    }

    public final String z() {
        return this.zzE;
    }

    public final long z1() {
        return this.zzk;
    }
}
