package com.bugsnag.android;

import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.StateObserver;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.List;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: FeatureFlagState.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\n\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\u0006\u0010\u000e\u001a\u00020\u0005J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fJ\u0006\u0010\u0011\u001a\u00020\u0000J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0012HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bugsnag/android/FeatureFlagState;", "Lcom/bugsnag/android/BaseObservable;", "Lcom/bugsnag/android/FeatureFlagAware;", "", SessionManager.KEY_NAME, "Lhs/k;", "addFeatureFlag", "variant", "", "Lcom/bugsnag/android/FeatureFlag;", "featureFlags", "addFeatureFlags", "clearFeatureFlag", "clearFeatureFlags", "emitObservableEvent", "", "toList", "copy", "Lcom/bugsnag/android/FeatureFlags;", "component1", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/bugsnag/android/FeatureFlags;", "getFeatureFlags", "()Lcom/bugsnag/android/FeatureFlags;", "<init>", "(Lcom/bugsnag/android/FeatureFlags;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class FeatureFlagState extends BaseObservable implements FeatureFlagAware {
    private final FeatureFlags featureFlags;

    public FeatureFlagState() {
        this(null, 1, null);
    }

    public static /* synthetic */ FeatureFlagState copy$default(FeatureFlagState featureFlagState, FeatureFlags featureFlags, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            featureFlags = featureFlagState.featureFlags;
        }
        return featureFlagState.copy(featureFlags);
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void addFeatureFlag(String name) {
        i.h(name, "name");
        this.featureFlags.addFeatureFlag(name);
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        StateEvent.AddFeatureFlag addFeatureFlag = new StateEvent.AddFeatureFlag(name, null, 2, null);
        for (StateObserver stateObserver : getObservers$bugsnag_android_core_release()) {
            stateObserver.onStateChange(addFeatureFlag);
        }
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void addFeatureFlags(Iterable<FeatureFlag> featureFlags) {
        i.h(featureFlags, "featureFlags");
        for (FeatureFlag featureFlag : featureFlags) {
            String name = featureFlag.getKey();
            i.c(name, "name");
            addFeatureFlag(name, featureFlag.getValue());
        }
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void clearFeatureFlag(String name) {
        i.h(name, "name");
        this.featureFlags.clearFeatureFlag(name);
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            StateEvent.ClearFeatureFlag clearFeatureFlag = new StateEvent.ClearFeatureFlag(name);
            for (StateObserver stateObserver : getObservers$bugsnag_android_core_release()) {
                stateObserver.onStateChange(clearFeatureFlag);
            }
        }
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void clearFeatureFlags() {
        this.featureFlags.clearFeatureFlags();
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            StateEvent.ClearFeatureFlags clearFeatureFlags = StateEvent.ClearFeatureFlags.INSTANCE;
            for (StateObserver stateObserver : getObservers$bugsnag_android_core_release()) {
                stateObserver.onStateChange(clearFeatureFlags);
            }
        }
    }

    public final FeatureFlags component1() {
        return this.featureFlags;
    }

    public final FeatureFlagState copy(FeatureFlags featureFlags) {
        i.h(featureFlags, "featureFlags");
        return new FeatureFlagState(featureFlags);
    }

    public final void emitObservableEvent() {
        for (FeatureFlag featureFlag : toList()) {
            String name = featureFlag.getKey();
            String value = featureFlag.getValue();
            if (!getObservers$bugsnag_android_core_release().isEmpty()) {
                i.c(name, "name");
                StateEvent.AddFeatureFlag addFeatureFlag = new StateEvent.AddFeatureFlag(name, value);
                for (StateObserver stateObserver : getObservers$bugsnag_android_core_release()) {
                    stateObserver.onStateChange(addFeatureFlag);
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FeatureFlagState) || !i.b(this.featureFlags, ((FeatureFlagState) obj).featureFlags)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final FeatureFlags getFeatureFlags() {
        return this.featureFlags;
    }

    public int hashCode() {
        FeatureFlags featureFlags = this.featureFlags;
        if (featureFlags != null) {
            return featureFlags.hashCode();
        }
        return 0;
    }

    public final List<FeatureFlag> toList() {
        return this.featureFlags.toList();
    }

    public String toString() {
        return "FeatureFlagState(featureFlags=" + this.featureFlags + ")";
    }

    public /* synthetic */ FeatureFlagState(FeatureFlags featureFlags, int i6, d dVar) {
        this((i6 & 1) != 0 ? new FeatureFlags(null, 1, null) : featureFlags);
    }

    public final FeatureFlagState copy() {
        return new FeatureFlagState(this.featureFlags.copy());
    }

    public FeatureFlagState(FeatureFlags featureFlags) {
        i.h(featureFlags, "featureFlags");
        this.featureFlags = featureFlags;
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void addFeatureFlag(String name, String str) {
        i.h(name, "name");
        this.featureFlags.addFeatureFlag(name, str);
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        StateEvent.AddFeatureFlag addFeatureFlag = new StateEvent.AddFeatureFlag(name, str);
        for (StateObserver stateObserver : getObservers$bugsnag_android_core_release()) {
            stateObserver.onStateChange(addFeatureFlag);
        }
    }
}
