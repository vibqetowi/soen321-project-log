package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
final class zzdm implements Serializable, zzdj {
    final Object zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdm(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzdm) {
            Object obj2 = this.zza;
            Object obj3 = ((zzdm) obj).zza;
            return obj2 == obj3 || obj2.equals(obj3);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.zza + ")";
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        return this.zza;
    }
}
