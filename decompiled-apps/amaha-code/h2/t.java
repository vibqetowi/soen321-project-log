package h2;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final v f17072a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f17073b;

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    public class a extends Property<View, Float> {
        public a() {
            super(Float.class, "translationAlpha");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(t.f17072a.E(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            float floatValue = f.floatValue();
            t.f17072a.F(view, floatValue);
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    public class b extends Property<View, Rect> {
        public b() {
            super(Rect.class, "clipBounds");
        }

        @Override // android.util.Property
        public final Rect get(View view) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            return d0.f.a(view);
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.f.c(view, rect);
        }
    }

    static {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            f17072a = new y();
        } else if (i6 >= 23) {
            f17072a = new x();
        } else if (i6 >= 22) {
            f17072a = new w();
        } else {
            f17072a = new v();
        }
        f17073b = new a();
        new b();
    }

    public static void a(View view, int i6, int i10, int i11, int i12) {
        f17072a.y(view, i6, i10, i11, i12);
    }
}
