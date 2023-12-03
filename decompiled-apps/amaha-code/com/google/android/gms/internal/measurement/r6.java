package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class r6 {
    public static final void a(Object obj, Object obj2) {
        q6 q6Var = (q6) obj;
        p6 p6Var = (p6) obj2;
        if (!q6Var.isEmpty()) {
            Iterator it = q6Var.entrySet().iterator();
            if (!it.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static final q6 b(Object obj, Object obj2) {
        q6 q6Var = (q6) obj;
        q6 q6Var2 = (q6) obj2;
        if (!q6Var2.isEmpty()) {
            if (!q6Var.f8573u) {
                q6Var = q6Var.b();
            }
            q6Var.f();
            if (!q6Var2.isEmpty()) {
                q6Var.putAll(q6Var2);
            }
        }
        return q6Var;
    }
}
