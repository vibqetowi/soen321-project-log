package hc;

import android.content.Context;
import com.google.android.gms.internal.measurement.z3;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public final class h implements ic.c {

    /* renamed from: u  reason: collision with root package name */
    public final z3 f17379u;

    public h(z3 z3Var) {
        this.f17379u = z3Var;
    }

    @Override // ic.c, mc.a
    public final Object a() {
        Context context = this.f17379u.f8726u;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
