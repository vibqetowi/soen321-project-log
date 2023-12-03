package ni;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import mi.i1;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnKeyListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26320u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a f26321v;

    public /* synthetic */ b(a aVar, int i6) {
        this.f26320u = i6;
        this.f26321v = aVar;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i6, KeyEvent keyEvent) {
        int i10;
        int i11 = this.f26320u;
        a aVar = this.f26321v;
        switch (i11) {
            case 0:
                n this$0 = (n) aVar;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ih.p pVar = this$0.f26340c;
                try {
                    hh.g.b(pVar.f20105d, 0, new i(this$0, i6, keyEvent), 3);
                    if (keyEvent.getAction() != 0 || i6 != 4) {
                        return false;
                    }
                    hh.g.b(pVar.f20105d, 0, new j(this$0), 3);
                    RelativeLayout relativeLayout = this$0.f;
                    if (relativeLayout != null) {
                        new mi.a(this$0.f26318a, pVar).K(relativeLayout, this$0.f26341d, new qi.e(1));
                    }
                    return true;
                } catch (Exception e10) {
                    pVar.f20105d.a(1, e10, new k(this$0));
                    return false;
                }
            default:
                x xVar = (x) aVar;
                pi.m mVar = xVar.f26363c;
                ih.p pVar2 = xVar.f26372m;
                try {
                    if (keyEvent.getAction() != 0 || i6 != 4) {
                        return false;
                    }
                    pVar2.f20105d.a(5, null, new r(1));
                    pi.a aVar2 = ((ui.c) mVar.f28500o.f28480c).f34169h;
                    if (aVar2 != null && (i10 = aVar2.f28442b) != -1) {
                        Animation loadAnimation = AnimationUtils.loadAnimation(xVar.f26364d, i10);
                        loadAnimation.setFillAfter(true);
                        view.setAnimation(loadAnimation);
                    }
                    ((ViewGroup) view.getParent()).removeView(view);
                    xVar.f26373n.getClass();
                    i1.f25206a.getClass();
                    i1.b(pVar2).f25200d.d(mVar);
                    return true;
                } catch (Exception e11) {
                    pVar2.f20105d.a(1, e11, new r(2));
                    return false;
                }
        }
    }
}
