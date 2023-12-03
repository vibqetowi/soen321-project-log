package hc;

import android.content.Context;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public final class f implements ic.c {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f17375u;

    /* renamed from: v  reason: collision with root package name */
    public final ic.c f17376v;

    public /* synthetic */ f(ic.c cVar, int i6) {
        this.f17375u = i6;
        this.f17376v = cVar;
    }

    @Override // ic.c, mc.a
    public final Object a() {
        int i6 = this.f17375u;
        ic.c cVar = this.f17376v;
        switch (i6) {
            case 0:
                Context context = ((h) cVar).f17379u.f8726u;
                if (context != null) {
                    return new e(context);
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 1:
                g gVar = (g) cVar.a();
                if (gVar != null) {
                    return gVar;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                Context context2 = ((h) cVar).f17379u.f8726u;
                if (context2 != null) {
                    return new l(context2);
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
