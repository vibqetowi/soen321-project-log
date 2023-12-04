package com.google.android.gms.internal.auth;

import android.util.Log;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public final class zzcv extends zzdc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcv(zzcz zzczVar, String str, Long l, boolean z) {
        super(zzczVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    @Nullable
    final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = super.zzc();
            Log.e("PhenotypeFlag", "Invalid long value for " + zzc + ": " + ((String) obj));
            return null;
        }
    }
}
