package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import com.theinnerhour.b2b.R;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: MenuPopupHelper.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1143a;

    /* renamed from: b  reason: collision with root package name */
    public final f f1144b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1145c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1146d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1147e;
    public View f;

    /* renamed from: g  reason: collision with root package name */
    public int f1148g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1149h;

    /* renamed from: i  reason: collision with root package name */
    public j.a f1150i;

    /* renamed from: j  reason: collision with root package name */
    public l.d f1151j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f1152k;

    /* renamed from: l  reason: collision with root package name */
    public final a f1153l;

    /* compiled from: MenuPopupHelper.java */
    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            i.this.c();
        }
    }

    /* compiled from: MenuPopupHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public i(Context context, f fVar, View view, boolean z10) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, fVar, z10);
    }

    public final l.d a() {
        boolean z10;
        l.d lVar;
        if (this.f1151j == null) {
            Context context = this.f1143a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            b.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                lVar = new androidx.appcompat.view.menu.b(this.f1143a, this.f, this.f1146d, this.f1147e, this.f1145c);
            } else {
                Context context2 = this.f1143a;
                f fVar = this.f1144b;
                lVar = new l(this.f1146d, this.f1147e, context2, this.f, fVar, this.f1145c);
            }
            lVar.n(this.f1144b);
            lVar.t(this.f1153l);
            lVar.p(this.f);
            lVar.f(this.f1150i);
            lVar.q(this.f1149h);
            lVar.r(this.f1148g);
            this.f1151j = lVar;
        }
        return this.f1151j;
    }

    public final boolean b() {
        l.d dVar = this.f1151j;
        if (dVar != null && dVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f1151j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1152k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i6, int i10, boolean z10, boolean z11) {
        l.d a10 = a();
        a10.u(z11);
        if (z10) {
            int i11 = this.f1148g;
            View view = this.f;
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if ((Gravity.getAbsoluteGravity(i11, d0.e.d(view)) & 7) == 5) {
                i6 -= this.f.getWidth();
            }
            a10.s(i6);
            a10.v(i10);
            int i12 = (int) ((this.f1143a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f23987u = new Rect(i6 - i12, i10 - i12, i6 + i12, i10 + i12);
        }
        a10.b();
    }

    public i(int i6, int i10, Context context, View view, f fVar, boolean z10) {
        this.f1148g = 8388611;
        this.f1153l = new a();
        this.f1143a = context;
        this.f1144b = fVar;
        this.f = view;
        this.f1145c = z10;
        this.f1146d = i6;
        this.f1147e = i10;
    }
}
