package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: Atomic.kt */
/* loaded from: classes2.dex */
public abstract class a<T> extends m {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23585a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = ca.a.J;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.m
    public final Object a(Object obj) {
        boolean z10;
        Object obj2 = this._consensus;
        r rVar = ca.a.J;
        if (obj2 == rVar) {
            r c10 = c(obj);
            obj2 = this._consensus;
            if (obj2 == rVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23585a;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, c10)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != rVar) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    obj2 = c10;
                } else {
                    obj2 = this._consensus;
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t3, Object obj);

    public abstract r c(Object obj);
}
