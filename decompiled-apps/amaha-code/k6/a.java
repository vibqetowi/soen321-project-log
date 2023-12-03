package k6;

import android.view.MotionEvent;
import android.view.View;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import l6.d;
/* compiled from: FastScroller.java */
/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ FastScroller f23025u;

    public a(FastScroller fastScroller) {
        this.f23025u = fastScroller;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        int width;
        int width2;
        FastScroller fastScroller = this.f23025u;
        fastScroller.requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            fastScroller.F = false;
            if (fastScroller.H != null) {
                l6.b bVar = fastScroller.G;
                bVar.getClass();
                if (bVar.a() != null) {
                    d dVar = (d) bVar.a().f16143v;
                    dVar.a();
                    dVar.f24099b.start();
                }
            }
            return true;
        }
        if (fastScroller.H != null && motionEvent.getAction() == 0) {
            l6.b bVar2 = fastScroller.G;
            bVar2.getClass();
            if (bVar2.a() != null) {
                bVar2.a().x();
            }
        }
        fastScroller.F = true;
        if (fastScroller.c()) {
            float rawY = motionEvent.getRawY();
            View view2 = fastScroller.f6136x;
            int[] iArr = {0, (int) view2.getY()};
            ((View) view2.getParent()).getLocationInWindow(iArr);
            f = rawY - iArr[1];
            width = fastScroller.getHeight();
            width2 = fastScroller.f6136x.getHeight();
        } else {
            float rawX = motionEvent.getRawX();
            View view3 = fastScroller.f6136x;
            int[] iArr2 = {(int) view3.getX(), 0};
            ((View) view3.getParent()).getLocationInWindow(iArr2);
            f = rawX - iArr2[0];
            width = fastScroller.getWidth();
            width2 = fastScroller.f6136x.getWidth();
        }
        float f2 = f / (width - width2);
        fastScroller.setScrollerPosition(f2);
        fastScroller.setRecyclerViewPosition(f2);
        return true;
    }
}
