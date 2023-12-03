package com.bugsnag.android;

import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.StateObserver;
import kotlin.jvm.internal.d;
/* compiled from: ContextState.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\b\u001a\u00020\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/ContextState;", "Lcom/bugsnag/android/BaseObservable;", "", "context", "Lhs/k;", "setManualContext", "setAutomaticContext", "getContext", "emitObservableEvent", "manualContext", "Ljava/lang/String;", "automaticContext", "<init>", "()V", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ContextState extends BaseObservable {
    public static final Companion Companion = new Companion(null);
    private static final String MANUAL = "__BUGSNAG_MANUAL_CONTEXT__";
    private String automaticContext;
    private String manualContext;

    /* compiled from: ContextState.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/ContextState$Companion;", "", "()V", "MANUAL", "", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }
    }

    public final void emitObservableEvent() {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            StateEvent.UpdateContext updateContext = new StateEvent.UpdateContext(getContext());
            for (StateObserver stateObserver : getObservers$bugsnag_android_core_release()) {
                stateObserver.onStateChange(updateContext);
            }
        }
    }

    public final String getContext() {
        boolean z10;
        String str = this.automaticContext;
        if (str != MANUAL) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            str = null;
        }
        if (str == null) {
            return this.manualContext;
        }
        return str;
    }

    public final void setAutomaticContext(String str) {
        if (this.automaticContext != MANUAL) {
            this.automaticContext = str;
            emitObservableEvent();
        }
    }

    public final void setManualContext(String str) {
        this.manualContext = str;
        this.automaticContext = MANUAL;
        emitObservableEvent();
    }
}
