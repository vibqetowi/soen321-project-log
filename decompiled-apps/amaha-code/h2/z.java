package h2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import com.theinnerhour.b2b.R;
/* compiled from: Visibility.java */
/* loaded from: classes.dex */
public final class z extends n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f17074a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f17075b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f17076c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a0 f17077d;

    public z(a0 a0Var, ViewGroup viewGroup, View view, View view2) {
        this.f17077d = a0Var;
        this.f17074a = viewGroup;
        this.f17075b = view;
        this.f17076c = view2;
    }

    @Override // h2.n, h2.k.d
    public final void b() {
        ((ViewGroupOverlay) new g.x(this.f17074a).f16143v).remove(this.f17075b);
    }

    @Override // h2.k.d
    public final void c(k kVar) {
        this.f17076c.setTag(R.id.save_overlay_view, null);
        ((ViewGroupOverlay) new g.x(this.f17074a).f16143v).remove(this.f17075b);
        kVar.y(this);
    }

    @Override // h2.n, h2.k.d
    public final void e() {
        View view = this.f17075b;
        if (view.getParent() == null) {
            ((ViewGroupOverlay) new g.x(this.f17074a).f16143v).add(view);
        } else {
            this.f17077d.cancel();
        }
    }
}
