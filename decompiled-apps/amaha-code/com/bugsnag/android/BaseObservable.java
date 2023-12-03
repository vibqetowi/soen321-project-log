package com.bugsnag.android;

import com.bugsnag.android.internal.StateObserver;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.i;
import ss.a;
/* compiled from: BaseObservable.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\f\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0080\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/bugsnag/android/BaseObservable;", "", "Lcom/bugsnag/android/internal/StateObserver;", "observer", "Lhs/k;", "addObserver", "removeObserver", "Lkotlin/Function0;", "Lcom/bugsnag/android/StateEvent;", "provider", "updateState$bugsnag_android_core_release", "(Lss/a;)V", "updateState", "event", "Ljava/util/concurrent/CopyOnWriteArrayList;", "observers", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getObservers$bugsnag_android_core_release", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "<init>", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public class BaseObservable {
    private final CopyOnWriteArrayList<StateObserver> observers = new CopyOnWriteArrayList<>();

    public final void addObserver(StateObserver observer) {
        i.h(observer, "observer");
        this.observers.addIfAbsent(observer);
    }

    public final CopyOnWriteArrayList<StateObserver> getObservers$bugsnag_android_core_release() {
        return this.observers;
    }

    public final void removeObserver(StateObserver observer) {
        i.h(observer, "observer");
        this.observers.remove(observer);
    }

    public final void updateState(StateEvent event) {
        i.h(event, "event");
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            for (StateObserver stateObserver : getObservers$bugsnag_android_core_release()) {
                stateObserver.onStateChange(event);
            }
        }
    }

    public final void updateState$bugsnag_android_core_release(a<? extends StateEvent> provider) {
        i.h(provider, "provider");
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        StateEvent invoke = provider.invoke();
        for (StateObserver stateObserver : getObservers$bugsnag_android_core_release()) {
            stateObserver.onStateChange(invoke);
        }
    }
}
