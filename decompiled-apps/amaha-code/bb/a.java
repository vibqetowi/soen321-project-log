package bb;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import g.c0;
import java.util.Iterator;
import t0.q0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4218a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4219b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4220c;

    public /* synthetic */ a(Object obj, int i6, Object obj2) {
        this.f4218a = i6;
        this.f4219b = obj;
        this.f4220c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i6 = this.f4218a;
        Object obj = this.f4220c;
        Object obj2 = this.f4219b;
        switch (i6) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                yb.f fVar = (yb.f) obj;
                int i10 = AppBarLayout.S;
                appBarLayout.getClass();
                int floatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fVar.setAlpha(floatValue);
                Iterator it = appBarLayout.L.iterator();
                while (it.hasNext()) {
                    AppBarLayout.e eVar = (AppBarLayout.e) it.next();
                    ColorStateList colorStateList = fVar.f38424u.f38433c;
                    if (colorStateList != null) {
                        colorStateList.withAlpha(floatValue).getDefaultColor();
                        eVar.a();
                    }
                }
                return;
            case 1:
                AppBarLayout appBarLayout2 = (AppBarLayout) obj2;
                int i11 = AppBarLayout.S;
                appBarLayout2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((yb.f) obj).j(floatValue2);
                Drawable drawable = appBarLayout2.P;
                if (drawable instanceof yb.f) {
                    ((yb.f) drawable).j(floatValue2);
                }
                Iterator it2 = appBarLayout2.L.iterator();
                while (it2.hasNext()) {
                    ((AppBarLayout.e) it2.next()).a();
                }
                return;
            default:
                ((View) ((c0.c) ((q0) obj2)).f16041a.f16021d.getParent()).invalidate();
                return;
        }
    }
}
