package io.sentry.android.core.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.IBuildInfoProvider;
import io.sentry.util.Objects;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
/* loaded from: classes4.dex */
public final class RootChecker {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final IBuildInfoProvider buildInfoProvider;
    private final Context context;
    private final ILogger logger;
    private final String[] rootFiles;
    private final String[] rootPackages;
    private final Runtime runtime;

    public RootChecker(Context context, IBuildInfoProvider iBuildInfoProvider, ILogger iLogger) {
        this(context, iBuildInfoProvider, iLogger, new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }

    RootChecker(Context context, IBuildInfoProvider iBuildInfoProvider, ILogger iLogger, String[] strArr, String[] strArr2, Runtime runtime) {
        this.context = (Context) Objects.requireNonNull(context, "The application context is required.");
        this.buildInfoProvider = (IBuildInfoProvider) Objects.requireNonNull(iBuildInfoProvider, "The BuildInfoProvider is required.");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "The Logger is required.");
        this.rootFiles = (String[]) Objects.requireNonNull(strArr, "The root Files are required.");
        this.rootPackages = (String[]) Objects.requireNonNull(strArr2, "The root packages are required.");
        this.runtime = (Runtime) Objects.requireNonNull(runtime, "The Runtime is required.");
    }

    public boolean isDeviceRooted() {
        return checkTestKeys() || checkRootFiles() || checkSUExist() || checkRootPackages();
    }

    private boolean checkTestKeys() {
        String buildTags = this.buildInfoProvider.getBuildTags();
        return buildTags != null && buildTags.contains("test-keys");
    }

    private boolean checkRootFiles() {
        String[] strArr;
        for (String str : this.rootFiles) {
            try {
            } catch (RuntimeException e) {
                this.logger.log(SentryLevel.ERROR, e, "Error when trying to check if root file %s exists.", str);
            }
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    private boolean checkSUExist() {
        Process process = null;
        try {
            try {
                Process exec = this.runtime.exec(new String[]{"/system/xbin/which", "su"});
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream(), UTF_8));
                try {
                    boolean z = bufferedReader.readLine() != null;
                    bufferedReader.close();
                    if (exec != null) {
                        exec.destroy();
                    }
                    return z;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                this.logger.log(SentryLevel.DEBUG, "SU isn't found on this Device.", new Object[0]);
                if (0 != 0) {
                    process.destroy();
                }
                return false;
            }
        }
    }

    private boolean checkRootPackages() {
        PackageManager packageManager = this.context.getPackageManager();
        if (packageManager != null) {
            for (String str : this.rootPackages) {
                try {
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }
}
