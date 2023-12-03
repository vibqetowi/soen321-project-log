package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import h5.h;
import h5.i;
import kotlin.Metadata;
/* compiled from: AuthenticationTokenManager.kt */
/* loaded from: classes.dex */
public final class AuthenticationTokenManager {

    /* renamed from: d  reason: collision with root package name */
    public static final a f6088d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static AuthenticationTokenManager f6089e;

    /* renamed from: a  reason: collision with root package name */
    public final n1.a f6090a;

    /* renamed from: b  reason: collision with root package name */
    public final i f6091b;

    /* renamed from: c  reason: collision with root package name */
    public h f6092c;

    /* compiled from: AuthenticationTokenManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.i.g(context, "context");
            kotlin.jvm.internal.i.g(intent, "intent");
        }
    }

    /* compiled from: AuthenticationTokenManager.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public AuthenticationTokenManager(n1.a aVar, i iVar) {
        this.f6090a = aVar;
        this.f6091b = iVar;
    }
}
