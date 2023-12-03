package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
/* compiled from: EmojiSpan.java */
/* loaded from: classes.dex */
public abstract class k extends ReplacementSpan {

    /* renamed from: v  reason: collision with root package name */
    public final i f2069v;

    /* renamed from: u  reason: collision with root package name */
    public final Paint.FontMetricsInt f2068u = new Paint.FontMetricsInt();

    /* renamed from: w  reason: collision with root package name */
    public float f2070w = 1.0f;

    public k(i iVar) {
        if (iVar != null) {
            this.f2069v = iVar;
            return;
        }
        throw new NullPointerException("metadata cannot be null");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i6, int i10, Paint.FontMetricsInt fontMetricsInt) {
        short s10;
        Paint.FontMetricsInt fontMetricsInt2 = this.f2068u;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        i iVar = this.f2069v;
        d1.a c10 = iVar.c();
        int a10 = c10.a(14);
        short s11 = 0;
        if (a10 != 0) {
            s10 = c10.f12130b.getShort(a10 + c10.f12129a);
        } else {
            s10 = 0;
        }
        this.f2070w = abs / s10;
        d1.a c11 = iVar.c();
        int a11 = c11.a(14);
        if (a11 != 0) {
            c11.f12130b.getShort(a11 + c11.f12129a);
        }
        d1.a c12 = iVar.c();
        int a12 = c12.a(12);
        if (a12 != 0) {
            s11 = c12.f12130b.getShort(a12 + c12.f12129a);
        }
        short s12 = (short) (s11 * this.f2070w);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s12;
    }
}
