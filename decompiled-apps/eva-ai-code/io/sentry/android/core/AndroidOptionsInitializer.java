package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.ILogger;
import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;
import io.sentry.SendFireAndForgetEnvelopeSender;
import io.sentry.SendFireAndForgetOutboxSender;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.util.Objects;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AndroidOptionsInitializer {
    private AndroidOptionsInitializer() {
    }

    static void init(SentryAndroidOptions sentryAndroidOptions, Context context) {
        Objects.requireNonNull(context, "The application context is required.");
        Objects.requireNonNull(sentryAndroidOptions, "The options object is required.");
        init(sentryAndroidOptions, context, new AndroidLogger(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void init(SentryAndroidOptions sentryAndroidOptions, Context context, ILogger iLogger, boolean z, boolean z2) {
        init(sentryAndroidOptions, context, iLogger, new BuildInfoProvider(), z, z2);
    }

    static void init(SentryAndroidOptions sentryAndroidOptions, Context context, ILogger iLogger, IBuildInfoProvider iBuildInfoProvider, boolean z, boolean z2) {
        init(sentryAndroidOptions, context, iLogger, iBuildInfoProvider, new LoadClass(), z, z2);
    }

    static void init(SentryAndroidOptions sentryAndroidOptions, Context context, ILogger iLogger, IBuildInfoProvider iBuildInfoProvider, LoadClass loadClass, boolean z, boolean z2) {
        Objects.requireNonNull(context, "The context is required.");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Objects.requireNonNull(sentryAndroidOptions, "The options object is required.");
        Objects.requireNonNull(iLogger, "The ILogger object is required.");
        sentryAndroidOptions.setLogger(iLogger);
        ManifestMetadataReader.applyMetadata(context, sentryAndroidOptions);
        initializeCacheDirs(context, sentryAndroidOptions);
        ActivityFramesTracker activityFramesTracker = new ActivityFramesTracker(loadClass, sentryAndroidOptions.getLogger());
        installDefaultIntegrations(context, sentryAndroidOptions, iBuildInfoProvider, loadClass, activityFramesTracker, z, z2);
        readDefaultOptionValues(sentryAndroidOptions, context);
        sentryAndroidOptions.addEventProcessor(new DefaultAndroidEventProcessor(context, iLogger, iBuildInfoProvider));
        sentryAndroidOptions.addEventProcessor(new PerformanceAndroidEventProcessor(sentryAndroidOptions, activityFramesTracker));
        sentryAndroidOptions.setTransportGate(new AndroidTransportGate(context, sentryAndroidOptions.getLogger()));
    }

    private static void installDefaultIntegrations(Context context, final SentryOptions sentryOptions, IBuildInfoProvider iBuildInfoProvider, LoadClass loadClass, ActivityFramesTracker activityFramesTracker, boolean z, boolean z2) {
        sentryOptions.addIntegration(new SendCachedEnvelopeFireAndForgetIntegration(new SendFireAndForgetEnvelopeSender(new SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath() { // from class: io.sentry.android.core.AndroidOptionsInitializer$$ExternalSyntheticLambda0
            @Override // io.sentry.SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath
            public final String getDirPath() {
                String cacheDirPath;
                cacheDirPath = SentryOptions.this.getCacheDirPath();
                return cacheDirPath;
            }
        })));
        sentryOptions.addIntegration(new NdkIntegration(isNdkAvailable(iBuildInfoProvider) ? loadClass.loadClass(NdkIntegration.SENTRY_NDK_CLASS_NAME, sentryOptions.getLogger()) : null));
        sentryOptions.addIntegration(EnvelopeFileObserverIntegration.getOutboxFileObserver());
        sentryOptions.addIntegration(new SendCachedEnvelopeFireAndForgetIntegration(new SendFireAndForgetOutboxSender(new SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath() { // from class: io.sentry.android.core.AndroidOptionsInitializer$$ExternalSyntheticLambda1
            @Override // io.sentry.SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath
            public final String getDirPath() {
                String outboxPath;
                outboxPath = SentryOptions.this.getOutboxPath();
                return outboxPath;
            }
        })));
        sentryOptions.addIntegration(new AnrIntegration(context));
        sentryOptions.addIntegration(new AppLifecycleIntegration());
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryOptions.addIntegration(new ActivityLifecycleIntegration(application, iBuildInfoProvider, activityFramesTracker));
            sentryOptions.addIntegration(new UserInteractionIntegration(application, loadClass));
            if (z) {
                sentryOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryOptions.getLogger().log(SentryLevel.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z2) {
            sentryOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryOptions.addIntegration(new TempSensorBreadcrumbsIntegration(context));
        sentryOptions.addIntegration(new PhoneStateBreadcrumbsIntegration(context));
    }

    private static void readDefaultOptionValues(SentryAndroidOptions sentryAndroidOptions, Context context) {
        PackageInfo packageInfo = ContextUtils.getPackageInfo(context, sentryAndroidOptions.getLogger());
        if (packageInfo != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(getSentryReleaseVersion(packageInfo, ContextUtils.getVersionCode(packageInfo)));
            }
            String str = packageInfo.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(Installation.id(context));
            } catch (RuntimeException e) {
                sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Could not generate distinct Id.", e);
            }
        }
        if (sentryAndroidOptions.getProguardUuid() == null) {
            sentryAndroidOptions.setProguardUuid(getProguardUUID(context, sentryAndroidOptions.getLogger()));
        }
    }

    private static String getProguardUUID(Context context, ILogger iLogger) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getAssets().open("sentry-debug-meta.properties"));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                String property = properties.getProperty("io.sentry.ProguardUuids");
                iLogger.log(SentryLevel.DEBUG, "Proguard UUID found: %s", property);
                bufferedInputStream.close();
                return property;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            iLogger.log(SentryLevel.INFO, "sentry-debug-meta.properties file was not found.", new Object[0]);
            return null;
        } catch (IOException e) {
            iLogger.log(SentryLevel.ERROR, "Error getting Proguard UUIDs.", e);
            return null;
        } catch (RuntimeException e2) {
            iLogger.log(SentryLevel.ERROR, "sentry-debug-meta.properties file is malformed.", e2);
            return null;
        }
    }

    private static String getSentryReleaseVersion(PackageInfo packageInfo, String str) {
        return packageInfo.packageName + "@" + packageInfo.versionName + "+" + str;
    }

    private static void initializeCacheDirs(Context context, SentryOptions sentryOptions) {
        sentryOptions.setCacheDirPath(new File(context.getCacheDir(), "sentry").getAbsolutePath());
    }

    private static boolean isNdkAvailable(IBuildInfoProvider iBuildInfoProvider) {
        return iBuildInfoProvider.getSdkInfoVersion() >= 16;
    }
}
