package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
final class OverlayListView extends ListView {

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f2503u;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final BitmapDrawable f2504a;

        /* renamed from: c  reason: collision with root package name */
        public final Rect f2506c;

        /* renamed from: d  reason: collision with root package name */
        public Interpolator f2507d;

        /* renamed from: e  reason: collision with root package name */
        public long f2508e;
        public final Rect f;

        /* renamed from: g  reason: collision with root package name */
        public int f2509g;

        /* renamed from: j  reason: collision with root package name */
        public long f2512j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2513k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f2514l;

        /* renamed from: m  reason: collision with root package name */
        public InterfaceC0032a f2515m;

        /* renamed from: b  reason: collision with root package name */
        public float f2505b = 1.0f;

        /* renamed from: h  reason: collision with root package name */
        public float f2510h = 1.0f;

        /* renamed from: i  reason: collision with root package name */
        public float f2511i = 1.0f;

        /* renamed from: androidx.mediarouter.app.OverlayListView$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0032a {
        }

        public a(BitmapDrawable bitmapDrawable, Rect rect) {
            this.f2504a = bitmapDrawable;
            this.f = rect;
            Rect rect2 = new Rect(rect);
            this.f2506c = rect2;
            if (bitmapDrawable != null) {
                bitmapDrawable.setAlpha((int) (this.f2505b * 255.0f));
                bitmapDrawable.setBounds(rect2);
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2503u = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float interpolation;
        boolean z10;
        super.onDraw(canvas);
        ArrayList arrayList = this.f2503u;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                BitmapDrawable bitmapDrawable = aVar.f2504a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                if (aVar.f2514l) {
                    z10 = false;
                } else {
                    float f = 0.0f;
                    float max = Math.max(0.0f, Math.min(1.0f, ((float) (drawingTime - aVar.f2512j)) / ((float) aVar.f2508e)));
                    if (aVar.f2513k) {
                        f = max;
                    }
                    Interpolator interpolator = aVar.f2507d;
                    if (interpolator == null) {
                        interpolation = f;
                    } else {
                        interpolation = interpolator.getInterpolation(f);
                    }
                    int i6 = (int) (aVar.f2509g * interpolation);
                    Rect rect = aVar.f;
                    Rect rect2 = aVar.f2506c;
                    rect2.top = rect.top + i6;
                    rect2.bottom = rect.bottom + i6;
                    float f2 = aVar.f2510h;
                    float e10 = defpackage.e.e(aVar.f2511i, f2, interpolation, f2);
                    aVar.f2505b = e10;
                    BitmapDrawable bitmapDrawable2 = aVar.f2504a;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (e10 * 255.0f));
                        bitmapDrawable2.setBounds(rect2);
                    }
                    if (aVar.f2513k && f >= 1.0f) {
                        aVar.f2514l = true;
                        a.InterfaceC0032a interfaceC0032a = aVar.f2515m;
                        if (interfaceC0032a != null) {
                            d dVar = (d) interfaceC0032a;
                            g gVar = dVar.f2544b;
                            gVar.f2548b0.remove(dVar.f2543a);
                            gVar.X.notifyDataSetChanged();
                        }
                    }
                    z10 = !aVar.f2514l;
                }
                if (!z10) {
                    it.remove();
                }
            }
        }
    }
}
