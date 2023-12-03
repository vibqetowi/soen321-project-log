package androidx.mediarouter.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.appcompat.widget.p1;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.Iterator;
import k0.a;
import r1.l;
import r1.x;
import t0.d0;
/* compiled from: MediaRouteButton.java */
/* loaded from: classes.dex */
public final class a extends View {
    public static C0033a J;
    public static final SparseArray<Drawable.ConstantState> K = new SparseArray<>(2);
    public static final int[] L = {16842912};
    public static final int[] M = {16842911};
    public c A;
    public Drawable B;
    public int C;
    public int D;
    public final ColorStateList E;
    public final int F;
    public final int G;
    public boolean H;
    public boolean I;

    /* renamed from: u  reason: collision with root package name */
    public final r1.l f2516u;

    /* renamed from: v  reason: collision with root package name */
    public final b f2517v;

    /* renamed from: w  reason: collision with root package name */
    public r1.k f2518w;

    /* renamed from: x  reason: collision with root package name */
    public l f2519x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f2520y;

    /* renamed from: z  reason: collision with root package name */
    public int f2521z;

    /* compiled from: MediaRouteButton.java */
    /* renamed from: androidx.mediarouter.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0033a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final Context f2522a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2523b = true;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f2524c = new ArrayList();

        public C0033a(Context context) {
            this.f2522a = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            boolean z10;
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && this.f2523b != (!intent.getBooleanExtra("noConnectivity", false))) {
                this.f2523b = z10;
                Iterator it = this.f2524c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).c();
                }
            }
        }
    }

    /* compiled from: MediaRouteButton.java */
    /* loaded from: classes.dex */
    public final class b extends l.a {
        public b() {
        }

        @Override // r1.l.a
        public final void a(r1.l lVar) {
            a.this.b();
        }

        @Override // r1.l.a
        public final void b(r1.l lVar) {
            a.this.b();
        }

        @Override // r1.l.a
        public final void c(r1.l lVar) {
            a.this.b();
        }

        @Override // r1.l.a
        public final void d(r1.l lVar, l.g gVar) {
            a.this.b();
        }

        @Override // r1.l.a
        public final void e(r1.l lVar, l.g gVar) {
            a.this.b();
        }

        @Override // r1.l.a
        public final void f(r1.l lVar, l.g gVar) {
            a.this.b();
        }

        @Override // r1.l.a
        public final void g(l.g gVar) {
            a.this.b();
        }

        @Override // r1.l.a
        public final void h() {
            a.this.b();
        }
    }

    /* compiled from: MediaRouteButton.java */
    /* loaded from: classes.dex */
    public final class c extends AsyncTask<Void, Void, Drawable> {

        /* renamed from: a  reason: collision with root package name */
        public final int f2526a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f2527b;

        public c(int i6, Context context) {
            this.f2526a = i6;
            this.f2527b = context;
        }

        @Override // android.os.AsyncTask
        public final Drawable doInBackground(Void[] voidArr) {
            SparseArray<Drawable.ConstantState> sparseArray = a.K;
            int i6 = this.f2526a;
            if (sparseArray.get(i6) == null) {
                return this.f2527b.getResources().getDrawable(i6);
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public final void onCancelled(Drawable drawable) {
            Drawable drawable2 = drawable;
            if (drawable2 != null) {
                a.K.put(this.f2526a, drawable2.getConstantState());
            }
            a.this.A = null;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Drawable drawable) {
            Drawable drawable2 = drawable;
            int i6 = this.f2526a;
            a aVar = a.this;
            if (drawable2 != null) {
                a.K.put(i6, drawable2.getConstantState());
                aVar.A = null;
            } else {
                Drawable.ConstantState constantState = a.K.get(i6);
                if (constantState != null) {
                    drawable2 = constantState.newDrawable();
                }
                aVar.A = null;
            }
            aVar.setRemoteIndicatorDrawableInternal(drawable2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Context context) {
        super(r10 != 0 ? new ContextThemeWrapper(r0, r10) : r0, null, R.attr.mediaRouteButtonStyle);
        Drawable.ConstantState constantState;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, u.f(context));
        int h10 = u.h(R.attr.mediaRouteTheme, contextThemeWrapper);
        this.f2518w = r1.k.f30286c;
        this.f2519x = l.f2601a;
        this.f2521z = 0;
        Context context2 = getContext();
        int[] iArr = ca.a.L;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, R.attr.mediaRouteButtonStyle, 0);
        d0.p(this, context2, iArr, null, obtainStyledAttributes, R.attr.mediaRouteButtonStyle);
        if (isInEditMode()) {
            this.f2516u = null;
            this.f2517v = null;
            this.B = getResources().getDrawable(obtainStyledAttributes.getResourceId(3, 0));
            return;
        }
        this.f2516u = r1.l.c(context2);
        this.f2517v = new b();
        if (J == null) {
            J = new C0033a(context2.getApplicationContext());
        }
        this.E = obtainStyledAttributes.getColorStateList(4);
        this.F = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.G = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        this.C = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
        int i6 = this.C;
        SparseArray<Drawable.ConstantState> sparseArray = K;
        if (i6 != 0 && (constantState = sparseArray.get(i6)) != null) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.B == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = sparseArray.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    c cVar = new c(resourceId, getContext());
                    this.A = cVar;
                    cVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                a();
            }
        }
        f();
        setClickable(true);
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private y getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof androidx.fragment.app.p) {
            return ((androidx.fragment.app.p) activity).getSupportFragmentManager();
        }
        return null;
    }

    public final void a() {
        if (this.C > 0) {
            c cVar = this.A;
            if (cVar != null) {
                cVar.cancel(false);
            }
            c cVar2 = new c(this.C, getContext());
            this.A = cVar2;
            this.C = 0;
            cVar2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public final void b() {
        boolean z10;
        int i6;
        boolean z11;
        this.f2516u.getClass();
        l.g e10 = r1.l.e();
        boolean z12 = false;
        if (!e10.d() && e10.h(this.f2518w)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i6 = e10.f30347h;
        } else {
            i6 = 0;
        }
        if (this.D != i6) {
            this.D = i6;
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f();
            refreshDrawableState();
        }
        if (i6 == 1) {
            a();
        }
        if (this.f2520y) {
            setEnabled((this.H || r1.l.f(this.f2518w, 1)) ? true : true);
        }
        Drawable drawable = this.B;
        if (drawable != null && (drawable.getCurrent() instanceof AnimationDrawable)) {
            AnimationDrawable animationDrawable = (AnimationDrawable) this.B.getCurrent();
            if (this.f2520y) {
                if ((z11 || i6 == 1) && !animationDrawable.isRunning()) {
                    animationDrawable.start();
                }
            } else if (i6 == 2) {
                if (animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
            }
        }
    }

    public final void c() {
        boolean z10;
        int i6 = this.f2521z;
        if (i6 == 0 && !this.H && !J.f2523b) {
            i6 = 4;
        }
        super.setVisibility(i6);
        Drawable drawable = this.B;
        if (drawable != null) {
            if (getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            drawable.setVisible(z10, false);
        }
    }

    public final boolean d() {
        boolean z10;
        ApplicationInfo applicationInfo;
        boolean z11 = false;
        if (!this.f2520y) {
            return false;
        }
        this.f2516u.getClass();
        r1.l.b();
        l.d dVar = r1.l.f30291d;
        x xVar = dVar.f30310n;
        if (xVar != null) {
            if (xVar.f30369a) {
                if (dVar == null) {
                    z10 = false;
                } else {
                    z10 = dVar.f30299b;
                }
                if (z10) {
                    Context context = getContext();
                    Intent putExtra = new Intent().setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName()).putExtra("key_media_session_token", r1.l.d());
                    Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(putExtra, 0).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityInfo activityInfo = it.next().activityInfo;
                        if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                            context.startActivity(putExtra);
                            z11 = true;
                            break;
                        }
                    }
                    if (z11) {
                        return true;
                    }
                }
            }
            return e();
        }
        return e();
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.B != null) {
            this.B.setState(getDrawableState());
            invalidate();
        }
    }

    public final boolean e() {
        y fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            this.f2516u.getClass();
            l.g e10 = r1.l.e();
            if (!e10.d() && e10.h(this.f2518w)) {
                if (fragmentManager.F("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
                    Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
                    return false;
                }
                this.f2519x.getClass();
                k kVar = new k();
                r1.k kVar2 = this.f2518w;
                if (kVar2 != null) {
                    if (kVar.f2600w == null) {
                        Bundle arguments = kVar.getArguments();
                        if (arguments != null) {
                            kVar.f2600w = r1.k.b(arguments.getBundle("selector"));
                        }
                        if (kVar.f2600w == null) {
                            kVar.f2600w = r1.k.f30286c;
                        }
                    }
                    if (!kVar.f2600w.equals(kVar2)) {
                        kVar.f2600w = kVar2;
                        Bundle arguments2 = kVar.getArguments();
                        if (arguments2 == null) {
                            arguments2 = new Bundle();
                        }
                        arguments2.putBundle("selector", kVar2.f30287a);
                        kVar.setArguments(arguments2);
                        g.r rVar = kVar.f2599v;
                        if (rVar != null && kVar.f2598u) {
                            ((p) rVar).h(kVar2);
                        }
                    }
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                    aVar.e(0, kVar, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
                    aVar.k();
                } else {
                    throw new IllegalArgumentException("selector must not be null");
                }
            } else if (fragmentManager.F("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                return false;
            } else {
                this.f2519x.getClass();
                androidx.mediarouter.app.c cVar = new androidx.mediarouter.app.c();
                r1.k kVar3 = this.f2518w;
                if (kVar3 != null) {
                    cVar.F();
                    if (!cVar.f2542w.equals(kVar3)) {
                        cVar.f2542w = kVar3;
                        Bundle arguments3 = cVar.getArguments();
                        if (arguments3 == null) {
                            arguments3 = new Bundle();
                        }
                        arguments3.putBundle("selector", kVar3.f30287a);
                        cVar.setArguments(arguments3);
                        g.r rVar2 = cVar.f2541v;
                        if (rVar2 != null) {
                            if (cVar.f2540u) {
                                ((n) rVar2).f(kVar3);
                            } else {
                                ((androidx.mediarouter.app.b) rVar2).f(kVar3);
                            }
                        }
                    }
                    androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
                    aVar2.e(0, cVar, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
                    aVar2.k();
                } else {
                    throw new IllegalArgumentException("selector must not be null");
                }
            }
            return true;
        }
        throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
    }

    public final void f() {
        int i6;
        int i10 = this.D;
        if (i10 != 1) {
            if (i10 != 2) {
                i6 = R.string.mr_cast_button_disconnected;
            } else {
                i6 = R.string.mr_cast_button_connected;
            }
        } else {
            i6 = R.string.mr_cast_button_connecting;
        }
        String string = getContext().getString(i6);
        setContentDescription(string);
        p1.a(this, (!this.I || TextUtils.isEmpty(string)) ? null : null);
    }

    public l getDialogFactory() {
        return this.f2519x;
    }

    public r1.k getRouteSelector() {
        return this.f2518w;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.f2520y = true;
        if (!this.f2518w.c()) {
            this.f2516u.a(this.f2518w, this.f2517v, 0);
        }
        b();
        C0033a c0033a = J;
        ArrayList arrayList = c0033a.f2524c;
        if (arrayList.size() == 0) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            c0033a.f2522a.registerReceiver(c0033a, intentFilter);
        }
        arrayList.add(this);
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 1);
        int i10 = this.D;
        if (i10 != 1) {
            if (i10 == 2) {
                View.mergeDrawableStates(onCreateDrawableState, L);
            }
        } else {
            View.mergeDrawableStates(onCreateDrawableState, M);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.f2520y = false;
            if (!this.f2518w.c()) {
                this.f2516u.g(this.f2517v);
            }
            C0033a c0033a = J;
            ArrayList arrayList = c0033a.f2524c;
            arrayList.remove(this);
            if (arrayList.size() == 0) {
                c0033a.f2522a.unregisterReceiver(c0033a);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.B != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.B.getIntrinsicWidth();
            int intrinsicHeight = this.B.getIntrinsicHeight();
            int i6 = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i10 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.B.setBounds(i6, i10, intrinsicWidth + i6, intrinsicHeight + i10);
            this.B.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i6);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i6);
        int mode2 = View.MeasureSpec.getMode(i10);
        Drawable drawable = this.B;
        int i12 = 0;
        if (drawable != null) {
            i11 = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            i11 = 0;
        }
        int max = Math.max(this.F, i11);
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            i12 = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int max2 = Math.max(this.G, i12);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                size = max;
            }
        } else {
            size = Math.min(size, max);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size2 = max2;
            }
        } else {
            size2 = Math.min(size2, max2);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        a();
        if (!d() && !performClick) {
            return false;
        }
        return true;
    }

    public void setAlwaysVisible(boolean z10) {
        if (z10 != this.H) {
            this.H = z10;
            c();
            b();
        }
    }

    public void setCheatSheetEnabled(boolean z10) {
        if (z10 != this.I) {
            this.I = z10;
            f();
        }
    }

    public void setDialogFactory(l lVar) {
        if (lVar != null) {
            this.f2519x = lVar;
            return;
        }
        throw new IllegalArgumentException("factory must not be null");
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.C = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        Drawable drawable2;
        boolean z10;
        c cVar = this.A;
        if (cVar != null) {
            cVar.cancel(false);
        }
        Drawable drawable3 = this.B;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.B);
        }
        if (drawable != null) {
            ColorStateList colorStateList = this.E;
            if (colorStateList != null) {
                drawable = k0.a.g(drawable.mutate());
                a.b.h(drawable, colorStateList);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            if (getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            drawable.setVisible(z10, false);
        }
        this.B = drawable;
        refreshDrawableState();
        if (this.f2520y && (drawable2 = this.B) != null && (drawable2.getCurrent() instanceof AnimationDrawable)) {
            AnimationDrawable animationDrawable = (AnimationDrawable) this.B.getCurrent();
            int i6 = this.D;
            if (i6 == 1) {
                if (!animationDrawable.isRunning()) {
                    animationDrawable.start();
                }
            } else if (i6 == 2) {
                if (animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
            }
        }
    }

    public void setRouteSelector(r1.k kVar) {
        if (kVar != null) {
            if (!this.f2518w.equals(kVar)) {
                if (this.f2520y) {
                    boolean c10 = this.f2518w.c();
                    b bVar = this.f2517v;
                    r1.l lVar = this.f2516u;
                    if (!c10) {
                        lVar.g(bVar);
                    }
                    if (!kVar.c()) {
                        lVar.a(kVar, bVar, 0);
                    }
                }
                this.f2518w = kVar;
                b();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        this.f2521z = i6;
        c();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.B) {
            return false;
        }
        return true;
    }
}
