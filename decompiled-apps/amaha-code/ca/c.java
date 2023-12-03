package ca;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f5223b = new c();

    /* renamed from: a  reason: collision with root package name */
    public b f5224a = null;

    public static b a(Context context) {
        b bVar;
        c cVar = f5223b;
        synchronized (cVar) {
            if (cVar.f5224a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                cVar.f5224a = new b(context);
            }
            bVar = cVar.f5224a;
        }
        return bVar;
    }
}
