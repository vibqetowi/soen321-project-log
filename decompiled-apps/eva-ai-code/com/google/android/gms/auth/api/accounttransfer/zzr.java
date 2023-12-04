package com.google.android.gms.auth.api.accounttransfer;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public final class zzr implements Api.ApiOptions.Optional {
    public static final zzr zza;
    private final Bundle zzb;

    static {
        Bundle bundle = new Bundle();
        if (!bundle.containsKey("accountTypes")) {
            bundle.putStringArrayList("accountTypes", new ArrayList<>(0));
        }
        zza = new zzr(bundle, null);
    }

    /* synthetic */ zzr(Bundle bundle, zzq zzqVar) {
        this.zzb = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzr) {
            Bundle zza2 = zza();
            Bundle zza3 = ((zzr) obj).zza();
            if (zza2.size() != zza3.size()) {
                return false;
            }
            for (String str : zza2.keySet()) {
                if (!zza3.containsKey(str) || !Objects.equal(zza2.get(str), zza3.get(str))) {
                    return false;
                }
                while (r3.hasNext()) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Bundle zza2 = zza();
        int size = zza2.size();
        ArrayList arrayList = new ArrayList(size + size);
        ArrayList arrayList2 = new ArrayList(zza2.keySet());
        Collections.sort(arrayList2);
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            String str = (String) arrayList2.get(i);
            arrayList.add(str);
            arrayList.add(zza2.get(str));
        }
        return Objects.hashCode(arrayList);
    }

    public final Bundle zza() {
        return new Bundle(this.zzb);
    }
}
