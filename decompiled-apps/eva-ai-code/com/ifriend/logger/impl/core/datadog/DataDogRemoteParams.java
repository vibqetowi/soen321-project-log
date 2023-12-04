package com.ifriend.logger.impl.core.datadog;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.OperatingSystem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DataDogRemoteParams.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jo\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006,"}, d2 = {"Lcom/ifriend/logger/impl/core/datadog/DataDogRemoteParams;", "", "source", "", "hostname", "appVersion", "payload", "Lcom/google/gson/JsonElement;", "userId", "isTestAccount", "", "status", "service", OperatingSystem.TYPE, "device", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonElement;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppVersion", "()Ljava/lang/String;", "getDevice", "getHostname", "()Z", "getOs", "getPayload", "()Lcom/google/gson/JsonElement;", "getService", "getSource", "getStatus", "getUserId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DataDogRemoteParams {
    @SerializedName("appVersion")
    private final String appVersion;
    @SerializedName("device")
    private final String device;
    @SerializedName("hostname")
    private final String hostname;
    @SerializedName("isTestAccount")
    private final boolean isTestAccount;
    @SerializedName(OperatingSystem.TYPE)
    private final String os;
    @SerializedName("payload")
    private final JsonElement payload;
    @SerializedName("service")
    private final String service;
    @SerializedName("ddsource")
    private final String source;
    @SerializedName("status")
    private final String status;
    @SerializedName("user")
    private final String userId;

    public final String component1() {
        return this.source;
    }

    public final String component10() {
        return this.device;
    }

    public final String component2() {
        return this.hostname;
    }

    public final String component3() {
        return this.appVersion;
    }

    public final JsonElement component4() {
        return this.payload;
    }

    public final String component5() {
        return this.userId;
    }

    public final boolean component6() {
        return this.isTestAccount;
    }

    public final String component7() {
        return this.status;
    }

    public final String component8() {
        return this.service;
    }

    public final String component9() {
        return this.os;
    }

    public final DataDogRemoteParams copy(String source, String hostname, String appVersion, JsonElement payload, String str, boolean z, String status, String service, String os, String device) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(device, "device");
        return new DataDogRemoteParams(source, hostname, appVersion, payload, str, z, status, service, os, device);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataDogRemoteParams) {
            DataDogRemoteParams dataDogRemoteParams = (DataDogRemoteParams) obj;
            return Intrinsics.areEqual(this.source, dataDogRemoteParams.source) && Intrinsics.areEqual(this.hostname, dataDogRemoteParams.hostname) && Intrinsics.areEqual(this.appVersion, dataDogRemoteParams.appVersion) && Intrinsics.areEqual(this.payload, dataDogRemoteParams.payload) && Intrinsics.areEqual(this.userId, dataDogRemoteParams.userId) && this.isTestAccount == dataDogRemoteParams.isTestAccount && Intrinsics.areEqual(this.status, dataDogRemoteParams.status) && Intrinsics.areEqual(this.service, dataDogRemoteParams.service) && Intrinsics.areEqual(this.os, dataDogRemoteParams.os) && Intrinsics.areEqual(this.device, dataDogRemoteParams.device);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.source.hashCode() * 31) + this.hostname.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.payload.hashCode()) * 31;
        String str = this.userId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.isTestAccount;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((hashCode2 + i) * 31) + this.status.hashCode()) * 31) + this.service.hashCode()) * 31) + this.os.hashCode()) * 31) + this.device.hashCode();
    }

    public String toString() {
        String str = this.source;
        String str2 = this.hostname;
        String str3 = this.appVersion;
        JsonElement jsonElement = this.payload;
        String str4 = this.userId;
        boolean z = this.isTestAccount;
        String str5 = this.status;
        String str6 = this.service;
        String str7 = this.os;
        String str8 = this.device;
        return "DataDogRemoteParams(source=" + str + ", hostname=" + str2 + ", appVersion=" + str3 + ", payload=" + jsonElement + ", userId=" + str4 + ", isTestAccount=" + z + ", status=" + str5 + ", service=" + str6 + ", os=" + str7 + ", device=" + str8 + ")";
    }

    public DataDogRemoteParams(String source, String hostname, String appVersion, JsonElement payload, String str, boolean z, String status, String service, String os, String device) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(device, "device");
        this.source = source;
        this.hostname = hostname;
        this.appVersion = appVersion;
        this.payload = payload;
        this.userId = str;
        this.isTestAccount = z;
        this.status = status;
        this.service = service;
        this.os = os;
        this.device = device;
    }

    public /* synthetic */ DataDogRemoteParams(String str, String str2, String str3, JsonElement jsonElement, String str4, boolean z, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "mobile_android" : str, (i & 2) != 0 ? "iFriend" : str2, str3, jsonElement, str4, z, str5, str6, (i & 256) != 0 ? "Android" : str7, str8);
    }

    public final String getSource() {
        return this.source;
    }

    public final String getHostname() {
        return this.hostname;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final JsonElement getPayload() {
        return this.payload;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isTestAccount() {
        return this.isTestAccount;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getService() {
        return this.service;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getDevice() {
        return this.device;
    }
}
