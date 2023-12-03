package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.ImmutableConfig;
import kotlin.jvm.internal.i;
/* compiled from: App.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u0004\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001BY\b\u0000\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b)\u0010*BC\b\u0010\u0012\u0006\u0010,\u001a\u00020+\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b)\u0010-J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR$\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR$\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR$\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006."}, d2 = {"Lcom/bugsnag/android/App;", "Lcom/bugsnag/android/JsonStream$Streamable;", "Lcom/bugsnag/android/JsonStream;", "writer", "Lhs/k;", "serialiseFields$bugsnag_android_core_release", "(Lcom/bugsnag/android/JsonStream;)V", "serialiseFields", "toStream", "", "binaryArch", "Ljava/lang/String;", "getBinaryArch", "()Ljava/lang/String;", "setBinaryArch", "(Ljava/lang/String;)V", "id", "getId", "setId", "releaseStage", "getReleaseStage", "setReleaseStage", "version", "getVersion", "setVersion", "codeBundleId", "getCodeBundleId", "setCodeBundleId", "buildUuid", "getBuildUuid", "setBuildUuid", "type", "getType", "setType", "", "versionCode", "Ljava/lang/Number;", "getVersionCode", "()Ljava/lang/Number;", "setVersionCode", "(Ljava/lang/Number;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;)V", "Lcom/bugsnag/android/internal/ImmutableConfig;", "config", "(Lcom/bugsnag/android/internal/ImmutableConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public class App implements JsonStream.Streamable {
    private String binaryArch;
    private String buildUuid;
    private String codeBundleId;

    /* renamed from: id  reason: collision with root package name */
    private String f5907id;
    private String releaseStage;
    private String type;
    private String version;
    private Number versionCode;

    public App(String str, String str2, String str3, String str4, String str5, String str6, String str7, Number number) {
        this.binaryArch = str;
        this.f5907id = str2;
        this.releaseStage = str3;
        this.version = str4;
        this.codeBundleId = str5;
        this.buildUuid = str6;
        this.type = str7;
        this.versionCode = number;
    }

    public final String getBinaryArch() {
        return this.binaryArch;
    }

    public final String getBuildUuid() {
        return this.buildUuid;
    }

    public final String getCodeBundleId() {
        return this.codeBundleId;
    }

    public final String getId() {
        return this.f5907id;
    }

    public final String getReleaseStage() {
        return this.releaseStage;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVersion() {
        return this.version;
    }

    public final Number getVersionCode() {
        return this.versionCode;
    }

    public void serialiseFields$bugsnag_android_core_release(JsonStream writer) {
        i.h(writer, "writer");
        writer.name("binaryArch").value(this.binaryArch);
        writer.name("buildUUID").value(this.buildUuid);
        writer.name("codeBundleId").value(this.codeBundleId);
        writer.name("id").value(this.f5907id);
        writer.name("releaseStage").value(this.releaseStage);
        writer.name("type").value(this.type);
        writer.name("version").value(this.version);
        writer.name("versionCode").value(this.versionCode);
    }

    public final void setBinaryArch(String str) {
        this.binaryArch = str;
    }

    public final void setBuildUuid(String str) {
        this.buildUuid = str;
    }

    public final void setCodeBundleId(String str) {
        this.codeBundleId = str;
    }

    public final void setId(String str) {
        this.f5907id = str;
    }

    public final void setReleaseStage(String str) {
        this.releaseStage = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public final void setVersionCode(Number number) {
        this.versionCode = number;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream writer) {
        i.h(writer, "writer");
        writer.beginObject();
        serialiseFields$bugsnag_android_core_release(writer);
        writer.endObject();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public App(ImmutableConfig config, String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, config.getBuildUuid(), config.getAppType(), config.getVersionCode());
        i.h(config, "config");
    }
}
