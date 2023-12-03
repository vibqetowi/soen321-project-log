package qb;

import android.view.View;
import qb.j;
import u0.h;
/* compiled from: NavigationMenuPresenter.java */
/* loaded from: classes.dex */
public final class k extends t0.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f29474d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f29475e;
    public final /* synthetic */ j.c f;

    public k(j.c cVar, int i6, boolean z10) {
        this.f = cVar;
        this.f29474d = i6;
        this.f29475e = z10;
    }

    @Override // t0.a
    public final void d(View view, u0.h hVar) {
        j jVar;
        this.f32269a.onInitializeAccessibilityNodeInfo(view, hVar.f33731a);
        int i6 = this.f29474d;
        int i10 = 0;
        int i11 = i6;
        while (true) {
            jVar = j.this;
            if (i10 >= i6) {
                break;
            }
            if (jVar.f29464y.h(i10) == 2) {
                i11--;
            }
            i10++;
        }
        if (jVar.f29461v.getChildCount() == 0) {
            i11--;
        }
        hVar.h(h.c.a(i11, 1, 1, 1, this.f29475e, view.isSelected()));
    }
}
