package com.ifriend.platform.tools.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ifriend.platform.tools.api.AppInfoProvider;
import com.ifriend.platform.tools.impl.ext.PackageinfoKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppInfoProviderImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ifriend/platform/tools/impl/AppInfoProviderImpl;", "Lcom/ifriend/platform/tools/api/AppInfoProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "deviceInfo", "", "getDeviceInfo", "()Ljava/lang/String;", "googlePlayStoreSubscriptionsLink", "getGooglePlayStoreSubscriptionsLink", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "getPackageName", "versionCode", "", "getVersionCode", "()J", "versionName", "getVersionName", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppInfoProviderImpl implements AppInfoProvider {
    private final String packageName;
    private final long versionCode;
    private final String versionName;

    @Override // com.ifriend.platform.tools.api.AppInfoProvider
    public String getGooglePlayStoreSubscriptionsLink() {
        return "https://play.google.com/store/account/subscriptions?hl=en&gl=US";
    }

    @Inject
    public AppInfoProviderImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        String packageName = packageInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        this.packageName = packageName;
        String versionName = packageInfo.versionName;
        Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
        this.versionName = versionName;
        Intrinsics.checkNotNull(packageInfo);
        this.versionCode = PackageinfoKt.getVersionCodeCompat(packageInfo);
    }

    @Override // com.ifriend.platform.tools.api.AppInfoProvider
    public String getPackageName() {
        return this.packageName;
    }

    @Override // com.ifriend.platform.tools.api.AppInfoProvider
    public String getVersionName() {
        return this.versionName;
    }

    @Override // com.ifriend.platform.tools.api.AppInfoProvider
    public long getVersionCode() {
        return this.versionCode;
    }

    @Override // com.ifriend.platform.tools.api.AppInfoProvider
    public String getDeviceInfo() {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        return "Android/" + str + "; " + str2 + " " + str3;
    }
}
