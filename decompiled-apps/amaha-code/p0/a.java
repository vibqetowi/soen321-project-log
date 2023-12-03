package p0;

import android.graphics.Typeface;
import com.google.android.gms.internal.cast.w;
import i0.f;
import j0.h;
/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ w f27822u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Typeface f27823v;

    public a(w wVar, Typeface typeface) {
        this.f27822u = wVar;
        this.f27823v = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.e eVar = ((h.a) this.f27822u).C;
        if (eVar != null) {
            eVar.d(this.f27823v);
        }
    }
}
