package wn;

import kotlinx.coroutines.o0;
import ta.v;
/* compiled from: MultiTrackerViewModel.kt */
/* loaded from: classes2.dex */
public final class s<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f36856a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f36857b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f36858c;

    public s(ls.h hVar, kotlin.jvm.internal.u uVar, t tVar) {
        this.f36856a = hVar;
        this.f36857b = uVar;
        this.f36858c = tVar;
    }

    @Override // ya.d
    public final void a(ya.h<Void> it) {
        kotlin.jvm.internal.i.g(it, "it");
        this.f36856a.resumeWith(Boolean.valueOf(it.isSuccessful()));
        if (this.f36857b.f23466u) {
            t tVar = this.f36858c;
            tVar.getClass();
            v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new q(tVar, null), 3);
        }
    }
}
