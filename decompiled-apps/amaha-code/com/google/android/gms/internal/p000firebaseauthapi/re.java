package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.concurrent.ExecutorService;
import ya.i;
import ya.v;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.re  reason: invalid package */
/* loaded from: classes.dex */
public class re {

    /* renamed from: a  reason: collision with root package name */
    public ae f8112a;

    /* renamed from: b  reason: collision with root package name */
    public ExecutorService f8113b;

    public final v a(final pe peVar) {
        final i iVar = new i();
        this.f8113b.execute(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.qe
            @Override // java.lang.Runnable
            public final void run() {
                peVar.c(iVar, re.this.f8112a);
            }
        });
        return iVar.f38392a;
    }
}
