package dw;

import retrofit2.HttpException;
/* compiled from: KotlinExtensions.kt */
/* loaded from: classes2.dex */
public final class n implements d<Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j f13580u;

    public n(kotlinx.coroutines.k kVar) {
        this.f13580u = kVar;
    }

    @Override // dw.d
    public final void onFailure(b<Object> call, Throwable t3) {
        kotlin.jvm.internal.i.h(call, "call");
        kotlin.jvm.internal.i.h(t3, "t");
        this.f13580u.resumeWith(sp.b.j(t3));
    }

    @Override // dw.d
    public final void onResponse(b<Object> call, z<Object> response) {
        kotlin.jvm.internal.i.h(call, "call");
        kotlin.jvm.internal.i.h(response, "response");
        boolean a10 = response.a();
        kotlinx.coroutines.j jVar = this.f13580u;
        if (a10) {
            jVar.resumeWith(response.f13696b);
        } else {
            jVar.resumeWith(sp.b.j(new HttpException(response)));
        }
    }
}
