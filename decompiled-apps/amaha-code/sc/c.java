package sc;

import android.content.Context;
import hd.p;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements re.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f31426a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f31427b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f31428c;

    public /* synthetic */ c(Object obj, int i6, Object obj2) {
        this.f31426a = i6;
        this.f31427b = obj;
        this.f31428c = obj2;
    }

    @Override // re.b
    public final Object get() {
        int i6 = this.f31426a;
        Object obj = this.f31428c;
        Object obj2 = this.f31427b;
        switch (i6) {
            case 0:
                e eVar = (e) obj2;
                return new we.a((Context) obj, eVar.g(), (ee.c) eVar.f31435d.a(ee.c.class));
            default:
                hd.h hVar = (hd.h) obj2;
                hd.b bVar = (hd.b) obj;
                hVar.getClass();
                return bVar.f.e(new p(bVar, hVar));
        }
    }
}
