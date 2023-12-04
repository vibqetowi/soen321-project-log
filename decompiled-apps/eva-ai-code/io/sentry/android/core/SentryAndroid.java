package io.sentry.android.core;

import android.content.Context;
import android.os.SystemClock;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.OptionsContainer;
import io.sentry.Sentry;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
/* loaded from: classes4.dex */
public final class SentryAndroid {
    static final String SENTRY_FRAGMENT_INTEGRATION_CLASS_NAME = "io.sentry.android.fragment.FragmentLifecycleIntegration";
    static final String SENTRY_TIMBER_INTEGRATION_CLASS_NAME = "io.sentry.android.timber.SentryTimberIntegration";
    private static final Date appStartTime = DateUtils.getCurrentDateTime();
    private static final long appStart = SystemClock.uptimeMillis();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$init$0(SentryAndroidOptions sentryAndroidOptions) {
    }

    private SentryAndroid() {
    }

    public static void init(Context context) {
        init(context, new AndroidLogger());
    }

    public static void init(Context context, ILogger iLogger) {
        init(context, iLogger, new Sentry.OptionsConfiguration() { // from class: io.sentry.android.core.SentryAndroid$$ExternalSyntheticLambda1
            @Override // io.sentry.Sentry.OptionsConfiguration
            public final void configure(SentryOptions sentryOptions) {
                SentryAndroid.lambda$init$0((SentryAndroidOptions) sentryOptions);
            }
        });
    }

    public static void init(Context context, Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration) {
        init(context, new AndroidLogger(), optionsConfiguration);
    }

    public static synchronized void init(final Context context, final ILogger iLogger, final Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration) {
        synchronized (SentryAndroid.class) {
            AppStartState.getInstance().setAppStartTime(appStart, appStartTime);
            try {
                try {
                    Sentry.init(OptionsContainer.create(SentryAndroidOptions.class), new Sentry.OptionsConfiguration() { // from class: io.sentry.android.core.SentryAndroid$$ExternalSyntheticLambda0
                        @Override // io.sentry.Sentry.OptionsConfiguration
                        public final void configure(SentryOptions sentryOptions) {
                            SentryAndroid.lambda$init$1(context, iLogger, optionsConfiguration, (SentryAndroidOptions) sentryOptions);
                        }
                    }, true);
                } catch (InstantiationException e) {
                    iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e);
                } catch (InvocationTargetException e2) {
                    iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e2);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e2);
                }
            } catch (IllegalAccessException e3) {
                iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e3);
            } catch (NoSuchMethodException e4) {
                iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$init$1(Context context, ILogger iLogger, Sentry.OptionsConfiguration optionsConfiguration, SentryAndroidOptions sentryAndroidOptions) {
        LoadClass loadClass = new LoadClass();
        boolean isClassAvailable = loadClass.isClassAvailable(SENTRY_FRAGMENT_INTEGRATION_CLASS_NAME, sentryAndroidOptions);
        boolean isClassAvailable2 = loadClass.isClassAvailable(SENTRY_TIMBER_INTEGRATION_CLASS_NAME, sentryAndroidOptions);
        AndroidOptionsInitializer.init(sentryAndroidOptions, context, iLogger, isClassAvailable, isClassAvailable2);
        optionsConfiguration.configure(sentryAndroidOptions);
        deduplicateIntegrations(sentryAndroidOptions, isClassAvailable, isClassAvailable2);
    }

    private static void deduplicateIntegrations(SentryOptions sentryOptions, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Integration integration : sentryOptions.getIntegrations()) {
            if (z && (integration instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(integration);
            }
            if (z2 && (integration instanceof SentryTimberIntegration)) {
                arrayList.add(integration);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i = 0; i < arrayList2.size() - 1; i++) {
                sentryOptions.getIntegrations().remove((Integration) arrayList2.get(i));
            }
        }
        if (arrayList.size() > 1) {
            for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
                sentryOptions.getIntegrations().remove((Integration) arrayList.get(i2));
            }
        }
    }
}
