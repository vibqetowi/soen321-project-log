package xj;

import android.graphics.PointF;
import android.view.View;
/* compiled from: Target.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final PointF f37836a;

    /* renamed from: b  reason: collision with root package name */
    public final zj.c f37837b;

    /* renamed from: c  reason: collision with root package name */
    public final yj.a f37838c;

    /* renamed from: d  reason: collision with root package name */
    public final View f37839d;

    /* compiled from: Target.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final PointF f37840e = new PointF(0.0f, 0.0f);
        public static final zj.a f = new zj.a(100.0f);

        /* renamed from: g  reason: collision with root package name */
        public static final yj.b f37841g = new yj.b();

        /* renamed from: a  reason: collision with root package name */
        public PointF f37842a = f37840e;

        /* renamed from: b  reason: collision with root package name */
        public zj.c f37843b = f;

        /* renamed from: c  reason: collision with root package name */
        public final yj.b f37844c = f37841g;

        /* renamed from: d  reason: collision with root package name */
        public View f37845d;

        public final j a() {
            return new j(this.f37842a, this.f37843b, this.f37844c, this.f37845d);
        }

        public final void b(View view) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            this.f37842a = new PointF((view.getWidth() / 2.0f) + iArr[0], (view.getHeight() / 2.0f) + iArr[1]);
        }
    }

    public j(PointF anchor, zj.c shape, yj.b effect, View view) {
        kotlin.jvm.internal.i.g(anchor, "anchor");
        kotlin.jvm.internal.i.g(shape, "shape");
        kotlin.jvm.internal.i.g(effect, "effect");
        this.f37836a = anchor;
        this.f37837b = shape;
        this.f37838c = effect;
        this.f37839d = view;
    }
}
