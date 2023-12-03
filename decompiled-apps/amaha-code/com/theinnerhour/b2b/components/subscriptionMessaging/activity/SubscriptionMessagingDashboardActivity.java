package com.theinnerhour.b2b.components.subscriptionMessaging.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.subscriptionMessaging.model.SubscriptionMessageScreen;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kp.i;
import ql.h;
/* compiled from: SubscriptionMessagingDashboardActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/subscriptionMessaging/activity/SubscriptionMessagingDashboardActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SubscriptionMessagingDashboardActivity extends c {
    public static final /* synthetic */ int B = 0;
    public int A;

    /* renamed from: v  reason: collision with root package name */
    public lp.a f11636v;

    /* renamed from: w  reason: collision with root package name */
    public Fragment f11637w;

    /* renamed from: x  reason: collision with root package name */
    public SubscriptionMessageScreen f11638x;

    /* renamed from: y  reason: collision with root package name */
    public String f11639y;

    /* renamed from: z  reason: collision with root package name */
    public long f11640z;

    /* compiled from: SubscriptionMessagingDashboardActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11641a;

        static {
            int[] iArr = new int[SubscriptionMessageScreen.values().length];
            try {
                iArr[SubscriptionMessageScreen.GRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionMessageScreen.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubscriptionMessageScreen.HOLD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11641a = iArr;
        }
    }

    public SubscriptionMessagingDashboardActivity() {
        new LinkedHashMap();
    }

    public final void n0(int i6) {
        Window window = getWindow();
        window.setStatusBarColor(g0.a.b(this, i6));
        if (Build.VERSION.SDK_INT >= 23) {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
        }
    }

    public final void o0(boolean z10, boolean z11) {
        Fragment cVar;
        y supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a l2 = e.l(supportFragmentManager, supportFragmentManager);
        Fragment fragment = new Fragment();
        if (z10) {
            if (z11) {
                l2.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        int i6 = this.A;
        if (i6 != 0) {
            if (i6 == 1) {
                lp.a aVar = this.f11636v;
                if (aVar != null) {
                    SubscriptionMessageScreen subscriptionMessageScreen = aVar.A;
                    if (subscriptionMessageScreen != null) {
                        if (subscriptionMessageScreen == SubscriptionMessageScreen.CANCELLED) {
                            cVar = new i();
                        } else {
                            cVar = new kp.c();
                        }
                        fragment = cVar;
                        n0(R.color.subscriptionMessagingLightPurple);
                    } else {
                        kotlin.jvm.internal.i.q("selectedScreenCategory");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.i.q("subscriptionMessagingViewModel");
                    throw null;
                }
            }
        } else {
            fragment = this.f11637w;
            n0(R.color.subscriptionMessagingLightBlue);
        }
        if (fragment != null) {
            l2.f(R.id.subscriptionMessagingFrameLayout, fragment, null);
            l2.k();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i6 = this.A - 1;
        this.A = i6;
        if (i6 < 0) {
            super.onBackPressed();
        } else {
            o0(true, true);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_subscription_messaging_dashboard);
        lp.a aVar = (lp.a) new o0(this).a(lp.a.class);
        aVar.g();
        aVar.f24482x.e(this, new h(this, 1, aVar));
        kotlin.jvm.internal.i.g(aVar, "<set-?>");
        this.f11636v = aVar;
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        lp.a aVar = this.f11636v;
        if (aVar != null) {
            if (aVar != null) {
                aVar.f24482x.k(this);
                lp.a aVar2 = this.f11636v;
                if (aVar2 != null) {
                    aVar2.f24483y.k(this);
                } else {
                    kotlin.jvm.internal.i.q("subscriptionMessagingViewModel");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.i.q("subscriptionMessagingViewModel");
                throw null;
            }
        }
        super.onDestroy();
    }
}
