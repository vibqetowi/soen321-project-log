package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class y3 {
    public static final void a(Object obj, Object obj2) {
        x3 x3Var = (x3) obj;
        w3 w3Var = (w3) obj2;
        if (!x3Var.isEmpty()) {
            Iterator it = x3Var.entrySet().iterator();
            if (!it.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }
}
