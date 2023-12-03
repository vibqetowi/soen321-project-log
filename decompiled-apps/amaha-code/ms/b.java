package ms;

import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.i;
import ls.d;
import ns.g;
import ss.p;
/* compiled from: IntrinsicsJvm.kt */
/* loaded from: classes2.dex */
public final class b extends g {

    /* renamed from: u  reason: collision with root package name */
    public int f25729u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f25730v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f25731w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, d dVar, p pVar) {
        super(dVar);
        this.f25730v = pVar;
        this.f25731w = obj;
        i.e(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.f25729u;
        if (i6 != 0) {
            if (i6 == 1) {
                this.f25729u = 2;
                sp.b.d0(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.f25729u = 1;
        sp.b.d0(obj);
        p pVar = this.f25730v;
        i.e(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        c0.e(2, pVar);
        return pVar.invoke(this.f25731w, this);
    }
}
