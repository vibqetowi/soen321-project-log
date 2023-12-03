package kotlinx.coroutines.internal;

import kotlinx.coroutines.d0;
/* compiled from: Scopes.kt */
/* loaded from: classes2.dex */
public final class c implements d0 {

    /* renamed from: u  reason: collision with root package name */
    public final ls.f f23587u;

    public c(ls.f fVar) {
        this.f23587u = fVar;
    }

    @Override // kotlinx.coroutines.d0
    public final ls.f f0() {
        return this.f23587u;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f23587u + ')';
    }
}
