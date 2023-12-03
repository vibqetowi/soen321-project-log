package com.bugsnag.android;

import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: ThreadType.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/bugsnag/android/ThreadType;", "", "desc", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDesc$bugsnag_android_core_release", "()Ljava/lang/String;", "EMPTY", "ANDROID", "C", "REACTNATIVEJS", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public enum ThreadType {
    EMPTY(""),
    ANDROID("android"),
    C("c"),
    REACTNATIVEJS("reactnativejs");
    
    public static final Companion Companion = new Companion(null);
    private final String desc;

    /* compiled from: ThreadType.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/ThreadType$Companion;", "", "()V", "fromDescriptor", "Lcom/bugsnag/android/ThreadType;", "desc", "", "fromDescriptor$bugsnag_android_core_release", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        public final ThreadType fromDescriptor$bugsnag_android_core_release(String desc) {
            ThreadType[] values;
            i.h(desc, "desc");
            for (ThreadType threadType : ThreadType.values()) {
                if (i.b(threadType.getDesc$bugsnag_android_core_release(), desc)) {
                    return threadType;
                }
            }
            return null;
        }
    }

    ThreadType(String str) {
        this.desc = str;
    }

    public final String getDesc$bugsnag_android_core_release() {
        return this.desc;
    }
}
