package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.l1;
import androidx.core.widget.k;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.theinnerhour.b2b.R;
import dc.e;
import dc.f;
import dc.l;
import dc.m;
import dc.r;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import qb.s;
import qb.w;
import t0.d0;
import t0.h;
import t0.o0;
/* compiled from: EndCompoundLayout.java */
/* loaded from: classes.dex */
public final class a extends LinearLayout {
    public final CheckableImageButton A;
    public final d B;
    public int C;
    public final LinkedHashSet<TextInputLayout.h> D;
    public ColorStateList E;
    public PorterDuff.Mode F;
    public int G;
    public ImageView.ScaleType H;
    public View.OnLongClickListener I;
    public CharSequence J;
    public final i0 K;
    public boolean L;
    public EditText M;
    public final AccessibilityManager N;
    public u0.d O;
    public final C0153a P;

    /* renamed from: u  reason: collision with root package name */
    public final TextInputLayout f9287u;

    /* renamed from: v  reason: collision with root package name */
    public final FrameLayout f9288v;

    /* renamed from: w  reason: collision with root package name */
    public final CheckableImageButton f9289w;

    /* renamed from: x  reason: collision with root package name */
    public ColorStateList f9290x;

    /* renamed from: y  reason: collision with root package name */
    public PorterDuff.Mode f9291y;

    /* renamed from: z  reason: collision with root package name */
    public View.OnLongClickListener f9292z;

    /* compiled from: EndCompoundLayout.java */
    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0153a extends s {
        public C0153a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            a.this.b().a();
        }

        @Override // qb.s, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            a.this.b().b();
        }
    }

    /* compiled from: EndCompoundLayout.java */
    /* loaded from: classes.dex */
    public class b implements TextInputLayout.g {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(TextInputLayout textInputLayout) {
            a aVar = a.this;
            if (aVar.M == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = aVar.M;
            C0153a c0153a = aVar.P;
            if (editText != null) {
                editText.removeTextChangedListener(c0153a);
                if (aVar.M.getOnFocusChangeListener() == aVar.b().e()) {
                    aVar.M.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            aVar.M = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(c0153a);
            }
            aVar.b().m(aVar.M);
            aVar.i(aVar.b());
        }
    }

    /* compiled from: EndCompoundLayout.java */
    /* loaded from: classes.dex */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            if (aVar.O != null && (accessibilityManager = aVar.N) != null) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                if (d0.g.b(aVar)) {
                    u0.c.a(accessibilityManager, aVar.O);
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            u0.d dVar = aVar.O;
            if (dVar != null && (accessibilityManager = aVar.N) != null) {
                u0.c.b(accessibilityManager, dVar);
            }
        }
    }

    /* compiled from: EndCompoundLayout.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<l> f9296a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public final a f9297b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9298c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9299d;

        public d(a aVar, l1 l1Var) {
            this.f9297b = aVar;
            this.f9298c = l1Var.i(26, 0);
            this.f9299d = l1Var.i(50, 0);
        }
    }

    public a(TextInputLayout textInputLayout, l1 l1Var) {
        super(textInputLayout.getContext());
        CharSequence k10;
        this.C = 0;
        this.D = new LinkedHashSet<>();
        this.P = new C0153a();
        b bVar = new b();
        this.N = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f9287u = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f9288v = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a10 = a(this, from, R.id.text_input_error_icon);
        this.f9289w = a10;
        CheckableImageButton a11 = a(frameLayout, from, R.id.text_input_end_icon);
        this.A = a11;
        this.B = new d(this, l1Var);
        i0 i0Var = new i0(getContext(), null);
        this.K = i0Var;
        if (l1Var.l(36)) {
            this.f9290x = ub.d.b(getContext(), l1Var, 36);
        }
        if (l1Var.l(37)) {
            this.f9291y = w.d(l1Var.h(37, -1), null);
        }
        if (l1Var.l(35)) {
            h(l1Var.e(35));
        }
        a10.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.d.s(a10, 2);
        a10.setClickable(false);
        a10.setPressable(false);
        a10.setFocusable(false);
        if (!l1Var.l(51)) {
            if (l1Var.l(30)) {
                this.E = ub.d.b(getContext(), l1Var, 30);
            }
            if (l1Var.l(31)) {
                this.F = w.d(l1Var.h(31, -1), null);
            }
        }
        if (l1Var.l(28)) {
            f(l1Var.h(28, 0));
            if (l1Var.l(25) && a11.getContentDescription() != (k10 = l1Var.k(25))) {
                a11.setContentDescription(k10);
            }
            a11.setCheckable(l1Var.a(24, true));
        } else if (l1Var.l(51)) {
            if (l1Var.l(52)) {
                this.E = ub.d.b(getContext(), l1Var, 52);
            }
            if (l1Var.l(53)) {
                this.F = w.d(l1Var.h(53, -1), null);
            }
            f(l1Var.a(51, false) ? 1 : 0);
            CharSequence k11 = l1Var.k(49);
            if (a11.getContentDescription() != k11) {
                a11.setContentDescription(k11);
            }
        }
        int d10 = l1Var.d(27, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d10 >= 0) {
            if (d10 != this.G) {
                this.G = d10;
                a11.setMinimumWidth(d10);
                a11.setMinimumHeight(d10);
                a10.setMinimumWidth(d10);
                a10.setMinimumHeight(d10);
            }
            if (l1Var.l(29)) {
                ImageView.ScaleType b10 = m.b(l1Var.h(29, -1));
                this.H = b10;
                a11.setScaleType(b10);
                a10.setScaleType(b10);
            }
            i0Var.setVisibility(8);
            i0Var.setId(R.id.textinput_suffix_text);
            i0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            d0.g.f(i0Var, 1);
            k.e(i0Var, l1Var.i(70, 0));
            if (l1Var.l(71)) {
                i0Var.setTextColor(l1Var.b(71));
            }
            CharSequence k12 = l1Var.k(69);
            this.J = TextUtils.isEmpty(k12) ? null : k12;
            i0Var.setText(k12);
            m();
            frameLayout.addView(a11);
            addView(i0Var);
            addView(frameLayout);
            addView(a10);
            textInputLayout.f9273w0.add(bVar);
            if (textInputLayout.f9274x != null) {
                bVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new c());
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i6) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i6);
        m.d(checkableImageButton);
        if (ub.d.d(getContext())) {
            h.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final l b() {
        l fVar;
        int i6 = this.C;
        d dVar = this.B;
        SparseArray<l> sparseArray = dVar.f9296a;
        l lVar = sparseArray.get(i6);
        if (lVar == null) {
            a aVar = dVar.f9297b;
            if (i6 != -1) {
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                fVar = new dc.k(aVar);
                            } else {
                                throw new IllegalArgumentException(defpackage.c.p("Invalid end icon mode: ", i6));
                            }
                        } else {
                            fVar = new e(aVar);
                        }
                    } else {
                        lVar = new dc.s(aVar, dVar.f9299d);
                        sparseArray.append(i6, lVar);
                    }
                } else {
                    fVar = new r(aVar);
                }
            } else {
                fVar = new f(aVar);
            }
            lVar = fVar;
            sparseArray.append(i6, lVar);
        }
        return lVar;
    }

    public final boolean c() {
        if (this.f9288v.getVisibility() == 0 && this.A.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f9289w.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void e(boolean z10) {
        boolean z11;
        boolean isActivated;
        boolean isChecked;
        l b10 = b();
        boolean k10 = b10.k();
        CheckableImageButton checkableImageButton = this.A;
        boolean z12 = true;
        if (k10 && (isChecked = checkableImageButton.isChecked()) != b10.l()) {
            checkableImageButton.setChecked(!isChecked);
            z11 = true;
        } else {
            z11 = false;
        }
        if ((b10 instanceof dc.k) && (isActivated = checkableImageButton.isActivated()) != b10.j()) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z12 = z11;
        }
        if (z10 || z12) {
            m.c(this.f9287u, checkableImageButton, this.E);
        }
    }

    public final void f(int i6) {
        boolean z10;
        Drawable drawable;
        if (this.C == i6) {
            return;
        }
        l b10 = b();
        u0.d dVar = this.O;
        AccessibilityManager accessibilityManager = this.N;
        if (dVar != null && accessibilityManager != null) {
            u0.c.b(accessibilityManager, dVar);
        }
        CharSequence charSequence = null;
        this.O = null;
        b10.s();
        this.C = i6;
        Iterator<TextInputLayout.h> it = this.D.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        if (i6 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g(z10);
        l b11 = b();
        int i10 = this.B.f9298c;
        if (i10 == 0) {
            i10 = b11.d();
        }
        if (i10 != 0) {
            drawable = hc.d.H(getContext(), i10);
        } else {
            drawable = null;
        }
        CheckableImageButton checkableImageButton = this.A;
        checkableImageButton.setImageDrawable(drawable);
        TextInputLayout textInputLayout = this.f9287u;
        if (drawable != null) {
            m.a(textInputLayout, checkableImageButton, this.E, this.F);
            m.c(textInputLayout, checkableImageButton, this.E);
        }
        int c10 = b11.c();
        if (c10 != 0) {
            charSequence = getResources().getText(c10);
        }
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
        checkableImageButton.setCheckable(b11.k());
        if (b11.i(textInputLayout.getBoxBackgroundMode())) {
            b11.r();
            u0.d h10 = b11.h();
            this.O = h10;
            if (h10 != null && accessibilityManager != null) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                if (d0.g.b(this)) {
                    u0.c.a(accessibilityManager, this.O);
                }
            }
            View.OnClickListener f = b11.f();
            View.OnLongClickListener onLongClickListener = this.I;
            checkableImageButton.setOnClickListener(f);
            m.e(checkableImageButton, onLongClickListener);
            EditText editText = this.M;
            if (editText != null) {
                b11.m(editText);
                i(b11);
            }
            m.a(textInputLayout, checkableImageButton, this.E, this.F);
            e(true);
            return;
        }
        throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i6);
    }

    public final void g(boolean z10) {
        int i6;
        if (c() != z10) {
            if (z10) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            this.A.setVisibility(i6);
            j();
            l();
            this.f9287u.p();
        }
    }

    public final void h(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f9289w;
        checkableImageButton.setImageDrawable(drawable);
        k();
        m.a(this.f9287u, checkableImageButton, this.f9290x, this.f9291y);
    }

    public final void i(l lVar) {
        if (this.M == null) {
            return;
        }
        if (lVar.e() != null) {
            this.M.setOnFocusChangeListener(lVar.e());
        }
        if (lVar.g() != null) {
            this.A.setOnFocusChangeListener(lVar.g());
        }
    }

    public final void j() {
        int i6;
        char c10;
        boolean z10;
        int i10 = 8;
        if (this.A.getVisibility() == 0 && !d()) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        this.f9288v.setVisibility(i6);
        if (this.J != null && !this.L) {
            c10 = 0;
        } else {
            c10 = '\b';
        }
        if (!c() && !d() && c10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            i10 = 0;
        }
        setVisibility(i10);
    }

    public final void k() {
        boolean z10;
        int i6;
        CheckableImageButton checkableImageButton = this.f9289w;
        Drawable drawable = checkableImageButton.getDrawable();
        boolean z11 = true;
        TextInputLayout textInputLayout = this.f9287u;
        if (drawable != null && textInputLayout.D.f12783q && textInputLayout.m()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        checkableImageButton.setVisibility(i6);
        j();
        l();
        if (this.C == 0) {
            z11 = false;
        }
        if (!z11) {
            textInputLayout.p();
        }
    }

    public final void l() {
        int i6;
        TextInputLayout textInputLayout = this.f9287u;
        if (textInputLayout.f9274x == null) {
            return;
        }
        if (!c() && !d()) {
            EditText editText = textInputLayout.f9274x;
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            i6 = d0.e.e(editText);
        } else {
            i6 = 0;
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f9274x.getPaddingTop();
        int paddingBottom = textInputLayout.f9274x.getPaddingBottom();
        WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
        d0.e.k(this.K, dimensionPixelSize, paddingTop, i6, paddingBottom);
    }

    public final void m() {
        int i6;
        i0 i0Var = this.K;
        int visibility = i0Var.getVisibility();
        boolean z10 = false;
        if (this.J != null && !this.L) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        if (visibility != i6) {
            l b10 = b();
            if (i6 == 0) {
                z10 = true;
            }
            b10.p(z10);
        }
        j();
        i0Var.setVisibility(i6);
        this.f9287u.p();
    }
}
