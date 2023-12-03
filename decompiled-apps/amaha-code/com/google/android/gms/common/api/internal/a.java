package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.c;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class a<O extends a.c> {

    /* renamed from: a  reason: collision with root package name */
    public final int f7331a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.gms.common.api.a<O> f7332b;

    /* renamed from: c  reason: collision with root package name */
    public final O f7333c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7334d;

    public a(com.google.android.gms.common.api.a<O> aVar, O o10, String str) {
        this.f7332b = aVar;
        this.f7333c = o10;
        this.f7334d = str;
        this.f7331a = Arrays.hashCode(new Object[]{aVar, o10, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!v9.m.a(this.f7332b, aVar.f7332b) || !v9.m.a(this.f7333c, aVar.f7333c) || !v9.m.a(this.f7334d, aVar.f7334d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f7331a;
    }
}
