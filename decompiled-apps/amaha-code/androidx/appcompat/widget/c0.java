package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.widget.k;
import i0.f;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import t0.d0;
/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1367a;

    /* renamed from: b  reason: collision with root package name */
    public j1 f1368b;

    /* renamed from: c  reason: collision with root package name */
    public j1 f1369c;

    /* renamed from: d  reason: collision with root package name */
    public j1 f1370d;

    /* renamed from: e  reason: collision with root package name */
    public j1 f1371e;
    public j1 f;

    /* renamed from: g  reason: collision with root package name */
    public j1 f1372g;

    /* renamed from: h  reason: collision with root package name */
    public j1 f1373h;

    /* renamed from: i  reason: collision with root package name */
    public final j0 f1374i;

    /* renamed from: j  reason: collision with root package name */
    public int f1375j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f1376k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f1377l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1378m;

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class c {
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class d {
        public static LocaleList a(String str) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(str);
            return forLanguageTags;
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class e {
        public static int a(TextView textView) {
            int autoSizeStepGranularity;
            autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
            return autoSizeStepGranularity;
        }

        public static void b(TextView textView, int i6, int i10, int i11, int i12) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i6, i10, i11, i12);
        }

        public static void c(TextView textView, int[] iArr, int i6) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i6);
        }

        public static boolean d(TextView textView, String str) {
            boolean fontVariationSettings;
            fontVariationSettings = textView.setFontVariationSettings(str);
            return fontVariationSettings;
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class f {
        public static Typeface a(Typeface typeface, int i6, boolean z10) {
            Typeface create;
            create = Typeface.create(typeface, i6, z10);
            return create;
        }
    }

    public c0(TextView textView) {
        this.f1367a = textView;
        this.f1374i = new j0(textView);
    }

    public static j1 c(Context context, j jVar, int i6) {
        ColorStateList i10;
        synchronized (jVar) {
            i10 = jVar.f1441a.i(i6, context);
        }
        if (i10 != null) {
            j1 j1Var = new j1();
            j1Var.f1462d = true;
            j1Var.f1459a = i10;
            return j1Var;
        }
        return null;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i6;
        int i10;
        boolean z10;
        int i11;
        CharSequence subSequence;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i12 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            text.getClass();
            if (i12 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            int i13 = editorInfo.initialSelStart;
            int i14 = editorInfo.initialSelEnd;
            if (i13 > i14) {
                i6 = i14 + 0;
            } else {
                i6 = i13 + 0;
            }
            if (i13 > i14) {
                i10 = i13 - 0;
            } else {
                i10 = i14 + 0;
            }
            int length = text.length();
            if (i6 >= 0 && i10 <= length) {
                int i15 = editorInfo.inputType & 4095;
                if (i15 != 129 && i15 != 225 && i15 != 18) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    w0.c.a(editorInfo, null, 0, 0);
                    return;
                } else if (length <= 2048) {
                    w0.c.a(editorInfo, text, i6, i10);
                    return;
                } else {
                    int i16 = i10 - i6;
                    if (i16 > 1024) {
                        i11 = 0;
                    } else {
                        i11 = i16;
                    }
                    int i17 = 2048 - i11;
                    int min = Math.min(text.length() - i10, i17 - Math.min(i6, (int) (i17 * 0.8d)));
                    int min2 = Math.min(i6, i17 - min);
                    int i18 = i6 - min2;
                    if (Character.isLowSurrogate(text.charAt(i18))) {
                        i18++;
                        min2--;
                    }
                    if (Character.isHighSurrogate(text.charAt((i10 + min) - 1))) {
                        min--;
                    }
                    int i19 = min2 + i11 + min;
                    if (i11 != i16) {
                        subSequence = TextUtils.concat(text.subSequence(i18, i18 + min2), text.subSequence(i10, min + i10));
                    } else {
                        subSequence = text.subSequence(i18, i19 + i18);
                    }
                    int i20 = min2 + 0;
                    w0.c.a(editorInfo, subSequence, i20, i11 + i20);
                    return;
                }
            }
            w0.c.a(editorInfo, null, 0, 0);
        }
    }

    public final void a(Drawable drawable, j1 j1Var) {
        if (drawable != null && j1Var != null) {
            j.e(drawable, j1Var, this.f1367a.getDrawableState());
        }
    }

    public final void b() {
        j1 j1Var = this.f1368b;
        TextView textView = this.f1367a;
        if (j1Var != null || this.f1369c != null || this.f1370d != null || this.f1371e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f1368b);
            a(compoundDrawables[1], this.f1369c);
            a(compoundDrawables[2], this.f1370d);
            a(compoundDrawables[3], this.f1371e);
        }
        if (this.f != null || this.f1372g != null) {
            Drawable[] a10 = b.a(textView);
            a(a10[0], this.f);
            a(a10[2], this.f1372g);
        }
    }

    public final ColorStateList d() {
        j1 j1Var = this.f1373h;
        if (j1Var != null) {
            return j1Var.f1459a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        j1 j1Var = this.f1373h;
        if (j1Var != null) {
            return j1Var.f1460b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AttributeSet attributeSet, int i6) {
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        String str;
        String str2;
        float f2;
        int i10;
        float f10;
        float f11;
        j jVar;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        Paint.FontMetricsInt fontMetricsInt;
        int i11;
        int resourceId;
        int i12;
        int i13;
        int i14;
        TextView textView = this.f1367a;
        Context context = textView.getContext();
        j a10 = j.a();
        int[] iArr = kc.f.G;
        l1 m10 = l1.m(context, attributeSet, iArr, i6);
        t0.d0.p(textView, textView.getContext(), iArr, attributeSet, m10.f1474b, i6);
        int i15 = m10.i(0, -1);
        if (m10.l(3)) {
            this.f1368b = c(context, a10, m10.i(3, 0));
        }
        if (m10.l(1)) {
            this.f1369c = c(context, a10, m10.i(1, 0));
        }
        if (m10.l(4)) {
            this.f1370d = c(context, a10, m10.i(4, 0));
        }
        if (m10.l(2)) {
            this.f1371e = c(context, a10, m10.i(2, 0));
        }
        int i16 = Build.VERSION.SDK_INT;
        if (m10.l(5)) {
            this.f = c(context, a10, m10.i(5, 0));
        }
        if (m10.l(6)) {
            this.f1372g = c(context, a10, m10.i(6, 0));
        }
        m10.n();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = kc.f.W;
        if (i15 != -1) {
            l1 l1Var = new l1(context, context.obtainStyledAttributes(i15, iArr2));
            if (!z12 && l1Var.l(14)) {
                z10 = l1Var.a(14, false);
                z11 = true;
            } else {
                z10 = false;
                z11 = false;
            }
            n(context, l1Var);
            if (i16 < 23) {
                if (l1Var.l(3)) {
                    colorStateList = l1Var.b(3);
                } else {
                    colorStateList = null;
                }
                if (l1Var.l(4)) {
                    colorStateList2 = l1Var.b(4);
                    i14 = 5;
                } else {
                    i14 = 5;
                    colorStateList2 = null;
                }
                if (l1Var.l(i14)) {
                    colorStateList3 = l1Var.b(i14);
                    i12 = 15;
                    if (!l1Var.l(i12)) {
                        str = l1Var.j(i12);
                        i13 = 26;
                    } else {
                        i13 = 26;
                        str = null;
                    }
                    if (i16 < i13 && l1Var.l(13)) {
                        str2 = l1Var.j(13);
                    } else {
                        str2 = null;
                    }
                    l1Var.n();
                }
            } else {
                colorStateList = null;
                colorStateList2 = null;
            }
            i12 = 15;
            colorStateList3 = null;
            if (!l1Var.l(i12)) {
            }
            if (i16 < i13) {
            }
            str2 = null;
            l1Var.n();
        } else {
            z10 = false;
            z11 = false;
            colorStateList = null;
            colorStateList2 = null;
            colorStateList3 = null;
            str = null;
            str2 = null;
        }
        l1 l1Var2 = new l1(context, context.obtainStyledAttributes(attributeSet, iArr2, i6, 0));
        if (!z12 && l1Var2.l(14)) {
            z10 = l1Var2.a(14, false);
            z11 = true;
        }
        if (i16 < 23) {
            if (l1Var2.l(3)) {
                colorStateList = l1Var2.b(3);
            }
            if (l1Var2.l(4)) {
                colorStateList2 = l1Var2.b(4);
            }
            if (l1Var2.l(5)) {
                colorStateList3 = l1Var2.b(5);
            }
        }
        ColorStateList colorStateList4 = colorStateList;
        ColorStateList colorStateList5 = colorStateList2;
        ColorStateList colorStateList6 = colorStateList3;
        if (l1Var2.l(15)) {
            str = l1Var2.j(15);
        }
        String str3 = str;
        if (i16 >= 26 && l1Var2.l(13)) {
            str2 = l1Var2.j(13);
        }
        String str4 = str2;
        if (i16 >= 28 && l1Var2.l(0) && l1Var2.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, l1Var2);
        l1Var2.n();
        if (colorStateList4 != null) {
            textView.setTextColor(colorStateList4);
        }
        if (colorStateList5 != null) {
            textView.setHintTextColor(colorStateList5);
        }
        if (colorStateList6 != null) {
            textView.setLinkTextColor(colorStateList6);
        }
        if (!z12 && z11) {
            textView.setAllCaps(z10);
        }
        Typeface typeface = this.f1377l;
        if (typeface != null) {
            if (this.f1376k == -1) {
                textView.setTypeface(typeface, this.f1375j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str4 != null) {
            e.d(textView, str4);
        }
        if (str3 != null) {
            if (i16 >= 24) {
                d.b(textView, d.a(str3));
            } else {
                b.c(textView, c.a(str3.split(",")[0]));
            }
        }
        int[] iArr3 = kc.f.H;
        j0 j0Var = this.f1374i;
        Context context2 = j0Var.f1457j;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i6, 0);
        TextView textView2 = j0Var.f1456i;
        t0.d0.p(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes, i6);
        if (obtainStyledAttributes.hasValue(5)) {
            j0Var.f1449a = obtainStyledAttributes.getInt(5, 0);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            f2 = obtainStyledAttributes.getDimension(4, -1.0f);
        } else {
            f2 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(2)) {
            f10 = obtainStyledAttributes.getDimension(2, -1.0f);
            i10 = 1;
        } else {
            i10 = 1;
            f10 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(i10)) {
            f11 = obtainStyledAttributes.getDimension(i10, -1.0f);
        } else {
            f11 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i17 = 0; i17 < length; i17++) {
                    iArr4[i17] = obtainTypedArray.getDimensionPixelSize(i17, -1);
                }
                j0Var.f = j0.b(iArr4);
                j0Var.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (j0Var.i()) {
            if (j0Var.f1449a == 1) {
                if (!j0Var.f1454g) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f10 == -1.0f) {
                        i11 = 2;
                        f10 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i11 = 2;
                    }
                    if (f11 == -1.0f) {
                        f11 = TypedValue.applyDimension(i11, 112.0f, displayMetrics);
                    }
                    if (f2 == -1.0f) {
                        f2 = 1.0f;
                    }
                    j0Var.j(f10, f11, f2);
                }
                j0Var.g();
            }
        } else {
            j0Var.f1449a = 0;
        }
        if (u1.f1564b && j0Var.f1449a != 0) {
            int[] iArr5 = j0Var.f;
            if (iArr5.length > 0) {
                if (e.a(textView) != -1.0f) {
                    e.b(textView, Math.round(j0Var.f1452d), Math.round(j0Var.f1453e), Math.round(j0Var.f1451c), 0);
                } else {
                    e.c(textView, iArr5, 0);
                }
            }
        }
        l1 l1Var3 = new l1(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int i18 = l1Var3.i(8, -1);
        if (i18 != -1) {
            jVar = a10;
            drawable = jVar.b(context, i18);
        } else {
            jVar = a10;
            drawable = null;
        }
        int i19 = l1Var3.i(13, -1);
        if (i19 != -1) {
            drawable2 = jVar.b(context, i19);
        } else {
            drawable2 = null;
        }
        int i20 = l1Var3.i(9, -1);
        if (i20 != -1) {
            drawable3 = jVar.b(context, i20);
        } else {
            drawable3 = null;
        }
        int i21 = l1Var3.i(6, -1);
        if (i21 != -1) {
            drawable4 = jVar.b(context, i21);
        } else {
            drawable4 = null;
        }
        int i22 = l1Var3.i(10, -1);
        if (i22 != -1) {
            drawable5 = jVar.b(context, i22);
        } else {
            drawable5 = null;
        }
        int i23 = l1Var3.i(7, -1);
        if (i23 != -1) {
            drawable6 = jVar.b(context, i23);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] a11 = b.a(textView);
                Drawable drawable7 = a11[0];
                if (drawable7 == null && a11[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                } else {
                    if (drawable2 == null) {
                        drawable2 = a11[1];
                    }
                    Drawable drawable8 = a11[2];
                    if (drawable4 == null) {
                        drawable4 = a11[3];
                    }
                    b.b(textView, drawable7, drawable2, drawable8, drawable4);
                }
            }
        } else {
            Drawable[] a12 = b.a(textView);
            if (drawable5 == null) {
                drawable5 = a12[0];
            }
            if (drawable2 == null) {
                drawable2 = a12[1];
            }
            if (drawable6 == null) {
                drawable6 = a12[2];
            }
            if (drawable4 == null) {
                drawable4 = a12[3];
            }
            b.b(textView, drawable5, drawable2, drawable6, drawable4);
        }
        if (l1Var3.l(11)) {
            ColorStateList b10 = l1Var3.b(11);
            if (Build.VERSION.SDK_INT >= 24) {
                k.c.f(textView, b10);
            } else if (textView instanceof androidx.core.widget.p) {
                ((androidx.core.widget.p) textView).setSupportCompoundDrawablesTintList(b10);
            }
        }
        if (l1Var3.l(12)) {
            fontMetricsInt = null;
            PorterDuff.Mode c10 = q0.c(l1Var3.h(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                k.c.g(textView, c10);
            } else if (textView instanceof androidx.core.widget.p) {
                ((androidx.core.widget.p) textView).setSupportCompoundDrawablesTintMode(c10);
            }
        } else {
            fontMetricsInt = null;
        }
        int d10 = l1Var3.d(15, -1);
        int d11 = l1Var3.d(18, -1);
        int d12 = l1Var3.d(19, -1);
        l1Var3.n();
        if (d10 != -1) {
            androidx.core.widget.k.b(textView, d10);
        }
        if (d11 != -1) {
            androidx.core.widget.k.c(textView, d11);
        }
        if (d12 != -1) {
            kc.f.o(d12);
            int fontMetricsInt2 = textView.getPaint().getFontMetricsInt(fontMetricsInt);
            if (d12 != fontMetricsInt2) {
                textView.setLineSpacing(d12 - fontMetricsInt2, 1.0f);
            }
        }
    }

    public final void g(int i6, Context context) {
        String j10;
        ColorStateList b10;
        ColorStateList b11;
        ColorStateList b12;
        l1 l1Var = new l1(context, context.obtainStyledAttributes(i6, kc.f.W));
        boolean l2 = l1Var.l(14);
        TextView textView = this.f1367a;
        if (l2) {
            textView.setAllCaps(l1Var.a(14, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            if (l1Var.l(3) && (b12 = l1Var.b(3)) != null) {
                textView.setTextColor(b12);
            }
            if (l1Var.l(5) && (b11 = l1Var.b(5)) != null) {
                textView.setLinkTextColor(b11);
            }
            if (l1Var.l(4) && (b10 = l1Var.b(4)) != null) {
                textView.setHintTextColor(b10);
            }
        }
        if (l1Var.l(0) && l1Var.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, l1Var);
        if (i10 >= 26 && l1Var.l(13) && (j10 = l1Var.j(13)) != null) {
            e.d(textView, j10);
        }
        l1Var.n();
        Typeface typeface = this.f1377l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f1375j);
        }
    }

    public final void i(int i6, int i10, int i11, int i12) {
        j0 j0Var = this.f1374i;
        if (j0Var.i()) {
            DisplayMetrics displayMetrics = j0Var.f1457j.getResources().getDisplayMetrics();
            j0Var.j(TypedValue.applyDimension(i12, i6, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (j0Var.g()) {
                j0Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i6) {
        j0 j0Var = this.f1374i;
        if (j0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i6 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = j0Var.f1457j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArr2[i10] = Math.round(TypedValue.applyDimension(i6, iArr[i10], displayMetrics));
                    }
                }
                j0Var.f = j0.b(iArr2);
                if (!j0Var.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                j0Var.f1454g = false;
            }
            if (j0Var.g()) {
                j0Var.a();
            }
        }
    }

    public final void k(int i6) {
        j0 j0Var = this.f1374i;
        if (j0Var.i()) {
            if (i6 != 0) {
                if (i6 == 1) {
                    DisplayMetrics displayMetrics = j0Var.f1457j.getResources().getDisplayMetrics();
                    j0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (j0Var.g()) {
                        j0Var.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(defpackage.c.p("Unknown auto-size text type: ", i6));
            }
            j0Var.f1449a = 0;
            j0Var.f1452d = -1.0f;
            j0Var.f1453e = -1.0f;
            j0Var.f1451c = -1.0f;
            j0Var.f = new int[0];
            j0Var.f1450b = false;
        }
    }

    public final void l(ColorStateList colorStateList) {
        boolean z10;
        if (this.f1373h == null) {
            this.f1373h = new j1();
        }
        j1 j1Var = this.f1373h;
        j1Var.f1459a = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        j1Var.f1462d = z10;
        this.f1368b = j1Var;
        this.f1369c = j1Var;
        this.f1370d = j1Var;
        this.f1371e = j1Var;
        this.f = j1Var;
        this.f1372g = j1Var;
    }

    public final void m(PorterDuff.Mode mode) {
        boolean z10;
        if (this.f1373h == null) {
            this.f1373h = new j1();
        }
        j1 j1Var = this.f1373h;
        j1Var.f1460b = mode;
        if (mode != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        j1Var.f1461c = z10;
        this.f1368b = j1Var;
        this.f1369c = j1Var;
        this.f1370d = j1Var;
        this.f1371e = j1Var;
        this.f = j1Var;
        this.f1372g = j1Var;
    }

    public final void n(Context context, l1 l1Var) {
        String j10;
        boolean z10;
        boolean z11;
        this.f1375j = l1Var.h(2, this.f1375j);
        int i6 = Build.VERSION.SDK_INT;
        boolean z12 = false;
        if (i6 >= 28) {
            int h10 = l1Var.h(11, -1);
            this.f1376k = h10;
            if (h10 != -1) {
                this.f1375j = (this.f1375j & 2) | 0;
            }
        }
        int i10 = 10;
        if (!l1Var.l(10) && !l1Var.l(12)) {
            if (l1Var.l(1)) {
                this.f1378m = false;
                int h11 = l1Var.h(1, 1);
                if (h11 != 1) {
                    if (h11 != 2) {
                        if (h11 == 3) {
                            this.f1377l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f1377l = Typeface.SERIF;
                    return;
                }
                this.f1377l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f1377l = null;
        if (l1Var.l(12)) {
            i10 = 12;
        }
        int i11 = this.f1376k;
        int i12 = this.f1375j;
        if (!context.isRestricted()) {
            try {
                Typeface g5 = l1Var.g(i10, this.f1375j, new a(i11, i12, new WeakReference(this.f1367a)));
                if (g5 != null) {
                    if (i6 >= 28 && this.f1376k != -1) {
                        Typeface create = Typeface.create(g5, 0);
                        int i13 = this.f1376k;
                        if ((this.f1375j & 2) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f1377l = f.a(create, i13, z11);
                    } else {
                        this.f1377l = g5;
                    }
                }
                if (this.f1377l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f1378m = z10;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1377l == null && (j10 = l1Var.j(i10)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f1376k != -1) {
                Typeface create2 = Typeface.create(j10, 0);
                int i14 = this.f1376k;
                if ((this.f1375j & 2) != 0) {
                    z12 = true;
                }
                this.f1377l = f.a(create2, i14, z12);
                return;
            }
            this.f1377l = Typeface.create(j10, this.f1375j);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f1379a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1380b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f1381c;

        public a(int i6, int i10, WeakReference weakReference) {
            this.f1379a = i6;
            this.f1380b = i10;
            this.f1381c = weakReference;
        }

        @Override // i0.f.e
        public final void d(Typeface typeface) {
            int i6;
            boolean z10;
            if (Build.VERSION.SDK_INT >= 28 && (i6 = this.f1379a) != -1) {
                if ((this.f1380b & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                typeface = f.a(typeface, i6, z10);
            }
            c0 c0Var = c0.this;
            if (c0Var.f1378m) {
                c0Var.f1377l = typeface;
                TextView textView = (TextView) this.f1381c.get();
                if (textView != null) {
                    WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
                    if (d0.g.b(textView)) {
                        textView.post(new d0(textView, typeface, c0Var.f1375j));
                    } else {
                        textView.setTypeface(typeface, c0Var.f1375j);
                    }
                }
            }
        }

        @Override // i0.f.e
        public final void c(int i6) {
        }
    }
}
