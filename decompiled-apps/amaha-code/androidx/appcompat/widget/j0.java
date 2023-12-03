package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f1447l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    public static final ConcurrentHashMap<String, Method> f1448m = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int f1449a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1450b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f1451c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f1452d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f1453e = -1.0f;
    public int[] f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f1454g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f1455h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f1456i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f1457j;

    /* renamed from: k  reason: collision with root package name */
    public final f f1458k;

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i6, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i6, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static boolean a(View view) {
            return view.isInLayout();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static final class c {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i6, int i10, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain;
            StaticLayout.Builder alignment2;
            StaticLayout.Builder lineSpacing;
            StaticLayout.Builder includePad;
            int breakStrategy;
            StaticLayout.Builder breakStrategy2;
            int hyphenationFrequency;
            StaticLayout.Builder hyphenationFrequency2;
            StaticLayout build;
            obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i6);
            alignment2 = obtain.setAlignment(alignment);
            lineSpacing = alignment2.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
            includePad = lineSpacing.setIncludePad(textView.getIncludeFontPadding());
            breakStrategy = textView.getBreakStrategy();
            breakStrategy2 = includePad.setBreakStrategy(breakStrategy);
            hyphenationFrequency = textView.getHyphenationFrequency();
            hyphenationFrequency2 = breakStrategy2.setHyphenationFrequency(hyphenationFrequency);
            if (i10 == -1) {
                i10 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            }
            hyphenationFrequency2.setMaxLines(i10);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            build = obtain.build();
            return build;
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static class d extends f {
        @Override // androidx.appcompat.widget.j0.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) j0.e("getTextDirectionHeuristic", textView, TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static class e extends d {
        @Override // androidx.appcompat.widget.j0.d, androidx.appcompat.widget.j0.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.j0.f
        public boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public j0(TextView textView) {
        this.f1456i = textView;
        this.f1457j = textView.getContext();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            this.f1458k = new e();
        } else if (i6 >= 23) {
            this.f1458k = new d();
        } else {
            this.f1458k = new f();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i6 : iArr) {
            if (i6 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i6)) < 0) {
                arrayList.add(Integer.valueOf(i6));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f1448m;
            Method method = concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object e(String str, Object obj, Object obj2) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public final void a() {
        boolean z10;
        int measuredWidth;
        if (i() && this.f1449a != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        if (this.f1450b) {
            if (this.f1456i.getMeasuredHeight() > 0 && this.f1456i.getMeasuredWidth() > 0) {
                if (this.f1458k.b(this.f1456i)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.f1456i.getMeasuredWidth() - this.f1456i.getTotalPaddingLeft()) - this.f1456i.getTotalPaddingRight();
                }
                int height = (this.f1456i.getHeight() - this.f1456i.getCompoundPaddingBottom()) - this.f1456i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f1447l;
                    synchronized (rectF) {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c10 = c(rectF);
                        if (c10 != this.f1456i.getTextSize()) {
                            f(c10, 0);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f1450b = true;
    }

    public final int c(RectF rectF) {
        int i6;
        StaticLayout a10;
        boolean z10;
        CharSequence transformation;
        int length = this.f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                int i14 = this.f[i13];
                TextView textView = this.f1456i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    text = transformation;
                }
                int i15 = Build.VERSION.SDK_INT;
                int b10 = a.b(textView);
                TextPaint textPaint = this.f1455h;
                if (textPaint == null) {
                    this.f1455h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f1455h.set(textView.getPaint());
                this.f1455h.setTextSize(i14);
                Layout.Alignment alignment = (Layout.Alignment) e("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL);
                int round = Math.round(rectF.right);
                if (i15 >= 23) {
                    i6 = b10;
                    a10 = c.a(text, alignment, round, b10, this.f1456i, this.f1455h, this.f1458k);
                } else {
                    i6 = b10;
                    a10 = a.a(text, alignment, round, textView, this.f1455h);
                }
                if ((i6 != -1 && (a10.getLineCount() > i6 || a10.getLineEnd(a10.getLineCount() - 1) != text.length())) || a10.getHeight() > rectF.bottom) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    int i16 = i13 + 1;
                    i12 = i11;
                    i11 = i16;
                } else {
                    i12 = i13 - 1;
                    i10 = i12;
                }
            }
            return this.f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void f(float f2, int i6) {
        Resources resources;
        Context context = this.f1457j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i6, f2, resources.getDisplayMetrics());
        TextView textView = this.f1456i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a10 = b.a(textView);
            if (textView.getLayout() != null) {
                this.f1450b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(textView, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!a10) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (i() && this.f1449a == 1) {
            if (!this.f1454g || this.f.length == 0) {
                int floor = ((int) Math.floor((this.f1453e - this.f1452d) / this.f1451c)) + 1;
                int[] iArr = new int[floor];
                for (int i6 = 0; i6 < floor; i6++) {
                    iArr[i6] = Math.round((i6 * this.f1451c) + this.f1452d);
                }
                this.f = b(iArr);
            }
            this.f1450b = true;
        } else {
            this.f1450b = false;
        }
        return this.f1450b;
    }

    public final boolean h() {
        boolean z10;
        int[] iArr = this.f;
        int length = iArr.length;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1454g = z10;
        if (z10) {
            this.f1449a = 1;
            this.f1452d = iArr[0];
            this.f1453e = iArr[length - 1];
            this.f1451c = -1.0f;
        }
        return z10;
    }

    public final boolean i() {
        return !(this.f1456i instanceof k);
    }

    public final void j(float f2, float f10, float f11) {
        if (f2 > 0.0f) {
            if (f10 > f2) {
                if (f11 > 0.0f) {
                    this.f1449a = 1;
                    this.f1452d = f2;
                    this.f1453e = f10;
                    this.f1451c = f11;
                    this.f1454g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static class f {
        public boolean b(TextView textView) {
            return ((Boolean) j0.e("getHorizontallyScrolling", textView, Boolean.FALSE)).booleanValue();
        }

        public void a(StaticLayout.Builder builder, TextView textView) {
        }
    }
}
