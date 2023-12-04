package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public final class zzcn extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcn(zzco zzcoVar, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        zzdc.zzd();
    }
}
