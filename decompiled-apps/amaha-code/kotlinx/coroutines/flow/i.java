package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.AbortFlowException;
/* compiled from: Limit.kt */
/* loaded from: classes2.dex */
public final class i implements e<Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f23523u;

    public i(kotlin.jvm.internal.x xVar) {
        this.f23523u = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.e
    public final Object b(Object obj, ls.d<? super hs.k> dVar) {
        this.f23523u.f23469u = obj;
        throw new AbortFlowException(this);
    }
}
