package com.bugsnag.android;

import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.StateObserver;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: MetadataState.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0002J\"\u0010\n\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J&\u0010\n\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000bH\u0002J&\u0010\f\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000bH\u0016J\"\u0010\f\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u001e\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0006\u0010\u000f\u001a\u00020\u0006J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u000e\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/bugsnag/android/MetadataState;", "Lcom/bugsnag/android/BaseObservable;", "Lcom/bugsnag/android/MetadataAware;", "", "section", "key", "Lhs/k;", "notifyClear", "", "value", "notifyMetadataAdded", "", "addMetadata", "clearMetadata", "getMetadata", "emitObservableEvent", "Lcom/bugsnag/android/Metadata;", "component1", "metadata", "copy", "toString", "", "hashCode", "other", "", "equals", "Lcom/bugsnag/android/Metadata;", "()Lcom/bugsnag/android/Metadata;", "<init>", "(Lcom/bugsnag/android/Metadata;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class MetadataState extends BaseObservable implements MetadataAware {
    private final Metadata metadata;

    public MetadataState() {
        this(null, 1, null);
    }

    public static /* synthetic */ MetadataState copy$default(MetadataState metadataState, Metadata metadata, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            metadata = metadataState.metadata;
        }
        return metadataState.copy(metadata);
    }

    private final void notifyClear(String str, String str2) {
        if (str2 == null) {
            if (!getObservers$bugsnag_android_core_release().isEmpty()) {
                StateEvent.ClearMetadataSection clearMetadataSection = new StateEvent.ClearMetadataSection(str);
                for (StateObserver stateObserver : getObservers$bugsnag_android_core_release()) {
                    stateObserver.onStateChange(clearMetadataSection);
                }
            }
        } else if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            StateEvent.ClearMetadataValue clearMetadataValue = new StateEvent.ClearMetadataValue(str, str2);
            for (StateObserver stateObserver2 : getObservers$bugsnag_android_core_release()) {
                stateObserver2.onStateChange(clearMetadataValue);
            }
        }
    }

    private final void notifyMetadataAdded(String str, String str2, Object obj) {
        if (obj == null) {
            notifyClear(str, str2);
        } else if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            StateEvent.AddMetadata addMetadata = new StateEvent.AddMetadata(str, str2, this.metadata.getMetadata(str, str2));
            for (StateObserver stateObserver : getObservers$bugsnag_android_core_release()) {
                stateObserver.onStateChange(addMetadata);
            }
        }
    }

    @Override // com.bugsnag.android.MetadataAware
    public void addMetadata(String section, Map<String, ? extends Object> value) {
        i.h(section, "section");
        i.h(value, "value");
        this.metadata.addMetadata(section, value);
        notifyMetadataAdded(section, value);
    }

    @Override // com.bugsnag.android.MetadataAware
    public void clearMetadata(String section) {
        i.h(section, "section");
        this.metadata.clearMetadata(section);
        notifyClear(section, null);
    }

    public final Metadata component1() {
        return this.metadata;
    }

    public final MetadataState copy(Metadata metadata) {
        i.h(metadata, "metadata");
        return new MetadataState(metadata);
    }

    public final void emitObservableEvent() {
        Set<Map.Entry<String, Object>> entrySet;
        for (String str : this.metadata.getStore$bugsnag_android_core_release().keySet()) {
            Map<String, Object> metadata = this.metadata.getMetadata(str);
            if (metadata != null && (entrySet = metadata.entrySet()) != null) {
                Iterator<T> it = entrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    notifyMetadataAdded(str, (String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MetadataState) || !i.b(this.metadata, ((MetadataState) obj).metadata)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        Metadata metadata = this.metadata;
        if (metadata != null) {
            return metadata.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "MetadataState(metadata=" + this.metadata + ")";
    }

    public /* synthetic */ MetadataState(Metadata metadata, int i6, d dVar) {
        this((i6 & 1) != 0 ? new Metadata(null, 1, null) : metadata);
    }

    @Override // com.bugsnag.android.MetadataAware
    public Map<String, Object> getMetadata(String section) {
        i.h(section, "section");
        return this.metadata.getMetadata(section);
    }

    public MetadataState(Metadata metadata) {
        i.h(metadata, "metadata");
        this.metadata = metadata;
    }

    @Override // com.bugsnag.android.MetadataAware
    public void addMetadata(String section, String key, Object obj) {
        i.h(section, "section");
        i.h(key, "key");
        this.metadata.addMetadata(section, key, obj);
        notifyMetadataAdded(section, key, obj);
    }

    @Override // com.bugsnag.android.MetadataAware
    public void clearMetadata(String section, String key) {
        i.h(section, "section");
        i.h(key, "key");
        this.metadata.clearMetadata(section, key);
        notifyClear(section, key);
    }

    @Override // com.bugsnag.android.MetadataAware
    public Object getMetadata(String section, String key) {
        i.h(section, "section");
        i.h(key, "key");
        return this.metadata.getMetadata(section, key);
    }

    private final void notifyMetadataAdded(String str, Map<String, ? extends Object> map) {
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!getObservers$bugsnag_android_core_release().isEmpty()) {
                StateEvent.AddMetadata addMetadata = new StateEvent.AddMetadata(str, (String) entry.getKey(), this.metadata.getMetadata(str, (String) entry.getKey()));
                for (StateObserver stateObserver : getObservers$bugsnag_android_core_release()) {
                    stateObserver.onStateChange(addMetadata);
                }
            }
        }
    }
}
