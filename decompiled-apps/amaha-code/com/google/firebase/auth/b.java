package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f9551u;

    public b(FirebaseAuth firebaseAuth) {
        this.f9551u = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f9551u.f9539d.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.a) it.next()).a();
        }
    }
}
