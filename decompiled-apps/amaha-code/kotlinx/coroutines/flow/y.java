package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: StateFlow.kt */
/* loaded from: classes2.dex */
public final class y extends jv.b<x<?>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23569a = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    @Override // jv.b
    public final boolean a(jv.a aVar) {
        x xVar = (x) aVar;
        if (this._state != null) {
            return false;
        }
        this._state = tr.r.f33553l0;
        return true;
    }

    @Override // jv.b
    public final ls.d[] b(jv.a aVar) {
        x xVar = (x) aVar;
        this._state = null;
        return kotlin.jvm.internal.h.N;
    }
}
