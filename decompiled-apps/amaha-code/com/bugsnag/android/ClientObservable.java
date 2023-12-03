package com.bugsnag.android;

import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.StateObserver;
import kotlin.jvm.internal.i;
/* compiled from: ClientObservable.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/ClientObservable;", "Lcom/bugsnag/android/BaseObservable;", "", "orientation", "Lhs/k;", "postOrientationChange", "Lcom/bugsnag/android/internal/ImmutableConfig;", "conf", "lastRunInfoPath", "", "consecutiveLaunchCrashes", "postNdkInstall", "postNdkDeliverPending", "<init>", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ClientObservable extends BaseObservable {
    public final void postNdkDeliverPending() {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            StateEvent.DeliverPending deliverPending = StateEvent.DeliverPending.INSTANCE;
            for (StateObserver stateObserver : getObservers$bugsnag_android_core_release()) {
                stateObserver.onStateChange(deliverPending);
            }
        }
    }

    public final void postNdkInstall(ImmutableConfig conf, String lastRunInfoPath, int i6) {
        i.h(conf, "conf");
        i.h(lastRunInfoPath, "lastRunInfoPath");
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            StateEvent.Install install = new StateEvent.Install(conf.getApiKey(), conf.getEnabledErrorTypes().getNdkCrashes(), conf.getAppVersion(), conf.getBuildUuid(), conf.getReleaseStage(), lastRunInfoPath, i6, conf.getSendThreads());
            for (StateObserver stateObserver : getObservers$bugsnag_android_core_release()) {
                stateObserver.onStateChange(install);
            }
        }
    }

    public final void postOrientationChange(String str) {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            StateEvent.UpdateOrientation updateOrientation = new StateEvent.UpdateOrientation(str);
            for (StateObserver stateObserver : getObservers$bugsnag_android_core_release()) {
                stateObserver.onStateChange(updateOrientation);
            }
        }
    }
}
