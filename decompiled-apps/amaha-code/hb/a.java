package hb;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.l1;
import androidx.core.widget.b;
import com.theinnerhour.b2b.R;
import i0.f;
import i2.d;
import i2.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k0.a;
import org.xmlpull.v1.XmlPullParserException;
import qb.t;
import qb.w;
import r1.b0;
import ug.l;
/* compiled from: MaterialCheckBox.java */
/* loaded from: classes.dex */
public final class a extends AppCompatCheckBox {
    public static final int[] S = {R.attr.state_indeterminate};
    public static final int[] T = {R.attr.state_error};
    public static final int[][] U = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public static final int V = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public boolean D;
    public CharSequence E;
    public Drawable F;
    public Drawable G;
    public boolean H;
    public ColorStateList I;
    public ColorStateList J;
    public PorterDuff.Mode K;
    public int L;
    public int[] M;
    public boolean N;
    public CharSequence O;
    public CompoundButton.OnCheckedChangeListener P;
    public final i2.d Q;
    public final C0277a R;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashSet<c> f17354y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashSet<b> f17355z;

    /* compiled from: MaterialCheckBox.java */
    /* renamed from: hb.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0277a extends i2.c {
        public C0277a() {
        }

        @Override // i2.c
        public final void a(Drawable drawable) {
            ColorStateList colorStateList = a.this.I;
            if (colorStateList != null) {
                a.b.h(drawable, colorStateList);
            }
        }

        @Override // i2.c
        public final void b(Drawable drawable) {
            a aVar = a.this;
            ColorStateList colorStateList = aVar.I;
            if (colorStateList != null) {
                a.b.g(drawable, colorStateList.getColorForState(aVar.M, colorStateList.getDefaultColor()));
            }
        }
    }

    /* compiled from: MaterialCheckBox.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* compiled from: MaterialCheckBox.java */
    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* compiled from: MaterialCheckBox.java */
    /* loaded from: classes.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new C0278a();

        /* renamed from: u  reason: collision with root package name */
        public int f17357u;

        /* compiled from: MaterialCheckBox.java */
        /* renamed from: hb.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0278a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i6) {
                return new d[i6];
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" CheckedState=");
            int i6 = this.f17357u;
            if (i6 != 1) {
                if (i6 != 2) {
                    str = "unchecked";
                } else {
                    str = "indeterminate";
                }
            } else {
                str = "checked";
            }
            return b0.b(sb2, str, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeValue(Integer.valueOf(this.f17357u));
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f17357u = ((Integer) parcel.readValue(d.class.getClassLoader())).intValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Context context, AttributeSet attributeSet) {
        super(fc.a.a(context, attributeSet, R.attr.checkboxStyle, 2132083831), attributeSet, R.attr.checkboxStyle);
        i2.d dVar;
        int next;
        l1 e10;
        int i6;
        boolean z10;
        this.f17354y = new LinkedHashSet<>();
        this.f17355z = new LinkedHashSet<>();
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            dVar = new i2.d(context2);
            Resources resources = context2.getResources();
            Resources.Theme theme = context2.getTheme();
            ThreadLocal<TypedValue> threadLocal = f.f19628a;
            Drawable a10 = f.a.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
            dVar.f19683u = a10;
            a10.setCallback(dVar.f19673z);
            new d.c(dVar.f19683u.getConstantState());
        } else {
            int i10 = i2.d.A;
            try {
                XmlResourceParser xml = context2.getResources().getXml(R.drawable.mtrl_checkbox_button_checked_unchecked);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    Resources resources2 = context2.getResources();
                    Resources.Theme theme2 = context2.getTheme();
                    i2.d dVar2 = new i2.d(context2);
                    dVar2.inflate(resources2, xml, asAttributeSet, theme2);
                    dVar = dVar2;
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException e11) {
                Log.e("AnimatedVDCompat", "parser error", e11);
                dVar = null;
                this.Q = dVar;
                this.R = new C0277a();
                Context context3 = getContext();
                this.F = androidx.core.widget.b.a(this);
                this.I = getSuperButtonTintList();
                setSupportButtonTintList(null);
                e10 = t.e(context3, attributeSet, l.f34139w, R.attr.checkboxStyle, 2132083831, new int[0]);
                this.G = e10.e(2);
                if (this.F != null) {
                    i6 = e10.i(0, 0);
                    int i11 = e10.i(1, 0);
                    if (i6 != V) {
                    }
                    z10 = false;
                    if (z10) {
                    }
                }
                this.J = ub.d.b(context3, e10, 3);
                this.K = w.d(e10.h(4, -1), PorterDuff.Mode.SRC_IN);
                this.B = e10.a(10, false);
                this.C = e10.a(6, true);
                this.D = e10.a(9, false);
                this.E = e10.k(8);
                if (e10.l(7)) {
                }
                e10.n();
                b();
            } catch (XmlPullParserException e12) {
                Log.e("AnimatedVDCompat", "parser error", e12);
                dVar = null;
                this.Q = dVar;
                this.R = new C0277a();
                Context context32 = getContext();
                this.F = androidx.core.widget.b.a(this);
                this.I = getSuperButtonTintList();
                setSupportButtonTintList(null);
                e10 = t.e(context32, attributeSet, l.f34139w, R.attr.checkboxStyle, 2132083831, new int[0]);
                this.G = e10.e(2);
                if (this.F != null) {
                }
                this.J = ub.d.b(context32, e10, 3);
                this.K = w.d(e10.h(4, -1), PorterDuff.Mode.SRC_IN);
                this.B = e10.a(10, false);
                this.C = e10.a(6, true);
                this.D = e10.a(9, false);
                this.E = e10.k(8);
                if (e10.l(7)) {
                }
                e10.n();
                b();
            }
        }
        this.Q = dVar;
        this.R = new C0277a();
        Context context322 = getContext();
        this.F = androidx.core.widget.b.a(this);
        this.I = getSuperButtonTintList();
        setSupportButtonTintList(null);
        e10 = t.e(context322, attributeSet, l.f34139w, R.attr.checkboxStyle, 2132083831, new int[0]);
        this.G = e10.e(2);
        if (this.F != null && ub.b.b(context322, R.attr.isMaterial3Theme, false)) {
            i6 = e10.i(0, 0);
            int i112 = e10.i(1, 0);
            if (i6 != V && i112 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                super.setButtonDrawable((Drawable) null);
                this.F = hc.d.H(context322, R.drawable.mtrl_checkbox_button);
                this.H = true;
                if (this.G == null) {
                    this.G = hc.d.H(context322, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.J = ub.d.b(context322, e10, 3);
        this.K = w.d(e10.h(4, -1), PorterDuff.Mode.SRC_IN);
        this.B = e10.a(10, false);
        this.C = e10.a(6, true);
        this.D = e10.a(9, false);
        this.E = e10.k(8);
        if (e10.l(7)) {
            setCheckedState(e10.h(7, 0));
        }
        e10.n();
        b();
    }

    private String getButtonStateDescription() {
        int i6 = this.L;
        if (i6 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i6 == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.A == null) {
            int C0 = f6.b.C0(R.attr.colorControlActivated, this);
            int C02 = f6.b.C0(R.attr.colorError, this);
            int C03 = f6.b.C0(R.attr.colorSurface, this);
            int C04 = f6.b.C0(R.attr.colorOnSurface, this);
            this.A = new ColorStateList(U, new int[]{f6.b.L0(1.0f, C03, C02), f6.b.L0(1.0f, C03, C0), f6.b.L0(0.54f, C03, C04), f6.b.L0(0.38f, C03, C04), f6.b.L0(0.38f, C03, C04)});
        }
        return this.A;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.I;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void b() {
        int intrinsicWidth;
        int intrinsicHeight;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        e eVar;
        this.F = mb.a.a(this.F, this.I, b.a.b(this));
        this.G = mb.a.a(this.G, this.J, this.K);
        if (this.H) {
            i2.d dVar = this.Q;
            if (dVar != null) {
                Drawable drawable = dVar.f19683u;
                C0277a c0277a = this.R;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c0277a.f19668a == null) {
                        c0277a.f19668a = new i2.b(c0277a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0277a.f19668a);
                }
                ArrayList<i2.c> arrayList = dVar.f19672y;
                d.b bVar = dVar.f19669v;
                if (arrayList != null && c0277a != null) {
                    arrayList.remove(c0277a);
                    if (dVar.f19672y.size() == 0 && (eVar = dVar.f19671x) != null) {
                        bVar.f19676b.removeListener(eVar);
                        dVar.f19671x = null;
                    }
                }
                Drawable drawable2 = dVar.f19683u;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c0277a.f19668a == null) {
                        c0277a.f19668a = new i2.b(c0277a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0277a.f19668a);
                } else if (c0277a != null) {
                    if (dVar.f19672y == null) {
                        dVar.f19672y = new ArrayList<>();
                    }
                    if (!dVar.f19672y.contains(c0277a)) {
                        dVar.f19672y.add(c0277a);
                        if (dVar.f19671x == null) {
                            dVar.f19671x = new e(dVar);
                        }
                        bVar.f19676b.addListener(dVar.f19671x);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.F;
                if ((drawable3 instanceof AnimatedStateListDrawable) && dVar != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, dVar, false);
                    ((AnimatedStateListDrawable) this.F).addTransition(R.id.indeterminate, R.id.unchecked, dVar, false);
                }
            }
        }
        Drawable drawable4 = this.F;
        if (drawable4 != null && (colorStateList2 = this.I) != null) {
            a.b.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.G;
        if (drawable5 != null && (colorStateList = this.J) != null) {
            a.b.h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.F;
        Drawable drawable7 = this.G;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            if (drawable7.getIntrinsicWidth() != -1 && drawable7.getIntrinsicHeight() != -1) {
                if (drawable7.getIntrinsicWidth() <= drawable6.getIntrinsicWidth() && drawable7.getIntrinsicHeight() <= drawable6.getIntrinsicHeight()) {
                    intrinsicWidth = drawable7.getIntrinsicWidth();
                    intrinsicHeight = drawable7.getIntrinsicHeight();
                } else {
                    float intrinsicWidth2 = drawable7.getIntrinsicWidth() / drawable7.getIntrinsicHeight();
                    if (intrinsicWidth2 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                        int intrinsicWidth3 = drawable6.getIntrinsicWidth();
                        intrinsicHeight = (int) (intrinsicWidth3 / intrinsicWidth2);
                        intrinsicWidth = intrinsicWidth3;
                    } else {
                        intrinsicHeight = drawable6.getIntrinsicHeight();
                        intrinsicWidth = (int) (intrinsicWidth2 * intrinsicHeight);
                    }
                }
            } else {
                intrinsicWidth = drawable6.getIntrinsicWidth();
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (Build.VERSION.SDK_INT >= 23) {
                layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
                layerDrawable.setLayerGravity(1, 17);
            } else {
                int intrinsicWidth4 = (drawable6.getIntrinsicWidth() - intrinsicWidth) / 2;
                int intrinsicHeight2 = (drawable6.getIntrinsicHeight() - intrinsicHeight) / 2;
                layerDrawable.setLayerInset(1, intrinsicWidth4, intrinsicHeight2, intrinsicWidth4, intrinsicHeight2);
            }
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.F;
    }

    public Drawable getButtonIconDrawable() {
        return this.G;
    }

    public ColorStateList getButtonIconTintList() {
        return this.J;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.K;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.I;
    }

    public int getCheckedState() {
        return this.L;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.E;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.L == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.B && this.I == null && this.J == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, S);
        }
        if (this.D) {
            View.mergeDrawableStates(onCreateDrawableState, T);
        }
        int i10 = 0;
        while (true) {
            if (i10 < onCreateDrawableState.length) {
                int i11 = onCreateDrawableState[i10];
                if (i11 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                } else if (i11 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i10] = 16842912;
                    break;
                } else {
                    i10++;
                }
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.M = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a10;
        int i6;
        if (this.C && TextUtils.isEmpty(getText()) && (a10 = androidx.core.widget.b.a(this)) != null) {
            if (w.c(this)) {
                i6 = -1;
            } else {
                i6 = 1;
            }
            int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * i6;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = a10.getBounds();
                a.b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.D) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.E));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.f17357u);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f17357u = getCheckedState();
        return dVar;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i6) {
        setButtonDrawable(hc.d.H(getContext(), i6));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.G = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i6) {
        setButtonIconDrawable(hc.d.H(getContext(), i6));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.J == colorStateList) {
            return;
        }
        this.J = colorStateList;
        b();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.K == mode) {
            return;
        }
        this.K = mode;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.I == colorStateList) {
            return;
        }
        this.I = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.C = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i6) {
        boolean z10;
        Object systemService;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.L != i6) {
            this.L = i6;
            if (i6 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            super.setChecked(z10);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.O == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.N) {
                return;
            }
            this.N = true;
            LinkedHashSet<b> linkedHashSet = this.f17355z;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
            if (this.L != 2 && (onCheckedChangeListener = this.P) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                systemService = getContext().getSystemService(AutofillManager.class);
                AutofillManager autofillManager = (AutofillManager) systemService;
                if (autofillManager != null) {
                    autofillManager.notifyValueChanged(this);
                }
            }
            this.N = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.E = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i6) {
        CharSequence charSequence;
        if (i6 != 0) {
            charSequence = getResources().getText(i6);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z10) {
        if (this.D == z10) {
            return;
        }
        this.D = z10;
        refreshDrawableState();
        Iterator<c> it = this.f17354y.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.P = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.O = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.B = z10;
        if (z10) {
            b.a.c(this, getMaterialThemeColorsTintList());
        } else {
            b.a.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.F = drawable;
        this.H = false;
        b();
    }
}
