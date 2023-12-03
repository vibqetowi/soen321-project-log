package com.theinnerhour.b2b.components.profile.experiment.activities;

import android.animation.ObjectAnimator;
import android.app.Application;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.k;
import com.bumptech.glide.Glide;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.logs.model.LogModel;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayDomainModelV1;
import com.theinnerhour.b2b.model.SubscriptionModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.CircleImageView;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import gv.r;
import is.u;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.x;
import so.a0;
import so.b0;
import so.d0;
import so.h0;
import ta.v;
import wo.e0;
import wo.i0;
import wo.j0;
import wo.n0;
/* compiled from: ExperimentProfileActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/profile/experiment/activities/ExperimentProfileActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ExperimentProfileActivity extends rr.a {
    public static final /* synthetic */ int S = 0;
    public int A;
    public boolean E;
    public Course F;
    public int G;
    public n0 H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public final ArrayList<Handler> L;
    public final androidx.activity.result.c<Intent> M;
    public final d0 N;
    public final androidx.activity.result.c<Intent> O;
    public vo.b P;
    public final boolean Q;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11576x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f11577y;
    public final LinkedHashMap R = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11575w = LogHelper.INSTANCE.makeLogTag(ExperimentProfileActivity.class);

    /* renamed from: z  reason: collision with root package name */
    public final HashMap<View, Integer> f11578z = new HashMap<>();
    public Integer[] B = new Integer[0];
    public final int C = Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
    public final int D = Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;

    /* compiled from: ExperimentProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<ArrayList<CourseDayDomainModelV1>, hs.k> {
        public a() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v13, types: [com.theinnerhour.b2b.model.SubscriptionModel, T] */
        @Override // ss.l
        public final hs.k invoke(ArrayList<CourseDayDomainModelV1> arrayList) {
            Integer E;
            RobertoTextView robertoTextView;
            ExperimentProfileActivity experimentProfileActivity;
            boolean z10;
            ArrayList<CourseDayDomainModelV1> arrayList2 = arrayList;
            ExperimentProfileActivity experimentProfileActivity2 = ExperimentProfileActivity.this;
            if (arrayList2 != null) {
                int i6 = ExperimentProfileActivity.S;
                ((LinearLayout) experimentProfileActivity2.u0(R.id.llProfileBookmarkingExperiment)).removeAllViews();
                SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
                boolean z11 = true;
                long j10 = 0;
                if (!subscriptionPersistence.getSubscriptionEnabled()) {
                    x xVar = new x();
                    xVar.f23469u = subscriptionPersistence.previousSubscriptionModel();
                    if (arrayList2.isEmpty()) {
                        SubscriptionModel subscriptionModel = (SubscriptionModel) xVar.f23469u;
                        if (subscriptionModel != null && subscriptionModel.getExpiryTime() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            ((RobertoTextView) experimentProfileActivity2.u0(R.id.tvProfileBookmarkingCardBody)).setText(experimentProfileActivity2.getString(R.string.BookmarkingProfileCardBody4));
                            ((RobertoTextView) experimentProfileActivity2.u0(R.id.rbProfileBookmarkingCardCta)).setText(experimentProfileActivity2.getString(R.string.BookmarkingUnlockToAdd));
                            ((ConstraintLayout) experimentProfileActivity2.u0(R.id.clProfileBookmarkingCard)).setVisibility(0);
                            ((ConstraintLayout) experimentProfileActivity2.u0(R.id.clProfileBookmarkingActivities)).setVisibility(8);
                            ((RobertoTextView) experimentProfileActivity2.u0(R.id.rbProfileBookmarkingCardCta)).setOnClickListener(DebouncedOnClickListener.wrap(new ho.o(experimentProfileActivity2, 4, xVar)));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        SubscriptionModel subscriptionModel2 = (SubscriptionModel) xVar.f23469u;
                        if ((subscriptionModel2 == null || subscriptionModel2.getExpiryTime() != 0) ? false : false) {
                            ((RobertoTextView) experimentProfileActivity2.u0(R.id.tvProfileBookmarkingCardBody)).setText(experimentProfileActivity2.getString(R.string.BookmarkingProfileCardBody2));
                            ((RobertoTextView) experimentProfileActivity2.u0(R.id.rbProfileBookmarkingCardCta)).setText(experimentProfileActivity2.getString(R.string.BookmarkingUnlockNow));
                            ((ConstraintLayout) experimentProfileActivity2.u0(R.id.clProfileBookmarkingCard)).setVisibility(0);
                            ((ConstraintLayout) experimentProfileActivity2.u0(R.id.clProfileBookmarkingActivities)).setVisibility(8);
                            ((RobertoTextView) experimentProfileActivity2.u0(R.id.rbProfileBookmarkingCardCta)).setOnClickListener(DebouncedOnClickListener.wrap(new ho.o(experimentProfileActivity2, 4, xVar)));
                        }
                    }
                    ((RobertoTextView) experimentProfileActivity2.u0(R.id.tvProfileBookmarkingCardBody)).setText(experimentProfileActivity2.getString(R.string.BookmarkingProfileCardBody3));
                    ((RobertoTextView) experimentProfileActivity2.u0(R.id.rbProfileBookmarkingCardCta)).setText(experimentProfileActivity2.getString(R.string.BookmarkingUnlockAgain));
                    ((ConstraintLayout) experimentProfileActivity2.u0(R.id.clProfileBookmarkingCard)).setVisibility(0);
                    ((ConstraintLayout) experimentProfileActivity2.u0(R.id.clProfileBookmarkingActivities)).setVisibility(8);
                    ((RobertoTextView) experimentProfileActivity2.u0(R.id.rbProfileBookmarkingCardCta)).setOnClickListener(DebouncedOnClickListener.wrap(new ho.o(experimentProfileActivity2, 4, xVar)));
                } else {
                    if (arrayList2.isEmpty()) {
                        ((ConstraintLayout) experimentProfileActivity2.u0(R.id.clProfileBookmarkingCard)).setVisibility(0);
                        ((ConstraintLayout) experimentProfileActivity2.u0(R.id.clProfileBookmarkingActivities)).setVisibility(8);
                        ((RobertoTextView) experimentProfileActivity2.u0(R.id.tvProfileBookmarkingCardBody)).setText(experimentProfileActivity2.getString(R.string.BookmarkingEmptyActivityText));
                        ((RobertoTextView) experimentProfileActivity2.u0(R.id.rbProfileBookmarkingCardCta)).setText(experimentProfileActivity2.getString(R.string.BookmarkingEmptyActivityCta));
                        ((RobertoTextView) experimentProfileActivity2.u0(R.id.rbProfileBookmarkingCardCta)).setOnClickListener(DebouncedOnClickListener.wrap(new a0(experimentProfileActivity2, 12)));
                    } else {
                        ((ConstraintLayout) experimentProfileActivity2.u0(R.id.clProfileBookmarkingCard)).setVisibility(8);
                        ((ConstraintLayout) experimentProfileActivity2.u0(R.id.clProfileBookmarkingActivities)).setVisibility(0);
                        int size = arrayList2.size();
                        ArrayList<CourseDayDomainModelV1> arrayList3 = arrayList2;
                        if (size >= 2) {
                            arrayList3 = u.E2(arrayList2, 2);
                        }
                        experimentProfileActivity2.G = arrayList3.size();
                        ((ConstraintLayout) experimentProfileActivity2.u0(R.id.clProfileBookmarkingActivities)).setVisibility(0);
                        for (CourseDayDomainModelV1 model : arrayList3) {
                            View row = experimentProfileActivity2.getLayoutInflater().inflate(R.layout.row_bookmarking_activity_profile_item, (ViewGroup) ((LinearLayout) experimentProfileActivity2.u0(R.id.llRAExperiment)), false);
                            vo.b bVar = experimentProfileActivity2.P;
                            if (bVar != null) {
                                kotlin.jvm.internal.i.f(row, "row");
                                h0 h0Var = new h0(experimentProfileActivity2, model);
                                hc.d dVar = bVar.f35294c;
                                kotlin.jvm.internal.i.g(model, "model");
                                try {
                                    ((RobertoTextView) row.findViewById(R.id.tvProfileBookmarkingHeaderTitle)).setText(model.getDayModelV1().getContent_label());
                                    ArrayList<LogModel> arrayList4 = kn.a.f23436a;
                                    ((RobertoTextView) row.findViewById(R.id.tvProfileBookmarkingCourseName)).setText(kn.a.j(model.getCourseName()));
                                    String a10 = bVar.a(model.getDayModelV1(), model.getCourseName());
                                    FireStoreUtilsKt.fetchCourseContentDurationV3(model.getDayModelV1().getContent_id(), new vo.a(row));
                                    ((RobertoTextView) row.findViewById(R.id.tvProfileBookmarkingActivitySymptoms)).setText(a10);
                                    String courseName = model.getCourseName();
                                    dVar.getClass();
                                    E = hc.d.E(courseName);
                                    robertoTextView = (RobertoTextView) row.findViewById(R.id.tvProfileBookmarkingCourseName);
                                    experimentProfileActivity = bVar.f35293b;
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(bVar.f35292a, "exception", e10);
                                }
                                if (experimentProfileActivity != null) {
                                    kotlin.jvm.internal.i.d(E);
                                    int b10 = g0.a.b(experimentProfileActivity, E.intValue());
                                    ExperimentProfileActivity experimentProfileActivity3 = bVar.f35293b;
                                    if (experimentProfileActivity3 != null) {
                                        Drawable b11 = a.c.b(experimentProfileActivity3, R.drawable.background_filled_top_right_corner_12dp);
                                        kotlin.jvm.internal.i.d(b11);
                                        Drawable mutate = b11.mutate();
                                        kotlin.jvm.internal.i.f(mutate, "getDrawable(activity, resid)!!.mutate()");
                                        mutate.setColorFilter(b10, PorterDuff.Mode.SRC_ATOP);
                                        robertoTextView.setBackground(mutate);
                                        Integer I = hc.d.I(model.getCourseName());
                                        if (I != null) {
                                            ((AppCompatImageView) row.findViewById(R.id.ivProfileBookmarkingItem)).setImageResource(I.intValue());
                                        }
                                        if (model.getDayModelV1().getLast_accessed_date() != j10) {
                                            Calendar calendar = Calendar.getInstance();
                                            calendar.setTimeInMillis(1000 * model.getDayModelV1().getLast_accessed_date());
                                            String format = new SimpleDateFormat("MMM dd, yyyy").format(calendar.getTime());
                                            RobertoTextView robertoTextView2 = (RobertoTextView) row.findViewById(R.id.tvProfileBookmarkingActivityLastAccessedOn);
                                            ExperimentProfileActivity experimentProfileActivity4 = bVar.f35293b;
                                            if (experimentProfileActivity4 != null) {
                                                robertoTextView2.setText(experimentProfileActivity4.getString(R.string.BookmarkingLastAccessedOn, format.toString()));
                                            } else {
                                                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                throw null;
                                            }
                                        }
                                        ((ConstraintLayout) row.findViewById(R.id.clBookMarkedItem)).setOnClickListener(new ho.o(h0Var, 5, model));
                                        ((LinearLayout) experimentProfileActivity2.u0(R.id.llProfileBookmarkingExperiment)).addView(row);
                                        j10 = 0;
                                    } else {
                                        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.i.q("experimentProfileUtils");
                                throw null;
                            }
                        }
                        if (hs.k.f19476a == null) {
                            Toast.makeText(experimentProfileActivity2, "Error in fetching tools to unwind.", 0).show();
                        }
                    }
                    ((RobertoButton) experimentProfileActivity2.u0(R.id.rbProfileBookmarkingExperiment)).setOnClickListener(DebouncedOnClickListener.wrap(new a0(experimentProfileActivity2, 13)));
                }
            } else {
                Toast.makeText(experimentProfileActivity2, "Error!", 0).show();
            }
            ((ProgressBar) experimentProfileActivity2.u0(R.id.pbProfileBookmarkingExperiment)).setVisibility(8);
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<Boolean[], hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ n0 f11581v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n0 n0Var) {
            super(1);
            this.f11581v = n0Var;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean[] boolArr) {
            AppCompatImageView appCompatImageView;
            AppCompatImageView appCompatImageView2;
            AppCompatImageView appCompatImageView3;
            AppCompatImageView appCompatImageView4;
            AppCompatImageView appCompatImageView5;
            AppCompatImageView appCompatImageView6;
            AppCompatImageView appCompatImageView7;
            AppCompatImageView appCompatImageView8;
            final Boolean[] it = boolArr;
            final n0 n0Var = this.f11581v;
            try {
                kotlin.jvm.internal.i.f(it, "it");
                Object V1 = is.k.V1(0, it);
                Boolean bool = Boolean.FALSE;
                boolean b10 = kotlin.jvm.internal.i.b(V1, bool);
                final ExperimentProfileActivity experimentProfileActivity = ExperimentProfileActivity.this;
                if (b10 && (appCompatImageView8 = (AppCompatImageView) experimentProfileActivity.u0(R.id.badgeImage1)) != null) {
                    appCompatImageView8.setColorFilter(g0.a.b(experimentProfileActivity, R.color.title_high_contrast_54_opacity));
                }
                AppCompatImageView appCompatImageView9 = (AppCompatImageView) experimentProfileActivity.u0(R.id.badgeImage1);
                if (appCompatImageView9 != null) {
                    appCompatImageView9.setOnClickListener(new View.OnClickListener() { // from class: so.i0
                        private final void a() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView10 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView10 != null) {
                                    appCompatImageView10.setImageResource(R.drawable.ir_badge_1000_points_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaestro));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaestroDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(5, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView11 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView11 != null) {
                                        appCompatImageView11.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView12 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView12 != null) {
                                        appCompatImageView12.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView13 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView13 != null) {
                                        appCompatImageView13.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView14 != null) {
                                        appCompatImageView14.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView15 != null) {
                                        appCompatImageView15.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(5, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Maestro");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        private final void b() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView10 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView10 != null) {
                                    appCompatImageView10.setImageResource(R.drawable.ir_badge_go_getter_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessGoGetter));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessGoGetterDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(6, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView11 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView11 != null) {
                                        appCompatImageView11.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView12 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView12 != null) {
                                        appCompatImageView12.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView13 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView13 != null) {
                                        appCompatImageView13.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView14 != null) {
                                        appCompatImageView14.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView15 != null) {
                                        appCompatImageView15.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(6, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Go Getter");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        private final void c() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView10 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView10 != null) {
                                    appCompatImageView10.setImageResource(R.drawable.ir_badge_happiness_sharer_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessSharer));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessSharerDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(7, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView11 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView11 != null) {
                                        appCompatImageView11.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView12 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView12 != null) {
                                        appCompatImageView12.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView13 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView13 != null) {
                                        appCompatImageView13.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView14 != null) {
                                        appCompatImageView14.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView15 != null) {
                                        appCompatImageView15.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(7, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Sharer");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6;
                            int i10;
                            int i11;
                            int i12;
                            int i13;
                            int i14;
                            int i15;
                            int i16;
                            int i17;
                            int i18;
                            int i19;
                            int i20;
                            int i21;
                            int i22;
                            int i23;
                            int i24;
                            int i25;
                            int i26;
                            int i27;
                            int i28;
                            int i29;
                            String str = "locked";
                            int i30 = r4;
                            n0 this_apply = n0Var;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            Boolean[] it2 = it;
                            switch (i30) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView10 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView10 != null) {
                                            appCompatImageView10.setImageResource(R.drawable.ir_badge_100_points_new);
                                        }
                                        RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView != null) {
                                            robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeCheerfulChamp));
                                        }
                                        RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView2 != null) {
                                            robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeCheerfulChampDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u02 = this$0.u0(R.id.blanketView);
                                        if (u02 == null) {
                                            i6 = 0;
                                        } else {
                                            i6 = 0;
                                            u02.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V12 = is.k.V1(i6, it2);
                                        Boolean bool2 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                            AppCompatImageView appCompatImageView11 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView11 != null) {
                                                appCompatImageView11.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView12 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView12 == null) {
                                                i13 = R.id.profileBottomSheetLockedText;
                                                i12 = 0;
                                            } else {
                                                i12 = 0;
                                                appCompatImageView12.setVisibility(0);
                                                i13 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(i13);
                                            if (robertoTextView3 != null) {
                                                robertoTextView3.setVisibility(i12);
                                            }
                                            AppCompatImageView appCompatImageView13 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView13 != null) {
                                                appCompatImageView13.setVisibility(i12);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView14 != null) {
                                                appCompatImageView14.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView15 == null) {
                                                i11 = R.id.profileBottomSheetLockedText;
                                                i10 = 8;
                                            } else {
                                                i10 = 8;
                                                appCompatImageView15.setVisibility(8);
                                                i11 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(i11);
                                            if (robertoTextView4 != null) {
                                                robertoTextView4.setVisibility(i10);
                                            }
                                            AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView16 != null) {
                                                appCompatImageView16.setVisibility(i10);
                                            }
                                        }
                                        String str2 = gk.a.f16573a;
                                        Bundle bundle = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(0, it2), bool2)) {
                                            str = "unlocked";
                                        }
                                        bundle.putString("status", str);
                                        bundle.putString("badge_name", "Cheerful Champ");
                                        bundle.putString("variant", "new");
                                        hs.k kVar = hs.k.f19476a;
                                        gk.a.b(bundle, "profile_badge_click");
                                        return;
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                                        return;
                                    }
                                case 1:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView17 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView17 != null) {
                                            appCompatImageView17.setImageResource(R.drawable.ir_badge_track_mood_new);
                                        }
                                        RobertoTextView robertoTextView5 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView5 != null) {
                                            robertoTextView5.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaker));
                                        }
                                        RobertoTextView robertoTextView6 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView6 != null) {
                                            robertoTextView6.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMakerDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u03 = this$0.u0(R.id.blanketView);
                                        if (u03 != null) {
                                            u03.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V13 = is.k.V1(1, it2);
                                        Boolean bool3 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V13, bool3)) {
                                            AppCompatImageView appCompatImageView18 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView18 != null) {
                                                appCompatImageView18.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView19 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView19 == null) {
                                                i17 = R.id.profileBottomSheetLockedText;
                                                i16 = 0;
                                            } else {
                                                i16 = 0;
                                                appCompatImageView19.setVisibility(0);
                                                i17 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView7 = (RobertoTextView) this$0.u0(i17);
                                            if (robertoTextView7 != null) {
                                                robertoTextView7.setVisibility(i16);
                                            }
                                            AppCompatImageView appCompatImageView20 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView20 != null) {
                                                appCompatImageView20.setVisibility(i16);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView21 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView21 != null) {
                                                appCompatImageView21.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView22 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView22 == null) {
                                                i15 = R.id.profileBottomSheetLockedText;
                                                i14 = 8;
                                            } else {
                                                i14 = 8;
                                                appCompatImageView22.setVisibility(8);
                                                i15 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView8 = (RobertoTextView) this$0.u0(i15);
                                            if (robertoTextView8 != null) {
                                                robertoTextView8.setVisibility(i14);
                                            }
                                            AppCompatImageView appCompatImageView23 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView23 != null) {
                                                appCompatImageView23.setVisibility(i14);
                                            }
                                        }
                                        String str3 = gk.a.f16573a;
                                        Bundle bundle2 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(1, it2), bool3)) {
                                            str = "unlocked";
                                        }
                                        bundle2.putString("status", str);
                                        bundle2.putString("badge_name", "Happiness Maker");
                                        bundle2.putString("variant", "new");
                                        hs.k kVar2 = hs.k.f19476a;
                                        gk.a.b(bundle2, "profile_badge_click");
                                        return;
                                    } catch (Exception e11) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e11);
                                        return;
                                    }
                                case 2:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView24 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView24 != null) {
                                            appCompatImageView24.setImageResource(R.drawable.ir_badge_schedule_activity_new);
                                        }
                                        RobertoTextView robertoTextView9 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView9 != null) {
                                            robertoTextView9.setText(this$0.getString(R.string.profileNewHappinessBadgeHappyCamper));
                                        }
                                        RobertoTextView robertoTextView10 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView10 != null) {
                                            robertoTextView10.setText(this$0.getString(R.string.profileNewHappinessBadgeHappyCamperDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u04 = this$0.u0(R.id.blanketView);
                                        if (u04 != null) {
                                            u04.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V14 = is.k.V1(2, it2);
                                        Boolean bool4 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V14, bool4)) {
                                            AppCompatImageView appCompatImageView25 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView25 != null) {
                                                appCompatImageView25.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView26 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView26 == null) {
                                                i21 = R.id.profileBottomSheetLockedText;
                                                i20 = 0;
                                            } else {
                                                i20 = 0;
                                                appCompatImageView26.setVisibility(0);
                                                i21 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView11 = (RobertoTextView) this$0.u0(i21);
                                            if (robertoTextView11 != null) {
                                                robertoTextView11.setVisibility(i20);
                                            }
                                            AppCompatImageView appCompatImageView27 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView27 != null) {
                                                appCompatImageView27.setVisibility(i20);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView28 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView28 != null) {
                                                appCompatImageView28.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView29 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView29 == null) {
                                                i19 = R.id.profileBottomSheetLockedText;
                                                i18 = 8;
                                            } else {
                                                i18 = 8;
                                                appCompatImageView29.setVisibility(8);
                                                i19 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView12 = (RobertoTextView) this$0.u0(i19);
                                            if (robertoTextView12 != null) {
                                                robertoTextView12.setVisibility(i18);
                                            }
                                            AppCompatImageView appCompatImageView30 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView30 != null) {
                                                appCompatImageView30.setVisibility(i18);
                                            }
                                        }
                                        String str4 = gk.a.f16573a;
                                        Bundle bundle3 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(2, it2), bool4)) {
                                            str = "unlocked";
                                        }
                                        bundle3.putString("status", str);
                                        bundle3.putString("badge_name", "Happy Camper");
                                        bundle3.putString("variant", "new");
                                        hs.k kVar3 = hs.k.f19476a;
                                        gk.a.b(bundle3, "profile_badge_click");
                                        return;
                                    } catch (Exception e12) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e12);
                                        return;
                                    }
                                case 3:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView31 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView31 != null) {
                                            appCompatImageView31.setImageResource(R.drawable.ir_badge_500_points_new);
                                        }
                                        RobertoTextView robertoTextView13 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView13 != null) {
                                            robertoTextView13.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessNinja));
                                        }
                                        RobertoTextView robertoTextView14 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView14 != null) {
                                            robertoTextView14.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessNinjaDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u05 = this$0.u0(R.id.blanketView);
                                        if (u05 != null) {
                                            u05.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V15 = is.k.V1(3, it2);
                                        Boolean bool5 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V15, bool5)) {
                                            AppCompatImageView appCompatImageView32 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView32 != null) {
                                                appCompatImageView32.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView33 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView33 == null) {
                                                i25 = R.id.profileBottomSheetLockedText;
                                                i24 = 0;
                                            } else {
                                                i24 = 0;
                                                appCompatImageView33.setVisibility(0);
                                                i25 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView15 = (RobertoTextView) this$0.u0(i25);
                                            if (robertoTextView15 != null) {
                                                robertoTextView15.setVisibility(i24);
                                            }
                                            AppCompatImageView appCompatImageView34 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView34 != null) {
                                                appCompatImageView34.setVisibility(i24);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView35 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView35 != null) {
                                                appCompatImageView35.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView36 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView36 == null) {
                                                i23 = R.id.profileBottomSheetLockedText;
                                                i22 = 8;
                                            } else {
                                                i22 = 8;
                                                appCompatImageView36.setVisibility(8);
                                                i23 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView16 = (RobertoTextView) this$0.u0(i23);
                                            if (robertoTextView16 != null) {
                                                robertoTextView16.setVisibility(i22);
                                            }
                                            AppCompatImageView appCompatImageView37 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView37 != null) {
                                                appCompatImageView37.setVisibility(i22);
                                            }
                                        }
                                        String str5 = gk.a.f16573a;
                                        Bundle bundle4 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(3, it2), bool5)) {
                                            str = "unlocked";
                                        }
                                        bundle4.putString("status", str);
                                        bundle4.putString("badge_name", "Happiness Ninja");
                                        bundle4.putString("variant", "new");
                                        hs.k kVar4 = hs.k.f19476a;
                                        gk.a.b(bundle4, "profile_badge_click");
                                        return;
                                    } catch (Exception e13) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e13);
                                        return;
                                    }
                                case 4:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView38 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView38 != null) {
                                            appCompatImageView38.setImageResource(R.drawable.ir_badge_track_goals_week_new);
                                        }
                                        RobertoTextView robertoTextView17 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView17 != null) {
                                            robertoTextView17.setText(this$0.getString(R.string.profileNewHappinessBadgeEnduranceBuilder));
                                        }
                                        RobertoTextView robertoTextView18 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView18 != null) {
                                            robertoTextView18.setText(this$0.getString(R.string.profileNewHappinessBadgeEnduranceBuilderDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u06 = this$0.u0(R.id.blanketView);
                                        if (u06 != null) {
                                            u06.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V16 = is.k.V1(4, it2);
                                        Boolean bool6 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V16, bool6)) {
                                            AppCompatImageView appCompatImageView39 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView39 != null) {
                                                appCompatImageView39.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView40 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView40 == null) {
                                                i29 = R.id.profileBottomSheetLockedText;
                                                i28 = 0;
                                            } else {
                                                i28 = 0;
                                                appCompatImageView40.setVisibility(0);
                                                i29 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView19 = (RobertoTextView) this$0.u0(i29);
                                            if (robertoTextView19 != null) {
                                                robertoTextView19.setVisibility(i28);
                                            }
                                            AppCompatImageView appCompatImageView41 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView41 != null) {
                                                appCompatImageView41.setVisibility(i28);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView42 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView42 != null) {
                                                appCompatImageView42.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView43 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView43 == null) {
                                                i27 = R.id.profileBottomSheetLockedText;
                                                i26 = 8;
                                            } else {
                                                i26 = 8;
                                                appCompatImageView43.setVisibility(8);
                                                i27 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView20 = (RobertoTextView) this$0.u0(i27);
                                            if (robertoTextView20 != null) {
                                                robertoTextView20.setVisibility(i26);
                                            }
                                            AppCompatImageView appCompatImageView44 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView44 != null) {
                                                appCompatImageView44.setVisibility(i26);
                                            }
                                        }
                                        String str6 = gk.a.f16573a;
                                        Bundle bundle5 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(4, it2), bool6)) {
                                            str = "unlocked";
                                        }
                                        bundle5.putString("status", str);
                                        bundle5.putString("badge_name", "Endurance Builder");
                                        bundle5.putString("variant", "new");
                                        hs.k kVar5 = hs.k.f19476a;
                                        gk.a.b(bundle5, "profile_badge_click");
                                        return;
                                    } catch (Exception e14) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e14);
                                        return;
                                    }
                                case 5:
                                    a();
                                    return;
                                case 6:
                                    b();
                                    return;
                                default:
                                    c();
                                    return;
                            }
                        }
                    });
                }
                if (kotlin.jvm.internal.i.b(is.k.V1(1, it), bool) && (appCompatImageView7 = (AppCompatImageView) experimentProfileActivity.u0(R.id.badgeImage2)) != null) {
                    appCompatImageView7.setColorFilter(g0.a.b(experimentProfileActivity, R.color.title_high_contrast_54_opacity));
                }
                AppCompatImageView appCompatImageView10 = (AppCompatImageView) experimentProfileActivity.u0(R.id.badgeImage2);
                if (appCompatImageView10 != null) {
                    appCompatImageView10.setOnClickListener(new View.OnClickListener() { // from class: so.i0
                        private final void a() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_1000_points_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaestro));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaestroDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(5, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView11 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView11 != null) {
                                        appCompatImageView11.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView12 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView12 != null) {
                                        appCompatImageView12.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView13 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView13 != null) {
                                        appCompatImageView13.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView14 != null) {
                                        appCompatImageView14.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView15 != null) {
                                        appCompatImageView15.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(5, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Maestro");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        private final void b() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_go_getter_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessGoGetter));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessGoGetterDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(6, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView11 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView11 != null) {
                                        appCompatImageView11.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView12 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView12 != null) {
                                        appCompatImageView12.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView13 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView13 != null) {
                                        appCompatImageView13.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView14 != null) {
                                        appCompatImageView14.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView15 != null) {
                                        appCompatImageView15.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(6, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Go Getter");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        private final void c() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_happiness_sharer_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessSharer));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessSharerDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(7, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView11 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView11 != null) {
                                        appCompatImageView11.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView12 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView12 != null) {
                                        appCompatImageView12.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView13 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView13 != null) {
                                        appCompatImageView13.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView14 != null) {
                                        appCompatImageView14.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView15 != null) {
                                        appCompatImageView15.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(7, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Sharer");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6;
                            int i10;
                            int i11;
                            int i12;
                            int i13;
                            int i14;
                            int i15;
                            int i16;
                            int i17;
                            int i18;
                            int i19;
                            int i20;
                            int i21;
                            int i22;
                            int i23;
                            int i24;
                            int i25;
                            int i26;
                            int i27;
                            int i28;
                            int i29;
                            String str = "locked";
                            int i30 = r4;
                            n0 this_apply = n0Var;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            Boolean[] it2 = it;
                            switch (i30) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView102 != null) {
                                            appCompatImageView102.setImageResource(R.drawable.ir_badge_100_points_new);
                                        }
                                        RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView != null) {
                                            robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeCheerfulChamp));
                                        }
                                        RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView2 != null) {
                                            robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeCheerfulChampDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u02 = this$0.u0(R.id.blanketView);
                                        if (u02 == null) {
                                            i6 = 0;
                                        } else {
                                            i6 = 0;
                                            u02.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V12 = is.k.V1(i6, it2);
                                        Boolean bool2 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                            AppCompatImageView appCompatImageView11 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView11 != null) {
                                                appCompatImageView11.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView12 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView12 == null) {
                                                i13 = R.id.profileBottomSheetLockedText;
                                                i12 = 0;
                                            } else {
                                                i12 = 0;
                                                appCompatImageView12.setVisibility(0);
                                                i13 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(i13);
                                            if (robertoTextView3 != null) {
                                                robertoTextView3.setVisibility(i12);
                                            }
                                            AppCompatImageView appCompatImageView13 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView13 != null) {
                                                appCompatImageView13.setVisibility(i12);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView14 != null) {
                                                appCompatImageView14.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView15 == null) {
                                                i11 = R.id.profileBottomSheetLockedText;
                                                i10 = 8;
                                            } else {
                                                i10 = 8;
                                                appCompatImageView15.setVisibility(8);
                                                i11 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(i11);
                                            if (robertoTextView4 != null) {
                                                robertoTextView4.setVisibility(i10);
                                            }
                                            AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView16 != null) {
                                                appCompatImageView16.setVisibility(i10);
                                            }
                                        }
                                        String str2 = gk.a.f16573a;
                                        Bundle bundle = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(0, it2), bool2)) {
                                            str = "unlocked";
                                        }
                                        bundle.putString("status", str);
                                        bundle.putString("badge_name", "Cheerful Champ");
                                        bundle.putString("variant", "new");
                                        hs.k kVar = hs.k.f19476a;
                                        gk.a.b(bundle, "profile_badge_click");
                                        return;
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                                        return;
                                    }
                                case 1:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView17 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView17 != null) {
                                            appCompatImageView17.setImageResource(R.drawable.ir_badge_track_mood_new);
                                        }
                                        RobertoTextView robertoTextView5 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView5 != null) {
                                            robertoTextView5.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaker));
                                        }
                                        RobertoTextView robertoTextView6 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView6 != null) {
                                            robertoTextView6.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMakerDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u03 = this$0.u0(R.id.blanketView);
                                        if (u03 != null) {
                                            u03.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V13 = is.k.V1(1, it2);
                                        Boolean bool3 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V13, bool3)) {
                                            AppCompatImageView appCompatImageView18 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView18 != null) {
                                                appCompatImageView18.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView19 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView19 == null) {
                                                i17 = R.id.profileBottomSheetLockedText;
                                                i16 = 0;
                                            } else {
                                                i16 = 0;
                                                appCompatImageView19.setVisibility(0);
                                                i17 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView7 = (RobertoTextView) this$0.u0(i17);
                                            if (robertoTextView7 != null) {
                                                robertoTextView7.setVisibility(i16);
                                            }
                                            AppCompatImageView appCompatImageView20 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView20 != null) {
                                                appCompatImageView20.setVisibility(i16);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView21 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView21 != null) {
                                                appCompatImageView21.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView22 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView22 == null) {
                                                i15 = R.id.profileBottomSheetLockedText;
                                                i14 = 8;
                                            } else {
                                                i14 = 8;
                                                appCompatImageView22.setVisibility(8);
                                                i15 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView8 = (RobertoTextView) this$0.u0(i15);
                                            if (robertoTextView8 != null) {
                                                robertoTextView8.setVisibility(i14);
                                            }
                                            AppCompatImageView appCompatImageView23 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView23 != null) {
                                                appCompatImageView23.setVisibility(i14);
                                            }
                                        }
                                        String str3 = gk.a.f16573a;
                                        Bundle bundle2 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(1, it2), bool3)) {
                                            str = "unlocked";
                                        }
                                        bundle2.putString("status", str);
                                        bundle2.putString("badge_name", "Happiness Maker");
                                        bundle2.putString("variant", "new");
                                        hs.k kVar2 = hs.k.f19476a;
                                        gk.a.b(bundle2, "profile_badge_click");
                                        return;
                                    } catch (Exception e11) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e11);
                                        return;
                                    }
                                case 2:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView24 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView24 != null) {
                                            appCompatImageView24.setImageResource(R.drawable.ir_badge_schedule_activity_new);
                                        }
                                        RobertoTextView robertoTextView9 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView9 != null) {
                                            robertoTextView9.setText(this$0.getString(R.string.profileNewHappinessBadgeHappyCamper));
                                        }
                                        RobertoTextView robertoTextView10 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView10 != null) {
                                            robertoTextView10.setText(this$0.getString(R.string.profileNewHappinessBadgeHappyCamperDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u04 = this$0.u0(R.id.blanketView);
                                        if (u04 != null) {
                                            u04.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V14 = is.k.V1(2, it2);
                                        Boolean bool4 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V14, bool4)) {
                                            AppCompatImageView appCompatImageView25 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView25 != null) {
                                                appCompatImageView25.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView26 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView26 == null) {
                                                i21 = R.id.profileBottomSheetLockedText;
                                                i20 = 0;
                                            } else {
                                                i20 = 0;
                                                appCompatImageView26.setVisibility(0);
                                                i21 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView11 = (RobertoTextView) this$0.u0(i21);
                                            if (robertoTextView11 != null) {
                                                robertoTextView11.setVisibility(i20);
                                            }
                                            AppCompatImageView appCompatImageView27 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView27 != null) {
                                                appCompatImageView27.setVisibility(i20);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView28 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView28 != null) {
                                                appCompatImageView28.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView29 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView29 == null) {
                                                i19 = R.id.profileBottomSheetLockedText;
                                                i18 = 8;
                                            } else {
                                                i18 = 8;
                                                appCompatImageView29.setVisibility(8);
                                                i19 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView12 = (RobertoTextView) this$0.u0(i19);
                                            if (robertoTextView12 != null) {
                                                robertoTextView12.setVisibility(i18);
                                            }
                                            AppCompatImageView appCompatImageView30 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView30 != null) {
                                                appCompatImageView30.setVisibility(i18);
                                            }
                                        }
                                        String str4 = gk.a.f16573a;
                                        Bundle bundle3 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(2, it2), bool4)) {
                                            str = "unlocked";
                                        }
                                        bundle3.putString("status", str);
                                        bundle3.putString("badge_name", "Happy Camper");
                                        bundle3.putString("variant", "new");
                                        hs.k kVar3 = hs.k.f19476a;
                                        gk.a.b(bundle3, "profile_badge_click");
                                        return;
                                    } catch (Exception e12) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e12);
                                        return;
                                    }
                                case 3:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView31 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView31 != null) {
                                            appCompatImageView31.setImageResource(R.drawable.ir_badge_500_points_new);
                                        }
                                        RobertoTextView robertoTextView13 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView13 != null) {
                                            robertoTextView13.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessNinja));
                                        }
                                        RobertoTextView robertoTextView14 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView14 != null) {
                                            robertoTextView14.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessNinjaDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u05 = this$0.u0(R.id.blanketView);
                                        if (u05 != null) {
                                            u05.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V15 = is.k.V1(3, it2);
                                        Boolean bool5 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V15, bool5)) {
                                            AppCompatImageView appCompatImageView32 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView32 != null) {
                                                appCompatImageView32.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView33 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView33 == null) {
                                                i25 = R.id.profileBottomSheetLockedText;
                                                i24 = 0;
                                            } else {
                                                i24 = 0;
                                                appCompatImageView33.setVisibility(0);
                                                i25 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView15 = (RobertoTextView) this$0.u0(i25);
                                            if (robertoTextView15 != null) {
                                                robertoTextView15.setVisibility(i24);
                                            }
                                            AppCompatImageView appCompatImageView34 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView34 != null) {
                                                appCompatImageView34.setVisibility(i24);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView35 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView35 != null) {
                                                appCompatImageView35.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView36 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView36 == null) {
                                                i23 = R.id.profileBottomSheetLockedText;
                                                i22 = 8;
                                            } else {
                                                i22 = 8;
                                                appCompatImageView36.setVisibility(8);
                                                i23 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView16 = (RobertoTextView) this$0.u0(i23);
                                            if (robertoTextView16 != null) {
                                                robertoTextView16.setVisibility(i22);
                                            }
                                            AppCompatImageView appCompatImageView37 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView37 != null) {
                                                appCompatImageView37.setVisibility(i22);
                                            }
                                        }
                                        String str5 = gk.a.f16573a;
                                        Bundle bundle4 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(3, it2), bool5)) {
                                            str = "unlocked";
                                        }
                                        bundle4.putString("status", str);
                                        bundle4.putString("badge_name", "Happiness Ninja");
                                        bundle4.putString("variant", "new");
                                        hs.k kVar4 = hs.k.f19476a;
                                        gk.a.b(bundle4, "profile_badge_click");
                                        return;
                                    } catch (Exception e13) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e13);
                                        return;
                                    }
                                case 4:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView38 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView38 != null) {
                                            appCompatImageView38.setImageResource(R.drawable.ir_badge_track_goals_week_new);
                                        }
                                        RobertoTextView robertoTextView17 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView17 != null) {
                                            robertoTextView17.setText(this$0.getString(R.string.profileNewHappinessBadgeEnduranceBuilder));
                                        }
                                        RobertoTextView robertoTextView18 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView18 != null) {
                                            robertoTextView18.setText(this$0.getString(R.string.profileNewHappinessBadgeEnduranceBuilderDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u06 = this$0.u0(R.id.blanketView);
                                        if (u06 != null) {
                                            u06.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V16 = is.k.V1(4, it2);
                                        Boolean bool6 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V16, bool6)) {
                                            AppCompatImageView appCompatImageView39 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView39 != null) {
                                                appCompatImageView39.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView40 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView40 == null) {
                                                i29 = R.id.profileBottomSheetLockedText;
                                                i28 = 0;
                                            } else {
                                                i28 = 0;
                                                appCompatImageView40.setVisibility(0);
                                                i29 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView19 = (RobertoTextView) this$0.u0(i29);
                                            if (robertoTextView19 != null) {
                                                robertoTextView19.setVisibility(i28);
                                            }
                                            AppCompatImageView appCompatImageView41 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView41 != null) {
                                                appCompatImageView41.setVisibility(i28);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView42 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView42 != null) {
                                                appCompatImageView42.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView43 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView43 == null) {
                                                i27 = R.id.profileBottomSheetLockedText;
                                                i26 = 8;
                                            } else {
                                                i26 = 8;
                                                appCompatImageView43.setVisibility(8);
                                                i27 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView20 = (RobertoTextView) this$0.u0(i27);
                                            if (robertoTextView20 != null) {
                                                robertoTextView20.setVisibility(i26);
                                            }
                                            AppCompatImageView appCompatImageView44 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView44 != null) {
                                                appCompatImageView44.setVisibility(i26);
                                            }
                                        }
                                        String str6 = gk.a.f16573a;
                                        Bundle bundle5 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(4, it2), bool6)) {
                                            str = "unlocked";
                                        }
                                        bundle5.putString("status", str);
                                        bundle5.putString("badge_name", "Endurance Builder");
                                        bundle5.putString("variant", "new");
                                        hs.k kVar5 = hs.k.f19476a;
                                        gk.a.b(bundle5, "profile_badge_click");
                                        return;
                                    } catch (Exception e14) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e14);
                                        return;
                                    }
                                case 5:
                                    a();
                                    return;
                                case 6:
                                    b();
                                    return;
                                default:
                                    c();
                                    return;
                            }
                        }
                    });
                }
                if (kotlin.jvm.internal.i.b(is.k.V1(2, it), bool) && (appCompatImageView6 = (AppCompatImageView) experimentProfileActivity.u0(R.id.badgeImage3)) != null) {
                    appCompatImageView6.setColorFilter(g0.a.b(experimentProfileActivity, R.color.title_high_contrast_54_opacity));
                }
                AppCompatImageView appCompatImageView11 = (AppCompatImageView) experimentProfileActivity.u0(R.id.badgeImage3);
                if (appCompatImageView11 != null) {
                    appCompatImageView11.setOnClickListener(new View.OnClickListener() { // from class: so.i0
                        private final void a() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_1000_points_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaestro));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaestroDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(5, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView112 != null) {
                                        appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView12 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView12 != null) {
                                        appCompatImageView12.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView13 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView13 != null) {
                                        appCompatImageView13.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView14 != null) {
                                        appCompatImageView14.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView15 != null) {
                                        appCompatImageView15.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(5, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Maestro");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        private final void b() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_go_getter_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessGoGetter));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessGoGetterDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(6, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView112 != null) {
                                        appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView12 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView12 != null) {
                                        appCompatImageView12.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView13 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView13 != null) {
                                        appCompatImageView13.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView14 != null) {
                                        appCompatImageView14.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView15 != null) {
                                        appCompatImageView15.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(6, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Go Getter");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        private final void c() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_happiness_sharer_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessSharer));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessSharerDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(7, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView112 != null) {
                                        appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView12 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView12 != null) {
                                        appCompatImageView12.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView13 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView13 != null) {
                                        appCompatImageView13.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView14 != null) {
                                        appCompatImageView14.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView15 != null) {
                                        appCompatImageView15.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(7, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Sharer");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6;
                            int i10;
                            int i11;
                            int i12;
                            int i13;
                            int i14;
                            int i15;
                            int i16;
                            int i17;
                            int i18;
                            int i19;
                            int i20;
                            int i21;
                            int i22;
                            int i23;
                            int i24;
                            int i25;
                            int i26;
                            int i27;
                            int i28;
                            int i29;
                            String str = "locked";
                            int i30 = r4;
                            n0 this_apply = n0Var;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            Boolean[] it2 = it;
                            switch (i30) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView102 != null) {
                                            appCompatImageView102.setImageResource(R.drawable.ir_badge_100_points_new);
                                        }
                                        RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView != null) {
                                            robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeCheerfulChamp));
                                        }
                                        RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView2 != null) {
                                            robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeCheerfulChampDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u02 = this$0.u0(R.id.blanketView);
                                        if (u02 == null) {
                                            i6 = 0;
                                        } else {
                                            i6 = 0;
                                            u02.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V12 = is.k.V1(i6, it2);
                                        Boolean bool2 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                            AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView112 != null) {
                                                appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView12 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView12 == null) {
                                                i13 = R.id.profileBottomSheetLockedText;
                                                i12 = 0;
                                            } else {
                                                i12 = 0;
                                                appCompatImageView12.setVisibility(0);
                                                i13 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(i13);
                                            if (robertoTextView3 != null) {
                                                robertoTextView3.setVisibility(i12);
                                            }
                                            AppCompatImageView appCompatImageView13 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView13 != null) {
                                                appCompatImageView13.setVisibility(i12);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView14 != null) {
                                                appCompatImageView14.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView15 == null) {
                                                i11 = R.id.profileBottomSheetLockedText;
                                                i10 = 8;
                                            } else {
                                                i10 = 8;
                                                appCompatImageView15.setVisibility(8);
                                                i11 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(i11);
                                            if (robertoTextView4 != null) {
                                                robertoTextView4.setVisibility(i10);
                                            }
                                            AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView16 != null) {
                                                appCompatImageView16.setVisibility(i10);
                                            }
                                        }
                                        String str2 = gk.a.f16573a;
                                        Bundle bundle = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(0, it2), bool2)) {
                                            str = "unlocked";
                                        }
                                        bundle.putString("status", str);
                                        bundle.putString("badge_name", "Cheerful Champ");
                                        bundle.putString("variant", "new");
                                        hs.k kVar = hs.k.f19476a;
                                        gk.a.b(bundle, "profile_badge_click");
                                        return;
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                                        return;
                                    }
                                case 1:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView17 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView17 != null) {
                                            appCompatImageView17.setImageResource(R.drawable.ir_badge_track_mood_new);
                                        }
                                        RobertoTextView robertoTextView5 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView5 != null) {
                                            robertoTextView5.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaker));
                                        }
                                        RobertoTextView robertoTextView6 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView6 != null) {
                                            robertoTextView6.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMakerDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u03 = this$0.u0(R.id.blanketView);
                                        if (u03 != null) {
                                            u03.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V13 = is.k.V1(1, it2);
                                        Boolean bool3 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V13, bool3)) {
                                            AppCompatImageView appCompatImageView18 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView18 != null) {
                                                appCompatImageView18.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView19 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView19 == null) {
                                                i17 = R.id.profileBottomSheetLockedText;
                                                i16 = 0;
                                            } else {
                                                i16 = 0;
                                                appCompatImageView19.setVisibility(0);
                                                i17 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView7 = (RobertoTextView) this$0.u0(i17);
                                            if (robertoTextView7 != null) {
                                                robertoTextView7.setVisibility(i16);
                                            }
                                            AppCompatImageView appCompatImageView20 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView20 != null) {
                                                appCompatImageView20.setVisibility(i16);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView21 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView21 != null) {
                                                appCompatImageView21.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView22 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView22 == null) {
                                                i15 = R.id.profileBottomSheetLockedText;
                                                i14 = 8;
                                            } else {
                                                i14 = 8;
                                                appCompatImageView22.setVisibility(8);
                                                i15 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView8 = (RobertoTextView) this$0.u0(i15);
                                            if (robertoTextView8 != null) {
                                                robertoTextView8.setVisibility(i14);
                                            }
                                            AppCompatImageView appCompatImageView23 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView23 != null) {
                                                appCompatImageView23.setVisibility(i14);
                                            }
                                        }
                                        String str3 = gk.a.f16573a;
                                        Bundle bundle2 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(1, it2), bool3)) {
                                            str = "unlocked";
                                        }
                                        bundle2.putString("status", str);
                                        bundle2.putString("badge_name", "Happiness Maker");
                                        bundle2.putString("variant", "new");
                                        hs.k kVar2 = hs.k.f19476a;
                                        gk.a.b(bundle2, "profile_badge_click");
                                        return;
                                    } catch (Exception e11) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e11);
                                        return;
                                    }
                                case 2:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView24 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView24 != null) {
                                            appCompatImageView24.setImageResource(R.drawable.ir_badge_schedule_activity_new);
                                        }
                                        RobertoTextView robertoTextView9 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView9 != null) {
                                            robertoTextView9.setText(this$0.getString(R.string.profileNewHappinessBadgeHappyCamper));
                                        }
                                        RobertoTextView robertoTextView10 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView10 != null) {
                                            robertoTextView10.setText(this$0.getString(R.string.profileNewHappinessBadgeHappyCamperDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u04 = this$0.u0(R.id.blanketView);
                                        if (u04 != null) {
                                            u04.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V14 = is.k.V1(2, it2);
                                        Boolean bool4 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V14, bool4)) {
                                            AppCompatImageView appCompatImageView25 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView25 != null) {
                                                appCompatImageView25.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView26 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView26 == null) {
                                                i21 = R.id.profileBottomSheetLockedText;
                                                i20 = 0;
                                            } else {
                                                i20 = 0;
                                                appCompatImageView26.setVisibility(0);
                                                i21 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView11 = (RobertoTextView) this$0.u0(i21);
                                            if (robertoTextView11 != null) {
                                                robertoTextView11.setVisibility(i20);
                                            }
                                            AppCompatImageView appCompatImageView27 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView27 != null) {
                                                appCompatImageView27.setVisibility(i20);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView28 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView28 != null) {
                                                appCompatImageView28.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView29 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView29 == null) {
                                                i19 = R.id.profileBottomSheetLockedText;
                                                i18 = 8;
                                            } else {
                                                i18 = 8;
                                                appCompatImageView29.setVisibility(8);
                                                i19 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView12 = (RobertoTextView) this$0.u0(i19);
                                            if (robertoTextView12 != null) {
                                                robertoTextView12.setVisibility(i18);
                                            }
                                            AppCompatImageView appCompatImageView30 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView30 != null) {
                                                appCompatImageView30.setVisibility(i18);
                                            }
                                        }
                                        String str4 = gk.a.f16573a;
                                        Bundle bundle3 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(2, it2), bool4)) {
                                            str = "unlocked";
                                        }
                                        bundle3.putString("status", str);
                                        bundle3.putString("badge_name", "Happy Camper");
                                        bundle3.putString("variant", "new");
                                        hs.k kVar3 = hs.k.f19476a;
                                        gk.a.b(bundle3, "profile_badge_click");
                                        return;
                                    } catch (Exception e12) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e12);
                                        return;
                                    }
                                case 3:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView31 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView31 != null) {
                                            appCompatImageView31.setImageResource(R.drawable.ir_badge_500_points_new);
                                        }
                                        RobertoTextView robertoTextView13 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView13 != null) {
                                            robertoTextView13.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessNinja));
                                        }
                                        RobertoTextView robertoTextView14 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView14 != null) {
                                            robertoTextView14.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessNinjaDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u05 = this$0.u0(R.id.blanketView);
                                        if (u05 != null) {
                                            u05.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V15 = is.k.V1(3, it2);
                                        Boolean bool5 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V15, bool5)) {
                                            AppCompatImageView appCompatImageView32 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView32 != null) {
                                                appCompatImageView32.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView33 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView33 == null) {
                                                i25 = R.id.profileBottomSheetLockedText;
                                                i24 = 0;
                                            } else {
                                                i24 = 0;
                                                appCompatImageView33.setVisibility(0);
                                                i25 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView15 = (RobertoTextView) this$0.u0(i25);
                                            if (robertoTextView15 != null) {
                                                robertoTextView15.setVisibility(i24);
                                            }
                                            AppCompatImageView appCompatImageView34 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView34 != null) {
                                                appCompatImageView34.setVisibility(i24);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView35 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView35 != null) {
                                                appCompatImageView35.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView36 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView36 == null) {
                                                i23 = R.id.profileBottomSheetLockedText;
                                                i22 = 8;
                                            } else {
                                                i22 = 8;
                                                appCompatImageView36.setVisibility(8);
                                                i23 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView16 = (RobertoTextView) this$0.u0(i23);
                                            if (robertoTextView16 != null) {
                                                robertoTextView16.setVisibility(i22);
                                            }
                                            AppCompatImageView appCompatImageView37 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView37 != null) {
                                                appCompatImageView37.setVisibility(i22);
                                            }
                                        }
                                        String str5 = gk.a.f16573a;
                                        Bundle bundle4 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(3, it2), bool5)) {
                                            str = "unlocked";
                                        }
                                        bundle4.putString("status", str);
                                        bundle4.putString("badge_name", "Happiness Ninja");
                                        bundle4.putString("variant", "new");
                                        hs.k kVar4 = hs.k.f19476a;
                                        gk.a.b(bundle4, "profile_badge_click");
                                        return;
                                    } catch (Exception e13) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e13);
                                        return;
                                    }
                                case 4:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView38 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView38 != null) {
                                            appCompatImageView38.setImageResource(R.drawable.ir_badge_track_goals_week_new);
                                        }
                                        RobertoTextView robertoTextView17 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView17 != null) {
                                            robertoTextView17.setText(this$0.getString(R.string.profileNewHappinessBadgeEnduranceBuilder));
                                        }
                                        RobertoTextView robertoTextView18 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView18 != null) {
                                            robertoTextView18.setText(this$0.getString(R.string.profileNewHappinessBadgeEnduranceBuilderDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u06 = this$0.u0(R.id.blanketView);
                                        if (u06 != null) {
                                            u06.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V16 = is.k.V1(4, it2);
                                        Boolean bool6 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V16, bool6)) {
                                            AppCompatImageView appCompatImageView39 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView39 != null) {
                                                appCompatImageView39.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView40 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView40 == null) {
                                                i29 = R.id.profileBottomSheetLockedText;
                                                i28 = 0;
                                            } else {
                                                i28 = 0;
                                                appCompatImageView40.setVisibility(0);
                                                i29 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView19 = (RobertoTextView) this$0.u0(i29);
                                            if (robertoTextView19 != null) {
                                                robertoTextView19.setVisibility(i28);
                                            }
                                            AppCompatImageView appCompatImageView41 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView41 != null) {
                                                appCompatImageView41.setVisibility(i28);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView42 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView42 != null) {
                                                appCompatImageView42.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView43 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView43 == null) {
                                                i27 = R.id.profileBottomSheetLockedText;
                                                i26 = 8;
                                            } else {
                                                i26 = 8;
                                                appCompatImageView43.setVisibility(8);
                                                i27 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView20 = (RobertoTextView) this$0.u0(i27);
                                            if (robertoTextView20 != null) {
                                                robertoTextView20.setVisibility(i26);
                                            }
                                            AppCompatImageView appCompatImageView44 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView44 != null) {
                                                appCompatImageView44.setVisibility(i26);
                                            }
                                        }
                                        String str6 = gk.a.f16573a;
                                        Bundle bundle5 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(4, it2), bool6)) {
                                            str = "unlocked";
                                        }
                                        bundle5.putString("status", str);
                                        bundle5.putString("badge_name", "Endurance Builder");
                                        bundle5.putString("variant", "new");
                                        hs.k kVar5 = hs.k.f19476a;
                                        gk.a.b(bundle5, "profile_badge_click");
                                        return;
                                    } catch (Exception e14) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e14);
                                        return;
                                    }
                                case 5:
                                    a();
                                    return;
                                case 6:
                                    b();
                                    return;
                                default:
                                    c();
                                    return;
                            }
                        }
                    });
                }
                if (kotlin.jvm.internal.i.b(is.k.V1(3, it), bool) && (appCompatImageView5 = (AppCompatImageView) experimentProfileActivity.u0(R.id.badgeImage4)) != null) {
                    appCompatImageView5.setColorFilter(g0.a.b(experimentProfileActivity, R.color.title_high_contrast_54_opacity));
                }
                AppCompatImageView appCompatImageView12 = (AppCompatImageView) experimentProfileActivity.u0(R.id.badgeImage4);
                if (appCompatImageView12 != null) {
                    appCompatImageView12.setOnClickListener(new View.OnClickListener() { // from class: so.i0
                        private final void a() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_1000_points_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaestro));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaestroDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(5, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView112 != null) {
                                        appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView122 != null) {
                                        appCompatImageView122.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView13 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView13 != null) {
                                        appCompatImageView13.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView14 != null) {
                                        appCompatImageView14.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView15 != null) {
                                        appCompatImageView15.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(5, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Maestro");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        private final void b() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_go_getter_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessGoGetter));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessGoGetterDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(6, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView112 != null) {
                                        appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView122 != null) {
                                        appCompatImageView122.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView13 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView13 != null) {
                                        appCompatImageView13.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView14 != null) {
                                        appCompatImageView14.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView15 != null) {
                                        appCompatImageView15.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(6, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Go Getter");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        private final void c() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_happiness_sharer_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessSharer));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessSharerDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(7, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView112 != null) {
                                        appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView122 != null) {
                                        appCompatImageView122.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView13 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView13 != null) {
                                        appCompatImageView13.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView14 != null) {
                                        appCompatImageView14.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView15 != null) {
                                        appCompatImageView15.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(7, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Sharer");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6;
                            int i10;
                            int i11;
                            int i12;
                            int i13;
                            int i14;
                            int i15;
                            int i16;
                            int i17;
                            int i18;
                            int i19;
                            int i20;
                            int i21;
                            int i22;
                            int i23;
                            int i24;
                            int i25;
                            int i26;
                            int i27;
                            int i28;
                            int i29;
                            String str = "locked";
                            int i30 = r4;
                            n0 this_apply = n0Var;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            Boolean[] it2 = it;
                            switch (i30) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView102 != null) {
                                            appCompatImageView102.setImageResource(R.drawable.ir_badge_100_points_new);
                                        }
                                        RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView != null) {
                                            robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeCheerfulChamp));
                                        }
                                        RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView2 != null) {
                                            robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeCheerfulChampDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u02 = this$0.u0(R.id.blanketView);
                                        if (u02 == null) {
                                            i6 = 0;
                                        } else {
                                            i6 = 0;
                                            u02.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V12 = is.k.V1(i6, it2);
                                        Boolean bool2 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                            AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView112 != null) {
                                                appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView122 == null) {
                                                i13 = R.id.profileBottomSheetLockedText;
                                                i12 = 0;
                                            } else {
                                                i12 = 0;
                                                appCompatImageView122.setVisibility(0);
                                                i13 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(i13);
                                            if (robertoTextView3 != null) {
                                                robertoTextView3.setVisibility(i12);
                                            }
                                            AppCompatImageView appCompatImageView13 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView13 != null) {
                                                appCompatImageView13.setVisibility(i12);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView14 != null) {
                                                appCompatImageView14.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView15 == null) {
                                                i11 = R.id.profileBottomSheetLockedText;
                                                i10 = 8;
                                            } else {
                                                i10 = 8;
                                                appCompatImageView15.setVisibility(8);
                                                i11 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(i11);
                                            if (robertoTextView4 != null) {
                                                robertoTextView4.setVisibility(i10);
                                            }
                                            AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView16 != null) {
                                                appCompatImageView16.setVisibility(i10);
                                            }
                                        }
                                        String str2 = gk.a.f16573a;
                                        Bundle bundle = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(0, it2), bool2)) {
                                            str = "unlocked";
                                        }
                                        bundle.putString("status", str);
                                        bundle.putString("badge_name", "Cheerful Champ");
                                        bundle.putString("variant", "new");
                                        hs.k kVar = hs.k.f19476a;
                                        gk.a.b(bundle, "profile_badge_click");
                                        return;
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                                        return;
                                    }
                                case 1:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView17 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView17 != null) {
                                            appCompatImageView17.setImageResource(R.drawable.ir_badge_track_mood_new);
                                        }
                                        RobertoTextView robertoTextView5 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView5 != null) {
                                            robertoTextView5.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaker));
                                        }
                                        RobertoTextView robertoTextView6 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView6 != null) {
                                            robertoTextView6.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMakerDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u03 = this$0.u0(R.id.blanketView);
                                        if (u03 != null) {
                                            u03.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V13 = is.k.V1(1, it2);
                                        Boolean bool3 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V13, bool3)) {
                                            AppCompatImageView appCompatImageView18 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView18 != null) {
                                                appCompatImageView18.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView19 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView19 == null) {
                                                i17 = R.id.profileBottomSheetLockedText;
                                                i16 = 0;
                                            } else {
                                                i16 = 0;
                                                appCompatImageView19.setVisibility(0);
                                                i17 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView7 = (RobertoTextView) this$0.u0(i17);
                                            if (robertoTextView7 != null) {
                                                robertoTextView7.setVisibility(i16);
                                            }
                                            AppCompatImageView appCompatImageView20 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView20 != null) {
                                                appCompatImageView20.setVisibility(i16);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView21 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView21 != null) {
                                                appCompatImageView21.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView22 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView22 == null) {
                                                i15 = R.id.profileBottomSheetLockedText;
                                                i14 = 8;
                                            } else {
                                                i14 = 8;
                                                appCompatImageView22.setVisibility(8);
                                                i15 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView8 = (RobertoTextView) this$0.u0(i15);
                                            if (robertoTextView8 != null) {
                                                robertoTextView8.setVisibility(i14);
                                            }
                                            AppCompatImageView appCompatImageView23 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView23 != null) {
                                                appCompatImageView23.setVisibility(i14);
                                            }
                                        }
                                        String str3 = gk.a.f16573a;
                                        Bundle bundle2 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(1, it2), bool3)) {
                                            str = "unlocked";
                                        }
                                        bundle2.putString("status", str);
                                        bundle2.putString("badge_name", "Happiness Maker");
                                        bundle2.putString("variant", "new");
                                        hs.k kVar2 = hs.k.f19476a;
                                        gk.a.b(bundle2, "profile_badge_click");
                                        return;
                                    } catch (Exception e11) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e11);
                                        return;
                                    }
                                case 2:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView24 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView24 != null) {
                                            appCompatImageView24.setImageResource(R.drawable.ir_badge_schedule_activity_new);
                                        }
                                        RobertoTextView robertoTextView9 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView9 != null) {
                                            robertoTextView9.setText(this$0.getString(R.string.profileNewHappinessBadgeHappyCamper));
                                        }
                                        RobertoTextView robertoTextView10 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView10 != null) {
                                            robertoTextView10.setText(this$0.getString(R.string.profileNewHappinessBadgeHappyCamperDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u04 = this$0.u0(R.id.blanketView);
                                        if (u04 != null) {
                                            u04.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V14 = is.k.V1(2, it2);
                                        Boolean bool4 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V14, bool4)) {
                                            AppCompatImageView appCompatImageView25 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView25 != null) {
                                                appCompatImageView25.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView26 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView26 == null) {
                                                i21 = R.id.profileBottomSheetLockedText;
                                                i20 = 0;
                                            } else {
                                                i20 = 0;
                                                appCompatImageView26.setVisibility(0);
                                                i21 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView11 = (RobertoTextView) this$0.u0(i21);
                                            if (robertoTextView11 != null) {
                                                robertoTextView11.setVisibility(i20);
                                            }
                                            AppCompatImageView appCompatImageView27 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView27 != null) {
                                                appCompatImageView27.setVisibility(i20);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView28 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView28 != null) {
                                                appCompatImageView28.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView29 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView29 == null) {
                                                i19 = R.id.profileBottomSheetLockedText;
                                                i18 = 8;
                                            } else {
                                                i18 = 8;
                                                appCompatImageView29.setVisibility(8);
                                                i19 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView12 = (RobertoTextView) this$0.u0(i19);
                                            if (robertoTextView12 != null) {
                                                robertoTextView12.setVisibility(i18);
                                            }
                                            AppCompatImageView appCompatImageView30 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView30 != null) {
                                                appCompatImageView30.setVisibility(i18);
                                            }
                                        }
                                        String str4 = gk.a.f16573a;
                                        Bundle bundle3 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(2, it2), bool4)) {
                                            str = "unlocked";
                                        }
                                        bundle3.putString("status", str);
                                        bundle3.putString("badge_name", "Happy Camper");
                                        bundle3.putString("variant", "new");
                                        hs.k kVar3 = hs.k.f19476a;
                                        gk.a.b(bundle3, "profile_badge_click");
                                        return;
                                    } catch (Exception e12) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e12);
                                        return;
                                    }
                                case 3:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView31 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView31 != null) {
                                            appCompatImageView31.setImageResource(R.drawable.ir_badge_500_points_new);
                                        }
                                        RobertoTextView robertoTextView13 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView13 != null) {
                                            robertoTextView13.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessNinja));
                                        }
                                        RobertoTextView robertoTextView14 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView14 != null) {
                                            robertoTextView14.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessNinjaDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u05 = this$0.u0(R.id.blanketView);
                                        if (u05 != null) {
                                            u05.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V15 = is.k.V1(3, it2);
                                        Boolean bool5 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V15, bool5)) {
                                            AppCompatImageView appCompatImageView32 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView32 != null) {
                                                appCompatImageView32.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView33 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView33 == null) {
                                                i25 = R.id.profileBottomSheetLockedText;
                                                i24 = 0;
                                            } else {
                                                i24 = 0;
                                                appCompatImageView33.setVisibility(0);
                                                i25 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView15 = (RobertoTextView) this$0.u0(i25);
                                            if (robertoTextView15 != null) {
                                                robertoTextView15.setVisibility(i24);
                                            }
                                            AppCompatImageView appCompatImageView34 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView34 != null) {
                                                appCompatImageView34.setVisibility(i24);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView35 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView35 != null) {
                                                appCompatImageView35.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView36 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView36 == null) {
                                                i23 = R.id.profileBottomSheetLockedText;
                                                i22 = 8;
                                            } else {
                                                i22 = 8;
                                                appCompatImageView36.setVisibility(8);
                                                i23 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView16 = (RobertoTextView) this$0.u0(i23);
                                            if (robertoTextView16 != null) {
                                                robertoTextView16.setVisibility(i22);
                                            }
                                            AppCompatImageView appCompatImageView37 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView37 != null) {
                                                appCompatImageView37.setVisibility(i22);
                                            }
                                        }
                                        String str5 = gk.a.f16573a;
                                        Bundle bundle4 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(3, it2), bool5)) {
                                            str = "unlocked";
                                        }
                                        bundle4.putString("status", str);
                                        bundle4.putString("badge_name", "Happiness Ninja");
                                        bundle4.putString("variant", "new");
                                        hs.k kVar4 = hs.k.f19476a;
                                        gk.a.b(bundle4, "profile_badge_click");
                                        return;
                                    } catch (Exception e13) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e13);
                                        return;
                                    }
                                case 4:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView38 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView38 != null) {
                                            appCompatImageView38.setImageResource(R.drawable.ir_badge_track_goals_week_new);
                                        }
                                        RobertoTextView robertoTextView17 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView17 != null) {
                                            robertoTextView17.setText(this$0.getString(R.string.profileNewHappinessBadgeEnduranceBuilder));
                                        }
                                        RobertoTextView robertoTextView18 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView18 != null) {
                                            robertoTextView18.setText(this$0.getString(R.string.profileNewHappinessBadgeEnduranceBuilderDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u06 = this$0.u0(R.id.blanketView);
                                        if (u06 != null) {
                                            u06.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V16 = is.k.V1(4, it2);
                                        Boolean bool6 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V16, bool6)) {
                                            AppCompatImageView appCompatImageView39 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView39 != null) {
                                                appCompatImageView39.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView40 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView40 == null) {
                                                i29 = R.id.profileBottomSheetLockedText;
                                                i28 = 0;
                                            } else {
                                                i28 = 0;
                                                appCompatImageView40.setVisibility(0);
                                                i29 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView19 = (RobertoTextView) this$0.u0(i29);
                                            if (robertoTextView19 != null) {
                                                robertoTextView19.setVisibility(i28);
                                            }
                                            AppCompatImageView appCompatImageView41 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView41 != null) {
                                                appCompatImageView41.setVisibility(i28);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView42 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView42 != null) {
                                                appCompatImageView42.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView43 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView43 == null) {
                                                i27 = R.id.profileBottomSheetLockedText;
                                                i26 = 8;
                                            } else {
                                                i26 = 8;
                                                appCompatImageView43.setVisibility(8);
                                                i27 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView20 = (RobertoTextView) this$0.u0(i27);
                                            if (robertoTextView20 != null) {
                                                robertoTextView20.setVisibility(i26);
                                            }
                                            AppCompatImageView appCompatImageView44 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView44 != null) {
                                                appCompatImageView44.setVisibility(i26);
                                            }
                                        }
                                        String str6 = gk.a.f16573a;
                                        Bundle bundle5 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(4, it2), bool6)) {
                                            str = "unlocked";
                                        }
                                        bundle5.putString("status", str);
                                        bundle5.putString("badge_name", "Endurance Builder");
                                        bundle5.putString("variant", "new");
                                        hs.k kVar5 = hs.k.f19476a;
                                        gk.a.b(bundle5, "profile_badge_click");
                                        return;
                                    } catch (Exception e14) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e14);
                                        return;
                                    }
                                case 5:
                                    a();
                                    return;
                                case 6:
                                    b();
                                    return;
                                default:
                                    c();
                                    return;
                            }
                        }
                    });
                }
                if (kotlin.jvm.internal.i.b(is.k.V1(4, it), bool) && (appCompatImageView4 = (AppCompatImageView) experimentProfileActivity.u0(R.id.badgeImage5)) != null) {
                    appCompatImageView4.setColorFilter(g0.a.b(experimentProfileActivity, R.color.title_high_contrast_54_opacity));
                }
                AppCompatImageView appCompatImageView13 = (AppCompatImageView) experimentProfileActivity.u0(R.id.badgeImage5);
                if (appCompatImageView13 != null) {
                    appCompatImageView13.setOnClickListener(new View.OnClickListener() { // from class: so.i0
                        private final void a() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_1000_points_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaestro));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaestroDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(5, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView112 != null) {
                                        appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView122 != null) {
                                        appCompatImageView122.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView132 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView132 != null) {
                                        appCompatImageView132.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView14 != null) {
                                        appCompatImageView14.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView15 != null) {
                                        appCompatImageView15.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(5, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Maestro");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        private final void b() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_go_getter_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessGoGetter));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessGoGetterDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(6, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView112 != null) {
                                        appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView122 != null) {
                                        appCompatImageView122.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView132 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView132 != null) {
                                        appCompatImageView132.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView14 != null) {
                                        appCompatImageView14.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView15 != null) {
                                        appCompatImageView15.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(6, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Go Getter");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        private final void c() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_happiness_sharer_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessSharer));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessSharerDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(7, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView112 != null) {
                                        appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView122 != null) {
                                        appCompatImageView122.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView132 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView132 != null) {
                                        appCompatImageView132.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView14 != null) {
                                        appCompatImageView14.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView15 != null) {
                                        appCompatImageView15.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(7, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Sharer");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6;
                            int i10;
                            int i11;
                            int i12;
                            int i13;
                            int i14;
                            int i15;
                            int i16;
                            int i17;
                            int i18;
                            int i19;
                            int i20;
                            int i21;
                            int i22;
                            int i23;
                            int i24;
                            int i25;
                            int i26;
                            int i27;
                            int i28;
                            int i29;
                            String str = "locked";
                            int i30 = r4;
                            n0 this_apply = n0Var;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            Boolean[] it2 = it;
                            switch (i30) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView102 != null) {
                                            appCompatImageView102.setImageResource(R.drawable.ir_badge_100_points_new);
                                        }
                                        RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView != null) {
                                            robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeCheerfulChamp));
                                        }
                                        RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView2 != null) {
                                            robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeCheerfulChampDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u02 = this$0.u0(R.id.blanketView);
                                        if (u02 == null) {
                                            i6 = 0;
                                        } else {
                                            i6 = 0;
                                            u02.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V12 = is.k.V1(i6, it2);
                                        Boolean bool2 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                            AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView112 != null) {
                                                appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView122 == null) {
                                                i13 = R.id.profileBottomSheetLockedText;
                                                i12 = 0;
                                            } else {
                                                i12 = 0;
                                                appCompatImageView122.setVisibility(0);
                                                i13 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(i13);
                                            if (robertoTextView3 != null) {
                                                robertoTextView3.setVisibility(i12);
                                            }
                                            AppCompatImageView appCompatImageView132 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView132 != null) {
                                                appCompatImageView132.setVisibility(i12);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView14 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView14 != null) {
                                                appCompatImageView14.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView15 == null) {
                                                i11 = R.id.profileBottomSheetLockedText;
                                                i10 = 8;
                                            } else {
                                                i10 = 8;
                                                appCompatImageView15.setVisibility(8);
                                                i11 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(i11);
                                            if (robertoTextView4 != null) {
                                                robertoTextView4.setVisibility(i10);
                                            }
                                            AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView16 != null) {
                                                appCompatImageView16.setVisibility(i10);
                                            }
                                        }
                                        String str2 = gk.a.f16573a;
                                        Bundle bundle = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(0, it2), bool2)) {
                                            str = "unlocked";
                                        }
                                        bundle.putString("status", str);
                                        bundle.putString("badge_name", "Cheerful Champ");
                                        bundle.putString("variant", "new");
                                        hs.k kVar = hs.k.f19476a;
                                        gk.a.b(bundle, "profile_badge_click");
                                        return;
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                                        return;
                                    }
                                case 1:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView17 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView17 != null) {
                                            appCompatImageView17.setImageResource(R.drawable.ir_badge_track_mood_new);
                                        }
                                        RobertoTextView robertoTextView5 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView5 != null) {
                                            robertoTextView5.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaker));
                                        }
                                        RobertoTextView robertoTextView6 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView6 != null) {
                                            robertoTextView6.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMakerDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u03 = this$0.u0(R.id.blanketView);
                                        if (u03 != null) {
                                            u03.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V13 = is.k.V1(1, it2);
                                        Boolean bool3 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V13, bool3)) {
                                            AppCompatImageView appCompatImageView18 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView18 != null) {
                                                appCompatImageView18.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView19 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView19 == null) {
                                                i17 = R.id.profileBottomSheetLockedText;
                                                i16 = 0;
                                            } else {
                                                i16 = 0;
                                                appCompatImageView19.setVisibility(0);
                                                i17 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView7 = (RobertoTextView) this$0.u0(i17);
                                            if (robertoTextView7 != null) {
                                                robertoTextView7.setVisibility(i16);
                                            }
                                            AppCompatImageView appCompatImageView20 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView20 != null) {
                                                appCompatImageView20.setVisibility(i16);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView21 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView21 != null) {
                                                appCompatImageView21.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView22 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView22 == null) {
                                                i15 = R.id.profileBottomSheetLockedText;
                                                i14 = 8;
                                            } else {
                                                i14 = 8;
                                                appCompatImageView22.setVisibility(8);
                                                i15 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView8 = (RobertoTextView) this$0.u0(i15);
                                            if (robertoTextView8 != null) {
                                                robertoTextView8.setVisibility(i14);
                                            }
                                            AppCompatImageView appCompatImageView23 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView23 != null) {
                                                appCompatImageView23.setVisibility(i14);
                                            }
                                        }
                                        String str3 = gk.a.f16573a;
                                        Bundle bundle2 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(1, it2), bool3)) {
                                            str = "unlocked";
                                        }
                                        bundle2.putString("status", str);
                                        bundle2.putString("badge_name", "Happiness Maker");
                                        bundle2.putString("variant", "new");
                                        hs.k kVar2 = hs.k.f19476a;
                                        gk.a.b(bundle2, "profile_badge_click");
                                        return;
                                    } catch (Exception e11) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e11);
                                        return;
                                    }
                                case 2:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView24 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView24 != null) {
                                            appCompatImageView24.setImageResource(R.drawable.ir_badge_schedule_activity_new);
                                        }
                                        RobertoTextView robertoTextView9 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView9 != null) {
                                            robertoTextView9.setText(this$0.getString(R.string.profileNewHappinessBadgeHappyCamper));
                                        }
                                        RobertoTextView robertoTextView10 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView10 != null) {
                                            robertoTextView10.setText(this$0.getString(R.string.profileNewHappinessBadgeHappyCamperDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u04 = this$0.u0(R.id.blanketView);
                                        if (u04 != null) {
                                            u04.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V14 = is.k.V1(2, it2);
                                        Boolean bool4 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V14, bool4)) {
                                            AppCompatImageView appCompatImageView25 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView25 != null) {
                                                appCompatImageView25.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView26 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView26 == null) {
                                                i21 = R.id.profileBottomSheetLockedText;
                                                i20 = 0;
                                            } else {
                                                i20 = 0;
                                                appCompatImageView26.setVisibility(0);
                                                i21 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView11 = (RobertoTextView) this$0.u0(i21);
                                            if (robertoTextView11 != null) {
                                                robertoTextView11.setVisibility(i20);
                                            }
                                            AppCompatImageView appCompatImageView27 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView27 != null) {
                                                appCompatImageView27.setVisibility(i20);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView28 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView28 != null) {
                                                appCompatImageView28.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView29 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView29 == null) {
                                                i19 = R.id.profileBottomSheetLockedText;
                                                i18 = 8;
                                            } else {
                                                i18 = 8;
                                                appCompatImageView29.setVisibility(8);
                                                i19 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView12 = (RobertoTextView) this$0.u0(i19);
                                            if (robertoTextView12 != null) {
                                                robertoTextView12.setVisibility(i18);
                                            }
                                            AppCompatImageView appCompatImageView30 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView30 != null) {
                                                appCompatImageView30.setVisibility(i18);
                                            }
                                        }
                                        String str4 = gk.a.f16573a;
                                        Bundle bundle3 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(2, it2), bool4)) {
                                            str = "unlocked";
                                        }
                                        bundle3.putString("status", str);
                                        bundle3.putString("badge_name", "Happy Camper");
                                        bundle3.putString("variant", "new");
                                        hs.k kVar3 = hs.k.f19476a;
                                        gk.a.b(bundle3, "profile_badge_click");
                                        return;
                                    } catch (Exception e12) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e12);
                                        return;
                                    }
                                case 3:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView31 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView31 != null) {
                                            appCompatImageView31.setImageResource(R.drawable.ir_badge_500_points_new);
                                        }
                                        RobertoTextView robertoTextView13 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView13 != null) {
                                            robertoTextView13.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessNinja));
                                        }
                                        RobertoTextView robertoTextView14 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView14 != null) {
                                            robertoTextView14.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessNinjaDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u05 = this$0.u0(R.id.blanketView);
                                        if (u05 != null) {
                                            u05.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V15 = is.k.V1(3, it2);
                                        Boolean bool5 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V15, bool5)) {
                                            AppCompatImageView appCompatImageView32 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView32 != null) {
                                                appCompatImageView32.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView33 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView33 == null) {
                                                i25 = R.id.profileBottomSheetLockedText;
                                                i24 = 0;
                                            } else {
                                                i24 = 0;
                                                appCompatImageView33.setVisibility(0);
                                                i25 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView15 = (RobertoTextView) this$0.u0(i25);
                                            if (robertoTextView15 != null) {
                                                robertoTextView15.setVisibility(i24);
                                            }
                                            AppCompatImageView appCompatImageView34 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView34 != null) {
                                                appCompatImageView34.setVisibility(i24);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView35 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView35 != null) {
                                                appCompatImageView35.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView36 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView36 == null) {
                                                i23 = R.id.profileBottomSheetLockedText;
                                                i22 = 8;
                                            } else {
                                                i22 = 8;
                                                appCompatImageView36.setVisibility(8);
                                                i23 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView16 = (RobertoTextView) this$0.u0(i23);
                                            if (robertoTextView16 != null) {
                                                robertoTextView16.setVisibility(i22);
                                            }
                                            AppCompatImageView appCompatImageView37 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView37 != null) {
                                                appCompatImageView37.setVisibility(i22);
                                            }
                                        }
                                        String str5 = gk.a.f16573a;
                                        Bundle bundle4 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(3, it2), bool5)) {
                                            str = "unlocked";
                                        }
                                        bundle4.putString("status", str);
                                        bundle4.putString("badge_name", "Happiness Ninja");
                                        bundle4.putString("variant", "new");
                                        hs.k kVar4 = hs.k.f19476a;
                                        gk.a.b(bundle4, "profile_badge_click");
                                        return;
                                    } catch (Exception e13) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e13);
                                        return;
                                    }
                                case 4:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView38 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView38 != null) {
                                            appCompatImageView38.setImageResource(R.drawable.ir_badge_track_goals_week_new);
                                        }
                                        RobertoTextView robertoTextView17 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView17 != null) {
                                            robertoTextView17.setText(this$0.getString(R.string.profileNewHappinessBadgeEnduranceBuilder));
                                        }
                                        RobertoTextView robertoTextView18 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView18 != null) {
                                            robertoTextView18.setText(this$0.getString(R.string.profileNewHappinessBadgeEnduranceBuilderDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u06 = this$0.u0(R.id.blanketView);
                                        if (u06 != null) {
                                            u06.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V16 = is.k.V1(4, it2);
                                        Boolean bool6 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V16, bool6)) {
                                            AppCompatImageView appCompatImageView39 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView39 != null) {
                                                appCompatImageView39.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView40 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView40 == null) {
                                                i29 = R.id.profileBottomSheetLockedText;
                                                i28 = 0;
                                            } else {
                                                i28 = 0;
                                                appCompatImageView40.setVisibility(0);
                                                i29 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView19 = (RobertoTextView) this$0.u0(i29);
                                            if (robertoTextView19 != null) {
                                                robertoTextView19.setVisibility(i28);
                                            }
                                            AppCompatImageView appCompatImageView41 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView41 != null) {
                                                appCompatImageView41.setVisibility(i28);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView42 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView42 != null) {
                                                appCompatImageView42.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView43 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView43 == null) {
                                                i27 = R.id.profileBottomSheetLockedText;
                                                i26 = 8;
                                            } else {
                                                i26 = 8;
                                                appCompatImageView43.setVisibility(8);
                                                i27 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView20 = (RobertoTextView) this$0.u0(i27);
                                            if (robertoTextView20 != null) {
                                                robertoTextView20.setVisibility(i26);
                                            }
                                            AppCompatImageView appCompatImageView44 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView44 != null) {
                                                appCompatImageView44.setVisibility(i26);
                                            }
                                        }
                                        String str6 = gk.a.f16573a;
                                        Bundle bundle5 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(4, it2), bool6)) {
                                            str = "unlocked";
                                        }
                                        bundle5.putString("status", str);
                                        bundle5.putString("badge_name", "Endurance Builder");
                                        bundle5.putString("variant", "new");
                                        hs.k kVar5 = hs.k.f19476a;
                                        gk.a.b(bundle5, "profile_badge_click");
                                        return;
                                    } catch (Exception e14) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e14);
                                        return;
                                    }
                                case 5:
                                    a();
                                    return;
                                case 6:
                                    b();
                                    return;
                                default:
                                    c();
                                    return;
                            }
                        }
                    });
                }
                if (kotlin.jvm.internal.i.b(is.k.V1(5, it), bool) && (appCompatImageView3 = (AppCompatImageView) experimentProfileActivity.u0(R.id.badgeImage6)) != null) {
                    appCompatImageView3.setColorFilter(g0.a.b(experimentProfileActivity, R.color.title_high_contrast_54_opacity));
                }
                AppCompatImageView appCompatImageView14 = (AppCompatImageView) experimentProfileActivity.u0(R.id.badgeImage6);
                if (appCompatImageView14 != null) {
                    appCompatImageView14.setOnClickListener(new View.OnClickListener() { // from class: so.i0
                        private final void a() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_1000_points_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaestro));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaestroDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(5, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView112 != null) {
                                        appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView122 != null) {
                                        appCompatImageView122.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView132 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView132 != null) {
                                        appCompatImageView132.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView142 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView142 != null) {
                                        appCompatImageView142.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView15 != null) {
                                        appCompatImageView15.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(5, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Maestro");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        private final void b() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_go_getter_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessGoGetter));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessGoGetterDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(6, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView112 != null) {
                                        appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView122 != null) {
                                        appCompatImageView122.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView132 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView132 != null) {
                                        appCompatImageView132.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView142 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView142 != null) {
                                        appCompatImageView142.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView15 != null) {
                                        appCompatImageView15.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(6, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Go Getter");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        private final void c() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_happiness_sharer_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessSharer));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessSharerDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(7, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView112 != null) {
                                        appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView122 != null) {
                                        appCompatImageView122.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView132 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView132 != null) {
                                        appCompatImageView132.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView142 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView142 != null) {
                                        appCompatImageView142.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView15 != null) {
                                        appCompatImageView15.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(7, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Sharer");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6;
                            int i10;
                            int i11;
                            int i12;
                            int i13;
                            int i14;
                            int i15;
                            int i16;
                            int i17;
                            int i18;
                            int i19;
                            int i20;
                            int i21;
                            int i22;
                            int i23;
                            int i24;
                            int i25;
                            int i26;
                            int i27;
                            int i28;
                            int i29;
                            String str = "locked";
                            int i30 = r4;
                            n0 this_apply = n0Var;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            Boolean[] it2 = it;
                            switch (i30) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView102 != null) {
                                            appCompatImageView102.setImageResource(R.drawable.ir_badge_100_points_new);
                                        }
                                        RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView != null) {
                                            robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeCheerfulChamp));
                                        }
                                        RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView2 != null) {
                                            robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeCheerfulChampDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u02 = this$0.u0(R.id.blanketView);
                                        if (u02 == null) {
                                            i6 = 0;
                                        } else {
                                            i6 = 0;
                                            u02.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V12 = is.k.V1(i6, it2);
                                        Boolean bool2 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                            AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView112 != null) {
                                                appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView122 == null) {
                                                i13 = R.id.profileBottomSheetLockedText;
                                                i12 = 0;
                                            } else {
                                                i12 = 0;
                                                appCompatImageView122.setVisibility(0);
                                                i13 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(i13);
                                            if (robertoTextView3 != null) {
                                                robertoTextView3.setVisibility(i12);
                                            }
                                            AppCompatImageView appCompatImageView132 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView132 != null) {
                                                appCompatImageView132.setVisibility(i12);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView142 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView142 != null) {
                                                appCompatImageView142.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView15 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView15 == null) {
                                                i11 = R.id.profileBottomSheetLockedText;
                                                i10 = 8;
                                            } else {
                                                i10 = 8;
                                                appCompatImageView15.setVisibility(8);
                                                i11 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(i11);
                                            if (robertoTextView4 != null) {
                                                robertoTextView4.setVisibility(i10);
                                            }
                                            AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView16 != null) {
                                                appCompatImageView16.setVisibility(i10);
                                            }
                                        }
                                        String str2 = gk.a.f16573a;
                                        Bundle bundle = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(0, it2), bool2)) {
                                            str = "unlocked";
                                        }
                                        bundle.putString("status", str);
                                        bundle.putString("badge_name", "Cheerful Champ");
                                        bundle.putString("variant", "new");
                                        hs.k kVar = hs.k.f19476a;
                                        gk.a.b(bundle, "profile_badge_click");
                                        return;
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                                        return;
                                    }
                                case 1:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView17 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView17 != null) {
                                            appCompatImageView17.setImageResource(R.drawable.ir_badge_track_mood_new);
                                        }
                                        RobertoTextView robertoTextView5 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView5 != null) {
                                            robertoTextView5.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaker));
                                        }
                                        RobertoTextView robertoTextView6 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView6 != null) {
                                            robertoTextView6.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMakerDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u03 = this$0.u0(R.id.blanketView);
                                        if (u03 != null) {
                                            u03.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V13 = is.k.V1(1, it2);
                                        Boolean bool3 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V13, bool3)) {
                                            AppCompatImageView appCompatImageView18 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView18 != null) {
                                                appCompatImageView18.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView19 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView19 == null) {
                                                i17 = R.id.profileBottomSheetLockedText;
                                                i16 = 0;
                                            } else {
                                                i16 = 0;
                                                appCompatImageView19.setVisibility(0);
                                                i17 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView7 = (RobertoTextView) this$0.u0(i17);
                                            if (robertoTextView7 != null) {
                                                robertoTextView7.setVisibility(i16);
                                            }
                                            AppCompatImageView appCompatImageView20 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView20 != null) {
                                                appCompatImageView20.setVisibility(i16);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView21 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView21 != null) {
                                                appCompatImageView21.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView22 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView22 == null) {
                                                i15 = R.id.profileBottomSheetLockedText;
                                                i14 = 8;
                                            } else {
                                                i14 = 8;
                                                appCompatImageView22.setVisibility(8);
                                                i15 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView8 = (RobertoTextView) this$0.u0(i15);
                                            if (robertoTextView8 != null) {
                                                robertoTextView8.setVisibility(i14);
                                            }
                                            AppCompatImageView appCompatImageView23 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView23 != null) {
                                                appCompatImageView23.setVisibility(i14);
                                            }
                                        }
                                        String str3 = gk.a.f16573a;
                                        Bundle bundle2 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(1, it2), bool3)) {
                                            str = "unlocked";
                                        }
                                        bundle2.putString("status", str);
                                        bundle2.putString("badge_name", "Happiness Maker");
                                        bundle2.putString("variant", "new");
                                        hs.k kVar2 = hs.k.f19476a;
                                        gk.a.b(bundle2, "profile_badge_click");
                                        return;
                                    } catch (Exception e11) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e11);
                                        return;
                                    }
                                case 2:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView24 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView24 != null) {
                                            appCompatImageView24.setImageResource(R.drawable.ir_badge_schedule_activity_new);
                                        }
                                        RobertoTextView robertoTextView9 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView9 != null) {
                                            robertoTextView9.setText(this$0.getString(R.string.profileNewHappinessBadgeHappyCamper));
                                        }
                                        RobertoTextView robertoTextView10 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView10 != null) {
                                            robertoTextView10.setText(this$0.getString(R.string.profileNewHappinessBadgeHappyCamperDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u04 = this$0.u0(R.id.blanketView);
                                        if (u04 != null) {
                                            u04.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V14 = is.k.V1(2, it2);
                                        Boolean bool4 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V14, bool4)) {
                                            AppCompatImageView appCompatImageView25 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView25 != null) {
                                                appCompatImageView25.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView26 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView26 == null) {
                                                i21 = R.id.profileBottomSheetLockedText;
                                                i20 = 0;
                                            } else {
                                                i20 = 0;
                                                appCompatImageView26.setVisibility(0);
                                                i21 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView11 = (RobertoTextView) this$0.u0(i21);
                                            if (robertoTextView11 != null) {
                                                robertoTextView11.setVisibility(i20);
                                            }
                                            AppCompatImageView appCompatImageView27 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView27 != null) {
                                                appCompatImageView27.setVisibility(i20);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView28 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView28 != null) {
                                                appCompatImageView28.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView29 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView29 == null) {
                                                i19 = R.id.profileBottomSheetLockedText;
                                                i18 = 8;
                                            } else {
                                                i18 = 8;
                                                appCompatImageView29.setVisibility(8);
                                                i19 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView12 = (RobertoTextView) this$0.u0(i19);
                                            if (robertoTextView12 != null) {
                                                robertoTextView12.setVisibility(i18);
                                            }
                                            AppCompatImageView appCompatImageView30 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView30 != null) {
                                                appCompatImageView30.setVisibility(i18);
                                            }
                                        }
                                        String str4 = gk.a.f16573a;
                                        Bundle bundle3 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(2, it2), bool4)) {
                                            str = "unlocked";
                                        }
                                        bundle3.putString("status", str);
                                        bundle3.putString("badge_name", "Happy Camper");
                                        bundle3.putString("variant", "new");
                                        hs.k kVar3 = hs.k.f19476a;
                                        gk.a.b(bundle3, "profile_badge_click");
                                        return;
                                    } catch (Exception e12) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e12);
                                        return;
                                    }
                                case 3:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView31 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView31 != null) {
                                            appCompatImageView31.setImageResource(R.drawable.ir_badge_500_points_new);
                                        }
                                        RobertoTextView robertoTextView13 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView13 != null) {
                                            robertoTextView13.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessNinja));
                                        }
                                        RobertoTextView robertoTextView14 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView14 != null) {
                                            robertoTextView14.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessNinjaDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u05 = this$0.u0(R.id.blanketView);
                                        if (u05 != null) {
                                            u05.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V15 = is.k.V1(3, it2);
                                        Boolean bool5 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V15, bool5)) {
                                            AppCompatImageView appCompatImageView32 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView32 != null) {
                                                appCompatImageView32.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView33 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView33 == null) {
                                                i25 = R.id.profileBottomSheetLockedText;
                                                i24 = 0;
                                            } else {
                                                i24 = 0;
                                                appCompatImageView33.setVisibility(0);
                                                i25 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView15 = (RobertoTextView) this$0.u0(i25);
                                            if (robertoTextView15 != null) {
                                                robertoTextView15.setVisibility(i24);
                                            }
                                            AppCompatImageView appCompatImageView34 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView34 != null) {
                                                appCompatImageView34.setVisibility(i24);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView35 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView35 != null) {
                                                appCompatImageView35.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView36 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView36 == null) {
                                                i23 = R.id.profileBottomSheetLockedText;
                                                i22 = 8;
                                            } else {
                                                i22 = 8;
                                                appCompatImageView36.setVisibility(8);
                                                i23 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView16 = (RobertoTextView) this$0.u0(i23);
                                            if (robertoTextView16 != null) {
                                                robertoTextView16.setVisibility(i22);
                                            }
                                            AppCompatImageView appCompatImageView37 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView37 != null) {
                                                appCompatImageView37.setVisibility(i22);
                                            }
                                        }
                                        String str5 = gk.a.f16573a;
                                        Bundle bundle4 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(3, it2), bool5)) {
                                            str = "unlocked";
                                        }
                                        bundle4.putString("status", str);
                                        bundle4.putString("badge_name", "Happiness Ninja");
                                        bundle4.putString("variant", "new");
                                        hs.k kVar4 = hs.k.f19476a;
                                        gk.a.b(bundle4, "profile_badge_click");
                                        return;
                                    } catch (Exception e13) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e13);
                                        return;
                                    }
                                case 4:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView38 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView38 != null) {
                                            appCompatImageView38.setImageResource(R.drawable.ir_badge_track_goals_week_new);
                                        }
                                        RobertoTextView robertoTextView17 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView17 != null) {
                                            robertoTextView17.setText(this$0.getString(R.string.profileNewHappinessBadgeEnduranceBuilder));
                                        }
                                        RobertoTextView robertoTextView18 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView18 != null) {
                                            robertoTextView18.setText(this$0.getString(R.string.profileNewHappinessBadgeEnduranceBuilderDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u06 = this$0.u0(R.id.blanketView);
                                        if (u06 != null) {
                                            u06.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V16 = is.k.V1(4, it2);
                                        Boolean bool6 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V16, bool6)) {
                                            AppCompatImageView appCompatImageView39 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView39 != null) {
                                                appCompatImageView39.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView40 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView40 == null) {
                                                i29 = R.id.profileBottomSheetLockedText;
                                                i28 = 0;
                                            } else {
                                                i28 = 0;
                                                appCompatImageView40.setVisibility(0);
                                                i29 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView19 = (RobertoTextView) this$0.u0(i29);
                                            if (robertoTextView19 != null) {
                                                robertoTextView19.setVisibility(i28);
                                            }
                                            AppCompatImageView appCompatImageView41 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView41 != null) {
                                                appCompatImageView41.setVisibility(i28);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView42 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView42 != null) {
                                                appCompatImageView42.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView43 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView43 == null) {
                                                i27 = R.id.profileBottomSheetLockedText;
                                                i26 = 8;
                                            } else {
                                                i26 = 8;
                                                appCompatImageView43.setVisibility(8);
                                                i27 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView20 = (RobertoTextView) this$0.u0(i27);
                                            if (robertoTextView20 != null) {
                                                robertoTextView20.setVisibility(i26);
                                            }
                                            AppCompatImageView appCompatImageView44 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView44 != null) {
                                                appCompatImageView44.setVisibility(i26);
                                            }
                                        }
                                        String str6 = gk.a.f16573a;
                                        Bundle bundle5 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(4, it2), bool6)) {
                                            str = "unlocked";
                                        }
                                        bundle5.putString("status", str);
                                        bundle5.putString("badge_name", "Endurance Builder");
                                        bundle5.putString("variant", "new");
                                        hs.k kVar5 = hs.k.f19476a;
                                        gk.a.b(bundle5, "profile_badge_click");
                                        return;
                                    } catch (Exception e14) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e14);
                                        return;
                                    }
                                case 5:
                                    a();
                                    return;
                                case 6:
                                    b();
                                    return;
                                default:
                                    c();
                                    return;
                            }
                        }
                    });
                }
                if (kotlin.jvm.internal.i.b(is.k.V1(6, it), bool) && (appCompatImageView2 = (AppCompatImageView) experimentProfileActivity.u0(R.id.badgeImage7)) != null) {
                    appCompatImageView2.setColorFilter(g0.a.b(experimentProfileActivity, R.color.title_high_contrast_54_opacity));
                }
                AppCompatImageView appCompatImageView15 = (AppCompatImageView) experimentProfileActivity.u0(R.id.badgeImage7);
                if (appCompatImageView15 != null) {
                    appCompatImageView15.setOnClickListener(new View.OnClickListener() { // from class: so.i0
                        private final void a() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_1000_points_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaestro));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaestroDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(5, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView112 != null) {
                                        appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView122 != null) {
                                        appCompatImageView122.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView132 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView132 != null) {
                                        appCompatImageView132.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView142 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView142 != null) {
                                        appCompatImageView142.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView152 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView152 != null) {
                                        appCompatImageView152.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(5, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Maestro");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        private final void b() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_go_getter_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessGoGetter));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessGoGetterDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(6, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView112 != null) {
                                        appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView122 != null) {
                                        appCompatImageView122.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView132 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView132 != null) {
                                        appCompatImageView132.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView142 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView142 != null) {
                                        appCompatImageView142.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView152 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView152 != null) {
                                        appCompatImageView152.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(6, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Go Getter");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        private final void c() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_happiness_sharer_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessSharer));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessSharerDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(7, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView112 != null) {
                                        appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView122 != null) {
                                        appCompatImageView122.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView132 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView132 != null) {
                                        appCompatImageView132.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView142 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView142 != null) {
                                        appCompatImageView142.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView152 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView152 != null) {
                                        appCompatImageView152.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView16 != null) {
                                        appCompatImageView16.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(7, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Sharer");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6;
                            int i10;
                            int i11;
                            int i12;
                            int i13;
                            int i14;
                            int i15;
                            int i16;
                            int i17;
                            int i18;
                            int i19;
                            int i20;
                            int i21;
                            int i22;
                            int i23;
                            int i24;
                            int i25;
                            int i26;
                            int i27;
                            int i28;
                            int i29;
                            String str = "locked";
                            int i30 = r4;
                            n0 this_apply = n0Var;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            Boolean[] it2 = it;
                            switch (i30) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView102 != null) {
                                            appCompatImageView102.setImageResource(R.drawable.ir_badge_100_points_new);
                                        }
                                        RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView != null) {
                                            robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeCheerfulChamp));
                                        }
                                        RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView2 != null) {
                                            robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeCheerfulChampDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u02 = this$0.u0(R.id.blanketView);
                                        if (u02 == null) {
                                            i6 = 0;
                                        } else {
                                            i6 = 0;
                                            u02.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V12 = is.k.V1(i6, it2);
                                        Boolean bool2 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                            AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView112 != null) {
                                                appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView122 == null) {
                                                i13 = R.id.profileBottomSheetLockedText;
                                                i12 = 0;
                                            } else {
                                                i12 = 0;
                                                appCompatImageView122.setVisibility(0);
                                                i13 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(i13);
                                            if (robertoTextView3 != null) {
                                                robertoTextView3.setVisibility(i12);
                                            }
                                            AppCompatImageView appCompatImageView132 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView132 != null) {
                                                appCompatImageView132.setVisibility(i12);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView142 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView142 != null) {
                                                appCompatImageView142.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView152 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView152 == null) {
                                                i11 = R.id.profileBottomSheetLockedText;
                                                i10 = 8;
                                            } else {
                                                i10 = 8;
                                                appCompatImageView152.setVisibility(8);
                                                i11 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(i11);
                                            if (robertoTextView4 != null) {
                                                robertoTextView4.setVisibility(i10);
                                            }
                                            AppCompatImageView appCompatImageView16 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView16 != null) {
                                                appCompatImageView16.setVisibility(i10);
                                            }
                                        }
                                        String str2 = gk.a.f16573a;
                                        Bundle bundle = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(0, it2), bool2)) {
                                            str = "unlocked";
                                        }
                                        bundle.putString("status", str);
                                        bundle.putString("badge_name", "Cheerful Champ");
                                        bundle.putString("variant", "new");
                                        hs.k kVar = hs.k.f19476a;
                                        gk.a.b(bundle, "profile_badge_click");
                                        return;
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                                        return;
                                    }
                                case 1:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView17 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView17 != null) {
                                            appCompatImageView17.setImageResource(R.drawable.ir_badge_track_mood_new);
                                        }
                                        RobertoTextView robertoTextView5 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView5 != null) {
                                            robertoTextView5.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaker));
                                        }
                                        RobertoTextView robertoTextView6 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView6 != null) {
                                            robertoTextView6.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMakerDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u03 = this$0.u0(R.id.blanketView);
                                        if (u03 != null) {
                                            u03.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V13 = is.k.V1(1, it2);
                                        Boolean bool3 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V13, bool3)) {
                                            AppCompatImageView appCompatImageView18 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView18 != null) {
                                                appCompatImageView18.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView19 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView19 == null) {
                                                i17 = R.id.profileBottomSheetLockedText;
                                                i16 = 0;
                                            } else {
                                                i16 = 0;
                                                appCompatImageView19.setVisibility(0);
                                                i17 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView7 = (RobertoTextView) this$0.u0(i17);
                                            if (robertoTextView7 != null) {
                                                robertoTextView7.setVisibility(i16);
                                            }
                                            AppCompatImageView appCompatImageView20 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView20 != null) {
                                                appCompatImageView20.setVisibility(i16);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView21 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView21 != null) {
                                                appCompatImageView21.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView22 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView22 == null) {
                                                i15 = R.id.profileBottomSheetLockedText;
                                                i14 = 8;
                                            } else {
                                                i14 = 8;
                                                appCompatImageView22.setVisibility(8);
                                                i15 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView8 = (RobertoTextView) this$0.u0(i15);
                                            if (robertoTextView8 != null) {
                                                robertoTextView8.setVisibility(i14);
                                            }
                                            AppCompatImageView appCompatImageView23 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView23 != null) {
                                                appCompatImageView23.setVisibility(i14);
                                            }
                                        }
                                        String str3 = gk.a.f16573a;
                                        Bundle bundle2 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(1, it2), bool3)) {
                                            str = "unlocked";
                                        }
                                        bundle2.putString("status", str);
                                        bundle2.putString("badge_name", "Happiness Maker");
                                        bundle2.putString("variant", "new");
                                        hs.k kVar2 = hs.k.f19476a;
                                        gk.a.b(bundle2, "profile_badge_click");
                                        return;
                                    } catch (Exception e11) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e11);
                                        return;
                                    }
                                case 2:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView24 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView24 != null) {
                                            appCompatImageView24.setImageResource(R.drawable.ir_badge_schedule_activity_new);
                                        }
                                        RobertoTextView robertoTextView9 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView9 != null) {
                                            robertoTextView9.setText(this$0.getString(R.string.profileNewHappinessBadgeHappyCamper));
                                        }
                                        RobertoTextView robertoTextView10 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView10 != null) {
                                            robertoTextView10.setText(this$0.getString(R.string.profileNewHappinessBadgeHappyCamperDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u04 = this$0.u0(R.id.blanketView);
                                        if (u04 != null) {
                                            u04.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V14 = is.k.V1(2, it2);
                                        Boolean bool4 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V14, bool4)) {
                                            AppCompatImageView appCompatImageView25 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView25 != null) {
                                                appCompatImageView25.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView26 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView26 == null) {
                                                i21 = R.id.profileBottomSheetLockedText;
                                                i20 = 0;
                                            } else {
                                                i20 = 0;
                                                appCompatImageView26.setVisibility(0);
                                                i21 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView11 = (RobertoTextView) this$0.u0(i21);
                                            if (robertoTextView11 != null) {
                                                robertoTextView11.setVisibility(i20);
                                            }
                                            AppCompatImageView appCompatImageView27 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView27 != null) {
                                                appCompatImageView27.setVisibility(i20);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView28 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView28 != null) {
                                                appCompatImageView28.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView29 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView29 == null) {
                                                i19 = R.id.profileBottomSheetLockedText;
                                                i18 = 8;
                                            } else {
                                                i18 = 8;
                                                appCompatImageView29.setVisibility(8);
                                                i19 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView12 = (RobertoTextView) this$0.u0(i19);
                                            if (robertoTextView12 != null) {
                                                robertoTextView12.setVisibility(i18);
                                            }
                                            AppCompatImageView appCompatImageView30 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView30 != null) {
                                                appCompatImageView30.setVisibility(i18);
                                            }
                                        }
                                        String str4 = gk.a.f16573a;
                                        Bundle bundle3 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(2, it2), bool4)) {
                                            str = "unlocked";
                                        }
                                        bundle3.putString("status", str);
                                        bundle3.putString("badge_name", "Happy Camper");
                                        bundle3.putString("variant", "new");
                                        hs.k kVar3 = hs.k.f19476a;
                                        gk.a.b(bundle3, "profile_badge_click");
                                        return;
                                    } catch (Exception e12) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e12);
                                        return;
                                    }
                                case 3:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView31 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView31 != null) {
                                            appCompatImageView31.setImageResource(R.drawable.ir_badge_500_points_new);
                                        }
                                        RobertoTextView robertoTextView13 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView13 != null) {
                                            robertoTextView13.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessNinja));
                                        }
                                        RobertoTextView robertoTextView14 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView14 != null) {
                                            robertoTextView14.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessNinjaDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u05 = this$0.u0(R.id.blanketView);
                                        if (u05 != null) {
                                            u05.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V15 = is.k.V1(3, it2);
                                        Boolean bool5 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V15, bool5)) {
                                            AppCompatImageView appCompatImageView32 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView32 != null) {
                                                appCompatImageView32.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView33 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView33 == null) {
                                                i25 = R.id.profileBottomSheetLockedText;
                                                i24 = 0;
                                            } else {
                                                i24 = 0;
                                                appCompatImageView33.setVisibility(0);
                                                i25 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView15 = (RobertoTextView) this$0.u0(i25);
                                            if (robertoTextView15 != null) {
                                                robertoTextView15.setVisibility(i24);
                                            }
                                            AppCompatImageView appCompatImageView34 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView34 != null) {
                                                appCompatImageView34.setVisibility(i24);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView35 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView35 != null) {
                                                appCompatImageView35.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView36 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView36 == null) {
                                                i23 = R.id.profileBottomSheetLockedText;
                                                i22 = 8;
                                            } else {
                                                i22 = 8;
                                                appCompatImageView36.setVisibility(8);
                                                i23 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView16 = (RobertoTextView) this$0.u0(i23);
                                            if (robertoTextView16 != null) {
                                                robertoTextView16.setVisibility(i22);
                                            }
                                            AppCompatImageView appCompatImageView37 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView37 != null) {
                                                appCompatImageView37.setVisibility(i22);
                                            }
                                        }
                                        String str5 = gk.a.f16573a;
                                        Bundle bundle4 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(3, it2), bool5)) {
                                            str = "unlocked";
                                        }
                                        bundle4.putString("status", str);
                                        bundle4.putString("badge_name", "Happiness Ninja");
                                        bundle4.putString("variant", "new");
                                        hs.k kVar4 = hs.k.f19476a;
                                        gk.a.b(bundle4, "profile_badge_click");
                                        return;
                                    } catch (Exception e13) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e13);
                                        return;
                                    }
                                case 4:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView38 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView38 != null) {
                                            appCompatImageView38.setImageResource(R.drawable.ir_badge_track_goals_week_new);
                                        }
                                        RobertoTextView robertoTextView17 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView17 != null) {
                                            robertoTextView17.setText(this$0.getString(R.string.profileNewHappinessBadgeEnduranceBuilder));
                                        }
                                        RobertoTextView robertoTextView18 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView18 != null) {
                                            robertoTextView18.setText(this$0.getString(R.string.profileNewHappinessBadgeEnduranceBuilderDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u06 = this$0.u0(R.id.blanketView);
                                        if (u06 != null) {
                                            u06.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V16 = is.k.V1(4, it2);
                                        Boolean bool6 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V16, bool6)) {
                                            AppCompatImageView appCompatImageView39 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView39 != null) {
                                                appCompatImageView39.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView40 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView40 == null) {
                                                i29 = R.id.profileBottomSheetLockedText;
                                                i28 = 0;
                                            } else {
                                                i28 = 0;
                                                appCompatImageView40.setVisibility(0);
                                                i29 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView19 = (RobertoTextView) this$0.u0(i29);
                                            if (robertoTextView19 != null) {
                                                robertoTextView19.setVisibility(i28);
                                            }
                                            AppCompatImageView appCompatImageView41 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView41 != null) {
                                                appCompatImageView41.setVisibility(i28);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView42 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView42 != null) {
                                                appCompatImageView42.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView43 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView43 == null) {
                                                i27 = R.id.profileBottomSheetLockedText;
                                                i26 = 8;
                                            } else {
                                                i26 = 8;
                                                appCompatImageView43.setVisibility(8);
                                                i27 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView20 = (RobertoTextView) this$0.u0(i27);
                                            if (robertoTextView20 != null) {
                                                robertoTextView20.setVisibility(i26);
                                            }
                                            AppCompatImageView appCompatImageView44 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView44 != null) {
                                                appCompatImageView44.setVisibility(i26);
                                            }
                                        }
                                        String str6 = gk.a.f16573a;
                                        Bundle bundle5 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(4, it2), bool6)) {
                                            str = "unlocked";
                                        }
                                        bundle5.putString("status", str);
                                        bundle5.putString("badge_name", "Endurance Builder");
                                        bundle5.putString("variant", "new");
                                        hs.k kVar5 = hs.k.f19476a;
                                        gk.a.b(bundle5, "profile_badge_click");
                                        return;
                                    } catch (Exception e14) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e14);
                                        return;
                                    }
                                case 5:
                                    a();
                                    return;
                                case 6:
                                    b();
                                    return;
                                default:
                                    c();
                                    return;
                            }
                        }
                    });
                }
                if (kotlin.jvm.internal.i.b(is.k.V1(7, it), bool) && (appCompatImageView = (AppCompatImageView) experimentProfileActivity.u0(R.id.badgeImage8)) != null) {
                    appCompatImageView.setColorFilter(g0.a.b(experimentProfileActivity, R.color.title_high_contrast_54_opacity));
                }
                AppCompatImageView appCompatImageView16 = (AppCompatImageView) experimentProfileActivity.u0(R.id.badgeImage8);
                if (appCompatImageView16 != null) {
                    appCompatImageView16.setOnClickListener(new View.OnClickListener() { // from class: so.i0
                        private final void a() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_1000_points_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaestro));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaestroDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(5, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView112 != null) {
                                        appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView122 != null) {
                                        appCompatImageView122.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView132 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView132 != null) {
                                        appCompatImageView132.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView142 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView142 != null) {
                                        appCompatImageView142.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView152 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView152 != null) {
                                        appCompatImageView152.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView162 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView162 != null) {
                                        appCompatImageView162.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(5, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Maestro");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        private final void b() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_go_getter_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessGoGetter));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessGoGetterDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(6, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView112 != null) {
                                        appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView122 != null) {
                                        appCompatImageView122.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView132 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView132 != null) {
                                        appCompatImageView132.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView142 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView142 != null) {
                                        appCompatImageView142.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView152 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView152 != null) {
                                        appCompatImageView152.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView162 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView162 != null) {
                                        appCompatImageView162.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(6, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Go Getter");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        private final void c() {
                            String str;
                            Boolean[] it2 = it;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            n0 this_apply = n0Var;
                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                            try {
                                AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                if (appCompatImageView102 != null) {
                                    appCompatImageView102.setImageResource(R.drawable.ir_badge_happiness_sharer_new);
                                }
                                RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessSharer));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessSharerDesc));
                                }
                                BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                View u02 = this$0.u0(R.id.blanketView);
                                if (u02 != null) {
                                    u02.setVisibility(0);
                                }
                                kotlin.jvm.internal.i.f(it2, "it");
                                Object V12 = is.k.V1(7, it2);
                                Boolean bool2 = Boolean.FALSE;
                                if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                    AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView112 != null) {
                                        appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                    }
                                    AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView122 != null) {
                                        appCompatImageView122.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView3 != null) {
                                        robertoTextView3.setVisibility(0);
                                    }
                                    AppCompatImageView appCompatImageView132 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView132 != null) {
                                        appCompatImageView132.setVisibility(0);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView142 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                    if (appCompatImageView142 != null) {
                                        appCompatImageView142.setColorFilter((ColorFilter) null);
                                    }
                                    AppCompatImageView appCompatImageView152 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                    if (appCompatImageView152 != null) {
                                        appCompatImageView152.setVisibility(8);
                                    }
                                    RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetLockedText);
                                    if (robertoTextView4 != null) {
                                        robertoTextView4.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView162 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                    if (appCompatImageView162 != null) {
                                        appCompatImageView162.setVisibility(8);
                                    }
                                }
                                String str2 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                if (kotlin.jvm.internal.i.b(is.k.V1(7, it2), bool2)) {
                                    str = "locked";
                                } else {
                                    str = "unlocked";
                                }
                                bundle.putString("status", str);
                                bundle.putString("badge_name", "Happiness Sharer");
                                bundle.putString("variant", "new");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "profile_badge_click");
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6;
                            int i10;
                            int i11;
                            int i12;
                            int i13;
                            int i14;
                            int i15;
                            int i16;
                            int i17;
                            int i18;
                            int i19;
                            int i20;
                            int i21;
                            int i22;
                            int i23;
                            int i24;
                            int i25;
                            int i26;
                            int i27;
                            int i28;
                            int i29;
                            String str = "locked";
                            int i30 = r4;
                            n0 this_apply = n0Var;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            Boolean[] it2 = it;
                            switch (i30) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView102 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView102 != null) {
                                            appCompatImageView102.setImageResource(R.drawable.ir_badge_100_points_new);
                                        }
                                        RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView != null) {
                                            robertoTextView.setText(this$0.getString(R.string.profileNewHappinessBadgeCheerfulChamp));
                                        }
                                        RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView2 != null) {
                                            robertoTextView2.setText(this$0.getString(R.string.profileNewHappinessBadgeCheerfulChampDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u02 = this$0.u0(R.id.blanketView);
                                        if (u02 == null) {
                                            i6 = 0;
                                        } else {
                                            i6 = 0;
                                            u02.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V12 = is.k.V1(i6, it2);
                                        Boolean bool2 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V12, bool2)) {
                                            AppCompatImageView appCompatImageView112 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView112 != null) {
                                                appCompatImageView112.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView122 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView122 == null) {
                                                i13 = R.id.profileBottomSheetLockedText;
                                                i12 = 0;
                                            } else {
                                                i12 = 0;
                                                appCompatImageView122.setVisibility(0);
                                                i13 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(i13);
                                            if (robertoTextView3 != null) {
                                                robertoTextView3.setVisibility(i12);
                                            }
                                            AppCompatImageView appCompatImageView132 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView132 != null) {
                                                appCompatImageView132.setVisibility(i12);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView142 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView142 != null) {
                                                appCompatImageView142.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView152 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView152 == null) {
                                                i11 = R.id.profileBottomSheetLockedText;
                                                i10 = 8;
                                            } else {
                                                i10 = 8;
                                                appCompatImageView152.setVisibility(8);
                                                i11 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(i11);
                                            if (robertoTextView4 != null) {
                                                robertoTextView4.setVisibility(i10);
                                            }
                                            AppCompatImageView appCompatImageView162 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView162 != null) {
                                                appCompatImageView162.setVisibility(i10);
                                            }
                                        }
                                        String str2 = gk.a.f16573a;
                                        Bundle bundle = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(0, it2), bool2)) {
                                            str = "unlocked";
                                        }
                                        bundle.putString("status", str);
                                        bundle.putString("badge_name", "Cheerful Champ");
                                        bundle.putString("variant", "new");
                                        hs.k kVar = hs.k.f19476a;
                                        gk.a.b(bundle, "profile_badge_click");
                                        return;
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e10);
                                        return;
                                    }
                                case 1:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView17 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView17 != null) {
                                            appCompatImageView17.setImageResource(R.drawable.ir_badge_track_mood_new);
                                        }
                                        RobertoTextView robertoTextView5 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView5 != null) {
                                            robertoTextView5.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMaker));
                                        }
                                        RobertoTextView robertoTextView6 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView6 != null) {
                                            robertoTextView6.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessMakerDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u03 = this$0.u0(R.id.blanketView);
                                        if (u03 != null) {
                                            u03.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V13 = is.k.V1(1, it2);
                                        Boolean bool3 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V13, bool3)) {
                                            AppCompatImageView appCompatImageView18 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView18 != null) {
                                                appCompatImageView18.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView19 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView19 == null) {
                                                i17 = R.id.profileBottomSheetLockedText;
                                                i16 = 0;
                                            } else {
                                                i16 = 0;
                                                appCompatImageView19.setVisibility(0);
                                                i17 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView7 = (RobertoTextView) this$0.u0(i17);
                                            if (robertoTextView7 != null) {
                                                robertoTextView7.setVisibility(i16);
                                            }
                                            AppCompatImageView appCompatImageView20 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView20 != null) {
                                                appCompatImageView20.setVisibility(i16);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView21 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView21 != null) {
                                                appCompatImageView21.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView22 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView22 == null) {
                                                i15 = R.id.profileBottomSheetLockedText;
                                                i14 = 8;
                                            } else {
                                                i14 = 8;
                                                appCompatImageView22.setVisibility(8);
                                                i15 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView8 = (RobertoTextView) this$0.u0(i15);
                                            if (robertoTextView8 != null) {
                                                robertoTextView8.setVisibility(i14);
                                            }
                                            AppCompatImageView appCompatImageView23 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView23 != null) {
                                                appCompatImageView23.setVisibility(i14);
                                            }
                                        }
                                        String str3 = gk.a.f16573a;
                                        Bundle bundle2 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(1, it2), bool3)) {
                                            str = "unlocked";
                                        }
                                        bundle2.putString("status", str);
                                        bundle2.putString("badge_name", "Happiness Maker");
                                        bundle2.putString("variant", "new");
                                        hs.k kVar2 = hs.k.f19476a;
                                        gk.a.b(bundle2, "profile_badge_click");
                                        return;
                                    } catch (Exception e11) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e11);
                                        return;
                                    }
                                case 2:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView24 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView24 != null) {
                                            appCompatImageView24.setImageResource(R.drawable.ir_badge_schedule_activity_new);
                                        }
                                        RobertoTextView robertoTextView9 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView9 != null) {
                                            robertoTextView9.setText(this$0.getString(R.string.profileNewHappinessBadgeHappyCamper));
                                        }
                                        RobertoTextView robertoTextView10 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView10 != null) {
                                            robertoTextView10.setText(this$0.getString(R.string.profileNewHappinessBadgeHappyCamperDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u04 = this$0.u0(R.id.blanketView);
                                        if (u04 != null) {
                                            u04.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V14 = is.k.V1(2, it2);
                                        Boolean bool4 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V14, bool4)) {
                                            AppCompatImageView appCompatImageView25 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView25 != null) {
                                                appCompatImageView25.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView26 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView26 == null) {
                                                i21 = R.id.profileBottomSheetLockedText;
                                                i20 = 0;
                                            } else {
                                                i20 = 0;
                                                appCompatImageView26.setVisibility(0);
                                                i21 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView11 = (RobertoTextView) this$0.u0(i21);
                                            if (robertoTextView11 != null) {
                                                robertoTextView11.setVisibility(i20);
                                            }
                                            AppCompatImageView appCompatImageView27 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView27 != null) {
                                                appCompatImageView27.setVisibility(i20);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView28 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView28 != null) {
                                                appCompatImageView28.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView29 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView29 == null) {
                                                i19 = R.id.profileBottomSheetLockedText;
                                                i18 = 8;
                                            } else {
                                                i18 = 8;
                                                appCompatImageView29.setVisibility(8);
                                                i19 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView12 = (RobertoTextView) this$0.u0(i19);
                                            if (robertoTextView12 != null) {
                                                robertoTextView12.setVisibility(i18);
                                            }
                                            AppCompatImageView appCompatImageView30 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView30 != null) {
                                                appCompatImageView30.setVisibility(i18);
                                            }
                                        }
                                        String str4 = gk.a.f16573a;
                                        Bundle bundle3 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(2, it2), bool4)) {
                                            str = "unlocked";
                                        }
                                        bundle3.putString("status", str);
                                        bundle3.putString("badge_name", "Happy Camper");
                                        bundle3.putString("variant", "new");
                                        hs.k kVar3 = hs.k.f19476a;
                                        gk.a.b(bundle3, "profile_badge_click");
                                        return;
                                    } catch (Exception e12) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e12);
                                        return;
                                    }
                                case 3:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView31 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView31 != null) {
                                            appCompatImageView31.setImageResource(R.drawable.ir_badge_500_points_new);
                                        }
                                        RobertoTextView robertoTextView13 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView13 != null) {
                                            robertoTextView13.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessNinja));
                                        }
                                        RobertoTextView robertoTextView14 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView14 != null) {
                                            robertoTextView14.setText(this$0.getString(R.string.profileNewHappinessBadgeHappinessNinjaDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u05 = this$0.u0(R.id.blanketView);
                                        if (u05 != null) {
                                            u05.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V15 = is.k.V1(3, it2);
                                        Boolean bool5 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V15, bool5)) {
                                            AppCompatImageView appCompatImageView32 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView32 != null) {
                                                appCompatImageView32.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView33 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView33 == null) {
                                                i25 = R.id.profileBottomSheetLockedText;
                                                i24 = 0;
                                            } else {
                                                i24 = 0;
                                                appCompatImageView33.setVisibility(0);
                                                i25 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView15 = (RobertoTextView) this$0.u0(i25);
                                            if (robertoTextView15 != null) {
                                                robertoTextView15.setVisibility(i24);
                                            }
                                            AppCompatImageView appCompatImageView34 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView34 != null) {
                                                appCompatImageView34.setVisibility(i24);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView35 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView35 != null) {
                                                appCompatImageView35.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView36 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView36 == null) {
                                                i23 = R.id.profileBottomSheetLockedText;
                                                i22 = 8;
                                            } else {
                                                i22 = 8;
                                                appCompatImageView36.setVisibility(8);
                                                i23 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView16 = (RobertoTextView) this$0.u0(i23);
                                            if (robertoTextView16 != null) {
                                                robertoTextView16.setVisibility(i22);
                                            }
                                            AppCompatImageView appCompatImageView37 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView37 != null) {
                                                appCompatImageView37.setVisibility(i22);
                                            }
                                        }
                                        String str5 = gk.a.f16573a;
                                        Bundle bundle4 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(3, it2), bool5)) {
                                            str = "unlocked";
                                        }
                                        bundle4.putString("status", str);
                                        bundle4.putString("badge_name", "Happiness Ninja");
                                        bundle4.putString("variant", "new");
                                        hs.k kVar4 = hs.k.f19476a;
                                        gk.a.b(bundle4, "profile_badge_click");
                                        return;
                                    } catch (Exception e13) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e13);
                                        return;
                                    }
                                case 4:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    try {
                                        AppCompatImageView appCompatImageView38 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                        if (appCompatImageView38 != null) {
                                            appCompatImageView38.setImageResource(R.drawable.ir_badge_track_goals_week_new);
                                        }
                                        RobertoTextView robertoTextView17 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetHeader);
                                        if (robertoTextView17 != null) {
                                            robertoTextView17.setText(this$0.getString(R.string.profileNewHappinessBadgeEnduranceBuilder));
                                        }
                                        RobertoTextView robertoTextView18 = (RobertoTextView) this$0.u0(R.id.profileBottomSheetDesc);
                                        if (robertoTextView18 != null) {
                                            robertoTextView18.setText(this$0.getString(R.string.profileNewHappinessBadgeEnduranceBuilderDesc));
                                        }
                                        BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(3);
                                        View u06 = this$0.u0(R.id.blanketView);
                                        if (u06 != null) {
                                            u06.setVisibility(0);
                                        }
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        Object V16 = is.k.V1(4, it2);
                                        Boolean bool6 = Boolean.FALSE;
                                        if (kotlin.jvm.internal.i.b(V16, bool6)) {
                                            AppCompatImageView appCompatImageView39 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView39 != null) {
                                                appCompatImageView39.setColorFilter(g0.a.b(this$0, R.color.title_high_contrast_54_opacity));
                                            }
                                            AppCompatImageView appCompatImageView40 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView40 == null) {
                                                i29 = R.id.profileBottomSheetLockedText;
                                                i28 = 0;
                                            } else {
                                                i28 = 0;
                                                appCompatImageView40.setVisibility(0);
                                                i29 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView19 = (RobertoTextView) this$0.u0(i29);
                                            if (robertoTextView19 != null) {
                                                robertoTextView19.setVisibility(i28);
                                            }
                                            AppCompatImageView appCompatImageView41 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView41 != null) {
                                                appCompatImageView41.setVisibility(i28);
                                            }
                                        } else {
                                            AppCompatImageView appCompatImageView42 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImage);
                                            if (appCompatImageView42 != null) {
                                                appCompatImageView42.setColorFilter((ColorFilter) null);
                                            }
                                            AppCompatImageView appCompatImageView43 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetImageLock);
                                            if (appCompatImageView43 == null) {
                                                i27 = R.id.profileBottomSheetLockedText;
                                                i26 = 8;
                                            } else {
                                                i26 = 8;
                                                appCompatImageView43.setVisibility(8);
                                                i27 = R.id.profileBottomSheetLockedText;
                                            }
                                            RobertoTextView robertoTextView20 = (RobertoTextView) this$0.u0(i27);
                                            if (robertoTextView20 != null) {
                                                robertoTextView20.setVisibility(i26);
                                            }
                                            AppCompatImageView appCompatImageView44 = (AppCompatImageView) this$0.u0(R.id.profileBottomSheetLockedImage);
                                            if (appCompatImageView44 != null) {
                                                appCompatImageView44.setVisibility(i26);
                                            }
                                        }
                                        String str6 = gk.a.f16573a;
                                        Bundle bundle5 = new Bundle();
                                        if (!kotlin.jvm.internal.i.b(is.k.V1(4, it2), bool6)) {
                                            str = "unlocked";
                                        }
                                        bundle5.putString("status", str);
                                        bundle5.putString("badge_name", "Endurance Builder");
                                        bundle5.putString("variant", "new");
                                        hs.k kVar5 = hs.k.f19476a;
                                        gk.a.b(bundle5, "profile_badge_click");
                                        return;
                                    } catch (Exception e14) {
                                        LogHelper.INSTANCE.e(this_apply.f36971z, e14);
                                        return;
                                    }
                                case 5:
                                    a();
                                    return;
                                case 6:
                                    b();
                                    return;
                                default:
                                    c();
                                    return;
                            }
                        }
                    });
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(n0Var.f36971z, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<Integer[], hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ n0 f11583v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n0 n0Var) {
            super(1);
            this.f11583v = n0Var;
        }

        @Override // ss.l
        public final hs.k invoke(Integer[] numArr) {
            int i6;
            int i10;
            int i11;
            int i12;
            Integer[] it = numArr;
            ExperimentProfileActivity experimentProfileActivity = ExperimentProfileActivity.this;
            try {
                kotlin.jvm.internal.i.f(it, "it");
                Integer num = (Integer) is.k.V1(0, it);
                if (num != null) {
                    i6 = num.intValue();
                } else {
                    i6 = 0;
                }
                Integer num2 = (Integer) is.k.V1(2, it);
                if (num2 != null) {
                    i10 = num2.intValue();
                } else {
                    i10 = 0;
                }
                Integer num3 = (Integer) is.k.V1(3, it);
                if (num3 != null) {
                    i11 = num3.intValue();
                } else {
                    i11 = 0;
                }
                RobertoTextView robertoTextView = (RobertoTextView) experimentProfileActivity.u0(R.id.tvProfilePointsLevel);
                if (robertoTextView != null) {
                    robertoTextView.setText(experimentProfileActivity.getString(R.string.profileNewHappinessPointsLevel, String.valueOf(i6)));
                }
                RobertoTextView robertoTextView2 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvProfilePointsValue);
                if (robertoTextView2 != null) {
                    Integer num4 = (Integer) is.k.V1(1, it);
                    if (num4 != null) {
                        i12 = num4.intValue();
                    } else {
                        i12 = 0;
                    }
                    robertoTextView2.setText(String.valueOf(i12));
                }
                RobertoTextView robertoTextView3 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvProfilePointsRemaining);
                if (robertoTextView3 != null) {
                    robertoTextView3.setText(experimentProfileActivity.getString(R.string.profileNewHappinessPointsRemaining, String.valueOf(i10), String.valueOf(i6 + 1)));
                }
                ProgressBar progressBar = (ProgressBar) experimentProfileActivity.u0(R.id.profileHappinessPointsProgress);
                if (progressBar != null) {
                    progressBar.setMax(i11 * 50);
                }
                experimentProfileActivity.A = i11 - i10;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f11583v.f36971z, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends String, ? extends Boolean>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ n0 f11585v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n0 n0Var) {
            super(1);
            this.f11585v = n0Var;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends String, ? extends Boolean> fVar) {
            hs.f<? extends String, ? extends Boolean> fVar2 = fVar;
            try {
                boolean booleanValue = ((Boolean) fVar2.f19465v).booleanValue();
                ExperimentProfileActivity experimentProfileActivity = ExperimentProfileActivity.this;
                A a10 = fVar2.f19464u;
                if (booleanValue) {
                    Glide.i(experimentProfileActivity).d(new File(experimentProfileActivity.getFilesDir(), (String) a10)).p(new c5.d(Long.valueOf(Calendar.getInstance().getTimeInMillis()))).d(k4.l.f22878a).q(true).B((AppCompatImageView) experimentProfileActivity.u0(R.id.ivProfileBanner));
                } else {
                    Glide.i(experimentProfileActivity).p((String) a10).B((AppCompatImageView) experimentProfileActivity.u0(R.id.ivProfileBanner));
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f11585v.f36971z, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends String, ? extends Boolean>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ n0 f11587v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(n0 n0Var) {
            super(1);
            this.f11587v = n0Var;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends String, ? extends Boolean> fVar) {
            hs.f<? extends String, ? extends Boolean> fVar2 = fVar;
            try {
                boolean booleanValue = ((Boolean) fVar2.f19465v).booleanValue();
                ExperimentProfileActivity experimentProfileActivity = ExperimentProfileActivity.this;
                A a10 = fVar2.f19464u;
                if (booleanValue) {
                    Glide.i(experimentProfileActivity).d(new File(experimentProfileActivity.getFilesDir(), (String) a10)).p(new c5.d(Long.valueOf(Calendar.getInstance().getTimeInMillis()))).d(k4.l.f22878a).q(true).B((CircleImageView) experimentProfileActivity.u0(R.id.ivProfileImage));
                } else {
                    Glide.i(experimentProfileActivity).p((String) a10).B((CircleImageView) experimentProfileActivity.u0(R.id.ivProfileImage));
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f11587v.f36971z, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.l<Integer[], hs.k> {
        public f() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Integer[] numArr) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer[] numArr2 = numArr;
            ExperimentProfileActivity experimentProfileActivity = ExperimentProfileActivity.this;
            if (numArr2 != null && (num3 = (Integer) is.k.V1(0, numArr2)) != null) {
                int intValue = num3.intValue();
                RobertoTextView robertoTextView = (RobertoTextView) experimentProfileActivity.u0(R.id.sessionsExistingSessionsCount);
                if (robertoTextView != null) {
                    robertoTextView.setText(experimentProfileActivity.getString(R.string.profileNewSessionsBookedExisting, String.valueOf(intValue)));
                }
            }
            if (numArr2 != null && (num2 = (Integer) is.k.V1(1, numArr2)) != null) {
                int intValue2 = num2.intValue();
                RobertoTextView robertoTextView2 = (RobertoTextView) experimentProfileActivity.u0(R.id.couplesSessionsExistingSessionsCount);
                if (robertoTextView2 != null) {
                    robertoTextView2.setText(experimentProfileActivity.getString(R.string.profileNewSessionsBookedExisting, String.valueOf(intValue2)));
                }
            }
            if (numArr2 != null && (num = (Integer) is.k.V1(2, numArr2)) != null) {
                int intValue3 = num.intValue();
                RobertoTextView robertoTextView3 = (RobertoTextView) experimentProfileActivity.u0(R.id.psychSessionsExistingSessionsCount);
                if (robertoTextView3 != null) {
                    robertoTextView3.setText(experimentProfileActivity.getString(R.string.profileNewSessionsBookedExisting, String.valueOf(intValue3)));
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.l<Long, hs.k> {
        public g() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Long l2) {
            long longValue;
            String string;
            Long l10 = l2;
            ExperimentProfileActivity experimentProfileActivity = ExperimentProfileActivity.this;
            RobertoTextView robertoTextView = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatText1);
            long j10 = 0;
            if (robertoTextView != null) {
                if (l10 == null) {
                    longValue = 0;
                } else {
                    longValue = l10.longValue();
                }
                if (longValue <= 1) {
                    string = experimentProfileActivity.getString(R.string.profileNewActivityStatSingle);
                } else {
                    string = experimentProfileActivity.getString(R.string.profileNewActivityStat);
                }
                robertoTextView.setText(string);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue1);
            if (l10 != null) {
                j10 = l10.longValue();
            }
            ExperimentProfileActivity.v0(j10, experimentProfileActivity, robertoTextView2);
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.l<Long, hs.k> {
        public h() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Long l2) {
            long longValue;
            String string;
            Long l10 = l2;
            ExperimentProfileActivity experimentProfileActivity = ExperimentProfileActivity.this;
            RobertoTextView robertoTextView = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatText2);
            long j10 = 0;
            if (robertoTextView != null) {
                if (l10 == null) {
                    longValue = 0;
                } else {
                    longValue = l10.longValue();
                }
                if (longValue <= 1) {
                    string = experimentProfileActivity.getString(R.string.profileNewGoalStatSingle);
                } else {
                    string = experimentProfileActivity.getString(R.string.profileNewGoalStat);
                }
                robertoTextView.setText(string);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue2);
            if (l10 != null) {
                j10 = l10.longValue();
            }
            ExperimentProfileActivity.v0(j10, experimentProfileActivity, robertoTextView2);
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.l<Long, hs.k> {
        public i() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Long l2) {
            long longValue;
            String string;
            Long l10 = l2;
            ExperimentProfileActivity experimentProfileActivity = ExperimentProfileActivity.this;
            RobertoTextView robertoTextView = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatText3);
            long j10 = 0;
            if (robertoTextView != null) {
                if (l10 == null) {
                    longValue = 0;
                } else {
                    longValue = l10.longValue();
                }
                if (longValue <= 1) {
                    string = experimentProfileActivity.getString(R.string.profileNewMoodStatSingle);
                } else {
                    string = experimentProfileActivity.getString(R.string.profileNewMoodStat);
                }
                robertoTextView.setText(string);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue3);
            if (l10 != null) {
                j10 = l10.longValue();
            }
            ExperimentProfileActivity.v0(j10, experimentProfileActivity, robertoTextView2);
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.l<Long, hs.k> {
        public j() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:125:0x01f0  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01f1 A[Catch: Exception -> 0x01f9, TRY_LEAVE, TryCatch #2 {Exception -> 0x01f9, blocks: (B:123:0x01e8, B:126:0x01f1), top: B:169:0x01e8, outer: #7 }] */
        /* JADX WARN: Removed duplicated region for block: B:134:0x021a A[Catch: Exception -> 0x0282, TryCatch #7 {Exception -> 0x0282, blocks: (B:8:0x0028, B:12:0x0034, B:16:0x0040, B:43:0x0098, B:42:0x0093, B:44:0x009d, B:46:0x00ab, B:48:0x00b1, B:50:0x00b9, B:51:0x00be, B:53:0x00c9, B:55:0x00cf, B:57:0x00d7, B:15:0x003d, B:11:0x0031, B:58:0x00de, B:62:0x00ed, B:66:0x00f9, B:82:0x0134, B:130:0x01ff, B:132:0x020c, B:134:0x021a, B:136:0x0220, B:138:0x0228, B:139:0x022d, B:141:0x0238, B:143:0x023e, B:145:0x0246, B:146:0x024b, B:148:0x0253, B:150:0x0259, B:152:0x0261, B:153:0x0266, B:155:0x026e, B:157:0x0274, B:159:0x027c, B:129:0x01fa, B:74:0x0119, B:78:0x0125, B:81:0x0131, B:77:0x0122, B:65:0x00f6, B:61:0x00ea, B:32:0x0070, B:123:0x01e8, B:126:0x01f1, B:36:0x0081, B:39:0x008a), top: B:179:0x0026, inners: #1, #2, #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0238 A[Catch: Exception -> 0x0282, TryCatch #7 {Exception -> 0x0282, blocks: (B:8:0x0028, B:12:0x0034, B:16:0x0040, B:43:0x0098, B:42:0x0093, B:44:0x009d, B:46:0x00ab, B:48:0x00b1, B:50:0x00b9, B:51:0x00be, B:53:0x00c9, B:55:0x00cf, B:57:0x00d7, B:15:0x003d, B:11:0x0031, B:58:0x00de, B:62:0x00ed, B:66:0x00f9, B:82:0x0134, B:130:0x01ff, B:132:0x020c, B:134:0x021a, B:136:0x0220, B:138:0x0228, B:139:0x022d, B:141:0x0238, B:143:0x023e, B:145:0x0246, B:146:0x024b, B:148:0x0253, B:150:0x0259, B:152:0x0261, B:153:0x0266, B:155:0x026e, B:157:0x0274, B:159:0x027c, B:129:0x01fa, B:74:0x0119, B:78:0x0125, B:81:0x0131, B:77:0x0122, B:65:0x00f6, B:61:0x00ea, B:32:0x0070, B:123:0x01e8, B:126:0x01f1, B:36:0x0081, B:39:0x008a), top: B:179:0x0026, inners: #1, #2, #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0253 A[Catch: Exception -> 0x0282, TryCatch #7 {Exception -> 0x0282, blocks: (B:8:0x0028, B:12:0x0034, B:16:0x0040, B:43:0x0098, B:42:0x0093, B:44:0x009d, B:46:0x00ab, B:48:0x00b1, B:50:0x00b9, B:51:0x00be, B:53:0x00c9, B:55:0x00cf, B:57:0x00d7, B:15:0x003d, B:11:0x0031, B:58:0x00de, B:62:0x00ed, B:66:0x00f9, B:82:0x0134, B:130:0x01ff, B:132:0x020c, B:134:0x021a, B:136:0x0220, B:138:0x0228, B:139:0x022d, B:141:0x0238, B:143:0x023e, B:145:0x0246, B:146:0x024b, B:148:0x0253, B:150:0x0259, B:152:0x0261, B:153:0x0266, B:155:0x026e, B:157:0x0274, B:159:0x027c, B:129:0x01fa, B:74:0x0119, B:78:0x0125, B:81:0x0131, B:77:0x0122, B:65:0x00f6, B:61:0x00ea, B:32:0x0070, B:123:0x01e8, B:126:0x01f1, B:36:0x0081, B:39:0x008a), top: B:179:0x0026, inners: #1, #2, #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:155:0x026e A[Catch: Exception -> 0x0282, TryCatch #7 {Exception -> 0x0282, blocks: (B:8:0x0028, B:12:0x0034, B:16:0x0040, B:43:0x0098, B:42:0x0093, B:44:0x009d, B:46:0x00ab, B:48:0x00b1, B:50:0x00b9, B:51:0x00be, B:53:0x00c9, B:55:0x00cf, B:57:0x00d7, B:15:0x003d, B:11:0x0031, B:58:0x00de, B:62:0x00ed, B:66:0x00f9, B:82:0x0134, B:130:0x01ff, B:132:0x020c, B:134:0x021a, B:136:0x0220, B:138:0x0228, B:139:0x022d, B:141:0x0238, B:143:0x023e, B:145:0x0246, B:146:0x024b, B:148:0x0253, B:150:0x0259, B:152:0x0261, B:153:0x0266, B:155:0x026e, B:157:0x0274, B:159:0x027c, B:129:0x01fa, B:74:0x0119, B:78:0x0125, B:81:0x0131, B:77:0x0122, B:65:0x00f6, B:61:0x00ea, B:32:0x0070, B:123:0x01e8, B:126:0x01f1, B:36:0x0081, B:39:0x008a), top: B:179:0x0026, inners: #1, #2, #6 }] */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(Long l2) {
            long longValue;
            Handler handler;
            int i6;
            int i10;
            RobertoTextView robertoTextView;
            RobertoTextView robertoTextView2;
            RobertoTextView robertoTextView3;
            RobertoTextView robertoTextView4;
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator animate2;
            ViewPropertyAnimator alpha2;
            ViewPropertyAnimator animate3;
            ViewPropertyAnimator alpha3;
            ViewPropertyAnimator animate4;
            ViewPropertyAnimator alpha4;
            final long j10;
            long j11;
            Exception exc;
            RobertoTextView robertoTextView5;
            w wVar;
            long j12;
            final w wVar2;
            ViewPropertyAnimator animate5;
            ViewPropertyAnimator alpha5;
            ViewPropertyAnimator animate6;
            ViewPropertyAnimator alpha6;
            long j13;
            int i11;
            Long l10 = l2;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            final ExperimentProfileActivity experimentProfileActivity = ExperimentProfileActivity.this;
            ArrayList<Handler> arrayList = experimentProfileActivity.L;
            long j14 = 100;
            int i12 = 350;
            String str = experimentProfileActivity.f11575w;
            try {
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, e10);
            }
            if (longValue < 59) {
                RobertoTextView robertoTextView6 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4Hours);
                if (robertoTextView6 != null) {
                    robertoTextView6.setVisibility(8);
                }
                RobertoTextView robertoTextView7 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4HoursStatic);
                if (robertoTextView7 != null) {
                    robertoTextView7.setVisibility(8);
                }
                Handler handler2 = new Handler(Looper.getMainLooper());
                long j15 = 1;
                while (j15 < longValue) {
                    long j16 = j15 * j14;
                    long j17 = longValue - j15;
                    try {
                        if (j17 == 3) {
                            i11 = 100;
                        } else if (j17 == 2) {
                            i11 = k.d.DEFAULT_DRAG_ANIMATION_DURATION;
                        } else {
                            if (j17 == 1) {
                                j13 = 350;
                                j16 += j13;
                            }
                            handler2.postDelayed(new q7.g(1, j15, experimentProfileActivity), j16);
                            j15++;
                            j14 = 100;
                        }
                        handler2.postDelayed(new q7.g(1, j15, experimentProfileActivity), j16);
                        j15++;
                        j14 = 100;
                    } catch (Exception e11) {
                        try {
                            RobertoTextView robertoTextView8 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4Minutes);
                            if (robertoTextView8 != null) {
                                robertoTextView8.setText(String.valueOf(longValue));
                            }
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(str, e12);
                        }
                        LogHelper.INSTANCE.e(str, e11);
                    }
                    j13 = i11;
                    j16 += j13;
                }
                arrayList.add(handler2);
                RobertoTextView robertoTextView9 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4MinutesStatic);
                if (robertoTextView9 != null && (animate6 = robertoTextView9.animate()) != null && (alpha6 = animate6.alpha(1.0f)) != null) {
                    alpha6.setDuration(450L);
                }
                RobertoTextView robertoTextView10 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4Minutes);
                if (robertoTextView10 != null && (animate5 = robertoTextView10.animate()) != null && (alpha5 = animate5.alpha(1.0f)) != null) {
                    alpha5.setDuration(450L);
                }
                return hs.k.f19476a;
            }
            RobertoTextView robertoTextView11 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4Hours);
            if (robertoTextView11 != null) {
                robertoTextView11.setVisibility(0);
            }
            RobertoTextView robertoTextView12 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4HoursStatic);
            if (robertoTextView12 != null) {
                robertoTextView12.setVisibility(0);
            }
            long j18 = 60;
            long j19 = longValue / j18;
            Long.signum(j19);
            if (longValue - (j19 * j18) == 0 || longValue > 5999) {
                RobertoTextView robertoTextView13 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4Minutes);
                if (robertoTextView13 != null) {
                    robertoTextView13.setVisibility(8);
                }
                RobertoTextView robertoTextView14 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4MinutesStatic);
                if (robertoTextView14 != null) {
                    robertoTextView14.setVisibility(8);
                }
            }
            Handler handler3 = new Handler(Looper.getMainLooper());
            int i13 = 1;
            while (i13 < 16) {
                Handler handler4 = handler3;
                if (i13 == 15) {
                    j10 = longValue;
                } else {
                    try {
                        j10 = (longValue / 15) * i13;
                    } catch (Exception e13) {
                        e = e13;
                        j11 = longValue;
                        handler = handler4;
                        i6 = R.id.tvStatValue4HoursStatic;
                        i10 = R.id.tvStatValue4Hours;
                        exc = e;
                        try {
                            robertoTextView5 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4Minutes);
                            if (robertoTextView5 == null) {
                            }
                        } catch (Exception e14) {
                            LogHelper.INSTANCE.e(str, e14);
                        }
                        LogHelper.INSTANCE.e(str, exc);
                        arrayList.add(handler);
                        robertoTextView = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4MinutesStatic);
                        if (robertoTextView != null) {
                        }
                        robertoTextView2 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4Minutes);
                        if (robertoTextView2 != null) {
                        }
                        robertoTextView3 = (RobertoTextView) experimentProfileActivity.u0(i6);
                        if (robertoTextView3 != null) {
                        }
                        robertoTextView4 = (RobertoTextView) experimentProfileActivity.u0(i10);
                        if (robertoTextView4 != null) {
                        }
                        return hs.k.f19476a;
                    }
                }
                w wVar3 = new w();
                final w wVar4 = new w();
                if (j10 > 59) {
                    j11 = longValue;
                    try {
                        long j20 = j10 / j18;
                        wVar3.f23468u = j20;
                        Long.signum(j20);
                        wVar4.f23468u = j10 - (j20 * j18);
                    } catch (Exception e15) {
                        exc = e15;
                        handler = handler4;
                        i6 = R.id.tvStatValue4HoursStatic;
                        i10 = R.id.tvStatValue4Hours;
                        robertoTextView5 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4Minutes);
                        if (robertoTextView5 == null) {
                            robertoTextView5.setText(String.valueOf(j11));
                        }
                        LogHelper.INSTANCE.e(str, exc);
                        arrayList.add(handler);
                        robertoTextView = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4MinutesStatic);
                        if (robertoTextView != null) {
                            alpha4.setDuration(450L);
                        }
                        robertoTextView2 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4Minutes);
                        if (robertoTextView2 != null) {
                            alpha3.setDuration(450L);
                        }
                        robertoTextView3 = (RobertoTextView) experimentProfileActivity.u0(i6);
                        if (robertoTextView3 != null) {
                            alpha2.setDuration(450L);
                        }
                        robertoTextView4 = (RobertoTextView) experimentProfileActivity.u0(i10);
                        if (robertoTextView4 != null) {
                            alpha.setDuration(450L);
                        }
                        return hs.k.f19476a;
                    }
                } else {
                    j11 = longValue;
                }
                long j21 = i13 * 100;
                switch (i13) {
                    case 13:
                        wVar = wVar3;
                        j21 += 100;
                        break;
                    case 14:
                        j21 += (long) k.d.DEFAULT_DRAG_ANIMATION_DURATION;
                        wVar = wVar3;
                        break;
                    case 15:
                        j21 += i12;
                    default:
                        wVar = wVar3;
                        break;
                }
                try {
                    handler = handler4;
                    j12 = j18;
                    i6 = R.id.tvStatValue4HoursStatic;
                    wVar2 = wVar;
                    i10 = R.id.tvStatValue4Hours;
                } catch (Exception e16) {
                    e = e16;
                    handler = handler4;
                    i6 = R.id.tvStatValue4HoursStatic;
                    i10 = R.id.tvStatValue4Hours;
                    exc = e;
                    robertoTextView5 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4Minutes);
                    if (robertoTextView5 == null) {
                    }
                    LogHelper.INSTANCE.e(str, exc);
                    arrayList.add(handler);
                    robertoTextView = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4MinutesStatic);
                    if (robertoTextView != null) {
                    }
                    robertoTextView2 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4Minutes);
                    if (robertoTextView2 != null) {
                    }
                    robertoTextView3 = (RobertoTextView) experimentProfileActivity.u0(i6);
                    if (robertoTextView3 != null) {
                    }
                    robertoTextView4 = (RobertoTextView) experimentProfileActivity.u0(i10);
                    if (robertoTextView4 != null) {
                    }
                    return hs.k.f19476a;
                }
                try {
                    handler.postDelayed(new Runnable() { // from class: so.f0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i14 = ExperimentProfileActivity.S;
                            ExperimentProfileActivity this$0 = experimentProfileActivity;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.w hourValue = wVar2;
                            kotlin.jvm.internal.i.g(hourValue, "$hourValue");
                            kotlin.jvm.internal.w minuteValue = wVar4;
                            kotlin.jvm.internal.i.g(minuteValue, "$minuteValue");
                            long j22 = j10;
                            try {
                                if (j22 > 59) {
                                    RobertoTextView robertoTextView15 = (RobertoTextView) this$0.u0(R.id.tvStatValue4Hours);
                                    if (robertoTextView15 != null) {
                                        robertoTextView15.setText(String.valueOf(hourValue.f23468u));
                                    }
                                    RobertoTextView robertoTextView16 = (RobertoTextView) this$0.u0(R.id.tvStatValue4Minutes);
                                    if (robertoTextView16 != null) {
                                        robertoTextView16.setText(String.valueOf(minuteValue.f23468u));
                                        return;
                                    }
                                    return;
                                }
                                RobertoTextView robertoTextView17 = (RobertoTextView) this$0.u0(R.id.tvStatValue4Minutes);
                                if (robertoTextView17 != null) {
                                    robertoTextView17.setText(String.valueOf(j22));
                                }
                            } catch (Exception e17) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e17);
                            }
                        }
                    }, j21);
                    i13++;
                    handler3 = handler;
                    longValue = j11;
                    j18 = j12;
                    i12 = 350;
                } catch (Exception e17) {
                    e = e17;
                    exc = e;
                    robertoTextView5 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4Minutes);
                    if (robertoTextView5 == null) {
                    }
                    LogHelper.INSTANCE.e(str, exc);
                    arrayList.add(handler);
                    robertoTextView = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4MinutesStatic);
                    if (robertoTextView != null) {
                    }
                    robertoTextView2 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4Minutes);
                    if (robertoTextView2 != null) {
                    }
                    robertoTextView3 = (RobertoTextView) experimentProfileActivity.u0(i6);
                    if (robertoTextView3 != null) {
                    }
                    robertoTextView4 = (RobertoTextView) experimentProfileActivity.u0(i10);
                    if (robertoTextView4 != null) {
                    }
                    return hs.k.f19476a;
                }
            }
            handler = handler3;
            i6 = R.id.tvStatValue4HoursStatic;
            i10 = R.id.tvStatValue4Hours;
            arrayList.add(handler);
            robertoTextView = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4MinutesStatic);
            if (robertoTextView != null && (animate4 = robertoTextView.animate()) != null && (alpha4 = animate4.alpha(1.0f)) != null) {
                alpha4.setDuration(450L);
            }
            robertoTextView2 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue4Minutes);
            if (robertoTextView2 != null && (animate3 = robertoTextView2.animate()) != null && (alpha3 = animate3.alpha(1.0f)) != null) {
                alpha3.setDuration(450L);
            }
            robertoTextView3 = (RobertoTextView) experimentProfileActivity.u0(i6);
            if (robertoTextView3 != null && (animate2 = robertoTextView3.animate()) != null && (alpha2 = animate2.alpha(1.0f)) != null) {
                alpha2.setDuration(450L);
            }
            robertoTextView4 = (RobertoTextView) experimentProfileActivity.u0(i10);
            if (robertoTextView4 != null && (animate = robertoTextView4.animate()) != null && (alpha = animate.alpha(1.0f)) != null) {
                alpha.setDuration(450L);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.l<Long, hs.k> {
        public k() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Long l2) {
            long longValue;
            String string;
            Long l10 = l2;
            ExperimentProfileActivity experimentProfileActivity = ExperimentProfileActivity.this;
            RobertoTextView robertoTextView = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatText5);
            long j10 = 0;
            if (robertoTextView != null) {
                if (l10 == null) {
                    longValue = 0;
                } else {
                    longValue = l10.longValue();
                }
                if (longValue <= 1) {
                    string = experimentProfileActivity.getString(R.string.profileNewAllieStatSingle);
                } else {
                    string = experimentProfileActivity.getString(R.string.profileNewAllieStat);
                }
                robertoTextView.setText(string);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue5);
            if (l10 != null) {
                j10 = l10.longValue();
            }
            ExperimentProfileActivity.v0(j10, experimentProfileActivity, robertoTextView2);
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class l extends kotlin.jvm.internal.k implements ss.l<Long, hs.k> {
        public l() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Long l2) {
            long longValue;
            String string;
            Long l10 = l2;
            ExperimentProfileActivity experimentProfileActivity = ExperimentProfileActivity.this;
            RobertoTextView robertoTextView = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatText6);
            long j10 = 0;
            if (robertoTextView != null) {
                if (l10 == null) {
                    longValue = 0;
                } else {
                    longValue = l10.longValue();
                }
                if (longValue <= 1) {
                    string = experimentProfileActivity.getString(R.string.profileNewResourcesStatSingle);
                } else {
                    string = experimentProfileActivity.getString(R.string.profileNewResourcesStat);
                }
                robertoTextView.setText(string);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) experimentProfileActivity.u0(R.id.tvStatValue6);
            if (l10 != null) {
                j10 = l10.longValue();
            }
            ExperimentProfileActivity.v0(j10, experimentProfileActivity, robertoTextView2);
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class m extends kotlin.jvm.internal.k implements ss.l<Integer[], hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ n0 f11596v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(n0 n0Var) {
            super(1);
            this.f11596v = n0Var;
        }

        @Override // ss.l
        public final hs.k invoke(Integer[] numArr) {
            String str;
            Integer[] it = numArr;
            ExperimentProfileActivity experimentProfileActivity = ExperimentProfileActivity.this;
            try {
                if (!experimentProfileActivity.K) {
                    if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                        User user = FirebasePersistence.getInstance().getUser();
                        if (user != null) {
                            str = user.getVersion();
                        } else {
                            str = null;
                        }
                        if (kotlin.jvm.internal.i.b(str, Constants.USER_VERSION)) {
                            kotlin.jvm.internal.i.f(it, "it");
                            experimentProfileActivity.B = it;
                        }
                    }
                    kotlin.jvm.internal.i.f(it, "it");
                    experimentProfileActivity.F0(it, false);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f11596v.f36971z, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class n extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends TherapistPackagesModel, ? extends TherapistPackagesModel>, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ n0 f11597u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ExperimentProfileActivity f11598v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ExperimentProfileActivity experimentProfileActivity, n0 n0Var) {
            super(1);
            this.f11597u = n0Var;
            this.f11598v = experimentProfileActivity;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends TherapistPackagesModel, ? extends TherapistPackagesModel> fVar) {
            TherapistPackagesModel therapistPackagesModel;
            hs.f<? extends TherapistPackagesModel, ? extends TherapistPackagesModel> fVar2 = fVar;
            ExperimentProfileActivity experimentProfileActivity = this.f11598v;
            String str = "";
            if (fVar2 != null) {
                try {
                    TherapistPackagesModel therapistPackagesModel2 = (TherapistPackagesModel) fVar2.f19464u;
                    if (therapistPackagesModel2 != null && kotlin.jvm.internal.i.b(LocationPersistence.INSTANCE.getCurrentCountry(), "IN")) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) experimentProfileActivity.u0(R.id.sessionsContainerNew);
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(8);
                        }
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) experimentProfileActivity.u0(R.id.sessionsContainerExisting);
                        if (constraintLayout2 != null) {
                            constraintLayout2.setVisibility(0);
                        }
                        Glide.c(experimentProfileActivity).d(experimentProfileActivity).p("https:" + therapistPackagesModel2.getImage()).B((AppCompatImageView) experimentProfileActivity.u0(R.id.sessionsExistingImage));
                        RobertoTextView robertoTextView = (RobertoTextView) experimentProfileActivity.u0(R.id.sessionsExistingName);
                        if (robertoTextView != null) {
                            Object[] objArr = new Object[2];
                            String firstname = therapistPackagesModel2.getFirstname();
                            if (firstname == null) {
                                firstname = "";
                            }
                            objArr[0] = firstname;
                            String lastname = therapistPackagesModel2.getLastname();
                            if (lastname == null) {
                                lastname = "";
                            }
                            objArr[1] = lastname;
                            robertoTextView.setText(experimentProfileActivity.getString(R.string.profileNewSessionsName, objArr));
                        }
                        int size = therapistPackagesModel2.getEducations().size();
                        String str2 = "";
                        for (int i6 = 0; i6 < size; i6++) {
                            String str3 = str2 + therapistPackagesModel2.getEducations().get(i6).getDegree();
                            if (i6 < therapistPackagesModel2.getEducations().size() - 1) {
                                str3 = str3 + ", ";
                            }
                            str2 = str3;
                        }
                        RobertoTextView robertoTextView2 = (RobertoTextView) experimentProfileActivity.u0(R.id.sessionsExistingQualifications);
                        if (robertoTextView2 != null) {
                            robertoTextView2.setText(str2);
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this.f11597u.f36971z, e10);
                }
            }
            if (fVar2 != null && (therapistPackagesModel = (TherapistPackagesModel) fVar2.f19465v) != null && kotlin.jvm.internal.i.b(LocationPersistence.INSTANCE.getCurrentCountry(), "IN")) {
                ConstraintLayout constraintLayout3 = (ConstraintLayout) experimentProfileActivity.u0(R.id.sessionsContainerNew);
                if (constraintLayout3 != null) {
                    constraintLayout3.setVisibility(8);
                }
                ConstraintLayout constraintLayout4 = (ConstraintLayout) experimentProfileActivity.u0(R.id.couplesSessionsContainerExisting);
                if (constraintLayout4 != null) {
                    constraintLayout4.setVisibility(0);
                }
                Glide.c(experimentProfileActivity).d(experimentProfileActivity).p("https:" + therapistPackagesModel.getImage()).B((AppCompatImageView) experimentProfileActivity.u0(R.id.couplesSessionsExistingImage));
                RobertoTextView robertoTextView3 = (RobertoTextView) experimentProfileActivity.u0(R.id.couplesSessionsExistingName);
                if (robertoTextView3 != null) {
                    Object[] objArr2 = new Object[2];
                    String firstname2 = therapistPackagesModel.getFirstname();
                    if (firstname2 == null) {
                        firstname2 = "";
                    }
                    objArr2[0] = firstname2;
                    String lastname2 = therapistPackagesModel.getLastname();
                    if (lastname2 == null) {
                        lastname2 = "";
                    }
                    objArr2[1] = lastname2;
                    robertoTextView3.setText(experimentProfileActivity.getString(R.string.profileNewSessionsName, objArr2));
                }
                int size2 = therapistPackagesModel.getEducations().size();
                for (int i10 = 0; i10 < size2; i10++) {
                    String str4 = str + therapistPackagesModel.getEducations().get(i10).getDegree();
                    if (i10 < therapistPackagesModel.getEducations().size() - 1) {
                        str4 = str4 + ", ";
                    }
                    str = str4;
                }
                RobertoTextView robertoTextView4 = (RobertoTextView) experimentProfileActivity.u0(R.id.couplesSessionsExistingQualifications);
                if (robertoTextView4 != null) {
                    robertoTextView4.setText(str);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class o extends kotlin.jvm.internal.k implements ss.l<TherapistPackagesModel, hs.k> {
        public o() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(TherapistPackagesModel therapistPackagesModel) {
            TherapistPackagesModel therapistPackagesModel2 = therapistPackagesModel;
            if (therapistPackagesModel2 != null && kotlin.jvm.internal.i.b(LocationPersistence.INSTANCE.getCurrentCountry(), "IN")) {
                ExperimentProfileActivity experimentProfileActivity = ExperimentProfileActivity.this;
                ConstraintLayout constraintLayout = (ConstraintLayout) experimentProfileActivity.u0(R.id.sessionsContainerNew);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) experimentProfileActivity.u0(R.id.psychSessionsContainerExisting);
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(0);
                }
                com.bumptech.glide.f d10 = Glide.c(experimentProfileActivity).d(experimentProfileActivity);
                d10.p("https:" + therapistPackagesModel2.getImage()).B((AppCompatImageView) experimentProfileActivity.u0(R.id.psychSessionsExistingImage));
                RobertoTextView robertoTextView = (RobertoTextView) experimentProfileActivity.u0(R.id.psychSessionsExistingName);
                String str = "";
                if (robertoTextView != null) {
                    Object[] objArr = new Object[2];
                    String firstname = therapistPackagesModel2.getFirstname();
                    if (firstname == null) {
                        firstname = "";
                    }
                    objArr[0] = firstname;
                    String lastname = therapistPackagesModel2.getLastname();
                    if (lastname == null) {
                        lastname = "";
                    }
                    objArr[1] = lastname;
                    robertoTextView.setText(experimentProfileActivity.getString(R.string.profileNewSessionsName, objArr));
                }
                int size = therapistPackagesModel2.getEducations().size();
                for (int i6 = 0; i6 < size; i6++) {
                    StringBuilder c10 = v.h.c(str);
                    c10.append(therapistPackagesModel2.getEducations().get(i6).getDegree());
                    str = c10.toString();
                    if (i6 < therapistPackagesModel2.getEducations().size() - 1) {
                        str = pl.a.f(str, ", ");
                    }
                }
                RobertoTextView robertoTextView2 = (RobertoTextView) experimentProfileActivity.u0(R.id.psychSessionsExistingQualifications);
                if (robertoTextView2 != null) {
                    robertoTextView2.setText(str);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [so.d0] */
    public ExperimentProfileActivity() {
        boolean z10;
        User user;
        HashMap<String, Object> appConfig;
        boolean z11;
        Object obj;
        User user2 = FirebasePersistence.getInstance().getUser();
        Object obj2 = null;
        if (user2 != null) {
            HashMap<String, Object> appConfig2 = user2.getAppConfig();
            if (appConfig2 != null && appConfig2.containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                HashMap<String, Object> appConfig3 = user2.getAppConfig();
                if (appConfig3 != null) {
                    obj = appConfig3.get(Constants.DASHBOARD_LIBRARY_EXPERIMENT);
                } else {
                    obj = null;
                }
                if (!kotlin.jvm.internal.i.b(obj, "default")) {
                    z10 = true;
                    this.K = z10;
                    this.L = new ArrayList<>();
                    androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: so.c0

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ ExperimentProfileActivity f31797v;

                        {
                            this.f31797v = this;
                        }

                        @Override // androidx.activity.result.b
                        public final void b(Object obj3) {
                            int i6 = r2;
                            ExperimentProfileActivity this$0 = this.f31797v;
                            switch (i6) {
                                case 0:
                                    androidx.activity.result.a result = (androidx.activity.result.a) obj3;
                                    int i10 = ExperimentProfileActivity.S;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.f(result, "result");
                                    return;
                                default:
                                    androidx.activity.result.a aVar = (androidx.activity.result.a) obj3;
                                    int i11 = ExperimentProfileActivity.S;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    this$0.setResult(-1, new Intent().putExtra("tele_flow_launched", true));
                                    this$0.finish();
                                    return;
                            }
                        }
                    });
                    kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…yResult(result)\n        }");
                    this.M = registerForActivityResult;
                    this.N = new ViewTreeObserver.OnScrollChangedListener() { // from class: so.d0
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            int i6 = ExperimentProfileActivity.S;
                            ExperimentProfileActivity this$0 = ExperimentProfileActivity.this;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                if (!this$0.K && this$0.C0()) {
                                    this$0.A0();
                                }
                                if (this$0.B0()) {
                                    this$0.z0();
                                }
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e10);
                            }
                        }
                    };
                    androidx.activity.result.c<Intent> registerForActivityResult2 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: so.c0

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ ExperimentProfileActivity f31797v;

                        {
                            this.f31797v = this;
                        }

                        @Override // androidx.activity.result.b
                        public final void b(Object obj3) {
                            int i6 = r2;
                            ExperimentProfileActivity this$0 = this.f31797v;
                            switch (i6) {
                                case 0:
                                    androidx.activity.result.a result = (androidx.activity.result.a) obj3;
                                    int i10 = ExperimentProfileActivity.S;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.f(result, "result");
                                    return;
                                default:
                                    androidx.activity.result.a aVar = (androidx.activity.result.a) obj3;
                                    int i11 = ExperimentProfileActivity.S;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    this$0.setResult(-1, new Intent().putExtra("tele_flow_launched", true));
                                    this$0.finish();
                                    return;
                            }
                        }
                    });
                    kotlin.jvm.internal.i.f(registerForActivityResult2, "registerForActivityResul…       finish()\n        }");
                    this.O = registerForActivityResult2;
                    user = FirebasePersistence.getInstance().getUser();
                    if (user != null && (appConfig = user.getAppConfig()) != null) {
                        obj2 = appConfig.get(Constants.TELE_ENTRY_POINT_EXPERIMENT);
                    }
                    this.Q = kotlin.jvm.internal.i.b(obj2, "f");
                }
            }
        }
        z10 = false;
        this.K = z10;
        this.L = new ArrayList<>();
        androidx.activity.result.c<Intent> registerForActivityResult3 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: so.c0

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ExperimentProfileActivity f31797v;

            {
                this.f31797v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj3) {
                int i6 = r2;
                ExperimentProfileActivity this$0 = this.f31797v;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a result = (androidx.activity.result.a) obj3;
                        int i10 = ExperimentProfileActivity.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        kotlin.jvm.internal.i.f(result, "result");
                        return;
                    default:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj3;
                        int i11 = ExperimentProfileActivity.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.setResult(-1, new Intent().putExtra("tele_flow_launched", true));
                        this$0.finish();
                        return;
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult3, "registerForActivityResul…yResult(result)\n        }");
        this.M = registerForActivityResult3;
        this.N = new ViewTreeObserver.OnScrollChangedListener() { // from class: so.d0
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                int i6 = ExperimentProfileActivity.S;
                ExperimentProfileActivity this$0 = ExperimentProfileActivity.this;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    if (!this$0.K && this$0.C0()) {
                        this$0.A0();
                    }
                    if (this$0.B0()) {
                        this$0.z0();
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f11575w, e10);
                }
            }
        };
        androidx.activity.result.c<Intent> registerForActivityResult22 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: so.c0

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ExperimentProfileActivity f31797v;

            {
                this.f31797v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj3) {
                int i6 = r2;
                ExperimentProfileActivity this$0 = this.f31797v;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a result = (androidx.activity.result.a) obj3;
                        int i10 = ExperimentProfileActivity.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        kotlin.jvm.internal.i.f(result, "result");
                        return;
                    default:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj3;
                        int i11 = ExperimentProfileActivity.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.setResult(-1, new Intent().putExtra("tele_flow_launched", true));
                        this$0.finish();
                        return;
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult22, "registerForActivityResul…       finish()\n        }");
        this.O = registerForActivityResult22;
        user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            obj2 = appConfig.get(Constants.TELE_ENTRY_POINT_EXPERIMENT);
        }
        this.Q = kotlin.jvm.internal.i.b(obj2, "f");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:13|(4:(1:15)(2:48|(1:50)(9:51|(1:53)|17|18|19|20|21|22|23))|21|22|23)|16|17|18|19|20|11) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
        r15 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void v0(final long j10, final ExperimentProfileActivity experimentProfileActivity, final RobertoTextView robertoTextView) {
        long j11;
        T t3;
        T t10;
        T t11;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        Handler handler;
        long j12;
        ArrayList<Handler> arrayList = experimentProfileActivity.L;
        String str = experimentProfileActivity.f11575w;
        try {
            if (j10 == 1) {
                Handler handler2 = new Handler(Looper.getMainLooper());
                handler2.postDelayed(new Runnable() { // from class: so.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = r5;
                        RobertoTextView robertoTextView2 = robertoTextView;
                        ExperimentProfileActivity this$0 = experimentProfileActivity;
                        long j13 = j10;
                        switch (i6) {
                            case 0:
                                int i10 = ExperimentProfileActivity.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (robertoTextView2 != null) {
                                    try {
                                        robertoTextView2.setText(String.valueOf(j13));
                                        return;
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(this$0.f11575w, e10);
                                        return;
                                    }
                                }
                                return;
                            default:
                                int i11 = ExperimentProfileActivity.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (robertoTextView2 != null) {
                                    try {
                                        robertoTextView2.setText(String.valueOf(j13 + 1));
                                        return;
                                    } catch (Exception e11) {
                                        LogHelper.INSTANCE.e(this$0.f11575w, e11);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                }, 150L);
                arrayList.add(handler2);
                return;
            }
            int i6 = 100;
            int i10 = k.d.DEFAULT_DRAG_ANIMATION_DURATION;
            int i11 = 350;
            long j13 = 100;
            if (j10 < 25) {
                Handler handler3 = new Handler(Looper.getMainLooper());
                long j14 = 1;
                while (j14 < j10) {
                    long j15 = j14 * j13;
                    long j16 = j10 - j14;
                    try {
                        if (j16 == 3) {
                            j12 = i6;
                        } else if (j16 == 2) {
                            j12 = i10;
                        } else {
                            if (j16 == 1) {
                                j12 = i11;
                            }
                            final long j17 = j14;
                            handler = handler3;
                            handler.postDelayed(new Runnable() { // from class: so.e0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i62 = r5;
                                    RobertoTextView robertoTextView2 = robertoTextView;
                                    ExperimentProfileActivity this$0 = experimentProfileActivity;
                                    long j132 = j17;
                                    switch (i62) {
                                        case 0:
                                            int i102 = ExperimentProfileActivity.S;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (robertoTextView2 != null) {
                                                try {
                                                    robertoTextView2.setText(String.valueOf(j132));
                                                    return;
                                                } catch (Exception e10) {
                                                    LogHelper.INSTANCE.e(this$0.f11575w, e10);
                                                    return;
                                                }
                                            }
                                            return;
                                        default:
                                            int i112 = ExperimentProfileActivity.S;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (robertoTextView2 != null) {
                                                try {
                                                    robertoTextView2.setText(String.valueOf(j132 + 1));
                                                    return;
                                                } catch (Exception e11) {
                                                    LogHelper.INSTANCE.e(this$0.f11575w, e11);
                                                    return;
                                                }
                                            }
                                            return;
                                    }
                                }
                            }, j15);
                            j14++;
                            handler3 = handler;
                            i6 = 100;
                            i10 = k.d.DEFAULT_DRAG_ANIMATION_DURATION;
                            i11 = 350;
                            j13 = 100;
                        }
                        handler.postDelayed(new Runnable() { // from class: so.e0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i62 = r5;
                                RobertoTextView robertoTextView2 = robertoTextView;
                                ExperimentProfileActivity this$0 = experimentProfileActivity;
                                long j132 = j17;
                                switch (i62) {
                                    case 0:
                                        int i102 = ExperimentProfileActivity.S;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        if (robertoTextView2 != null) {
                                            try {
                                                robertoTextView2.setText(String.valueOf(j132));
                                                return;
                                            } catch (Exception e10) {
                                                LogHelper.INSTANCE.e(this$0.f11575w, e10);
                                                return;
                                            }
                                        }
                                        return;
                                    default:
                                        int i112 = ExperimentProfileActivity.S;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        if (robertoTextView2 != null) {
                                            try {
                                                robertoTextView2.setText(String.valueOf(j132 + 1));
                                                return;
                                            } catch (Exception e11) {
                                                LogHelper.INSTANCE.e(this$0.f11575w, e11);
                                                return;
                                            }
                                        }
                                        return;
                                }
                            }
                        }, j15);
                        j14++;
                        handler3 = handler;
                        i6 = 100;
                        i10 = k.d.DEFAULT_DRAG_ANIMATION_DURATION;
                        i11 = 350;
                        j13 = 100;
                    } catch (Exception e10) {
                        e = e10;
                        Exception exc = e;
                        if (robertoTextView != null) {
                            try {
                                robertoTextView.setText(String.valueOf(j10));
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(str, e11);
                            }
                        }
                        LogHelper.INSTANCE.e(str, exc);
                        arrayList.add(handler);
                        if (robertoTextView == null) {
                            return;
                        }
                        return;
                    }
                    j15 += j12;
                    final long j172 = j14;
                    handler = handler3;
                }
                handler = handler3;
                arrayList.add(handler);
            } else {
                Handler handler4 = new Handler(Looper.getMainLooper());
                for (int i12 = 1; i12 < 16; i12++) {
                    try {
                        x xVar = new x();
                        if (i12 == 15) {
                            j11 = j10;
                        } else {
                            j11 = (j10 / 15) * i12;
                        }
                        ?? valueOf = String.valueOf(j11);
                        xVar.f23469u = valueOf;
                        if (Long.parseLong(valueOf) > 999) {
                            String substring = ((String) xVar.f23469u).substring(0, ((String) t3).length() - 3);
                            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            char charAt = ((String) xVar.f23469u).charAt(((String) t10).length() - 3);
                            if (Long.parseLong(String.valueOf(charAt)) != 0) {
                                t11 = substring + '.' + charAt + 'k';
                            } else {
                                t11 = substring + 'k';
                            }
                            xVar.f23469u = t11;
                        }
                        long j18 = i12 * 100;
                        switch (i12) {
                            case 13:
                                j18 += 100;
                                break;
                            case 14:
                                j18 += (long) k.d.DEFAULT_DRAG_ANIMATION_DURATION;
                                break;
                            case 15:
                                j18 += 350;
                        }
                        handler4.postDelayed(new ni.c(12, robertoTextView, xVar, experimentProfileActivity), j18);
                    } catch (Exception e12) {
                        if (robertoTextView != null) {
                            try {
                                robertoTextView.setText(String.valueOf(j10));
                            } catch (Exception e13) {
                                LogHelper.INSTANCE.e(str, e13);
                            }
                        }
                        LogHelper.INSTANCE.e(str, e12);
                    }
                }
                arrayList.add(handler4);
            }
            if (robertoTextView == null && (animate = robertoTextView.animate()) != null && (alpha = animate.alpha(1.0f)) != null) {
                alpha.setDuration(450L);
            }
        } catch (Exception e14) {
            LogHelper.INSTANCE.e(str, e14);
        }
    }

    public final void A0() {
        long j10;
        try {
            if (this.f11576x) {
                return;
            }
            this.f11576x = true;
            w0();
            Set<View> keySet = this.f11578z.keySet();
            kotlin.jvm.internal.i.f(keySet, "progMap.keys");
            int i6 = 0;
            for (Object obj : keySet) {
                int i10 = i6 + 1;
                if (i6 >= 0) {
                    Handler handler = new Handler(Looper.getMainLooper());
                    nn.f fVar = new nn.f(this, 2, (View) obj);
                    if (i6 != 0) {
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    if (i6 != 4) {
                                        j10 = 700;
                                    } else {
                                        j10 = 600;
                                    }
                                } else {
                                    j10 = 500;
                                }
                            } else {
                                j10 = 400;
                            }
                        } else {
                            j10 = 300;
                        }
                    } else {
                        j10 = 200;
                    }
                    handler.postDelayed(fVar, j10);
                    this.L.add(handler);
                    i6 = i10;
                } else {
                    ca.a.t1();
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11575w, e10);
        }
    }

    public final boolean B0() {
        boolean z10;
        try {
            if (((ProgressBar) u0(R.id.profileHappinessPointsProgress)) != null) {
                ProgressBar progressBar = (ProgressBar) u0(R.id.profileHappinessPointsProgress);
                if (progressBar != null && !progressBar.isShown()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    Rect rect = new Rect();
                    ProgressBar progressBar2 = (ProgressBar) u0(R.id.profileHappinessPointsProgress);
                    if (progressBar2 != null) {
                        progressBar2.getGlobalVisibleRect(rect);
                    }
                    return rect.intersect(new Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels));
                }
            }
            return false;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11575w, e10);
            return false;
        }
    }

    public final boolean C0() {
        try {
            if (u0(R.id.emptyView3) == null) {
                return false;
            }
            Rect rect = new Rect();
            View u02 = u0(R.id.emptyView3);
            if (u02 != null) {
                u02.getGlobalVisibleRect(rect);
            }
            return rect.intersect(new Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11575w, e10);
            return false;
        }
    }

    public final void D0() {
        n0 n0Var = this.H;
        if (n0Var != null) {
            n0Var.O.e(this, new b0(2, new a()));
            ((ConstraintLayout) u0(R.id.clProfileBookmarkingActivities)).setVisibility(8);
            ((ProgressBar) u0(R.id.pbProfileBookmarkingExperiment)).setVisibility(0);
            v.H(kc.f.H(n0Var), null, 0, new i0(n0Var, null), 3);
        }
    }

    public final void E0() {
        String str;
        boolean z10;
        Object obj;
        String string;
        String str2;
        String str3;
        String str4;
        String str5;
        String lastName;
        String firstName;
        ViewTreeObserver viewTreeObserver;
        String str6 = this.f11575w;
        try {
            ScrollView scrollView = (ScrollView) u0(R.id.profileParentScroll);
            if (scrollView != null) {
                scrollView.setOnTouchListener(new dc.h(5, this));
            }
            if (!kotlin.jvm.internal.i.b(LocationPersistence.INSTANCE.getCurrentCountry(), "IN")) {
                RobertoTextView robertoTextView = (RobertoTextView) u0(R.id.tvProfileTherapistTitle);
                if (robertoTextView != null) {
                    robertoTextView.setVisibility(8);
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) u0(R.id.sessionsContainerExisting);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) u0(R.id.couplesSessionsContainerExisting);
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(8);
                }
                ConstraintLayout constraintLayout3 = (ConstraintLayout) u0(R.id.psychSessionsContainerExisting);
                if (constraintLayout3 != null) {
                    constraintLayout3.setVisibility(8);
                }
                ConstraintLayout constraintLayout4 = (ConstraintLayout) u0(R.id.sessionsContainerNew);
                if (constraintLayout4 != null) {
                    constraintLayout4.setVisibility(8);
                }
            }
            try {
                getWindow().setStatusBarColor(g0.a.b(this, R.color.title_high_contrast));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str6, "Error in setting custom status bar", e10);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) u0(R.id.header_arrow_back);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new a0(this, 3));
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) u0(R.id.tvProfileName);
            String str7 = null;
            if (robertoTextView2 != null) {
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
                String str8 = "";
                if (!z10) {
                    User user2 = FirebasePersistence.getInstance().getUser();
                    if (user2 != null && (firstName = user2.getFirstName()) != null) {
                        str2 = r.i1(firstName).toString();
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
                                str5 = r.i1(lastName).toString();
                            } else {
                                str5 = null;
                            }
                            if (!kotlin.jvm.internal.i.b(str5, "null")) {
                                str8 = " " + FirebasePersistence.getInstance().getUser().getLastName();
                            }
                        }
                        sb2.append(str8);
                        string = sb2.toString();
                        robertoTextView2.setText(string);
                    }
                }
                Object[] objArr = new Object[2];
                String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
                kotlin.jvm.internal.i.f(stringValue, "getInstance()\n          …ionManager.KEY_FIRSTNAME)");
                if (kotlin.jvm.internal.i.b(r.i1(stringValue).toString(), "null")) {
                    obj = "";
                } else {
                    obj = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
                }
                objArr[0] = obj;
                String stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_LASTNAME);
                kotlin.jvm.internal.i.f(stringValue2, "getInstance()\n          …sionManager.KEY_LASTNAME)");
                if (!kotlin.jvm.internal.i.b(r.i1(stringValue2).toString(), "null")) {
                    str8 = SessionManager.getInstance().getStringValue(SessionManager.KEY_LASTNAME);
                }
                objArr[1] = str8;
                string = getString(R.string.profileNewSessionsName, objArr);
                robertoTextView2.setText(string);
            }
            BottomSheetBehavior from = BottomSheetBehavior.from((ConstraintLayout) u0(R.id.profileBottomSheet));
            from.setPeekHeight(0);
            from.setState(4);
            from.addBottomSheetCallback(new p());
            View u02 = u0(R.id.blanketView);
            if (u02 != null) {
                u02.setOnClickListener(new a0(this, 4));
            }
            ConstraintLayout constraintLayout5 = (ConstraintLayout) u0(R.id.progressContainerSubscriptionPrompt);
            if (constraintLayout5 != null) {
                constraintLayout5.setOnClickListener(new a0(this, 5));
            }
            RobertoButton robertoButton = (RobertoButton) u0(R.id.sessionsNewCta);
            if (robertoButton != null) {
                robertoButton.setOnClickListener(new a0(this, 6));
            }
            RobertoButton robertoButton2 = (RobertoButton) u0(R.id.sessionsExistingCta);
            if (robertoButton2 != null) {
                robertoButton2.setOnClickListener(DebouncedOnClickListener.wrap(new a0(this, 7)));
            }
            RobertoButton robertoButton3 = (RobertoButton) u0(R.id.couplesSessionsExistingCta);
            if (robertoButton3 != null) {
                robertoButton3.setOnClickListener(DebouncedOnClickListener.wrap(new a0(this, 8)));
            }
            RobertoButton robertoButton4 = (RobertoButton) u0(R.id.psychSessionsExistingCta);
            if (robertoButton4 != null) {
                robertoButton4.setOnClickListener(DebouncedOnClickListener.wrap(new a0(this, 9)));
            }
            a0 a0Var = new a0(this, 10);
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) u0(R.id.ivProfilePointsInfo);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setOnClickListener(DebouncedOnClickListener.wrap(a0Var));
            }
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) u0(R.id.ivProfileEdit);
            if (appCompatImageView3 != null) {
                appCompatImageView3.setOnClickListener(new a0(this, 11));
            }
            CircleImageView circleImageView = (CircleImageView) u0(R.id.ivProfileImage);
            if (circleImageView != null) {
                circleImageView.setOnClickListener(new a0(this, 0));
            }
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) u0(R.id.profileBottomSheetImageClose);
            if (appCompatImageView4 != null) {
                appCompatImageView4.setOnClickListener(new a0(this, 1));
            }
            AppCompatImageView appCompatImageView5 = (AppCompatImageView) u0(R.id.header_icon_notification);
            if (appCompatImageView5 != null) {
                appCompatImageView5.setOnClickListener(new a0(this, 2));
            }
            if (this.K) {
                this.f11576x = true;
                LinearLayout linearLayout = (LinearLayout) u0(R.id.progressContainer);
                if (linearLayout != null) {
                    linearLayout.removeAllViews();
                }
                RobertoTextView robertoTextView3 = (RobertoTextView) u0(R.id.tvProfileProgressTitle);
                if (robertoTextView3 != null) {
                    robertoTextView3.setVisibility(8);
                }
            }
            e0 e0Var = new e0();
            Application application = getApplication();
            kotlin.jvm.internal.i.f(application, "application");
            l0 a10 = new o0(this, new kk.c(e0Var, application)).a(n0.class);
            n0 n0Var = (n0) a10;
            n0Var.A.e(this, new ko.b(18, new g()));
            n0Var.B.e(this, new ko.b(19, new h()));
            n0Var.C.e(this, new ko.b(20, new i()));
            n0Var.D.e(this, new ko.b(21, new j()));
            n0Var.E.e(this, new ko.b(22, new k()));
            n0Var.F.e(this, new ko.b(23, new l()));
            n0Var.G.e(this, new ko.b(24, new m(n0Var)));
            n0Var.J.e(this, new ko.b(25, new n(this, n0Var)));
            n0Var.K.e(this, new ko.b(26, new o()));
            n0Var.H.e(this, new ko.b(27, new b(n0Var)));
            n0Var.I.e(this, new ko.b(28, new c(n0Var)));
            n0Var.M.e(this, new ko.b(29, new d(n0Var)));
            n0Var.N.e(this, new b0(0, new e(n0Var)));
            n0Var.L.e(this, new b0(1, new f()));
            v.H(kc.f.H(n0Var), null, 0, new j0(n0Var, null), 3);
            this.H = (n0) a10;
            ScrollView scrollView2 = (ScrollView) u0(R.id.profileParentScroll);
            if (scrollView2 != null && (viewTreeObserver = scrollView2.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnScrollChangedListener(this.N);
            }
            String[] strArr = {Constants.COURSE_ADHD, Constants.COURSE_OCD, Constants.COURSE_GENERIC};
            User user6 = FirebasePersistence.getInstance().getUser();
            if (user6 != null) {
                str7 = user6.getCurrentCourseName();
            }
            if (is.k.Q1(str7, strArr)) {
                View u03 = u0(R.id.bookmarkedActivityExperiment);
                if (u03 != null) {
                    u03.setVisibility(8);
                }
                RobertoTextView robertoTextView4 = (RobertoTextView) u0(R.id.tvProfileProgressTitle);
                if (robertoTextView4 != null) {
                    robertoTextView4.setVisibility(8);
                }
                View u04 = u0(R.id.emptyView3);
                if (u04 != null) {
                    u04.setVisibility(8);
                }
                LinearLayout linearLayout2 = (LinearLayout) u0(R.id.progressContainer);
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str6, e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c3, code lost:
        if (r7 != false) goto L157;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0(Integer[] numArr, boolean z10) {
        String str;
        String str2;
        boolean z11;
        boolean z12;
        boolean z13;
        int i6;
        String str3;
        int i10;
        String str4;
        int i11;
        ConstraintLayout constraintLayout;
        boolean z14;
        boolean z15;
        boolean z16;
        int i12 = R.id.progressContainer;
        try {
            LinearLayout linearLayout = (LinearLayout) u0(R.id.progressContainer);
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            int length = numArr.length;
            boolean z17 = false;
            int i13 = 0;
            int i14 = 0;
            while (i13 < length) {
                int i15 = i14 + 1;
                int intValue = numArr[i13].intValue();
                if (intValue != -1) {
                    View inflate = getLayoutInflater().inflate(R.layout.row_profile_new_progress, (LinearLayout) u0(i12), z17);
                    RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.tvProfileProgressRowTitle);
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 != 2) {
                                if (i14 != 3) {
                                    if (i14 != 4) {
                                        if (i14 != 5) {
                                            str = "";
                                        } else {
                                            str = Constants.COURSE_WORRY_DN;
                                        }
                                    } else {
                                        str = Constants.COURSE_STRESS_DN;
                                    }
                                } else {
                                    str = Constants.COURSE_SLEEP_DN;
                                }
                            } else {
                                str = Constants.COURSE_HAPPINESS_DN;
                            }
                        } else {
                            str = Constants.COURSE_DEPRESSION_DN;
                        }
                    } else {
                        str = Constants.COURSE_ANGER_DN;
                    }
                    robertoTextView.setText(str);
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null) {
                        str2 = user.getVersion();
                    } else {
                        str2 = null;
                    }
                    if (kotlin.jvm.internal.i.b(str2, Constants.USER_VERSION)) {
                        if (intValue >= 0 && intValue < 9) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            if (9 <= intValue && intValue < 16) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (!z15) {
                                if (16 <= intValue && intValue < 24) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    i6 = 3;
                                }
                                i6 = 4;
                            } else {
                                i6 = 2;
                            }
                        } else {
                            i6 = 1;
                        }
                    } else {
                        if (intValue >= 0 && intValue < 7) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            if (7 <= intValue && intValue < 14) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                if (14 <= intValue && intValue < 21) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            }
                            i6 = 2;
                        }
                        i6 = 1;
                    }
                    User user2 = FirebasePersistence.getInstance().getUser();
                    if (user2 != null) {
                        str3 = user2.getVersion();
                    } else {
                        str3 = null;
                    }
                    if (kotlin.jvm.internal.i.b(str3, Constants.USER_VERSION)) {
                        if (!is.k.Q1(Integer.valueOf(intValue), new Integer[]{0, 1})) {
                            if (!is.k.Q1(Integer.valueOf(intValue), new Integer[]{2, 9, 16, 17, 24})) {
                                if (!is.k.Q1(Integer.valueOf(intValue), new Integer[]{3, 10, 18, 25})) {
                                    if (!is.k.Q1(Integer.valueOf(intValue), new Integer[]{4, 11, 19, 26})) {
                                        if (!is.k.Q1(Integer.valueOf(intValue), new Integer[]{5, 12, 20, 27})) {
                                            if (!is.k.Q1(Integer.valueOf(intValue), new Integer[]{6, 13, 21, 28})) {
                                                if (!is.k.Q1(Integer.valueOf(intValue), new Integer[]{7, 14, 22, 29})) {
                                                    if (is.k.Q1(Integer.valueOf(intValue), new Integer[]{8, 15, 23, 30, 31})) {
                                                        i10 = 7;
                                                    }
                                                } else {
                                                    i10 = 6;
                                                }
                                            } else {
                                                i10 = 5;
                                            }
                                        } else {
                                            i10 = 4;
                                        }
                                    } else {
                                        i10 = 3;
                                    }
                                } else {
                                    i10 = 2;
                                }
                            } else {
                                i10 = 1;
                            }
                        }
                        i10 = 0;
                    } else {
                        if (!is.k.Q1(Integer.valueOf(intValue), new Integer[]{0, 1, 8, 15, 22})) {
                            if (!is.k.Q1(Integer.valueOf(intValue), new Integer[]{2, 9, 16, 23})) {
                                if (!is.k.Q1(Integer.valueOf(intValue), new Integer[]{3, 10, 17, 24})) {
                                    if (!is.k.Q1(Integer.valueOf(intValue), new Integer[]{4, 11, 18, 25})) {
                                        if (!is.k.Q1(Integer.valueOf(intValue), new Integer[]{5, 12, 19, 26})) {
                                            if (!is.k.Q1(Integer.valueOf(intValue), new Integer[]{6, 13, 20, 27})) {
                                                is.k.Q1(Integer.valueOf(intValue), new Integer[]{7, 14, 21, 28});
                                                i10 = 7;
                                            }
                                            i10 = 6;
                                        }
                                        i10 = 5;
                                    }
                                    i10 = 4;
                                }
                                i10 = 3;
                            }
                            i10 = 2;
                        }
                        i10 = 1;
                    }
                    User user3 = FirebasePersistence.getInstance().getUser();
                    if (user3 != null) {
                        str4 = user3.getVersion();
                    } else {
                        str4 = null;
                    }
                    if (kotlin.jvm.internal.i.b(str4, Constants.USER_VERSION) && is.k.Q1(Integer.valueOf(intValue), new Integer[]{0, 14})) {
                        i11 = i10 - 1;
                    } else {
                        i11 = i10;
                    }
                    RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.tvProfileProgressRowDayAndWeek);
                    if (robertoTextView2 != null) {
                        robertoTextView2.setText(getString(R.string.profileNewProgressWeekDay, String.valueOf(i6), String.valueOf(i10)));
                    }
                    ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.profileProgressRowProgress);
                    if (progressBar != null) {
                        progressBar.setMax(700);
                    }
                    if (z10) {
                        ProgressBar progressBar2 = (ProgressBar) inflate.findViewById(R.id.profileProgressRowProgress);
                        if (progressBar2 != null) {
                            progressBar2.setProgress(i11 * 100);
                        }
                    } else {
                        HashMap<View, Integer> hashMap = this.f11578z;
                        ProgressBar profileProgressRowProgress = (ProgressBar) inflate.findViewById(R.id.profileProgressRowProgress);
                        kotlin.jvm.internal.i.f(profileProgressRowProgress, "profileProgressRowProgress");
                        hashMap.put(profileProgressRowProgress, Integer.valueOf(i11 * 100));
                    }
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 == 4 && (constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.postProgressDotContainer)) != null) {
                                    constraintLayout.setVisibility(8);
                                }
                            } else {
                                AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.preProgressCircle3);
                                if (appCompatImageView != null) {
                                    appCompatImageView.setVisibility(8);
                                }
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) inflate.findViewById(R.id.postProgressCircle2);
                                if (appCompatImageView2 != null) {
                                    appCompatImageView2.setVisibility(8);
                                }
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) inflate.findViewById(R.id.postProgressCircle3);
                                if (appCompatImageView3 != null) {
                                    appCompatImageView3.setVisibility(8);
                                }
                            }
                        } else {
                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) inflate.findViewById(R.id.preProgressCircle2);
                            if (appCompatImageView4 != null) {
                                appCompatImageView4.setVisibility(8);
                            }
                            AppCompatImageView appCompatImageView5 = (AppCompatImageView) inflate.findViewById(R.id.preProgressCircle3);
                            if (appCompatImageView5 != null) {
                                appCompatImageView5.setVisibility(8);
                            }
                            AppCompatImageView appCompatImageView6 = (AppCompatImageView) inflate.findViewById(R.id.postProgressCircle3);
                            if (appCompatImageView6 != null) {
                                appCompatImageView6.setVisibility(8);
                            }
                        }
                    } else {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate.findViewById(R.id.preProgressDotContainer);
                        if (constraintLayout2 != null) {
                            constraintLayout2.setVisibility(8);
                        }
                    }
                    i12 = R.id.progressContainer;
                    ((LinearLayout) u0(R.id.progressContainer)).addView(inflate);
                }
                i13++;
                i14 = i15;
                z17 = false;
            }
            if (!z10 && C0()) {
                A0();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11575w, e10);
        }
    }

    public final void G0() {
        try {
            WindowManager.LayoutParams layoutParams = null;
            gk.a.b(null, "new_profile_inpage_popup_shown");
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_new_profile_popup, this, R.style.Theme_Dialog);
            Window window = styledDialog.getWindow();
            if (window != null) {
                layoutParams = window.getAttributes();
            }
            if (layoutParams != null) {
                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
            }
            ((ConstraintLayout) styledDialog.findViewById(R.id.clNewProfileDialogGotIt)).setOnClickListener(new lm.f(styledDialog, 22));
            styledDialog.show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11575w, e10);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        String str;
        boolean z10;
        super.onActivityResult(i6, i10, intent);
        int i11 = this.C;
        String str2 = this.f11575w;
        if (i6 == i11 && i10 == -1) {
            if (intent != null) {
                try {
                    if (intent.getBooleanExtra("purchase_successful", false)) {
                        F0(this.B, true);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str2, e10);
                }
            }
        } else if (i6 == this.D && i10 == -1) {
            try {
                RobertoTextView robertoTextView = (RobertoTextView) u0(R.id.tvProfileName);
                if (robertoTextView != null) {
                    Object[] objArr = new Object[2];
                    String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
                    kotlin.jvm.internal.i.f(stringValue, "getInstance()\n          …ionManager.KEY_FIRSTNAME)");
                    String str3 = "";
                    if (kotlin.jvm.internal.i.b(r.i1(stringValue).toString(), "null")) {
                        str = "";
                    } else {
                        str = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
                    }
                    objArr[0] = str;
                    String stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_LASTNAME);
                    kotlin.jvm.internal.i.f(stringValue2, "getInstance()\n          …sionManager.KEY_LASTNAME)");
                    if (!kotlin.jvm.internal.i.b(r.i1(stringValue2).toString(), "null")) {
                        str3 = SessionManager.getInstance().getStringValue(SessionManager.KEY_LASTNAME);
                    }
                    objArr[1] = str3;
                    robertoTextView.setText(getString(R.string.profileNewSessionsName, objArr));
                }
                if (intent != null && intent.getBooleanExtra("avatarAssetUploaded", false)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n0 n0Var = this.H;
                if (n0Var != null) {
                    v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23640a), null, 0, new wo.h0(n0Var, z10, null), 3);
                }
                this.E = true;
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(str2, e11);
            }
        }
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.I) {
            x0();
        } else if (BottomSheetBehavior.from((ConstraintLayout) u0(R.id.profileBottomSheet)).getState() == 3) {
            try {
                BottomSheetBehavior.from((ConstraintLayout) u0(R.id.profileBottomSheet)).setState(4);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f11575w, e10);
            }
        } else {
            if (this.E) {
                setResult(-1, new Intent());
            }
            finish();
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView(R.layout.activity_experiment_profile);
            this.P = new vo.b();
            E0();
            if (ApplicationPersistence.getInstance().getBooleanValue(Constants.IS_OLD_PROFILE, false)) {
                G0();
                HashMap<String, Object> appConfig = FirebasePersistence.getInstance().getUser().getAppConfig();
                if (appConfig != null) {
                    appConfig.put("profile_experiment", Boolean.TRUE);
                }
                FirebasePersistence.getInstance().updateUserOnFirebase();
                ApplicationPersistence.getInstance().setBooleanValue(Constants.IS_OLD_PROFILE, false);
                gk.a.b(null, "new_profile_assigned");
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11575w, e10);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        ArrayList<Handler> arrayList = this.L;
        for (Handler handler : arrayList) {
            handler.removeCallbacksAndMessages(null);
        }
        arrayList.clear();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            vo.b bVar = this.P;
            String str = null;
            if (bVar != null) {
                bVar.f35293b = this;
                if (!this.K) {
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null) {
                        str = user.getVersion();
                    }
                    if (kotlin.jvm.internal.i.b(str, Constants.USER_VERSION)) {
                        if (!is.k.Q1(FirebasePersistence.getInstance().getUser().getCurrentCourseName(), new String[]{Constants.COURSE_ADHD, Constants.COURSE_OCD, Constants.COURSE_GENERIC})) {
                            D0();
                            u0(R.id.bookmarkedActivityExperiment).setVisibility(0);
                            return;
                        }
                    }
                }
                u0(R.id.bookmarkedActivityExperiment).setVisibility(8);
                return;
            }
            kotlin.jvm.internal.i.q("experimentProfileUtils");
            throw null;
        } catch (Exception e10) {
            super.onResume();
            LogHelper.INSTANCE.e(this.f11575w, e10);
        }
    }

    public final View u0(int i6) {
        LinkedHashMap linkedHashMap = this.R;
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

    public final void w0() {
        boolean z10;
        ScrollView scrollView;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        try {
            ScrollView scrollView2 = (ScrollView) u0(R.id.profileParentScroll);
            if (scrollView2 != null && (viewTreeObserver2 = scrollView2.getViewTreeObserver()) != null) {
                z10 = true;
                if (viewTreeObserver2.isAlive()) {
                    if (!z10 && this.f11577y && this.f11576x && (scrollView = (ScrollView) u0(R.id.profileParentScroll)) != null && (viewTreeObserver = scrollView.getViewTreeObserver()) != null) {
                        viewTreeObserver.removeOnScrollChangedListener(this.N);
                        return;
                    }
                    return;
                }
            }
            z10 = false;
            if (!z10) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11575w, e10);
        }
    }

    public final void x0() {
        try {
            Fragment F = getSupportFragmentManager().F("notifFrag");
            if (F != null) {
                y supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.o(F);
                aVar.j();
            }
            FrameLayout frameLayout = (FrameLayout) u0(R.id.notificationsContainer);
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            this.I = false;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11575w, e10);
        }
    }

    public final Course y0() {
        Course course = this.F;
        if (course != null) {
            return course;
        }
        kotlin.jvm.internal.i.q("course");
        throw null;
    }

    public final void z0() {
        try {
            this.f11577y = true;
            w0();
            ObjectAnimator ofInt = ObjectAnimator.ofInt((ProgressBar) u0(R.id.profileHappinessPointsProgress), Constants.SCREEN_PROGRESS, 0, this.A * 50);
            ofInt.setDuration(1000L);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.start();
            Handler handler = new Handler(Looper.getMainLooper());
            handler.postDelayed(new Runnable(this) { // from class: so.g0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentProfileActivity f31813v;

                {
                    this.f31813v = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ViewPropertyAnimator animate;
                    ViewPropertyAnimator alpha;
                    ViewPropertyAnimator animate2;
                    ViewPropertyAnimator alpha2;
                    ViewPropertyAnimator animate3;
                    ViewPropertyAnimator alpha3;
                    ViewPropertyAnimator animate4;
                    ViewPropertyAnimator alpha4;
                    ViewPropertyAnimator animate5;
                    ViewPropertyAnimator alpha5;
                    ViewPropertyAnimator animate6;
                    ViewPropertyAnimator alpha6;
                    ViewPropertyAnimator animate7;
                    ViewPropertyAnimator alpha7;
                    ViewPropertyAnimator animate8;
                    ViewPropertyAnimator alpha8;
                    int i6 = r2;
                    float f2 = -1.0f;
                    ExperimentProfileActivity this$0 = this.f31813v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView = (AppCompatImageView) this$0.u0(R.id.badgeImage1);
                                if (appCompatImageView != null && (animate2 = appCompatImageView.animate()) != null) {
                                    View u02 = this$0.u0(R.id.emptyView1);
                                    if (u02 != null) {
                                        f2 = u02.getY();
                                    }
                                    ViewPropertyAnimator y10 = animate2.y(f2);
                                    if (y10 != null && (alpha2 = y10.alpha(1.0f)) != null) {
                                        alpha2.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e10);
                                return;
                            }
                        case 1:
                            int i11 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0.u0(R.id.badgeImage2);
                                if (appCompatImageView2 != null && (animate3 = appCompatImageView2.animate()) != null) {
                                    View u03 = this$0.u0(R.id.emptyView1);
                                    if (u03 != null) {
                                        f2 = u03.getY();
                                    }
                                    ViewPropertyAnimator y11 = animate3.y(f2);
                                    if (y11 != null && (alpha3 = y11.alpha(1.0f)) != null) {
                                        alpha3.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e11);
                                return;
                            }
                        case 2:
                            int i12 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) this$0.u0(R.id.badgeImage3);
                                if (appCompatImageView3 != null && (animate4 = appCompatImageView3.animate()) != null) {
                                    View u04 = this$0.u0(R.id.emptyView1);
                                    if (u04 != null) {
                                        f2 = u04.getY();
                                    }
                                    ViewPropertyAnimator y12 = animate4.y(f2);
                                    if (y12 != null && (alpha4 = y12.alpha(1.0f)) != null) {
                                        alpha4.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e12) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e12);
                                return;
                            }
                        case 3:
                            int i13 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) this$0.u0(R.id.badgeImage4);
                                if (appCompatImageView4 != null && (animate5 = appCompatImageView4.animate()) != null) {
                                    View u05 = this$0.u0(R.id.emptyView1);
                                    if (u05 != null) {
                                        f2 = u05.getY();
                                    }
                                    ViewPropertyAnimator y13 = animate5.y(f2);
                                    if (y13 != null && (alpha5 = y13.alpha(1.0f)) != null) {
                                        alpha5.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e13) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e13);
                                return;
                            }
                        case 4:
                            int i14 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) this$0.u0(R.id.badgeImage5);
                                if (appCompatImageView5 != null && (animate6 = appCompatImageView5.animate()) != null) {
                                    View u06 = this$0.u0(R.id.emptyView2);
                                    if (u06 != null) {
                                        f2 = u06.getY();
                                    }
                                    ViewPropertyAnimator y14 = animate6.y(f2);
                                    if (y14 != null && (alpha6 = y14.alpha(1.0f)) != null) {
                                        alpha6.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e14) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e14);
                                return;
                            }
                        case 5:
                            int i15 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) this$0.u0(R.id.badgeImage6);
                                if (appCompatImageView6 != null && (animate7 = appCompatImageView6.animate()) != null) {
                                    View u07 = this$0.u0(R.id.emptyView2);
                                    if (u07 != null) {
                                        f2 = u07.getY();
                                    }
                                    ViewPropertyAnimator y15 = animate7.y(f2);
                                    if (y15 != null && (alpha7 = y15.alpha(1.0f)) != null) {
                                        alpha7.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e15) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e15);
                                return;
                            }
                        case 6:
                            int i16 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView7 = (AppCompatImageView) this$0.u0(R.id.badgeImage7);
                                if (appCompatImageView7 != null && (animate8 = appCompatImageView7.animate()) != null) {
                                    View u08 = this$0.u0(R.id.emptyView2);
                                    if (u08 != null) {
                                        f2 = u08.getY();
                                    }
                                    ViewPropertyAnimator y16 = animate8.y(f2);
                                    if (y16 != null && (alpha8 = y16.alpha(1.0f)) != null) {
                                        alpha8.setDuration(1200L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e16) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e16);
                                return;
                            }
                        default:
                            int i17 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView8 = (AppCompatImageView) this$0.u0(R.id.badgeImage8);
                                if (appCompatImageView8 != null && (animate = appCompatImageView8.animate()) != null) {
                                    View u09 = this$0.u0(R.id.emptyView2);
                                    if (u09 != null) {
                                        f2 = u09.getY();
                                    }
                                    ViewPropertyAnimator y17 = animate.y(f2);
                                    if (y17 != null && (alpha = y17.alpha(1.0f)) != null) {
                                        alpha.setDuration(1200L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e17) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e17);
                                return;
                            }
                    }
                }
            }, 200L);
            handler.postDelayed(new Runnable(this) { // from class: so.g0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentProfileActivity f31813v;

                {
                    this.f31813v = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ViewPropertyAnimator animate;
                    ViewPropertyAnimator alpha;
                    ViewPropertyAnimator animate2;
                    ViewPropertyAnimator alpha2;
                    ViewPropertyAnimator animate3;
                    ViewPropertyAnimator alpha3;
                    ViewPropertyAnimator animate4;
                    ViewPropertyAnimator alpha4;
                    ViewPropertyAnimator animate5;
                    ViewPropertyAnimator alpha5;
                    ViewPropertyAnimator animate6;
                    ViewPropertyAnimator alpha6;
                    ViewPropertyAnimator animate7;
                    ViewPropertyAnimator alpha7;
                    ViewPropertyAnimator animate8;
                    ViewPropertyAnimator alpha8;
                    int i6 = r2;
                    float f2 = -1.0f;
                    ExperimentProfileActivity this$0 = this.f31813v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView = (AppCompatImageView) this$0.u0(R.id.badgeImage1);
                                if (appCompatImageView != null && (animate2 = appCompatImageView.animate()) != null) {
                                    View u02 = this$0.u0(R.id.emptyView1);
                                    if (u02 != null) {
                                        f2 = u02.getY();
                                    }
                                    ViewPropertyAnimator y10 = animate2.y(f2);
                                    if (y10 != null && (alpha2 = y10.alpha(1.0f)) != null) {
                                        alpha2.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e10);
                                return;
                            }
                        case 1:
                            int i11 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0.u0(R.id.badgeImage2);
                                if (appCompatImageView2 != null && (animate3 = appCompatImageView2.animate()) != null) {
                                    View u03 = this$0.u0(R.id.emptyView1);
                                    if (u03 != null) {
                                        f2 = u03.getY();
                                    }
                                    ViewPropertyAnimator y11 = animate3.y(f2);
                                    if (y11 != null && (alpha3 = y11.alpha(1.0f)) != null) {
                                        alpha3.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e11);
                                return;
                            }
                        case 2:
                            int i12 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) this$0.u0(R.id.badgeImage3);
                                if (appCompatImageView3 != null && (animate4 = appCompatImageView3.animate()) != null) {
                                    View u04 = this$0.u0(R.id.emptyView1);
                                    if (u04 != null) {
                                        f2 = u04.getY();
                                    }
                                    ViewPropertyAnimator y12 = animate4.y(f2);
                                    if (y12 != null && (alpha4 = y12.alpha(1.0f)) != null) {
                                        alpha4.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e12) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e12);
                                return;
                            }
                        case 3:
                            int i13 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) this$0.u0(R.id.badgeImage4);
                                if (appCompatImageView4 != null && (animate5 = appCompatImageView4.animate()) != null) {
                                    View u05 = this$0.u0(R.id.emptyView1);
                                    if (u05 != null) {
                                        f2 = u05.getY();
                                    }
                                    ViewPropertyAnimator y13 = animate5.y(f2);
                                    if (y13 != null && (alpha5 = y13.alpha(1.0f)) != null) {
                                        alpha5.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e13) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e13);
                                return;
                            }
                        case 4:
                            int i14 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) this$0.u0(R.id.badgeImage5);
                                if (appCompatImageView5 != null && (animate6 = appCompatImageView5.animate()) != null) {
                                    View u06 = this$0.u0(R.id.emptyView2);
                                    if (u06 != null) {
                                        f2 = u06.getY();
                                    }
                                    ViewPropertyAnimator y14 = animate6.y(f2);
                                    if (y14 != null && (alpha6 = y14.alpha(1.0f)) != null) {
                                        alpha6.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e14) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e14);
                                return;
                            }
                        case 5:
                            int i15 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) this$0.u0(R.id.badgeImage6);
                                if (appCompatImageView6 != null && (animate7 = appCompatImageView6.animate()) != null) {
                                    View u07 = this$0.u0(R.id.emptyView2);
                                    if (u07 != null) {
                                        f2 = u07.getY();
                                    }
                                    ViewPropertyAnimator y15 = animate7.y(f2);
                                    if (y15 != null && (alpha7 = y15.alpha(1.0f)) != null) {
                                        alpha7.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e15) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e15);
                                return;
                            }
                        case 6:
                            int i16 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView7 = (AppCompatImageView) this$0.u0(R.id.badgeImage7);
                                if (appCompatImageView7 != null && (animate8 = appCompatImageView7.animate()) != null) {
                                    View u08 = this$0.u0(R.id.emptyView2);
                                    if (u08 != null) {
                                        f2 = u08.getY();
                                    }
                                    ViewPropertyAnimator y16 = animate8.y(f2);
                                    if (y16 != null && (alpha8 = y16.alpha(1.0f)) != null) {
                                        alpha8.setDuration(1200L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e16) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e16);
                                return;
                            }
                        default:
                            int i17 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView8 = (AppCompatImageView) this$0.u0(R.id.badgeImage8);
                                if (appCompatImageView8 != null && (animate = appCompatImageView8.animate()) != null) {
                                    View u09 = this$0.u0(R.id.emptyView2);
                                    if (u09 != null) {
                                        f2 = u09.getY();
                                    }
                                    ViewPropertyAnimator y17 = animate.y(f2);
                                    if (y17 != null && (alpha = y17.alpha(1.0f)) != null) {
                                        alpha.setDuration(1200L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e17) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e17);
                                return;
                            }
                    }
                }
            }, 250L);
            handler.postDelayed(new Runnable(this) { // from class: so.g0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentProfileActivity f31813v;

                {
                    this.f31813v = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ViewPropertyAnimator animate;
                    ViewPropertyAnimator alpha;
                    ViewPropertyAnimator animate2;
                    ViewPropertyAnimator alpha2;
                    ViewPropertyAnimator animate3;
                    ViewPropertyAnimator alpha3;
                    ViewPropertyAnimator animate4;
                    ViewPropertyAnimator alpha4;
                    ViewPropertyAnimator animate5;
                    ViewPropertyAnimator alpha5;
                    ViewPropertyAnimator animate6;
                    ViewPropertyAnimator alpha6;
                    ViewPropertyAnimator animate7;
                    ViewPropertyAnimator alpha7;
                    ViewPropertyAnimator animate8;
                    ViewPropertyAnimator alpha8;
                    int i6 = r2;
                    float f2 = -1.0f;
                    ExperimentProfileActivity this$0 = this.f31813v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView = (AppCompatImageView) this$0.u0(R.id.badgeImage1);
                                if (appCompatImageView != null && (animate2 = appCompatImageView.animate()) != null) {
                                    View u02 = this$0.u0(R.id.emptyView1);
                                    if (u02 != null) {
                                        f2 = u02.getY();
                                    }
                                    ViewPropertyAnimator y10 = animate2.y(f2);
                                    if (y10 != null && (alpha2 = y10.alpha(1.0f)) != null) {
                                        alpha2.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e10);
                                return;
                            }
                        case 1:
                            int i11 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0.u0(R.id.badgeImage2);
                                if (appCompatImageView2 != null && (animate3 = appCompatImageView2.animate()) != null) {
                                    View u03 = this$0.u0(R.id.emptyView1);
                                    if (u03 != null) {
                                        f2 = u03.getY();
                                    }
                                    ViewPropertyAnimator y11 = animate3.y(f2);
                                    if (y11 != null && (alpha3 = y11.alpha(1.0f)) != null) {
                                        alpha3.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e11);
                                return;
                            }
                        case 2:
                            int i12 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) this$0.u0(R.id.badgeImage3);
                                if (appCompatImageView3 != null && (animate4 = appCompatImageView3.animate()) != null) {
                                    View u04 = this$0.u0(R.id.emptyView1);
                                    if (u04 != null) {
                                        f2 = u04.getY();
                                    }
                                    ViewPropertyAnimator y12 = animate4.y(f2);
                                    if (y12 != null && (alpha4 = y12.alpha(1.0f)) != null) {
                                        alpha4.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e12) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e12);
                                return;
                            }
                        case 3:
                            int i13 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) this$0.u0(R.id.badgeImage4);
                                if (appCompatImageView4 != null && (animate5 = appCompatImageView4.animate()) != null) {
                                    View u05 = this$0.u0(R.id.emptyView1);
                                    if (u05 != null) {
                                        f2 = u05.getY();
                                    }
                                    ViewPropertyAnimator y13 = animate5.y(f2);
                                    if (y13 != null && (alpha5 = y13.alpha(1.0f)) != null) {
                                        alpha5.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e13) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e13);
                                return;
                            }
                        case 4:
                            int i14 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) this$0.u0(R.id.badgeImage5);
                                if (appCompatImageView5 != null && (animate6 = appCompatImageView5.animate()) != null) {
                                    View u06 = this$0.u0(R.id.emptyView2);
                                    if (u06 != null) {
                                        f2 = u06.getY();
                                    }
                                    ViewPropertyAnimator y14 = animate6.y(f2);
                                    if (y14 != null && (alpha6 = y14.alpha(1.0f)) != null) {
                                        alpha6.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e14) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e14);
                                return;
                            }
                        case 5:
                            int i15 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) this$0.u0(R.id.badgeImage6);
                                if (appCompatImageView6 != null && (animate7 = appCompatImageView6.animate()) != null) {
                                    View u07 = this$0.u0(R.id.emptyView2);
                                    if (u07 != null) {
                                        f2 = u07.getY();
                                    }
                                    ViewPropertyAnimator y15 = animate7.y(f2);
                                    if (y15 != null && (alpha7 = y15.alpha(1.0f)) != null) {
                                        alpha7.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e15) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e15);
                                return;
                            }
                        case 6:
                            int i16 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView7 = (AppCompatImageView) this$0.u0(R.id.badgeImage7);
                                if (appCompatImageView7 != null && (animate8 = appCompatImageView7.animate()) != null) {
                                    View u08 = this$0.u0(R.id.emptyView2);
                                    if (u08 != null) {
                                        f2 = u08.getY();
                                    }
                                    ViewPropertyAnimator y16 = animate8.y(f2);
                                    if (y16 != null && (alpha8 = y16.alpha(1.0f)) != null) {
                                        alpha8.setDuration(1200L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e16) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e16);
                                return;
                            }
                        default:
                            int i17 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView8 = (AppCompatImageView) this$0.u0(R.id.badgeImage8);
                                if (appCompatImageView8 != null && (animate = appCompatImageView8.animate()) != null) {
                                    View u09 = this$0.u0(R.id.emptyView2);
                                    if (u09 != null) {
                                        f2 = u09.getY();
                                    }
                                    ViewPropertyAnimator y17 = animate.y(f2);
                                    if (y17 != null && (alpha = y17.alpha(1.0f)) != null) {
                                        alpha.setDuration(1200L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e17) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e17);
                                return;
                            }
                    }
                }
            }, 300L);
            handler.postDelayed(new Runnable(this) { // from class: so.g0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentProfileActivity f31813v;

                {
                    this.f31813v = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ViewPropertyAnimator animate;
                    ViewPropertyAnimator alpha;
                    ViewPropertyAnimator animate2;
                    ViewPropertyAnimator alpha2;
                    ViewPropertyAnimator animate3;
                    ViewPropertyAnimator alpha3;
                    ViewPropertyAnimator animate4;
                    ViewPropertyAnimator alpha4;
                    ViewPropertyAnimator animate5;
                    ViewPropertyAnimator alpha5;
                    ViewPropertyAnimator animate6;
                    ViewPropertyAnimator alpha6;
                    ViewPropertyAnimator animate7;
                    ViewPropertyAnimator alpha7;
                    ViewPropertyAnimator animate8;
                    ViewPropertyAnimator alpha8;
                    int i6 = r2;
                    float f2 = -1.0f;
                    ExperimentProfileActivity this$0 = this.f31813v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView = (AppCompatImageView) this$0.u0(R.id.badgeImage1);
                                if (appCompatImageView != null && (animate2 = appCompatImageView.animate()) != null) {
                                    View u02 = this$0.u0(R.id.emptyView1);
                                    if (u02 != null) {
                                        f2 = u02.getY();
                                    }
                                    ViewPropertyAnimator y10 = animate2.y(f2);
                                    if (y10 != null && (alpha2 = y10.alpha(1.0f)) != null) {
                                        alpha2.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e10);
                                return;
                            }
                        case 1:
                            int i11 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0.u0(R.id.badgeImage2);
                                if (appCompatImageView2 != null && (animate3 = appCompatImageView2.animate()) != null) {
                                    View u03 = this$0.u0(R.id.emptyView1);
                                    if (u03 != null) {
                                        f2 = u03.getY();
                                    }
                                    ViewPropertyAnimator y11 = animate3.y(f2);
                                    if (y11 != null && (alpha3 = y11.alpha(1.0f)) != null) {
                                        alpha3.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e11);
                                return;
                            }
                        case 2:
                            int i12 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) this$0.u0(R.id.badgeImage3);
                                if (appCompatImageView3 != null && (animate4 = appCompatImageView3.animate()) != null) {
                                    View u04 = this$0.u0(R.id.emptyView1);
                                    if (u04 != null) {
                                        f2 = u04.getY();
                                    }
                                    ViewPropertyAnimator y12 = animate4.y(f2);
                                    if (y12 != null && (alpha4 = y12.alpha(1.0f)) != null) {
                                        alpha4.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e12) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e12);
                                return;
                            }
                        case 3:
                            int i13 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) this$0.u0(R.id.badgeImage4);
                                if (appCompatImageView4 != null && (animate5 = appCompatImageView4.animate()) != null) {
                                    View u05 = this$0.u0(R.id.emptyView1);
                                    if (u05 != null) {
                                        f2 = u05.getY();
                                    }
                                    ViewPropertyAnimator y13 = animate5.y(f2);
                                    if (y13 != null && (alpha5 = y13.alpha(1.0f)) != null) {
                                        alpha5.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e13) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e13);
                                return;
                            }
                        case 4:
                            int i14 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) this$0.u0(R.id.badgeImage5);
                                if (appCompatImageView5 != null && (animate6 = appCompatImageView5.animate()) != null) {
                                    View u06 = this$0.u0(R.id.emptyView2);
                                    if (u06 != null) {
                                        f2 = u06.getY();
                                    }
                                    ViewPropertyAnimator y14 = animate6.y(f2);
                                    if (y14 != null && (alpha6 = y14.alpha(1.0f)) != null) {
                                        alpha6.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e14) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e14);
                                return;
                            }
                        case 5:
                            int i15 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) this$0.u0(R.id.badgeImage6);
                                if (appCompatImageView6 != null && (animate7 = appCompatImageView6.animate()) != null) {
                                    View u07 = this$0.u0(R.id.emptyView2);
                                    if (u07 != null) {
                                        f2 = u07.getY();
                                    }
                                    ViewPropertyAnimator y15 = animate7.y(f2);
                                    if (y15 != null && (alpha7 = y15.alpha(1.0f)) != null) {
                                        alpha7.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e15) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e15);
                                return;
                            }
                        case 6:
                            int i16 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView7 = (AppCompatImageView) this$0.u0(R.id.badgeImage7);
                                if (appCompatImageView7 != null && (animate8 = appCompatImageView7.animate()) != null) {
                                    View u08 = this$0.u0(R.id.emptyView2);
                                    if (u08 != null) {
                                        f2 = u08.getY();
                                    }
                                    ViewPropertyAnimator y16 = animate8.y(f2);
                                    if (y16 != null && (alpha8 = y16.alpha(1.0f)) != null) {
                                        alpha8.setDuration(1200L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e16) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e16);
                                return;
                            }
                        default:
                            int i17 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView8 = (AppCompatImageView) this$0.u0(R.id.badgeImage8);
                                if (appCompatImageView8 != null && (animate = appCompatImageView8.animate()) != null) {
                                    View u09 = this$0.u0(R.id.emptyView2);
                                    if (u09 != null) {
                                        f2 = u09.getY();
                                    }
                                    ViewPropertyAnimator y17 = animate.y(f2);
                                    if (y17 != null && (alpha = y17.alpha(1.0f)) != null) {
                                        alpha.setDuration(1200L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e17) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e17);
                                return;
                            }
                    }
                }
            }, 350L);
            handler.postDelayed(new Runnable(this) { // from class: so.g0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentProfileActivity f31813v;

                {
                    this.f31813v = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ViewPropertyAnimator animate;
                    ViewPropertyAnimator alpha;
                    ViewPropertyAnimator animate2;
                    ViewPropertyAnimator alpha2;
                    ViewPropertyAnimator animate3;
                    ViewPropertyAnimator alpha3;
                    ViewPropertyAnimator animate4;
                    ViewPropertyAnimator alpha4;
                    ViewPropertyAnimator animate5;
                    ViewPropertyAnimator alpha5;
                    ViewPropertyAnimator animate6;
                    ViewPropertyAnimator alpha6;
                    ViewPropertyAnimator animate7;
                    ViewPropertyAnimator alpha7;
                    ViewPropertyAnimator animate8;
                    ViewPropertyAnimator alpha8;
                    int i6 = r2;
                    float f2 = -1.0f;
                    ExperimentProfileActivity this$0 = this.f31813v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView = (AppCompatImageView) this$0.u0(R.id.badgeImage1);
                                if (appCompatImageView != null && (animate2 = appCompatImageView.animate()) != null) {
                                    View u02 = this$0.u0(R.id.emptyView1);
                                    if (u02 != null) {
                                        f2 = u02.getY();
                                    }
                                    ViewPropertyAnimator y10 = animate2.y(f2);
                                    if (y10 != null && (alpha2 = y10.alpha(1.0f)) != null) {
                                        alpha2.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e10);
                                return;
                            }
                        case 1:
                            int i11 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0.u0(R.id.badgeImage2);
                                if (appCompatImageView2 != null && (animate3 = appCompatImageView2.animate()) != null) {
                                    View u03 = this$0.u0(R.id.emptyView1);
                                    if (u03 != null) {
                                        f2 = u03.getY();
                                    }
                                    ViewPropertyAnimator y11 = animate3.y(f2);
                                    if (y11 != null && (alpha3 = y11.alpha(1.0f)) != null) {
                                        alpha3.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e11);
                                return;
                            }
                        case 2:
                            int i12 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) this$0.u0(R.id.badgeImage3);
                                if (appCompatImageView3 != null && (animate4 = appCompatImageView3.animate()) != null) {
                                    View u04 = this$0.u0(R.id.emptyView1);
                                    if (u04 != null) {
                                        f2 = u04.getY();
                                    }
                                    ViewPropertyAnimator y12 = animate4.y(f2);
                                    if (y12 != null && (alpha4 = y12.alpha(1.0f)) != null) {
                                        alpha4.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e12) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e12);
                                return;
                            }
                        case 3:
                            int i13 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) this$0.u0(R.id.badgeImage4);
                                if (appCompatImageView4 != null && (animate5 = appCompatImageView4.animate()) != null) {
                                    View u05 = this$0.u0(R.id.emptyView1);
                                    if (u05 != null) {
                                        f2 = u05.getY();
                                    }
                                    ViewPropertyAnimator y13 = animate5.y(f2);
                                    if (y13 != null && (alpha5 = y13.alpha(1.0f)) != null) {
                                        alpha5.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e13) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e13);
                                return;
                            }
                        case 4:
                            int i14 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) this$0.u0(R.id.badgeImage5);
                                if (appCompatImageView5 != null && (animate6 = appCompatImageView5.animate()) != null) {
                                    View u06 = this$0.u0(R.id.emptyView2);
                                    if (u06 != null) {
                                        f2 = u06.getY();
                                    }
                                    ViewPropertyAnimator y14 = animate6.y(f2);
                                    if (y14 != null && (alpha6 = y14.alpha(1.0f)) != null) {
                                        alpha6.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e14) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e14);
                                return;
                            }
                        case 5:
                            int i15 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) this$0.u0(R.id.badgeImage6);
                                if (appCompatImageView6 != null && (animate7 = appCompatImageView6.animate()) != null) {
                                    View u07 = this$0.u0(R.id.emptyView2);
                                    if (u07 != null) {
                                        f2 = u07.getY();
                                    }
                                    ViewPropertyAnimator y15 = animate7.y(f2);
                                    if (y15 != null && (alpha7 = y15.alpha(1.0f)) != null) {
                                        alpha7.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e15) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e15);
                                return;
                            }
                        case 6:
                            int i16 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView7 = (AppCompatImageView) this$0.u0(R.id.badgeImage7);
                                if (appCompatImageView7 != null && (animate8 = appCompatImageView7.animate()) != null) {
                                    View u08 = this$0.u0(R.id.emptyView2);
                                    if (u08 != null) {
                                        f2 = u08.getY();
                                    }
                                    ViewPropertyAnimator y16 = animate8.y(f2);
                                    if (y16 != null && (alpha8 = y16.alpha(1.0f)) != null) {
                                        alpha8.setDuration(1200L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e16) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e16);
                                return;
                            }
                        default:
                            int i17 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView8 = (AppCompatImageView) this$0.u0(R.id.badgeImage8);
                                if (appCompatImageView8 != null && (animate = appCompatImageView8.animate()) != null) {
                                    View u09 = this$0.u0(R.id.emptyView2);
                                    if (u09 != null) {
                                        f2 = u09.getY();
                                    }
                                    ViewPropertyAnimator y17 = animate.y(f2);
                                    if (y17 != null && (alpha = y17.alpha(1.0f)) != null) {
                                        alpha.setDuration(1200L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e17) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e17);
                                return;
                            }
                    }
                }
            }, 400L);
            handler.postDelayed(new Runnable(this) { // from class: so.g0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentProfileActivity f31813v;

                {
                    this.f31813v = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ViewPropertyAnimator animate;
                    ViewPropertyAnimator alpha;
                    ViewPropertyAnimator animate2;
                    ViewPropertyAnimator alpha2;
                    ViewPropertyAnimator animate3;
                    ViewPropertyAnimator alpha3;
                    ViewPropertyAnimator animate4;
                    ViewPropertyAnimator alpha4;
                    ViewPropertyAnimator animate5;
                    ViewPropertyAnimator alpha5;
                    ViewPropertyAnimator animate6;
                    ViewPropertyAnimator alpha6;
                    ViewPropertyAnimator animate7;
                    ViewPropertyAnimator alpha7;
                    ViewPropertyAnimator animate8;
                    ViewPropertyAnimator alpha8;
                    int i6 = r2;
                    float f2 = -1.0f;
                    ExperimentProfileActivity this$0 = this.f31813v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView = (AppCompatImageView) this$0.u0(R.id.badgeImage1);
                                if (appCompatImageView != null && (animate2 = appCompatImageView.animate()) != null) {
                                    View u02 = this$0.u0(R.id.emptyView1);
                                    if (u02 != null) {
                                        f2 = u02.getY();
                                    }
                                    ViewPropertyAnimator y10 = animate2.y(f2);
                                    if (y10 != null && (alpha2 = y10.alpha(1.0f)) != null) {
                                        alpha2.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e10);
                                return;
                            }
                        case 1:
                            int i11 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0.u0(R.id.badgeImage2);
                                if (appCompatImageView2 != null && (animate3 = appCompatImageView2.animate()) != null) {
                                    View u03 = this$0.u0(R.id.emptyView1);
                                    if (u03 != null) {
                                        f2 = u03.getY();
                                    }
                                    ViewPropertyAnimator y11 = animate3.y(f2);
                                    if (y11 != null && (alpha3 = y11.alpha(1.0f)) != null) {
                                        alpha3.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e11);
                                return;
                            }
                        case 2:
                            int i12 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) this$0.u0(R.id.badgeImage3);
                                if (appCompatImageView3 != null && (animate4 = appCompatImageView3.animate()) != null) {
                                    View u04 = this$0.u0(R.id.emptyView1);
                                    if (u04 != null) {
                                        f2 = u04.getY();
                                    }
                                    ViewPropertyAnimator y12 = animate4.y(f2);
                                    if (y12 != null && (alpha4 = y12.alpha(1.0f)) != null) {
                                        alpha4.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e12) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e12);
                                return;
                            }
                        case 3:
                            int i13 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) this$0.u0(R.id.badgeImage4);
                                if (appCompatImageView4 != null && (animate5 = appCompatImageView4.animate()) != null) {
                                    View u05 = this$0.u0(R.id.emptyView1);
                                    if (u05 != null) {
                                        f2 = u05.getY();
                                    }
                                    ViewPropertyAnimator y13 = animate5.y(f2);
                                    if (y13 != null && (alpha5 = y13.alpha(1.0f)) != null) {
                                        alpha5.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e13) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e13);
                                return;
                            }
                        case 4:
                            int i14 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) this$0.u0(R.id.badgeImage5);
                                if (appCompatImageView5 != null && (animate6 = appCompatImageView5.animate()) != null) {
                                    View u06 = this$0.u0(R.id.emptyView2);
                                    if (u06 != null) {
                                        f2 = u06.getY();
                                    }
                                    ViewPropertyAnimator y14 = animate6.y(f2);
                                    if (y14 != null && (alpha6 = y14.alpha(1.0f)) != null) {
                                        alpha6.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e14) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e14);
                                return;
                            }
                        case 5:
                            int i15 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) this$0.u0(R.id.badgeImage6);
                                if (appCompatImageView6 != null && (animate7 = appCompatImageView6.animate()) != null) {
                                    View u07 = this$0.u0(R.id.emptyView2);
                                    if (u07 != null) {
                                        f2 = u07.getY();
                                    }
                                    ViewPropertyAnimator y15 = animate7.y(f2);
                                    if (y15 != null && (alpha7 = y15.alpha(1.0f)) != null) {
                                        alpha7.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e15) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e15);
                                return;
                            }
                        case 6:
                            int i16 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView7 = (AppCompatImageView) this$0.u0(R.id.badgeImage7);
                                if (appCompatImageView7 != null && (animate8 = appCompatImageView7.animate()) != null) {
                                    View u08 = this$0.u0(R.id.emptyView2);
                                    if (u08 != null) {
                                        f2 = u08.getY();
                                    }
                                    ViewPropertyAnimator y16 = animate8.y(f2);
                                    if (y16 != null && (alpha8 = y16.alpha(1.0f)) != null) {
                                        alpha8.setDuration(1200L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e16) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e16);
                                return;
                            }
                        default:
                            int i17 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView8 = (AppCompatImageView) this$0.u0(R.id.badgeImage8);
                                if (appCompatImageView8 != null && (animate = appCompatImageView8.animate()) != null) {
                                    View u09 = this$0.u0(R.id.emptyView2);
                                    if (u09 != null) {
                                        f2 = u09.getY();
                                    }
                                    ViewPropertyAnimator y17 = animate.y(f2);
                                    if (y17 != null && (alpha = y17.alpha(1.0f)) != null) {
                                        alpha.setDuration(1200L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e17) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e17);
                                return;
                            }
                    }
                }
            }, 450L);
            handler.postDelayed(new Runnable(this) { // from class: so.g0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentProfileActivity f31813v;

                {
                    this.f31813v = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ViewPropertyAnimator animate;
                    ViewPropertyAnimator alpha;
                    ViewPropertyAnimator animate2;
                    ViewPropertyAnimator alpha2;
                    ViewPropertyAnimator animate3;
                    ViewPropertyAnimator alpha3;
                    ViewPropertyAnimator animate4;
                    ViewPropertyAnimator alpha4;
                    ViewPropertyAnimator animate5;
                    ViewPropertyAnimator alpha5;
                    ViewPropertyAnimator animate6;
                    ViewPropertyAnimator alpha6;
                    ViewPropertyAnimator animate7;
                    ViewPropertyAnimator alpha7;
                    ViewPropertyAnimator animate8;
                    ViewPropertyAnimator alpha8;
                    int i6 = r2;
                    float f2 = -1.0f;
                    ExperimentProfileActivity this$0 = this.f31813v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView = (AppCompatImageView) this$0.u0(R.id.badgeImage1);
                                if (appCompatImageView != null && (animate2 = appCompatImageView.animate()) != null) {
                                    View u02 = this$0.u0(R.id.emptyView1);
                                    if (u02 != null) {
                                        f2 = u02.getY();
                                    }
                                    ViewPropertyAnimator y10 = animate2.y(f2);
                                    if (y10 != null && (alpha2 = y10.alpha(1.0f)) != null) {
                                        alpha2.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e10);
                                return;
                            }
                        case 1:
                            int i11 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0.u0(R.id.badgeImage2);
                                if (appCompatImageView2 != null && (animate3 = appCompatImageView2.animate()) != null) {
                                    View u03 = this$0.u0(R.id.emptyView1);
                                    if (u03 != null) {
                                        f2 = u03.getY();
                                    }
                                    ViewPropertyAnimator y11 = animate3.y(f2);
                                    if (y11 != null && (alpha3 = y11.alpha(1.0f)) != null) {
                                        alpha3.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e11);
                                return;
                            }
                        case 2:
                            int i12 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) this$0.u0(R.id.badgeImage3);
                                if (appCompatImageView3 != null && (animate4 = appCompatImageView3.animate()) != null) {
                                    View u04 = this$0.u0(R.id.emptyView1);
                                    if (u04 != null) {
                                        f2 = u04.getY();
                                    }
                                    ViewPropertyAnimator y12 = animate4.y(f2);
                                    if (y12 != null && (alpha4 = y12.alpha(1.0f)) != null) {
                                        alpha4.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e12) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e12);
                                return;
                            }
                        case 3:
                            int i13 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) this$0.u0(R.id.badgeImage4);
                                if (appCompatImageView4 != null && (animate5 = appCompatImageView4.animate()) != null) {
                                    View u05 = this$0.u0(R.id.emptyView1);
                                    if (u05 != null) {
                                        f2 = u05.getY();
                                    }
                                    ViewPropertyAnimator y13 = animate5.y(f2);
                                    if (y13 != null && (alpha5 = y13.alpha(1.0f)) != null) {
                                        alpha5.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e13) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e13);
                                return;
                            }
                        case 4:
                            int i14 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) this$0.u0(R.id.badgeImage5);
                                if (appCompatImageView5 != null && (animate6 = appCompatImageView5.animate()) != null) {
                                    View u06 = this$0.u0(R.id.emptyView2);
                                    if (u06 != null) {
                                        f2 = u06.getY();
                                    }
                                    ViewPropertyAnimator y14 = animate6.y(f2);
                                    if (y14 != null && (alpha6 = y14.alpha(1.0f)) != null) {
                                        alpha6.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e14) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e14);
                                return;
                            }
                        case 5:
                            int i15 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) this$0.u0(R.id.badgeImage6);
                                if (appCompatImageView6 != null && (animate7 = appCompatImageView6.animate()) != null) {
                                    View u07 = this$0.u0(R.id.emptyView2);
                                    if (u07 != null) {
                                        f2 = u07.getY();
                                    }
                                    ViewPropertyAnimator y15 = animate7.y(f2);
                                    if (y15 != null && (alpha7 = y15.alpha(1.0f)) != null) {
                                        alpha7.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e15) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e15);
                                return;
                            }
                        case 6:
                            int i16 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView7 = (AppCompatImageView) this$0.u0(R.id.badgeImage7);
                                if (appCompatImageView7 != null && (animate8 = appCompatImageView7.animate()) != null) {
                                    View u08 = this$0.u0(R.id.emptyView2);
                                    if (u08 != null) {
                                        f2 = u08.getY();
                                    }
                                    ViewPropertyAnimator y16 = animate8.y(f2);
                                    if (y16 != null && (alpha8 = y16.alpha(1.0f)) != null) {
                                        alpha8.setDuration(1200L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e16) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e16);
                                return;
                            }
                        default:
                            int i17 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView8 = (AppCompatImageView) this$0.u0(R.id.badgeImage8);
                                if (appCompatImageView8 != null && (animate = appCompatImageView8.animate()) != null) {
                                    View u09 = this$0.u0(R.id.emptyView2);
                                    if (u09 != null) {
                                        f2 = u09.getY();
                                    }
                                    ViewPropertyAnimator y17 = animate.y(f2);
                                    if (y17 != null && (alpha = y17.alpha(1.0f)) != null) {
                                        alpha.setDuration(1200L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e17) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e17);
                                return;
                            }
                    }
                }
            }, 500L);
            handler.postDelayed(new Runnable(this) { // from class: so.g0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentProfileActivity f31813v;

                {
                    this.f31813v = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ViewPropertyAnimator animate;
                    ViewPropertyAnimator alpha;
                    ViewPropertyAnimator animate2;
                    ViewPropertyAnimator alpha2;
                    ViewPropertyAnimator animate3;
                    ViewPropertyAnimator alpha3;
                    ViewPropertyAnimator animate4;
                    ViewPropertyAnimator alpha4;
                    ViewPropertyAnimator animate5;
                    ViewPropertyAnimator alpha5;
                    ViewPropertyAnimator animate6;
                    ViewPropertyAnimator alpha6;
                    ViewPropertyAnimator animate7;
                    ViewPropertyAnimator alpha7;
                    ViewPropertyAnimator animate8;
                    ViewPropertyAnimator alpha8;
                    int i6 = r2;
                    float f2 = -1.0f;
                    ExperimentProfileActivity this$0 = this.f31813v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView = (AppCompatImageView) this$0.u0(R.id.badgeImage1);
                                if (appCompatImageView != null && (animate2 = appCompatImageView.animate()) != null) {
                                    View u02 = this$0.u0(R.id.emptyView1);
                                    if (u02 != null) {
                                        f2 = u02.getY();
                                    }
                                    ViewPropertyAnimator y10 = animate2.y(f2);
                                    if (y10 != null && (alpha2 = y10.alpha(1.0f)) != null) {
                                        alpha2.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e10);
                                return;
                            }
                        case 1:
                            int i11 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0.u0(R.id.badgeImage2);
                                if (appCompatImageView2 != null && (animate3 = appCompatImageView2.animate()) != null) {
                                    View u03 = this$0.u0(R.id.emptyView1);
                                    if (u03 != null) {
                                        f2 = u03.getY();
                                    }
                                    ViewPropertyAnimator y11 = animate3.y(f2);
                                    if (y11 != null && (alpha3 = y11.alpha(1.0f)) != null) {
                                        alpha3.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e11);
                                return;
                            }
                        case 2:
                            int i12 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) this$0.u0(R.id.badgeImage3);
                                if (appCompatImageView3 != null && (animate4 = appCompatImageView3.animate()) != null) {
                                    View u04 = this$0.u0(R.id.emptyView1);
                                    if (u04 != null) {
                                        f2 = u04.getY();
                                    }
                                    ViewPropertyAnimator y12 = animate4.y(f2);
                                    if (y12 != null && (alpha4 = y12.alpha(1.0f)) != null) {
                                        alpha4.setDuration(1000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e12) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e12);
                                return;
                            }
                        case 3:
                            int i13 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) this$0.u0(R.id.badgeImage4);
                                if (appCompatImageView4 != null && (animate5 = appCompatImageView4.animate()) != null) {
                                    View u05 = this$0.u0(R.id.emptyView1);
                                    if (u05 != null) {
                                        f2 = u05.getY();
                                    }
                                    ViewPropertyAnimator y13 = animate5.y(f2);
                                    if (y13 != null && (alpha5 = y13.alpha(1.0f)) != null) {
                                        alpha5.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e13) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e13);
                                return;
                            }
                        case 4:
                            int i14 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) this$0.u0(R.id.badgeImage5);
                                if (appCompatImageView5 != null && (animate6 = appCompatImageView5.animate()) != null) {
                                    View u06 = this$0.u0(R.id.emptyView2);
                                    if (u06 != null) {
                                        f2 = u06.getY();
                                    }
                                    ViewPropertyAnimator y14 = animate6.y(f2);
                                    if (y14 != null && (alpha6 = y14.alpha(1.0f)) != null) {
                                        alpha6.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e14) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e14);
                                return;
                            }
                        case 5:
                            int i15 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) this$0.u0(R.id.badgeImage6);
                                if (appCompatImageView6 != null && (animate7 = appCompatImageView6.animate()) != null) {
                                    View u07 = this$0.u0(R.id.emptyView2);
                                    if (u07 != null) {
                                        f2 = u07.getY();
                                    }
                                    ViewPropertyAnimator y15 = animate7.y(f2);
                                    if (y15 != null && (alpha7 = y15.alpha(1.0f)) != null) {
                                        alpha7.setDuration(1100L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e15) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e15);
                                return;
                            }
                        case 6:
                            int i16 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView7 = (AppCompatImageView) this$0.u0(R.id.badgeImage7);
                                if (appCompatImageView7 != null && (animate8 = appCompatImageView7.animate()) != null) {
                                    View u08 = this$0.u0(R.id.emptyView2);
                                    if (u08 != null) {
                                        f2 = u08.getY();
                                    }
                                    ViewPropertyAnimator y16 = animate8.y(f2);
                                    if (y16 != null && (alpha8 = y16.alpha(1.0f)) != null) {
                                        alpha8.setDuration(1200L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e16) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e16);
                                return;
                            }
                        default:
                            int i17 = ExperimentProfileActivity.S;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                AppCompatImageView appCompatImageView8 = (AppCompatImageView) this$0.u0(R.id.badgeImage8);
                                if (appCompatImageView8 != null && (animate = appCompatImageView8.animate()) != null) {
                                    View u09 = this$0.u0(R.id.emptyView2);
                                    if (u09 != null) {
                                        f2 = u09.getY();
                                    }
                                    ViewPropertyAnimator y17 = animate.y(f2);
                                    if (y17 != null && (alpha = y17.alpha(1.0f)) != null) {
                                        alpha.setDuration(1200L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e17) {
                                LogHelper.INSTANCE.e(this$0.f11575w, e17);
                                return;
                            }
                    }
                }
            }, 550L);
            this.L.add(handler);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11575w, e10);
        }
    }

    /* compiled from: ExperimentProfileActivity.kt */
    /* loaded from: classes2.dex */
    public static final class p extends BottomSheetBehavior.f {
        public p() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void c(int i6, View view) {
            ExperimentProfileActivity experimentProfileActivity = ExperimentProfileActivity.this;
            try {
                if (i6 != 3) {
                    if (i6 == 4) {
                        View u02 = experimentProfileActivity.u0(R.id.blanketView);
                        if (u02 != null) {
                            u02.setVisibility(8);
                        }
                        experimentProfileActivity.J = false;
                        return;
                    }
                    return;
                }
                View u03 = experimentProfileActivity.u0(R.id.blanketView);
                if (u03 != null) {
                    u03.setVisibility(0);
                }
                experimentProfileActivity.J = true;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(experimentProfileActivity.f11575w, e10);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void b(View view) {
        }
    }
}
