package com.bugsnag.android;

import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: ErrorType.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/bugsnag/android/ErrorType;", "", "desc", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDesc$bugsnag_android_core_release", "()Ljava/lang/String;", "ANDROID", "REACTNATIVEJS", "C", "DART", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public enum ErrorType {
    ANDROID("android"),
    REACTNATIVEJS("reactnativejs"),
    C("c"),
    DART("dart");
    
    public static final Companion Companion = new Companion(null);
    private final String desc;

    /* compiled from: ErrorType.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/bugsnag/android/ErrorType$Companion;", "", "()V", "fromDescriptor", "Lcom/bugsnag/android/ErrorType;", "desc", "", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        public final ErrorType fromDescriptor(String desc) {
            ErrorType[] values;
            i.h(desc, "desc");
            for (ErrorType errorType : ErrorType.values()) {
                if (i.b(errorType.getDesc$bugsnag_android_core_release(), desc)) {
                    return errorType;
                }
            }
            return null;
        }
    }

    ErrorType(String str) {
        this.desc = str;
    }

    public static final ErrorType fromDescriptor(String str) {
        return Companion.fromDescriptor(str);
    }

    public final String getDesc$bugsnag_android_core_release() {
        return this.desc;
    }
}
