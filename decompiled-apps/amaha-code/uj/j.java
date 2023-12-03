package uj;

import r1.b0;
/* compiled from: LayoutStyle.kt */
/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: b  reason: collision with root package name */
    public final String f34200b;

    public j(String str) {
        super(str);
        this.f34200b = str;
    }

    @Override // uj.n
    public final String a() {
        return this.f34200b;
    }

    @Override // uj.n
    public final String toString() {
        return b0.b(new StringBuilder("LayoutStyle(backgroundColor='"), this.f34200b, "')");
    }
}
