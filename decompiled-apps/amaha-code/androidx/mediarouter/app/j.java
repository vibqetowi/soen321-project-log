package androidx.mediarouter.app;

import android.view.animation.Animation;
import androidx.mediarouter.app.OverlayListView;
import java.util.Iterator;
/* compiled from: MediaRouteControllerDialog.java */
/* loaded from: classes.dex */
public final class j implements Animation.AnimationListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f2597u;

    public j(g gVar) {
        this.f2597u = gVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        g gVar = this.f2597u;
        OverlayListView overlayListView = gVar.W;
        Iterator it = overlayListView.f2503u.iterator();
        while (it.hasNext()) {
            OverlayListView.a aVar = (OverlayListView.a) it.next();
            if (!aVar.f2513k) {
                aVar.f2512j = overlayListView.getDrawingTime();
                aVar.f2513k = true;
            }
        }
        gVar.W.postDelayed(gVar.G0, gVar.f2571z0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
