package com.bugsnag.android;

import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.StateObserver;
import kotlin.jvm.internal.i;
/* compiled from: UserState.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R*\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/bugsnag/android/UserState;", "Lcom/bugsnag/android/BaseObservable;", "Lhs/k;", "emitObservableEvent", "Lcom/bugsnag/android/User;", "value", "user", "Lcom/bugsnag/android/User;", "getUser", "()Lcom/bugsnag/android/User;", "setUser", "(Lcom/bugsnag/android/User;)V", "<init>", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class UserState extends BaseObservable {
    private User user;

    public UserState(User user) {
        i.h(user, "user");
        this.user = user;
    }

    public final void emitObservableEvent() {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            StateEvent.UpdateUser updateUser = new StateEvent.UpdateUser(this.user);
            for (StateObserver stateObserver : getObservers$bugsnag_android_core_release()) {
                stateObserver.onStateChange(updateUser);
            }
        }
    }

    public final User getUser() {
        return this.user;
    }

    public final void setUser(User value) {
        i.h(value, "value");
        this.user = value;
        emitObservableEvent();
    }
}
