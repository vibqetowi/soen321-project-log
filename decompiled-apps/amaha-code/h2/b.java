package h2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.theinnerhour.b2b.utils.Constants;
import java.util.HashMap;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: ChangeBounds.java */
/* loaded from: classes.dex */
public final class b extends k {
    public static final String[] R = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final C0269b S;
    public static final c T;
    public static final d U;
    public static final e V;
    public static final f W;

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class a extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f17019a;

        public a() {
            super(PointF.class, "boundsOrigin");
            this.f17019a = new Rect();
        }

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            Rect rect = this.f17019a;
            drawable.copyBounds(rect);
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            Rect rect = this.f17019a;
            drawable2.copyBounds(rect);
            rect.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(rect);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: h2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0269b extends Property<i, PointF> {
        public C0269b() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.f17022a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f17023b = round;
            int i6 = iVar2.f + 1;
            iVar2.f = i6;
            if (i6 == iVar2.f17027g) {
                t.a(iVar2.f17026e, iVar2.f17022a, round, iVar2.f17024c, iVar2.f17025d);
                iVar2.f = 0;
                iVar2.f17027g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class c extends Property<i, PointF> {
        public c() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.f17024c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f17025d = round;
            int i6 = iVar2.f17027g + 1;
            iVar2.f17027g = i6;
            if (iVar2.f == i6) {
                t.a(iVar2.f17026e, iVar2.f17022a, iVar2.f17023b, iVar2.f17024c, round);
                iVar2.f = 0;
                iVar2.f17027g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class d extends Property<View, PointF> {
        public d() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            t.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class e extends Property<View, PointF> {
        public e() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            t.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class f extends Property<View, PointF> {
        public f() {
            super(PointF.class, Constants.DAYMODEL_POSITION);
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            t.a(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class h extends n {

        /* renamed from: a  reason: collision with root package name */
        public boolean f17020a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f17021b;

        public h(ViewGroup viewGroup) {
            this.f17021b = viewGroup;
        }

        @Override // h2.n, h2.k.d
        public final void b() {
            s.a(this.f17021b, false);
        }

        @Override // h2.k.d
        public final void c(k kVar) {
            if (!this.f17020a) {
                s.a(this.f17021b, false);
            }
            kVar.y(this);
        }

        @Override // h2.n, h2.k.d
        public final void d() {
            s.a(this.f17021b, false);
            this.f17020a = true;
        }

        @Override // h2.n, h2.k.d
        public final void e() {
            s.a(this.f17021b, true);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f17022a;

        /* renamed from: b  reason: collision with root package name */
        public int f17023b;

        /* renamed from: c  reason: collision with root package name */
        public int f17024c;

        /* renamed from: d  reason: collision with root package name */
        public int f17025d;

        /* renamed from: e  reason: collision with root package name */
        public final View f17026e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public int f17027g;

        public i(View view) {
            this.f17026e = view;
        }
    }

    static {
        new a();
        S = new C0269b();
        T = new c();
        U = new d();
        V = new e();
        W = new f();
    }

    public final void L(r rVar) {
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        View view = rVar.f17069b;
        if (d0.g.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = rVar.f17068a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", view.getParent());
        }
    }

    @Override // h2.k
    public final void d(r rVar) {
        L(rVar);
    }

    @Override // h2.k
    public final void h(r rVar) {
        L(rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h2.k
    public final Animator l(ViewGroup viewGroup, r rVar, r rVar2) {
        int i6;
        b bVar;
        ObjectAnimator ofObject;
        if (rVar != null && rVar2 != null) {
            HashMap hashMap = rVar.f17068a;
            HashMap hashMap2 = rVar2.f17068a;
            ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                int i10 = rect.left;
                int i11 = rect2.left;
                int i12 = rect.top;
                int i13 = rect2.top;
                int i14 = rect.right;
                int i15 = rect2.right;
                int i16 = rect.bottom;
                int i17 = rect2.bottom;
                int i18 = i14 - i10;
                int i19 = i16 - i12;
                int i20 = i15 - i11;
                int i21 = i17 - i13;
                Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                if ((i18 != 0 && i19 != 0) || (i20 != 0 && i21 != 0)) {
                    if (i10 == i11 && i12 == i13) {
                        i6 = 0;
                    } else {
                        i6 = 1;
                    }
                    if (i14 != i15 || i16 != i17) {
                        i6++;
                    }
                } else {
                    i6 = 0;
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i6++;
                }
                int i22 = i6;
                if (i22 > 0) {
                    View view = rVar2.f17069b;
                    t.a(view, i10, i12, i14, i16);
                    if (i22 == 2) {
                        if (i18 == i20 && i19 == i21) {
                            bVar = this;
                            ofObject = ObjectAnimator.ofObject(view, W, (TypeConverter) null, bVar.N.h(i10, i12, i11, i13));
                        } else {
                            bVar = this;
                            i iVar = new i(view);
                            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(iVar, S, (TypeConverter) null, bVar.N.h(i10, i12, i11, i13));
                            ObjectAnimator ofObject3 = ObjectAnimator.ofObject(iVar, T, (TypeConverter) null, bVar.N.h(i14, i16, i15, i17));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(ofObject2, ofObject3);
                            animatorSet.addListener(new g(iVar));
                            ofObject = animatorSet;
                        }
                    } else {
                        bVar = this;
                        if (i10 == i11 && i12 == i13) {
                            ofObject = ObjectAnimator.ofObject(view, U, (TypeConverter) null, bVar.N.h(i14, i16, i15, i17));
                        } else {
                            ofObject = ObjectAnimator.ofObject(view, V, (TypeConverter) null, bVar.N.h(i10, i12, i11, i13));
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        s.a(viewGroup4, true);
                        bVar.a(new h(viewGroup4));
                    }
                    return ofObject;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // h2.k
    public final String[] r() {
        return R;
    }
}
