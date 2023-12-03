package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.b8  reason: invalid package */
/* loaded from: classes.dex */
public final class b8 {

    /* renamed from: b  reason: collision with root package name */
    public static final b8 f7729b = new b8(Collections.unmodifiableMap(new HashMap()));

    /* renamed from: a  reason: collision with root package name */
    public final Map f7730a;

    public /* synthetic */ b8(Map map) {
        this.f7730a = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b8)) {
            return false;
        }
        return this.f7730a.equals(((b8) obj).f7730a);
    }

    public final int hashCode() {
        return this.f7730a.hashCode();
    }

    public final String toString() {
        return this.f7730a.toString();
    }
}
