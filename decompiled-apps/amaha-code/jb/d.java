package jb;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
/* compiled from: CircularRevealWidget.java */
/* loaded from: classes.dex */
public interface d {

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<C0325d> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f21773b = new a();

        /* renamed from: a  reason: collision with root package name */
        public final C0325d f21774a = new C0325d();

        @Override // android.animation.TypeEvaluator
        public final C0325d evaluate(float f, C0325d c0325d, C0325d c0325d2) {
            C0325d c0325d3 = c0325d;
            C0325d c0325d4 = c0325d2;
            float f2 = c0325d3.f21777a;
            float f10 = 1.0f - f;
            float f11 = (c0325d4.f21777a * f) + (f2 * f10);
            float f12 = c0325d3.f21778b;
            float f13 = c0325d4.f21778b * f;
            float f14 = c0325d3.f21779c;
            float f15 = f * c0325d4.f21779c;
            C0325d c0325d5 = this.f21774a;
            c0325d5.f21777a = f11;
            c0325d5.f21778b = f13 + (f12 * f10);
            c0325d5.f21779c = f15 + (f10 * f14);
            return c0325d5;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes.dex */
    public static class b extends Property<d, C0325d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f21775a = new b();

        public b() {
            super(C0325d.class, "circularReveal");
        }

        @Override // android.util.Property
        public final C0325d get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(d dVar, C0325d c0325d) {
            dVar.setRevealInfo(c0325d);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes.dex */
    public static class c extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f21776a = new c();

        public c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        @Override // android.util.Property
        public final Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: jb.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0325d {

        /* renamed from: a  reason: collision with root package name */
        public float f21777a;

        /* renamed from: b  reason: collision with root package name */
        public float f21778b;

        /* renamed from: c  reason: collision with root package name */
        public float f21779c;

        public C0325d() {
        }

        public C0325d(float f, float f2, float f10) {
            this.f21777a = f;
            this.f21778b = f2;
            this.f21779c = f10;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    C0325d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i6);

    void setRevealInfo(C0325d c0325d);
}
