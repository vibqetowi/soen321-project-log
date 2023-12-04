package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
/* loaded from: classes7.dex */
public final class zze implements zza {
    final Set zza;
    private final AnalyticsConnector.AnalyticsConnectorListener zzb;
    private final AppMeasurementSdk zzc;
    private final zzd zzd;

    public zze(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zzb = analyticsConnectorListener;
        this.zzc = appMeasurementSdk;
        zzd zzdVar = new zzd(this);
        this.zzd = zzdVar;
        appMeasurementSdk.registerOnMeasurementEventListener(zzdVar);
        this.zza = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0010 A[SYNTHETIC] */
    @Override // com.google.firebase.analytics.connector.internal.zza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(Set set) {
        boolean z;
        int codePointAt;
        this.zza.clear();
        Set set2 = this.zza;
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet.size() >= 50) {
                break;
            }
            int i = zzc.zza;
            if (str != null && str.length() != 0) {
                int codePointAt2 = str.codePointAt(0);
                if (!Character.isLetter(codePointAt2)) {
                    if (codePointAt2 == 95) {
                        codePointAt2 = 95;
                    }
                }
                int length = str.length();
                int charCount = Character.charCount(codePointAt2);
                while (charCount < length) {
                    int codePointAt3 = str.codePointAt(charCount);
                    if (codePointAt3 == 95 || Character.isLetterOrDigit(codePointAt3)) {
                        charCount += Character.charCount(codePointAt3);
                    }
                }
                z = true;
                if (z && str.length() != 0) {
                    codePointAt = str.codePointAt(0);
                    if (!Character.isLetter(codePointAt)) {
                        int length2 = str.length();
                        int charCount2 = Character.charCount(codePointAt);
                        while (true) {
                            if (charCount2 < length2) {
                                int codePointAt4 = str.codePointAt(charCount2);
                                if (codePointAt4 == 95 || Character.isLetterOrDigit(codePointAt4)) {
                                    charCount2 += Character.charCount(codePointAt4);
                                }
                            } else {
                                String zzb = zzhc.zzb(str);
                                if (zzb != null) {
                                    str = zzb;
                                }
                                Preconditions.checkNotNull(str);
                                hashSet.add(str);
                            }
                        }
                    }
                }
            }
            z = false;
            if (z) {
                codePointAt = str.codePointAt(0);
                if (!Character.isLetter(codePointAt)) {
                }
            }
        }
        set2.addAll(hashSet);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
        this.zza.clear();
    }
}
