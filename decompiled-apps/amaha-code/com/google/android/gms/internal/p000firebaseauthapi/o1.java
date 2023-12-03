package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.o1  reason: invalid package */
/* loaded from: classes.dex */
public final class o1 extends p1 {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.p1
    public final List a(long j10, Object obj) {
        int i6;
        h1 h1Var = (h1) f3.j(j10, obj);
        if (!h1Var.c()) {
            int size = h1Var.size();
            if (size == 0) {
                i6 = 10;
            } else {
                i6 = size + size;
            }
            h1 k10 = h1Var.k(i6);
            f3.s(j10, obj, k10);
            return k10;
        }
        return h1Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p1
    public final void b(long j10, Object obj) {
        ((h1) f3.j(j10, obj)).b();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p1
    public final void c(long j10, Object obj, Object obj2) {
        h1 h1Var = (h1) f3.j(j10, obj);
        h1 h1Var2 = (h1) f3.j(j10, obj2);
        int size = h1Var.size();
        int size2 = h1Var2.size();
        if (size > 0 && size2 > 0) {
            if (!h1Var.c()) {
                h1Var = h1Var.k(size2 + size);
            }
            h1Var.addAll(h1Var2);
        }
        if (size > 0) {
            h1Var2 = h1Var;
        }
        f3.s(j10, obj, h1Var2);
    }
}
