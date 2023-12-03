package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.StringUtils;
import com.bugsnag.android.internal.TrimMetrics;
import com.google.firebase.database.core.ServerValues;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: BreadcrumbInternal.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B;\b\u0000\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aB\u0011\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001bJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/bugsnag/android/BreadcrumbInternal;", "Lcom/bugsnag/android/JsonStream$Streamable;", "", "maxStringLength", "Lcom/bugsnag/android/internal/TrimMetrics;", "trimMetadataStringsTo$bugsnag_android_core_release", "(I)Lcom/bugsnag/android/internal/TrimMetrics;", "trimMetadataStringsTo", "Lcom/bugsnag/android/JsonStream;", "writer", "Lhs/k;", "toStream", "", "message", "Ljava/lang/String;", "Lcom/bugsnag/android/BreadcrumbType;", "type", "Lcom/bugsnag/android/BreadcrumbType;", "", "", "metadata", "Ljava/util/Map;", "Ljava/util/Date;", ServerValues.NAME_OP_TIMESTAMP, "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Lcom/bugsnag/android/BreadcrumbType;Ljava/util/Map;Ljava/util/Date;)V", "(Ljava/lang/String;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class BreadcrumbInternal implements JsonStream.Streamable {
    public String message;
    public Map<String, Object> metadata;
    public final Date timestamp;
    public BreadcrumbType type;

    public BreadcrumbInternal(String message, BreadcrumbType type, Map<String, Object> map, Date timestamp) {
        i.h(message, "message");
        i.h(type, "type");
        i.h(timestamp, "timestamp");
        this.message = message;
        this.type = type;
        this.metadata = map;
        this.timestamp = timestamp;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream writer) {
        i.h(writer, "writer");
        writer.beginObject();
        writer.name(ServerValues.NAME_OP_TIMESTAMP).value(this.timestamp);
        writer.name(SessionManager.KEY_NAME).value(this.message);
        writer.name("type").value(this.type.toString());
        writer.name("metaData");
        writer.value(this.metadata, true);
        writer.endObject();
    }

    public final TrimMetrics trimMetadataStringsTo$bugsnag_android_core_release(int i6) {
        Map<String, Object> map = this.metadata;
        if (map != null) {
            return StringUtils.INSTANCE.trimStringValuesTo(i6, map);
        }
        return new TrimMetrics(0, 0);
    }

    public /* synthetic */ BreadcrumbInternal(String str, BreadcrumbType breadcrumbType, Map map, Date date, int i6, d dVar) {
        this(str, breadcrumbType, map, (i6 & 8) != 0 ? new Date() : date);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BreadcrumbInternal(String message) {
        this(message, BreadcrumbType.MANUAL, new LinkedHashMap(), new Date());
        i.h(message, "message");
    }
}
