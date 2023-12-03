package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;
import java.util.stream.IntStream;
/* compiled from: UnprecomputeTextOnModificationSpannable.java */
/* loaded from: classes.dex */
public final class t implements Spannable {

    /* renamed from: u  reason: collision with root package name */
    public boolean f2092u = false;

    /* renamed from: v  reason: collision with root package name */
    public Spannable f2093v;

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    /* loaded from: classes.dex */
    public static class a {
        public boolean a(Spannable spannable) {
            return spannable instanceof r0.d;
        }
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    /* loaded from: classes.dex */
    public static class b extends a {
        @Override // androidx.emoji2.text.t.a
        public final boolean a(Spannable spannable) {
            if (!(spannable instanceof PrecomputedText) && !(spannable instanceof r0.d)) {
                return false;
            }
            return true;
        }
    }

    public t(Spannable spannable) {
        this.f2093v = spannable;
    }

    public final void a() {
        a bVar;
        Spannable spannable = this.f2093v;
        if (!this.f2092u) {
            if (Build.VERSION.SDK_INT < 28) {
                bVar = new a();
            } else {
                bVar = new b();
            }
            if (bVar.a(spannable)) {
                this.f2093v = new SpannableString(spannable);
            }
        }
        this.f2092u = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i6) {
        return this.f2093v.charAt(i6);
    }

    @Override // java.lang.CharSequence
    public final /* synthetic */ IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public final /* synthetic */ java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f2093v.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f2093v.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f2093v.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i6, int i10, Class<T> cls) {
        return (T[]) this.f2093v.getSpans(i6, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f2093v.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i6, int i10, Class cls) {
        return this.f2093v.nextSpanTransition(i6, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f2093v.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i6, int i10, int i11) {
        a();
        this.f2093v.setSpan(obj, i6, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i6, int i10) {
        return this.f2093v.subSequence(i6, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f2093v.toString();
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream chars() {
        return r.a(this.f2093v);
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream codePoints() {
        return s.a(this.f2093v);
    }

    public t(CharSequence charSequence) {
        this.f2093v = new SpannableString(charSequence);
    }
}
