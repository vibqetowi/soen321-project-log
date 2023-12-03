package k0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
/* compiled from: WrappedDrawableState.java */
/* loaded from: classes.dex */
public final class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f22761a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable.ConstantState f22762b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f22763c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f22764d;

    public f(f fVar) {
        this.f22763c = null;
        this.f22764d = d.A;
        if (fVar != null) {
            this.f22761a = fVar.f22761a;
            this.f22762b = fVar.f22762b;
            this.f22763c = fVar.f22763c;
            this.f22764d = fVar.f22764d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i6;
        int i10 = this.f22761a;
        Drawable.ConstantState constantState = this.f22762b;
        if (constantState != null) {
            i6 = constantState.getChangingConfigurations();
        } else {
            i6 = 0;
        }
        return i10 | i6;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
