package com.ifriend.infrastructure;

import android.util.Log;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ifriend.common_utils.Logger;
import com.ifriend.common_utils.LoggerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.logging.LogFactory;
/* compiled from: ProdLogger.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, d2 = {"Lcom/ifriend/infrastructure/ProdLogger;", "Lcom/ifriend/common_utils/Logger;", "()V", "crashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "getCrashlytics", "()Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "error", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", ViewHierarchyConstants.TAG_KEY, "info", "log", LogFactory.PRIORITY_KEY, "", "logException", "exception", "", "setUserId", "userId", "useCrashlytics", "", "warn", "infrastructure_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProdLogger implements Logger {
    public static final ProdLogger INSTANCE = new ProdLogger();

    private final boolean useCrashlytics() {
        return true;
    }

    private ProdLogger() {
    }

    @Override // com.ifriend.common_utils.Logger
    public String defaultTag() {
        return Logger.DefaultImpls.defaultTag(this);
    }

    private final FirebaseCrashlytics getCrashlytics() {
        if (useCrashlytics()) {
            return FirebaseCrashlytics.getInstance();
        }
        return null;
    }

    @Override // com.ifriend.common_utils.Logger
    public void logException(String message, Throwable exception) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Logger.DefaultImpls.error$default(this, message, null, 2, null);
        logException(exception);
    }

    @Override // com.ifriend.common_utils.Logger
    public void logException(Throwable exception) {
        Unit unit;
        Intrinsics.checkNotNullParameter(exception, "exception");
        FirebaseCrashlytics crashlytics = getCrashlytics();
        if (crashlytics != null) {
            crashlytics.recordException(exception);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            String message = exception.getMessage();
            if (message == null) {
                message = "Empty error message";
            }
            Log.e(LoggerKt.LOG_TAG, message);
            exception.printStackTrace();
        }
    }

    @Override // com.ifriend.common_utils.Logger
    public void log(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        FirebaseCrashlytics crashlytics = getCrashlytics();
        if (crashlytics != null) {
            crashlytics.log(message);
        } else {
            Log.i(LoggerKt.LOG_TAG, message);
        }
    }

    @Override // com.ifriend.common_utils.Logger
    public void log(int i, String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        FirebaseCrashlytics crashlytics = getCrashlytics();
        if (crashlytics != null) {
            crashlytics.log(i + RemoteSettings.FORWARD_SLASH_STRING + tag + ": " + message);
        } else if (i == 4) {
            Log.i(tag, message);
        } else if (i == 5) {
            Log.w(tag, message);
        } else if (i != 6) {
        } else {
            Log.e(tag, message);
        }
    }

    @Override // com.ifriend.common_utils.Logger
    public void info(String message, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        log(4, tag, message);
    }

    @Override // com.ifriend.common_utils.Logger
    public void warn(String message, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        log(5, tag, message);
    }

    @Override // com.ifriend.common_utils.Logger
    public void error(String message, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        log(6, tag, message);
    }

    @Override // com.ifriend.common_utils.Logger
    public void setUserId(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        FirebaseCrashlytics crashlytics = getCrashlytics();
        if (crashlytics != null) {
            crashlytics.setUserId(userId);
        }
    }
}
