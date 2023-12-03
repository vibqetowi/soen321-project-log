package com.bugsnag.android;

import android.util.JsonReader;
import com.bugsnag.android.JsonStream;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceIdFilePersistence.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/bugsnag/android/DeviceId;", "Lcom/bugsnag/android/JsonStream$Streamable;", "Lcom/bugsnag/android/JsonStream;", "stream", "Lhs/k;", "toStream", "", DeviceId.KEY_ID, "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class DeviceId implements JsonStream.Streamable {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_ID = "id";

    /* renamed from: id  reason: collision with root package name */
    private final String f5915id;

    /* compiled from: DeviceIdFilePersistence.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bugsnag/android/DeviceId$Companion;", "Lcom/bugsnag/android/JsonReadable;", "Lcom/bugsnag/android/DeviceId;", "()V", "KEY_ID", "", "fromReader", "reader", "Landroid/util/JsonReader;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion implements JsonReadable<DeviceId> {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.JsonReadable
        public DeviceId fromReader(JsonReader reader) {
            i.h(reader, "reader");
            reader.beginObject();
            return new DeviceId((reader.hasNext() && i.b(DeviceId.KEY_ID, reader.nextName())) ? reader.nextString() : null);
        }
    }

    public DeviceId(String str) {
        this.f5915id = str;
    }

    public final String getId() {
        return this.f5915id;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream stream) {
        i.h(stream, "stream");
        stream.beginObject();
        stream.name(KEY_ID);
        stream.value(this.f5915id);
        stream.endObject();
    }
}
