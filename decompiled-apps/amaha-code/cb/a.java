package cb;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import cb.b;
import com.theinnerhour.b2b.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import qb.q;
import qb.t;
import t0.d0;
import t0.o0;
import ub.e;
import yb.f;
/* compiled from: BadgeDrawable.java */
/* loaded from: classes.dex */
public final class a extends Drawable implements q.b {
    public float A;
    public int B;
    public float C;
    public float D;
    public float E;
    public WeakReference<View> F;
    public WeakReference<FrameLayout> G;

    /* renamed from: u  reason: collision with root package name */
    public final WeakReference<Context> f5225u;

    /* renamed from: v  reason: collision with root package name */
    public final f f5226v;

    /* renamed from: w  reason: collision with root package name */
    public final q f5227w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f5228x;

    /* renamed from: y  reason: collision with root package name */
    public final b f5229y;

    /* renamed from: z  reason: collision with root package name */
    public float f5230z;

    public a(Context context, b.a aVar) {
        FrameLayout frameLayout;
        e eVar;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f5225u = weakReference;
        t.c(context, t.f29510b, "Theme.MaterialComponents");
        this.f5228x = new Rect();
        f fVar = new f();
        this.f5226v = fVar;
        q qVar = new q(this);
        this.f5227w = qVar;
        TextPaint textPaint = qVar.f29502a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        Context context3 = weakReference.get();
        if (context3 != null && qVar.f != (eVar = new e(context3, 2132083280)) && (context2 = weakReference.get()) != null) {
            qVar.b(eVar, context2);
            h();
        }
        b bVar = new b(context, aVar);
        this.f5229y = bVar;
        b.a aVar2 = bVar.f5232b;
        this.B = ((int) Math.pow(10.0d, aVar2.f5241z - 1.0d)) - 1;
        qVar.f29505d = true;
        h();
        invalidateSelf();
        qVar.f29505d = true;
        h();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(aVar2.f5237v.intValue());
        if (fVar.f38424u.f38433c != valueOf) {
            fVar.k(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(aVar2.f5238w.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.F;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = this.F.get();
            WeakReference<FrameLayout> weakReference3 = this.G;
            if (weakReference3 != null) {
                frameLayout = weakReference3.get();
            } else {
                frameLayout = null;
            }
            g(view, frameLayout);
        }
        h();
        setVisible(aVar2.F.booleanValue(), false);
    }

    @Override // qb.q.b
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        int e10 = e();
        int i6 = this.B;
        b bVar = this.f5229y;
        if (e10 <= i6) {
            return NumberFormat.getInstance(bVar.f5232b.A).format(e());
        }
        Context context = this.f5225u.get();
        if (context == null) {
            return "";
        }
        return String.format(bVar.f5232b.A, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.B), "+");
    }

    public final CharSequence c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        boolean f = f();
        b bVar = this.f5229y;
        if (f) {
            if (bVar.f5232b.C == 0 || (context = this.f5225u.get()) == null) {
                return null;
            }
            int e10 = e();
            int i6 = this.B;
            b.a aVar = bVar.f5232b;
            if (e10 <= i6) {
                return context.getResources().getQuantityString(aVar.C, e(), Integer.valueOf(e()));
            }
            return context.getString(aVar.D, Integer.valueOf(i6));
        }
        return bVar.f5232b.B;
    }

    public final FrameLayout d() {
        WeakReference<FrameLayout> weakReference = this.G;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f5226v.draw(canvas);
            if (f()) {
                Rect rect = new Rect();
                String b10 = b();
                q qVar = this.f5227w;
                qVar.f29502a.getTextBounds(b10, 0, b10.length(), rect);
                canvas.drawText(b10, this.f5230z, this.A + (rect.height() / 2), qVar.f29502a);
            }
        }
    }

    public final int e() {
        if (f()) {
            return this.f5229y.f5232b.f5240y;
        }
        return 0;
    }

    public final boolean f() {
        if (this.f5229y.f5232b.f5240y != -1) {
            return true;
        }
        return false;
    }

    public final void g(View view, FrameLayout frameLayout) {
        this.F = new WeakReference<>(view);
        this.G = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f5229y.f5232b.f5239x;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f5228x.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f5228x.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        View view;
        int intValue;
        int i6;
        int intValue2;
        float f;
        float f2;
        Context context = this.f5225u.get();
        WeakReference<View> weakReference = this.F;
        FrameLayout frameLayout = null;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            Rect rect2 = this.f5228x;
            rect.set(rect2);
            Rect rect3 = new Rect();
            view.getDrawingRect(rect3);
            WeakReference<FrameLayout> weakReference2 = this.G;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            }
            if (frameLayout != null) {
                frameLayout.offsetDescendantRectToMyCoords(view, rect3);
            }
            boolean f10 = f();
            b bVar = this.f5229y;
            if (f10) {
                intValue = bVar.f5232b.J.intValue();
            } else {
                intValue = bVar.f5232b.H.intValue();
            }
            int intValue3 = bVar.f5232b.L.intValue() + intValue;
            b.a aVar = bVar.f5232b;
            int intValue4 = aVar.E.intValue();
            if (intValue4 != 8388691 && intValue4 != 8388693) {
                this.A = rect3.top + intValue3;
            } else {
                this.A = rect3.bottom - intValue3;
            }
            int e10 = e();
            float f11 = bVar.f5234d;
            if (e10 <= 9) {
                if (!f()) {
                    f11 = bVar.f5233c;
                }
                this.C = f11;
                this.E = f11;
                this.D = f11;
            } else {
                this.C = f11;
                this.E = f11;
                this.D = (this.f5227w.a(b()) / 2.0f) + bVar.f5235e;
            }
            Resources resources = context.getResources();
            if (f()) {
                i6 = R.dimen.mtrl_badge_text_horizontal_edge_offset;
            } else {
                i6 = R.dimen.mtrl_badge_horizontal_edge_offset;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i6);
            if (f()) {
                intValue2 = aVar.I.intValue();
            } else {
                intValue2 = aVar.G.intValue();
            }
            int intValue5 = aVar.K.intValue() + intValue2;
            int intValue6 = aVar.E.intValue();
            if (intValue6 != 8388659 && intValue6 != 8388691) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                if (d0.e.d(view) == 0) {
                    f2 = ((rect3.right + this.D) - dimensionPixelSize) - intValue5;
                } else {
                    f2 = (rect3.left - this.D) + dimensionPixelSize + intValue5;
                }
                this.f5230z = f2;
            } else {
                WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
                if (d0.e.d(view) == 0) {
                    f = (rect3.left - this.D) + dimensionPixelSize + intValue5;
                } else {
                    f = ((rect3.right + this.D) - dimensionPixelSize) - intValue5;
                }
                this.f5230z = f;
            }
            float f12 = this.f5230z;
            float f13 = this.A;
            float f14 = this.D;
            float f15 = this.E;
            rect2.set((int) (f12 - f14), (int) (f13 - f15), (int) (f12 + f14), (int) (f13 + f15));
            float f16 = this.C;
            f fVar = this.f5226v;
            fVar.setShapeAppearanceModel(fVar.f38424u.f38431a.e(f16));
            if (!rect.equals(rect2)) {
                fVar.setBounds(rect2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, qb.q.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        b bVar = this.f5229y;
        bVar.f5231a.f5239x = i6;
        bVar.f5232b.f5239x = i6;
        this.f5227w.f29502a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
