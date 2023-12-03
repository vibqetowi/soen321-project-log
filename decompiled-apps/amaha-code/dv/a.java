package dv;

import dv.b;
import ss.l;
/* compiled from: DFS.java */
/* loaded from: classes2.dex */
public final class a extends b.a<Object, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f13503a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean[] f13504b;

    public a(l lVar, boolean[] zArr) {
        this.f13503a = lVar;
        this.f13504b = zArr;
    }

    @Override // dv.b.c
    public final Object a() {
        return Boolean.valueOf(this.f13504b[0]);
    }

    @Override // dv.b.c
    public final boolean c(Object obj) {
        boolean booleanValue = ((Boolean) this.f13503a.invoke(obj)).booleanValue();
        boolean[] zArr = this.f13504b;
        if (booleanValue) {
            zArr[0] = true;
        }
        return !zArr[0];
    }
}
