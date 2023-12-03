package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
/* compiled from: TypefaceEmojiSpan.java */
/* loaded from: classes.dex */
public final class q extends k {
    public q(i iVar) {
        super(iVar);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i6, int i10, float f, int i11, int i12, int i13, Paint paint) {
        f.a().getClass();
        i iVar = this.f2069v;
        o oVar = iVar.f2058b;
        Typeface typeface = oVar.f2085d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        int i14 = iVar.f2057a * 2;
        canvas.drawText(oVar.f2083b, i14, 2, f, i12, paint);
        paint.setTypeface(typeface2);
    }
}
