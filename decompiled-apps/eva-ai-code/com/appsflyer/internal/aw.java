package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes2.dex */
public abstract class aw<T> {
    public final Context AFInAppEventParameterName;
    public final FutureTask<T> AFInAppEventType = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.aw.5
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (aw.this.values()) {
                return (T) aw.this.AFInAppEventType();
            }
            return null;
        }
    });
    public final String AFKeystoreWrapper;
    private final String[] valueOf;

    protected abstract T AFInAppEventType();

    public aw(Context context, String str, String... strArr) {
        this.AFInAppEventParameterName = context;
        this.AFKeystoreWrapper = str;
        this.valueOf = strArr;
    }

    public T AFKeystoreWrapper() {
        try {
            return this.AFInAppEventType.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            AFLogger.valueOf(e.getMessage(), e);
            return null;
        }
    }

    public final boolean values() {
        try {
            ProviderInfo resolveContentProvider = this.AFInAppEventParameterName.getPackageManager().resolveContentProvider(this.AFKeystoreWrapper, 128);
            if (resolveContentProvider != null) {
                return Arrays.asList(this.valueOf).contains(z.AFInAppEventParameterName(this.AFInAppEventParameterName.getPackageManager(), ((PackageItemInfo) resolveContentProvider).packageName));
            }
            return false;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.valueOf(e.getMessage(), e);
            return false;
        }
    }
}
