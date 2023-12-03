package qv;

import java.util.regex.Pattern;
import lv.e0;
import lv.v;
import zv.t;
/* compiled from: RealResponseBody.kt */
/* loaded from: classes2.dex */
public final class g extends e0 {

    /* renamed from: v  reason: collision with root package name */
    public final String f30154v;

    /* renamed from: w  reason: collision with root package name */
    public final long f30155w;

    /* renamed from: x  reason: collision with root package name */
    public final zv.h f30156x;

    public g(String str, long j10, t tVar) {
        this.f30154v = str;
        this.f30155w = j10;
        this.f30156x = tVar;
    }

    @Override // lv.e0
    public final long a() {
        return this.f30155w;
    }

    @Override // lv.e0
    public final v e() {
        String str = this.f30154v;
        if (str == null) {
            return null;
        }
        Pattern pattern = v.f24702d;
        return v.a.b(str);
    }

    @Override // lv.e0
    public final zv.h g() {
        return this.f30156x;
    }
}
