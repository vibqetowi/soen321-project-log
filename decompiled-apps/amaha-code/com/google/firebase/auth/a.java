package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f9549u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ we.b f9550v;

    public a(FirebaseAuth firebaseAuth, we.b bVar) {
        this.f9549u = firebaseAuth;
        this.f9550v = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseAuth firebaseAuth = this.f9549u;
        Iterator it = firebaseAuth.f9538c.iterator();
        while (it.hasNext()) {
            ((gd.a) it.next()).a(this.f9550v);
        }
        Iterator it2 = firebaseAuth.f9537b.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.b) it2.next()).a();
        }
    }
}
