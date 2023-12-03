package p0;

import android.os.Handler;
import com.google.android.gms.internal.cast.w;
import j0.h;
import p0.k;
/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final w f27826a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f27827b;

    public c(h.a aVar, Handler handler) {
        this.f27826a = aVar;
        this.f27827b = handler;
    }

    public final void a(k.a aVar) {
        boolean z10;
        int i6 = aVar.f27851b;
        if (i6 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Handler handler = this.f27827b;
        w wVar = this.f27826a;
        if (z10) {
            handler.post(new a(wVar, aVar.f27850a));
        } else {
            handler.post(new b(wVar, i6));
        }
    }
}
