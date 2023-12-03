package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: SpannableBuilder.java */
/* loaded from: classes.dex */
public final class p extends SpannableStringBuilder {

    /* renamed from: u  reason: collision with root package name */
    public final Class<?> f2088u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f2089v;

    /* compiled from: SpannableBuilder.java */
    /* loaded from: classes.dex */
    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: u  reason: collision with root package name */
        public final Object f2090u;

        /* renamed from: v  reason: collision with root package name */
        public final AtomicInteger f2091v = new AtomicInteger(0);

        public a(Object obj) {
            this.f2090u = obj;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f2090u).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            ((TextWatcher) this.f2090u).beforeTextChanged(charSequence, i6, i10, i11);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanAdded(Spannable spannable, Object obj, int i6, int i10) {
            if (this.f2091v.get() > 0 && (obj instanceof k)) {
                return;
            }
            ((SpanWatcher) this.f2090u).onSpanAdded(spannable, obj, i6, i10);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanChanged(Spannable spannable, Object obj, int i6, int i10, int i11, int i12) {
            int i13;
            int i14;
            if (this.f2091v.get() > 0 && (obj instanceof k)) {
                return;
            }
            if (Build.VERSION.SDK_INT < 28) {
                if (i6 > i10) {
                    i6 = 0;
                }
                if (i11 > i12) {
                    i13 = i6;
                    i14 = 0;
                    ((SpanWatcher) this.f2090u).onSpanChanged(spannable, obj, i13, i10, i14, i12);
                }
            }
            i13 = i6;
            i14 = i11;
            ((SpanWatcher) this.f2090u).onSpanChanged(spannable, obj, i13, i10, i14, i12);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanRemoved(Spannable spannable, Object obj, int i6, int i10) {
            if (this.f2091v.get() > 0 && (obj instanceof k)) {
                return;
            }
            ((SpanWatcher) this.f2090u).onSpanRemoved(spannable, obj, i6, i10);
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            ((TextWatcher) this.f2090u).onTextChanged(charSequence, i6, i10, i11);
        }
    }

    public p(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f2089v = new ArrayList();
        if (cls != null) {
            this.f2088u = cls;
            return;
        }
        throw new NullPointerException("watcherClass cannot be null");
    }

    public final void a() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f2089v;
            if (i6 < arrayList.size()) {
                ((a) arrayList.get(i6)).f2091v.incrementAndGet();
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f2089v;
            if (i6 < arrayList.size()) {
                ((a) arrayList.get(i6)).onTextChanged(this, 0, length(), length());
                i6++;
            } else {
                return;
            }
        }
    }

    public final a c(Object obj) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f2089v;
            if (i6 < arrayList.size()) {
                a aVar = (a) arrayList.get(i6);
                if (aVar.f2090u == obj) {
                    return aVar;
                }
                i6++;
            } else {
                return null;
            }
        }
    }

    public final boolean d(Object obj) {
        boolean z10;
        if (obj == null) {
            return false;
        }
        if (this.f2088u == obj.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i6, int i10) {
        super.delete(i6, i10);
        return this;
    }

    public final void e() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f2089v;
            if (i6 < arrayList.size()) {
                ((a) arrayList.get(i6)).f2091v.decrementAndGet();
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        a c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        a c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        a c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final <T> T[] getSpans(int i6, int i10, Class<T> cls) {
        boolean z10;
        if (this.f2088u == cls) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a[] aVarArr = (a[]) super.getSpans(i6, i10, a.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
            for (int i11 = 0; i11 < aVarArr.length; i11++) {
                tArr[i11] = aVarArr[i11].f2090u;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i6, i10, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i6, CharSequence charSequence) {
        super.insert(i6, charSequence);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0009, code lost:
        if (r0 != false) goto L10;
     */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int nextSpanTransition(int i6, int i10, Class cls) {
        boolean z10;
        if (cls != null) {
            if (this.f2088u == cls) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        cls = a.class;
        return super.nextSpanTransition(i6, i10, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        a aVar;
        if (d(obj)) {
            aVar = c(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f2089v.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i6, int i10, CharSequence charSequence) {
        replace(i6, i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i6, int i10, int i11) {
        if (d(obj)) {
            a aVar = new a(obj);
            this.f2089v.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i6, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i6, int i10) {
        return new p(this.f2088u, this, i6, i10);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i6, int i10) {
        super.delete(i6, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i6, CharSequence charSequence) {
        super.insert(i6, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i6, int i10, CharSequence charSequence, int i11, int i12) {
        replace(i6, i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i6, CharSequence charSequence, int i10, int i11) {
        super.insert(i6, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i6, int i10, CharSequence charSequence) {
        a();
        super.replace(i6, i10, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i6, CharSequence charSequence, int i10, int i11) {
        super.insert(i6, charSequence, i10, i11);
        return this;
    }

    public p(Class<?> cls, CharSequence charSequence, int i6, int i10) {
        super(charSequence, i6, i10);
        this.f2089v = new ArrayList();
        if (cls != null) {
            this.f2088u = cls;
            return;
        }
        throw new NullPointerException("watcherClass cannot be null");
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i6, int i10, CharSequence charSequence, int i11, int i12) {
        a();
        super.replace(i6, i10, charSequence, i11, i12);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i6, int i10) {
        super.append(charSequence, i6, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i6, int i10) {
        super.append(charSequence, i6, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i6, int i10) {
        super.append(charSequence, i6, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i6) {
        super.append(charSequence, obj, i6);
        return this;
    }
}
