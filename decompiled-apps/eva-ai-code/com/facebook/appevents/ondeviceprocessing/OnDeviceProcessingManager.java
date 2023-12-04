package com.facebook.appevents.ondeviceprocessing;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnDeviceProcessingManager.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u001c\u0010\u000e\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/OnDeviceProcessingManager;", "", "()V", "ALLOWED_IMPLICIT_EVENTS", "", "", "isEventEligibleForOnDeviceProcessing", "", NotificationCompat.CATEGORY_EVENT, "Lcom/facebook/appevents/AppEvent;", "isOnDeviceProcessingEnabled", "sendCustomEventAsync", "", "applicationId", "sendInstallEventAsync", "preferencesName", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class OnDeviceProcessingManager {
    public static final OnDeviceProcessingManager INSTANCE = new OnDeviceProcessingManager();
    private static final Set<String> ALLOWED_IMPLICIT_EVENTS = SetsKt.setOf((Object[]) new String[]{AppEventsConstants.EVENT_NAME_PURCHASED, AppEventsConstants.EVENT_NAME_START_TRIAL, AppEventsConstants.EVENT_NAME_SUBSCRIBE});

    private OnDeviceProcessingManager() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:5:0x000a, B:7:0x0019, B:12:0x0026), top: B:19:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean isOnDeviceProcessingEnabled() {
        boolean z;
        if (CrashShieldHandler.isObjectCrashing(OnDeviceProcessingManager.class)) {
            return false;
        }
        try {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            Context applicationContext = FacebookSdk.getApplicationContext();
            FacebookSdk facebookSdk2 = FacebookSdk.INSTANCE;
            if (!FacebookSdk.getLimitEventAndDataUsage(applicationContext)) {
                Utility utility = Utility.INSTANCE;
                if (!Utility.isDataProcessingRestricted()) {
                    z = true;
                    if (z) {
                        return false;
                    }
                    RemoteServiceWrapper remoteServiceWrapper = RemoteServiceWrapper.INSTANCE;
                    return RemoteServiceWrapper.isServiceAvailable();
                }
            }
            z = false;
            if (z) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, OnDeviceProcessingManager.class);
            return false;
        }
    }

    @JvmStatic
    public static final void sendInstallEventAsync(final String str, final String str2) {
        if (CrashShieldHandler.isObjectCrashing(OnDeviceProcessingManager.class)) {
            return;
        }
        try {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            final Context applicationContext = FacebookSdk.getApplicationContext();
            if (applicationContext == null || str == null || str2 == null) {
                return;
            }
            FacebookSdk facebookSdk2 = FacebookSdk.INSTANCE;
            FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    OnDeviceProcessingManager.m6355sendInstallEventAsync$lambda0(applicationContext, str2, str);
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, OnDeviceProcessingManager.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendInstallEventAsync$lambda-0  reason: not valid java name */
    public static final void m6355sendInstallEventAsync$lambda0(Context context, String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(OnDeviceProcessingManager.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "$context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            String stringPlus = Intrinsics.stringPlus(str2, "pingForOnDevice");
            if (sharedPreferences.getLong(stringPlus, 0L) == 0) {
                RemoteServiceWrapper remoteServiceWrapper = RemoteServiceWrapper.INSTANCE;
                RemoteServiceWrapper.sendInstallEvent(str2);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(stringPlus, System.currentTimeMillis());
                edit.apply();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, OnDeviceProcessingManager.class);
        }
    }

    @JvmStatic
    public static final void sendCustomEventAsync(final String applicationId, final AppEvent event) {
        if (CrashShieldHandler.isObjectCrashing(OnDeviceProcessingManager.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(event, "event");
            if (INSTANCE.isEventEligibleForOnDeviceProcessing(event)) {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        OnDeviceProcessingManager.m6354sendCustomEventAsync$lambda1(applicationId, event);
                    }
                });
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, OnDeviceProcessingManager.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendCustomEventAsync$lambda-1  reason: not valid java name */
    public static final void m6354sendCustomEventAsync$lambda1(String applicationId, AppEvent event) {
        if (CrashShieldHandler.isObjectCrashing(OnDeviceProcessingManager.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
            Intrinsics.checkNotNullParameter(event, "$event");
            RemoteServiceWrapper remoteServiceWrapper = RemoteServiceWrapper.INSTANCE;
            RemoteServiceWrapper.sendCustomEvents(applicationId, CollectionsKt.listOf(event));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, OnDeviceProcessingManager.class);
        }
    }

    private final boolean isEventEligibleForOnDeviceProcessing(AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return (appEvent.isImplicit() ^ true) || (appEvent.isImplicit() && ALLOWED_IMPLICIT_EVENTS.contains(appEvent.getName()));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
