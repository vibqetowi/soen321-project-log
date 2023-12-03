package com.bugsnag.android;

import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: UserAware.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J&\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H&¨\u0006\n"}, d2 = {"Lcom/bugsnag/android/UserAware;", "", "Lcom/bugsnag/android/User;", "getUser", "", "id", SessionManager.KEY_EMAIL, SessionManager.KEY_NAME, "Lhs/k;", "setUser", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public interface UserAware {
    User getUser();

    void setUser(String str, String str2, String str3);
}
