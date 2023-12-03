package com.bugsnag.android;

import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.i;
/* compiled from: DeviceWithState.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001Bu\b\u0000\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010&\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020(0'\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b*\u0010+J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006,"}, d2 = {"Lcom/bugsnag/android/DeviceWithState;", "Lcom/bugsnag/android/Device;", "Lcom/bugsnag/android/JsonStream;", "writer", "Lhs/k;", "serializeFields$bugsnag_android_core_release", "(Lcom/bugsnag/android/JsonStream;)V", "serializeFields", "", "freeDisk", "Ljava/lang/Long;", "getFreeDisk", "()Ljava/lang/Long;", "setFreeDisk", "(Ljava/lang/Long;)V", "freeMemory", "getFreeMemory", "setFreeMemory", "", "orientation", "Ljava/lang/String;", "getOrientation", "()Ljava/lang/String;", "setOrientation", "(Ljava/lang/String;)V", "Ljava/util/Date;", "time", "Ljava/util/Date;", "getTime", "()Ljava/util/Date;", "setTime", "(Ljava/util/Date;)V", "Lcom/bugsnag/android/DeviceBuildInfo;", "buildInfo", "", "jailbroken", "id", "locale", "totalMemory", "", "", "runtimeVersions", "<init>", "(Lcom/bugsnag/android/DeviceBuildInfo;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Date;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class DeviceWithState extends Device {
    private Long freeDisk;
    private Long freeMemory;
    private String orientation;
    private Date time;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceWithState(DeviceBuildInfo buildInfo, Boolean bool, String str, String str2, Long l2, Map<String, Object> runtimeVersions, Long l10, Long l11, String str3, Date date) {
        super(buildInfo, buildInfo.getCpuAbis(), bool, str, str2, l2, runtimeVersions);
        i.h(buildInfo, "buildInfo");
        i.h(runtimeVersions, "runtimeVersions");
        this.freeDisk = l10;
        this.freeMemory = l11;
        this.orientation = str3;
        this.time = date;
    }

    public final Long getFreeDisk() {
        return this.freeDisk;
    }

    public final Long getFreeMemory() {
        return this.freeMemory;
    }

    public final String getOrientation() {
        return this.orientation;
    }

    public final Date getTime() {
        return this.time;
    }

    @Override // com.bugsnag.android.Device
    public void serializeFields$bugsnag_android_core_release(JsonStream writer) {
        i.h(writer, "writer");
        super.serializeFields$bugsnag_android_core_release(writer);
        writer.name("freeDisk").value((Number) this.freeDisk);
        writer.name("freeMemory").value((Number) this.freeMemory);
        writer.name("orientation").value(this.orientation);
        if (this.time != null) {
            writer.name("time").value(this.time);
        }
    }

    public final void setFreeDisk(Long l2) {
        this.freeDisk = l2;
    }

    public final void setFreeMemory(Long l2) {
        this.freeMemory = l2;
    }

    public final void setOrientation(String str) {
        this.orientation = str;
    }

    public final void setTime(Date date) {
        this.time = date;
    }
}
