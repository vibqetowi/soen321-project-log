package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import p6.a;
import q6.h;
import q6.i;
import t6.c;
import x6.b;
/* loaded from: classes.dex */
public class BarChart extends a<r6.a> implements u6.a {
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C0 = false;
        this.D0 = true;
        this.E0 = false;
        this.F0 = false;
    }

    @Override // u6.a
    public final boolean a() {
        return this.E0;
    }

    @Override // u6.a
    public final boolean b() {
        return this.D0;
    }

    @Override // u6.a
    public r6.a getBarData() {
        return (r6.a) this.f27931v;
    }

    @Override // p6.b
    public c h(float f, float f2) {
        if (this.f27931v == 0) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
            return null;
        }
        c a10 = getHighlighter().a(f, f2);
        if (a10 != null && this.C0) {
            return new c(a10.f32419a, a10.f32420b, a10.f32421c, a10.f32422d, a10.f, a10.f32425h, 0);
        }
        return a10;
    }

    @Override // p6.a, p6.b
    public void j() {
        super.j();
        this.J = new b(this, this.M, this.L);
        setHighlighter(new t6.a(this));
        getXAxis().f29193v = 0.5f;
        getXAxis().f29194w = 0.5f;
    }

    @Override // p6.a
    public final void n() {
        if (this.F0) {
            h hVar = this.C;
            T t3 = this.f27931v;
            hVar.a(((r6.a) t3).f30508d - (((r6.a) t3).f30483j / 2.0f), (((r6.a) t3).f30483j / 2.0f) + ((r6.a) t3).f30507c);
        } else {
            h hVar2 = this.C;
            T t10 = this.f27931v;
            hVar2.a(((r6.a) t10).f30508d, ((r6.a) t10).f30507c);
        }
        i iVar = this.f27918o0;
        i.a aVar = i.a.LEFT;
        iVar.a(((r6.a) this.f27931v).h(aVar), ((r6.a) this.f27931v).g(aVar));
        i iVar2 = this.f27919p0;
        i.a aVar2 = i.a.RIGHT;
        iVar2.a(((r6.a) this.f27931v).h(aVar2), ((r6.a) this.f27931v).g(aVar2));
    }

    public void setDrawBarShadow(boolean z10) {
        this.E0 = z10;
    }

    public void setDrawValueAboveBar(boolean z10) {
        this.D0 = z10;
    }

    public void setFitBars(boolean z10) {
        this.F0 = z10;
    }

    public void setHighlightFullBarEnabled(boolean z10) {
        this.C0 = z10;
    }
}
