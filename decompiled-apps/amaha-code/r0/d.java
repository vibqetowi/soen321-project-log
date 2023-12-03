package r0;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
/* compiled from: PrecomputedTextCompat.java */
/* loaded from: classes.dex */
public final class d implements Spannable {
    @Override // java.lang.CharSequence
    public final char charAt(int i6) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i6, int i10, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            defpackage.e.p(i6, i10, cls);
            throw null;
        }
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i6, int i10, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                pl.a.i(obj);
                throw null;
            }
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i6, int i10, int i11) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                defpackage.d.n(obj, i6, i10, i11);
                throw null;
            }
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i6, int i10) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        throw null;
    }

    /* compiled from: PrecomputedTextCompat.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f30173a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f30174b;

        /* renamed from: c  reason: collision with root package name */
        public final int f30175c;

        /* renamed from: d  reason: collision with root package name */
        public final int f30176d;

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i6, int i10) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i6).setHyphenationFrequency(i10).setTextDirection(textDirectionHeuristic).build();
            }
            this.f30173a = textPaint;
            this.f30174b = textDirectionHeuristic;
            this.f30175c = i6;
            this.f30176d = i10;
        }

        public final boolean a(a aVar) {
            LocaleList textLocales;
            LocaleList textLocales2;
            boolean equals;
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 23) {
                if (this.f30175c != aVar.f30175c || this.f30176d != aVar.f30176d) {
                    return false;
                }
            }
            TextPaint textPaint = this.f30173a;
            if (textPaint.getTextSize() != aVar.f30173a.getTextSize()) {
                return false;
            }
            float textScaleX = textPaint.getTextScaleX();
            TextPaint textPaint2 = aVar.f30173a;
            if (textScaleX != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags()) {
                return false;
            }
            if (i6 >= 24) {
                textLocales = textPaint.getTextLocales();
                textLocales2 = textPaint2.getTextLocales();
                equals = textLocales.equals(textLocales2);
                if (!equals) {
                    return false;
                }
            } else if (!textPaint.getTextLocale().equals(textPaint2.getTextLocale())) {
                return false;
            }
            if (textPaint.getTypeface() == null) {
                if (textPaint2.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (a(aVar) && this.f30174b == aVar.f30174b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            LocaleList textLocales;
            int i6 = Build.VERSION.SDK_INT;
            int i10 = this.f30176d;
            int i11 = this.f30175c;
            TextDirectionHeuristic textDirectionHeuristic = this.f30174b;
            TextPaint textPaint = this.f30173a;
            if (i6 >= 24) {
                textLocales = textPaint.getTextLocales();
                return s0.b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textLocales, textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i11), Integer.valueOf(i10));
            }
            return s0.b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i11), Integer.valueOf(i10));
        }

        public final String toString() {
            String fontVariationSettings;
            LocaleList textLocales;
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder sb3 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f30173a;
            sb3.append(textPaint.getTextSize());
            sb2.append(sb3.toString());
            sb2.append(", textScaleX=" + textPaint.getTextScaleX());
            sb2.append(", textSkewX=" + textPaint.getTextSkewX());
            int i6 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            if (i6 >= 24) {
                StringBuilder sb4 = new StringBuilder(", textLocale=");
                textLocales = textPaint.getTextLocales();
                sb4.append(textLocales);
                sb2.append(sb4.toString());
            } else {
                sb2.append(", textLocale=" + textPaint.getTextLocale());
            }
            sb2.append(", typeface=" + textPaint.getTypeface());
            if (i6 >= 26) {
                StringBuilder sb5 = new StringBuilder(", variationSettings=");
                fontVariationSettings = textPaint.getFontVariationSettings();
                sb5.append(fontVariationSettings);
                sb2.append(sb5.toString());
            }
            sb2.append(", textDir=" + this.f30174b);
            sb2.append(", breakStrategy=" + this.f30175c);
            sb2.append(", hyphenationFrequency=" + this.f30176d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f30173a = textPaint;
            textDirection = params.getTextDirection();
            this.f30174b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f30175c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f30176d = hyphenationFrequency;
        }
    }
}
