package com.theinnerhour.b2b.utils;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.theinnerhour.b2b.R;
import java.util.WeakHashMap;
import kotlin.Metadata;
import t0.d0;
import t0.o0;
import t0.r0;
import t0.s0;
import t0.u0;
/* compiled from: InsetsUtils.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J&\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/theinnerhour/b2b/utils/InsetsUtils;", "", "Landroid/view/View;", "decorView", "Landroid/view/Window;", "window", "Lhs/k;", "setupInsets", "", "color", "Landroid/app/Activity;", Constants.SCREEN_ACTIVITY, "", "isTransparent", "isLight", "setStatusBarColor", "view", "addStatusBarHeight", "addBottomNavHeight", "", "TAG", "Ljava/lang/String;", "statusBarSize", "I", "bottomNavSize", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class InsetsUtils {
    public static final InsetsUtils INSTANCE = new InsetsUtils();
    private static final String TAG = LogHelper.INSTANCE.makeLogTag("StatusBarUtils");
    private static int statusBarSize = -1;
    private static int bottomNavSize = -1;

    private InsetsUtils() {
    }

    public static final s0 setupInsets$lambda$0(View view, s0 windowInsets) {
        kotlin.jvm.internal.i.g(view, "view");
        kotlin.jvm.internal.i.g(windowInsets, "windowInsets");
        s0.k kVar = windowInsets.f32351a;
        statusBarSize = kVar.f(1).f21624b;
        bottomNavSize = kVar.f(2).f21626d;
        view.setOnApplyWindowInsetsListener(null);
        return s0.f32350b;
    }

    public final void addBottomNavHeight(View view) {
        kotlin.jvm.internal.i.g(view, "view");
        try {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.i.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin + bottomNavSize);
            view.setLayoutParams(marginLayoutParams);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("UiUtil", e10);
        }
    }

    public final void addStatusBarHeight(View view) {
        kotlin.jvm.internal.i.g(view, "view");
        try {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.i.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + statusBarSize, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view.setLayoutParams(marginLayoutParams);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("UiUtil", e10);
        }
    }

    public final void setStatusBarColor(int i6, Activity activity, boolean z10, boolean z11) {
        kotlin.jvm.internal.i.g(activity, "activity");
        try {
            Window window = activity.getWindow();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                new u0(window.getDecorView(), window).a(z11);
            }
            if (z10 && i10 < 23) {
                window.setStatusBarColor(g0.a.b(activity, R.color.status_bar_grey));
            } else {
                window.setStatusBarColor(g0.a.b(activity, i6));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG, "Error in setting custom status bar", e10);
        }
    }

    public final void setupInsets(View view, Window window) {
        kotlin.jvm.internal.i.g(window, "window");
        if (view == null) {
            return;
        }
        try {
            r0.a(window, false);
            com.google.firebase.messaging.j jVar = new com.google.firebase.messaging.j(8);
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.i.u(view, jVar);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG, e10);
        }
    }
}
