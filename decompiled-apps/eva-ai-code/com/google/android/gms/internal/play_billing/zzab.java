package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes2.dex */
final class zzab extends zzu {
    final /* synthetic */ zzac zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(zzac zzacVar) {
        this.zza = zzacVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.zzc;
        zzm.zza(i, i2, FirebaseAnalytics.Param.INDEX);
        zzac zzacVar = this.zza;
        objArr = zzacVar.zzb;
        int i3 = i + i;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = zzacVar.zzb;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzc;
        return i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final boolean zzf() {
        return true;
    }
}
