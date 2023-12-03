package dc;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.theinnerhour.b2b.R;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
import w5.i0;
/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: e  reason: collision with root package name */
    public final int f12752e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f12753g;

    /* renamed from: h  reason: collision with root package name */
    public AutoCompleteTextView f12754h;

    /* renamed from: i  reason: collision with root package name */
    public final i0 f12755i;

    /* renamed from: j  reason: collision with root package name */
    public final b f12756j;

    /* renamed from: k  reason: collision with root package name */
    public final f0.b f12757k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12758l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12759m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12760n;

    /* renamed from: o  reason: collision with root package name */
    public long f12761o;

    /* renamed from: p  reason: collision with root package name */
    public AccessibilityManager f12762p;

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator f12763q;
    public ValueAnimator r;

    public k(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f12755i = new i0(4, this);
        this.f12756j = new b(1, this);
        this.f12757k = new f0.b(23, this);
        this.f12761o = Long.MAX_VALUE;
        this.f = rb.a.c(aVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f12752e = rb.a.c(aVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f12753g = rb.a.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, ab.a.f449a);
    }

    @Override // dc.l
    public final void a() {
        boolean z10;
        if (this.f12762p.isTouchExplorationEnabled()) {
            if (this.f12754h.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !this.f12767d.hasFocus()) {
                this.f12754h.dismissDropDown();
            }
        }
        this.f12754h.post(new androidx.activity.b(28, this));
    }

    @Override // dc.l
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // dc.l
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // dc.l
    public final View.OnFocusChangeListener e() {
        return this.f12756j;
    }

    @Override // dc.l
    public final View.OnClickListener f() {
        return this.f12755i;
    }

    @Override // dc.l
    public final u0.d h() {
        return this.f12757k;
    }

    @Override // dc.l
    public final boolean i(int i6) {
        if (i6 != 0) {
            return true;
        }
        return false;
    }

    @Override // dc.l
    public final boolean j() {
        return this.f12758l;
    }

    @Override // dc.l
    public final boolean l() {
        return this.f12760n;
    }

    @Override // dc.l
    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f12754h = autoCompleteTextView;
            boolean z10 = false;
            autoCompleteTextView.setOnTouchListener(new h(0, this));
            this.f12754h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: dc.i
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    k kVar = k.this;
                    kVar.f12759m = true;
                    kVar.f12761o = System.currentTimeMillis();
                    kVar.t(false);
                }
            });
            this.f12754h.setThreshold(0);
            TextInputLayout textInputLayout = this.f12764a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() != 0) {
                z10 = true;
            }
            if (!z10 && this.f12762p.isTouchExplorationEnabled()) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                d0.d.s(this.f12767d, 2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // dc.l
    public final void n(u0.h hVar) {
        boolean z10;
        boolean z11 = true;
        if (this.f12754h.getInputType() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            hVar.g(Spinner.class.getName());
        }
        int i6 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f33731a;
        if (i6 >= 26) {
            z11 = accessibilityNodeInfo.isShowingHintText();
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) != 4) {
                z11 = false;
            }
        }
        if (z11) {
            hVar.j(null);
        }
    }

    @Override // dc.l
    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z10;
        if (accessibilityEvent.getEventType() == 1 && this.f12762p.isEnabled()) {
            if (this.f12754h.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                u();
                this.f12759m = true;
                this.f12761o = System.currentTimeMillis();
            }
        }
    }

    @Override // dc.l
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f12753g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f);
        ofFloat.addUpdateListener(new a9.c(1, this));
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f12752e);
        ofFloat2.addUpdateListener(new a9.c(1, this));
        this.f12763q = ofFloat2;
        ofFloat2.addListener(new j(this));
        this.f12762p = (AccessibilityManager) this.f12766c.getSystemService("accessibility");
    }

    @Override // dc.l
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f12754h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f12754h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z10) {
        if (this.f12760n != z10) {
            this.f12760n = z10;
            this.r.cancel();
            this.f12763q.start();
        }
    }

    public final void u() {
        boolean z10;
        if (this.f12754h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f12761o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f12759m = false;
        }
        if (!this.f12759m) {
            t(!this.f12760n);
            if (this.f12760n) {
                this.f12754h.requestFocus();
                this.f12754h.showDropDown();
                return;
            }
            this.f12754h.dismissDropDown();
            return;
        }
        this.f12759m = false;
    }
}
