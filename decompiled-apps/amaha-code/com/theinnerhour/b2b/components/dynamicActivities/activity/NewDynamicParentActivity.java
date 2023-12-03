package com.theinnerhour.b2b.components.dynamicActivities.activity;

import android.animation.ObjectAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.h;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.navigation.fragment.NavHostFragment;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.data.NewDynamicActivityScreenDataClass;
import com.theinnerhour.b2b.components.dynamicActivities.utils.MusicService;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.LoadingDots;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hl.p;
import is.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;
import mi.b2;
import pl.t0;
import ql.n;
import ql.q;
import ql.t;
import ql.w;
import rr.d;
import s1.a0;
import s1.f;
import s1.u;
import ss.l;
import t0.u0;
import ta.v;
/* compiled from: NewDynamicParentActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/activity/NewDynamicParentActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NewDynamicParentActivity extends rr.a {
    public static final /* synthetic */ int F = 0;
    public boolean B;
    public boolean C;

    /* renamed from: z  reason: collision with root package name */
    public t f10904z;
    public final LinkedHashMap E = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f10901w = LogHelper.INSTANCE.makeLogTag(NewDynamicParentActivity.class);

    /* renamed from: x  reason: collision with root package name */
    public int f10902x = -1;

    /* renamed from: y  reason: collision with root package name */
    public int f10903y = -1;
    public final a0 A = new a0(false, false, -1, false, false, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit);
    public final m0 D = new m0(y.a(n.class), new c(this), new a(), new d(this));

    /* compiled from: NewDynamicParentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<o0.b> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final o0.b invoke() {
            NewDynamicParentActivity context = NewDynamicParentActivity.this;
            i.g(context, "context");
            Context applicationContext = context.getApplicationContext();
            i.f(applicationContext, "applicationContext");
            q.a aVar = q.f29765i;
            ComponentName componentName = new ComponentName(applicationContext, MusicService.class);
            q qVar = q.f29766j;
            if (qVar == null) {
                synchronized (aVar) {
                    qVar = q.f29766j;
                    if (qVar == null) {
                        qVar = new q(applicationContext, componentName);
                        q.f29766j = qVar;
                    }
                }
            }
            return new n.a(qVar);
        }
    }

    /* compiled from: NewDynamicParentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<Boolean, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ t f10907v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar) {
            super(1);
            this.f10907v = tVar;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            MyApplication myApplication;
            boolean z10;
            Boolean bool2 = bool;
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                boolean z11 = false;
                NewDynamicParentActivity newDynamicParentActivity = NewDynamicParentActivity.this;
                if (booleanValue) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) newDynamicParentActivity.u0(R.id.parentNavBarContainer);
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(0);
                    }
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) newDynamicParentActivity.u0(R.id.parentCtaContainer);
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(0);
                    }
                    ProgressBar progressBar = (ProgressBar) newDynamicParentActivity.u0(R.id.pbParentProgress);
                    if (progressBar != null) {
                        progressBar.setVisibility(0);
                    }
                    t tVar = this.f10907v;
                    ArrayList<NewDynamicActivityScreenDataClass> arrayList = tVar.P;
                    if (arrayList != null) {
                        if (!arrayList.isEmpty()) {
                            for (NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass : arrayList) {
                                if (i.b(newDynamicActivityScreenDataClass.getSlug(), "n12c")) {
                                    z10 = true;
                                    break;
                                }
                            }
                        }
                        z10 = false;
                        if (z10) {
                            z11 = true;
                        }
                    }
                    if (z11 && !tVar.f29780b0) {
                        Context applicationContext = tVar.f2382x.getApplicationContext();
                        if (applicationContext instanceof MyApplication) {
                            myApplication = (MyApplication) applicationContext;
                        } else {
                            myApplication = null;
                        }
                        if (myApplication != null) {
                            myApplication.a(tVar);
                        }
                        tVar.f29780b0 = true;
                    }
                    newDynamicParentActivity.L0(true);
                    tVar.L.k(newDynamicParentActivity);
                } else {
                    Toast.makeText(newDynamicParentActivity, newDynamicParentActivity.getString(R.string.telecommunicationsError), 0).show();
                    newDynamicParentActivity.finish();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f10908u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f10908u = componentActivity;
        }

        @Override // ss.a
        public final q0 invoke() {
            q0 viewModelStore = this.f10908u.getViewModelStore();
            i.f(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f10909u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f10909u = componentActivity;
        }

        @Override // ss.a
        public final k1.a invoke() {
            k1.a defaultViewModelCreationExtras = this.f10909u.getDefaultViewModelCreationExtras();
            i.f(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
        r3 = (com.theinnerhour.b2b.widgets.RobertoTextView) r2.u0(com.theinnerhour.b2b.R.id.parentBottomButtonHeader);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
        if (r3 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
        r3.setText(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void F0(NewDynamicParentActivity newDynamicParentActivity, String str, String str2, String str3, String str4, int i6) {
        RobertoTextView robertoTextView;
        RobertoButton robertoButton;
        if ((i6 & 1) != 0) {
            str = null;
        }
        if ((i6 & 2) != 0) {
            str2 = null;
        }
        if ((i6 & 4) != 0) {
            str3 = null;
        }
        if ((i6 & 8) != 0) {
            str4 = null;
        }
        if (str != null) {
            try {
                RobertoButton robertoButton2 = (RobertoButton) newDynamicParentActivity.u0(R.id.parentBottomButton1);
                if (robertoButton2 != null) {
                    robertoButton2.setText(str);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(newDynamicParentActivity.f10901w, e10);
                return;
            }
        }
        if (str2 != null && (robertoButton = (RobertoButton) newDynamicParentActivity.u0(R.id.parentBottomButton2)) != null) {
            robertoButton.setText(str2);
        }
        if (str4 != null && (robertoTextView = (RobertoTextView) newDynamicParentActivity.u0(R.id.parentBottomButtonSubHeader)) != null) {
            robertoTextView.setText(str4);
        }
    }

    public final void A0(int i6) {
        if (i6 <= 0) {
            return;
        }
        try {
            s1.i X = ca.a.X(this);
            for (int i10 = 0; X.j() != null && i6 > i10; i10++) {
                X.o();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10901w, e10);
        }
    }

    public final void B0(String str) {
        int i6;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        u uVar;
        int i11;
        boolean z13;
        boolean z14;
        u uVar2;
        boolean z15;
        u uVar3;
        if (str == null) {
            return;
        }
        try {
            s1.i X = ca.a.X(this);
            g<f> gVar = X.f31141g;
            Integer w02 = w0(str);
            if (w02 != null) {
                int intValue = w02.intValue();
                if ((gVar instanceof Collection) && gVar.isEmpty()) {
                    i6 = 0;
                } else {
                    Iterator<f> it = gVar.iterator();
                    i6 = 0;
                    while (it.hasNext()) {
                        if (it.next().f31115v.B == intValue) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10 && (i6 = i6 + 1) < 0) {
                            ca.a.s1();
                            throw null;
                        }
                    }
                }
                if (i6 > 1) {
                    boolean z16 = false;
                    while (true) {
                        if ((gVar instanceof Collection) && gVar.isEmpty()) {
                            i11 = 0;
                        } else {
                            Iterator<f> it2 = gVar.iterator();
                            i11 = 0;
                            while (it2.hasNext()) {
                                if (it2.next().f31115v.B == intValue) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13 && (i11 = i11 + 1) < 0) {
                                    ca.a.s1();
                                    throw null;
                                }
                            }
                        }
                        if (i11 > 1) {
                            f j10 = X.j();
                            if (j10 != null && (uVar3 = j10.f31115v) != null && uVar3.B == intValue) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (!z15) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (X.p(intValue, true, false)) {
                                X.b();
                            }
                        } else if (z16) {
                            return;
                        } else {
                            while (true) {
                                f j11 = X.j();
                                if (j11 != null && (uVar2 = j11.f31115v) != null && uVar2.B == intValue) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (!z14) {
                                    X.o();
                                } else {
                                    X.o();
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((gVar instanceof Collection) && gVar.isEmpty()) {
                        i10 = 0;
                    } else {
                        Iterator<f> it3 = gVar.iterator();
                        i10 = 0;
                        while (it3.hasNext()) {
                            if (it3.next().f31115v.B == intValue) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11 && (i10 = i10 + 1) < 0) {
                                ca.a.s1();
                                throw null;
                            }
                        }
                    }
                    if (i10 != 1) {
                        return;
                    }
                    while (true) {
                        f j12 = X.j();
                        if (j12 != null && (uVar = j12.f31115v) != null && uVar.B == intValue) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            X.o();
                        } else {
                            X.o();
                            return;
                        }
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10901w, e10);
        }
    }

    public final void C0(int i6) {
        try {
            if (this.f10903y >= 0) {
                this.f10903y = i6;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10901w, e10);
        }
    }

    public final void D0(boolean z10) {
        int i6;
        try {
            RobertoButton robertoButton = (RobertoButton) u0(R.id.parentBottomButton1);
            if (robertoButton != null) {
                if (z10) {
                    i6 = R.color.amahaTerracota;
                } else {
                    i6 = R.color.templateCtaDisabledGrey;
                }
                robertoButton.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this, i6)));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10901w, e10);
        }
    }

    public final void E0(String str) {
        if (str != null) {
            try {
                switch (str.hashCode()) {
                    case 1912257915:
                        if (str.equals("cta_type_1")) {
                            RobertoButton robertoButton = (RobertoButton) u0(R.id.parentBottomButton2);
                            if (robertoButton != null) {
                                robertoButton.setVisibility(8);
                            }
                            RobertoButton robertoButton2 = (RobertoButton) u0(R.id.parentBottomButton1);
                            if (robertoButton2 != null) {
                                robertoButton2.setVisibility(0);
                                robertoButton2.setTextColor(g0.a.b(this, R.color.white));
                                robertoButton2.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this, R.color.amahaTerracota)));
                            }
                            RobertoTextView robertoTextView = (RobertoTextView) u0(R.id.parentBottomButtonHeader);
                            if (robertoTextView != null) {
                                robertoTextView.setVisibility(8);
                            }
                            LoadingDots loadingDots = (LoadingDots) u0(R.id.parentBottomButtonLoader);
                            if (loadingDots != null) {
                                loadingDots.setVisibility(8);
                            }
                            RobertoTextView robertoTextView2 = (RobertoTextView) u0(R.id.parentBottomButtonSubHeader);
                            if (robertoTextView2 != null) {
                                robertoTextView2.setVisibility(8);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1912257916:
                        if (str.equals("cta_type_2")) {
                            RobertoButton robertoButton3 = (RobertoButton) u0(R.id.parentBottomButton1);
                            if (robertoButton3 != null) {
                                robertoButton3.setVisibility(0);
                                robertoButton3.setTextColor(g0.a.b(this, R.color.amahaTerracota));
                                robertoButton3.setBackgroundTintList(null);
                            }
                            RobertoButton robertoButton4 = (RobertoButton) u0(R.id.parentBottomButton2);
                            if (robertoButton4 != null) {
                                robertoButton4.setVisibility(0);
                                robertoButton4.setTextColor(g0.a.b(this, R.color.white));
                                robertoButton4.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this, R.color.amahaTerracota)));
                            }
                            RobertoTextView robertoTextView3 = (RobertoTextView) u0(R.id.parentBottomButtonHeader);
                            if (robertoTextView3 != null) {
                                robertoTextView3.setVisibility(8);
                            }
                            LoadingDots loadingDots2 = (LoadingDots) u0(R.id.parentBottomButtonLoader);
                            if (loadingDots2 != null) {
                                loadingDots2.setVisibility(8);
                            }
                            RobertoTextView robertoTextView4 = (RobertoTextView) u0(R.id.parentBottomButtonSubHeader);
                            if (robertoTextView4 != null) {
                                robertoTextView4.setVisibility(8);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1912257917:
                        if (str.equals("cta_type_3")) {
                            RobertoButton robertoButton5 = (RobertoButton) u0(R.id.parentBottomButton1);
                            if (robertoButton5 != null) {
                                robertoButton5.setVisibility(0);
                                robertoButton5.setTextColor(g0.a.b(this, R.color.amahaTerracota));
                                robertoButton5.setBackgroundTintList(null);
                            }
                            RobertoButton robertoButton6 = (RobertoButton) u0(R.id.parentBottomButton2);
                            if (robertoButton6 != null) {
                                robertoButton6.setVisibility(0);
                                robertoButton6.setTextColor(g0.a.b(this, R.color.amahaTerracota));
                                robertoButton6.setBackgroundTintList(null);
                            }
                            RobertoTextView robertoTextView5 = (RobertoTextView) u0(R.id.parentBottomButtonHeader);
                            if (robertoTextView5 != null) {
                                robertoTextView5.setVisibility(0);
                            }
                            LoadingDots loadingDots3 = (LoadingDots) u0(R.id.parentBottomButtonLoader);
                            if (loadingDots3 != null) {
                                loadingDots3.setVisibility(8);
                            }
                            RobertoTextView robertoTextView6 = (RobertoTextView) u0(R.id.parentBottomButtonSubHeader);
                            if (robertoTextView6 != null) {
                                robertoTextView6.setVisibility(8);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1912257918:
                        if (str.equals("cta_type_4")) {
                            RobertoButton robertoButton7 = (RobertoButton) u0(R.id.parentBottomButton1);
                            if (robertoButton7 != null) {
                                robertoButton7.setVisibility(0);
                                robertoButton7.setTextColor(g0.a.b(this, R.color.amahaTerracota));
                                robertoButton7.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this, R.color.transparent)));
                            }
                            RobertoButton robertoButton8 = (RobertoButton) u0(R.id.parentBottomButton2);
                            if (robertoButton8 != null) {
                                robertoButton8.setVisibility(0);
                                robertoButton8.setTextColor(g0.a.b(this, R.color.white));
                                robertoButton8.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this, R.color.amahaTerracota)));
                            }
                            RobertoTextView robertoTextView7 = (RobertoTextView) u0(R.id.parentBottomButtonHeader);
                            if (robertoTextView7 != null) {
                                robertoTextView7.setVisibility(8);
                            }
                            LoadingDots loadingDots4 = (LoadingDots) u0(R.id.parentBottomButtonLoader);
                            if (loadingDots4 != null) {
                                loadingDots4.setVisibility(8);
                            }
                            RobertoTextView robertoTextView8 = (RobertoTextView) u0(R.id.parentBottomButtonSubHeader);
                            if (robertoTextView8 != null) {
                                robertoTextView8.setVisibility(8);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1912257919:
                        if (str.equals("cta_type_5")) {
                            RobertoButton robertoButton9 = (RobertoButton) u0(R.id.parentBottomButton2);
                            if (robertoButton9 != null) {
                                robertoButton9.setVisibility(8);
                            }
                            RobertoButton robertoButton10 = (RobertoButton) u0(R.id.parentBottomButton1);
                            if (robertoButton10 != null) {
                                robertoButton10.setVisibility(0);
                                robertoButton10.setTextColor(g0.a.b(this, R.color.white));
                                robertoButton10.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this, R.color.amahaTerracota)));
                            }
                            RobertoTextView robertoTextView9 = (RobertoTextView) u0(R.id.parentBottomButtonHeader);
                            if (robertoTextView9 != null) {
                                robertoTextView9.setVisibility(8);
                            }
                            LoadingDots loadingDots5 = (LoadingDots) u0(R.id.parentBottomButtonLoader);
                            if (loadingDots5 != null) {
                                loadingDots5.setVisibility(0);
                            }
                            RobertoTextView robertoTextView10 = (RobertoTextView) u0(R.id.parentBottomButtonSubHeader);
                            if (robertoTextView10 != null) {
                                robertoTextView10.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f10901w, e10);
            }
        }
    }

    public final void G0(int i6, int i10) {
        try {
            ProgressBar progressBar = (ProgressBar) u0(R.id.pbParentProgress);
            if (progressBar != null) {
                progressBar.setMax(i10 * 100);
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt((ProgressBar) u0(R.id.pbParentProgress), Constants.SCREEN_PROGRESS, i6 * 100);
            ofInt.setDuration(500L);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.start();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10901w, e10);
        }
    }

    public final void H0(boolean z10) {
        int b10;
        try {
            ConstraintLayout constraintLayout = (ConstraintLayout) u0(R.id.parentNavBarContainer);
            if (constraintLayout != null) {
                if (z10) {
                    b10 = g0.a.b(this, R.color.white);
                } else {
                    b10 = g0.a.b(this, R.color.login_grey_background);
                }
                constraintLayout.setBackgroundColor(b10);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10901w, e10);
        }
    }

    public final void I0(String str) {
        if (str != null) {
            try {
                RobertoTextView robertoTextView = (RobertoTextView) u0(R.id.parentNavBarHeader);
                if (robertoTextView != null) {
                    robertoTextView.setText(str);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f10901w, e10);
            }
        }
    }

    public final void J0() {
        try {
            ConstraintLayout constraintLayout = (ConstraintLayout) u0(R.id.parentCtaContainer);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10901w, e10);
        }
    }

    public final void K0(String str, HashMap hashMap) {
        if (hashMap == null) {
            return;
        }
        try {
            s1.i X = ca.a.X(this);
            Bundle bundle = new Bundle();
            bundle.putSerializable("fetchedGoalData", hashMap);
            bundle.putString("display_n10_id", str);
            bundle.putBoolean("isGoalDataShow", true);
            hs.k kVar = hs.k.f19476a;
            X.l(R.id.navN10, bundle, this.A);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10901w, e10);
        }
    }

    /* JADX WARN: Type inference failed for: r1v46, types: [s1.a0, T] */
    /* JADX WARN: Type inference failed for: r3v0, types: [s1.a0, T] */
    public final void L0(boolean z10) {
        boolean z11;
        String str;
        int i6;
        String str2;
        String str3;
        Object obj;
        Boolean bool;
        boolean z12;
        NavHostFragment navHostFragment;
        NavHostFragment navHostFragment2;
        Fragment fragment;
        rr.d dVar;
        androidx.fragment.app.y childFragmentManager;
        List<Fragment> L;
        ArrayList<NewDynamicActivityScreenDataClass> arrayList;
        NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass;
        HashMap<String, Object> data;
        ArrayList<NewDynamicActivityScreenDataClass> arrayList2;
        NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass2;
        ArrayList<NewDynamicActivityScreenDataClass> arrayList3;
        NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass3;
        ArrayList<NewDynamicActivityScreenDataClass> arrayList4;
        boolean z13;
        HashSet<Integer> hashSet;
        ArrayList<NewDynamicActivityScreenDataClass> arrayList5;
        NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass4;
        NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass5;
        String str4;
        NavHostFragment navHostFragment3;
        Fragment fragment2;
        rr.d dVar2;
        NavHostFragment navHostFragment4;
        s1.y yVar;
        String str5;
        HashMap<String, Object> hashMap;
        androidx.fragment.app.y childFragmentManager2;
        List<Fragment> L2;
        ArrayList<NewDynamicActivityScreenDataClass> arrayList6;
        ArrayList<NewDynamicActivityScreenDataClass> arrayList7;
        boolean z14 = false;
        try {
            H0(false);
            t tVar = this.f10904z;
            if (tVar != null && (arrayList7 = tVar.A) != null && (!arrayList7.isEmpty())) {
                z11 = true;
            } else {
                z11 = false;
            }
            ?? r32 = this.A;
            Bundle bundle = null;
            String str6 = null;
            bundle = null;
            if (z11) {
                this.B = true;
                t tVar2 = this.f10904z;
                if (tVar2 != null && (arrayList6 = tVar2.A) != null) {
                    newDynamicActivityScreenDataClass5 = (NewDynamicActivityScreenDataClass) is.q.V1(arrayList6);
                } else {
                    newDynamicActivityScreenDataClass5 = null;
                }
                if (newDynamicActivityScreenDataClass5 != null) {
                    str4 = newDynamicActivityScreenDataClass5.getSlug();
                } else {
                    str4 = null;
                }
                Integer w02 = w0(str4);
                if (w02 != null) {
                    Fragment E = getSupportFragmentManager().E(R.id.parentFragmentContainer);
                    if (E instanceof NavHostFragment) {
                        navHostFragment3 = (NavHostFragment) E;
                    } else {
                        navHostFragment3 = null;
                    }
                    if (navHostFragment3 != null && (childFragmentManager2 = navHostFragment3.getChildFragmentManager()) != null && (L2 = childFragmentManager2.L()) != null) {
                        fragment2 = (Fragment) is.u.i2(L2);
                    } else {
                        fragment2 = null;
                    }
                    if (fragment2 instanceof rr.d) {
                        dVar2 = (rr.d) fragment2;
                    } else {
                        dVar2 = null;
                    }
                    if (dVar2 != null) {
                        dVar2.O();
                    }
                    Fragment E2 = getSupportFragmentManager().E(R.id.parentFragmentContainer);
                    if (E2 instanceof NavHostFragment) {
                        navHostFragment4 = (NavHostFragment) E2;
                    } else {
                        navHostFragment4 = null;
                    }
                    if (navHostFragment4 != null) {
                        yVar = navHostFragment4.F();
                    } else {
                        yVar = null;
                    }
                    if (yVar != null) {
                        int intValue = w02.intValue();
                        t tVar3 = this.f10904z;
                        if (tVar3 != null && tVar3.f29790z != null) {
                            if (newDynamicActivityScreenDataClass5 != null) {
                                str5 = newDynamicActivityScreenDataClass5.getSlug();
                            } else {
                                str5 = null;
                            }
                            if (newDynamicActivityScreenDataClass5 != null) {
                                hashMap = newDynamicActivityScreenDataClass5.getData();
                            } else {
                                hashMap = null;
                            }
                            Bundle g5 = gd.d.g(str5, hashMap);
                            if (newDynamicActivityScreenDataClass5 != null) {
                                str6 = newDynamicActivityScreenDataClass5.getCtaSlug();
                            }
                            g5.putString("cta_slug", str6);
                            hs.k kVar = hs.k.f19476a;
                            bundle = g5;
                        }
                        yVar.l(intValue, bundle, r32);
                        return;
                    }
                    return;
                }
                return;
            }
            int i10 = this.f10903y + 1;
            this.f10903y = i10;
            String[] strArr = {"n3a", "n3z"};
            t tVar4 = this.f10904z;
            if (tVar4 != null && (arrayList5 = tVar4.P) != null && (newDynamicActivityScreenDataClass4 = (NewDynamicActivityScreenDataClass) is.u.j2(i10, arrayList5)) != null) {
                str = newDynamicActivityScreenDataClass4.getSlug();
            } else {
                str = null;
            }
            if (is.k.Q1(str, strArr)) {
                t tVar5 = this.f10904z;
                if (tVar5 != null && tVar5.B) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    if (tVar5 != null && (hashSet = tVar5.I) != null) {
                        hashSet.add(Integer.valueOf(this.f10903y));
                    }
                    this.f10903y++;
                }
            }
            int i11 = this.f10903y;
            t tVar6 = this.f10904z;
            if (tVar6 != null && (arrayList4 = tVar6.P) != null) {
                i6 = arrayList4.size() - 1;
            } else {
                i6 = -1;
            }
            if (i11 > i6) {
                t tVar7 = this.f10904z;
                if (tVar7 != null && tVar7.W) {
                    z14 = true;
                }
                if (z14 && tVar7 != null) {
                    tVar7.U = true;
                }
                v0();
                return;
            }
            t tVar8 = this.f10904z;
            if (tVar8 != null && (arrayList3 = tVar8.P) != null && (newDynamicActivityScreenDataClass3 = (NewDynamicActivityScreenDataClass) is.u.j2(this.f10903y, arrayList3)) != null) {
                str2 = newDynamicActivityScreenDataClass3.getSlug();
            } else {
                str2 = null;
            }
            Integer w03 = w0(str2);
            t tVar9 = this.f10904z;
            if (tVar9 != null && (arrayList2 = tVar9.P) != null && (newDynamicActivityScreenDataClass2 = (NewDynamicActivityScreenDataClass) is.u.j2(this.f10903y, arrayList2)) != null) {
                str3 = newDynamicActivityScreenDataClass2.getCtaSlug();
            } else {
                str3 = null;
            }
            t tVar10 = this.f10904z;
            if (tVar10 != null && (arrayList = tVar10.P) != null && (newDynamicActivityScreenDataClass = (NewDynamicActivityScreenDataClass) is.u.j2(this.f10903y, arrayList)) != null && (data = newDynamicActivityScreenDataClass.getData()) != null) {
                obj = data.get("show_info_button");
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                bool = (Boolean) obj;
            } else {
                bool = null;
            }
            if (bool != null) {
                z12 = bool.booleanValue();
            } else {
                z12 = false;
            }
            if (w03 != null) {
                Fragment E3 = getSupportFragmentManager().E(R.id.parentFragmentContainer);
                if (E3 instanceof NavHostFragment) {
                    navHostFragment = (NavHostFragment) E3;
                } else {
                    navHostFragment = null;
                }
                if (navHostFragment != null) {
                    navHostFragment.F();
                }
                x xVar = new x();
                xVar.f23469u = r32;
                if (z10) {
                    this.f10902x = this.f10903y;
                    xVar.f23469u = new a0(false, false, -1, false, false, R.anim.fade_in, -1, -1, -1);
                }
                Fragment E4 = getSupportFragmentManager().E(R.id.parentFragmentContainer);
                if (E4 instanceof NavHostFragment) {
                    navHostFragment2 = (NavHostFragment) E4;
                } else {
                    navHostFragment2 = null;
                }
                if (navHostFragment2 != null && (childFragmentManager = navHostFragment2.getChildFragmentManager()) != null && (L = childFragmentManager.L()) != null) {
                    fragment = (Fragment) is.u.i2(L);
                } else {
                    fragment = null;
                }
                if (fragment instanceof rr.d) {
                    dVar = (rr.d) fragment;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    dVar.O();
                }
                if (is.k.Q1(Integer.valueOf(w03.intValue()), new Integer[]{Integer.valueOf((int) R.id.navN14A)})) {
                    N0(false, null);
                    new Handler(Looper.getMainLooper()).postDelayed(new b2(this, w03, str3, z12, xVar), 100L);
                    return;
                }
                z0(w03.intValue(), str3, z12, (a0) xVar.f23469u);
                return;
            }
            v0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10901w, e10);
        }
    }

    public final void M0() {
        try {
            ProgressBar progressBar = (ProgressBar) u0(R.id.pbParentProgress);
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10901w, e10);
        }
    }

    public final void N0(boolean z10, Long l2) {
        int i6;
        ProgressBar progressBar;
        if (l2 != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new q7.k(z10, this), l2.longValue());
            return;
        }
        if (z10) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) u0(R.id.parentNavBarContainer);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(i6);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) u0(R.id.parentCtaContainer);
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(i6);
        }
        if (!z10 && (progressBar = (ProgressBar) u0(R.id.pbParentProgress)) != null) {
            progressBar.setVisibility(i6);
        }
    }

    public final void O0(Boolean bool) {
        int i6;
        try {
            AppCompatImageView appCompatImageView = (AppCompatImageView) u0(R.id.parentNavBarInfoButton);
            if (appCompatImageView != null) {
                if (i.b(bool, Boolean.TRUE)) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                appCompatImageView.setVisibility(i6);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10901w, e10);
        }
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        NavHostFragment navHostFragment;
        Fragment fragment;
        rr.d dVar;
        boolean z10;
        NavHostFragment navHostFragment2;
        h hVar;
        androidx.fragment.app.y childFragmentManager;
        List<Fragment> L;
        HashSet<Integer> hashSet;
        HashSet<Integer> hashSet2;
        androidx.fragment.app.y childFragmentManager2;
        List<Fragment> L2;
        try {
            boolean z11 = false;
            rr.d dVar2 = null;
            androidx.fragment.app.n nVar = null;
            if (this.C) {
                this.C = false;
                Fragment F2 = getSupportFragmentManager().F("infoDialog");
                if (F2 instanceof androidx.fragment.app.n) {
                    nVar = (androidx.fragment.app.n) F2;
                }
                if (nVar != null) {
                    nVar.dismiss();
                    return;
                }
                return;
            }
            Fragment E = getSupportFragmentManager().E(R.id.parentFragmentContainer);
            if (E instanceof NavHostFragment) {
                navHostFragment = (NavHostFragment) E;
            } else {
                navHostFragment = null;
            }
            if (navHostFragment != null && (childFragmentManager2 = navHostFragment.getChildFragmentManager()) != null && (L2 = childFragmentManager2.L()) != null) {
                fragment = (Fragment) is.u.i2(L2);
            } else {
                fragment = null;
            }
            if (fragment instanceof rr.d) {
                dVar = (rr.d) fragment;
            } else {
                dVar = null;
            }
            if (dVar != null && !dVar.I()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int i6 = this.f10903y - 1;
                this.f10903y = i6;
                t tVar = this.f10904z;
                if (tVar != null && (hashSet2 = tVar.I) != null && hashSet2.contains(Integer.valueOf(i6))) {
                    z11 = true;
                }
                if (z11) {
                    t tVar2 = this.f10904z;
                    if (tVar2 != null && (hashSet = tVar2.I) != null) {
                        hashSet.remove(Integer.valueOf(this.f10903y));
                    }
                    this.f10903y--;
                }
                if (this.f10903y < this.f10902x) {
                    v0();
                    return;
                }
                Fragment E2 = getSupportFragmentManager().E(R.id.parentFragmentContainer);
                if (E2 instanceof NavHostFragment) {
                    navHostFragment2 = (NavHostFragment) E2;
                } else {
                    navHostFragment2 = null;
                }
                if (navHostFragment2 != null && (childFragmentManager = navHostFragment2.getChildFragmentManager()) != null && (L = childFragmentManager.L()) != null) {
                    hVar = (Fragment) is.u.i2(L);
                } else {
                    hVar = null;
                }
                if (hVar instanceof rr.d) {
                    dVar2 = (rr.d) hVar;
                }
                if (dVar2 != null) {
                    dVar2.O();
                }
                if (!ca.a.X(this).n()) {
                    v0();
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10901w, e10);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        boolean z11;
        u0.e aVar;
        u0.e eVar;
        String str5 = this.f10901w;
        try {
            super.onCreate(bundle);
            setContentView(R.layout.activity_new_dynamic_parent);
            ((n) this.D.getValue()).e();
            try {
                Window window = getWindow();
                if (Build.VERSION.SDK_INT >= 23) {
                    View decorView = window.getDecorView();
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 30) {
                        eVar = new u0.d(window);
                    } else {
                        if (i6 >= 26) {
                            aVar = new u0.c(decorView, window);
                        } else if (i6 >= 23) {
                            aVar = new u0.b(decorView, window);
                        } else {
                            aVar = new u0.a(decorView, window);
                        }
                        eVar = aVar;
                    }
                    eVar.d(true);
                }
                window.setStatusBarColor(g0.a.b(this, R.color.login_grey_background));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str5, "Error in setting custom status bar", e10);
            }
            l0 a10 = new o0(this).a(t.class);
            t tVar = (t) a10;
            tVar.L.e(this, new p(9, new b(tVar)));
            Intent intent = getIntent();
            ArrayList<String> arrayList = null;
            if (intent != null) {
                str = intent.getStringExtra("activity_id");
            } else {
                str = null;
            }
            try {
                if (str == null) {
                    tVar.L.i(Boolean.FALSE);
                } else {
                    v.H(kc.f.H(tVar), null, 0, new w(str, tVar, null), 3);
                }
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(tVar.f29789y, e11);
            }
            Intent intent2 = getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("activity_name");
            } else {
                str2 = null;
            }
            Intent intent3 = getIntent();
            if (intent3 != null) {
                str3 = intent3.getStringExtra(Constants.COURSE_NAME);
            } else {
                str3 = null;
            }
            Intent intent4 = getIntent();
            if (intent4 != null) {
                str4 = intent4.getStringExtra("goalSource");
            } else {
                str4 = null;
            }
            Intent intent5 = getIntent();
            if (intent5 != null) {
                z10 = intent5.getBooleanExtra("isMainActivity", false);
            } else {
                z10 = true;
            }
            Intent intent6 = getIntent();
            if (intent6 != null) {
                arrayList = intent6.getStringArrayListExtra("course_tags");
            }
            Intent intent7 = getIntent();
            if (intent7 != null) {
                z11 = intent7.getBooleanExtra("isGoalsClickabilityFlow", false);
            } else {
                z11 = false;
            }
            tVar.T = str2;
            tVar.Q = str3;
            tVar.S = str4;
            if (str3 == null) {
                str3 = "";
            }
            tVar.R = UtilsKt.getCourseId(str3);
            tVar.K = z10;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            tVar.H = arrayList;
            tVar.W = z11;
            this.f10904z = (t) a10;
            RobertoButton robertoButton = (RobertoButton) u0(R.id.parentBottomButton1);
            if (robertoButton != null) {
                robertoButton.setOnClickListener(new View.OnClickListener(this) { // from class: nl.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ NewDynamicParentActivity f26386v;

                    {
                        this.f26386v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NavHostFragment navHostFragment;
                        h hVar;
                        androidx.fragment.app.y childFragmentManager;
                        List<Fragment> L;
                        NavHostFragment navHostFragment2;
                        h hVar2;
                        androidx.fragment.app.y childFragmentManager2;
                        List<Fragment> L2;
                        int i10 = r2;
                        d dVar = null;
                        NewDynamicParentActivity this$0 = this.f26386v;
                        switch (i10) {
                            case 0:
                                int i11 = NewDynamicParentActivity.F;
                                i.g(this$0, "this$0");
                                Fragment E = this$0.getSupportFragmentManager().E(R.id.parentFragmentContainer);
                                if (E instanceof NavHostFragment) {
                                    navHostFragment = (NavHostFragment) E;
                                } else {
                                    navHostFragment = null;
                                }
                                if (navHostFragment != null && (childFragmentManager = navHostFragment.getChildFragmentManager()) != null && (L = childFragmentManager.L()) != null) {
                                    hVar = (Fragment) is.u.i2(L);
                                } else {
                                    hVar = null;
                                }
                                if (hVar instanceof d) {
                                    dVar = (d) hVar;
                                }
                                if (dVar != null) {
                                    dVar.K();
                                    return;
                                }
                                return;
                            case 1:
                                int i12 = NewDynamicParentActivity.F;
                                i.g(this$0, "this$0");
                                Fragment E2 = this$0.getSupportFragmentManager().E(R.id.parentFragmentContainer);
                                if (E2 instanceof NavHostFragment) {
                                    navHostFragment2 = (NavHostFragment) E2;
                                } else {
                                    navHostFragment2 = null;
                                }
                                if (navHostFragment2 != null && (childFragmentManager2 = navHostFragment2.getChildFragmentManager()) != null && (L2 = childFragmentManager2.L()) != null) {
                                    hVar2 = (Fragment) is.u.i2(L2);
                                } else {
                                    hVar2 = null;
                                }
                                if (hVar2 instanceof d) {
                                    dVar = (d) hVar2;
                                }
                                if (dVar != null) {
                                    dVar.M();
                                    return;
                                }
                                return;
                            case 2:
                                int i13 = NewDynamicParentActivity.F;
                                i.g(this$0, "this$0");
                                this$0.C = true;
                                Bundle bundle2 = new Bundle();
                                d.m(bundle2, "course");
                                t tVar2 = this$0.f10904z;
                                if (tVar2 != null) {
                                    bundle2.putString("activity_name", tVar2.T);
                                    bundle2.putBoolean("main_activity", tVar2.K);
                                }
                                bundle2.putBoolean("is_revamped", true);
                                gk.a.b(bundle2, "activity_learn_more_click");
                                new t0().show(this$0.getSupportFragmentManager(), "infoDialog");
                                return;
                            default:
                                int i14 = NewDynamicParentActivity.F;
                                i.g(this$0, "this$0");
                                this$0.onBackPressed();
                                return;
                        }
                    }
                });
            }
            RobertoButton robertoButton2 = (RobertoButton) u0(R.id.parentBottomButton2);
            if (robertoButton2 != null) {
                robertoButton2.setOnClickListener(new View.OnClickListener(this) { // from class: nl.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ NewDynamicParentActivity f26386v;

                    {
                        this.f26386v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NavHostFragment navHostFragment;
                        h hVar;
                        androidx.fragment.app.y childFragmentManager;
                        List<Fragment> L;
                        NavHostFragment navHostFragment2;
                        h hVar2;
                        androidx.fragment.app.y childFragmentManager2;
                        List<Fragment> L2;
                        int i10 = r2;
                        d dVar = null;
                        NewDynamicParentActivity this$0 = this.f26386v;
                        switch (i10) {
                            case 0:
                                int i11 = NewDynamicParentActivity.F;
                                i.g(this$0, "this$0");
                                Fragment E = this$0.getSupportFragmentManager().E(R.id.parentFragmentContainer);
                                if (E instanceof NavHostFragment) {
                                    navHostFragment = (NavHostFragment) E;
                                } else {
                                    navHostFragment = null;
                                }
                                if (navHostFragment != null && (childFragmentManager = navHostFragment.getChildFragmentManager()) != null && (L = childFragmentManager.L()) != null) {
                                    hVar = (Fragment) is.u.i2(L);
                                } else {
                                    hVar = null;
                                }
                                if (hVar instanceof d) {
                                    dVar = (d) hVar;
                                }
                                if (dVar != null) {
                                    dVar.K();
                                    return;
                                }
                                return;
                            case 1:
                                int i12 = NewDynamicParentActivity.F;
                                i.g(this$0, "this$0");
                                Fragment E2 = this$0.getSupportFragmentManager().E(R.id.parentFragmentContainer);
                                if (E2 instanceof NavHostFragment) {
                                    navHostFragment2 = (NavHostFragment) E2;
                                } else {
                                    navHostFragment2 = null;
                                }
                                if (navHostFragment2 != null && (childFragmentManager2 = navHostFragment2.getChildFragmentManager()) != null && (L2 = childFragmentManager2.L()) != null) {
                                    hVar2 = (Fragment) is.u.i2(L2);
                                } else {
                                    hVar2 = null;
                                }
                                if (hVar2 instanceof d) {
                                    dVar = (d) hVar2;
                                }
                                if (dVar != null) {
                                    dVar.M();
                                    return;
                                }
                                return;
                            case 2:
                                int i13 = NewDynamicParentActivity.F;
                                i.g(this$0, "this$0");
                                this$0.C = true;
                                Bundle bundle2 = new Bundle();
                                d.m(bundle2, "course");
                                t tVar2 = this$0.f10904z;
                                if (tVar2 != null) {
                                    bundle2.putString("activity_name", tVar2.T);
                                    bundle2.putBoolean("main_activity", tVar2.K);
                                }
                                bundle2.putBoolean("is_revamped", true);
                                gk.a.b(bundle2, "activity_learn_more_click");
                                new t0().show(this$0.getSupportFragmentManager(), "infoDialog");
                                return;
                            default:
                                int i14 = NewDynamicParentActivity.F;
                                i.g(this$0, "this$0");
                                this$0.onBackPressed();
                                return;
                        }
                    }
                });
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) u0(R.id.parentNavBarInfoButton);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: nl.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ NewDynamicParentActivity f26386v;

                    {
                        this.f26386v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NavHostFragment navHostFragment;
                        h hVar;
                        androidx.fragment.app.y childFragmentManager;
                        List<Fragment> L;
                        NavHostFragment navHostFragment2;
                        h hVar2;
                        androidx.fragment.app.y childFragmentManager2;
                        List<Fragment> L2;
                        int i10 = r2;
                        d dVar = null;
                        NewDynamicParentActivity this$0 = this.f26386v;
                        switch (i10) {
                            case 0:
                                int i11 = NewDynamicParentActivity.F;
                                i.g(this$0, "this$0");
                                Fragment E = this$0.getSupportFragmentManager().E(R.id.parentFragmentContainer);
                                if (E instanceof NavHostFragment) {
                                    navHostFragment = (NavHostFragment) E;
                                } else {
                                    navHostFragment = null;
                                }
                                if (navHostFragment != null && (childFragmentManager = navHostFragment.getChildFragmentManager()) != null && (L = childFragmentManager.L()) != null) {
                                    hVar = (Fragment) is.u.i2(L);
                                } else {
                                    hVar = null;
                                }
                                if (hVar instanceof d) {
                                    dVar = (d) hVar;
                                }
                                if (dVar != null) {
                                    dVar.K();
                                    return;
                                }
                                return;
                            case 1:
                                int i12 = NewDynamicParentActivity.F;
                                i.g(this$0, "this$0");
                                Fragment E2 = this$0.getSupportFragmentManager().E(R.id.parentFragmentContainer);
                                if (E2 instanceof NavHostFragment) {
                                    navHostFragment2 = (NavHostFragment) E2;
                                } else {
                                    navHostFragment2 = null;
                                }
                                if (navHostFragment2 != null && (childFragmentManager2 = navHostFragment2.getChildFragmentManager()) != null && (L2 = childFragmentManager2.L()) != null) {
                                    hVar2 = (Fragment) is.u.i2(L2);
                                } else {
                                    hVar2 = null;
                                }
                                if (hVar2 instanceof d) {
                                    dVar = (d) hVar2;
                                }
                                if (dVar != null) {
                                    dVar.M();
                                    return;
                                }
                                return;
                            case 2:
                                int i13 = NewDynamicParentActivity.F;
                                i.g(this$0, "this$0");
                                this$0.C = true;
                                Bundle bundle2 = new Bundle();
                                d.m(bundle2, "course");
                                t tVar2 = this$0.f10904z;
                                if (tVar2 != null) {
                                    bundle2.putString("activity_name", tVar2.T);
                                    bundle2.putBoolean("main_activity", tVar2.K);
                                }
                                bundle2.putBoolean("is_revamped", true);
                                gk.a.b(bundle2, "activity_learn_more_click");
                                new t0().show(this$0.getSupportFragmentManager(), "infoDialog");
                                return;
                            default:
                                int i14 = NewDynamicParentActivity.F;
                                i.g(this$0, "this$0");
                                this$0.onBackPressed();
                                return;
                        }
                    }
                });
            }
            ((AppCompatImageView) u0(R.id.parentNavBarBackButton)).setOnClickListener(new View.OnClickListener(this) { // from class: nl.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ NewDynamicParentActivity f26386v;

                {
                    this.f26386v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NavHostFragment navHostFragment;
                    h hVar;
                    androidx.fragment.app.y childFragmentManager;
                    List<Fragment> L;
                    NavHostFragment navHostFragment2;
                    h hVar2;
                    androidx.fragment.app.y childFragmentManager2;
                    List<Fragment> L2;
                    int i10 = r2;
                    d dVar = null;
                    NewDynamicParentActivity this$0 = this.f26386v;
                    switch (i10) {
                        case 0:
                            int i11 = NewDynamicParentActivity.F;
                            i.g(this$0, "this$0");
                            Fragment E = this$0.getSupportFragmentManager().E(R.id.parentFragmentContainer);
                            if (E instanceof NavHostFragment) {
                                navHostFragment = (NavHostFragment) E;
                            } else {
                                navHostFragment = null;
                            }
                            if (navHostFragment != null && (childFragmentManager = navHostFragment.getChildFragmentManager()) != null && (L = childFragmentManager.L()) != null) {
                                hVar = (Fragment) is.u.i2(L);
                            } else {
                                hVar = null;
                            }
                            if (hVar instanceof d) {
                                dVar = (d) hVar;
                            }
                            if (dVar != null) {
                                dVar.K();
                                return;
                            }
                            return;
                        case 1:
                            int i12 = NewDynamicParentActivity.F;
                            i.g(this$0, "this$0");
                            Fragment E2 = this$0.getSupportFragmentManager().E(R.id.parentFragmentContainer);
                            if (E2 instanceof NavHostFragment) {
                                navHostFragment2 = (NavHostFragment) E2;
                            } else {
                                navHostFragment2 = null;
                            }
                            if (navHostFragment2 != null && (childFragmentManager2 = navHostFragment2.getChildFragmentManager()) != null && (L2 = childFragmentManager2.L()) != null) {
                                hVar2 = (Fragment) is.u.i2(L2);
                            } else {
                                hVar2 = null;
                            }
                            if (hVar2 instanceof d) {
                                dVar = (d) hVar2;
                            }
                            if (dVar != null) {
                                dVar.M();
                                return;
                            }
                            return;
                        case 2:
                            int i13 = NewDynamicParentActivity.F;
                            i.g(this$0, "this$0");
                            this$0.C = true;
                            Bundle bundle2 = new Bundle();
                            d.m(bundle2, "course");
                            t tVar2 = this$0.f10904z;
                            if (tVar2 != null) {
                                bundle2.putString("activity_name", tVar2.T);
                                bundle2.putBoolean("main_activity", tVar2.K);
                            }
                            bundle2.putBoolean("is_revamped", true);
                            gk.a.b(bundle2, "activity_learn_more_click");
                            new t0().show(this$0.getSupportFragmentManager(), "infoDialog");
                            return;
                        default:
                            int i14 = NewDynamicParentActivity.F;
                            i.g(this$0, "this$0");
                            this$0.onBackPressed();
                            return;
                    }
                }
            });
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(str5, e12);
        }
    }

    public final View u0(int i6) {
        LinkedHashMap linkedHashMap = this.E;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final void v0() {
        Boolean bool;
        try {
            Intent intent = new Intent();
            t tVar = this.f10904z;
            if (tVar != null) {
                bool = Boolean.valueOf(tVar.U);
            } else {
                bool = null;
            }
            intent.putExtra("isCompleted", bool);
            hs.k kVar = hs.k.f19476a;
            setResult(-1, intent);
            finish();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10901w, e10);
        }
    }

    public final Integer w0(String str) {
        String lowerCase;
        if (str != null) {
            try {
                Locale ENGLISH = Locale.ENGLISH;
                i.f(ENGLISH, "ENGLISH");
                lowerCase = str.toLowerCase(ENGLISH);
                i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f10901w, e10);
                return null;
            }
        } else {
            lowerCase = null;
        }
        if (lowerCase == null) {
            return null;
        }
        switch (lowerCase.hashCode()) {
            case 3459:
                if (!lowerCase.equals("n1")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN1);
            case 3462:
                if (!lowerCase.equals("n4")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN4);
            case 3463:
                if (!lowerCase.equals("n5")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN5);
            case 107277:
                if (!lowerCase.equals("n10")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN10);
            case 107286:
                if (!lowerCase.equals("n19")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN19);
            case 107308:
                if (!lowerCase.equals("n20")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN20);
            case 107312:
                if (!lowerCase.equals("n24")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN24);
            case 107339:
                if (!lowerCase.equals("n30")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN30);
            case 107388:
                if (!lowerCase.equals("n3a")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN3);
            case 107413:
                if (!lowerCase.equals("n3z")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN3);
            case 107419:
                if (!lowerCase.equals("n4a")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN4);
            case 107450:
                if (!lowerCase.equals("n5a")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN5);
            case 107481:
                if (!lowerCase.equals("n6a")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN6A);
            case 107574:
                if (!lowerCase.equals("n9a")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN9A);
            case 107575:
                if (!lowerCase.equals("n9b")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN9B);
            case 3325685:
                if (!lowerCase.equals("n10b")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN10);
            case 3325746:
                if (!lowerCase.equals("n12a")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN12A);
            case 3325748:
                if (!lowerCase.equals("n12c")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN12C);
            case 3325778:
                if (!lowerCase.equals("n13b")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN13B);
            case 3325808:
                if (!lowerCase.equals("n14a")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN14A);
            case 3325810:
                if (!lowerCase.equals("n14c")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN14C);
            case 3325932:
                if (!lowerCase.equals("n18a")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN18A);
            case 3325933:
                if (!lowerCase.equals("n18b")) {
                    return null;
                }
                return Integer.valueOf((int) R.id.navN18B);
            default:
                return null;
        }
    }

    public final Integer x0() {
        Integer num = null;
        try {
            ConstraintLayout constraintLayout = (ConstraintLayout) u0(R.id.parentCtaContainer);
            if (constraintLayout != null) {
                num = Integer.valueOf(constraintLayout.getVisibility());
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) u0(R.id.parentCtaContainer);
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(8);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10901w, e10);
        }
        return num;
    }

    public final void y0() {
        try {
            ProgressBar progressBar = (ProgressBar) u0(R.id.pbParentProgress);
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10901w, e10);
        }
    }

    public final void z0(int i6, String str, boolean z10, a0 a0Var) {
        NavHostFragment navHostFragment;
        s1.y yVar;
        String str2;
        ArrayList<NewDynamicActivityScreenDataClass> arrayList;
        NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass;
        ArrayList<NewDynamicActivityScreenDataClass> arrayList2;
        NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass2;
        try {
            Fragment E = getSupportFragmentManager().E(R.id.parentFragmentContainer);
            String str3 = null;
            if (E instanceof NavHostFragment) {
                navHostFragment = (NavHostFragment) E;
            } else {
                navHostFragment = null;
            }
            if (navHostFragment != null) {
                yVar = navHostFragment.F();
            } else {
                yVar = null;
            }
            if (yVar != null) {
                Bundle bundle = new Bundle();
                bundle.putInt(Constants.DAYMODEL_POSITION, this.f10903y);
                t tVar = this.f10904z;
                if (tVar != null && (arrayList2 = tVar.P) != null && (newDynamicActivityScreenDataClass2 = (NewDynamicActivityScreenDataClass) is.u.j2(this.f10903y, arrayList2)) != null) {
                    str2 = newDynamicActivityScreenDataClass2.getSlug();
                } else {
                    str2 = null;
                }
                bundle.putString("slug", str2);
                t tVar2 = this.f10904z;
                if (tVar2 != null && (arrayList = tVar2.P) != null && (newDynamicActivityScreenDataClass = (NewDynamicActivityScreenDataClass) is.u.j2(this.f10903y, arrayList)) != null) {
                    str3 = newDynamicActivityScreenDataClass.getScreenId();
                }
                bundle.putString("screenId", str3);
                bundle.putString("cta_slug", str);
                bundle.putBoolean("show_info_button", z10);
                if (this.B) {
                    this.B = false;
                    t tVar3 = this.f10904z;
                    int i10 = -1;
                    if (tVar3 != null) {
                        int i11 = tVar3.E;
                        tVar3.E = -1;
                        i10 = i11;
                    }
                    bundle.putInt("customBackStackPopCount", i10);
                }
                hs.k kVar = hs.k.f19476a;
                yVar.l(i6, bundle, a0Var);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10901w, e10);
        }
    }
}
