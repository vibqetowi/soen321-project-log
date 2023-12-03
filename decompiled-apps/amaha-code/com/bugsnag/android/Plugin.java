package com.bugsnag.android;

import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: Plugin.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/bugsnag/android/Plugin;", "", "Lcom/bugsnag/android/Client;", SessionManager.KEY_CLIENT, "Lhs/k;", "load", "unload", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public interface Plugin {
    void load(Client client);

    void unload();
}
