package m6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: TapTargetView.java */
/* loaded from: classes.dex */
public final class g implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ f A;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f24908u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f24909v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Context f24910w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f24911x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ boolean f24912y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f24913z;

    /* compiled from: TapTargetView.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int[] iArr = new int[2];
            g gVar = g.this;
            Rect rect = gVar.A.I;
            Rect rect2 = gVar.f24908u.f24863c;
            if (rect2 != null) {
                rect.set(rect2);
                f fVar = gVar.A;
                fVar.getLocationOnScreen(iArr);
                fVar.I.offset(-iArr[0], -iArr[1]);
                ViewGroup viewGroup = gVar.f24909v;
                if (viewGroup != null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    ((WindowManager) gVar.f24910w.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                    Rect rect3 = new Rect();
                    viewGroup.getWindowVisibleDisplayFrame(rect3);
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationInWindow(iArr2);
                    if (gVar.f24911x) {
                        rect3.top = iArr2[1];
                    }
                    if (gVar.f24912y) {
                        rect3.bottom = viewGroup.getHeight() + iArr2[1];
                    }
                    if (gVar.f24913z) {
                        fVar.f24887t0 = Math.max(0, rect3.top);
                        fVar.f24889u0 = Math.min(rect3.bottom, displayMetrics.heightPixels);
                    } else {
                        fVar.f24887t0 = rect3.top;
                        fVar.f24889u0 = rect3.bottom;
                    }
                }
                BitmapDrawable bitmapDrawable = fVar.H.f24864d;
                if (fVar.U && bitmapDrawable != null) {
                    if (fVar.f24891v0 == null) {
                        fVar.f24891v0 = Bitmap.createBitmap(bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(fVar.f24891v0);
                        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(fVar.L.getColor(), PorterDuff.Mode.SRC_ATOP));
                        bitmapDrawable.draw(canvas);
                        bitmapDrawable.setColorFilter(null);
                    }
                } else {
                    fVar.f24891v0 = null;
                }
                fVar.requestFocus();
                fVar.f24873f0 = fVar.getTextBounds();
                int[] outerCircleCenterPoint = fVar.getOuterCircleCenterPoint();
                fVar.f24877j0 = outerCircleCenterPoint;
                int i6 = outerCircleCenterPoint[0];
                int i10 = outerCircleCenterPoint[1];
                Rect rect4 = fVar.f24873f0;
                Rect rect5 = fVar.I;
                int centerX = rect5.centerX();
                int centerY = rect5.centerY();
                Rect rect6 = new Rect(centerX, centerY, centerX, centerY);
                int i11 = -((int) (fVar.f24896y * 1.1f));
                rect6.inset(i11, i11);
                fVar.f24876i0 = Math.max(f.d(rect4, i6, i10), f.d(rect6, i6, i10)) + fVar.E;
                if (!fVar.W) {
                    fVar.f24892w = false;
                    fVar.f24897y0.start();
                    fVar.W = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Requesting bounds that are not set! Make sure your target is ready");
        }
    }

    public g(f fVar, j jVar, ViewGroup viewGroup, Context context, boolean z10, boolean z11, boolean z12) {
        this.A = fVar;
        this.f24908u = jVar;
        this.f24909v = viewGroup;
        this.f24910w = context;
        this.f24911x = z10;
        this.f24912y = z11;
        this.f24913z = z12;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z10;
        f fVar = this.A;
        if (fVar.f24890v) {
            return;
        }
        int min = Math.min(fVar.getWidth(), fVar.C) - (fVar.A * 2);
        if (min > 0) {
            fVar.P = new StaticLayout(fVar.O, fVar.J, min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (fVar.Q != null) {
                fVar.R = new StaticLayout(fVar.Q, fVar.K, min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                fVar.R = null;
            }
        }
        a aVar = new a();
        j jVar = (j) this.f24908u;
        jVar.getClass();
        i iVar = new i(jVar, aVar);
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        View view = jVar.f24917i;
        if (d0.g.c(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            iVar.run();
            return;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new k(viewTreeObserver, view, iVar));
    }
}
