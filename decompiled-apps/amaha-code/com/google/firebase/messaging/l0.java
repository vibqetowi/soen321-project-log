package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.i;
import com.google.firebase.messaging.m0;
/* compiled from: WithinAppServiceBinder.java */
/* loaded from: classes.dex */
public final class l0 extends Binder {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f9750b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final a f9751a;

    /* compiled from: WithinAppServiceBinder.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public l0(i.a aVar) {
        this.f9751a = aVar;
    }

    public final void a(m0.a aVar) {
        ya.h processIntent;
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            processIntent = i.this.processIntent(aVar.f9760a);
            processIntent.addOnCompleteListener(new oe.f(6), new j0(1, aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
