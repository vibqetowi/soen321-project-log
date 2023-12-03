package com.bugsnag.android;

import kotlin.jvm.internal.i;
/* compiled from: LastRunInfoStore.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/bugsnag/android/KeyValueWriter;", "", "", "key", "value", "Lhs/k;", "add", "toString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "Ljava/lang/StringBuilder;", "<init>", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
final class KeyValueWriter {

    /* renamed from: sb  reason: collision with root package name */
    private final StringBuilder f5916sb = new StringBuilder();

    public final void add(String key, Object value) {
        i.h(key, "key");
        i.h(value, "value");
        StringBuilder sb2 = this.f5916sb;
        sb2.append(key + '=' + value);
        this.f5916sb.append("\n");
    }

    public String toString() {
        String sb2 = this.f5916sb.toString();
        i.c(sb2, "sb.toString()");
        return sb2;
    }
}
