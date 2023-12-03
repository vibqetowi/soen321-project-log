package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
/* compiled from: Device.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B_\b\u0000\u0012\u0006\u0010?\u001a\u00020>\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010#\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00108\u001a\u0004\u0018\u000107\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b@\u0010AJ,\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0002J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R$\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013RF\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u000f\u001a\u0004\b2\u0010\u0011\"\u0004\b3\u0010\u0013R$\u00104\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u000f\u001a\u0004\b5\u0010\u0011\"\u0004\b6\u0010\u0013R$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006B"}, d2 = {"Lcom/bugsnag/android/Device;", "Lcom/bugsnag/android/JsonStream$Streamable;", "", "", "", "value", "sanitizeRuntimeVersions", "Lcom/bugsnag/android/JsonStream;", "writer", "Lhs/k;", "serializeFields$bugsnag_android_core_release", "(Lcom/bugsnag/android/JsonStream;)V", "serializeFields", "toStream", "manufacturer", "Ljava/lang/String;", "getManufacturer", "()Ljava/lang/String;", "setManufacturer", "(Ljava/lang/String;)V", "model", "getModel", "setModel", "osName", "getOsName", "setOsName", "osVersion", "getOsVersion", "setOsVersion", "runtimeVersions", "Ljava/util/Map;", "getRuntimeVersions", "()Ljava/util/Map;", "setRuntimeVersions", "(Ljava/util/Map;)V", "", "cpuAbi", "[Ljava/lang/String;", "getCpuAbi", "()[Ljava/lang/String;", "setCpuAbi", "([Ljava/lang/String;)V", "", "jailbroken", "Ljava/lang/Boolean;", "getJailbroken", "()Ljava/lang/Boolean;", "setJailbroken", "(Ljava/lang/Boolean;)V", "id", "getId", "setId", "locale", "getLocale", "setLocale", "", "totalMemory", "Ljava/lang/Long;", "getTotalMemory", "()Ljava/lang/Long;", "setTotalMemory", "(Ljava/lang/Long;)V", "Lcom/bugsnag/android/DeviceBuildInfo;", "buildInfo", "<init>", "(Lcom/bugsnag/android/DeviceBuildInfo;[Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public class Device implements JsonStream.Streamable {
    private String[] cpuAbi;

    /* renamed from: id  reason: collision with root package name */
    private String f5914id;
    private Boolean jailbroken;
    private String locale;
    private String manufacturer;
    private String model;
    private String osName;
    private String osVersion;
    private Map<String, Object> runtimeVersions;
    private Long totalMemory;

    public Device(DeviceBuildInfo buildInfo, String[] strArr, Boolean bool, String str, String str2, Long l2, Map<String, Object> map) {
        i.h(buildInfo, "buildInfo");
        this.cpuAbi = strArr;
        this.jailbroken = bool;
        this.f5914id = str;
        this.locale = str2;
        this.totalMemory = l2;
        this.manufacturer = buildInfo.getManufacturer();
        this.model = buildInfo.getModel();
        this.osName = "android";
        this.osVersion = buildInfo.getOsVersion();
        this.runtimeVersions = sanitizeRuntimeVersions(map);
    }

    private final Map<String, Object> sanitizeRuntimeVersions(Map<String, Object> map) {
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            return linkedHashMap;
        }
        return null;
    }

    public final String[] getCpuAbi() {
        return this.cpuAbi;
    }

    public final String getId() {
        return this.f5914id;
    }

    public final Boolean getJailbroken() {
        return this.jailbroken;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOsName() {
        return this.osName;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final Map<String, Object> getRuntimeVersions() {
        return this.runtimeVersions;
    }

    public final Long getTotalMemory() {
        return this.totalMemory;
    }

    public void serializeFields$bugsnag_android_core_release(JsonStream writer) {
        i.h(writer, "writer");
        writer.name("cpuAbi").value(this.cpuAbi);
        writer.name("jailbroken").value(this.jailbroken);
        writer.name("id").value(this.f5914id);
        writer.name("locale").value(this.locale);
        writer.name("manufacturer").value(this.manufacturer);
        writer.name("model").value(this.model);
        writer.name("osName").value(this.osName);
        writer.name("osVersion").value(this.osVersion);
        writer.name("runtimeVersions").value(this.runtimeVersions);
        writer.name("totalMemory").value((Number) this.totalMemory);
    }

    public final void setCpuAbi(String[] strArr) {
        this.cpuAbi = strArr;
    }

    public final void setId(String str) {
        this.f5914id = str;
    }

    public final void setJailbroken(Boolean bool) {
        this.jailbroken = bool;
    }

    public final void setLocale(String str) {
        this.locale = str;
    }

    public final void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public final void setModel(String str) {
        this.model = str;
    }

    public final void setOsName(String str) {
        this.osName = str;
    }

    public final void setOsVersion(String str) {
        this.osVersion = str;
    }

    public final void setRuntimeVersions(Map<String, Object> map) {
        this.runtimeVersions = sanitizeRuntimeVersions(map);
    }

    public final void setTotalMemory(Long l2) {
        this.totalMemory = l2;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream writer) {
        i.h(writer, "writer");
        writer.beginObject();
        serializeFields$bugsnag_android_core_release(writer);
        writer.endObject();
    }
}
