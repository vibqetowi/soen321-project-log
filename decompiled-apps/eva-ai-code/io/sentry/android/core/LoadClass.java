package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
/* loaded from: classes4.dex */
public final class LoadClass {
    public Class<?> loadClass(String str, ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            if (iLogger != null) {
                SentryLevel sentryLevel = SentryLevel.DEBUG;
                iLogger.log(sentryLevel, "Class not available:" + str, e);
                return null;
            }
            return null;
        } catch (UnsatisfiedLinkError e2) {
            if (iLogger != null) {
                SentryLevel sentryLevel2 = SentryLevel.ERROR;
                iLogger.log(sentryLevel2, "Failed to load (UnsatisfiedLinkError) " + str, e2);
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (iLogger != null) {
                SentryLevel sentryLevel3 = SentryLevel.ERROR;
                iLogger.log(sentryLevel3, "Failed to initialize " + str, th);
                return null;
            }
            return null;
        }
    }

    public boolean isClassAvailable(String str, ILogger iLogger) {
        return loadClass(str, iLogger) != null;
    }

    public boolean isClassAvailable(String str, SentryOptions sentryOptions) {
        return isClassAvailable(str, sentryOptions != null ? sentryOptions.getLogger() : null);
    }
}
