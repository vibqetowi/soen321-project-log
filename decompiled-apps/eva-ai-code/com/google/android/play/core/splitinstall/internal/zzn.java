package com.google.android.play.core.splitinstall.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzn {
    private final List zza = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (zzp zzpVar : this.zza) {
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", zzpVar.zza());
            bundle.putLong("event_timestamp", zzpVar.zzb());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final void zzb(int i) {
        this.zza.add(zzp.zzc(i, System.currentTimeMillis()));
    }
}
