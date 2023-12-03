package dw;
/* compiled from: KotlinExtensions.kt */
/* loaded from: classes2.dex */
public final class p implements d<Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j f13582u;

    public p(kotlinx.coroutines.k kVar) {
        this.f13582u = kVar;
    }

    @Override // dw.d
    public final void onFailure(b<Object> call, Throwable t3) {
        kotlin.jvm.internal.i.h(call, "call");
        kotlin.jvm.internal.i.h(t3, "t");
        this.f13582u.resumeWith(sp.b.j(t3));
    }

    @Override // dw.d
    public final void onResponse(b<Object> call, z<Object> response) {
        kotlin.jvm.internal.i.h(call, "call");
        kotlin.jvm.internal.i.h(response, "response");
        this.f13582u.resumeWith(response);
    }
}
