package tr;

import java.util.logging.Level;
import java.util.logging.Logger;
import tr.l;
/* compiled from: ThreadLocalContextStorage.java */
/* loaded from: classes2.dex */
public final class m0 extends l.b {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f33533a = Logger.getLogger(m0.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<l> f33534b = new ThreadLocal<>();

    @Override // tr.l.b
    public final l a() {
        l lVar = f33534b.get();
        if (lVar == null) {
            return l.f33517b;
        }
        return lVar;
    }

    @Override // tr.l.b
    public final void b(l lVar, l lVar2) {
        if (a() != lVar) {
            f33533a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        l lVar3 = l.f33517b;
        ThreadLocal<l> threadLocal = f33534b;
        if (lVar2 != lVar3) {
            threadLocal.set(lVar2);
        } else {
            threadLocal.set(null);
        }
    }

    @Override // tr.l.b
    public final l c(l lVar) {
        l a10 = a();
        f33534b.set(lVar);
        return a10;
    }
}
