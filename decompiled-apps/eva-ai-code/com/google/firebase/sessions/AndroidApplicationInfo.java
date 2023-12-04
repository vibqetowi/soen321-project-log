package com.google.firebase.sessions;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ApplicationInfo.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/sessions/AndroidApplicationInfo;", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "versionName", "appBuildVersion", "deviceManufacturer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppBuildVersion", "()Ljava/lang/String;", "getDeviceManufacturer", "getPackageName", "getVersionName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidApplicationInfo {
    private final String appBuildVersion;
    private final String deviceManufacturer;
    private final String packageName;
    private final String versionName;

    public static /* synthetic */ AndroidApplicationInfo copy$default(AndroidApplicationInfo androidApplicationInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = androidApplicationInfo.packageName;
        }
        if ((i & 2) != 0) {
            str2 = androidApplicationInfo.versionName;
        }
        if ((i & 4) != 0) {
            str3 = androidApplicationInfo.appBuildVersion;
        }
        if ((i & 8) != 0) {
            str4 = androidApplicationInfo.deviceManufacturer;
        }
        return androidApplicationInfo.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.packageName;
    }

    public final String component2() {
        return this.versionName;
    }

    public final String component3() {
        return this.appBuildVersion;
    }

    public final String component4() {
        return this.deviceManufacturer;
    }

    public final AndroidApplicationInfo copy(String packageName, String versionName, String appBuildVersion, String deviceManufacturer) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        return new AndroidApplicationInfo(packageName, versionName, appBuildVersion, deviceManufacturer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidApplicationInfo) {
            AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) obj;
            return Intrinsics.areEqual(this.packageName, androidApplicationInfo.packageName) && Intrinsics.areEqual(this.versionName, androidApplicationInfo.versionName) && Intrinsics.areEqual(this.appBuildVersion, androidApplicationInfo.appBuildVersion) && Intrinsics.areEqual(this.deviceManufacturer, androidApplicationInfo.deviceManufacturer);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.packageName.hashCode() * 31) + this.versionName.hashCode()) * 31) + this.appBuildVersion.hashCode()) * 31) + this.deviceManufacturer.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.packageName + ", versionName=" + this.versionName + ", appBuildVersion=" + this.appBuildVersion + ", deviceManufacturer=" + this.deviceManufacturer + ')';
    }

    public AndroidApplicationInfo(String packageName, String versionName, String appBuildVersion, String deviceManufacturer) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        this.packageName = packageName;
        this.versionName = versionName;
        this.appBuildVersion = appBuildVersion;
        this.deviceManufacturer = deviceManufacturer;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }
}
