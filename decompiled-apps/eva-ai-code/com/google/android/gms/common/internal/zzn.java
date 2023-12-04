package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzn {
    private static final Uri zza = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority("com.google.android.gms.chimera").build();
    private final String zzb;
    private final String zzc;
    private final ComponentName zzd;
    private final int zze;
    private final boolean zzf;

    public zzn(ComponentName componentName, int i) {
        this.zzb = null;
        this.zzc = null;
        Preconditions.checkNotNull(componentName);
        this.zzd = componentName;
        this.zze = i;
        this.zzf = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzn) {
            zzn zznVar = (zzn) obj;
            return Objects.equal(this.zzb, zznVar.zzb) && Objects.equal(this.zzc, zznVar.zzc) && Objects.equal(this.zzd, zznVar.zzd) && this.zze == zznVar.zze && this.zzf == zznVar.zzf;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, this.zzc, this.zzd, Integer.valueOf(this.zze), Boolean.valueOf(this.zzf));
    }

    public final String toString() {
        String str = this.zzb;
        if (str == null) {
            Preconditions.checkNotNull(this.zzd);
            return this.zzd.flattenToString();
        }
        return str;
    }

    public final int zza() {
        return this.zze;
    }

    public final ComponentName zzb() {
        return this.zzd;
    }

    public final Intent zzc(Context context) {
        Bundle bundle;
        if (this.zzb != null) {
            if (this.zzf) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.zzb);
                try {
                    bundle = context.getContentResolver().call(zza, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    bundle = null;
                }
                r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
                if (r2 == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.zzb)));
                }
            }
            return r2 != null ? r2 : new Intent(this.zzb).setPackage(this.zzc);
        }
        return new Intent().setComponent(this.zzd);
    }

    public final String zzd() {
        return this.zzc;
    }

    public zzn(String str, int i, boolean z) {
        this(str, "com.google.android.gms", i, false);
    }

    public zzn(String str, String str2, int i, boolean z) {
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        Preconditions.checkNotEmpty(str2);
        this.zzc = str2;
        this.zzd = null;
        this.zze = i;
        this.zzf = z;
    }
}
