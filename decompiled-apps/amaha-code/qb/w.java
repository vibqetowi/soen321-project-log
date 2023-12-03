package qb;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
import t0.s0;
/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public final class w {

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    public class a implements t0.t {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ b f29513u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ c f29514v;

        public a(b bVar, c cVar) {
            this.f29513u = bVar;
            this.f29514v = cVar;
        }

        @Override // t0.t
        public final s0 i(View view, s0 s0Var) {
            return this.f29513u.a(view, s0Var, new c(this.f29514v));
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    public interface b {
        s0 a(View view, s0 s0Var, c cVar);
    }

    public static void a(View view, b bVar) {
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.i.u(view, new a(bVar, new c(d0.e.f(view), view.getPaddingTop(), d0.e.e(view), view.getPaddingBottom())));
        if (d0.g.b(view)) {
            d0.h.c(view);
        } else {
            view.addOnAttachStateChangeListener(new x());
        }
    }

    public static float b(int i6, Context context) {
        return TypedValue.applyDimension(1, i6, context.getResources().getDisplayMetrics());
    }

    public static boolean c(View view) {
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        if (d0.e.d(view) == 1) {
            return true;
        }
        return false;
    }

    public static PorterDuff.Mode d(int i6, PorterDuff.Mode mode) {
        if (i6 != 3) {
            if (i6 != 5) {
                if (i6 != 9) {
                    switch (i6) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f29515a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29516b;

        /* renamed from: c  reason: collision with root package name */
        public int f29517c;

        /* renamed from: d  reason: collision with root package name */
        public int f29518d;

        public c(int i6, int i10, int i11, int i12) {
            this.f29515a = i6;
            this.f29516b = i10;
            this.f29517c = i11;
            this.f29518d = i12;
        }

        public c(c cVar) {
            this.f29515a = cVar.f29515a;
            this.f29516b = cVar.f29516b;
            this.f29517c = cVar.f29517c;
            this.f29518d = cVar.f29518d;
        }
    }
}
