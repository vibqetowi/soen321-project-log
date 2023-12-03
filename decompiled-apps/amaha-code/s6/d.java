package s6;

import java.util.ArrayList;
/* compiled from: IndexAxisValueFormatter.java */
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public String[] f31291a;

    /* renamed from: b  reason: collision with root package name */
    public int f31292b;

    public d(ArrayList arrayList) {
        this.f31291a = new String[0];
        this.f31292b = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        strArr = strArr == null ? new String[0] : strArr;
        this.f31291a = strArr;
        this.f31292b = strArr.length;
    }

    @Override // s6.b
    public final String a(float f, q6.a aVar) {
        int round = Math.round(f);
        if (round >= 0 && round < this.f31292b && round == ((int) f)) {
            return this.f31291a[round];
        }
        return "";
    }
}
