package com.bugsnag.android;

import ca.a;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.DateUtils;
import com.theinnerhour.b2b.utils.SessionManager;
import gv.r;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: ObjectJsonStreamer.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\n\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001c\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\nH\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001H\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002J\"\u0010\u0010\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006R(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/bugsnag/android/ObjectJsonStreamer;", "", "Lcom/bugsnag/android/JsonStream;", "writer", "", "obj", "", "shouldRedactKeys", "Lhs/k;", "mapToStream", "", "collectionToStream", "arrayToStream", "", "key", "isRedactedKey", "objectToStream", "", "redactedKeys", "Ljava/util/Set;", "getRedactedKeys", "()Ljava/util/Set;", "setRedactedKeys", "(Ljava/util/Set;)V", "<init>", "()V", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ObjectJsonStreamer {
    public static final Companion Companion = new Companion(null);
    public static final String OBJECT_PLACEHOLDER = "[OBJECT]";
    public static final String REDACTED_PLACEHOLDER = "[REDACTED]";
    private Set<String> redactedKeys = a.l1(SessionManager.KEY_PASS);

    /* compiled from: ObjectJsonStreamer.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bugsnag/android/ObjectJsonStreamer$Companion;", "", "()V", "OBJECT_PLACEHOLDER", "", "REDACTED_PLACEHOLDER", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }
    }

    private final void arrayToStream(JsonStream jsonStream, Object obj) {
        jsonStream.beginArray();
        int length = Array.getLength(obj);
        for (int i6 = 0; i6 < length; i6++) {
            objectToStream$default(this, Array.get(obj, i6), jsonStream, false, 4, null);
        }
        jsonStream.endArray();
    }

    private final void collectionToStream(JsonStream jsonStream, Collection<?> collection) {
        jsonStream.beginArray();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            objectToStream$default(this, it.next(), jsonStream, false, 4, null);
        }
        jsonStream.endArray();
    }

    private final boolean isRedactedKey(String str) {
        Set<String> set = this.redactedKeys;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (String str2 : set) {
                if (r.J0(str, str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void mapToStream(JsonStream jsonStream, Map<?, ?> map, boolean z10) {
        jsonStream.beginObject();
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            if (key instanceof String) {
                String str = (String) key;
                jsonStream.name(str);
                if (z10 && isRedactedKey(str)) {
                    jsonStream.value(REDACTED_PLACEHOLDER);
                } else {
                    objectToStream(entry.getValue(), jsonStream, z10);
                }
            }
        }
        jsonStream.endObject();
    }

    public static /* synthetic */ void objectToStream$default(ObjectJsonStreamer objectJsonStreamer, Object obj, JsonStream jsonStream, boolean z10, int i6, Object obj2) {
        if ((i6 & 4) != 0) {
            z10 = false;
        }
        objectJsonStreamer.objectToStream(obj, jsonStream, z10);
    }

    public final Set<String> getRedactedKeys() {
        return this.redactedKeys;
    }

    public final void objectToStream(Object obj, JsonStream writer, boolean z10) {
        i.h(writer, "writer");
        if (obj == null) {
            writer.nullValue();
        } else if (obj instanceof String) {
            writer.value((String) obj);
        } else if (obj instanceof Number) {
            writer.value((Number) obj);
        } else if (obj instanceof Boolean) {
            writer.value(((Boolean) obj).booleanValue());
        } else if (obj instanceof JsonStream.Streamable) {
            ((JsonStream.Streamable) obj).toStream(writer);
        } else if (obj instanceof Date) {
            writer.value(DateUtils.toIso8601((Date) obj));
        } else if (obj instanceof Map) {
            mapToStream(writer, (Map) obj, z10);
        } else if (obj instanceof Collection) {
            collectionToStream(writer, (Collection) obj);
        } else if (obj.getClass().isArray()) {
            arrayToStream(writer, obj);
        } else {
            writer.value(OBJECT_PLACEHOLDER);
        }
    }

    public final void setRedactedKeys(Set<String> set) {
        i.h(set, "<set-?>");
        this.redactedKeys = set;
    }
}
