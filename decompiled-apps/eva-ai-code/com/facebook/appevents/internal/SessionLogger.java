package com.facebook.appevents.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.Logger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.security.CertificateUtil;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
/* compiled from: SessionLogger.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J,\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u0015\u001a\u00020\u0010H\u0002J$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/internal/SessionLogger;", "", "()V", "INACTIVE_SECONDS_QUANTA", "", "PACKAGE_CHECKSUM", "", "TAG", "computePackageChecksum", "context", "Landroid/content/Context;", "getQuantaIndex", "", "timeBetweenSessions", "", "logActivateApp", "", "activityName", "sourceApplicationInfo", "Lcom/facebook/appevents/internal/SourceApplicationInfo;", "appId", "logClockSkewEvent", "logDeactivateApp", "sessionInfo", "Lcom/facebook/appevents/internal/SessionInfo;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionLogger {
    private static final String PACKAGE_CHECKSUM = "PCKGCHKSUM";
    public static final SessionLogger INSTANCE = new SessionLogger();
    private static final String TAG = SessionLogger.class.getCanonicalName();
    private static final long[] INACTIVE_SECONDS_QUANTA = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private SessionLogger() {
    }

    @JvmStatic
    public static final void logActivateApp(String activityName, SourceApplicationInfo sourceApplicationInfo, String str, Context context) {
        String sourceApplicationInfo2;
        if (CrashShieldHandler.isObjectCrashing(SessionLogger.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(context, "context");
            String str2 = "Unclassified";
            if (sourceApplicationInfo != null && (sourceApplicationInfo2 = sourceApplicationInfo.toString()) != null) {
                str2 = sourceApplicationInfo2;
            }
            Bundle bundle = new Bundle();
            bundle.putString(AppEventsConstants.EVENT_PARAM_SOURCE_APPLICATION, str2);
            bundle.putString(AppEventsConstants.EVENT_PARAM_PACKAGE_FP, INSTANCE.computePackageChecksum(context));
            CertificateUtil certificateUtil = CertificateUtil.INSTANCE;
            bundle.putString(AppEventsConstants.EVENT_PARAM_APP_CERT_HASH, CertificateUtil.getCertificateHash(context));
            InternalAppEventsLogger createInstance = InternalAppEventsLogger.Companion.createInstance(activityName, str, null);
            createInstance.logEvent(AppEventsConstants.EVENT_NAME_ACTIVATED_APP, bundle);
            if (InternalAppEventsLogger.Companion.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                createInstance.flush();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SessionLogger.class);
        }
    }

    @JvmStatic
    public static final void logDeactivateApp(String activityName, SessionInfo sessionInfo, String str) {
        long longValue;
        String sourceApplicationInfo;
        if (CrashShieldHandler.isObjectCrashing(SessionLogger.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            if (sessionInfo == null) {
                return;
            }
            Long diskRestoreTime = sessionInfo.getDiskRestoreTime();
            long j = 0;
            if (diskRestoreTime == null) {
                Long sessionLastEventTime = sessionInfo.getSessionLastEventTime();
                longValue = 0 - (sessionLastEventTime == null ? 0L : sessionLastEventTime.longValue());
            } else {
                longValue = diskRestoreTime.longValue();
            }
            if (longValue < 0) {
                INSTANCE.logClockSkewEvent();
                longValue = 0;
            }
            long sessionLength = sessionInfo.getSessionLength();
            if (sessionLength < 0) {
                INSTANCE.logClockSkewEvent();
                sessionLength = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(AppEventsConstants.EVENT_NAME_SESSION_INTERRUPTIONS, sessionInfo.getInterruptionCount());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(getQuantaIndex(longValue))}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            bundle.putString(AppEventsConstants.EVENT_NAME_TIME_BETWEEN_SESSIONS, format);
            SourceApplicationInfo sourceApplicationInfo2 = sessionInfo.getSourceApplicationInfo();
            String str2 = "Unclassified";
            if (sourceApplicationInfo2 != null && (sourceApplicationInfo = sourceApplicationInfo2.toString()) != null) {
                str2 = sourceApplicationInfo;
            }
            bundle.putString(AppEventsConstants.EVENT_PARAM_SOURCE_APPLICATION, str2);
            Long sessionLastEventTime2 = sessionInfo.getSessionLastEventTime();
            if (sessionLastEventTime2 != null) {
                j = sessionLastEventTime2.longValue();
            }
            bundle.putLong(Constants.LOG_TIME_APP_EVENT_KEY, j / 1000);
            InternalAppEventsLogger.Companion.createInstance(activityName, str, null).logEvent(AppEventsConstants.EVENT_NAME_DEACTIVATED_APP, sessionLength / 1000, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SessionLogger.class);
        }
    }

    private final void logClockSkewEvent() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            Intrinsics.checkNotNull(str);
            companion.log(loggingBehavior, str, "Clock skew detected");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @JvmStatic
    public static final int getQuantaIndex(long j) {
        if (CrashShieldHandler.isObjectCrashing(SessionLogger.class)) {
            return 0;
        }
        int i = 0;
        while (true) {
            try {
                long[] jArr = INACTIVE_SECONDS_QUANTA;
                if (i >= jArr.length || jArr[i] >= j) {
                    break;
                }
                i++;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, SessionLogger.class);
                return 0;
            }
        }
        return i;
    }

    private final String computePackageChecksum(Context context) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            try {
                PackageManager packageManager = context.getPackageManager();
                String stringPlus = Intrinsics.stringPlus("PCKGCHKSUM;", packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
                SharedPreferences sharedPreferences = context.getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0);
                String string = sharedPreferences.getString(stringPlus, null);
                if (string == null || string.length() != 32) {
                    HashUtils hashUtils = HashUtils.INSTANCE;
                    String computeChecksumWithPackageManager = HashUtils.computeChecksumWithPackageManager(context, null);
                    if (computeChecksumWithPackageManager == null) {
                        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                        HashUtils hashUtils2 = HashUtils.INSTANCE;
                        computeChecksumWithPackageManager = HashUtils.computeChecksum(applicationInfo.sourceDir);
                    }
                    sharedPreferences.edit().putString(stringPlus, computeChecksumWithPackageManager).apply();
                    return computeChecksumWithPackageManager;
                }
                return string;
            } catch (Exception unused) {
                String str = null;
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
