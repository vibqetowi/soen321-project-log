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
/* loaded from: classes.dex */
public abstract class AFb1gSDK<T> {
    public final AFc1zSDK AFInAppEventParameterName;
    public final FutureTask<T> AFInAppEventType = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFb1gSDK.1
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFb1gSDK.this.AFInAppEventType()) {
                return (T) AFb1gSDK.this.AFInAppEventParameterName();
            }
            return null;
        }
    });
    private final String[] AFKeystoreWrapper;
    public final Context valueOf;
    public final String values;

    public AFb1gSDK(Context context, AFc1zSDK aFc1zSDK, String str, String... strArr) {
        this.valueOf = context;
        this.values = str;
        this.AFKeystoreWrapper = strArr;
        this.AFInAppEventParameterName = aFc1zSDK;
    }

    public abstract T AFInAppEventParameterName();

    public final boolean AFInAppEventType() {
        try {
            ProviderInfo resolveContentProvider = this.valueOf.getPackageManager().resolveContentProvider(this.values, 128);
            if (resolveContentProvider == null) {
                return false;
            }
            if (!Arrays.asList(this.AFKeystoreWrapper).contains(AFb1wSDK.AFInAppEventParameterName(this.valueOf.getPackageManager(), ((PackageItemInfo) resolveContentProvider).packageName))) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10);
            return false;
        }
    }

    public T AFKeystoreWrapper() {
        try {
            return this.AFInAppEventType.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10);
            return null;
        }
    }
}
