package vc;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.z0;
import java.util.List;
import java.util.Map;
import java.util.Random;
import ta.u4;
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
/* loaded from: classes.dex */
public final class a implements u4 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j1 f34974a;

    public a(j1 j1Var) {
        this.f34974a = j1Var;
    }

    @Override // ta.u4
    public final List a(String str, String str2) {
        return this.f34974a.e(str, str2);
    }

    @Override // ta.u4
    public final long b() {
        j1 j1Var = this.f34974a;
        j1Var.getClass();
        g0 g0Var = new g0();
        j1Var.b(new z0(j1Var, g0Var, 2));
        Long l2 = (Long) g0.R1(g0Var.z(500L), Long.class);
        if (l2 == null) {
            long nanoTime = System.nanoTime();
            j1Var.f8437b.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i6 = j1Var.f + 1;
            j1Var.f = i6;
            return nextLong + i6;
        }
        return l2.longValue();
    }

    @Override // ta.u4
    public final Map c(String str, String str2, boolean z10) {
        return this.f34974a.f(str, str2, z10);
    }

    @Override // ta.u4
    public final void d(Bundle bundle) {
        j1 j1Var = this.f34974a;
        j1Var.getClass();
        j1Var.b(new v0(j1Var, bundle, 0));
    }

    @Override // ta.u4
    public final int e(String str) {
        return this.f34974a.c(str);
    }

    @Override // ta.u4
    public final String f() {
        j1 j1Var = this.f34974a;
        j1Var.getClass();
        g0 g0Var = new g0();
        j1Var.b(new z0(j1Var, g0Var, 1));
        return g0Var.c1(50L);
    }

    @Override // ta.u4
    public final String g() {
        j1 j1Var = this.f34974a;
        j1Var.getClass();
        g0 g0Var = new g0();
        j1Var.b(new z0(j1Var, g0Var, 4));
        return g0Var.c1(500L);
    }

    @Override // ta.u4
    public final void h(String str, String str2, Bundle bundle) {
        j1 j1Var = this.f34974a;
        j1Var.getClass();
        j1Var.b(new d1(j1Var, str, str2, bundle, true));
    }

    @Override // ta.u4
    public final void i(String str) {
        j1 j1Var = this.f34974a;
        j1Var.getClass();
        j1Var.b(new x0(j1Var, str, 1));
    }

    @Override // ta.u4
    public final void j(String str, String str2, Bundle bundle) {
        j1 j1Var = this.f34974a;
        j1Var.getClass();
        j1Var.b(new w0(j1Var, str, str2, bundle, 0));
    }

    @Override // ta.u4
    public final void k(String str) {
        j1 j1Var = this.f34974a;
        j1Var.getClass();
        j1Var.b(new x0(j1Var, str, 2));
    }

    @Override // ta.u4
    public final String s() {
        j1 j1Var = this.f34974a;
        j1Var.getClass();
        g0 g0Var = new g0();
        j1Var.b(new z0(j1Var, g0Var, 0));
        return g0Var.c1(500L);
    }

    @Override // ta.u4
    public final String t() {
        j1 j1Var = this.f34974a;
        j1Var.getClass();
        g0 g0Var = new g0();
        j1Var.b(new z0(j1Var, g0Var, 3));
        return g0Var.c1(500L);
    }
}
