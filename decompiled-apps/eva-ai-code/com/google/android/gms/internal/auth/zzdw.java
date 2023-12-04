package com.google.android.gms.internal.auth;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
final class zzdw implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzee zzeeVar = (zzee) obj;
        zzee zzeeVar2 = (zzee) obj2;
        zzdv zzdvVar = new zzdv(zzeeVar);
        zzdv zzdvVar2 = new zzdv(zzeeVar2);
        while (zzdvVar.hasNext() && zzdvVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzdvVar.zza() & 255).compareTo(Integer.valueOf(zzdvVar2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzeeVar.zzd()).compareTo(Integer.valueOf(zzeeVar2.zzd()));
    }
}
