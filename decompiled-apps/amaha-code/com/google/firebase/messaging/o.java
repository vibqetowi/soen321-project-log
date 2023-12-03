package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.os.Bundle;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f9764u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f9765v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ya.i f9766w;

    public /* synthetic */ o(FirebaseMessaging firebaseMessaging, ya.i iVar, int i6) {
        this.f9764u = i6;
        this.f9765v = firebaseMessaging;
        this.f9766w = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9764u) {
            case 0:
                ya.i iVar = this.f9766w;
                c0 c0Var = FirebaseMessaging.f9641m;
                FirebaseMessaging firebaseMessaging = this.f9765v;
                firebaseMessaging.getClass();
                try {
                    qe.a aVar = firebaseMessaging.f9645b;
                    u.c(firebaseMessaging.f9644a);
                    aVar.b();
                    iVar.b(null);
                    return;
                } catch (Exception e10) {
                    iVar.a(e10);
                    return;
                }
            case 1:
                FirebaseMessaging firebaseMessaging2 = this.f9765v;
                ya.i iVar2 = this.f9766w;
                c0 c0Var2 = FirebaseMessaging.f9641m;
                firebaseMessaging2.getClass();
                try {
                    r rVar = firebaseMessaging2.f9648e;
                    rVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    ya.k.a(rVar.a(rVar.c(u.c(rVar.f9771a), "*", bundle)));
                    c0 c10 = FirebaseMessaging.c(firebaseMessaging2.f9647d);
                    String d10 = firebaseMessaging2.d();
                    String c11 = u.c(firebaseMessaging2.f9644a);
                    synchronized (c10) {
                        String a10 = c0.a(d10, c11);
                        SharedPreferences.Editor edit = c10.f9687a.edit();
                        edit.remove(a10);
                        edit.commit();
                    }
                    iVar2.b(null);
                    return;
                } catch (Exception e11) {
                    iVar2.a(e11);
                    return;
                }
            default:
                ya.i iVar3 = this.f9766w;
                c0 c0Var3 = FirebaseMessaging.f9641m;
                FirebaseMessaging firebaseMessaging3 = this.f9765v;
                firebaseMessaging3.getClass();
                try {
                    iVar3.b(firebaseMessaging3.a());
                    return;
                } catch (Exception e12) {
                    iVar3.a(e12);
                    return;
                }
        }
    }
}
