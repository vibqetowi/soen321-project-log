package h;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import h.b;
/* compiled from: StateListDrawableCompat.java */
/* loaded from: classes.dex */
public class d extends b {
    public a H;
    public boolean I;

    /* compiled from: StateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class a extends b.c {
        public int[][] H;

        public a(a aVar, d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.H = aVar.H;
            } else {
                this.H = new int[this.f16979g.length];
            }
        }

        @Override // h.b.c
        public void e() {
            int[] iArr;
            int[][] iArr2 = this.H;
            int[][] iArr3 = new int[iArr2.length];
            for (int length = iArr2.length - 1; length >= 0; length--) {
                int[] iArr4 = this.H[length];
                if (iArr4 != null) {
                    iArr = (int[]) iArr4.clone();
                } else {
                    iArr = null;
                }
                iArr3[length] = iArr;
            }
            this.H = iArr3;
        }

        public final int f(int[] iArr) {
            int[][] iArr2 = this.H;
            int i6 = this.f16980h;
            for (int i10 = 0; i10 < i6; i10++) {
                if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new d(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new d(this, resources);
        }
    }

    public d(a aVar, Resources resources) {
        e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // h.b, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // h.b
    public void e(b.c cVar) {
        this.f16966u = cVar;
        int i6 = this.A;
        if (i6 >= 0) {
            Drawable d10 = cVar.d(i6);
            this.f16968w = d10;
            if (d10 != null) {
                c(d10);
            }
        }
        this.f16969x = null;
        if (cVar instanceof a) {
            this.H = (a) cVar;
        }
    }

    @Override // h.b
    /* renamed from: f */
    public a b() {
        return new a(this.H, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // h.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.I) {
            super.mutate();
            this.H.e();
            this.I = true;
        }
        return this;
    }

    @Override // h.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int f = this.H.f(iArr);
        if (f < 0) {
            f = this.H.f(StateSet.WILD_CARD);
        }
        if (!d(f) && !onStateChange) {
            return false;
        }
        return true;
    }

    public d() {
    }
}
