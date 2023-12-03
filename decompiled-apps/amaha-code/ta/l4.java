package ta;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class l4 {
    public long A;
    public String B;
    public boolean C;
    public long D;
    public long E;

    /* renamed from: a  reason: collision with root package name */
    public final y3 f32705a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32706b;

    /* renamed from: c  reason: collision with root package name */
    public String f32707c;

    /* renamed from: d  reason: collision with root package name */
    public String f32708d;

    /* renamed from: e  reason: collision with root package name */
    public String f32709e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public long f32710g;

    /* renamed from: h  reason: collision with root package name */
    public long f32711h;

    /* renamed from: i  reason: collision with root package name */
    public long f32712i;

    /* renamed from: j  reason: collision with root package name */
    public String f32713j;

    /* renamed from: k  reason: collision with root package name */
    public long f32714k;

    /* renamed from: l  reason: collision with root package name */
    public String f32715l;

    /* renamed from: m  reason: collision with root package name */
    public long f32716m;

    /* renamed from: n  reason: collision with root package name */
    public long f32717n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f32718o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f32719p;

    /* renamed from: q  reason: collision with root package name */
    public String f32720q;
    public Boolean r;

    /* renamed from: s  reason: collision with root package name */
    public long f32721s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList f32722t;

    /* renamed from: u  reason: collision with root package name */
    public String f32723u;

    /* renamed from: v  reason: collision with root package name */
    public long f32724v;

    /* renamed from: w  reason: collision with root package name */
    public long f32725w;

    /* renamed from: x  reason: collision with root package name */
    public long f32726x;

    /* renamed from: y  reason: collision with root package name */
    public long f32727y;

    /* renamed from: z  reason: collision with root package name */
    public long f32728z;

    public l4(y3 y3Var, String str) {
        v9.o.h(y3Var);
        v9.o.e(str);
        this.f32705a = y3Var;
        this.f32706b = str;
        w3 w3Var = y3Var.D;
        y3.k(w3Var);
        w3Var.h();
    }

    public final long A() {
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        return this.f32721s;
    }

    public final String B() {
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        return this.f32720q;
    }

    public final String C() {
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        String str = this.B;
        r(null);
        return str;
    }

    public final String D() {
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        return this.f32706b;
    }

    public final String E() {
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        return this.f32707c;
    }

    public final String F() {
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        return this.f32713j;
    }

    public final String G() {
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        return this.f;
    }

    public final String H() {
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        return this.f32708d;
    }

    public final void a(String str) {
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.C |= true ^ kotlin.jvm.internal.h.q0(this.f32720q, str);
        this.f32720q = str;
    }

    public final void b(String str) {
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        this.C |= !kotlin.jvm.internal.h.q0(this.f32707c, str);
        this.f32707c = str;
    }

    public final void c(String str) {
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        this.C |= !kotlin.jvm.internal.h.q0(this.f32715l, str);
        this.f32715l = str;
    }

    public final void d(String str) {
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        this.C |= !kotlin.jvm.internal.h.q0(this.f32713j, str);
        this.f32713j = str;
    }

    public final void e(long j10) {
        boolean z10;
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        boolean z11 = this.C;
        if (this.f32714k != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z11 | z10;
        this.f32714k = j10;
    }

    public final void f(long j10) {
        boolean z10;
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        boolean z11 = this.C;
        if (this.D != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z11 | z10;
        this.D = j10;
    }

    public final void g(long j10) {
        boolean z10;
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        boolean z11 = this.C;
        if (this.f32727y != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z11 | z10;
        this.f32727y = j10;
    }

    public final void h(long j10) {
        boolean z10;
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        boolean z11 = this.C;
        if (this.f32728z != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z11 | z10;
        this.f32728z = j10;
    }

    public final void i(long j10) {
        boolean z10;
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        boolean z11 = this.C;
        if (this.f32726x != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z11 | z10;
        this.f32726x = j10;
    }

    public final void j(long j10) {
        boolean z10;
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        boolean z11 = this.C;
        if (this.f32725w != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z11 | z10;
        this.f32725w = j10;
    }

    public final void k(long j10) {
        boolean z10;
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        boolean z11 = this.C;
        if (this.A != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z11 | z10;
        this.A = j10;
    }

    public final void l(long j10) {
        boolean z10;
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        boolean z11 = this.C;
        if (this.f32724v != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z11 | z10;
        this.f32724v = j10;
    }

    public final void m(long j10) {
        boolean z10;
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        boolean z11 = this.C;
        if (this.f32717n != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z11 | z10;
        this.f32717n = j10;
    }

    public final void n(long j10) {
        boolean z10;
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        boolean z11 = this.C;
        if (this.f32721s != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z11 | z10;
        this.f32721s = j10;
    }

    public final void o(String str) {
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        this.C |= !kotlin.jvm.internal.h.q0(this.f, str);
        this.f = str;
    }

    public final void p(String str) {
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.C |= true ^ kotlin.jvm.internal.h.q0(this.f32708d, str);
        this.f32708d = str;
    }

    public final void q(long j10) {
        boolean z10;
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        boolean z11 = this.C;
        if (this.f32716m != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z11 | z10;
        this.f32716m = j10;
    }

    public final void r(String str) {
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        this.C |= !kotlin.jvm.internal.h.q0(this.B, str);
        this.B = str;
    }

    public final void s(long j10) {
        boolean z10;
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        boolean z11 = this.C;
        if (this.f32712i != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z11 | z10;
        this.f32712i = j10;
    }

    public final void t(long j10) {
        boolean z10;
        boolean z11 = true;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        v9.o.b(z10);
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        boolean z12 = this.C;
        if (this.f32710g == j10) {
            z11 = false;
        }
        this.C = z12 | z11;
        this.f32710g = j10;
    }

    public final void u(long j10) {
        boolean z10;
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        boolean z11 = this.C;
        if (this.f32711h != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z11 | z10;
        this.f32711h = j10;
    }

    public final void v(boolean z10) {
        boolean z11;
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        boolean z12 = this.C;
        if (this.f32718o != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.C = z12 | z11;
        this.f32718o = z10;
    }

    public final void w(String str) {
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        this.C |= !kotlin.jvm.internal.h.q0(this.f32709e, str);
        this.f32709e = str;
    }

    public final void x(List list) {
        ArrayList arrayList;
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        if (!kotlin.jvm.internal.h.q0(this.f32722t, list)) {
            this.C = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.f32722t = arrayList;
        }
    }

    public final boolean y() {
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        return this.f32719p;
    }

    public final long z() {
        w3 w3Var = this.f32705a.D;
        y3.k(w3Var);
        w3Var.h();
        return this.f32714k;
    }
}
