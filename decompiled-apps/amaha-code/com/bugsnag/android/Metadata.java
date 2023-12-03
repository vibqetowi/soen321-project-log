package com.bugsnag.android;

import ca.a;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.StringUtils;
import com.bugsnag.android.internal.TrimMetrics;
import is.q;
import is.u;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: Metadata.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\t\b\u0080\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B+\b\u0007\u0012 \b\u0002\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0003¢\u0006\u0004\b0\u00101J,\u0010\n\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J&\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000fH\u0016J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u001e\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u001e\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0003J\u0006\u0010\u0015\u001a\u00020\u0000J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016J(\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0003HÀ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u0015\u001a\u00020\u00002 \b\u0002\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0003HÆ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R2\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b)\u0010\u001bR0\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040*2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/bugsnag/android/Metadata;", "Lcom/bugsnag/android/JsonStream$Streamable;", "Lcom/bugsnag/android/MetadataAware;", "", "", "", "map", "key", "newValue", "Lhs/k;", "insertValue", "Lcom/bugsnag/android/JsonStream;", "writer", "toStream", "section", "", "value", "addMetadata", "clearMetadata", "getMetadata", "toMap", "copy", "", "maxStringLength", "Lcom/bugsnag/android/internal/TrimMetrics;", "trimMetadataStringsTo", "component1$bugsnag_android_core_release", "()Ljava/util/Map;", "component1", "store", "toString", "hashCode", "other", "", "equals", "Lcom/bugsnag/android/ObjectJsonStreamer;", "jsonStreamer", "Lcom/bugsnag/android/ObjectJsonStreamer;", "getJsonStreamer", "()Lcom/bugsnag/android/ObjectJsonStreamer;", "Ljava/util/Map;", "getStore$bugsnag_android_core_release", "", "getRedactedKeys", "()Ljava/util/Set;", "setRedactedKeys", "(Ljava/util/Set;)V", "redactedKeys", "<init>", "(Ljava/util/Map;)V", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class Metadata implements JsonStream.Streamable, MetadataAware {
    public static final Companion Companion = new Companion(null);
    private final ObjectJsonStreamer jsonStreamer;
    private final Map<String, Map<String, Object>> store;

    /* compiled from: Metadata.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J8\u0010\t\u001a\u00020\b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006H\u0002J!\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/bugsnag/android/Metadata$Companion;", "", "", "", "result", "key", "", "map", "Lhs/k;", "getMergeValue", "", "Lcom/bugsnag/android/Metadata;", "data", "merge", "([Lcom/bugsnag/android/Metadata;)Lcom/bugsnag/android/Metadata;", "", "mergeMaps$bugsnag_android_core_release", "(Ljava/util/List;)Ljava/util/Map;", "mergeMaps", "<init>", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        private final void getMergeValue(Map<String, Object> map, String str, Map<String, ? extends Object> map2) {
            Object obj = map.get(str);
            Object obj2 = map2.get(str);
            if (obj2 != null) {
                if ((obj instanceof Map) && (obj2 instanceof Map)) {
                    map.put(str, mergeMaps$bugsnag_android_core_release(a.P0((Map) obj, (Map) obj2)));
                } else {
                    map.put(str, obj2);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }

        public final Metadata merge(Metadata... data) {
            i.h(data, "data");
            ArrayList arrayList = new ArrayList(data.length);
            for (Metadata metadata : data) {
                arrayList.add(metadata.toMap());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Metadata metadata2 : data) {
                q.R1(metadata2.getJsonStreamer().getRedactedKeys(), arrayList2);
            }
            Map<String, Object> mergeMaps$bugsnag_android_core_release = mergeMaps$bugsnag_android_core_release(arrayList);
            if (mergeMaps$bugsnag_android_core_release != null) {
                Metadata metadata3 = new Metadata(c0.c(mergeMaps$bugsnag_android_core_release));
                metadata3.setRedactedKeys(u.M2(arrayList2));
                return metadata3;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.collections.MutableMap<kotlin.String, kotlin.Any>>");
        }

        public final Map<String, Object> mergeMaps$bugsnag_android_core_release(List<? extends Map<String, ? extends Object>> data) {
            i.h(data, "data");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                q.R1(((Map) it.next()).keySet(), arrayList);
            }
            Set<String> M2 = u.M2(arrayList);
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Map<String, ? extends Object> map : data) {
                for (String str : M2) {
                    getMergeValue(concurrentHashMap, str, map);
                }
            }
            return concurrentHashMap;
        }
    }

    public Metadata() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Metadata copy$default(Metadata metadata, Map map, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            map = metadata.store;
        }
        return metadata.copy(map);
    }

    private final void insertValue(Map<String, Object> map, String str, Object obj) {
        Object obj2 = map.get(str);
        if (obj2 != null && (obj instanceof Map)) {
            Map[] mapArr = new Map[2];
            mapArr[0] = (Map) obj2;
            if (obj != null) {
                mapArr[1] = (Map) obj;
                obj = Companion.mergeMaps$bugsnag_android_core_release(a.P0(mapArr));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            }
        }
        map.put(str, obj);
    }

    @Override // com.bugsnag.android.MetadataAware
    public void addMetadata(String section, Map<String, ? extends Object> value) {
        i.h(section, "section");
        i.h(value, "value");
        Iterator<T> it = value.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            addMetadata(section, (String) entry.getKey(), entry.getValue());
        }
    }

    @Override // com.bugsnag.android.MetadataAware
    public void clearMetadata(String section) {
        i.h(section, "section");
        this.store.remove(section);
    }

    public final Map<String, Map<String, Object>> component1$bugsnag_android_core_release() {
        return this.store;
    }

    public final Metadata copy(Map<String, Map<String, Object>> store) {
        i.h(store, "store");
        return new Metadata(store);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Metadata) || !i.b(this.store, ((Metadata) obj).store)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final ObjectJsonStreamer getJsonStreamer() {
        return this.jsonStreamer;
    }

    @Override // com.bugsnag.android.MetadataAware
    public Map<String, Object> getMetadata(String section) {
        i.h(section, "section");
        return this.store.get(section);
    }

    public final Set<String> getRedactedKeys() {
        return this.jsonStreamer.getRedactedKeys();
    }

    public final Map<String, Map<String, Object>> getStore$bugsnag_android_core_release() {
        return this.store;
    }

    public int hashCode() {
        Map<String, Map<String, Object>> map = this.store;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final void setRedactedKeys(Set<String> value) {
        i.h(value, "value");
        this.jsonStreamer.setRedactedKeys(value);
    }

    public final Map<String, Map<String, Object>> toMap() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(this.store);
        Iterator<T> it = this.store.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            concurrentHashMap.put(entry.getKey(), new ConcurrentHashMap((Map) entry.getValue()));
        }
        return concurrentHashMap;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream writer) {
        i.h(writer, "writer");
        this.jsonStreamer.objectToStream(this.store, writer, true);
    }

    public String toString() {
        return "Metadata(store=" + this.store + ")";
    }

    public final TrimMetrics trimMetadataStringsTo(int i6) {
        int i10 = 0;
        int i11 = 0;
        for (Map.Entry<String, Map<String, Object>> entry : this.store.entrySet()) {
            StringUtils stringUtils = StringUtils.INSTANCE;
            Map<String, Object> value = entry.getValue();
            if (value != null) {
                TrimMetrics trimStringValuesTo = stringUtils.trimStringValuesTo(i6, c0.c(value));
                i10 += trimStringValuesTo.getItemsTrimmed();
                i11 += trimStringValuesTo.getDataTrimmed();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
            }
        }
        return new TrimMetrics(i10, i11);
    }

    public Metadata(Map<String, Map<String, Object>> store) {
        i.h(store, "store");
        this.store = store;
        this.jsonStreamer = new ObjectJsonStreamer();
    }

    @Override // com.bugsnag.android.MetadataAware
    public void clearMetadata(String section, String key) {
        i.h(section, "section");
        i.h(key, "key");
        Map<String, Object> map = this.store.get(section);
        if (map != null) {
            map.remove(key);
        }
        if (map == null || map.isEmpty()) {
            this.store.remove(section);
        }
    }

    public final Metadata copy() {
        Metadata copy = copy(toMap());
        copy.setRedactedKeys(u.M2(getRedactedKeys()));
        return copy;
    }

    @Override // com.bugsnag.android.MetadataAware
    public Object getMetadata(String section, String key) {
        i.h(section, "section");
        i.h(key, "key");
        Map<String, Object> metadata = getMetadata(section);
        if (metadata != null) {
            return metadata.get(key);
        }
        return null;
    }

    public /* synthetic */ Metadata(Map map, int i6, d dVar) {
        this((i6 & 1) != 0 ? new ConcurrentHashMap() : map);
    }

    @Override // com.bugsnag.android.MetadataAware
    public void addMetadata(String section, String key, Object obj) {
        i.h(section, "section");
        i.h(key, "key");
        if (obj == null) {
            clearMetadata(section, key);
            return;
        }
        Map<String, Object> map = this.store.get(section);
        if (map == null) {
            map = new ConcurrentHashMap<>();
        }
        this.store.put(section, map);
        insertValue(map, key, obj);
    }
}
