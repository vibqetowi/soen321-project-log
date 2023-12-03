package hv;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes2.dex */
public final class e extends f {
    private volatile e _immediate;

    /* renamed from: w  reason: collision with root package name */
    public final Handler f19603w;

    /* renamed from: x  reason: collision with root package name */
    public final String f19604x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f19605y;

    /* renamed from: z  reason: collision with root package name */
    public final e f19606z;

    public e(Handler handler, String str, boolean z10) {
        this.f19603w = handler;
        this.f19604x = str;
        this.f19605y = z10;
        this._immediate = z10 ? this : null;
        e eVar = this._immediate;
        if (eVar == null) {
            eVar = new e(handler, str, true);
            this._immediate = eVar;
        }
        this.f19606z = eVar;
    }

    @Override // kotlinx.coroutines.j0
    public final void J(long j10, k kVar) {
        c cVar = new c(kVar, this);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f19603w.postDelayed(cVar, j10)) {
            kVar.p(new d(this, cVar));
        } else {
            M0(kVar.f23631y, cVar);
        }
    }

    @Override // kotlinx.coroutines.a0
    public final boolean K0() {
        if (this.f19605y && i.b(Looper.myLooper(), this.f19603w.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.k1
    public final k1 L0() {
        return this.f19606z;
    }

    public final void M0(ls.f fVar, Runnable runnable) {
        sp.b.d(fVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        o0.f23642c.f0(fVar, runnable);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof e) && ((e) obj).f19603w == this.f19603w) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.a0
    public final void f0(ls.f fVar, Runnable runnable) {
        if (!this.f19603w.post(runnable)) {
            M0(fVar, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f19603w);
    }

    @Override // kotlinx.coroutines.k1, kotlinx.coroutines.a0
    public final String toString() {
        k1 k1Var;
        String str;
        kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
        k1 k1Var2 = kotlinx.coroutines.internal.k.f23608a;
        if (this == k1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                k1Var = k1Var2.L0();
            } catch (UnsupportedOperationException unused) {
                k1Var = null;
            }
            if (this == k1Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.f19604x;
            if (str2 == null) {
                str2 = this.f19603w.toString();
            }
            if (this.f19605y) {
                return pl.a.f(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    public e(Handler handler) {
        this(handler, null, false);
    }
}
