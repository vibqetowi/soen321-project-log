package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public interface k0 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(n0 n0Var);

    void getAppInstanceId(n0 n0Var);

    void getCachedAppInstanceId(n0 n0Var);

    void getConditionalUserProperties(String str, String str2, n0 n0Var);

    void getCurrentScreenClass(n0 n0Var);

    void getCurrentScreenName(n0 n0Var);

    void getGmpAppId(n0 n0Var);

    void getMaxUserProperties(String str, n0 n0Var);

    void getSessionId(n0 n0Var);

    void getTestFlag(n0 n0Var, int i6);

    void getUserProperties(String str, String str2, boolean z10, n0 n0Var);

    void initForTests(Map map);

    void initialize(da.a aVar, t0 t0Var, long j10);

    void isDataCollectionEnabled(n0 n0Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, n0 n0Var, long j10);

    void logHealthData(int i6, String str, da.a aVar, da.a aVar2, da.a aVar3);

    void onActivityCreated(da.a aVar, Bundle bundle, long j10);

    void onActivityDestroyed(da.a aVar, long j10);

    void onActivityPaused(da.a aVar, long j10);

    void onActivityResumed(da.a aVar, long j10);

    void onActivitySaveInstanceState(da.a aVar, n0 n0Var, long j10);

    void onActivityStarted(da.a aVar, long j10);

    void onActivityStopped(da.a aVar, long j10);

    void performAction(Bundle bundle, n0 n0Var, long j10);

    void registerOnMeasurementEventListener(q0 q0Var);

    void resetAnalyticsData(long j10);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(da.a aVar, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(q0 q0Var);

    void setInstanceIdProvider(s0 s0Var);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, da.a aVar, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(q0 q0Var);
}
