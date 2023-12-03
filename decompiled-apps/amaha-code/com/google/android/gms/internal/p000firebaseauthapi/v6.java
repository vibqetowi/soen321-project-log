package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.v6  reason: invalid package */
/* loaded from: classes.dex */
public final class v6 {

    /* renamed from: b  reason: collision with root package name */
    public static final v6 f8202b = new v6();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f8203a = new AtomicReference(new h7(new e7()));

    public final synchronized void a(h6 h6Var) {
        e7 e7Var = new e7((h7) this.f8203a.get());
        e7Var.a(h6Var);
        this.f8203a.set(new h7(e7Var));
    }

    public final synchronized void b(k6 k6Var) {
        e7 e7Var = new e7((h7) this.f8203a.get());
        e7Var.b(k6Var);
        this.f8203a.set(new h7(e7Var));
    }

    public final synchronized void c(w6 w6Var) {
        e7 e7Var = new e7((h7) this.f8203a.get());
        e7Var.c(w6Var);
        this.f8203a.set(new h7(e7Var));
    }

    public final synchronized void d(y6 y6Var) {
        e7 e7Var = new e7((h7) this.f8203a.get());
        e7Var.d(y6Var);
        this.f8203a.set(new h7(e7Var));
    }
}
