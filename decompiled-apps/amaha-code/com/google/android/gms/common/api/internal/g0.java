package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class g0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public Context f7379a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.appcompat.widget.l f7380b;

    public g0(androidx.appcompat.widget.l lVar) {
        this.f7380b = lVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        String str = null;
        if (data != null) {
            str = data.getSchemeSpecificPart();
        }
        if (!"com.google.android.gms".equals(str)) {
            return;
        }
        ((b1) this.f7380b.f1472w).getClass();
        throw null;
    }
}
