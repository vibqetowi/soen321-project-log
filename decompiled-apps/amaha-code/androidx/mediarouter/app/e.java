package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import androidx.mediarouter.app.g;
import java.util.HashSet;
/* compiled from: MediaRouteControllerDialog.java */
/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f2545u;

    public e(g gVar) {
        this.f2545u = gVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        g gVar = this.f2545u;
        gVar.W.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = gVar.Z;
        if (hashSet != null && hashSet.size() != 0) {
            f fVar = new f(gVar);
            int firstVisiblePosition = gVar.W.getFirstVisiblePosition();
            boolean z10 = false;
            for (int i6 = 0; i6 < gVar.W.getChildCount(); i6++) {
                View childAt = gVar.W.getChildAt(i6);
                g.l lVar = gVar.X;
                if (gVar.Z.contains(lVar.getItem(firstVisiblePosition + i6))) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(gVar.A0);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    if (!z10) {
                        alphaAnimation.setAnimationListener(fVar);
                        z10 = true;
                    }
                    childAt.clearAnimation();
                    childAt.startAnimation(alphaAnimation);
                }
            }
            return;
        }
        gVar.i(true);
    }
}
