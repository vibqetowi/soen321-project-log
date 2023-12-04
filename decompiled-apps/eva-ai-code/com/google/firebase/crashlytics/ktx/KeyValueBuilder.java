package com.google.firebase.crashlytics.ktx;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: KeyValueBuilder.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nJ\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bJ\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\fJ\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\rJ\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/google/firebase/crashlytics/ktx/KeyValueBuilder;", "", "crashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)V", "key", "", "", "value", "", "", "", "", "", "com.google.firebase-firebase-crashlytics-ktx"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class KeyValueBuilder {
    private final FirebaseCrashlytics crashlytics;

    public KeyValueBuilder(FirebaseCrashlytics crashlytics) {
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.crashlytics = crashlytics;
    }

    public final void key(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, z);
    }

    public final void key(String key, double d) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, d);
    }

    public final void key(String key, float f) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, f);
    }

    public final void key(String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, i);
    }

    public final void key(String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, j);
    }

    public final void key(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.crashlytics.setCustomKey(key, value);
    }
}
