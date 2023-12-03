package d9;
/* compiled from: DolbyVisionConfig.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12614a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final String f12615b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12616c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12617d;

    public c(int i6, int i10, String str) {
        this.f12616c = i6;
        this.f12617d = i10;
        this.f12615b = str;
    }

    public static c a(c9.q qVar) {
        String str;
        String str2;
        qVar.B(2);
        int q10 = qVar.q();
        int i6 = q10 >> 1;
        int q11 = ((qVar.q() >> 3) & 31) | ((q10 & 1) << 5);
        if (i6 != 4 && i6 != 5 && i6 != 7) {
            if (i6 == 8) {
                str = "hev1";
            } else if (i6 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        if (q11 < 10) {
            str2 = ".0";
        } else {
            str2 = ".";
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length() + 24);
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i6);
        sb2.append(str2);
        sb2.append(q11);
        return new c(i6, q11, sb2.toString());
    }

    public final String toString() {
        switch (this.f12614a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("TemplateTrackingMeta(templateName='");
                sb2.append(this.f12615b);
                sb2.append("', cardId=");
                sb2.append(this.f12616c);
                sb2.append(", widgetId=");
                return defpackage.c.s(sb2, this.f12617d, ')');
            default:
                return super.toString();
        }
    }
}
