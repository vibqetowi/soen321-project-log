package iv;

import kotlin.jvm.internal.b0;
import kotlinx.coroutines.internal.g;
/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes2.dex */
public final class c extends g.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f20734d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w wVar, b bVar) {
        super(wVar);
        this.f20734d = bVar;
    }

    @Override // kotlinx.coroutines.internal.a
    public final kotlinx.coroutines.internal.r c(Object obj) {
        kotlinx.coroutines.internal.g gVar = (kotlinx.coroutines.internal.g) obj;
        if (this.f20734d.j()) {
            return null;
        }
        return b0.T;
    }
}
