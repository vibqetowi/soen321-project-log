package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzhg;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.3.0 */
/* loaded from: classes2.dex */
public class AppMeasurementSdk {
    private final zzef zza;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.3.0 */
    /* loaded from: classes2.dex */
    public static final class ConditionalUserProperty {
        public static final String ACTIVE = "active";
        public static final String CREATION_TIMESTAMP = "creation_timestamp";
        public static final String EXPIRED_EVENT_NAME = "expired_event_name";
        public static final String EXPIRED_EVENT_PARAMS = "expired_event_params";
        public static final String NAME = "name";
        public static final String ORIGIN = "origin";
        public static final String TIMED_OUT_EVENT_NAME = "timed_out_event_name";
        public static final String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";
        public static final String TIME_TO_LIVE = "time_to_live";
        public static final String TRIGGERED_EVENT_NAME = "triggered_event_name";
        public static final String TRIGGERED_EVENT_PARAMS = "triggered_event_params";
        public static final String TRIGGERED_TIMESTAMP = "triggered_timestamp";
        public static final String TRIGGER_EVENT_NAME = "trigger_event_name";
        public static final String TRIGGER_TIMEOUT = "trigger_timeout";
        public static final String VALUE = "value";

        private ConditionalUserProperty() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.3.0 */
    /* loaded from: classes2.dex */
    public interface EventInterceptor extends zzhf {
        @Override // com.google.android.gms.measurement.internal.zzhf
        void interceptEvent(String str, String str2, Bundle bundle, long j);
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.3.0 */
    /* loaded from: classes2.dex */
    public interface OnEventListener extends zzhg {
        @Override // com.google.android.gms.measurement.internal.zzhg
        void onEvent(String str, String str2, Bundle bundle, long j);
    }

    public AppMeasurementSdk(zzef zzefVar) {
        this.zza = zzefVar;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return zzef.zzg(context, null, null, null, null).zzd();
    }

    public void beginAdUnitExposure(String str) {
        this.zza.zzv(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.zza.zzw(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.zza.zzx(str);
    }

    public long generateEventId() {
        return this.zza.zzb();
    }

    public String getAppIdOrigin() {
        return this.zza.zzk();
    }

    public String getAppInstanceId() {
        return this.zza.zzm();
    }

    public List<Bundle> getConditionalUserProperties(String str, String str2) {
        return this.zza.zzq(str, str2);
    }

    public String getCurrentScreenClass() {
        return this.zza.zzn();
    }

    public String getCurrentScreenName() {
        return this.zza.zzo();
    }

    public String getGmpAppId() {
        return this.zza.zzp();
    }

    public int getMaxUserProperties(String str) {
        return this.zza.zza(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.zza.zzr(str, str2, z);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        this.zza.zzz(str, str2, bundle);
    }

    public void logEventNoInterceptor(String str, String str2, Bundle bundle, long j) {
        this.zza.zzA(str, str2, bundle, j);
    }

    public void performAction(Bundle bundle) {
        this.zza.zzc(bundle, false);
    }

    public Bundle performActionWithResponse(Bundle bundle) {
        return this.zza.zzc(bundle, true);
    }

    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        this.zza.zzC(onEventListener);
    }

    public void setConditionalUserProperty(Bundle bundle) {
        this.zza.zzE(bundle);
    }

    public void setConsent(Bundle bundle) {
        this.zza.zzF(bundle);
    }

    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.zza.zzH(activity, str, str2);
    }

    public void setEventInterceptor(EventInterceptor eventInterceptor) {
        this.zza.zzK(eventInterceptor);
    }

    public void setMeasurementEnabled(Boolean bool) {
        this.zza.zzL(bool);
    }

    public void setUserProperty(String str, String str2, Object obj) {
        this.zza.zzO(str, str2, obj, true);
    }

    public void unregisterOnMeasurementEventListener(OnEventListener onEventListener) {
        this.zza.zzP(onEventListener);
    }

    public final void zza(boolean z) {
        this.zza.zzI(z);
    }

    public void setMeasurementEnabled(boolean z) {
        this.zza.zzL(Boolean.valueOf(z));
    }

    public static AppMeasurementSdk getInstance(Context context, String str, String str2, String str3, Bundle bundle) {
        return zzef.zzg(context, str, str2, str3, bundle).zzd();
    }
}
