package com.google.android.gms.auth;

import android.content.Intent;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {
    private final int zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GooglePlayServicesAvailabilityException(int i, String str, Intent intent) {
        super(str, intent);
        this.zza = i;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
