package ta;

import java.util.LinkedHashMap;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class q3 extends t.f {
    public final /* synthetic */ r3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(r3 r3Var) {
        super(20);
        this.f = r3Var;
    }

    @Override // t.f
    public final Object a(Object obj) {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        v9.o.e(str);
        r3 r3Var = this.f;
        r3Var.i();
        v9.o.e(str);
        if (!r3Var.t(str)) {
            return null;
        }
        if (r3Var.B.containsKey(str) && r3Var.B.getOrDefault(str, null) != 0) {
            r3Var.o(str, (com.google.android.gms.internal.measurement.c2) r3Var.B.getOrDefault(str, null));
        } else {
            r3Var.n(str);
        }
        q3 q3Var = r3Var.D;
        synchronized (q3Var) {
            linkedHashMap = new LinkedHashMap(q3Var.f32235a);
        }
        return (com.google.android.gms.internal.measurement.h0) linkedHashMap.get(str);
    }
}
