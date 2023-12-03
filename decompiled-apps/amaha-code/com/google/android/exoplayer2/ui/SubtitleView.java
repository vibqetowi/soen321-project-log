package com.google.android.exoplayer2.ui;

import a9.i;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.w;
import d9.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o8.p;
import p8.a;
import z8.h;
/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements w.d {
    public boolean A;
    public int B;
    public a C;
    public View D;

    /* renamed from: u  reason: collision with root package name */
    public List<p8.a> f7064u;

    /* renamed from: v  reason: collision with root package name */
    public a9.b f7065v;

    /* renamed from: w  reason: collision with root package name */
    public int f7066w;

    /* renamed from: x  reason: collision with root package name */
    public float f7067x;

    /* renamed from: y  reason: collision with root package name */
    public float f7068y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f7069z;

    /* loaded from: classes.dex */
    public interface a {
        void a(List<p8.a> list, a9.b bVar, float f, int i6, float f2);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7064u = Collections.emptyList();
        this.f7065v = a9.b.f377g;
        this.f7066w = 0;
        this.f7067x = 0.0533f;
        this.f7068y = 0.08f;
        this.f7069z = true;
        this.A = true;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context);
        this.C = aVar;
        this.D = aVar;
        addView(aVar);
        this.B = 1;
    }

    private List<p8.a> getCuesWithStylingPreferencesApplied() {
        Object[] spans;
        if (this.f7069z && this.A) {
            return this.f7064u;
        }
        ArrayList arrayList = new ArrayList(this.f7064u.size());
        for (int i6 = 0; i6 < this.f7064u.size(); i6++) {
            p8.a aVar = this.f7064u.get(i6);
            aVar.getClass();
            a.C0467a c0467a = new a.C0467a(aVar);
            if (!this.f7069z) {
                c0467a.f28001n = false;
                CharSequence charSequence = c0467a.f27989a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        c0467a.f27989a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = c0467a.f27989a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof t8.b)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                i.a(c0467a);
            } else if (!this.A) {
                i.a(c0467a);
            }
            arrayList.add(c0467a.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (c9.w.f5205a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private a9.b getUserCaptionStyle() {
        CaptioningManager captioningManager;
        a9.b bVar;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = c9.w.f5205a;
        a9.b bVar2 = a9.b.f377g;
        if (i14 >= 19 && !isInEditMode() && (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            if (i14 >= 21) {
                if (userStyle.hasForegroundColor()) {
                    i6 = userStyle.foregroundColor;
                } else {
                    i6 = -1;
                }
                if (userStyle.hasBackgroundColor()) {
                    i10 = userStyle.backgroundColor;
                } else {
                    i10 = -16777216;
                }
                if (userStyle.hasWindowColor()) {
                    i11 = userStyle.windowColor;
                } else {
                    i11 = 0;
                }
                if (userStyle.hasEdgeType()) {
                    i12 = userStyle.edgeType;
                } else {
                    i12 = 0;
                }
                if (userStyle.hasEdgeColor()) {
                    i13 = userStyle.edgeColor;
                } else {
                    i13 = -1;
                }
                bVar = new a9.b(i6, i10, i11, i12, i13, userStyle.getTypeface());
            } else {
                bVar = new a9.b(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
            }
            return bVar;
        }
        return bVar2;
    }

    private <T extends View & a> void setView(T t3) {
        removeView(this.D);
        View view = this.D;
        if (view instanceof f) {
            ((f) view).f7137v.destroy();
        }
        this.D = t3;
        this.C = t3;
        addView(t3);
    }

    public final void d() {
        setStyle(getUserCaptionStyle());
    }

    @Override // com.google.android.exoplayer2.w.d
    public final void h(List<p8.a> list) {
        setCues(list);
    }

    public final void j() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void k() {
        this.C.a(getCuesWithStylingPreferencesApplied(), this.f7065v, this.f7067x, this.f7066w, this.f7068y);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.A = z10;
        k();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f7069z = z10;
        k();
    }

    public void setBottomPaddingFraction(float f) {
        this.f7068y = f;
        k();
    }

    public void setCues(List<p8.a> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f7064u = list;
        k();
    }

    public void setFractionalTextSize(float f) {
        this.f7066w = 0;
        this.f7067x = f;
        k();
    }

    public void setStyle(a9.b bVar) {
        this.f7065v = bVar;
        k();
    }

    public void setViewType(int i6) {
        if (this.B == i6) {
            return;
        }
        if (i6 != 1) {
            if (i6 == 2) {
                setView(new f(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            setView(new com.google.android.exoplayer2.ui.a(getContext()));
        }
        this.B = i6;
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void N() {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void T() {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void b() {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void d0() {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void e() {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void f() {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void i() {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void A(r rVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void C(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void L(int i6) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void a(g8.a aVar) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void c(q qVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void f0(v vVar) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void g(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void i0(q7.d dVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void l(int i6) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void l0(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void q(ExoPlaybackException exoPlaybackException) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void r(f0 f0Var) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void s(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void t(w.a aVar) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void w(float f) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void x(int i6) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void y(int i6) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void D(w wVar, w.c cVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void G(p pVar, h hVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void R(com.google.android.exoplayer2.q qVar, int i6) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void V(int i6, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void e0(int i6, int i10) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void v(int i6, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void z(int i6, w.e eVar, w.e eVar2) {
    }
}
