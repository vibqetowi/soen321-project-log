package kv;

import kotlinx.coroutines.j;
import kotlinx.coroutines.k;
import ya.d;
import ya.h;
/* compiled from: Tasks.kt */
/* loaded from: classes2.dex */
public final class b<TResult> implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j<Object> f23958a;

    public b(k kVar) {
        this.f23958a = kVar;
    }

    @Override // ya.d
    public final void a(h<Object> hVar) {
        Exception exception = hVar.getException();
        j<Object> jVar = this.f23958a;
        if (exception == null) {
            if (hVar.isCanceled()) {
                jVar.w(null);
                return;
            } else {
                jVar.resumeWith(hVar.getResult());
                return;
            }
        }
        jVar.resumeWith(sp.b.j(exception));
    }
}
