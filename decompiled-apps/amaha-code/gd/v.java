package gd;

import android.app.Application;
import android.content.Context;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public volatile int f16447a;

    /* renamed from: b  reason: collision with root package name */
    public final l f16448b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f16449c;

    public v(sc.e eVar) {
        eVar.b();
        Context context = eVar.f31432a;
        l lVar = new l(eVar);
        this.f16449c = false;
        this.f16447a = 0;
        this.f16448b = lVar;
        com.google.android.gms.common.api.internal.b.b((Application) context.getApplicationContext());
        com.google.android.gms.common.api.internal.b.f7338y.a(new u(this));
    }
}
