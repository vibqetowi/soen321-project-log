package k0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import k0.a;
/* compiled from: WrappedDrawableApi14.java */
/* loaded from: classes.dex */
public class d extends Drawable implements Drawable.Callback, c, b {
    public static final PorterDuff.Mode A = PorterDuff.Mode.SRC_IN;

    /* renamed from: u  reason: collision with root package name */
    public int f22755u;

    /* renamed from: v  reason: collision with root package name */
    public PorterDuff.Mode f22756v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f22757w;

    /* renamed from: x  reason: collision with root package name */
    public f f22758x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f22759y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f22760z;

    public d(f fVar, Resources resources) {
        Drawable.ConstantState constantState;
        this.f22758x = fVar;
        if (fVar == null || (constantState = fVar.f22762b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    @Override // k0.c
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f22760z;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f22760z = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f22758x;
            if (fVar != null) {
                fVar.f22762b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // k0.c
    public final Drawable b() {
        return this.f22760z;
    }

    public boolean c() {
        throw null;
    }

    public final boolean d(int[] iArr) {
        if (!c()) {
            return false;
        }
        f fVar = this.f22758x;
        ColorStateList colorStateList = fVar.f22763c;
        PorterDuff.Mode mode = fVar.f22764d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f22757w || colorForState != this.f22755u || mode != this.f22756v) {
                setColorFilter(colorForState, mode);
                this.f22755u = colorForState;
                this.f22756v = mode;
                this.f22757w = true;
                return true;
            }
        } else {
            this.f22757w = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f22760z.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int i6;
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f22758x;
        if (fVar != null) {
            i6 = fVar.getChangingConfigurations();
        } else {
            i6 = 0;
        }
        return changingConfigurations | i6 | this.f22760z.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        f fVar = this.f22758x;
        if (fVar != null) {
            if (fVar.f22762b != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                fVar.f22761a = getChangingConfigurations();
                return this.f22758x;
            }
            return null;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f22760z.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f22760z.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f22760z.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return a.b(this.f22760z);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f22760z.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f22760z.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f22760z.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f22760z.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f22760z.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f22760z.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return a.C0349a.d(this.f22760z);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        f fVar;
        if (c() && (fVar = this.f22758x) != null) {
            colorStateList = fVar.f22763c;
        } else {
            colorStateList = null;
        }
        if ((colorStateList != null && colorStateList.isStateful()) || this.f22760z.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f22760z.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f22759y && super.mutate() == this) {
            this.f22758x = new f(this.f22758x);
            Drawable drawable = this.f22760z;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f22758x;
            if (fVar != null) {
                Drawable drawable2 = this.f22760z;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                fVar.f22762b = constantState;
            }
            this.f22759y = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f22760z;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i6) {
        return a.c(this.f22760z, i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i6) {
        return this.f22760z.setLevel(i6);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        this.f22760z.setAlpha(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        a.C0349a.e(this.f22760z, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i6) {
        this.f22760z.setChangingConfigurations(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22760z.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        this.f22760z.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.f22760z.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean state = this.f22760z.setState(iArr);
        if (!d(iArr) && !state) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i6) {
        setTintList(ColorStateList.valueOf(i6));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f22758x.f22763c = colorStateList;
        d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f22758x.f22764d = mode;
        d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        if (!super.setVisible(z10, z11) && !this.f22760z.setVisible(z10, z11)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public d(Drawable drawable) {
        this.f22758x = new f(this.f22758x);
        a(drawable);
    }
}
