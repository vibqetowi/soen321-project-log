package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.theinnerhour.b2b.utils.SessionManager;
import f6.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ra.a;
import ra.c;
import ta.u4;
import ta.y3;
import v9.o;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b  reason: collision with root package name */
    public static volatile AppMeasurement f8737b;

    /* renamed from: a  reason: collision with root package name */
    public final c f8738a;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
    /* loaded from: classes.dex */
    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            o.h(bundle);
            this.mAppId = (String) b.W0(bundle, "app_id", String.class, null);
            this.mOrigin = (String) b.W0(bundle, "origin", String.class, null);
            this.mName = (String) b.W0(bundle, SessionManager.KEY_NAME, String.class, null);
            this.mValue = b.W0(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) b.W0(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) b.W0(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) b.W0(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) b.W0(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) b.W0(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) b.W0(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) b.W0(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) b.W0(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) b.W0(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) b.W0(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) b.W0(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) b.W0(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(y3 y3Var) {
        this.f8738a = new a(y3Var);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:13:0x002e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @androidx.annotation.Keep
    @java.lang.Deprecated
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = com.google.android.gms.measurement.AppMeasurement.f8737b
            if (r0 != 0) goto L5a
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = com.google.android.gms.measurement.AppMeasurement.f8737b     // Catch: java.lang.Throwable -> L57
            if (r1 != 0) goto L55
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L57
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L57
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch: java.lang.Throwable -> L57
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L57
            r3[r6] = r14     // Catch: java.lang.Throwable -> L57
            r3[r7] = r1     // Catch: java.lang.Throwable -> L57
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L57
            ta.u4 r2 = (ta.u4) r2     // Catch: java.lang.Throwable -> L57
            goto L30
        L2e:
            r2 = r1
        L30:
            if (r2 == 0) goto L3a
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch: java.lang.Throwable -> L57
            r14.<init>(r2)     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.AppMeasurement.f8737b = r14     // Catch: java.lang.Throwable -> L57
            goto L55
        L3a:
            com.google.android.gms.internal.measurement.t0 r13 = new com.google.android.gms.internal.measurement.t0     // Catch: java.lang.Throwable -> L57
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L57
            ta.y3 r14 = ta.y3.s(r14, r13, r1)     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch: java.lang.Throwable -> L57
            r1.<init>(r14)     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.AppMeasurement.f8737b = r1     // Catch: java.lang.Throwable -> L57
        L55:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            goto L5a
        L57:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            throw r14
        L5a:
            com.google.android.gms.measurement.AppMeasurement r14 = com.google.android.gms.measurement.AppMeasurement.f8737b
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f8738a.i(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f8738a.j(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f8738a.k(str);
    }

    @Keep
    public long generateEventId() {
        return this.f8738a.b();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f8738a.f();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int size;
        List<Bundle> a10 = this.f8738a.a(str, str2);
        if (a10 == null) {
            size = 0;
        } else {
            size = a10.size();
        }
        ArrayList arrayList = new ArrayList(size);
        for (Bundle bundle : a10) {
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f8738a.g();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f8738a.t();
    }

    @Keep
    public String getGmpAppId() {
        return this.f8738a.s();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f8738a.e(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f8738a.c(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f8738a.h(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        o.h(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString(SessionManager.KEY_NAME, str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            b.Z0(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f8738a.d(bundle);
    }

    public AppMeasurement(u4 u4Var) {
        this.f8738a = new ra.b(u4Var);
    }
}
