package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.p1;
import androidx.appcompat.widget.t0;
/* loaded from: classes.dex */
public class ActionMenuItemView extends i0 implements k.a, View.OnClickListener, ActionMenuView.a {
    public h B;
    public CharSequence C;
    public Drawable D;
    public f.b E;
    public a F;
    public b G;
    public boolean H;
    public boolean I;
    public final int J;
    public int K;
    public final int L;

    /* loaded from: classes.dex */
    public class a extends t0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.t0
        public final l.f b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.G;
            if (bVar == null || (aVar = androidx.appcompat.widget.c.this.O) == null) {
                return null;
            }
            return aVar.a();
        }

        @Override // androidx.appcompat.widget.t0
        public final boolean c() {
            l.f b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            f.b bVar = actionMenuItemView.E;
            if (bVar == null || !bVar.a(actionMenuItemView.B) || (b10 = b()) == null || !b10.a()) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.H = m();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kc.f.B, 0, 0);
        this.J = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.L = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.K = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean a() {
        return l();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean b() {
        if (l() && this.B.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        int i6;
        this.B = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitleCondensed());
        setId(hVar.f1118a);
        if (hVar.isVisible()) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        setVisibility(i6);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.F == null) {
            this.F = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.B;
    }

    public final boolean l() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i6 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i6 < 480 && ((i6 < 640 || i10 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    public final void n() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z10;
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.C);
        if (this.D != null) {
            if ((this.B.f1140y & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || (!this.H && !this.I)) {
                z11 = false;
            }
        }
        boolean z13 = z12 & z11;
        CharSequence charSequence3 = null;
        if (z13) {
            charSequence = this.C;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.B.f1133q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z13) {
                charSequence2 = null;
            } else {
                charSequence2 = this.B.f1122e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.B.r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z13) {
                charSequence3 = this.B.f1122e;
            }
            p1.a(this, charSequence3);
            return;
        }
        p1.a(this, charSequence5);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f.b bVar = this.E;
        if (bVar != null) {
            bVar.a(this.B);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.H = m();
        n();
    }

    @Override // androidx.appcompat.widget.i0, android.widget.TextView, android.view.View
    public final void onMeasure(int i6, int i10) {
        int i11;
        int i12;
        boolean l2 = l();
        if (l2 && (i12 = this.K) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i6, i10);
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.J;
        if (mode == Integer.MIN_VALUE) {
            i11 = Math.min(size, i13);
        } else {
            i11 = i13;
        }
        if (mode != 1073741824 && i13 > 0 && measuredWidth < i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
        }
        if (!l2 && this.D != null) {
            super.setPadding((getMeasuredWidth() - this.D.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.B.hasSubMenu() && (aVar = this.F) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            h hVar = this.B;
            if (hVar != null) {
                f fVar = hVar.f1130n;
                fVar.f1102k = true;
                fVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.D = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i6 = this.L;
            if (intrinsicWidth > i6) {
                intrinsicHeight = (int) (intrinsicHeight * (i6 / intrinsicWidth));
                intrinsicWidth = i6;
            }
            if (intrinsicHeight > i6) {
                intrinsicWidth = (int) (intrinsicWidth * (i6 / intrinsicHeight));
            } else {
                i6 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i6);
        }
        setCompoundDrawables(drawable, null, null, null);
        n();
    }

    public void setItemInvoker(f.b bVar) {
        this.E = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i6, int i10, int i11, int i12) {
        this.K = i6;
        super.setPadding(i6, i10, i11, i12);
    }

    public void setPopupCallback(b bVar) {
        this.G = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.C = charSequence;
        n();
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }
}
