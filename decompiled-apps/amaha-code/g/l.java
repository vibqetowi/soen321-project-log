package g;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.u1;
import com.theinnerhour.b2b.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
import t0.s0;
/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class l implements t0.t {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k f16116u;

    public l(k kVar) {
        this.f16116u = kVar;
    }

    @Override // t0.t
    public final s0 i(View view, s0 s0Var) {
        boolean z10;
        View view2;
        s0 s0Var2;
        boolean z11;
        s0 j10;
        int b10;
        int c10;
        int b11;
        int d10 = s0Var.d();
        k kVar = this.f16116u;
        kVar.getClass();
        int d11 = s0Var.d();
        ActionBarContextView actionBarContextView = kVar.P;
        int i6 = 0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) kVar.P.getLayoutParams();
            boolean z12 = true;
            if (kVar.P.isShown()) {
                if (kVar.f16081x0 == null) {
                    kVar.f16081x0 = new Rect();
                    kVar.f16082y0 = new Rect();
                }
                Rect rect = kVar.f16081x0;
                Rect rect2 = kVar.f16082y0;
                rect.set(s0Var.b(), s0Var.d(), s0Var.c(), s0Var.a());
                ViewGroup viewGroup = kVar.V;
                Method method = u1.f1563a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e10) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                ViewGroup viewGroup2 = kVar.V;
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                if (Build.VERSION.SDK_INT >= 23) {
                    j10 = d0.j.a(viewGroup2);
                } else {
                    j10 = d0.i.j(viewGroup2);
                }
                if (j10 == null) {
                    b10 = 0;
                } else {
                    b10 = j10.b();
                }
                if (j10 == null) {
                    c10 = 0;
                } else {
                    c10 = j10.c();
                }
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                Context context = kVar.E;
                if (i10 > 0 && kVar.X == null) {
                    View view3 = new View(context);
                    kVar.X = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    kVar.V.addView(kVar.X, -1, layoutParams);
                } else {
                    View view4 = kVar.X;
                    if (view4 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view4.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            kVar.X.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view5 = kVar.X;
                if (view5 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && view5.getVisibility() != 0) {
                    View view6 = kVar.X;
                    if ((d0.d.g(view6) & 8192) == 0) {
                        z12 = false;
                    }
                    if (z12) {
                        b11 = g0.a.b(context, R.color.abc_decor_view_status_guard_light);
                    } else {
                        b11 = g0.a.b(context, R.color.abc_decor_view_status_guard);
                    }
                    view6.setBackgroundColor(b11);
                }
                if (!kVar.c0 && z10) {
                    d11 = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                } else {
                    z12 = false;
                }
                z11 = z12;
                z10 = false;
            }
            if (z11) {
                kVar.P.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view7 = kVar.X;
        if (view7 != null) {
            if (!z10) {
                i6 = 8;
            }
            view7.setVisibility(i6);
        }
        if (d10 != d11) {
            s0Var2 = s0Var.f(s0Var.b(), d11, s0Var.c(), s0Var.a());
            view2 = view;
        } else {
            view2 = view;
            s0Var2 = s0Var;
        }
        return d0.l(view2, s0Var2);
    }
}
