package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.theinnerhour.b2b.utils.SessionManager;
import is.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: FeatureFlags.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0011J\u0006\u0010\u0013\u001a\u00020\u0000R\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/bugsnag/android/FeatureFlags;", "Lcom/bugsnag/android/JsonStream$Streamable;", "Lcom/bugsnag/android/FeatureFlagAware;", "", SessionManager.KEY_NAME, "Lhs/k;", "addFeatureFlag", "variant", "", "Lcom/bugsnag/android/FeatureFlag;", "featureFlags", "addFeatureFlags", "clearFeatureFlag", "clearFeatureFlags", "Lcom/bugsnag/android/JsonStream;", "stream", "toStream", "", "toList", "copy", "emptyVariant", "Ljava/lang/String;", "", "store", "Ljava/util/Map;", "getStore$bugsnag_android_core_release", "()Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class FeatureFlags implements JsonStream.Streamable, FeatureFlagAware {
    private final String emptyVariant;
    private final Map<String, String> store;

    public FeatureFlags() {
        this(null, 1, null);
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public synchronized void addFeatureFlag(String name) {
        i.h(name, "name");
        addFeatureFlag(name, null);
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public synchronized void addFeatureFlags(Iterable<FeatureFlag> featureFlags) {
        i.h(featureFlags, "featureFlags");
        for (FeatureFlag featureFlag : featureFlags) {
            String name = featureFlag.getKey();
            i.c(name, "name");
            addFeatureFlag(name, featureFlag.getValue());
        }
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public synchronized void clearFeatureFlag(String name) {
        i.h(name, "name");
        this.store.remove(name);
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public synchronized void clearFeatureFlags() {
        this.store.clear();
    }

    public final synchronized FeatureFlags copy() {
        return new FeatureFlags(e0.z0(this.store));
    }

    public final Map<String, String> getStore$bugsnag_android_core_release() {
        return this.store;
    }

    public final synchronized List<FeatureFlag> toList() {
        ArrayList arrayList;
        Set<Map.Entry<String, String>> entrySet = this.store.entrySet();
        arrayList = new ArrayList(is.i.H1(entrySet, 10));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (i.b(str2, this.emptyVariant)) {
                str2 = null;
            }
            arrayList.add(new FeatureFlag(str, str2));
        }
        return arrayList;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream stream) {
        Map x02;
        i.h(stream, "stream");
        synchronized (this) {
            x02 = e0.x0(this.store);
        }
        stream.beginArray();
        for (Map.Entry entry : x02.entrySet()) {
            String str = (String) entry.getValue();
            stream.beginObject();
            stream.name("featureFlag").value((String) entry.getKey());
            if (!i.b(str, this.emptyVariant)) {
                stream.name("variant").value(str);
            }
            stream.endObject();
        }
        stream.endArray();
    }

    public FeatureFlags(Map<String, String> store) {
        i.h(store, "store");
        this.store = store;
        this.emptyVariant = "__EMPTY_VARIANT_SENTINEL__";
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public synchronized void addFeatureFlag(String name, String str) {
        i.h(name, "name");
        this.store.remove(name);
        Map<String, String> map = this.store;
        if (str == null) {
            str = this.emptyVariant;
        }
        map.put(name, str);
    }

    public /* synthetic */ FeatureFlags(Map map, int i6, d dVar) {
        this((i6 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
