package qb;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.lang.reflect.Constructor;
/* compiled from: StaticLayoutBuilderCompat.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: m  reason: collision with root package name */
    public static final int f29487m;

    /* renamed from: n  reason: collision with root package name */
    public static boolean f29488n;

    /* renamed from: o  reason: collision with root package name */
    public static Constructor<StaticLayout> f29489o;

    /* renamed from: p  reason: collision with root package name */
    public static TextDirectionHeuristic f29490p;

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f29491a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f29492b;

    /* renamed from: c  reason: collision with root package name */
    public final int f29493c;

    /* renamed from: d  reason: collision with root package name */
    public int f29494d;

    /* renamed from: k  reason: collision with root package name */
    public boolean f29500k;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f29495e = Layout.Alignment.ALIGN_NORMAL;
    public int f = SubsamplingScaleImageView.TILE_SIZE_AUTO;

    /* renamed from: g  reason: collision with root package name */
    public float f29496g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f29497h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public int f29498i = f29487m;

    /* renamed from: j  reason: collision with root package name */
    public boolean f29499j = true;

    /* renamed from: l  reason: collision with root package name */
    public TextUtils.TruncateAt f29501l = null;

    /* compiled from: StaticLayoutBuilderCompat.java */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(Exception exc) {
            super("Error thrown initializing StaticLayout " + exc.getMessage(), exc);
        }
    }

    static {
        int i6;
        if (Build.VERSION.SDK_INT >= 23) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        f29487m = i6;
    }

    public p(CharSequence charSequence, TextPaint textPaint, int i6) {
        this.f29491a = charSequence;
        this.f29492b = textPaint;
        this.f29493c = i6;
        this.f29494d = charSequence.length();
    }

    public final StaticLayout a() {
        boolean z10;
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout.Builder obtain;
        TextDirectionHeuristic textDirectionHeuristic2;
        StaticLayout build;
        if (this.f29491a == null) {
            this.f29491a = "";
        }
        int max = Math.max(0, this.f29493c);
        CharSequence charSequence = this.f29491a;
        int i6 = this.f;
        TextPaint textPaint = this.f29492b;
        if (i6 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f29501l);
        }
        int min = Math.min(charSequence.length(), this.f29494d);
        this.f29494d = min;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            if (this.f29500k && this.f == 1) {
                this.f29495e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
            obtain.setAlignment(this.f29495e);
            obtain.setIncludePad(this.f29499j);
            if (this.f29500k) {
                textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic2 = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic2);
            TextUtils.TruncateAt truncateAt = this.f29501l;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f);
            float f = this.f29496g;
            if (f != 0.0f || this.f29497h != 1.0f) {
                obtain.setLineSpacing(f, this.f29497h);
            }
            if (this.f > 1) {
                obtain.setHyphenationFrequency(this.f29498i);
            }
            build = obtain.build();
            return build;
        }
        if (!f29488n) {
            try {
                if (this.f29500k && i10 >= 23) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                }
                f29490p = textDirectionHeuristic;
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                f29489o = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f29488n = true;
            } catch (Exception e10) {
                throw new a(e10);
            }
        }
        try {
            Constructor<StaticLayout> constructor = f29489o;
            constructor.getClass();
            TextDirectionHeuristic textDirectionHeuristic3 = f29490p;
            textDirectionHeuristic3.getClass();
            return constructor.newInstance(charSequence, 0, Integer.valueOf(this.f29494d), textPaint, Integer.valueOf(max), this.f29495e, textDirectionHeuristic3, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f29499j), null, Integer.valueOf(max), Integer.valueOf(this.f));
        } catch (Exception e11) {
            throw new a(e11);
        }
    }
}
