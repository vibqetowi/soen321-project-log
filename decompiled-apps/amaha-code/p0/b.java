package p0;

import com.google.android.gms.internal.cast.w;
import i0.f;
import j0.h;
/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ w f27824u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f27825v;

    public b(w wVar, int i6) {
        this.f27824u = wVar;
        this.f27825v = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.e eVar = ((h.a) this.f27824u).C;
        if (eVar != null) {
            eVar.c(this.f27825v);
        }
    }
}
