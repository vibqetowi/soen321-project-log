package com.bugsnag.android;

import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: ThreadSendPolicy.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/bugsnag/android/ThreadSendPolicy;", "", "(Ljava/lang/String;I)V", "ALWAYS", "UNHANDLED_ONLY", "NEVER", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public enum ThreadSendPolicy {
    ALWAYS,
    UNHANDLED_ONLY,
    NEVER;
    
    public static final Companion Companion = new Companion(null);

    /* compiled from: ThreadSendPolicy.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bugsnag/android/ThreadSendPolicy$Companion;", "", "()V", "fromString", "Lcom/bugsnag/android/ThreadSendPolicy;", "str", "", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        public final ThreadSendPolicy fromString(String str) {
            ThreadSendPolicy threadSendPolicy;
            i.h(str, "str");
            ThreadSendPolicy[] values = ThreadSendPolicy.values();
            int length = values.length;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    threadSendPolicy = values[i6];
                    if (i.b(threadSendPolicy.name(), str)) {
                        break;
                    }
                    i6++;
                } else {
                    threadSendPolicy = null;
                    break;
                }
            }
            if (threadSendPolicy == null) {
                return ThreadSendPolicy.ALWAYS;
            }
            return threadSendPolicy;
        }
    }
}
