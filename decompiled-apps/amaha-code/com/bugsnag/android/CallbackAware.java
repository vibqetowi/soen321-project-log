package com.bugsnag.android;
/* compiled from: CallbackAware.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/CallbackAware;", "", "Lcom/bugsnag/android/OnErrorCallback;", "onError", "Lhs/k;", "addOnError", "removeOnError", "Lcom/bugsnag/android/OnBreadcrumbCallback;", "onBreadcrumb", "addOnBreadcrumb", "removeOnBreadcrumb", "Lcom/bugsnag/android/OnSessionCallback;", "onSession", "addOnSession", "removeOnSession", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public interface CallbackAware {
    void addOnBreadcrumb(OnBreadcrumbCallback onBreadcrumbCallback);

    void addOnError(OnErrorCallback onErrorCallback);

    void addOnSession(OnSessionCallback onSessionCallback);

    void removeOnBreadcrumb(OnBreadcrumbCallback onBreadcrumbCallback);

    void removeOnError(OnErrorCallback onErrorCallback);

    void removeOnSession(OnSessionCallback onSessionCallback);
}
