package h2;

import java.util.ArrayList;
/* compiled from: FragmentTransitionSupport.java */
/* loaded from: classes.dex */
public final class g extends n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f17034a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f17035b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f17036c = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f17037d = null;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f17038e;
    public final /* synthetic */ ArrayList f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f17039g;

    public g(f fVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f17039g = fVar;
        this.f17034a = obj;
        this.f17035b = arrayList;
        this.f17038e = obj2;
        this.f = arrayList2;
    }

    @Override // h2.n, h2.k.d
    public final void a(k kVar) {
        f fVar = this.f17039g;
        Object obj = this.f17034a;
        if (obj != null) {
            fVar.s(obj, this.f17035b, null);
        }
        Object obj2 = this.f17036c;
        if (obj2 != null) {
            fVar.s(obj2, this.f17037d, null);
        }
        Object obj3 = this.f17038e;
        if (obj3 != null) {
            fVar.s(obj3, this.f, null);
        }
    }

    @Override // h2.k.d
    public final void c(k kVar) {
        kVar.y(this);
    }
}
