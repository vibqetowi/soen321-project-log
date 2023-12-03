package com.theinnerhour.b2b.components.dashboard.experiment.activity;

import android.app.Application;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.activity.h;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.lifecycle.w;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationView;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DeepLinkActivationActivity;
import com.theinnerhour.b2b.activity.DeeplinkCodeActivationActivity;
import com.theinnerhour.b2b.activity.SettingsActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NotV4Activity;
import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertCareInfoActivity;
import com.theinnerhour.b2b.components.lock.activity.LockScreenActivity;
import com.theinnerhour.b2b.components.lock.activity.LockScreenOptionsActivity;
import com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity;
import com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerInsightsActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.DashboardNpsDayTrack;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.UserNpsCheckModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.persistence.StatPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.PaymentUtils;
import com.theinnerhour.b2b.utils.RoutingIntentHandler;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fl.t;
import fl.u;
import hl.s;
import hs.i;
import il.m;
import il.n;
import il.q;
import java.util.HashMap;
import java.util.LinkedHashMap;
import jl.i1;
import jl.o1;
import jl.p1;
import kn.a;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.o0;
import ss.l;
import t0.u0;
import tr.r;
import w5.h0;
import ya.j;
/* compiled from: NotV4Activity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/theinnerhour/b2b/components/dashboard/experiment/activity/NotV4Activity;", "Landroidx/appcompat/app/c;", "Lil/m$a;", "Lil/d;", "Lcom/google/android/material/navigation/NavigationView$a;", "Lil/n;", "Lul/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NotV4Activity extends androidx.appcompat.app.c implements m.a, il.d, NavigationView.a, n, ul.a {
    public static final /* synthetic */ int G = 0;
    public boolean A;
    public NotV4DashboardViewModel B;
    public final androidx.activity.result.c<Intent> C;
    public final androidx.activity.result.c<Intent> D;
    public boolean E;
    public v.c F;

    /* renamed from: v  reason: collision with root package name */
    public final String f10824v;

    /* renamed from: w  reason: collision with root package name */
    public final CourseApiUtil f10825w;

    /* renamed from: x  reason: collision with root package name */
    public m f10826x;

    /* renamed from: y  reason: collision with root package name */
    public final i f10827y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f10828z;

    /* compiled from: NotV4Activity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<q> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final q invoke() {
            NotV4Activity notV4Activity = NotV4Activity.this;
            return new q(notV4Activity, notV4Activity);
        }
    }

    /* compiled from: NotV4Activity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<SingleUseEvent<? extends String>, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends String> singleUseEvent) {
            String contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            if (contentIfNotHandled != null) {
                int i6 = NotV4Activity.G;
                Dialog b10 = ((q) NotV4Activity.this.f10827y.getValue()).b(contentIfNotHandled);
                if (b10 != null) {
                    b10.show();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4Activity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements l<Boolean, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f10831u = new c();

        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean it = bool;
            kotlin.jvm.internal.i.f(it, "it");
            if (it.booleanValue()) {
                ApplicationPersistence.getInstance().setLongValue(Constants.FETCH_LIBRARY_CONTENT_ON_DB_TIME, Utils.INSTANCE.getTodayTimeInSeconds());
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4Activity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements l<Boolean, hs.k> {
        public d() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                int i6 = NotV4Activity.G;
                NotV4Activity.this.q0();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4Activity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends h {
        public f() {
            super(true);
        }

        @Override // androidx.activity.h
        public final void a() {
            s sVar;
            boolean z10;
            NotV4Activity notV4Activity = NotV4Activity.this;
            Fragment E = notV4Activity.getSupportFragmentManager().E(R.id.flNotV4DashboardMain);
            if (E instanceof s) {
                sVar = (s) E;
            } else {
                sVar = null;
            }
            boolean z11 = false;
            if (sVar != null) {
                xj.b bVar = sVar.I;
                if (bVar != null) {
                    bVar.a();
                    sVar.I = null;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                }
            }
            if (!z11) {
                notV4Activity.finish();
            }
        }
    }

    /* compiled from: NotV4Activity.kt */
    /* loaded from: classes2.dex */
    public static final class g extends k implements l<Boolean, hs.k> {
        public g() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            int i6;
            View view;
            AppCompatSeekBar appCompatSeekBar;
            AppCompatImageView appCompatImageView;
            yp.c cVar;
            RobertoTextView robertoTextView;
            yp.c cVar2;
            RobertoTextView robertoTextView2;
            yp.c cVar3;
            RobertoTextView robertoTextView3;
            yp.c cVar4;
            RobertoTextView robertoTextView4;
            yp.c cVar5;
            RobertoTextView robertoTextView5;
            yp.c cVar6;
            RobertoTextView robertoTextView6;
            yp.c cVar7;
            RobertoTextView robertoTextView7;
            yp.c cVar8;
            RobertoTextView robertoTextView8;
            yp.c cVar9;
            RobertoTextView robertoTextView9;
            yp.c cVar10;
            RobertoTextView robertoTextView10;
            yp.c cVar11;
            RobertoTextView robertoTextView11;
            yp.c cVar12;
            AppCompatImageView appCompatImageView2;
            yp.c cVar13;
            AppCompatImageView appCompatImageView3;
            yp.c cVar14;
            ConstraintLayout constraintLayout;
            yp.c cVar15;
            yp.c cVar16;
            RobertoButton robertoButton;
            yp.c cVar17;
            AppCompatSeekBar appCompatSeekBar2;
            yp.c cVar18;
            yp.c cVar19;
            yp.c cVar20;
            ConstraintLayout constraintLayout2;
            yp.c cVar21;
            DashboardNpsDayTrack dashboardNps;
            if (bool.booleanValue()) {
                NpsPersistence npsPersistence = NpsPersistence.INSTANCE;
                npsPersistence.checkAndUpdateAppOpenDay();
                if (npsPersistence.isDashboardNpsPendingForDay(5)) {
                    UserNpsCheckModel npsCheckModel = npsPersistence.getNpsCheckModel();
                    if (npsCheckModel != null && (dashboardNps = npsCheckModel.getDashboardNps()) != null) {
                        i6 = dashboardNps.getAppOpenDayCount();
                    } else {
                        i6 = -1;
                    }
                    if (i6 >= 5) {
                        final NotV4Activity notV4Activity = NotV4Activity.this;
                        v.c cVar22 = notV4Activity.F;
                        View view2 = null;
                        if (cVar22 != null && (cVar21 = (yp.c) cVar22.f34633x) != null) {
                            view = cVar21.f38755x;
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            view.setVisibility(0);
                        }
                        v.c cVar23 = notV4Activity.F;
                        if (cVar23 != null && (cVar20 = (yp.c) cVar23.f34633x) != null && (constraintLayout2 = cVar20.f38734a) != null) {
                            BottomSheetBehavior.from(constraintLayout2).addBottomSheetCallback(new fl.s(notV4Activity));
                        }
                        v vVar = new v();
                        vVar.f23467u = -1;
                        v.c cVar24 = notV4Activity.F;
                        if (cVar24 != null && (cVar19 = (yp.c) cVar24.f34633x) != null) {
                            appCompatSeekBar = cVar19.f38743k;
                        } else {
                            appCompatSeekBar = null;
                        }
                        if (appCompatSeekBar != null) {
                            appCompatSeekBar.setThumbTintList(ColorStateList.valueOf(g0.a.b(notV4Activity, R.color.transparent)));
                        }
                        v.c cVar25 = notV4Activity.F;
                        if (cVar25 != null && (cVar18 = (yp.c) cVar25.f34633x) != null) {
                            appCompatImageView = cVar18.f38739g;
                        } else {
                            appCompatImageView = null;
                        }
                        if (appCompatImageView != null) {
                            appCompatImageView.setImageTintList(ColorStateList.valueOf(g0.a.b(notV4Activity, R.color.login_grey_background)));
                        }
                        v.c cVar26 = notV4Activity.F;
                        if (cVar26 != null && (cVar17 = (yp.c) cVar26.f34633x) != null && (appCompatSeekBar2 = cVar17.f38743k) != null) {
                            appCompatSeekBar2.setOnSeekBarChangeListener(new t(notV4Activity, vVar));
                        }
                        Animation loadAnimation = AnimationUtils.loadAnimation(notV4Activity, R.anim.slide_fade_out_left);
                        loadAnimation.setAnimationListener(new u(notV4Activity, vVar));
                        v.c cVar27 = notV4Activity.F;
                        if (cVar27 != null && (cVar16 = (yp.c) cVar27.f34633x) != null && (robertoButton = cVar16.f38741i) != null) {
                            robertoButton.setOnClickListener(new dk.t(14, vVar, notV4Activity, loadAnimation));
                        }
                        v.c cVar28 = notV4Activity.F;
                        if (cVar28 != null && (cVar15 = (yp.c) cVar28.f34633x) != null) {
                            view2 = cVar15.f38755x;
                        }
                        if (view2 != null) {
                            view2.setVisibility(0);
                        }
                        v.c cVar29 = notV4Activity.F;
                        if (cVar29 != null && (cVar14 = (yp.c) cVar29.f34633x) != null && (constraintLayout = cVar14.f38734a) != null) {
                            BottomSheetBehavior.from(constraintLayout).setState(3);
                        }
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: fl.r
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                yp.c cVar30;
                                yp.c cVar31;
                                yp.c cVar32;
                                yp.c cVar33;
                                yp.c cVar34;
                                ConstraintLayout constraintLayout3;
                                yp.c cVar35;
                                yp.c cVar36;
                                yp.c cVar37;
                                yp.c cVar38;
                                yp.c cVar39;
                                yp.c cVar40;
                                yp.c cVar41;
                                int i10 = r2;
                                AppCompatSeekBar appCompatSeekBar3 = null;
                                NotV4Activity this$0 = notV4Activity;
                                switch (i10) {
                                    case 0:
                                        int i11 = NotV4Activity.G;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        v.c cVar42 = this$0.F;
                                        if (cVar42 != null && (cVar31 = (yp.c) cVar42.f34633x) != null) {
                                            appCompatSeekBar3 = cVar31.f38743k;
                                        }
                                        if (appCompatSeekBar3 != null) {
                                            appCompatSeekBar3.setProgress(8);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        int i12 = NotV4Activity.G;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        v.c cVar43 = this$0.F;
                                        if (cVar43 != null && (cVar32 = (yp.c) cVar43.f34633x) != null) {
                                            appCompatSeekBar3 = cVar32.f38743k;
                                        }
                                        if (appCompatSeekBar3 != null) {
                                            appCompatSeekBar3.setProgress(9);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        int i13 = NotV4Activity.G;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        v.c cVar44 = this$0.F;
                                        if (cVar44 != null && (cVar33 = (yp.c) cVar44.f34633x) != null) {
                                            appCompatSeekBar3 = cVar33.f38743k;
                                        }
                                        if (appCompatSeekBar3 != null) {
                                            appCompatSeekBar3.setProgress(10);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        int i14 = NotV4Activity.G;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        v.c cVar45 = this$0.F;
                                        if (cVar45 != null && (cVar34 = (yp.c) cVar45.f34633x) != null && (constraintLayout3 = cVar34.f38734a) != null) {
                                            BottomSheetBehavior.from(constraintLayout3).setState(4);
                                        }
                                        String str = gk.a.f16573a;
                                        Bundle bundle = new Bundle();
                                        defpackage.e.s(bundle, "course", "type", "overall");
                                        hs.k kVar = hs.k.f19476a;
                                        gk.a.b(bundle, "self_care_nps_cancel");
                                        return;
                                    case 4:
                                        int i15 = NotV4Activity.G;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        v.c cVar46 = this$0.F;
                                        if (cVar46 != null && (cVar35 = (yp.c) cVar46.f34633x) != null) {
                                            appCompatSeekBar3 = cVar35.f38743k;
                                        }
                                        if (appCompatSeekBar3 != null) {
                                            appCompatSeekBar3.setProgress(0);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        int i16 = NotV4Activity.G;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        v.c cVar47 = this$0.F;
                                        if (cVar47 != null && (cVar36 = (yp.c) cVar47.f34633x) != null) {
                                            appCompatSeekBar3 = cVar36.f38743k;
                                        }
                                        if (appCompatSeekBar3 != null) {
                                            appCompatSeekBar3.setProgress(1);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        int i17 = NotV4Activity.G;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        v.c cVar48 = this$0.F;
                                        if (cVar48 != null && (cVar37 = (yp.c) cVar48.f34633x) != null) {
                                            appCompatSeekBar3 = cVar37.f38743k;
                                        }
                                        if (appCompatSeekBar3 != null) {
                                            appCompatSeekBar3.setProgress(2);
                                            return;
                                        }
                                        return;
                                    case 7:
                                        int i18 = NotV4Activity.G;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        v.c cVar49 = this$0.F;
                                        if (cVar49 != null && (cVar38 = (yp.c) cVar49.f34633x) != null) {
                                            appCompatSeekBar3 = cVar38.f38743k;
                                        }
                                        if (appCompatSeekBar3 != null) {
                                            appCompatSeekBar3.setProgress(3);
                                            return;
                                        }
                                        return;
                                    case 8:
                                        int i19 = NotV4Activity.G;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        v.c cVar50 = this$0.F;
                                        if (cVar50 != null && (cVar39 = (yp.c) cVar50.f34633x) != null) {
                                            appCompatSeekBar3 = cVar39.f38743k;
                                        }
                                        if (appCompatSeekBar3 != null) {
                                            appCompatSeekBar3.setProgress(4);
                                            return;
                                        }
                                        return;
                                    case 9:
                                        int i20 = NotV4Activity.G;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        v.c cVar51 = this$0.F;
                                        if (cVar51 != null && (cVar40 = (yp.c) cVar51.f34633x) != null) {
                                            appCompatSeekBar3 = cVar40.f38743k;
                                        }
                                        if (appCompatSeekBar3 != null) {
                                            appCompatSeekBar3.setProgress(5);
                                            return;
                                        }
                                        return;
                                    case 10:
                                        int i21 = NotV4Activity.G;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        v.c cVar52 = this$0.F;
                                        if (cVar52 != null && (cVar41 = (yp.c) cVar52.f34633x) != null) {
                                            appCompatSeekBar3 = cVar41.f38743k;
                                        }
                                        if (appCompatSeekBar3 != null) {
                                            appCompatSeekBar3.setProgress(6);
                                            return;
                                        }
                                        return;
                                    default:
                                        int i22 = NotV4Activity.G;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        v.c cVar53 = this$0.F;
                                        if (cVar53 != null && (cVar30 = (yp.c) cVar53.f34633x) != null) {
                                            appCompatSeekBar3 = cVar30.f38743k;
                                        }
                                        if (appCompatSeekBar3 != null) {
                                            appCompatSeekBar3.setProgress(7);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        v.c cVar30 = notV4Activity.F;
                        if (cVar30 != null && (cVar13 = (yp.c) cVar30.f34633x) != null && (appCompatImageView3 = cVar13.f38738e) != null) {
                            appCompatImageView3.setOnClickListener(onClickListener);
                        }
                        v.c cVar31 = notV4Activity.F;
                        if (cVar31 != null && (cVar12 = (yp.c) cVar31.f34633x) != null && (appCompatImageView2 = cVar12.f) != null) {
                            appCompatImageView2.setOnClickListener(onClickListener);
                        }
                        v.c cVar32 = notV4Activity.F;
                        if (cVar32 != null && (cVar11 = (yp.c) cVar32.f34633x) != null && (robertoTextView11 = cVar11.f38745m) != null) {
                            robertoTextView11.setOnClickListener(new View.OnClickListener() { // from class: fl.r
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    yp.c cVar302;
                                    yp.c cVar312;
                                    yp.c cVar322;
                                    yp.c cVar33;
                                    yp.c cVar34;
                                    ConstraintLayout constraintLayout3;
                                    yp.c cVar35;
                                    yp.c cVar36;
                                    yp.c cVar37;
                                    yp.c cVar38;
                                    yp.c cVar39;
                                    yp.c cVar40;
                                    yp.c cVar41;
                                    int i10 = r2;
                                    AppCompatSeekBar appCompatSeekBar3 = null;
                                    NotV4Activity this$0 = notV4Activity;
                                    switch (i10) {
                                        case 0:
                                            int i11 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar42 = this$0.F;
                                            if (cVar42 != null && (cVar312 = (yp.c) cVar42.f34633x) != null) {
                                                appCompatSeekBar3 = cVar312.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(8);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            int i12 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar43 = this$0.F;
                                            if (cVar43 != null && (cVar322 = (yp.c) cVar43.f34633x) != null) {
                                                appCompatSeekBar3 = cVar322.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(9);
                                                return;
                                            }
                                            return;
                                        case 2:
                                            int i13 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar44 = this$0.F;
                                            if (cVar44 != null && (cVar33 = (yp.c) cVar44.f34633x) != null) {
                                                appCompatSeekBar3 = cVar33.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(10);
                                                return;
                                            }
                                            return;
                                        case 3:
                                            int i14 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar45 = this$0.F;
                                            if (cVar45 != null && (cVar34 = (yp.c) cVar45.f34633x) != null && (constraintLayout3 = cVar34.f38734a) != null) {
                                                BottomSheetBehavior.from(constraintLayout3).setState(4);
                                            }
                                            String str = gk.a.f16573a;
                                            Bundle bundle = new Bundle();
                                            defpackage.e.s(bundle, "course", "type", "overall");
                                            hs.k kVar = hs.k.f19476a;
                                            gk.a.b(bundle, "self_care_nps_cancel");
                                            return;
                                        case 4:
                                            int i15 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar46 = this$0.F;
                                            if (cVar46 != null && (cVar35 = (yp.c) cVar46.f34633x) != null) {
                                                appCompatSeekBar3 = cVar35.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(0);
                                                return;
                                            }
                                            return;
                                        case 5:
                                            int i16 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar47 = this$0.F;
                                            if (cVar47 != null && (cVar36 = (yp.c) cVar47.f34633x) != null) {
                                                appCompatSeekBar3 = cVar36.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(1);
                                                return;
                                            }
                                            return;
                                        case 6:
                                            int i17 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar48 = this$0.F;
                                            if (cVar48 != null && (cVar37 = (yp.c) cVar48.f34633x) != null) {
                                                appCompatSeekBar3 = cVar37.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(2);
                                                return;
                                            }
                                            return;
                                        case 7:
                                            int i18 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar49 = this$0.F;
                                            if (cVar49 != null && (cVar38 = (yp.c) cVar49.f34633x) != null) {
                                                appCompatSeekBar3 = cVar38.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(3);
                                                return;
                                            }
                                            return;
                                        case 8:
                                            int i19 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar50 = this$0.F;
                                            if (cVar50 != null && (cVar39 = (yp.c) cVar50.f34633x) != null) {
                                                appCompatSeekBar3 = cVar39.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(4);
                                                return;
                                            }
                                            return;
                                        case 9:
                                            int i20 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar51 = this$0.F;
                                            if (cVar51 != null && (cVar40 = (yp.c) cVar51.f34633x) != null) {
                                                appCompatSeekBar3 = cVar40.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(5);
                                                return;
                                            }
                                            return;
                                        case 10:
                                            int i21 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar52 = this$0.F;
                                            if (cVar52 != null && (cVar41 = (yp.c) cVar52.f34633x) != null) {
                                                appCompatSeekBar3 = cVar41.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(6);
                                                return;
                                            }
                                            return;
                                        default:
                                            int i22 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar53 = this$0.F;
                                            if (cVar53 != null && (cVar302 = (yp.c) cVar53.f34633x) != null) {
                                                appCompatSeekBar3 = cVar302.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(7);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        v.c cVar33 = notV4Activity.F;
                        if (cVar33 != null && (cVar10 = (yp.c) cVar33.f34633x) != null && (robertoTextView10 = cVar10.f38746n) != null) {
                            robertoTextView10.setOnClickListener(new View.OnClickListener() { // from class: fl.r
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    yp.c cVar302;
                                    yp.c cVar312;
                                    yp.c cVar322;
                                    yp.c cVar332;
                                    yp.c cVar34;
                                    ConstraintLayout constraintLayout3;
                                    yp.c cVar35;
                                    yp.c cVar36;
                                    yp.c cVar37;
                                    yp.c cVar38;
                                    yp.c cVar39;
                                    yp.c cVar40;
                                    yp.c cVar41;
                                    int i10 = r2;
                                    AppCompatSeekBar appCompatSeekBar3 = null;
                                    NotV4Activity this$0 = notV4Activity;
                                    switch (i10) {
                                        case 0:
                                            int i11 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar42 = this$0.F;
                                            if (cVar42 != null && (cVar312 = (yp.c) cVar42.f34633x) != null) {
                                                appCompatSeekBar3 = cVar312.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(8);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            int i12 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar43 = this$0.F;
                                            if (cVar43 != null && (cVar322 = (yp.c) cVar43.f34633x) != null) {
                                                appCompatSeekBar3 = cVar322.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(9);
                                                return;
                                            }
                                            return;
                                        case 2:
                                            int i13 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar44 = this$0.F;
                                            if (cVar44 != null && (cVar332 = (yp.c) cVar44.f34633x) != null) {
                                                appCompatSeekBar3 = cVar332.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(10);
                                                return;
                                            }
                                            return;
                                        case 3:
                                            int i14 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar45 = this$0.F;
                                            if (cVar45 != null && (cVar34 = (yp.c) cVar45.f34633x) != null && (constraintLayout3 = cVar34.f38734a) != null) {
                                                BottomSheetBehavior.from(constraintLayout3).setState(4);
                                            }
                                            String str = gk.a.f16573a;
                                            Bundle bundle = new Bundle();
                                            defpackage.e.s(bundle, "course", "type", "overall");
                                            hs.k kVar = hs.k.f19476a;
                                            gk.a.b(bundle, "self_care_nps_cancel");
                                            return;
                                        case 4:
                                            int i15 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar46 = this$0.F;
                                            if (cVar46 != null && (cVar35 = (yp.c) cVar46.f34633x) != null) {
                                                appCompatSeekBar3 = cVar35.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(0);
                                                return;
                                            }
                                            return;
                                        case 5:
                                            int i16 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar47 = this$0.F;
                                            if (cVar47 != null && (cVar36 = (yp.c) cVar47.f34633x) != null) {
                                                appCompatSeekBar3 = cVar36.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(1);
                                                return;
                                            }
                                            return;
                                        case 6:
                                            int i17 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar48 = this$0.F;
                                            if (cVar48 != null && (cVar37 = (yp.c) cVar48.f34633x) != null) {
                                                appCompatSeekBar3 = cVar37.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(2);
                                                return;
                                            }
                                            return;
                                        case 7:
                                            int i18 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar49 = this$0.F;
                                            if (cVar49 != null && (cVar38 = (yp.c) cVar49.f34633x) != null) {
                                                appCompatSeekBar3 = cVar38.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(3);
                                                return;
                                            }
                                            return;
                                        case 8:
                                            int i19 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar50 = this$0.F;
                                            if (cVar50 != null && (cVar39 = (yp.c) cVar50.f34633x) != null) {
                                                appCompatSeekBar3 = cVar39.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(4);
                                                return;
                                            }
                                            return;
                                        case 9:
                                            int i20 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar51 = this$0.F;
                                            if (cVar51 != null && (cVar40 = (yp.c) cVar51.f34633x) != null) {
                                                appCompatSeekBar3 = cVar40.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(5);
                                                return;
                                            }
                                            return;
                                        case 10:
                                            int i21 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar52 = this$0.F;
                                            if (cVar52 != null && (cVar41 = (yp.c) cVar52.f34633x) != null) {
                                                appCompatSeekBar3 = cVar41.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(6);
                                                return;
                                            }
                                            return;
                                        default:
                                            int i22 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar53 = this$0.F;
                                            if (cVar53 != null && (cVar302 = (yp.c) cVar53.f34633x) != null) {
                                                appCompatSeekBar3 = cVar302.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(7);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        v.c cVar34 = notV4Activity.F;
                        if (cVar34 != null && (cVar9 = (yp.c) cVar34.f34633x) != null && (robertoTextView9 = cVar9.f38748p) != null) {
                            robertoTextView9.setOnClickListener(new View.OnClickListener() { // from class: fl.r
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    yp.c cVar302;
                                    yp.c cVar312;
                                    yp.c cVar322;
                                    yp.c cVar332;
                                    yp.c cVar342;
                                    ConstraintLayout constraintLayout3;
                                    yp.c cVar35;
                                    yp.c cVar36;
                                    yp.c cVar37;
                                    yp.c cVar38;
                                    yp.c cVar39;
                                    yp.c cVar40;
                                    yp.c cVar41;
                                    int i10 = r2;
                                    AppCompatSeekBar appCompatSeekBar3 = null;
                                    NotV4Activity this$0 = notV4Activity;
                                    switch (i10) {
                                        case 0:
                                            int i11 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar42 = this$0.F;
                                            if (cVar42 != null && (cVar312 = (yp.c) cVar42.f34633x) != null) {
                                                appCompatSeekBar3 = cVar312.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(8);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            int i12 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar43 = this$0.F;
                                            if (cVar43 != null && (cVar322 = (yp.c) cVar43.f34633x) != null) {
                                                appCompatSeekBar3 = cVar322.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(9);
                                                return;
                                            }
                                            return;
                                        case 2:
                                            int i13 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar44 = this$0.F;
                                            if (cVar44 != null && (cVar332 = (yp.c) cVar44.f34633x) != null) {
                                                appCompatSeekBar3 = cVar332.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(10);
                                                return;
                                            }
                                            return;
                                        case 3:
                                            int i14 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar45 = this$0.F;
                                            if (cVar45 != null && (cVar342 = (yp.c) cVar45.f34633x) != null && (constraintLayout3 = cVar342.f38734a) != null) {
                                                BottomSheetBehavior.from(constraintLayout3).setState(4);
                                            }
                                            String str = gk.a.f16573a;
                                            Bundle bundle = new Bundle();
                                            defpackage.e.s(bundle, "course", "type", "overall");
                                            hs.k kVar = hs.k.f19476a;
                                            gk.a.b(bundle, "self_care_nps_cancel");
                                            return;
                                        case 4:
                                            int i15 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar46 = this$0.F;
                                            if (cVar46 != null && (cVar35 = (yp.c) cVar46.f34633x) != null) {
                                                appCompatSeekBar3 = cVar35.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(0);
                                                return;
                                            }
                                            return;
                                        case 5:
                                            int i16 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar47 = this$0.F;
                                            if (cVar47 != null && (cVar36 = (yp.c) cVar47.f34633x) != null) {
                                                appCompatSeekBar3 = cVar36.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(1);
                                                return;
                                            }
                                            return;
                                        case 6:
                                            int i17 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar48 = this$0.F;
                                            if (cVar48 != null && (cVar37 = (yp.c) cVar48.f34633x) != null) {
                                                appCompatSeekBar3 = cVar37.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(2);
                                                return;
                                            }
                                            return;
                                        case 7:
                                            int i18 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar49 = this$0.F;
                                            if (cVar49 != null && (cVar38 = (yp.c) cVar49.f34633x) != null) {
                                                appCompatSeekBar3 = cVar38.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(3);
                                                return;
                                            }
                                            return;
                                        case 8:
                                            int i19 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar50 = this$0.F;
                                            if (cVar50 != null && (cVar39 = (yp.c) cVar50.f34633x) != null) {
                                                appCompatSeekBar3 = cVar39.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(4);
                                                return;
                                            }
                                            return;
                                        case 9:
                                            int i20 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar51 = this$0.F;
                                            if (cVar51 != null && (cVar40 = (yp.c) cVar51.f34633x) != null) {
                                                appCompatSeekBar3 = cVar40.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(5);
                                                return;
                                            }
                                            return;
                                        case 10:
                                            int i21 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar52 = this$0.F;
                                            if (cVar52 != null && (cVar41 = (yp.c) cVar52.f34633x) != null) {
                                                appCompatSeekBar3 = cVar41.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(6);
                                                return;
                                            }
                                            return;
                                        default:
                                            int i22 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar53 = this$0.F;
                                            if (cVar53 != null && (cVar302 = (yp.c) cVar53.f34633x) != null) {
                                                appCompatSeekBar3 = cVar302.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(7);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        v.c cVar35 = notV4Activity.F;
                        if (cVar35 != null && (cVar8 = (yp.c) cVar35.f34633x) != null && (robertoTextView8 = cVar8.f38749q) != null) {
                            robertoTextView8.setOnClickListener(new View.OnClickListener() { // from class: fl.r
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    yp.c cVar302;
                                    yp.c cVar312;
                                    yp.c cVar322;
                                    yp.c cVar332;
                                    yp.c cVar342;
                                    ConstraintLayout constraintLayout3;
                                    yp.c cVar352;
                                    yp.c cVar36;
                                    yp.c cVar37;
                                    yp.c cVar38;
                                    yp.c cVar39;
                                    yp.c cVar40;
                                    yp.c cVar41;
                                    int i10 = r2;
                                    AppCompatSeekBar appCompatSeekBar3 = null;
                                    NotV4Activity this$0 = notV4Activity;
                                    switch (i10) {
                                        case 0:
                                            int i11 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar42 = this$0.F;
                                            if (cVar42 != null && (cVar312 = (yp.c) cVar42.f34633x) != null) {
                                                appCompatSeekBar3 = cVar312.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(8);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            int i12 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar43 = this$0.F;
                                            if (cVar43 != null && (cVar322 = (yp.c) cVar43.f34633x) != null) {
                                                appCompatSeekBar3 = cVar322.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(9);
                                                return;
                                            }
                                            return;
                                        case 2:
                                            int i13 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar44 = this$0.F;
                                            if (cVar44 != null && (cVar332 = (yp.c) cVar44.f34633x) != null) {
                                                appCompatSeekBar3 = cVar332.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(10);
                                                return;
                                            }
                                            return;
                                        case 3:
                                            int i14 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar45 = this$0.F;
                                            if (cVar45 != null && (cVar342 = (yp.c) cVar45.f34633x) != null && (constraintLayout3 = cVar342.f38734a) != null) {
                                                BottomSheetBehavior.from(constraintLayout3).setState(4);
                                            }
                                            String str = gk.a.f16573a;
                                            Bundle bundle = new Bundle();
                                            defpackage.e.s(bundle, "course", "type", "overall");
                                            hs.k kVar = hs.k.f19476a;
                                            gk.a.b(bundle, "self_care_nps_cancel");
                                            return;
                                        case 4:
                                            int i15 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar46 = this$0.F;
                                            if (cVar46 != null && (cVar352 = (yp.c) cVar46.f34633x) != null) {
                                                appCompatSeekBar3 = cVar352.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(0);
                                                return;
                                            }
                                            return;
                                        case 5:
                                            int i16 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar47 = this$0.F;
                                            if (cVar47 != null && (cVar36 = (yp.c) cVar47.f34633x) != null) {
                                                appCompatSeekBar3 = cVar36.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(1);
                                                return;
                                            }
                                            return;
                                        case 6:
                                            int i17 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar48 = this$0.F;
                                            if (cVar48 != null && (cVar37 = (yp.c) cVar48.f34633x) != null) {
                                                appCompatSeekBar3 = cVar37.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(2);
                                                return;
                                            }
                                            return;
                                        case 7:
                                            int i18 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar49 = this$0.F;
                                            if (cVar49 != null && (cVar38 = (yp.c) cVar49.f34633x) != null) {
                                                appCompatSeekBar3 = cVar38.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(3);
                                                return;
                                            }
                                            return;
                                        case 8:
                                            int i19 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar50 = this$0.F;
                                            if (cVar50 != null && (cVar39 = (yp.c) cVar50.f34633x) != null) {
                                                appCompatSeekBar3 = cVar39.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(4);
                                                return;
                                            }
                                            return;
                                        case 9:
                                            int i20 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar51 = this$0.F;
                                            if (cVar51 != null && (cVar40 = (yp.c) cVar51.f34633x) != null) {
                                                appCompatSeekBar3 = cVar40.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(5);
                                                return;
                                            }
                                            return;
                                        case 10:
                                            int i21 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar52 = this$0.F;
                                            if (cVar52 != null && (cVar41 = (yp.c) cVar52.f34633x) != null) {
                                                appCompatSeekBar3 = cVar41.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(6);
                                                return;
                                            }
                                            return;
                                        default:
                                            int i22 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar53 = this$0.F;
                                            if (cVar53 != null && (cVar302 = (yp.c) cVar53.f34633x) != null) {
                                                appCompatSeekBar3 = cVar302.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(7);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        v.c cVar36 = notV4Activity.F;
                        if (cVar36 != null && (cVar7 = (yp.c) cVar36.f34633x) != null && (robertoTextView7 = cVar7.r) != null) {
                            robertoTextView7.setOnClickListener(new View.OnClickListener() { // from class: fl.r
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    yp.c cVar302;
                                    yp.c cVar312;
                                    yp.c cVar322;
                                    yp.c cVar332;
                                    yp.c cVar342;
                                    ConstraintLayout constraintLayout3;
                                    yp.c cVar352;
                                    yp.c cVar362;
                                    yp.c cVar37;
                                    yp.c cVar38;
                                    yp.c cVar39;
                                    yp.c cVar40;
                                    yp.c cVar41;
                                    int i10 = r2;
                                    AppCompatSeekBar appCompatSeekBar3 = null;
                                    NotV4Activity this$0 = notV4Activity;
                                    switch (i10) {
                                        case 0:
                                            int i11 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar42 = this$0.F;
                                            if (cVar42 != null && (cVar312 = (yp.c) cVar42.f34633x) != null) {
                                                appCompatSeekBar3 = cVar312.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(8);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            int i12 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar43 = this$0.F;
                                            if (cVar43 != null && (cVar322 = (yp.c) cVar43.f34633x) != null) {
                                                appCompatSeekBar3 = cVar322.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(9);
                                                return;
                                            }
                                            return;
                                        case 2:
                                            int i13 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar44 = this$0.F;
                                            if (cVar44 != null && (cVar332 = (yp.c) cVar44.f34633x) != null) {
                                                appCompatSeekBar3 = cVar332.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(10);
                                                return;
                                            }
                                            return;
                                        case 3:
                                            int i14 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar45 = this$0.F;
                                            if (cVar45 != null && (cVar342 = (yp.c) cVar45.f34633x) != null && (constraintLayout3 = cVar342.f38734a) != null) {
                                                BottomSheetBehavior.from(constraintLayout3).setState(4);
                                            }
                                            String str = gk.a.f16573a;
                                            Bundle bundle = new Bundle();
                                            defpackage.e.s(bundle, "course", "type", "overall");
                                            hs.k kVar = hs.k.f19476a;
                                            gk.a.b(bundle, "self_care_nps_cancel");
                                            return;
                                        case 4:
                                            int i15 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar46 = this$0.F;
                                            if (cVar46 != null && (cVar352 = (yp.c) cVar46.f34633x) != null) {
                                                appCompatSeekBar3 = cVar352.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(0);
                                                return;
                                            }
                                            return;
                                        case 5:
                                            int i16 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar47 = this$0.F;
                                            if (cVar47 != null && (cVar362 = (yp.c) cVar47.f34633x) != null) {
                                                appCompatSeekBar3 = cVar362.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(1);
                                                return;
                                            }
                                            return;
                                        case 6:
                                            int i17 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar48 = this$0.F;
                                            if (cVar48 != null && (cVar37 = (yp.c) cVar48.f34633x) != null) {
                                                appCompatSeekBar3 = cVar37.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(2);
                                                return;
                                            }
                                            return;
                                        case 7:
                                            int i18 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar49 = this$0.F;
                                            if (cVar49 != null && (cVar38 = (yp.c) cVar49.f34633x) != null) {
                                                appCompatSeekBar3 = cVar38.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(3);
                                                return;
                                            }
                                            return;
                                        case 8:
                                            int i19 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar50 = this$0.F;
                                            if (cVar50 != null && (cVar39 = (yp.c) cVar50.f34633x) != null) {
                                                appCompatSeekBar3 = cVar39.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(4);
                                                return;
                                            }
                                            return;
                                        case 9:
                                            int i20 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar51 = this$0.F;
                                            if (cVar51 != null && (cVar40 = (yp.c) cVar51.f34633x) != null) {
                                                appCompatSeekBar3 = cVar40.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(5);
                                                return;
                                            }
                                            return;
                                        case 10:
                                            int i21 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar52 = this$0.F;
                                            if (cVar52 != null && (cVar41 = (yp.c) cVar52.f34633x) != null) {
                                                appCompatSeekBar3 = cVar41.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(6);
                                                return;
                                            }
                                            return;
                                        default:
                                            int i22 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar53 = this$0.F;
                                            if (cVar53 != null && (cVar302 = (yp.c) cVar53.f34633x) != null) {
                                                appCompatSeekBar3 = cVar302.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(7);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        v.c cVar37 = notV4Activity.F;
                        if (cVar37 != null && (cVar6 = (yp.c) cVar37.f34633x) != null && (robertoTextView6 = cVar6.f38750s) != null) {
                            robertoTextView6.setOnClickListener(new View.OnClickListener() { // from class: fl.r
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    yp.c cVar302;
                                    yp.c cVar312;
                                    yp.c cVar322;
                                    yp.c cVar332;
                                    yp.c cVar342;
                                    ConstraintLayout constraintLayout3;
                                    yp.c cVar352;
                                    yp.c cVar362;
                                    yp.c cVar372;
                                    yp.c cVar38;
                                    yp.c cVar39;
                                    yp.c cVar40;
                                    yp.c cVar41;
                                    int i10 = r2;
                                    AppCompatSeekBar appCompatSeekBar3 = null;
                                    NotV4Activity this$0 = notV4Activity;
                                    switch (i10) {
                                        case 0:
                                            int i11 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar42 = this$0.F;
                                            if (cVar42 != null && (cVar312 = (yp.c) cVar42.f34633x) != null) {
                                                appCompatSeekBar3 = cVar312.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(8);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            int i12 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar43 = this$0.F;
                                            if (cVar43 != null && (cVar322 = (yp.c) cVar43.f34633x) != null) {
                                                appCompatSeekBar3 = cVar322.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(9);
                                                return;
                                            }
                                            return;
                                        case 2:
                                            int i13 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar44 = this$0.F;
                                            if (cVar44 != null && (cVar332 = (yp.c) cVar44.f34633x) != null) {
                                                appCompatSeekBar3 = cVar332.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(10);
                                                return;
                                            }
                                            return;
                                        case 3:
                                            int i14 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar45 = this$0.F;
                                            if (cVar45 != null && (cVar342 = (yp.c) cVar45.f34633x) != null && (constraintLayout3 = cVar342.f38734a) != null) {
                                                BottomSheetBehavior.from(constraintLayout3).setState(4);
                                            }
                                            String str = gk.a.f16573a;
                                            Bundle bundle = new Bundle();
                                            defpackage.e.s(bundle, "course", "type", "overall");
                                            hs.k kVar = hs.k.f19476a;
                                            gk.a.b(bundle, "self_care_nps_cancel");
                                            return;
                                        case 4:
                                            int i15 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar46 = this$0.F;
                                            if (cVar46 != null && (cVar352 = (yp.c) cVar46.f34633x) != null) {
                                                appCompatSeekBar3 = cVar352.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(0);
                                                return;
                                            }
                                            return;
                                        case 5:
                                            int i16 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar47 = this$0.F;
                                            if (cVar47 != null && (cVar362 = (yp.c) cVar47.f34633x) != null) {
                                                appCompatSeekBar3 = cVar362.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(1);
                                                return;
                                            }
                                            return;
                                        case 6:
                                            int i17 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar48 = this$0.F;
                                            if (cVar48 != null && (cVar372 = (yp.c) cVar48.f34633x) != null) {
                                                appCompatSeekBar3 = cVar372.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(2);
                                                return;
                                            }
                                            return;
                                        case 7:
                                            int i18 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar49 = this$0.F;
                                            if (cVar49 != null && (cVar38 = (yp.c) cVar49.f34633x) != null) {
                                                appCompatSeekBar3 = cVar38.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(3);
                                                return;
                                            }
                                            return;
                                        case 8:
                                            int i19 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar50 = this$0.F;
                                            if (cVar50 != null && (cVar39 = (yp.c) cVar50.f34633x) != null) {
                                                appCompatSeekBar3 = cVar39.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(4);
                                                return;
                                            }
                                            return;
                                        case 9:
                                            int i20 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar51 = this$0.F;
                                            if (cVar51 != null && (cVar40 = (yp.c) cVar51.f34633x) != null) {
                                                appCompatSeekBar3 = cVar40.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(5);
                                                return;
                                            }
                                            return;
                                        case 10:
                                            int i21 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar52 = this$0.F;
                                            if (cVar52 != null && (cVar41 = (yp.c) cVar52.f34633x) != null) {
                                                appCompatSeekBar3 = cVar41.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(6);
                                                return;
                                            }
                                            return;
                                        default:
                                            int i22 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar53 = this$0.F;
                                            if (cVar53 != null && (cVar302 = (yp.c) cVar53.f34633x) != null) {
                                                appCompatSeekBar3 = cVar302.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(7);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        v.c cVar38 = notV4Activity.F;
                        if (cVar38 != null && (cVar5 = (yp.c) cVar38.f34633x) != null && (robertoTextView5 = cVar5.f38751t) != null) {
                            robertoTextView5.setOnClickListener(new View.OnClickListener() { // from class: fl.r
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    yp.c cVar302;
                                    yp.c cVar312;
                                    yp.c cVar322;
                                    yp.c cVar332;
                                    yp.c cVar342;
                                    ConstraintLayout constraintLayout3;
                                    yp.c cVar352;
                                    yp.c cVar362;
                                    yp.c cVar372;
                                    yp.c cVar382;
                                    yp.c cVar39;
                                    yp.c cVar40;
                                    yp.c cVar41;
                                    int i10 = r2;
                                    AppCompatSeekBar appCompatSeekBar3 = null;
                                    NotV4Activity this$0 = notV4Activity;
                                    switch (i10) {
                                        case 0:
                                            int i11 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar42 = this$0.F;
                                            if (cVar42 != null && (cVar312 = (yp.c) cVar42.f34633x) != null) {
                                                appCompatSeekBar3 = cVar312.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(8);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            int i12 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar43 = this$0.F;
                                            if (cVar43 != null && (cVar322 = (yp.c) cVar43.f34633x) != null) {
                                                appCompatSeekBar3 = cVar322.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(9);
                                                return;
                                            }
                                            return;
                                        case 2:
                                            int i13 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar44 = this$0.F;
                                            if (cVar44 != null && (cVar332 = (yp.c) cVar44.f34633x) != null) {
                                                appCompatSeekBar3 = cVar332.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(10);
                                                return;
                                            }
                                            return;
                                        case 3:
                                            int i14 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar45 = this$0.F;
                                            if (cVar45 != null && (cVar342 = (yp.c) cVar45.f34633x) != null && (constraintLayout3 = cVar342.f38734a) != null) {
                                                BottomSheetBehavior.from(constraintLayout3).setState(4);
                                            }
                                            String str = gk.a.f16573a;
                                            Bundle bundle = new Bundle();
                                            defpackage.e.s(bundle, "course", "type", "overall");
                                            hs.k kVar = hs.k.f19476a;
                                            gk.a.b(bundle, "self_care_nps_cancel");
                                            return;
                                        case 4:
                                            int i15 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar46 = this$0.F;
                                            if (cVar46 != null && (cVar352 = (yp.c) cVar46.f34633x) != null) {
                                                appCompatSeekBar3 = cVar352.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(0);
                                                return;
                                            }
                                            return;
                                        case 5:
                                            int i16 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar47 = this$0.F;
                                            if (cVar47 != null && (cVar362 = (yp.c) cVar47.f34633x) != null) {
                                                appCompatSeekBar3 = cVar362.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(1);
                                                return;
                                            }
                                            return;
                                        case 6:
                                            int i17 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar48 = this$0.F;
                                            if (cVar48 != null && (cVar372 = (yp.c) cVar48.f34633x) != null) {
                                                appCompatSeekBar3 = cVar372.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(2);
                                                return;
                                            }
                                            return;
                                        case 7:
                                            int i18 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar49 = this$0.F;
                                            if (cVar49 != null && (cVar382 = (yp.c) cVar49.f34633x) != null) {
                                                appCompatSeekBar3 = cVar382.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(3);
                                                return;
                                            }
                                            return;
                                        case 8:
                                            int i19 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar50 = this$0.F;
                                            if (cVar50 != null && (cVar39 = (yp.c) cVar50.f34633x) != null) {
                                                appCompatSeekBar3 = cVar39.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(4);
                                                return;
                                            }
                                            return;
                                        case 9:
                                            int i20 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar51 = this$0.F;
                                            if (cVar51 != null && (cVar40 = (yp.c) cVar51.f34633x) != null) {
                                                appCompatSeekBar3 = cVar40.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(5);
                                                return;
                                            }
                                            return;
                                        case 10:
                                            int i21 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar52 = this$0.F;
                                            if (cVar52 != null && (cVar41 = (yp.c) cVar52.f34633x) != null) {
                                                appCompatSeekBar3 = cVar41.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(6);
                                                return;
                                            }
                                            return;
                                        default:
                                            int i22 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar53 = this$0.F;
                                            if (cVar53 != null && (cVar302 = (yp.c) cVar53.f34633x) != null) {
                                                appCompatSeekBar3 = cVar302.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(7);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        v.c cVar39 = notV4Activity.F;
                        if (cVar39 != null && (cVar4 = (yp.c) cVar39.f34633x) != null && (robertoTextView4 = cVar4.f38752u) != null) {
                            robertoTextView4.setOnClickListener(new View.OnClickListener() { // from class: fl.r
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    yp.c cVar302;
                                    yp.c cVar312;
                                    yp.c cVar322;
                                    yp.c cVar332;
                                    yp.c cVar342;
                                    ConstraintLayout constraintLayout3;
                                    yp.c cVar352;
                                    yp.c cVar362;
                                    yp.c cVar372;
                                    yp.c cVar382;
                                    yp.c cVar392;
                                    yp.c cVar40;
                                    yp.c cVar41;
                                    int i10 = r2;
                                    AppCompatSeekBar appCompatSeekBar3 = null;
                                    NotV4Activity this$0 = notV4Activity;
                                    switch (i10) {
                                        case 0:
                                            int i11 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar42 = this$0.F;
                                            if (cVar42 != null && (cVar312 = (yp.c) cVar42.f34633x) != null) {
                                                appCompatSeekBar3 = cVar312.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(8);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            int i12 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar43 = this$0.F;
                                            if (cVar43 != null && (cVar322 = (yp.c) cVar43.f34633x) != null) {
                                                appCompatSeekBar3 = cVar322.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(9);
                                                return;
                                            }
                                            return;
                                        case 2:
                                            int i13 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar44 = this$0.F;
                                            if (cVar44 != null && (cVar332 = (yp.c) cVar44.f34633x) != null) {
                                                appCompatSeekBar3 = cVar332.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(10);
                                                return;
                                            }
                                            return;
                                        case 3:
                                            int i14 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar45 = this$0.F;
                                            if (cVar45 != null && (cVar342 = (yp.c) cVar45.f34633x) != null && (constraintLayout3 = cVar342.f38734a) != null) {
                                                BottomSheetBehavior.from(constraintLayout3).setState(4);
                                            }
                                            String str = gk.a.f16573a;
                                            Bundle bundle = new Bundle();
                                            defpackage.e.s(bundle, "course", "type", "overall");
                                            hs.k kVar = hs.k.f19476a;
                                            gk.a.b(bundle, "self_care_nps_cancel");
                                            return;
                                        case 4:
                                            int i15 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar46 = this$0.F;
                                            if (cVar46 != null && (cVar352 = (yp.c) cVar46.f34633x) != null) {
                                                appCompatSeekBar3 = cVar352.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(0);
                                                return;
                                            }
                                            return;
                                        case 5:
                                            int i16 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar47 = this$0.F;
                                            if (cVar47 != null && (cVar362 = (yp.c) cVar47.f34633x) != null) {
                                                appCompatSeekBar3 = cVar362.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(1);
                                                return;
                                            }
                                            return;
                                        case 6:
                                            int i17 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar48 = this$0.F;
                                            if (cVar48 != null && (cVar372 = (yp.c) cVar48.f34633x) != null) {
                                                appCompatSeekBar3 = cVar372.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(2);
                                                return;
                                            }
                                            return;
                                        case 7:
                                            int i18 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar49 = this$0.F;
                                            if (cVar49 != null && (cVar382 = (yp.c) cVar49.f34633x) != null) {
                                                appCompatSeekBar3 = cVar382.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(3);
                                                return;
                                            }
                                            return;
                                        case 8:
                                            int i19 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar50 = this$0.F;
                                            if (cVar50 != null && (cVar392 = (yp.c) cVar50.f34633x) != null) {
                                                appCompatSeekBar3 = cVar392.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(4);
                                                return;
                                            }
                                            return;
                                        case 9:
                                            int i20 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar51 = this$0.F;
                                            if (cVar51 != null && (cVar40 = (yp.c) cVar51.f34633x) != null) {
                                                appCompatSeekBar3 = cVar40.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(5);
                                                return;
                                            }
                                            return;
                                        case 10:
                                            int i21 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar52 = this$0.F;
                                            if (cVar52 != null && (cVar41 = (yp.c) cVar52.f34633x) != null) {
                                                appCompatSeekBar3 = cVar41.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(6);
                                                return;
                                            }
                                            return;
                                        default:
                                            int i22 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar53 = this$0.F;
                                            if (cVar53 != null && (cVar302 = (yp.c) cVar53.f34633x) != null) {
                                                appCompatSeekBar3 = cVar302.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(7);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        v.c cVar40 = notV4Activity.F;
                        if (cVar40 != null && (cVar3 = (yp.c) cVar40.f34633x) != null && (robertoTextView3 = cVar3.f38753v) != null) {
                            robertoTextView3.setOnClickListener(new View.OnClickListener() { // from class: fl.r
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    yp.c cVar302;
                                    yp.c cVar312;
                                    yp.c cVar322;
                                    yp.c cVar332;
                                    yp.c cVar342;
                                    ConstraintLayout constraintLayout3;
                                    yp.c cVar352;
                                    yp.c cVar362;
                                    yp.c cVar372;
                                    yp.c cVar382;
                                    yp.c cVar392;
                                    yp.c cVar402;
                                    yp.c cVar41;
                                    int i10 = r2;
                                    AppCompatSeekBar appCompatSeekBar3 = null;
                                    NotV4Activity this$0 = notV4Activity;
                                    switch (i10) {
                                        case 0:
                                            int i11 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar42 = this$0.F;
                                            if (cVar42 != null && (cVar312 = (yp.c) cVar42.f34633x) != null) {
                                                appCompatSeekBar3 = cVar312.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(8);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            int i12 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar43 = this$0.F;
                                            if (cVar43 != null && (cVar322 = (yp.c) cVar43.f34633x) != null) {
                                                appCompatSeekBar3 = cVar322.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(9);
                                                return;
                                            }
                                            return;
                                        case 2:
                                            int i13 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar44 = this$0.F;
                                            if (cVar44 != null && (cVar332 = (yp.c) cVar44.f34633x) != null) {
                                                appCompatSeekBar3 = cVar332.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(10);
                                                return;
                                            }
                                            return;
                                        case 3:
                                            int i14 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar45 = this$0.F;
                                            if (cVar45 != null && (cVar342 = (yp.c) cVar45.f34633x) != null && (constraintLayout3 = cVar342.f38734a) != null) {
                                                BottomSheetBehavior.from(constraintLayout3).setState(4);
                                            }
                                            String str = gk.a.f16573a;
                                            Bundle bundle = new Bundle();
                                            defpackage.e.s(bundle, "course", "type", "overall");
                                            hs.k kVar = hs.k.f19476a;
                                            gk.a.b(bundle, "self_care_nps_cancel");
                                            return;
                                        case 4:
                                            int i15 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar46 = this$0.F;
                                            if (cVar46 != null && (cVar352 = (yp.c) cVar46.f34633x) != null) {
                                                appCompatSeekBar3 = cVar352.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(0);
                                                return;
                                            }
                                            return;
                                        case 5:
                                            int i16 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar47 = this$0.F;
                                            if (cVar47 != null && (cVar362 = (yp.c) cVar47.f34633x) != null) {
                                                appCompatSeekBar3 = cVar362.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(1);
                                                return;
                                            }
                                            return;
                                        case 6:
                                            int i17 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar48 = this$0.F;
                                            if (cVar48 != null && (cVar372 = (yp.c) cVar48.f34633x) != null) {
                                                appCompatSeekBar3 = cVar372.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(2);
                                                return;
                                            }
                                            return;
                                        case 7:
                                            int i18 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar49 = this$0.F;
                                            if (cVar49 != null && (cVar382 = (yp.c) cVar49.f34633x) != null) {
                                                appCompatSeekBar3 = cVar382.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(3);
                                                return;
                                            }
                                            return;
                                        case 8:
                                            int i19 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar50 = this$0.F;
                                            if (cVar50 != null && (cVar392 = (yp.c) cVar50.f34633x) != null) {
                                                appCompatSeekBar3 = cVar392.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(4);
                                                return;
                                            }
                                            return;
                                        case 9:
                                            int i20 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar51 = this$0.F;
                                            if (cVar51 != null && (cVar402 = (yp.c) cVar51.f34633x) != null) {
                                                appCompatSeekBar3 = cVar402.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(5);
                                                return;
                                            }
                                            return;
                                        case 10:
                                            int i21 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar52 = this$0.F;
                                            if (cVar52 != null && (cVar41 = (yp.c) cVar52.f34633x) != null) {
                                                appCompatSeekBar3 = cVar41.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(6);
                                                return;
                                            }
                                            return;
                                        default:
                                            int i22 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar53 = this$0.F;
                                            if (cVar53 != null && (cVar302 = (yp.c) cVar53.f34633x) != null) {
                                                appCompatSeekBar3 = cVar302.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(7);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        v.c cVar41 = notV4Activity.F;
                        if (cVar41 != null && (cVar2 = (yp.c) cVar41.f34633x) != null && (robertoTextView2 = cVar2.f38754w) != null) {
                            robertoTextView2.setOnClickListener(new View.OnClickListener() { // from class: fl.r
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    yp.c cVar302;
                                    yp.c cVar312;
                                    yp.c cVar322;
                                    yp.c cVar332;
                                    yp.c cVar342;
                                    ConstraintLayout constraintLayout3;
                                    yp.c cVar352;
                                    yp.c cVar362;
                                    yp.c cVar372;
                                    yp.c cVar382;
                                    yp.c cVar392;
                                    yp.c cVar402;
                                    yp.c cVar412;
                                    int i10 = r2;
                                    AppCompatSeekBar appCompatSeekBar3 = null;
                                    NotV4Activity this$0 = notV4Activity;
                                    switch (i10) {
                                        case 0:
                                            int i11 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar42 = this$0.F;
                                            if (cVar42 != null && (cVar312 = (yp.c) cVar42.f34633x) != null) {
                                                appCompatSeekBar3 = cVar312.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(8);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            int i12 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar43 = this$0.F;
                                            if (cVar43 != null && (cVar322 = (yp.c) cVar43.f34633x) != null) {
                                                appCompatSeekBar3 = cVar322.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(9);
                                                return;
                                            }
                                            return;
                                        case 2:
                                            int i13 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar44 = this$0.F;
                                            if (cVar44 != null && (cVar332 = (yp.c) cVar44.f34633x) != null) {
                                                appCompatSeekBar3 = cVar332.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(10);
                                                return;
                                            }
                                            return;
                                        case 3:
                                            int i14 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar45 = this$0.F;
                                            if (cVar45 != null && (cVar342 = (yp.c) cVar45.f34633x) != null && (constraintLayout3 = cVar342.f38734a) != null) {
                                                BottomSheetBehavior.from(constraintLayout3).setState(4);
                                            }
                                            String str = gk.a.f16573a;
                                            Bundle bundle = new Bundle();
                                            defpackage.e.s(bundle, "course", "type", "overall");
                                            hs.k kVar = hs.k.f19476a;
                                            gk.a.b(bundle, "self_care_nps_cancel");
                                            return;
                                        case 4:
                                            int i15 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar46 = this$0.F;
                                            if (cVar46 != null && (cVar352 = (yp.c) cVar46.f34633x) != null) {
                                                appCompatSeekBar3 = cVar352.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(0);
                                                return;
                                            }
                                            return;
                                        case 5:
                                            int i16 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar47 = this$0.F;
                                            if (cVar47 != null && (cVar362 = (yp.c) cVar47.f34633x) != null) {
                                                appCompatSeekBar3 = cVar362.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(1);
                                                return;
                                            }
                                            return;
                                        case 6:
                                            int i17 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar48 = this$0.F;
                                            if (cVar48 != null && (cVar372 = (yp.c) cVar48.f34633x) != null) {
                                                appCompatSeekBar3 = cVar372.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(2);
                                                return;
                                            }
                                            return;
                                        case 7:
                                            int i18 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar49 = this$0.F;
                                            if (cVar49 != null && (cVar382 = (yp.c) cVar49.f34633x) != null) {
                                                appCompatSeekBar3 = cVar382.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(3);
                                                return;
                                            }
                                            return;
                                        case 8:
                                            int i19 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar50 = this$0.F;
                                            if (cVar50 != null && (cVar392 = (yp.c) cVar50.f34633x) != null) {
                                                appCompatSeekBar3 = cVar392.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(4);
                                                return;
                                            }
                                            return;
                                        case 9:
                                            int i20 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar51 = this$0.F;
                                            if (cVar51 != null && (cVar402 = (yp.c) cVar51.f34633x) != null) {
                                                appCompatSeekBar3 = cVar402.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(5);
                                                return;
                                            }
                                            return;
                                        case 10:
                                            int i21 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar52 = this$0.F;
                                            if (cVar52 != null && (cVar412 = (yp.c) cVar52.f34633x) != null) {
                                                appCompatSeekBar3 = cVar412.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(6);
                                                return;
                                            }
                                            return;
                                        default:
                                            int i22 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar53 = this$0.F;
                                            if (cVar53 != null && (cVar302 = (yp.c) cVar53.f34633x) != null) {
                                                appCompatSeekBar3 = cVar302.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(7);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        v.c cVar42 = notV4Activity.F;
                        if (cVar42 != null && (cVar = (yp.c) cVar42.f34633x) != null && (robertoTextView = cVar.f38747o) != null) {
                            robertoTextView.setOnClickListener(new View.OnClickListener() { // from class: fl.r
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    yp.c cVar302;
                                    yp.c cVar312;
                                    yp.c cVar322;
                                    yp.c cVar332;
                                    yp.c cVar342;
                                    ConstraintLayout constraintLayout3;
                                    yp.c cVar352;
                                    yp.c cVar362;
                                    yp.c cVar372;
                                    yp.c cVar382;
                                    yp.c cVar392;
                                    yp.c cVar402;
                                    yp.c cVar412;
                                    int i10 = r2;
                                    AppCompatSeekBar appCompatSeekBar3 = null;
                                    NotV4Activity this$0 = notV4Activity;
                                    switch (i10) {
                                        case 0:
                                            int i11 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar422 = this$0.F;
                                            if (cVar422 != null && (cVar312 = (yp.c) cVar422.f34633x) != null) {
                                                appCompatSeekBar3 = cVar312.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(8);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            int i12 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar43 = this$0.F;
                                            if (cVar43 != null && (cVar322 = (yp.c) cVar43.f34633x) != null) {
                                                appCompatSeekBar3 = cVar322.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(9);
                                                return;
                                            }
                                            return;
                                        case 2:
                                            int i13 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar44 = this$0.F;
                                            if (cVar44 != null && (cVar332 = (yp.c) cVar44.f34633x) != null) {
                                                appCompatSeekBar3 = cVar332.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(10);
                                                return;
                                            }
                                            return;
                                        case 3:
                                            int i14 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar45 = this$0.F;
                                            if (cVar45 != null && (cVar342 = (yp.c) cVar45.f34633x) != null && (constraintLayout3 = cVar342.f38734a) != null) {
                                                BottomSheetBehavior.from(constraintLayout3).setState(4);
                                            }
                                            String str = gk.a.f16573a;
                                            Bundle bundle = new Bundle();
                                            defpackage.e.s(bundle, "course", "type", "overall");
                                            hs.k kVar = hs.k.f19476a;
                                            gk.a.b(bundle, "self_care_nps_cancel");
                                            return;
                                        case 4:
                                            int i15 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar46 = this$0.F;
                                            if (cVar46 != null && (cVar352 = (yp.c) cVar46.f34633x) != null) {
                                                appCompatSeekBar3 = cVar352.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(0);
                                                return;
                                            }
                                            return;
                                        case 5:
                                            int i16 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar47 = this$0.F;
                                            if (cVar47 != null && (cVar362 = (yp.c) cVar47.f34633x) != null) {
                                                appCompatSeekBar3 = cVar362.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(1);
                                                return;
                                            }
                                            return;
                                        case 6:
                                            int i17 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar48 = this$0.F;
                                            if (cVar48 != null && (cVar372 = (yp.c) cVar48.f34633x) != null) {
                                                appCompatSeekBar3 = cVar372.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(2);
                                                return;
                                            }
                                            return;
                                        case 7:
                                            int i18 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar49 = this$0.F;
                                            if (cVar49 != null && (cVar382 = (yp.c) cVar49.f34633x) != null) {
                                                appCompatSeekBar3 = cVar382.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(3);
                                                return;
                                            }
                                            return;
                                        case 8:
                                            int i19 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar50 = this$0.F;
                                            if (cVar50 != null && (cVar392 = (yp.c) cVar50.f34633x) != null) {
                                                appCompatSeekBar3 = cVar392.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(4);
                                                return;
                                            }
                                            return;
                                        case 9:
                                            int i20 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar51 = this$0.F;
                                            if (cVar51 != null && (cVar402 = (yp.c) cVar51.f34633x) != null) {
                                                appCompatSeekBar3 = cVar402.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(5);
                                                return;
                                            }
                                            return;
                                        case 10:
                                            int i21 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar52 = this$0.F;
                                            if (cVar52 != null && (cVar412 = (yp.c) cVar52.f34633x) != null) {
                                                appCompatSeekBar3 = cVar412.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(6);
                                                return;
                                            }
                                            return;
                                        default:
                                            int i22 = NotV4Activity.G;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            v.c cVar53 = this$0.F;
                                            if (cVar53 != null && (cVar302 = (yp.c) cVar53.f34633x) != null) {
                                                appCompatSeekBar3 = cVar302.f38743k;
                                            }
                                            if (appCompatSeekBar3 != null) {
                                                appCompatSeekBar3.setProgress(7);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        String str = gk.a.f16573a;
                        Bundle bundle = new Bundle();
                        defpackage.e.s(bundle, "course", "type", "overall");
                        hs.k kVar = hs.k.f19476a;
                        gk.a.b(bundle, "self_care_nps_display");
                        npsPersistence.updateDashboardNpsForDay(5, true);
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    public NotV4Activity() {
        new LinkedHashMap();
        this.f10824v = LogHelper.INSTANCE.makeLogTag("NewDashboardActivity");
        this.f10825w = new CourseApiUtil();
        this.f10827y = sp.b.O(new a());
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: fl.q

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ NotV4Activity f15155v;

            {
                this.f15155v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                tl.d dVar;
                int i6 = r2;
                NotV4Activity this$0 = this.f15155v;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i10 = NotV4Activity.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Fragment E = this$0.getSupportFragmentManager().E(R.id.flExpertCareContainer);
                        if (E instanceof tl.d) {
                            dVar = (tl.d) E;
                        } else {
                            dVar = null;
                        }
                        if (dVar != null) {
                            dVar.m0();
                            return;
                        }
                        return;
                    default:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i11 = NotV4Activity.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (this$0.B != null) {
                            this$0.n0().k();
                        }
                        if (!kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.PR_COUPON_CODE), "")) {
                            this$0.x();
                            return;
                        }
                        return;
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…nt)?.refreshState()\n    }");
        this.C = registerForActivityResult;
        androidx.activity.result.c<Intent> registerForActivityResult2 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: fl.q

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ NotV4Activity f15155v;

            {
                this.f15155v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                tl.d dVar;
                int i6 = r2;
                NotV4Activity this$0 = this.f15155v;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i10 = NotV4Activity.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Fragment E = this$0.getSupportFragmentManager().E(R.id.flExpertCareContainer);
                        if (E instanceof tl.d) {
                            dVar = (tl.d) E;
                        } else {
                            dVar = null;
                        }
                        if (dVar != null) {
                            dVar.m0();
                            return;
                        }
                        return;
                    default:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i11 = NotV4Activity.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (this$0.B != null) {
                            this$0.n0().k();
                        }
                        if (!kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.PR_COUPON_CODE), "")) {
                            this$0.x();
                            return;
                        }
                        return;
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult2, "registerForActivityResul…nDeeplinkCodeFlow()\n    }");
        this.D = registerForActivityResult2;
    }

    @Override // il.d
    public final void D() {
        this.A = true;
    }

    @Override // il.d
    public final void F() {
        boolean z10;
        m mVar;
        try {
            m mVar2 = this.f10826x;
            if (mVar2 != null && !mVar2.isAdded()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (mVar = this.f10826x) != null) {
                mVar.show(getSupportFragmentManager(), mVar.getTag());
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10824v, e10);
        }
    }

    @Override // il.n
    public final void H(int i6, String str) {
        if (this.B != null) {
            NotV4DashboardViewModel n02 = n0();
            ta.v.H(kc.f.H(n02), o0.f23642c, 0, new p1(n02, i6, str, null), 2);
        }
    }

    @Override // il.d
    public final void I() {
        DrawerLayout drawerLayout;
        try {
            v.c cVar = this.F;
            if (cVar != null && (drawerLayout = (DrawerLayout) cVar.f34632w) != null) {
                drawerLayout.p();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10824v, e10);
        }
    }

    @Override // il.m.a
    public final void a0(String str, boolean z10) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("source", "bottom_draw_db");
            bundle.putString("course", str);
            bundle.putBoolean("reset_flow", false);
            if (z10) {
                CourseApiUtil.sendCourseApiRequest$default(this.f10825w, str, null, 2, null);
                UtilsKt.fireAnalytics("pre_domain_selection_existing", bundle);
                return;
            }
            startActivity(r.r(this).putExtra("preSelectedCourse", str));
            m mVar = this.f10826x;
            if (mVar != null) {
                mVar.dismiss();
            }
            UtilsKt.fireAnalytics("pre_domain_selection_new", bundle);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10824v, e10);
        }
    }

    @Override // com.google.android.material.navigation.NavigationView.a
    public final void c(MenuItem p02) {
        DrawerLayout drawerLayout;
        String str;
        HashMap<String, Object> appConfig;
        kotlin.jvm.internal.i.g(p02, "p0");
        try {
            boolean z10 = false;
            boolean z11 = true;
            switch (p02.getItemId()) {
                case R.id.nav_dashboard_lock /* 2131365036 */:
                    startActivity(new Intent(this, LockScreenOptionsActivity.class));
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "side_menu");
                    UtilsKt.fireAnalytics("dashboard_security_pin_click", bundle);
                    break;
                case R.id.nav_dashboard_logs_additional /* 2131365038 */:
                    Intent intent = new Intent(this, ScreenLogsActivity.class);
                    intent.putExtra("logType", a.EnumC0358a.ADDITIONAL_LOGS);
                    startActivity(intent);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", "side_menu");
                    UtilsKt.fireAnalytics("dashboard_additional_courses_logs_click", bundle2);
                    break;
                case R.id.nav_dashboard_logs_library /* 2131365039 */:
                    startActivity(new Intent(this, LibraryScreenLogsActivity.class));
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("source", "side_menu");
                    UtilsKt.fireAnalytics("dashboard_library_logs_click", bundle3);
                    break;
                case R.id.nav_dashboard_logs_main /* 2131365040 */:
                    Intent intent2 = new Intent(this, ScreenLogsActivity.class);
                    intent2.putExtra("logType", a.EnumC0358a.MAIN_PLAN_LOGS);
                    startActivity(intent2);
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("source", "side_menu");
                    UtilsKt.fireAnalytics("dashboard_plan_logs_click", bundle4);
                    break;
                case R.id.nav_dashboard_premium /* 2131365041 */:
                    String str2 = gk.a.f16573a;
                    Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                    analyticsBundle.putString("source", "side_menu");
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(analyticsBundle, "premium_click ");
                    SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
                    if (subscriptionPersistence.getSubscriptionEnabled() && kotlin.jvm.internal.i.b(PaymentUtils.INSTANCE.getSubscriptionType(subscriptionPersistence.getSubscriptionType()), "plus")) {
                        Extensions.INSTANCE.toast(this, "Congrats, you already have a subscription", 1);
                        break;
                    } else {
                        startActivity(r.s(this, false).putExtra("source", "side_menu"));
                        break;
                    }
                    break;
                case R.id.nav_dashboard_rate_us /* 2131365042 */:
                    Dialog b10 = ((q) this.f10827y.getValue()).b(Constants.FEEDBACK_TOP_MENU);
                    if (b10 != null) {
                        b10.show();
                    }
                    ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                    applicationPersistence.setLongValue(Constants.APP_FEEDBACK_DATE, Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
                    applicationPersistence.setIntValue(Constants.APP_FEEDBACK_DAY, applicationPersistence.getIntValue(Constants.APP_OPEN_DAY));
                    UtilsKt.fireAnalytics("dashboard_feedback_menu_click", UtilsKt.getAnalyticsBundle());
                    break;
                case R.id.nav_dashboard_settings /* 2131365044 */:
                    UtilsKt.fireAnalytics("dashboard_settings_click", UtilsKt.getAnalyticsBundle());
                    startActivity(new Intent(this, SettingsActivity.class));
                    break;
                case R.id.nav_dashboard_therapy /* 2131365045 */:
                    Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                    String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYTHERAPIST);
                    if (stringValue == null || kotlin.jvm.internal.i.b(stringValue, "null") || kotlin.jvm.internal.i.b(stringValue, "")) {
                        z11 = false;
                    }
                    analyticsBundle2.putBoolean("therapist_assigned", z11);
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null && (appConfig = user.getAppConfig()) != null) {
                        z10 = kotlin.jvm.internal.i.b(appConfig.get(Constants.TELECOMMUNICATION_CONSENT), Boolean.TRUE);
                    }
                    analyticsBundle2.putBoolean("disclaimer_consent", z10);
                    User user2 = FirebasePersistence.getInstance().getUser();
                    if (user2 != null) {
                        str = user2.getVersion();
                    } else {
                        str = null;
                    }
                    analyticsBundle2.putString("version", str);
                    analyticsBundle2.putString("source", "side_menu");
                    UtilsKt.fireAnalytics("dashboard_chat_click", analyticsBundle2);
                    boolean z12 = this.E;
                    androidx.activity.result.c<Intent> cVar = this.C;
                    if (z12) {
                        cVar.a(new Intent(this, ExpertCareInfoActivity.class).putExtra("source", "side_nav"));
                        break;
                    } else {
                        cVar.a(new Intent(this, TelecommunicationsPWAActivity.class));
                        break;
                    }
                    break;
                case R.id.nav_dashboard_tracker_logs /* 2131365046 */:
                    Intent intent3 = new Intent(this, MultiTrackerInsightsActivity.class);
                    intent3.putExtra("show_logs", true);
                    startActivity(intent3);
                    Bundle analyticsBundle3 = UtilsKt.getAnalyticsBundle();
                    analyticsBundle3.putString("source", Constants.SCREEN_DASHBOARD);
                    UtilsKt.fireAnalytics("new_tracker_logs_open", analyticsBundle3);
                    break;
            }
            v.c cVar2 = this.F;
            if (cVar2 != null && (drawerLayout = (DrawerLayout) cVar2.f34632w) != null) {
                drawerLayout.c();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10824v, e10);
        }
    }

    @Override // il.d
    public final boolean d0() {
        return this.E;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        s sVar;
        View view;
        boolean z10;
        if (this.A) {
            return super.dispatchTouchEvent(motionEvent);
        }
        Fragment E = getSupportFragmentManager().E(R.id.flNotV4DashboardMain);
        View view2 = null;
        if (E instanceof s) {
            sVar = (s) E;
        } else {
            sVar = null;
        }
        if (sVar != null) {
            View view3 = sVar.getView();
            if (view3 != null) {
                view = view3.findViewById(R.id.clNotV4DashboardCoachMarkPlanCard);
            } else {
                view = null;
            }
            boolean z11 = false;
            if (view != null && view.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                view.setVisibility(8);
            }
            View view4 = sVar.getView();
            if (view4 != null) {
                view2 = view4.findViewById(R.id.clNotV4DashboardCoachMarkLibrary);
            }
            if (view2 != null && view2.getVisibility() == 0) {
                z11 = true;
            }
            if (z11) {
                view2.setVisibility(8);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // ul.a
    public final void j(boolean z10) {
        this.E = !z10;
    }

    @Override // il.n
    public final void k(String str) {
        if (this.B != null) {
            NotV4DashboardViewModel n02 = n0();
            ta.v.H(kc.f.H(n02), o0.f23642c, 0, new o1(n02, str, null), 2);
        }
    }

    public final NotV4DashboardViewModel n0() {
        NotV4DashboardViewModel notV4DashboardViewModel = this.B;
        if (notV4DashboardViewModel != null) {
            return notV4DashboardViewModel;
        }
        kotlin.jvm.internal.i.q("notV4DashboardViewModel");
        throw null;
    }

    @Override // il.d
    public final void o() {
        s0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
        if (r9 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0(String str) {
        Intent putExtra;
        String stringExtra;
        String str2;
        boolean b10 = kotlin.jvm.internal.i.b(str, "professional");
        pp.c cVar = pp.c.DB_FILTER_APPLIED;
        String str3 = null;
        if (b10) {
            Intent putExtra2 = new Intent(this, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar);
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null) {
                str3 = user.getCurrentCourseName();
            }
            putExtra = putExtra2.putExtra("db_filter", Constants.getDbEntryPointDomainAreaForCourse(str3));
        } else if (kotlin.jvm.internal.i.b(str, "professional_profile")) {
            Intent intent = getIntent();
            if (intent != null && (stringExtra = intent.getStringExtra(SessionManager.KEY_UUID)) != null) {
                Intent putExtra3 = new Intent(this, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.A3_FILTER_APPLIED_PROFILE).putExtra(SessionManager.KEY_UUID, stringExtra);
                User user2 = FirebasePersistence.getInstance().getUser();
                if (user2 != null) {
                    str2 = user2.getCurrentCourseName();
                } else {
                    str2 = null;
                }
                putExtra = putExtra3.putExtra("db_filter", Constants.getDbEntryPointDomainAreaForCourse(str2));
            }
            Intent putExtra4 = new Intent(this, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar);
            User user3 = FirebasePersistence.getInstance().getUser();
            if (user3 != null) {
                str3 = user3.getCurrentCourseName();
            }
            putExtra = putExtra4.putExtra("db_filter", Constants.getDbEntryPointDomainAreaForCourse(str3));
        } else {
            Intent putExtra5 = new Intent(this, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar);
            User user4 = FirebasePersistence.getInstance().getUser();
            if (user4 != null) {
                str3 = user4.getCurrentCourseName();
            }
            putExtra = putExtra5.putExtra("db_filter", Constants.getDbEntryPointDomainAreaForCourse(str3));
        }
        this.D.a(putExtra);
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        DrawerLayout drawerLayout;
        u0.e aVar;
        u0.e eVar;
        String str = this.f10824v;
        super.onCreate(bundle);
        try {
            v.c d10 = v.c.d(getLayoutInflater());
            this.F = d10;
            switch (d10.f34630u) {
                case 15:
                    drawerLayout = (DrawerLayout) d10.f34631v;
                    break;
                default:
                    drawerLayout = (DrawerLayout) d10.f34631v;
                    break;
            }
            setContentView(drawerLayout);
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
                LogHelper.INSTANCE.e(str, "Error in setting custom status bar", e10);
            }
            this.f10826x = new m(this);
            this.f10825w.setCourseApiListener(new e());
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
            aVar2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            aVar2.f(R.id.flNotV4DashboardMain, new s(), null);
            aVar2.j();
            p0();
            s0();
            r0();
            onNewIntent(getIntent());
            FirebasePersistence.getInstance().updateMoEngageUserProperties();
            if (MyApplication.V.a().getSharedPreferences("lock_code", 0).getBoolean("set_lock_code", false)) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("update_lock", true);
                Intent intent = new Intent(this, LockScreenActivity.class);
                intent.putExtras(bundle2);
                startActivity(intent);
            }
            StatPersistence.INSTANCE.initialise();
            if (ApplicationPersistence.getInstance().getLongValue(Constants.FETCH_LIBRARY_CONTENT_ON_DB_TIME, 0L) < Utils.INSTANCE.getTodayTimeInSeconds()) {
                try {
                    if (this.B != null) {
                        n0().m();
                    }
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(str, e11);
                }
            }
            getOnBackPressedDispatcher().a(this, new f());
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(str, e12);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        try {
            this.F = null;
            getViewModelStore().a();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10824v, e10);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Bundle extras;
        Uri uri;
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        hs.k kVar;
        boolean z13;
        s sVar;
        boolean z14;
        s sVar2;
        boolean z15;
        boolean z16;
        String stringExtra;
        super.onNewIntent(intent);
        hs.k kVar2 = null;
        RoutingIntentHandler routingIntentHandler = null;
        hs.k kVar3 = null;
        s sVar3 = null;
        if (intent != null) {
            try {
                extras = intent.getExtras();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f10824v, e10);
                return;
            }
        } else {
            extras = null;
        }
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        boolean z17 = false;
        if (extras != null && extras.containsKey(Constants.LINK_TYPE)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            String string = extras.getString(Constants.LINK_TYPE);
            if (string != null) {
                int hashCode = string.hashCode();
                if (hashCode != -1182791039) {
                    if (hashCode == -503392131 && string.equals(Constants.APP_PSYCH_APPOINTMENT)) {
                        startActivity(new Intent(this, TelecommunicationsPWAActivity.class).putExtra(Constants.LINK_ID, extras.getString(Constants.LINK_ID)).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.APPOINTMENT_PSYCHIATRY));
                    }
                } else if (string.equals(Constants.APP_APPOINTMENT)) {
                    startActivity(new Intent(this, TelecommunicationsPWAActivity.class).putExtra(Constants.LINK_ID, extras.getString(Constants.LINK_ID)).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.APPOINTMENT_THERAPY));
                }
            }
        } else {
            if (uri != null) {
                String uri2 = uri.toString();
                kotlin.jvm.internal.i.f(uri2, "uri.toString()");
                if (!gv.r.J0(uri2, "appointment")) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    for (String str2 : uri.getQueryParameterNames()) {
                        extras.putString(str2, uri.getQueryParameter(str2));
                    }
                    LogHelper.INSTANCE.makeLogTag("NotV4DbUtils");
                    RoutingIntentHandler g5 = s5.g(uri.getLastPathSegment(), extras, intent, this);
                    if (g5.getIntent() == null && g5.getRoutingType() == null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        routingIntentHandler = g5;
                    }
                    if (routingIntentHandler != null) {
                        if (routingIntentHandler.getIntent() != null) {
                            startActivity(routingIntentHandler.getIntent());
                        }
                        if (routingIntentHandler.getRoutingType() != null) {
                            n0().T.i(routingIntentHandler);
                        }
                    }
                }
            }
            if (extras != null && extras.getBoolean("switch_programme")) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (intent != null && intent.getBooleanExtra(Constants.NEW_COURSE_FLAG, false)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    Fragment E = getSupportFragmentManager().E(R.id.flNotV4DashboardMain);
                    if (E instanceof s) {
                        sVar2 = (s) E;
                    } else {
                        sVar2 = null;
                    }
                    if (sVar2 != null) {
                        sVar2.o0();
                        kVar3 = hs.k.f19476a;
                    }
                    if (kVar3 == null) {
                        this.f10828z = true;
                    }
                    intent.putExtra(Constants.NEW_COURSE_FLAG, false);
                } else {
                    Fragment E2 = getSupportFragmentManager().E(R.id.flNotV4DashboardMain);
                    if (E2 instanceof s) {
                        sVar3 = (s) E2;
                    }
                    if (sVar3 != null) {
                        sVar3.Y();
                    }
                }
            } else {
                LogHelper.INSTANCE.makeLogTag("NotV4DbUtils");
                if (extras != null) {
                    str = extras.getString(Constants.API_COURSE_LINK);
                } else {
                    str = null;
                }
                RoutingIntentHandler g10 = s5.g(str, extras, intent, this);
                if (g10.getIntent() == null && g10.getRoutingType() == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    g10 = null;
                }
                if (g10 != null) {
                    if (g10.getIntent() != null) {
                        startActivity(g10.getIntent());
                    }
                    if (g10.getRoutingType() != null) {
                        n0().T.i(g10);
                    }
                    kVar = hs.k.f19476a;
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    if (intent != null && intent.getBooleanExtra(Constants.NEW_COURSE_FLAG, false)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        Fragment E3 = getSupportFragmentManager().E(R.id.flNotV4DashboardMain);
                        if (E3 instanceof s) {
                            sVar = (s) E3;
                        } else {
                            sVar = null;
                        }
                        if (sVar != null) {
                            sVar.o0();
                            kVar2 = hs.k.f19476a;
                        }
                        if (kVar2 == null) {
                            this.f10828z = true;
                        }
                        intent.putExtra(Constants.NEW_COURSE_FLAG, false);
                    }
                }
            }
        }
        if (extras != null && extras.containsKey(Constants.NOTIFICATION_INTENT)) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z16 && extras.getBoolean(Constants.NOTIFICATION_INTENT)) {
            new s5(12).k(extras);
        }
        if (intent != null && intent.getBooleanExtra("login_activity_new", false)) {
            z17 = true;
        }
        if (z17) {
            Utils.INSTANCE.setActivityNotification(true);
        }
        if (intent != null && (stringExtra = intent.getStringExtra(Constants.A3_VAR_B_FLOW_FLAG)) != null) {
            o0(stringExtra);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            q0();
            NotV4DashboardViewModel n02 = n0();
            Intent intent = getIntent();
            kotlin.jvm.internal.i.f(intent, "intent");
            ya.v a10 = wd.a.b().a(intent);
            rk.b bVar = new rk.b(5, new i1(n02));
            a10.getClass();
            a10.addOnSuccessListener(j.f38393a, bVar);
            a10.addOnFailureListener(new dl.j(3));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10824v, e10);
        }
    }

    public final void p0() {
        jl.u0 u0Var = new jl.u0();
        cn.t tVar = new cn.t();
        Application application = getApplication();
        kotlin.jvm.internal.i.f(application, "this@NotV4Activity.application");
        NotV4DashboardViewModel notV4DashboardViewModel = (NotV4DashboardViewModel) new androidx.lifecycle.o0(this, new jl.q(u0Var, tVar, application)).a(NotV4DashboardViewModel.class);
        ((w) notV4DashboardViewModel.X.getValue()).e(this, new fl.k(1, new b()));
        notV4DashboardViewModel.f10857f0.e(this, new fl.k(2, c.f10831u));
        notV4DashboardViewModel.f10861j0.e(this, new fl.k(3, new d()));
        this.B = notV4DashboardViewModel;
    }

    public final void q0() {
        if (!kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_SIGNUP_LINK), "")) {
            startActivity(new Intent(this, DeepLinkActivationActivity.class));
        }
    }

    public final void r0() {
        yp.c cVar;
        RobertoEditText robertoEditText;
        yp.c cVar2;
        ConstraintLayout constraintLayout;
        v.c cVar3 = this.F;
        if (cVar3 != null && (cVar2 = (yp.c) cVar3.f34633x) != null && (constraintLayout = cVar2.f38734a) != null) {
            constraintLayout.setOnTouchListener(new h0(7));
        }
        v.c cVar4 = this.F;
        if (cVar4 != null && (cVar = (yp.c) cVar4.f34633x) != null && (robertoEditText = cVar.f38737d) != null) {
            robertoEditText.setOnEditorActionListener(new dl.w(2, this));
        }
        NpsPersistence.INSTANCE.initialise(new g());
    }

    public final void s0() {
        RobertoTextView robertoTextView;
        RobertoTextView robertoTextView2;
        RobertoTextView robertoTextView3;
        View view;
        RobertoTextView robertoTextView4;
        RobertoTextView robertoTextView5;
        RobertoTextView robertoTextView6;
        RobertoTextView robertoTextView7;
        View view2;
        RobertoTextView robertoTextView8;
        RobertoTextView robertoTextView9;
        RobertoTextView robertoTextView10;
        String str;
        boolean z10;
        Object obj;
        String string;
        String str2;
        String str3;
        String str4;
        String lastName;
        String firstName;
        NavigationView navigationView;
        View d10;
        NavigationView navigationView2;
        Menu menu;
        MenuItem findItem;
        View actionView;
        NavigationView navigationView3;
        Menu menu2;
        MenuItem findItem2;
        View actionView2;
        AppCompatImageView appCompatImageView;
        NavigationView navigationView4;
        Menu menu3;
        MenuItem findItem3;
        View actionView3;
        NavigationView navigationView5;
        Menu menu4;
        MenuItem findItem4;
        View actionView4;
        AppCompatImageView appCompatImageView2;
        NavigationView navigationView6;
        Menu menu5;
        MenuItem findItem5;
        View actionView5;
        NavigationView navigationView7;
        Menu menu6;
        MenuItem findItem6;
        View actionView6;
        NavigationView navigationView8;
        Menu menu7;
        MenuItem findItem7;
        View actionView7;
        AppCompatImageView appCompatImageView3;
        NavigationView navigationView9;
        Menu menu8;
        MenuItem findItem8;
        View actionView8;
        NavigationView navigationView10;
        Menu menu9;
        MenuItem findItem9;
        View actionView9;
        AppCompatImageView appCompatImageView4;
        NavigationView navigationView11;
        Menu menu10;
        MenuItem findItem10;
        View actionView10;
        NavigationView navigationView12;
        Menu menu11;
        MenuItem findItem11;
        View actionView11;
        AppCompatImageView appCompatImageView5;
        NavigationView navigationView13;
        Menu menu12;
        MenuItem findItem12;
        View actionView12;
        NavigationView navigationView14;
        Menu menu13;
        MenuItem findItem13;
        View actionView13;
        AppCompatImageView appCompatImageView6;
        NavigationView navigationView15;
        Menu menu14;
        MenuItem findItem14;
        View actionView14;
        NavigationView navigationView16;
        Menu menu15;
        MenuItem findItem15;
        View actionView15;
        NavigationView navigationView17;
        Menu menu16;
        MenuItem findItem16;
        View actionView16;
        AppCompatImageView appCompatImageView7;
        NavigationView navigationView18;
        Menu menu17;
        MenuItem findItem17;
        View actionView17;
        NavigationView navigationView19;
        Menu menu18;
        MenuItem findItem18;
        View actionView18;
        AppCompatImageView appCompatImageView8;
        NavigationView navigationView20;
        Menu menu19;
        MenuItem findItem19;
        View actionView19;
        NavigationView navigationView21;
        Menu menu20;
        MenuItem findItem20;
        View actionView20;
        AppCompatImageView appCompatImageView9;
        NavigationView navigationView22;
        MenuItem menuItem;
        NavigationView navigationView23;
        Menu menu21;
        try {
            String str5 = null;
            if (LocationPersistence.INSTANCE.isIndianUser()) {
                v.c cVar = this.F;
                if (cVar != null && (navigationView23 = (NavigationView) cVar.f34634y) != null && (menu21 = navigationView23.getMenu()) != null) {
                    menuItem = menu21.findItem(R.id.nav_dashboard_therapy);
                } else {
                    menuItem = null;
                }
                if (menuItem != null) {
                    menuItem.setVisible(true);
                }
            }
            v.c cVar2 = this.F;
            if (cVar2 != null && (navigationView22 = (NavigationView) cVar2.f34634y) != null) {
                navigationView22.setNavigationItemSelectedListener(this);
            }
            v.c cVar3 = this.F;
            if (cVar3 != null && (navigationView21 = (NavigationView) cVar3.f34634y) != null && (menu20 = navigationView21.getMenu()) != null && (findItem20 = menu20.findItem(R.id.nav_dashboard_therapy)) != null && (actionView20 = findItem20.getActionView()) != null && (appCompatImageView9 = (AppCompatImageView) actionView20.findViewById(R.id.ivNotV4NavIcon)) != null) {
                appCompatImageView9.setImageResource(R.drawable.ic_consult);
            }
            v.c cVar4 = this.F;
            if (cVar4 != null && (navigationView20 = (NavigationView) cVar4.f34634y) != null && (menu19 = navigationView20.getMenu()) != null && (findItem19 = menu19.findItem(R.id.nav_dashboard_therapy)) != null && (actionView19 = findItem19.getActionView()) != null) {
                robertoTextView = (RobertoTextView) actionView19.findViewById(R.id.tvNotV4NavText);
            } else {
                robertoTextView = null;
            }
            if (robertoTextView != null) {
                robertoTextView.setText(getString(R.string.menuTeleConsultation));
            }
            v.c cVar5 = this.F;
            if (cVar5 != null && (navigationView19 = (NavigationView) cVar5.f34634y) != null && (menu18 = navigationView19.getMenu()) != null && (findItem18 = menu18.findItem(R.id.nav_dashboard_premium)) != null && (actionView18 = findItem18.getActionView()) != null && (appCompatImageView8 = (AppCompatImageView) actionView18.findViewById(R.id.ivNotV4NavIcon)) != null) {
                appCompatImageView8.setImageResource(R.drawable.ic_not_v4_nav_premium);
            }
            v.c cVar6 = this.F;
            if (cVar6 != null && (navigationView18 = (NavigationView) cVar6.f34634y) != null && (menu17 = navigationView18.getMenu()) != null && (findItem17 = menu17.findItem(R.id.nav_dashboard_premium)) != null && (actionView17 = findItem17.getActionView()) != null) {
                robertoTextView2 = (RobertoTextView) actionView17.findViewById(R.id.tvNotV4NavText);
            } else {
                robertoTextView2 = null;
            }
            if (robertoTextView2 != null) {
                robertoTextView2.setText(getString(R.string.menuPremium));
            }
            v.c cVar7 = this.F;
            if (cVar7 != null && (navigationView17 = (NavigationView) cVar7.f34634y) != null && (menu16 = navigationView17.getMenu()) != null && (findItem16 = menu16.findItem(R.id.nav_dashboard_lock)) != null && (actionView16 = findItem16.getActionView()) != null && (appCompatImageView7 = (AppCompatImageView) actionView16.findViewById(R.id.ivNotV4NavIcon)) != null) {
                appCompatImageView7.setImageResource(R.drawable.ic_navigation_lock_stroke);
            }
            v.c cVar8 = this.F;
            if (cVar8 != null && (navigationView16 = (NavigationView) cVar8.f34634y) != null && (menu15 = navigationView16.getMenu()) != null && (findItem15 = menu15.findItem(R.id.nav_dashboard_lock)) != null && (actionView15 = findItem15.getActionView()) != null) {
                robertoTextView3 = (RobertoTextView) actionView15.findViewById(R.id.tvNotV4NavText);
            } else {
                robertoTextView3 = null;
            }
            if (robertoTextView3 != null) {
                robertoTextView3.setText(getString(R.string.leftMenuDashboardSecurityPinText));
            }
            v.c cVar9 = this.F;
            if (cVar9 != null && (navigationView15 = (NavigationView) cVar9.f34634y) != null && (menu14 = navigationView15.getMenu()) != null && (findItem14 = menu14.findItem(R.id.nav_dashboard_lock)) != null && (actionView14 = findItem14.getActionView()) != null) {
                view = actionView14.findViewById(R.id.viewNotV4NavFooter);
            } else {
                view = null;
            }
            if (view != null) {
                view.setVisibility(0);
            }
            v.c cVar10 = this.F;
            if (cVar10 != null && (navigationView14 = (NavigationView) cVar10.f34634y) != null && (menu13 = navigationView14.getMenu()) != null && (findItem13 = menu13.findItem(R.id.nav_dashboard_logs_main)) != null && (actionView13 = findItem13.getActionView()) != null && (appCompatImageView6 = (AppCompatImageView) actionView13.findViewById(R.id.ivNotV4NavIcon)) != null) {
                appCompatImageView6.setImageResource(R.drawable.ic_not_v4_nav_logs);
            }
            v.c cVar11 = this.F;
            if (cVar11 != null && (navigationView13 = (NavigationView) cVar11.f34634y) != null && (menu12 = navigationView13.getMenu()) != null && (findItem12 = menu12.findItem(R.id.nav_dashboard_logs_main)) != null && (actionView12 = findItem12.getActionView()) != null) {
                robertoTextView4 = (RobertoTextView) actionView12.findViewById(R.id.tvNotV4NavText);
            } else {
                robertoTextView4 = null;
            }
            if (robertoTextView4 != null) {
                robertoTextView4.setText(getString(R.string.menuPlanLogs));
            }
            v.c cVar12 = this.F;
            if (cVar12 != null && (navigationView12 = (NavigationView) cVar12.f34634y) != null && (menu11 = navigationView12.getMenu()) != null && (findItem11 = menu11.findItem(R.id.nav_dashboard_logs_library)) != null && (actionView11 = findItem11.getActionView()) != null && (appCompatImageView5 = (AppCompatImageView) actionView11.findViewById(R.id.ivNotV4NavIcon)) != null) {
                appCompatImageView5.setImageResource(R.drawable.ic_not_v4_nav_logs);
            }
            v.c cVar13 = this.F;
            if (cVar13 != null && (navigationView11 = (NavigationView) cVar13.f34634y) != null && (menu10 = navigationView11.getMenu()) != null && (findItem10 = menu10.findItem(R.id.nav_dashboard_logs_library)) != null && (actionView10 = findItem10.getActionView()) != null) {
                robertoTextView5 = (RobertoTextView) actionView10.findViewById(R.id.tvNotV4NavText);
            } else {
                robertoTextView5 = null;
            }
            if (robertoTextView5 != null) {
                robertoTextView5.setText(getString(R.string.leftMenuDashboardLibraryLogText));
            }
            v.c cVar14 = this.F;
            if (cVar14 != null && (navigationView10 = (NavigationView) cVar14.f34634y) != null && (menu9 = navigationView10.getMenu()) != null && (findItem9 = menu9.findItem(R.id.nav_dashboard_logs_additional)) != null && (actionView9 = findItem9.getActionView()) != null && (appCompatImageView4 = (AppCompatImageView) actionView9.findViewById(R.id.ivNotV4NavIcon)) != null) {
                appCompatImageView4.setImageResource(R.drawable.ic_not_v4_nav_logs);
            }
            v.c cVar15 = this.F;
            if (cVar15 != null && (navigationView9 = (NavigationView) cVar15.f34634y) != null && (menu8 = navigationView9.getMenu()) != null && (findItem8 = menu8.findItem(R.id.nav_dashboard_logs_additional)) != null && (actionView8 = findItem8.getActionView()) != null) {
                robertoTextView6 = (RobertoTextView) actionView8.findViewById(R.id.tvNotV4NavText);
            } else {
                robertoTextView6 = null;
            }
            if (robertoTextView6 != null) {
                robertoTextView6.setText(getString(R.string.leftMenuDashboardAdditionalLogText));
            }
            v.c cVar16 = this.F;
            if (cVar16 != null && (navigationView8 = (NavigationView) cVar16.f34634y) != null && (menu7 = navigationView8.getMenu()) != null && (findItem7 = menu7.findItem(R.id.nav_dashboard_tracker_logs)) != null && (actionView7 = findItem7.getActionView()) != null && (appCompatImageView3 = (AppCompatImageView) actionView7.findViewById(R.id.ivNotV4NavIcon)) != null) {
                appCompatImageView3.setImageResource(R.drawable.ic_not_v4_nav_logs);
            }
            v.c cVar17 = this.F;
            if (cVar17 != null && (navigationView7 = (NavigationView) cVar17.f34634y) != null && (menu6 = navigationView7.getMenu()) != null && (findItem6 = menu6.findItem(R.id.nav_dashboard_tracker_logs)) != null && (actionView6 = findItem6.getActionView()) != null) {
                robertoTextView7 = (RobertoTextView) actionView6.findViewById(R.id.tvNotV4NavText);
            } else {
                robertoTextView7 = null;
            }
            if (robertoTextView7 != null) {
                robertoTextView7.setText(getString(R.string.menuTrackerLogs));
            }
            v.c cVar18 = this.F;
            if (cVar18 != null && (navigationView6 = (NavigationView) cVar18.f34634y) != null && (menu5 = navigationView6.getMenu()) != null && (findItem5 = menu5.findItem(R.id.nav_dashboard_tracker_logs)) != null && (actionView5 = findItem5.getActionView()) != null) {
                view2 = actionView5.findViewById(R.id.viewNotV4NavFooter);
            } else {
                view2 = null;
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
            v.c cVar19 = this.F;
            if (cVar19 != null && (navigationView5 = (NavigationView) cVar19.f34634y) != null && (menu4 = navigationView5.getMenu()) != null && (findItem4 = menu4.findItem(R.id.nav_dashboard_rate_us)) != null && (actionView4 = findItem4.getActionView()) != null && (appCompatImageView2 = (AppCompatImageView) actionView4.findViewById(R.id.ivNotV4NavIcon)) != null) {
                appCompatImageView2.setImageResource(R.drawable.ic_not_v4_nav_rate_us);
            }
            v.c cVar20 = this.F;
            if (cVar20 != null && (navigationView4 = (NavigationView) cVar20.f34634y) != null && (menu3 = navigationView4.getMenu()) != null && (findItem3 = menu3.findItem(R.id.nav_dashboard_rate_us)) != null && (actionView3 = findItem3.getActionView()) != null) {
                robertoTextView8 = (RobertoTextView) actionView3.findViewById(R.id.tvNotV4NavText);
            } else {
                robertoTextView8 = null;
            }
            if (robertoTextView8 != null) {
                robertoTextView8.setText(getString(R.string.menuRateUs));
            }
            v.c cVar21 = this.F;
            if (cVar21 != null && (navigationView3 = (NavigationView) cVar21.f34634y) != null && (menu2 = navigationView3.getMenu()) != null && (findItem2 = menu2.findItem(R.id.nav_dashboard_settings)) != null && (actionView2 = findItem2.getActionView()) != null && (appCompatImageView = (AppCompatImageView) actionView2.findViewById(R.id.ivNotV4NavIcon)) != null) {
                appCompatImageView.setImageResource(R.drawable.ic_not_v4_nav_settings);
            }
            v.c cVar22 = this.F;
            if (cVar22 != null && (navigationView2 = (NavigationView) cVar22.f34634y) != null && (menu = navigationView2.getMenu()) != null && (findItem = menu.findItem(R.id.nav_dashboard_settings)) != null && (actionView = findItem.getActionView()) != null) {
                robertoTextView9 = (RobertoTextView) actionView.findViewById(R.id.tvNotV4NavText);
            } else {
                robertoTextView9 = null;
            }
            if (robertoTextView9 != null) {
                robertoTextView9.setText(getString(R.string.menuSettings));
            }
            v.c cVar23 = this.F;
            if (cVar23 != null && (navigationView = (NavigationView) cVar23.f34634y) != null && (d10 = navigationView.d()) != null) {
                robertoTextView10 = (RobertoTextView) d10.findViewById(R.id.dashboardMenuName);
            } else {
                robertoTextView10 = null;
            }
            if (robertoTextView10 != null) {
                Object[] objArr = new Object[1];
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str = user.getFirstName();
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                String str6 = "";
                if (!z10) {
                    User user2 = FirebasePersistence.getInstance().getUser();
                    if (user2 != null && (firstName = user2.getFirstName()) != null) {
                        str2 = gv.r.i1(firstName).toString();
                    } else {
                        str2 = null;
                    }
                    if (!kotlin.jvm.internal.i.b(str2, "null")) {
                        StringBuilder sb2 = new StringBuilder();
                        User user3 = FirebasePersistence.getInstance().getUser();
                        if (user3 != null) {
                            str3 = user3.getFirstName();
                        } else {
                            str3 = null;
                        }
                        sb2.append(str3);
                        User user4 = FirebasePersistence.getInstance().getUser();
                        if (user4 != null) {
                            str4 = user4.getLastName();
                        } else {
                            str4 = null;
                        }
                        if (str4 != null) {
                            User user5 = FirebasePersistence.getInstance().getUser();
                            if (user5 != null && (lastName = user5.getLastName()) != null) {
                                str5 = gv.r.i1(lastName).toString();
                            }
                            if (!kotlin.jvm.internal.i.b(str5, "null")) {
                                str6 = " " + FirebasePersistence.getInstance().getUser().getLastName();
                            }
                        }
                        sb2.append(str6);
                        string = sb2.toString();
                        objArr[0] = string;
                        robertoTextView10.setText(getString(R.string.left_menu_dashboard_rate_us_title, objArr));
                    }
                }
                Object[] objArr2 = new Object[2];
                String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
                kotlin.jvm.internal.i.f(stringValue, "getInstance()\n          …ionManager.KEY_FIRSTNAME)");
                if (kotlin.jvm.internal.i.b(gv.r.i1(stringValue).toString(), "null")) {
                    obj = "";
                } else {
                    obj = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
                }
                objArr2[0] = obj;
                String stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_LASTNAME);
                kotlin.jvm.internal.i.f(stringValue2, "getInstance()\n          …sionManager.KEY_LASTNAME)");
                if (!kotlin.jvm.internal.i.b(gv.r.i1(stringValue2).toString(), "null")) {
                    str6 = SessionManager.getInstance().getStringValue(SessionManager.KEY_LASTNAME);
                }
                objArr2[1] = str6;
                string = getString(R.string.profileNewSessionsName, objArr2);
                kotlin.jvm.internal.i.f(string, "{\n                    ge…      )\n                }");
                objArr[0] = string;
                robertoTextView10.setText(getString(R.string.left_menu_dashboard_rate_us_title, objArr));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10824v, e10);
        }
    }

    @Override // il.d
    public final void x() {
        startActivity(new Intent(this, DeeplinkCodeActivationActivity.class));
    }

    @Override // il.d
    public final boolean z() {
        try {
            boolean z10 = this.f10828z;
            this.f10828z = false;
            return z10;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10824v, e10);
            return false;
        }
    }

    /* compiled from: NotV4Activity.kt */
    /* loaded from: classes2.dex */
    public static final class e implements CourseApiUtil.CourseApiUtilInterface {
        public e() {
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void courseApiComplete(boolean z10) {
            s sVar;
            NotV4Activity notV4Activity = NotV4Activity.this;
            Fragment E = notV4Activity.getSupportFragmentManager().E(R.id.flNotV4DashboardMain);
            if (E instanceof s) {
                sVar = (s) E;
            } else {
                sVar = null;
            }
            if (sVar != null) {
                sVar.Y();
            }
            m mVar = notV4Activity.f10826x;
            if (mVar != null) {
                mVar.dismiss();
            }
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void errorLoadingData(Exception error) {
            kotlin.jvm.internal.i.g(error, "error");
            Extensions extensions = Extensions.INSTANCE;
            NotV4Activity notV4Activity = NotV4Activity.this;
            String string = notV4Activity.getString(R.string.telecommunicationsError);
            kotlin.jvm.internal.i.f(string, "getString(R.string.telecommunicationsError)");
            Extensions.toast$default(extensions, notV4Activity, string, 0, 2, null);
            m mVar = notV4Activity.f10826x;
            if (mVar != null) {
                mVar.dismiss();
            }
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void audioDownloadComplete() {
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void notificationFetchComplete(boolean z10) {
        }
    }

    @Override // il.d
    public final void T() {
    }
}
