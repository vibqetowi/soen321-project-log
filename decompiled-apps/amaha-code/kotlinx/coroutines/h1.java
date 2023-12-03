package kotlinx.coroutines;

import kotlinx.coroutines.internal.g;
/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes2.dex */
public final class h1 extends g.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g1 f23582d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f23583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(kotlinx.coroutines.internal.g gVar, g1 g1Var, Object obj) {
        super(gVar);
        this.f23582d = g1Var;
        this.f23583e = obj;
    }

    @Override // kotlinx.coroutines.internal.a
    public final kotlinx.coroutines.internal.r c(Object obj) {
        boolean z10;
        kotlinx.coroutines.internal.g gVar = (kotlinx.coroutines.internal.g) obj;
        if (this.f23582d.Q() == this.f23583e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        return kotlin.jvm.internal.b0.T;
    }
}
