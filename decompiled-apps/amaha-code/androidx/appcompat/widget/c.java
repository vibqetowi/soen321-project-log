package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import k0.a;
/* compiled from: ActionMenuPresenter.java */
/* loaded from: classes.dex */
public final class c extends androidx.appcompat.view.menu.a {
    public d D;
    public Drawable E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final SparseBooleanArray M;
    public e N;
    public a O;
    public RunnableC0022c P;
    public b Q;
    public final f R;
    public int S;

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false);
            if (!((mVar.A.f1139x & 32) == 32)) {
                View view2 = c.this.D;
                this.f = view2 == null ? (View) c.this.B : view2;
            }
            f fVar = c.this.R;
            this.f1150i = fVar;
            l.d dVar = this.f1151j;
            if (dVar != null) {
                dVar.f(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            c cVar = c.this;
            cVar.O = null;
            cVar.S = 0;
            super.c();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0022c implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final e f1361u;

        public RunnableC0022c(e eVar) {
            this.f1361u = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.a aVar;
            c cVar = c.this;
            androidx.appcompat.view.menu.f fVar = cVar.f1059w;
            if (fVar != null && (aVar = fVar.f1097e) != null) {
                aVar.b(fVar);
            }
            View view = (View) cVar.B;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.f1361u;
                boolean z10 = true;
                if (!eVar.b()) {
                    if (eVar.f == null) {
                        z10 = false;
                    } else {
                        eVar.d(0, 0, false, false);
                    }
                }
                if (z10) {
                    cVar.N = eVar;
                }
            }
            cVar.P = null;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* compiled from: ActionMenuPresenter.java */
        /* loaded from: classes.dex */
        public class a extends t0 {
            public a(View view) {
                super(view);
            }

            @Override // androidx.appcompat.widget.t0
            public final l.f b() {
                e eVar = c.this.N;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // androidx.appcompat.widget.t0
            public final boolean c() {
                c.this.n();
                return true;
            }

            @Override // androidx.appcompat.widget.t0
            public final boolean d() {
                c cVar = c.this;
                if (cVar.P != null) {
                    return false;
                }
                cVar.b();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            p1.a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.n();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i6, int i10, int i11, int i12) {
            boolean frame = super.setFrame(i6, i10, i11, i12);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                a.b.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, d dVar) {
            super(context, fVar, dVar, true);
            this.f1148g = 8388613;
            f fVar2 = c.this.R;
            this.f1150i = fVar2;
            l.d dVar2 = this.f1151j;
            if (dVar2 != null) {
                dVar2.f(fVar2);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            c cVar = c.this;
            androidx.appcompat.view.menu.f fVar = cVar.f1059w;
            if (fVar != null) {
                fVar.c(true);
            }
            cVar.N = null;
            super.c();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class f implements j.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            if (fVar instanceof androidx.appcompat.view.menu.m) {
                fVar.k().c(false);
            }
            j.a aVar = c.this.f1061y;
            if (aVar != null) {
                aVar.c(fVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            c cVar = c.this;
            if (fVar == cVar.f1059w) {
                return false;
            }
            cVar.S = ((androidx.appcompat.view.menu.m) fVar).A.f1118a;
            j.a aVar = cVar.f1061y;
            if (aVar == null) {
                return false;
            }
            return aVar.d(fVar);
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: u  reason: collision with root package name */
        public int f1366u;

        /* compiled from: ActionMenuPresenter.java */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i6) {
                return new g[i6];
            }
        }

        public g() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeInt(this.f1366u);
        }

        public g(Parcel parcel) {
            this.f1366u = parcel.readInt();
        }
    }

    public c(Context context) {
        super(context);
        this.M = new SparseBooleanArray();
        this.R = new f();
    }

    public final View a(androidx.appcompat.view.menu.h hVar, View view, ViewGroup viewGroup) {
        k.a aVar;
        View actionView = hVar.getActionView();
        int i6 = 0;
        if (actionView == null || hVar.e()) {
            if (view instanceof k.a) {
                aVar = (k.a) view;
            } else {
                aVar = (k.a) this.f1060x.inflate(this.A, viewGroup, false);
            }
            aVar.c(hVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.B);
            if (this.Q == null) {
                this.Q = new b();
            }
            actionMenuItemView.setPopupCallback(this.Q);
            actionView = (View) aVar;
        }
        if (hVar.C) {
            i6 = 8;
        }
        actionView.setVisibility(i6);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        androidx.appcompat.view.menu.k kVar;
        RunnableC0022c runnableC0022c = this.P;
        if (runnableC0022c != null && (kVar = this.B) != null) {
            ((View) kVar).removeCallbacks(runnableC0022c);
            this.P = null;
            return true;
        }
        e eVar = this.N;
        if (eVar != null) {
            if (eVar.b()) {
                eVar.f1151j.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        b();
        a aVar = this.O;
        if (aVar != null && aVar.b()) {
            aVar.f1151j.dismiss();
        }
        j.a aVar2 = this.f1061y;
        if (aVar2 != null) {
            aVar2.c(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z10) {
        int i6;
        boolean z11;
        boolean z12;
        androidx.appcompat.view.menu.h hVar;
        ViewGroup viewGroup = (ViewGroup) this.B;
        ArrayList<androidx.appcompat.view.menu.h> arrayList = null;
        boolean z13 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.f1059w;
            if (fVar != null) {
                fVar.i();
                ArrayList<androidx.appcompat.view.menu.h> l2 = this.f1059w.l();
                int size = l2.size();
                i6 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    androidx.appcompat.view.menu.h hVar2 = l2.get(i10);
                    if ((hVar2.f1139x & 32) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        View childAt = viewGroup.getChildAt(i6);
                        if (childAt instanceof k.a) {
                            hVar = ((k.a) childAt).getItemData();
                        } else {
                            hVar = null;
                        }
                        View a10 = a(hVar2, childAt, viewGroup);
                        if (hVar2 != hVar) {
                            a10.setPressed(false);
                            a10.jumpDrawablesToCurrentState();
                        }
                        if (a10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a10);
                            }
                            ((ViewGroup) this.B).addView(a10, i6);
                        }
                        i6++;
                    }
                }
            } else {
                i6 = 0;
            }
            while (i6 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i6) == this.D) {
                    z11 = false;
                } else {
                    viewGroup.removeViewAt(i6);
                    z11 = true;
                }
                if (!z11) {
                    i6++;
                }
            }
        }
        ((View) this.B).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.f1059w;
        if (fVar2 != null) {
            fVar2.i();
            ArrayList<androidx.appcompat.view.menu.h> arrayList2 = fVar2.f1100i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                t0.b bVar = arrayList2.get(i11).A;
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.f1059w;
        if (fVar3 != null) {
            fVar3.i();
            arrayList = fVar3.f1101j;
        }
        if (this.G && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z13 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z13 = true;
            }
        }
        if (z13) {
            if (this.D == null) {
                this.D = new d(this.f1057u);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.D.getParent();
            if (viewGroup3 != this.B) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.D);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.B;
                d dVar = this.D;
                actionMenuView.getClass();
                ActionMenuView.c cVar = new ActionMenuView.c();
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
                cVar.f1179a = true;
                actionMenuView.addView(dVar, cVar);
            }
        } else {
            d dVar2 = this.D;
            if (dVar2 != null) {
                ViewParent parent = dVar2.getParent();
                androidx.appcompat.view.menu.k kVar = this.B;
                if (parent == kVar) {
                    ((ViewGroup) kVar).removeView(this.D);
                }
            }
        }
        ((ActionMenuView) this.B).setOverflowReserved(this.G);
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        ArrayList<androidx.appcompat.view.menu.h> arrayList;
        int i6;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        c cVar = this;
        androidx.appcompat.view.menu.f fVar = cVar.f1059w;
        if (fVar != null) {
            arrayList = fVar.l();
            i6 = arrayList.size();
        } else {
            arrayList = null;
            i6 = 0;
        }
        int i11 = cVar.K;
        int i12 = cVar.J;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.B;
        int i13 = 0;
        boolean z18 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= i6) {
                break;
            }
            androidx.appcompat.view.menu.h hVar = arrayList.get(i13);
            int i16 = hVar.f1140y;
            if ((i16 & 2) == 2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                i14++;
            } else {
                if ((i16 & 1) == 1) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    i15++;
                } else {
                    z18 = true;
                }
            }
            if (cVar.L && hVar.C) {
                i11 = 0;
            }
            i13++;
        }
        if (cVar.G && (z18 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = cVar.M;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < i6) {
            androidx.appcompat.view.menu.h hVar2 = arrayList.get(i18);
            int i20 = hVar2.f1140y;
            if ((i20 & 2) == i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i21 = hVar2.f1119b;
            if (z11) {
                View a10 = cVar.a(hVar2, null, viewGroup);
                a10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a10.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                hVar2.g(z10);
            } else {
                if ((i20 & 1) == z10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    boolean z19 = sparseBooleanArray.get(i21);
                    if ((i17 > 0 || z19) && i12 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        View a11 = cVar.a(hVar2, null, viewGroup);
                        a11.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = a11.getMeasuredWidth();
                        i12 -= measuredWidth2;
                        if (i19 == 0) {
                            i19 = measuredWidth2;
                        }
                        if (i12 + i19 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z13 &= z15;
                    }
                    if (z13 && i21 != 0) {
                        sparseBooleanArray.put(i21, true);
                    } else if (z19) {
                        sparseBooleanArray.put(i21, false);
                        for (int i22 = 0; i22 < i18; i22++) {
                            androidx.appcompat.view.menu.h hVar3 = arrayList.get(i22);
                            if (hVar3.f1119b == i21) {
                                if ((hVar3.f1139x & 32) == 32) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    i17++;
                                }
                                hVar3.g(false);
                            }
                        }
                    }
                    if (z13) {
                        i17--;
                    }
                    hVar2.g(z13);
                } else {
                    hVar2.g(false);
                    i18++;
                    i10 = 2;
                    cVar = this;
                    z10 = true;
                }
            }
            i18++;
            i10 = 2;
            cVar = this;
            z10 = true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f1058v = context;
        LayoutInflater.from(context);
        this.f1059w = fVar;
        Resources resources = context.getResources();
        if (!this.H) {
            this.G = true;
        }
        int i6 = 2;
        this.I = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i10 <= 600 && ((i10 <= 960 || i11 <= 720) && (i10 <= 720 || i11 <= 960))) {
            if (i10 < 500 && ((i10 <= 640 || i11 <= 480) && (i10 <= 480 || i11 <= 640))) {
                if (i10 >= 360) {
                    i6 = 3;
                }
            } else {
                i6 = 4;
            }
        } else {
            i6 = 5;
        }
        this.K = i6;
        int i12 = this.I;
        if (this.G) {
            if (this.D == null) {
                d dVar = new d(this.f1057u);
                this.D = dVar;
                if (this.F) {
                    dVar.setImageDrawable(this.E);
                    this.E = null;
                    this.F = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.D.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i12 -= this.D.getMeasuredWidth();
        } else {
            this.D = null;
        }
        this.J = i12;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
        int i6;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i6 = ((g) parcelable).f1366u) > 0 && (findItem = this.f1059w.findItem(i6)) != null) {
            k((androidx.appcompat.view.menu.m) findItem.getSubMenu());
        }
    }

    public final boolean j() {
        e eVar = this.N;
        if (eVar != null && eVar.b()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(androidx.appcompat.view.menu.m mVar) {
        View view;
        boolean z10;
        boolean z11 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (true) {
            androidx.appcompat.view.menu.f fVar = mVar2.f1162z;
            if (fVar == this.f1059w) {
                break;
            }
            mVar2 = (androidx.appcompat.view.menu.m) fVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.B;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                view = viewGroup.getChildAt(i6);
                if ((view instanceof k.a) && ((k.a) view).getItemData() == mVar2.A) {
                    break;
                }
            }
        }
        view = null;
        if (view == null) {
            return false;
        }
        this.S = mVar.A.f1118a;
        int size = mVar.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                MenuItem item = mVar.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        a aVar = new a(this.f1058v, mVar, view);
        this.O = aVar;
        aVar.f1149h = z10;
        l.d dVar = aVar.f1151j;
        if (dVar != null) {
            dVar.q(z10);
        }
        a aVar2 = this.O;
        if (!aVar2.b()) {
            if (aVar2.f != null) {
                aVar2.d(0, 0, false, false);
            }
            if (!z11) {
                j.a aVar3 = this.f1061y;
                if (aVar3 != null) {
                    aVar3.d(mVar);
                }
                return true;
            }
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        z11 = true;
        if (!z11) {
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        g gVar = new g();
        gVar.f1366u = this.S;
        return gVar;
    }

    public final boolean n() {
        androidx.appcompat.view.menu.f fVar;
        if (this.G && !j() && (fVar = this.f1059w) != null && this.B != null && this.P == null) {
            fVar.i();
            if (!fVar.f1101j.isEmpty()) {
                RunnableC0022c runnableC0022c = new RunnableC0022c(new e(this.f1058v, this.f1059w, this.D));
                this.P = runnableC0022c;
                ((View) this.B).post(runnableC0022c);
                return true;
            }
            return false;
        }
        return false;
    }
}
