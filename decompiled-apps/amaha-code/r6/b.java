package r6;

import android.graphics.Color;
import com.appsflyer.R;
import java.util.ArrayList;
/* compiled from: BarDataSet.java */
/* loaded from: classes.dex */
public final class b extends e<c> implements v6.a {

    /* renamed from: u  reason: collision with root package name */
    public int f30484u;

    /* renamed from: v  reason: collision with root package name */
    public int f30485v;

    /* renamed from: w  reason: collision with root package name */
    public final int f30486w;

    /* renamed from: x  reason: collision with root package name */
    public final int f30487x;

    /* renamed from: y  reason: collision with root package name */
    public final String[] f30488y;

    public b(ArrayList arrayList) {
        super(arrayList);
        this.f30484u = 1;
        this.f30485v = Color.rgb(215, 215, 215);
        this.f30486w = -16777216;
        this.f30487x = R.styleable.AppCompatTheme_windowFixedHeightMajor;
        this.f30488y = new String[]{"Stack"};
        this.f30489t = Color.rgb(0, 0, 0);
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            ((c) arrayList.get(i6)).getClass();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((c) arrayList.get(i10)).getClass();
        }
    }

    @Override // v6.a
    public final int F() {
        return this.f30485v;
    }

    @Override // v6.a
    public final int N() {
        return this.f30484u;
    }

    @Override // v6.a
    public final int R() {
        return this.f30487x;
    }

    @Override // v6.a
    public final boolean V() {
        if (this.f30484u > 1) {
            return true;
        }
        return false;
    }

    @Override // v6.a
    public final String[] X() {
        return this.f30488y;
    }

    @Override // v6.a
    public final int i() {
        return this.f30486w;
    }

    @Override // r6.i
    public final void l0(j jVar) {
        c cVar = (c) jVar;
        if (cVar != null && !Float.isNaN(cVar.f30503u)) {
            float f = cVar.f30503u;
            if (f < this.f30515q) {
                this.f30515q = f;
            }
            if (f > this.f30514p) {
                this.f30514p = f;
            }
            m0(cVar);
        }
    }

    @Override // v6.a
    public final void o() {
    }
}
