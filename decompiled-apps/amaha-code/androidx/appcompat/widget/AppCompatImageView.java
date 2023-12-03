package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* renamed from: u  reason: collision with root package name */
    public final e f1193u;

    /* renamed from: v  reason: collision with root package name */
    public final n f1194v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1195w;

    public AppCompatImageView() {
        throw null;
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1193u;
        if (eVar != null) {
            eVar.a();
        }
        n nVar = this.f1194v;
        if (nVar != null) {
            nVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1193u;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1193u;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        j1 j1Var;
        n nVar = this.f1194v;
        if (nVar == null || (j1Var = nVar.f1484b) == null) {
            return null;
        }
        return j1Var.f1459a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        j1 j1Var;
        n nVar = this.f1194v;
        if (nVar == null || (j1Var = nVar.f1484b) == null) {
            return null;
        }
        return j1Var.f1460b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(this.f1194v.f1483a.getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1193u;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        e eVar = this.f1193u;
        if (eVar != null) {
            eVar.f(i6);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        n nVar = this.f1194v;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        n nVar = this.f1194v;
        if (nVar != null && drawable != null && !this.f1195w) {
            nVar.f1486d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (nVar != null) {
            nVar.a();
            if (!this.f1195w) {
                ImageView imageView = nVar.f1483a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(nVar.f1486d);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i6) {
        super.setImageLevel(i6);
        this.f1195w = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i6) {
        n nVar = this.f1194v;
        if (nVar != null) {
            nVar.c(i6);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n nVar = this.f1194v;
        if (nVar != null) {
            nVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1193u;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1193u;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        n nVar = this.f1194v;
        if (nVar != null) {
            if (nVar.f1484b == null) {
                nVar.f1484b = new j1();
            }
            j1 j1Var = nVar.f1484b;
            j1Var.f1459a = colorStateList;
            j1Var.f1462d = true;
            nVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        n nVar = this.f1194v;
        if (nVar != null) {
            if (nVar.f1484b == null) {
                nVar.f1484b = new j1();
            }
            j1 j1Var = nVar.f1484b;
            j1Var.f1460b = mode;
            j1Var.f1461c = true;
            nVar.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        i1.a(context);
        this.f1195w = false;
        g1.a(getContext(), this);
        e eVar = new e(this);
        this.f1193u = eVar;
        eVar.d(attributeSet, i6);
        n nVar = new n(this);
        this.f1194v = nVar;
        nVar.b(attributeSet, i6);
    }
}
