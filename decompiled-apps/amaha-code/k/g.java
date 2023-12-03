package k;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.b0;
import t0.o0;
import t0.p0;
/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f22745c;

    /* renamed from: d  reason: collision with root package name */
    public p0 f22746d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22747e;

    /* renamed from: b  reason: collision with root package name */
    public long f22744b = -1;
    public final a f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<o0> f22743a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    /* loaded from: classes.dex */
    public class a extends b0 {
        public boolean e0 = false;

        /* renamed from: f0  reason: collision with root package name */
        public int f22748f0 = 0;

        public a() {
        }

        @Override // kotlin.jvm.internal.b0, t0.p0
        public final void d() {
            if (this.e0) {
                return;
            }
            this.e0 = true;
            p0 p0Var = g.this.f22746d;
            if (p0Var != null) {
                p0Var.d();
            }
        }

        @Override // t0.p0
        public final void e() {
            int i6 = this.f22748f0 + 1;
            this.f22748f0 = i6;
            g gVar = g.this;
            if (i6 == gVar.f22743a.size()) {
                p0 p0Var = gVar.f22746d;
                if (p0Var != null) {
                    p0Var.e();
                }
                this.f22748f0 = 0;
                this.e0 = false;
                gVar.f22747e = false;
            }
        }
    }

    public final void a() {
        if (!this.f22747e) {
            return;
        }
        Iterator<o0> it = this.f22743a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f22747e = false;
    }

    public final void b() {
        View view;
        if (this.f22747e) {
            return;
        }
        Iterator<o0> it = this.f22743a.iterator();
        while (it.hasNext()) {
            o0 next = it.next();
            long j10 = this.f22744b;
            if (j10 >= 0) {
                next.c(j10);
            }
            Interpolator interpolator = this.f22745c;
            if (interpolator != null && (view = next.f32342a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f22746d != null) {
                next.d(this.f);
            }
            View view2 = next.f32342a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f22747e = true;
    }
}
