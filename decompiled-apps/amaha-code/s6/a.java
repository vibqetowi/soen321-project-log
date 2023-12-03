package s6;

import java.text.DecimalFormat;
/* compiled from: DefaultAxisValueFormatter.java */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final DecimalFormat f31289a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31290b;

    public a(int i6) {
        this.f31290b = 0;
        this.f31290b = i6;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < i6; i10++) {
            if (i10 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.f31289a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // s6.b
    public final String a(float f, q6.a aVar) {
        return this.f31289a.format(f);
    }
}
