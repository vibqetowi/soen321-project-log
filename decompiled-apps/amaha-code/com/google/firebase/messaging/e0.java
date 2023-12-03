package com.google.firebase.messaging;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;
/* compiled from: TopicOperation.java */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f9701d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    public final String f9702a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9703b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9704c;

    public e0(String str, String str2) {
        String str3;
        if (str2 != null && str2.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            str3 = str2.substring(8);
        } else {
            str3 = str2;
        }
        if (str3 != null && f9701d.matcher(str3).matches()) {
            this.f9702a = str3;
            this.f9703b = str;
            this.f9704c = defpackage.d.f(str, "!", str2);
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str3, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (!this.f9702a.equals(e0Var.f9702a) || !this.f9703b.equals(e0Var.f9703b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9703b, this.f9702a});
    }
}
