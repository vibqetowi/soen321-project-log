package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import androidx.mediarouter.app.OverlayListView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import r1.l;
/* compiled from: MediaRouteControllerDialog.java */
/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Map f2594u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Map f2595v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ g f2596w;

    public i(g gVar, HashMap hashMap, HashMap hashMap2) {
        this.f2596w = gVar;
        this.f2594u = hashMap;
        this.f2595v = hashMap2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Map map;
        Map map2;
        OverlayListView.a aVar;
        int i6;
        Map map3;
        g gVar = this.f2596w;
        gVar.W.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = gVar.Z;
        if (hashSet != null && gVar.f2547a0 != null) {
            int size = hashSet.size() - gVar.f2547a0.size();
            j jVar = new j(gVar);
            int firstVisiblePosition = gVar.W.getFirstVisiblePosition();
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                int childCount = gVar.W.getChildCount();
                map = this.f2594u;
                map2 = this.f2595v;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = gVar.W.getChildAt(i10);
                l.g item = gVar.X.getItem(firstVisiblePosition + i10);
                Rect rect = (Rect) map.get(item);
                int top = childAt.getTop();
                if (rect != null) {
                    i6 = rect.top;
                } else {
                    i6 = (gVar.f2551g0 * size) + top;
                }
                AnimationSet animationSet = new AnimationSet(true);
                HashSet hashSet2 = gVar.Z;
                if (hashSet2 != null && hashSet2.contains(item)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    map3 = map;
                    alphaAnimation.setDuration(gVar.A0);
                    animationSet.addAnimation(alphaAnimation);
                    i6 = top;
                } else {
                    map3 = map;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i6 - top, 0.0f);
                translateAnimation.setDuration(gVar.f2571z0);
                animationSet.addAnimation(translateAnimation);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                animationSet.setInterpolator(gVar.C0);
                if (!z10) {
                    animationSet.setAnimationListener(jVar);
                    z10 = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
                map3.remove(item);
                map2.remove(item);
                i10++;
            }
            for (Map.Entry entry : map2.entrySet()) {
                l.g gVar2 = (l.g) entry.getKey();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
                Rect rect2 = (Rect) map.get(gVar2);
                if (gVar.f2547a0.contains(gVar2)) {
                    aVar = new OverlayListView.a(bitmapDrawable, rect2);
                    aVar.f2510h = 1.0f;
                    aVar.f2511i = 0.0f;
                    aVar.f2508e = gVar.B0;
                    aVar.f2507d = gVar.C0;
                } else {
                    OverlayListView.a aVar2 = new OverlayListView.a(bitmapDrawable, rect2);
                    aVar2.f2509g = gVar.f2551g0 * size;
                    aVar2.f2508e = gVar.f2571z0;
                    aVar2.f2507d = gVar.C0;
                    aVar2.f2515m = new d(gVar, gVar2);
                    gVar.f2548b0.add(gVar2);
                    aVar = aVar2;
                }
                gVar.W.f2503u.add(aVar);
            }
        }
    }
}
