package com.bugsnag.android;

import com.bugsnag.android.internal.InternalMetrics;
import com.bugsnag.android.internal.InternalMetricsNoop;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import ss.a;
/* compiled from: CallbackState.kt */
@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\r\b\u0080\b\u0018\u0000 B2\u00020\u0001:\u0001BBG\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060&\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0&\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0&\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120&¢\u0006\u0004\b@\u0010AJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010!\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018J\u001c\u0010\"\u001a\u00020\u001a2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160#2\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010%\u001a\u00020\u0000J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060&HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0&HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0&HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120&HÆ\u0003JI\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060&2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0&2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0&2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120&HÆ\u0001J\t\u00100\u001a\u00020/HÖ\u0001J\t\u00102\u001a\u000201HÖ\u0001J\u0013\u00105\u001a\u00020\u001a2\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003J\u0014\u00107\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020106H\u0002R\u0016\u00108\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060&8\u0006¢\u0006\f\n\u0004\b+\u0010:\u001a\u0004\b;\u0010<R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0&8\u0006¢\u0006\f\n\u0004\b,\u0010:\u001a\u0004\b=\u0010<R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0&8\u0006¢\u0006\f\n\u0004\b-\u0010:\u001a\u0004\b>\u0010<R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120&8\u0006¢\u0006\f\n\u0004\b.\u0010:\u001a\u0004\b?\u0010<¨\u0006C"}, d2 = {"Lcom/bugsnag/android/CallbackState;", "Lcom/bugsnag/android/CallbackAware;", "Lcom/bugsnag/android/internal/InternalMetrics;", "metrics", "Lhs/k;", "setInternalMetrics", "Lcom/bugsnag/android/OnErrorCallback;", CallbackState.onErrorName, "addOnError", "removeOnError", "Lcom/bugsnag/android/OnBreadcrumbCallback;", CallbackState.onBreadcrumbName, "addOnBreadcrumb", "removeOnBreadcrumb", "Lcom/bugsnag/android/OnSessionCallback;", CallbackState.onSessionName, "addOnSession", "removeOnSession", "Lcom/bugsnag/android/OnSendCallback;", "onSend", "addOnSend", "removeOnSend", "Lcom/bugsnag/android/Event;", "event", "Lcom/bugsnag/android/Logger;", "logger", "", "runOnErrorTasks", "Lcom/bugsnag/android/Breadcrumb;", "breadcrumb", "runOnBreadcrumbTasks", "Lcom/bugsnag/android/Session;", "session", "runOnSessionTasks", "runOnSendTasks", "Lkotlin/Function0;", "eventSource", "copy", "", "component1", "component2", "component3", "component4", "onErrorTasks", "onBreadcrumbTasks", "onSessionTasks", "onSendTasks", "", "toString", "", "hashCode", "", "other", "equals", "", "getCallbackCounts", "internalMetrics", "Lcom/bugsnag/android/internal/InternalMetrics;", "Ljava/util/Collection;", "getOnErrorTasks", "()Ljava/util/Collection;", "getOnBreadcrumbTasks", "getOnSessionTasks", "getOnSendTasks", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;)V", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class CallbackState implements CallbackAware {
    public static final Companion Companion = new Companion(null);
    private static final String onBreadcrumbName = "onBreadcrumb";
    private static final String onErrorName = "onError";
    private static final String onSendName = "onSendError";
    private static final String onSessionName = "onSession";
    private InternalMetrics internalMetrics;
    private final Collection<OnBreadcrumbCallback> onBreadcrumbTasks;
    private final Collection<OnErrorCallback> onErrorTasks;
    private final Collection<OnSendCallback> onSendTasks;
    private final Collection<OnSessionCallback> onSessionTasks;

    /* compiled from: CallbackState.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/CallbackState$Companion;", "", "()V", "onBreadcrumbName", "", "onErrorName", "onSendName", "onSessionName", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }
    }

    public CallbackState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallbackState copy$default(CallbackState callbackState, Collection collection, Collection collection2, Collection collection3, Collection collection4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            collection = callbackState.onErrorTasks;
        }
        if ((i6 & 2) != 0) {
            collection2 = callbackState.onBreadcrumbTasks;
        }
        if ((i6 & 4) != 0) {
            collection3 = callbackState.onSessionTasks;
        }
        if ((i6 & 8) != 0) {
            collection4 = callbackState.onSendTasks;
        }
        return callbackState.copy(collection, collection2, collection3, collection4);
    }

    private final Map<String, Integer> getCallbackCounts() {
        HashMap hashMap = new HashMap();
        if (this.onBreadcrumbTasks.size() > 0) {
            hashMap.put(onBreadcrumbName, Integer.valueOf(this.onBreadcrumbTasks.size()));
        }
        if (this.onErrorTasks.size() > 0) {
            hashMap.put(onErrorName, Integer.valueOf(this.onErrorTasks.size()));
        }
        if (this.onSendTasks.size() > 0) {
            hashMap.put(onSendName, Integer.valueOf(this.onSendTasks.size()));
        }
        if (this.onSessionTasks.size() > 0) {
            hashMap.put(onSessionName, Integer.valueOf(this.onSessionTasks.size()));
        }
        return hashMap;
    }

    @Override // com.bugsnag.android.CallbackAware
    public void addOnBreadcrumb(OnBreadcrumbCallback onBreadcrumb) {
        i.h(onBreadcrumb, "onBreadcrumb");
        if (this.onBreadcrumbTasks.add(onBreadcrumb)) {
            this.internalMetrics.notifyAddCallback(onBreadcrumbName);
        }
    }

    @Override // com.bugsnag.android.CallbackAware
    public void addOnError(OnErrorCallback onError) {
        i.h(onError, "onError");
        if (this.onErrorTasks.add(onError)) {
            this.internalMetrics.notifyAddCallback(onErrorName);
        }
    }

    public final void addOnSend(OnSendCallback onSend) {
        i.h(onSend, "onSend");
        if (this.onSendTasks.add(onSend)) {
            this.internalMetrics.notifyAddCallback(onSendName);
        }
    }

    @Override // com.bugsnag.android.CallbackAware
    public void addOnSession(OnSessionCallback onSession) {
        i.h(onSession, "onSession");
        if (this.onSessionTasks.add(onSession)) {
            this.internalMetrics.notifyAddCallback(onSessionName);
        }
    }

    public final Collection<OnErrorCallback> component1() {
        return this.onErrorTasks;
    }

    public final Collection<OnBreadcrumbCallback> component2() {
        return this.onBreadcrumbTasks;
    }

    public final Collection<OnSessionCallback> component3() {
        return this.onSessionTasks;
    }

    public final Collection<OnSendCallback> component4() {
        return this.onSendTasks;
    }

    public final CallbackState copy(Collection<OnErrorCallback> onErrorTasks, Collection<OnBreadcrumbCallback> onBreadcrumbTasks, Collection<OnSessionCallback> onSessionTasks, Collection<OnSendCallback> onSendTasks) {
        i.h(onErrorTasks, "onErrorTasks");
        i.h(onBreadcrumbTasks, "onBreadcrumbTasks");
        i.h(onSessionTasks, "onSessionTasks");
        i.h(onSendTasks, "onSendTasks");
        return new CallbackState(onErrorTasks, onBreadcrumbTasks, onSessionTasks, onSendTasks);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallbackState) {
                CallbackState callbackState = (CallbackState) obj;
                if (!i.b(this.onErrorTasks, callbackState.onErrorTasks) || !i.b(this.onBreadcrumbTasks, callbackState.onBreadcrumbTasks) || !i.b(this.onSessionTasks, callbackState.onSessionTasks) || !i.b(this.onSendTasks, callbackState.onSendTasks)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final Collection<OnBreadcrumbCallback> getOnBreadcrumbTasks() {
        return this.onBreadcrumbTasks;
    }

    public final Collection<OnErrorCallback> getOnErrorTasks() {
        return this.onErrorTasks;
    }

    public final Collection<OnSendCallback> getOnSendTasks() {
        return this.onSendTasks;
    }

    public final Collection<OnSessionCallback> getOnSessionTasks() {
        return this.onSessionTasks;
    }

    public int hashCode() {
        int i6;
        int i10;
        int i11;
        Collection<OnErrorCallback> collection = this.onErrorTasks;
        int i12 = 0;
        if (collection != null) {
            i6 = collection.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = i6 * 31;
        Collection<OnBreadcrumbCallback> collection2 = this.onBreadcrumbTasks;
        if (collection2 != null) {
            i10 = collection2.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        Collection<OnSessionCallback> collection3 = this.onSessionTasks;
        if (collection3 != null) {
            i11 = collection3.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        Collection<OnSendCallback> collection4 = this.onSendTasks;
        if (collection4 != null) {
            i12 = collection4.hashCode();
        }
        return i15 + i12;
    }

    @Override // com.bugsnag.android.CallbackAware
    public void removeOnBreadcrumb(OnBreadcrumbCallback onBreadcrumb) {
        i.h(onBreadcrumb, "onBreadcrumb");
        if (this.onBreadcrumbTasks.remove(onBreadcrumb)) {
            this.internalMetrics.notifyRemoveCallback(onBreadcrumbName);
        }
    }

    @Override // com.bugsnag.android.CallbackAware
    public void removeOnError(OnErrorCallback onError) {
        i.h(onError, "onError");
        if (this.onErrorTasks.remove(onError)) {
            this.internalMetrics.notifyRemoveCallback(onErrorName);
        }
    }

    public final void removeOnSend(OnSendCallback onSend) {
        i.h(onSend, "onSend");
        if (this.onSendTasks.remove(onSend)) {
            this.internalMetrics.notifyRemoveCallback(onSendName);
        }
    }

    @Override // com.bugsnag.android.CallbackAware
    public void removeOnSession(OnSessionCallback onSession) {
        i.h(onSession, "onSession");
        if (this.onSessionTasks.remove(onSession)) {
            this.internalMetrics.notifyRemoveCallback(onSessionName);
        }
    }

    public final boolean runOnBreadcrumbTasks(Breadcrumb breadcrumb, Logger logger) {
        i.h(breadcrumb, "breadcrumb");
        i.h(logger, "logger");
        if (this.onBreadcrumbTasks.isEmpty()) {
            return true;
        }
        for (OnBreadcrumbCallback onBreadcrumbCallback : this.onBreadcrumbTasks) {
            try {
            } catch (Throwable th2) {
                logger.w("OnBreadcrumbCallback threw an Exception", th2);
            }
            if (!onBreadcrumbCallback.onBreadcrumb(breadcrumb)) {
                return false;
            }
        }
        return true;
    }

    public final boolean runOnErrorTasks(Event event, Logger logger) {
        i.h(event, "event");
        i.h(logger, "logger");
        if (this.onErrorTasks.isEmpty()) {
            return true;
        }
        for (OnErrorCallback onErrorCallback : this.onErrorTasks) {
            try {
            } catch (Throwable th2) {
                logger.w("OnBreadcrumbCallback threw an Exception", th2);
            }
            if (!onErrorCallback.onError(event)) {
                return false;
            }
        }
        return true;
    }

    public final boolean runOnSendTasks(Event event, Logger logger) {
        i.h(event, "event");
        i.h(logger, "logger");
        for (OnSendCallback onSendCallback : this.onSendTasks) {
            try {
            } catch (Throwable th2) {
                logger.w("OnSendCallback threw an Exception", th2);
            }
            if (!onSendCallback.onSend(event)) {
                return false;
            }
        }
        return true;
    }

    public final boolean runOnSessionTasks(Session session, Logger logger) {
        i.h(session, "session");
        i.h(logger, "logger");
        if (this.onSessionTasks.isEmpty()) {
            return true;
        }
        for (OnSessionCallback onSessionCallback : this.onSessionTasks) {
            try {
            } catch (Throwable th2) {
                logger.w("OnSessionCallback threw an Exception", th2);
            }
            if (!onSessionCallback.onSession(session)) {
                return false;
            }
        }
        return true;
    }

    public final void setInternalMetrics(InternalMetrics metrics) {
        i.h(metrics, "metrics");
        this.internalMetrics = metrics;
        metrics.setCallbackCounts(getCallbackCounts());
    }

    public String toString() {
        return "CallbackState(onErrorTasks=" + this.onErrorTasks + ", onBreadcrumbTasks=" + this.onBreadcrumbTasks + ", onSessionTasks=" + this.onSessionTasks + ", onSendTasks=" + this.onSendTasks + ")";
    }

    public CallbackState(Collection<OnErrorCallback> onErrorTasks, Collection<OnBreadcrumbCallback> onBreadcrumbTasks, Collection<OnSessionCallback> onSessionTasks, Collection<OnSendCallback> onSendTasks) {
        i.h(onErrorTasks, "onErrorTasks");
        i.h(onBreadcrumbTasks, "onBreadcrumbTasks");
        i.h(onSessionTasks, "onSessionTasks");
        i.h(onSendTasks, "onSendTasks");
        this.onErrorTasks = onErrorTasks;
        this.onBreadcrumbTasks = onBreadcrumbTasks;
        this.onSessionTasks = onSessionTasks;
        this.onSendTasks = onSendTasks;
        this.internalMetrics = new InternalMetricsNoop();
    }

    public final CallbackState copy() {
        return copy(this.onErrorTasks, this.onBreadcrumbTasks, this.onSessionTasks, this.onSendTasks);
    }

    public /* synthetic */ CallbackState(Collection collection, Collection collection2, Collection collection3, Collection collection4, int i6, d dVar) {
        this((i6 & 1) != 0 ? new CopyOnWriteArrayList() : collection, (i6 & 2) != 0 ? new CopyOnWriteArrayList() : collection2, (i6 & 4) != 0 ? new CopyOnWriteArrayList() : collection3, (i6 & 8) != 0 ? new CopyOnWriteArrayList() : collection4);
    }

    public final boolean runOnSendTasks(a<? extends Event> eventSource, Logger logger) {
        i.h(eventSource, "eventSource");
        i.h(logger, "logger");
        if (this.onSendTasks.isEmpty()) {
            return true;
        }
        return runOnSendTasks(eventSource.invoke(), logger);
    }
}
