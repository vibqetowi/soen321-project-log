package ub;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import i0.f;
import ug.l;
/* compiled from: TextAppearance.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f33979a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33980b;

    /* renamed from: c  reason: collision with root package name */
    public final int f33981c;

    /* renamed from: d  reason: collision with root package name */
    public final int f33982d;

    /* renamed from: e  reason: collision with root package name */
    public final float f33983e;
    public final float f;

    /* renamed from: g  reason: collision with root package name */
    public final float f33984g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f33985h;

    /* renamed from: i  reason: collision with root package name */
    public final float f33986i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f33987j;

    /* renamed from: k  reason: collision with root package name */
    public float f33988k;

    /* renamed from: l  reason: collision with root package name */
    public final int f33989l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f33990m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f33991n;

    /* compiled from: TextAppearance.java */
    /* loaded from: classes.dex */
    public class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.android.volley.toolbox.a f33992a;

        public a(com.android.volley.toolbox.a aVar) {
            this.f33992a = aVar;
        }

        @Override // i0.f.e
        public final void c(int i6) {
            e.this.f33990m = true;
            this.f33992a.m(i6);
        }

        @Override // i0.f.e
        public final void d(Typeface typeface) {
            e eVar = e.this;
            eVar.f33991n = Typeface.create(typeface, eVar.f33981c);
            eVar.f33990m = true;
            this.f33992a.n(eVar.f33991n, false);
        }
    }

    public e(Context context, int i6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i6, l.N);
        this.f33988k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f33987j = d.a(context, obtainStyledAttributes, 3);
        d.a(context, obtainStyledAttributes, 4);
        d.a(context, obtainStyledAttributes, 5);
        this.f33981c = obtainStyledAttributes.getInt(2, 0);
        this.f33982d = obtainStyledAttributes.getInt(1, 1);
        int i10 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f33989l = obtainStyledAttributes.getResourceId(i10, 0);
        this.f33980b = obtainStyledAttributes.getString(i10);
        obtainStyledAttributes.getBoolean(14, false);
        this.f33979a = d.a(context, obtainStyledAttributes, 6);
        this.f33983e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f33984g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i6, l.f34142z);
        this.f33985h = obtainStyledAttributes2.hasValue(0);
        this.f33986i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f33991n;
        int i6 = this.f33981c;
        if (typeface == null && (str = this.f33980b) != null) {
            this.f33991n = Typeface.create(str, i6);
        }
        if (this.f33991n == null) {
            int i10 = this.f33982d;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        this.f33991n = Typeface.DEFAULT;
                    } else {
                        this.f33991n = Typeface.MONOSPACE;
                    }
                } else {
                    this.f33991n = Typeface.SERIF;
                }
            } else {
                this.f33991n = Typeface.SANS_SERIF;
            }
            this.f33991n = Typeface.create(this.f33991n, i6);
        }
    }

    public final Typeface b(Context context) {
        if (this.f33990m) {
            return this.f33991n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface b10 = i0.f.b(this.f33989l, context);
                this.f33991n = b10;
                if (b10 != null) {
                    this.f33991n = Typeface.create(b10, this.f33981c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f33980b, e10);
            }
        }
        a();
        this.f33990m = true;
        return this.f33991n;
    }

    public final void c(Context context, com.android.volley.toolbox.a aVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i6 = this.f33989l;
        if (i6 == 0) {
            this.f33990m = true;
        }
        if (this.f33990m) {
            aVar.n(this.f33991n, true);
            return;
        }
        try {
            a aVar2 = new a(aVar);
            ThreadLocal<TypedValue> threadLocal = i0.f.f19628a;
            if (context.isRestricted()) {
                aVar2.a(-4);
            } else {
                i0.f.c(context, i6, new TypedValue(), 0, aVar2, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f33990m = true;
            aVar.m(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f33980b, e10);
            this.f33990m = true;
            aVar.m(-3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(Context context) {
        Typeface typeface;
        int i6 = this.f33989l;
        if (i6 != 0) {
            ThreadLocal<TypedValue> threadLocal = i0.f.f19628a;
            if (!context.isRestricted()) {
                typeface = i0.f.c(context, i6, new TypedValue(), 0, null, false, true);
                if (typeface == null) {
                    return true;
                }
                return false;
            }
        }
        typeface = null;
        if (typeface == null) {
        }
    }

    public final void e(Context context, TextPaint textPaint, com.android.volley.toolbox.a aVar) {
        int i6;
        int i10;
        f(context, textPaint, aVar);
        ColorStateList colorStateList = this.f33987j;
        if (colorStateList != null) {
            i6 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i6 = -16777216;
        }
        textPaint.setColor(i6);
        ColorStateList colorStateList2 = this.f33979a;
        if (colorStateList2 != null) {
            i10 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i10 = 0;
        }
        textPaint.setShadowLayer(this.f33984g, this.f33983e, this.f, i10);
    }

    public final void f(Context context, TextPaint textPaint, com.android.volley.toolbox.a aVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f33991n);
        c(context, new f(this, context, textPaint, aVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z10;
        float f;
        Typeface a10 = g.a(context.getResources().getConfiguration(), typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i6 = (~typeface.getStyle()) & this.f33981c;
        if ((i6 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setFakeBoldText(z10);
        if ((i6 & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f33988k);
        if (this.f33985h) {
            textPaint.setLetterSpacing(this.f33986i);
        }
    }
}
