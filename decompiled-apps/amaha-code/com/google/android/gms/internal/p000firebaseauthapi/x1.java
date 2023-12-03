package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.x1  reason: invalid package */
/* loaded from: classes.dex */
public final class x1 {
    public static final void a(Object obj, Object obj2) {
        w1 w1Var = (w1) obj;
        v1 v1Var = (v1) obj2;
        if (!w1Var.isEmpty()) {
            Iterator it = w1Var.entrySet().iterator();
            if (!it.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static final boolean b(Object obj) {
        if (!((w1) obj).f8219u) {
            return true;
        }
        return false;
    }

    public static final w1 c(Object obj, Object obj2) {
        w1 w1Var = (w1) obj;
        w1 w1Var2 = (w1) obj2;
        if (!w1Var2.isEmpty()) {
            if (!w1Var.f8219u) {
                w1Var = w1Var.b();
            }
            w1Var.f();
            if (!w1Var2.isEmpty()) {
                w1Var.putAll(w1Var2);
            }
        }
        return w1Var;
    }
}
