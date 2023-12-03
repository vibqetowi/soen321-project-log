package fb;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.theinnerhour.b2b.R;
import f6.b;
import java.util.WeakHashMap;
import k0.a;
import t0.d0;
import t0.o0;
import yb.f;
import yb.i;
import yb.m;
/* compiled from: MaterialButtonHelper.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: u  reason: collision with root package name */
    public static final boolean f14920u;

    /* renamed from: v  reason: collision with root package name */
    public static final boolean f14921v;

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f14922a;

    /* renamed from: b  reason: collision with root package name */
    public i f14923b;

    /* renamed from: c  reason: collision with root package name */
    public int f14924c;

    /* renamed from: d  reason: collision with root package name */
    public int f14925d;

    /* renamed from: e  reason: collision with root package name */
    public int f14926e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f14927g;

    /* renamed from: h  reason: collision with root package name */
    public int f14928h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f14929i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f14930j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f14931k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f14932l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f14933m;

    /* renamed from: q  reason: collision with root package name */
    public boolean f14937q;

    /* renamed from: s  reason: collision with root package name */
    public LayerDrawable f14938s;

    /* renamed from: t  reason: collision with root package name */
    public int f14939t;

    /* renamed from: n  reason: collision with root package name */
    public boolean f14934n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f14935o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14936p = false;
    public boolean r = true;

    static {
        int i6 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        f14920u = true;
        if (i6 > 22) {
            z10 = false;
        }
        f14921v = z10;
    }

    public a(MaterialButton materialButton, i iVar) {
        this.f14922a = materialButton;
        this.f14923b = iVar;
    }

    public final m a() {
        LayerDrawable layerDrawable = this.f14938s;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            if (this.f14938s.getNumberOfLayers() > 2) {
                return (m) this.f14938s.getDrawable(2);
            }
            return (m) this.f14938s.getDrawable(1);
        }
        return null;
    }

    public final f b(boolean z10) {
        LayerDrawable layerDrawable = this.f14938s;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            if (f14920u) {
                return (f) ((LayerDrawable) ((InsetDrawable) this.f14938s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
            }
            return (f) this.f14938s.getDrawable(!z10 ? 1 : 0);
        }
        return null;
    }

    public final void c(i iVar) {
        this.f14923b = iVar;
        if (f14921v && !this.f14935o) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            MaterialButton materialButton = this.f14922a;
            int f = d0.e.f(materialButton);
            int paddingTop = materialButton.getPaddingTop();
            int e10 = d0.e.e(materialButton);
            int paddingBottom = materialButton.getPaddingBottom();
            e();
            d0.e.k(materialButton, f, paddingTop, e10, paddingBottom);
            return;
        }
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(iVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(iVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(iVar);
        }
    }

    public final void d(int i6, int i10) {
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        MaterialButton materialButton = this.f14922a;
        int f = d0.e.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int e10 = d0.e.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i11 = this.f14926e;
        int i12 = this.f;
        this.f = i10;
        this.f14926e = i6;
        if (!this.f14935o) {
            e();
        }
        d0.e.k(materialButton, f, (paddingTop + i6) - i11, e10, (paddingBottom + i10) - i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    public final void e() {
        int i6;
        InsetDrawable insetDrawable;
        f fVar = new f(this.f14923b);
        MaterialButton materialButton = this.f14922a;
        fVar.i(materialButton.getContext());
        a.b.h(fVar, this.f14930j);
        PorterDuff.Mode mode = this.f14929i;
        if (mode != null) {
            a.b.i(fVar, mode);
        }
        ColorStateList colorStateList = this.f14931k;
        fVar.f38424u.f38440k = this.f14928h;
        fVar.invalidateSelf();
        f.b bVar = fVar.f38424u;
        if (bVar.f38434d != colorStateList) {
            bVar.f38434d = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
        f fVar2 = new f(this.f14923b);
        fVar2.setTint(0);
        float f = this.f14928h;
        if (this.f14934n) {
            i6 = b.C0(R.attr.colorSurface, materialButton);
        } else {
            i6 = 0;
        }
        fVar2.f38424u.f38440k = f;
        fVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i6);
        f.b bVar2 = fVar2.f38424u;
        if (bVar2.f38434d != valueOf) {
            bVar2.f38434d = valueOf;
            fVar2.onStateChange(fVar2.getState());
        }
        if (f14920u) {
            f fVar3 = new f(this.f14923b);
            this.f14933m = fVar3;
            a.b.g(fVar3, -1);
            ?? rippleDrawable = new RippleDrawable(vb.b.c(this.f14932l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{fVar2, fVar}), this.f14924c, this.f14926e, this.f14925d, this.f), this.f14933m);
            this.f14938s = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            vb.a aVar = new vb.a(this.f14923b);
            this.f14933m = aVar;
            a.b.h(aVar, vb.b.c(this.f14932l));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{fVar2, fVar, this.f14933m});
            this.f14938s = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.f14924c, this.f14926e, this.f14925d, this.f);
        }
        materialButton.setInternalBackground(insetDrawable);
        f b10 = b(false);
        if (b10 != null) {
            b10.j(this.f14939t);
            b10.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i6 = 0;
        f b10 = b(false);
        f b11 = b(true);
        if (b10 != null) {
            ColorStateList colorStateList = this.f14931k;
            b10.f38424u.f38440k = this.f14928h;
            b10.invalidateSelf();
            f.b bVar = b10.f38424u;
            if (bVar.f38434d != colorStateList) {
                bVar.f38434d = colorStateList;
                b10.onStateChange(b10.getState());
            }
            if (b11 != null) {
                float f = this.f14928h;
                if (this.f14934n) {
                    i6 = b.C0(R.attr.colorSurface, this.f14922a);
                }
                b11.f38424u.f38440k = f;
                b11.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i6);
                f.b bVar2 = b11.f38424u;
                if (bVar2.f38434d != valueOf) {
                    bVar2.f38434d = valueOf;
                    b11.onStateChange(b11.getState());
                }
            }
        }
    }
}
