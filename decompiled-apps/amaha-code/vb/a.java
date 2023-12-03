package vb;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import yb.f;
import yb.i;
import yb.m;
/* compiled from: RippleDrawableCompat.java */
/* loaded from: classes.dex */
public final class a extends Drawable implements m, k0.b {

    /* renamed from: u  reason: collision with root package name */
    public C0591a f34966u;

    public a(i iVar) {
        this(new C0591a(new f(iVar)));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C0591a c0591a = this.f34966u;
        if (c0591a.f34968b) {
            c0591a.f34967a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f34966u;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f34966u.f34967a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f34966u = new C0591a(this.f34966u);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f34966u.f34967a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f34966u.f34967a.setState(iArr)) {
            onStateChange = true;
        }
        boolean d10 = b.d(iArr);
        C0591a c0591a = this.f34966u;
        if (c0591a.f34968b != d10) {
            c0591a.f34968b = d10;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        this.f34966u.f34967a.setAlpha(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34966u.f34967a.setColorFilter(colorFilter);
    }

    @Override // yb.m
    public final void setShapeAppearanceModel(i iVar) {
        this.f34966u.f34967a.setShapeAppearanceModel(iVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        this.f34966u.f34967a.setTint(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f34966u.f34967a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f34966u.f34967a.setTintMode(mode);
    }

    public a(C0591a c0591a) {
        this.f34966u = c0591a;
    }

    /* compiled from: RippleDrawableCompat.java */
    /* renamed from: vb.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0591a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final f f34967a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f34968b;

        public C0591a(f fVar) {
            this.f34967a = fVar;
            this.f34968b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new a(new C0591a(this));
        }

        public C0591a(C0591a c0591a) {
            this.f34967a = (f) c0591a.f34967a.f38424u.newDrawable();
            this.f34968b = c0591a.f34968b;
        }
    }
}
