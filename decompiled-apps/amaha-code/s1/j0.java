package s1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: NavigatorState.kt */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f31180a = new ReentrantLock(true);

    /* renamed from: b  reason: collision with root package name */
    public final kotlinx.coroutines.flow.x f31181b;

    /* renamed from: c  reason: collision with root package name */
    public final kotlinx.coroutines.flow.x f31182c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f31183d;

    /* renamed from: e  reason: collision with root package name */
    public final kotlinx.coroutines.flow.q f31184e;
    public final kotlinx.coroutines.flow.q f;

    public j0() {
        kotlinx.coroutines.flow.x f = tr.r.f(is.w.f20676u);
        this.f31181b = f;
        kotlinx.coroutines.flow.x f2 = tr.r.f(is.y.f20678u);
        this.f31182c = f2;
        this.f31184e = new kotlinx.coroutines.flow.q(f);
        this.f = new kotlinx.coroutines.flow.q(f2);
    }

    public abstract f a(u uVar, Bundle bundle);

    public final void b(f fVar) {
        kotlinx.coroutines.flow.x xVar = this.f31181b;
        xVar.setValue(is.u.v2(fVar, is.u.r2((Iterable) xVar.getValue(), is.u.o2((List) xVar.getValue()))));
    }

    public void c(f popUpTo, boolean z10) {
        kotlin.jvm.internal.i.g(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f31180a;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.flow.x xVar = this.f31181b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) xVar.getValue()) {
                if (!(!kotlin.jvm.internal.i.b((f) obj, popUpTo))) {
                    break;
                }
                arrayList.add(obj);
            }
            xVar.setValue(arrayList);
            hs.k kVar = hs.k.f19476a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void d(f backStackEntry) {
        kotlin.jvm.internal.i.g(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f31180a;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.flow.x xVar = this.f31181b;
            xVar.setValue(is.u.v2(backStackEntry, (Collection) xVar.getValue()));
            hs.k kVar = hs.k.f19476a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
