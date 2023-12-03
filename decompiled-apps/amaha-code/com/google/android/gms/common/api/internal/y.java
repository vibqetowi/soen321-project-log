package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.b;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class y implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f7445a;

    public y(f fVar) {
        this.f7445a = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.b.a
    public final void onBackgroundStateChanged(boolean z10) {
        ka.d dVar = this.f7445a.G;
        dVar.sendMessage(dVar.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
