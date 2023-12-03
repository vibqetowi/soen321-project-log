package com.bugsnag.android;

import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: BreadcrumbType.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/BreadcrumbType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "ERROR", "LOG", "MANUAL", "NAVIGATION", "PROCESS", "REQUEST", "STATE", "USER", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public enum BreadcrumbType {
    ERROR("error"),
    LOG("log"),
    MANUAL("manual"),
    NAVIGATION("navigation"),
    PROCESS("process"),
    REQUEST("request"),
    STATE("state"),
    USER("user");
    
    public static final Companion Companion = new Companion(null);
    private final String type;

    /* compiled from: BreadcrumbType.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/BreadcrumbType$Companion;", "", "()V", "fromDescriptor", "Lcom/bugsnag/android/BreadcrumbType;", "type", "", "fromDescriptor$bugsnag_android_core_release", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        public final BreadcrumbType fromDescriptor$bugsnag_android_core_release(String type) {
            BreadcrumbType[] values;
            i.h(type, "type");
            BreadcrumbType breadcrumbType = null;
            boolean z10 = false;
            for (BreadcrumbType breadcrumbType2 : BreadcrumbType.values()) {
                if (i.b(breadcrumbType2.type, type)) {
                    if (z10) {
                        return null;
                    }
                    z10 = true;
                    breadcrumbType = breadcrumbType2;
                }
            }
            if (!z10) {
                return null;
            }
            return breadcrumbType;
        }
    }

    BreadcrumbType(String str) {
        this.type = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }
}
