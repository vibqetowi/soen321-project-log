package com.bugsnag.android;

import android.os.Build;
import kotlin.jvm.internal.d;
/* compiled from: DeviceBuildInfo.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0011\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dBe\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0002\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/bugsnag/android/DeviceBuildInfo;", "", "manufacturer", "", "model", "osVersion", "apiLevel", "", "osBuild", "fingerprint", "tags", "brand", "cpuAbis", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "getApiLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBrand", "()Ljava/lang/String;", "getCpuAbis", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getFingerprint", "getManufacturer", "getModel", "getOsBuild", "getOsVersion", "getTags", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class DeviceBuildInfo {
    public static final Companion Companion = new Companion(null);
    private final Integer apiLevel;
    private final String brand;
    private final String[] cpuAbis;
    private final String fingerprint;
    private final String manufacturer;
    private final String model;
    private final String osBuild;
    private final String osVersion;
    private final String tags;

    /* compiled from: DeviceBuildInfo.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/DeviceBuildInfo$Companion;", "", "()V", "defaultInfo", "Lcom/bugsnag/android/DeviceBuildInfo;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        public final DeviceBuildInfo defaultInfo() {
            int i6 = Build.VERSION.SDK_INT;
            return new DeviceBuildInfo(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(i6), Build.DISPLAY, Build.FINGERPRINT, Build.TAGS, Build.BRAND, Build.SUPPORTED_ABIS);
        }
    }

    public DeviceBuildInfo(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String[] strArr) {
        this.manufacturer = str;
        this.model = str2;
        this.osVersion = str3;
        this.apiLevel = num;
        this.osBuild = str4;
        this.fingerprint = str5;
        this.tags = str6;
        this.brand = str7;
        this.cpuAbis = strArr;
    }

    public final Integer getApiLevel() {
        return this.apiLevel;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String[] getCpuAbis() {
        return this.cpuAbis;
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOsBuild() {
        return this.osBuild;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getTags() {
        return this.tags;
    }
}
