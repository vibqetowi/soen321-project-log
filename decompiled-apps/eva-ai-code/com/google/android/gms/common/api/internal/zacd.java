package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zacd<T> implements OnCompleteListener<T> {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey<?> zac;
    private final long zad;
    private final long zae;

    zacd(GoogleApiManager googleApiManager, int i, ApiKey<?> apiKey, long j, long j2, String str, String str2) {
        this.zaa = googleApiManager;
        this.zab = i;
        this.zac = apiKey;
        this.zad = j;
        this.zae = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zacd<T> zaa(GoogleApiManager googleApiManager, int i, ApiKey<?> apiKey) {
        boolean z;
        if (googleApiManager.zaF()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if (config == null) {
                z = true;
            } else if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            } else {
                z = config.getMethodTimingTelemetryEnabled();
                zabq zak = googleApiManager.zak(apiKey);
                if (zak != null) {
                    if (!(zak.zaf() instanceof BaseGmsClient)) {
                        return null;
                    }
                    BaseGmsClient baseGmsClient = (BaseGmsClient) zak.zaf();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration zab = zab(zak, baseGmsClient, i);
                        if (zab == null) {
                            return null;
                        }
                        zak.zaq();
                        z = zab.getMethodTimingTelemetryEnabled();
                    }
                }
            }
            return new zacd<>(googleApiManager, i, apiKey, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L, null, null);
        }
        return null;
    }

    private static ConnectionTelemetryConfiguration zab(zabq<?> zabqVar, BaseGmsClient<?> baseGmsClient, int i) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i))) || zabqVar.zac() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<T> task) {
        zabq zak;
        int i;
        int i2;
        int i3;
        int errorCode;
        long j;
        long j2;
        int i4;
        if (this.zaa.zaF()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zak = this.zaa.zak(this.zac)) != null && (zak.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zak.zaf();
                boolean z = true;
                int i5 = 0;
                boolean z2 = this.zad > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                if (config != null) {
                    z2 &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    i = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration zab = zab(zak, baseGmsClient, this.zab);
                        if (zab == null) {
                            return;
                        }
                        if (!zab.getMethodTimingTelemetryEnabled() || this.zad <= 0) {
                            z = false;
                        }
                        maxMethodInvocationsInBatch = zab.getMaxMethodInvocationsLogged();
                        z2 = z;
                    }
                    i3 = batchPeriodMillis;
                    i2 = maxMethodInvocationsInBatch;
                } else {
                    i = 0;
                    i2 = 100;
                    i3 = 5000;
                }
                GoogleApiManager googleApiManager = this.zaa;
                if (task.isSuccessful()) {
                    errorCode = 0;
                } else {
                    if (task.isCanceled()) {
                        i5 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof ApiException) {
                            Status status = ((ApiException) exception).getStatus();
                            int statusCode = status.getStatusCode();
                            ConnectionResult connectionResult = status.getConnectionResult();
                            errorCode = connectionResult == null ? -1 : connectionResult.getErrorCode();
                            i5 = statusCode;
                        } else {
                            i5 = 101;
                        }
                    }
                    errorCode = -1;
                }
                if (z2) {
                    long j3 = this.zad;
                    long currentTimeMillis = System.currentTimeMillis();
                    i4 = (int) (SystemClock.elapsedRealtime() - this.zae);
                    j = j3;
                    j2 = currentTimeMillis;
                } else {
                    j = 0;
                    j2 = 0;
                    i4 = -1;
                }
                googleApiManager.zay(new MethodInvocation(this.zab, i5, errorCode, j, j2, null, null, gCoreServiceId, i4), i, i3, i2);
            }
        }
    }
}
