package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f8618a = new ArrayList();

    public abstract o a(String str, v.c cVar, ArrayList arrayList);

    public final void b(String str) {
        if (this.f8618a.contains(l3.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
