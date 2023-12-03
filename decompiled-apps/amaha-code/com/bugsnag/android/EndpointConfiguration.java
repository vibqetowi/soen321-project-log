package com.bugsnag.android;

import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: EndpointConfiguration.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bugsnag/android/EndpointConfiguration;", "", "notify", "", "sessions", "(Ljava/lang/String;Ljava/lang/String;)V", "getNotify", "()Ljava/lang/String;", "getSessions", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class EndpointConfiguration {
    private final String notify;
    private final String sessions;

    public EndpointConfiguration() {
        this(null, null, 3, null);
    }

    public final String getNotify() {
        return this.notify;
    }

    public final String getSessions() {
        return this.sessions;
    }

    public EndpointConfiguration(String notify, String sessions) {
        i.h(notify, "notify");
        i.h(sessions, "sessions");
        this.notify = notify;
        this.sessions = sessions;
    }

    public /* synthetic */ EndpointConfiguration(String str, String str2, int i6, d dVar) {
        this((i6 & 1) != 0 ? "https://notify.bugsnag.com" : str, (i6 & 2) != 0 ? "https://sessions.bugsnag.com" : str2);
    }
}
