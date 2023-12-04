package com.ifriend.platform.tools.api;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
/* compiled from: AppInfoProvider.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/ifriend/platform/tools/api/AppInfoProvider;", "", "deviceInfo", "", "getDeviceInfo", "()Ljava/lang/String;", "googlePlayStoreSubscriptionsLink", "getGooglePlayStoreSubscriptionsLink", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "getPackageName", "versionCode", "", "getVersionCode", "()J", "versionName", "getVersionName", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppInfoProvider {
    String getDeviceInfo();

    String getGooglePlayStoreSubscriptionsLink();

    String getPackageName();

    long getVersionCode();

    String getVersionName();
}
