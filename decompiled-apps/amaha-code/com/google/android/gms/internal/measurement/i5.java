package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class i5 {

    /* renamed from: b  reason: collision with root package name */
    public static volatile i5 f8424b;

    /* renamed from: c  reason: collision with root package name */
    public static final i5 f8425c = new i5(0);

    /* renamed from: a  reason: collision with root package name */
    public final Map f8426a;

    public i5() {
        this.f8426a = new HashMap();
    }

    public final v5 a(v6 v6Var, int i6) {
        return (v5) this.f8426a.get(new h5(i6, v6Var));
    }

    public i5(int i6) {
        this.f8426a = Collections.emptyMap();
    }
}
