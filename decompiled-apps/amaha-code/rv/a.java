package rv;

import lv.s;
import zv.h;
/* compiled from: HeadersReader.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final h f31029a;

    /* renamed from: b  reason: collision with root package name */
    public long f31030b = 262144;

    public a(h hVar) {
        this.f31029a = hVar;
    }

    public final s a() {
        boolean z10;
        s.a aVar = new s.a();
        while (true) {
            String L = this.f31029a.L(this.f31030b);
            this.f31030b -= L.length();
            if (L.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return aVar.d();
            }
            aVar.b(L);
        }
    }
}
