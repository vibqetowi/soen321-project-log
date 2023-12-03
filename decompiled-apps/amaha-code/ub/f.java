package ub;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
/* compiled from: TextAppearance.java */
/* loaded from: classes.dex */
public final class f extends com.android.volley.toolbox.a {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Context f33994v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TextPaint f33995w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ com.android.volley.toolbox.a f33996x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ e f33997y;

    public f(e eVar, Context context, TextPaint textPaint, com.android.volley.toolbox.a aVar) {
        this.f33997y = eVar;
        this.f33994v = context;
        this.f33995w = textPaint;
        this.f33996x = aVar;
    }

    @Override // com.android.volley.toolbox.a
    public final void m(int i6) {
        this.f33996x.m(i6);
    }

    @Override // com.android.volley.toolbox.a
    public final void n(Typeface typeface, boolean z10) {
        this.f33997y.g(this.f33994v, this.f33995w, typeface);
        this.f33996x.n(typeface, z10);
    }
}
