package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Set;
import v9.b;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class j implements a.e, ServiceConnection {
    @Override // com.google.android.gms.common.api.a.e
    public final Set<Scope> a() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.a.e
    public final void b(String str) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.e
    public final boolean d() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.e
    public final String e() {
        v9.o.h(null);
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.e
    public final void h() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.e
    public final void i(b.c cVar) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.e
    public final boolean j() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.e
    public final boolean k() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.e
    public final int l() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.a.e
    public final s9.d[] m() {
        return new s9.d[0];
    }

    @Override // com.google.android.gms.common.api.a.e
    public final String n() {
        return null;
    }

    @Override // com.google.android.gms.common.api.a.e
    public final boolean o() {
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.e
    public final void c(a0 a0Var) {
    }

    @Override // com.google.android.gms.common.api.a.e
    public final void f(v9.i iVar, Set<Scope> set) {
    }
}
