package a5;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.theinnerhour.b2b.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ViewTarget.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class i<T extends View, Z> extends a5.a<Z> {

    /* renamed from: v  reason: collision with root package name */
    public final T f320v;

    /* renamed from: w  reason: collision with root package name */
    public final a f321w;

    /* compiled from: ViewTarget.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static Integer f322d;

        /* renamed from: a  reason: collision with root package name */
        public final View f323a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f324b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public ViewTreeObserver$OnPreDrawListenerC0008a f325c;

        /* compiled from: ViewTarget.java */
        /* renamed from: a5.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC0008a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: u  reason: collision with root package name */
            public final WeakReference<a> f326u;

            public ViewTreeObserver$OnPreDrawListenerC0008a(a aVar) {
                this.f326u = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean z10;
                boolean z11;
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f326u.get();
                if (aVar != null) {
                    ArrayList arrayList = aVar.f324b;
                    if (!arrayList.isEmpty()) {
                        int c10 = aVar.c();
                        int b10 = aVar.b();
                        boolean z12 = false;
                        if (c10 <= 0 && c10 != Integer.MIN_VALUE) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            if (b10 <= 0 && b10 != Integer.MIN_VALUE) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (z11) {
                                z12 = true;
                            }
                        }
                        if (z12) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((g) it.next()).a(c10, b10);
                            }
                            ViewTreeObserver viewTreeObserver = aVar.f323a.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(aVar.f325c);
                            }
                            aVar.f325c = null;
                            arrayList.clear();
                        }
                    }
                }
                return true;
            }
        }

        public a(View view) {
            this.f323a = view;
        }

        public final int a(int i6, int i10, int i11) {
            int i12 = i10 - i11;
            if (i12 > 0) {
                return i12;
            }
            int i13 = i6 - i11;
            if (i13 > 0) {
                return i13;
            }
            View view = this.f323a;
            if (!view.isLayoutRequested() && i10 == -2) {
                if (Log.isLoggable("ViewTarget", 4)) {
                    Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
                }
                Context context = view.getContext();
                if (f322d == null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    kc.f.p(windowManager);
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    f322d = Integer.valueOf(Math.max(point.x, point.y));
                }
                return f322d.intValue();
            }
            return 0;
        }

        public final int b() {
            int i6;
            View view = this.f323a;
            int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                i6 = layoutParams.height;
            } else {
                i6 = 0;
            }
            return a(view.getHeight(), i6, paddingBottom);
        }

        public final int c() {
            int i6;
            View view = this.f323a;
            int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                i6 = layoutParams.width;
            } else {
                i6 = 0;
            }
            return a(view.getWidth(), i6, paddingRight);
        }
    }

    public i(T t3) {
        kc.f.p(t3);
        this.f320v = t3;
        this.f321w = new a(t3);
    }

    @Override // a5.a, a5.h
    public final void c(z4.h hVar) {
        this.f320v.setTag(R.id.glide_custom_view_target_tag, hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r5 != false) goto L10;
     */
    @Override // a5.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(g gVar) {
        boolean z10;
        boolean z11;
        a aVar = this.f321w;
        int c10 = aVar.c();
        int b10 = aVar.b();
        boolean z12 = true;
        if (c10 <= 0 && c10 != Integer.MIN_VALUE) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (b10 <= 0 && b10 != Integer.MIN_VALUE) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        z12 = false;
        if (z12) {
            gVar.a(c10, b10);
            return;
        }
        ArrayList arrayList = aVar.f324b;
        if (!arrayList.contains(gVar)) {
            arrayList.add(gVar);
        }
        if (aVar.f325c == null) {
            ViewTreeObserver viewTreeObserver = aVar.f323a.getViewTreeObserver();
            a.ViewTreeObserver$OnPreDrawListenerC0008a viewTreeObserver$OnPreDrawListenerC0008a = new a.ViewTreeObserver$OnPreDrawListenerC0008a(aVar);
            aVar.f325c = viewTreeObserver$OnPreDrawListenerC0008a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0008a);
        }
    }

    @Override // a5.h
    public final void j(g gVar) {
        this.f321w.f324b.remove(gVar);
    }

    @Override // a5.a, a5.h
    public final z4.b l() {
        Object tag = this.f320v.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof z4.b) {
                return (z4.b) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // a5.a, a5.h
    public void m(Drawable drawable) {
        a aVar = this.f321w;
        ViewTreeObserver viewTreeObserver = aVar.f323a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f325c);
        }
        aVar.f325c = null;
        aVar.f324b.clear();
    }

    public final String toString() {
        return "Target for: " + this.f320v;
    }
}
