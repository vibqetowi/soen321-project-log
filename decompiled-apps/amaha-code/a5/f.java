package a5;

import androidx.recyclerview.widget.LinearLayoutManager;
import d5.j;
/* compiled from: SimpleTarget.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class f<Z> extends a<Z> {

    /* renamed from: v  reason: collision with root package name */
    public final int f318v = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: w  reason: collision with root package name */
    public final int f319w = LinearLayoutManager.INVALID_OFFSET;

    @Override // a5.h
    public final void e(g gVar) {
        int i6 = this.f318v;
        int i10 = this.f319w;
        if (j.f(i6, i10)) {
            gVar.a(i6, i10);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i6 + " and height: " + i10 + ", either provide dimensions in the constructor or call override()");
    }

    @Override // a5.h
    public final void j(g gVar) {
    }
}
