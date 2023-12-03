package ta;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class d4 extends l2 {

    /* renamed from: a  reason: collision with root package name */
    public final d6 f32521a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f32522b;

    /* renamed from: c  reason: collision with root package name */
    public String f32523c;

    public d4(d6 d6Var) {
        v9.o.h(d6Var);
        this.f32521a = d6Var;
        this.f32523c = null;
    }

    @Override // ta.m2
    public final void E1(m6 m6Var) {
        v9.o.e(m6Var.f32748u);
        S1(m6Var.f32748u, false);
        c1(new a4(this, m6Var, 0));
    }

    @Override // ta.m2
    public final List G(String str, String str2, boolean z10, m6 m6Var) {
        R1(m6Var);
        String str3 = m6Var.f32748u;
        v9.o.h(str3);
        d6 d6Var = this.f32521a;
        try {
            List<i6> list = (List) d6Var.a().n(new z3(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (i6 i6Var : list) {
                if (z10 || !k6.S(i6Var.f32633c)) {
                    arrayList.add(new g6(i6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            w2 b10 = d6Var.b();
            b10.f32925z.d("Failed to query user properties. appId", w2.q(str3), e10);
            return Collections.emptyList();
        }
    }

    @Override // ta.m2
    public final void G0(Bundle bundle, m6 m6Var) {
        R1(m6Var);
        String str = m6Var.f32748u;
        v9.o.h(str);
        c1(new k9.d0(4, this, str, bundle));
    }

    @Override // ta.m2
    public final void K(m6 m6Var) {
        v9.o.e(m6Var.f32748u);
        v9.o.h(m6Var.P);
        a4 a4Var = new a4(this, m6Var, 2);
        d6 d6Var = this.f32521a;
        if (d6Var.a().r()) {
            a4Var.run();
        } else {
            d6Var.a().q(a4Var);
        }
    }

    @Override // ta.m2
    public final byte[] N0(s sVar, String str) {
        v9.o.e(str);
        v9.o.h(sVar);
        S1(str, true);
        d6 d6Var = this.f32521a;
        w2 b10 = d6Var.b();
        y3 y3Var = d6Var.F;
        r2 r2Var = y3Var.G;
        String str2 = sVar.f32858u;
        b10.G.c(r2Var.d(str2), "Log and bundle. event");
        ((kotlin.jvm.internal.b0) d6Var.c()).getClass();
        long nanoTime = System.nanoTime() / 1000000;
        w3 a10 = d6Var.a();
        c4.t tVar = new c4.t(this, sVar, str);
        a10.j();
        u3 u3Var = new u3(a10, tVar, true);
        if (Thread.currentThread() == a10.f32926w) {
            u3Var.run();
        } else {
            a10.s(u3Var);
        }
        try {
            byte[] bArr = (byte[]) u3Var.get();
            if (bArr == null) {
                d6Var.b().f32925z.c(w2.q(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((kotlin.jvm.internal.b0) d6Var.c()).getClass();
            d6Var.b().G.e("Log and bundle processed. event, size, time_ms", y3Var.G.d(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            w2 b11 = d6Var.b();
            b11.f32925z.e("Failed to log and bundle. appId, event, error", w2.q(str), y3Var.G.d(str2), e10);
            return null;
        }
    }

    @Override // ta.m2
    public final void O0(long j10, String str, String str2, String str3) {
        c1(new c4(this, str2, str3, str, j10, 0));
    }

    @Override // ta.m2
    public final List Q(String str, String str2, String str3, boolean z10) {
        S1(str, true);
        d6 d6Var = this.f32521a;
        try {
            List<i6> list = (List) d6Var.a().n(new z3(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (i6 i6Var : list) {
                if (z10 || !k6.S(i6Var.f32633c)) {
                    arrayList.add(new g6(i6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            w2 b10 = d6Var.b();
            b10.f32925z.d("Failed to get user properties as. appId", w2.q(str), e10);
            return Collections.emptyList();
        }
    }

    public final void R1(m6 m6Var) {
        v9.o.h(m6Var);
        String str = m6Var.f32748u;
        v9.o.e(str);
        S1(str, false);
        this.f32521a.P().H(m6Var.f32749v, m6Var.K);
    }

    public final void S1(String str, boolean z10) {
        boolean z11;
        boolean isEmpty = TextUtils.isEmpty(str);
        d6 d6Var = this.f32521a;
        if (!isEmpty) {
            if (z10) {
                try {
                    if (this.f32522b == null) {
                        if (!"com.google.android.gms".equals(this.f32523c) && !aa.j.a(Binder.getCallingUid(), d6Var.F.f32953u) && !s9.i.a(d6Var.F.f32953u).b(Binder.getCallingUid())) {
                            z11 = false;
                            this.f32522b = Boolean.valueOf(z11);
                        }
                        z11 = true;
                        this.f32522b = Boolean.valueOf(z11);
                    }
                    if (this.f32522b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e10) {
                    d6Var.b().f32925z.c(w2.q(str), "Measurement Service called with invalid calling package. appId");
                    throw e10;
                }
            }
            if (this.f32523c == null) {
                Context context = d6Var.F.f32953u;
                int callingUid = Binder.getCallingUid();
                AtomicBoolean atomicBoolean = s9.h.f31341a;
                if (aa.j.b(context, str, callingUid)) {
                    this.f32523c = str;
                }
            }
            if (str.equals(this.f32523c)) {
                return;
            }
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
        d6Var.b().f32925z.b("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override // ta.m2
    public final String Y0(m6 m6Var) {
        R1(m6Var);
        d6 d6Var = this.f32521a;
        try {
            return (String) d6Var.a().n(new b4(d6Var, 1, m6Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            w2 b10 = d6Var.b();
            b10.f32925z.d("Failed to get app instance id. appId", w2.q(m6Var.f32748u), e10);
            return null;
        }
    }

    public final void c1(Runnable runnable) {
        d6 d6Var = this.f32521a;
        if (d6Var.a().r()) {
            runnable.run();
        } else {
            d6Var.a().p(runnable);
        }
    }

    @Override // ta.m2
    public final void e1(c cVar, m6 m6Var) {
        v9.o.h(cVar);
        v9.o.h(cVar.f32493w);
        R1(m6Var);
        c cVar2 = new c(cVar);
        cVar2.f32491u = m6Var.f32748u;
        c1(new k9.d0(this, cVar2, m6Var, 5));
    }

    @Override // ta.m2
    public final List i0(String str, String str2, String str3) {
        S1(str, true);
        d6 d6Var = this.f32521a;
        try {
            return (List) d6Var.a().n(new z3(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            d6Var.b().f32925z.c(e10, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    @Override // ta.m2
    public final void k0(m6 m6Var) {
        R1(m6Var);
        c1(new a4(this, m6Var, 3));
    }

    @Override // ta.m2
    public final void q1(g6 g6Var, m6 m6Var) {
        v9.o.h(g6Var);
        R1(m6Var);
        c1(new k9.d0(this, g6Var, m6Var, 8));
    }

    @Override // ta.m2
    public final void s0(s sVar, m6 m6Var) {
        v9.o.h(sVar);
        R1(m6Var);
        c1(new k9.d0(this, sVar, m6Var, 6));
    }

    @Override // ta.m2
    public final List v0(String str, String str2, m6 m6Var) {
        R1(m6Var);
        String str3 = m6Var.f32748u;
        v9.o.h(str3);
        d6 d6Var = this.f32521a;
        try {
            return (List) d6Var.a().n(new z3(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            d6Var.b().f32925z.c(e10, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    @Override // ta.m2
    public final void y0(m6 m6Var) {
        R1(m6Var);
        c1(new a4(this, m6Var, 1));
    }

    public final void z(s sVar, m6 m6Var) {
        d6 d6Var = this.f32521a;
        d6Var.e();
        d6Var.i(sVar, m6Var);
    }
}
