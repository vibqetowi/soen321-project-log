package com.theinnerhour.b2b.components.goals.activity;

import am.f;
import am.g;
import am.h;
import am.j;
import am.k;
import am.n;
import am.o;
import am.q;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.o0;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import bm.r;
import cm.l;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fm.j0;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import ta.v;
import tl.m;
import w5.h0;
/* compiled from: FirestoreGoalsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/goals/activity/FirestoreGoalsActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FirestoreGoalsActivity extends androidx.appcompat.app.c {
    public static final /* synthetic */ int E = 0;
    public int A;
    public final androidx.activity.result.c<Intent> B;
    public final androidx.activity.result.c<Intent> C;
    public final e D;

    /* renamed from: v  reason: collision with root package name */
    public final String f11149v;

    /* renamed from: w  reason: collision with root package name */
    public yp.b f11150w;

    /* renamed from: x  reason: collision with root package name */
    public fm.a f11151x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f11152y;

    /* renamed from: z  reason: collision with root package name */
    public r f11153z;

    /* compiled from: FirestoreGoalsActivity.kt */
    /* loaded from: classes2.dex */
    public final class a extends FragmentStateAdapter {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p fa2) {
            super(fa2);
            i.g(fa2, "fa");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int f() {
            return 2;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public final Fragment x(int i6) {
            if (i6 == 0) {
                return new cm.p();
            }
            return new l();
        }
    }

    /* compiled from: FirestoreGoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b implements Animation.AnimationListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ boolean f11154u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoalsActivity f11155v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f11156w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Animation f11157x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Animation f11158y;

        public b(boolean z10, FirestoreGoalsActivity firestoreGoalsActivity, boolean z11, Animation animation, Animation animation2) {
            this.f11154u = z10;
            this.f11155v = firestoreGoalsActivity;
            this.f11156w = z11;
            this.f11157x = animation;
            this.f11158y = animation2;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            RobertoTextView robertoTextView;
            RobertoButton robertoButton;
            RobertoButton robertoButton2;
            CardView cardView;
            RobertoButton robertoButton3;
            RobertoButton robertoButton4;
            RobertoTextView robertoTextView2;
            CardView cardView2;
            ConstraintLayout constraintLayout;
            ConstraintLayout constraintLayout2;
            CardView cardView3;
            i.g(animation, "animation");
            boolean z10 = this.f11154u;
            FirestoreGoalsActivity firestoreGoalsActivity = this.f11155v;
            if (z10) {
                yp.b bVar = firestoreGoalsActivity.f11150w;
                if (bVar != null && (cardView3 = bVar.f) != null) {
                    Extensions.INSTANCE.gone(cardView3);
                }
                fm.a aVar = firestoreGoalsActivity.f11151x;
                if (aVar != null) {
                    aVar.p();
                }
            } else {
                boolean z11 = this.f11156w;
                Animation animation2 = this.f11157x;
                if (z11) {
                    UtilsKt.fireAnalytics("goal_negative_feedback_show", UtilsKt.getAnalyticsBundle());
                    yp.b bVar2 = firestoreGoalsActivity.f11150w;
                    if (bVar2 != null && (constraintLayout2 = bVar2.f38713d) != null) {
                        Extensions.INSTANCE.gone(constraintLayout2);
                    }
                    yp.b bVar3 = firestoreGoalsActivity.f11150w;
                    if (bVar3 != null && (constraintLayout = bVar3.f38712c) != null) {
                        Extensions.INSTANCE.visible(constraintLayout);
                    }
                    yp.b bVar4 = firestoreGoalsActivity.f11150w;
                    if (bVar4 != null && (cardView2 = bVar4.f) != null) {
                        cardView2.startAnimation(animation2);
                    }
                    yp.b bVar5 = firestoreGoalsActivity.f11150w;
                    if (bVar5 != null && (robertoTextView2 = bVar5.f38725q) != null) {
                        robertoTextView2.setOnClickListener(new am.a(firestoreGoalsActivity, 15));
                    }
                } else {
                    UtilsKt.fireAnalytics("goal_play_store_feedback_show", UtilsKt.getAnalyticsBundle());
                    yp.b bVar6 = firestoreGoalsActivity.f11150w;
                    if (bVar6 != null) {
                        robertoTextView = bVar6.f38714e;
                    } else {
                        robertoTextView = null;
                    }
                    if (robertoTextView != null) {
                        robertoTextView.setText(firestoreGoalsActivity.getString(R.string.goalsFeedbackPositive));
                    }
                    yp.b bVar7 = firestoreGoalsActivity.f11150w;
                    if (bVar7 != null) {
                        robertoButton = bVar7.f38715g;
                    } else {
                        robertoButton = null;
                    }
                    if (robertoButton != null) {
                        robertoButton.setText(firestoreGoalsActivity.getString(R.string.rateUsNo));
                    }
                    yp.b bVar8 = firestoreGoalsActivity.f11150w;
                    if (bVar8 != null) {
                        robertoButton2 = bVar8.f38716h;
                    } else {
                        robertoButton2 = null;
                    }
                    if (robertoButton2 != null) {
                        robertoButton2.setText(firestoreGoalsActivity.getString(R.string.goalsFeedbackYesCta));
                    }
                    yp.b bVar9 = firestoreGoalsActivity.f11150w;
                    if (bVar9 != null && (robertoButton4 = bVar9.f38716h) != null) {
                        robertoButton4.setOnClickListener(new am.a(firestoreGoalsActivity, 16));
                    }
                    yp.b bVar10 = firestoreGoalsActivity.f11150w;
                    if (bVar10 != null && (robertoButton3 = bVar10.f38715g) != null) {
                        robertoButton3.setOnClickListener(new am.a(firestoreGoalsActivity, 17));
                    }
                    yp.b bVar11 = firestoreGoalsActivity.f11150w;
                    if (bVar11 != null && (cardView = bVar11.f) != null) {
                        cardView.startAnimation(animation2);
                    }
                }
            }
            this.f11158y.setAnimationListener(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            i.g(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            i.g(animation, "animation");
        }
    }

    /* compiled from: FirestoreGoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends ViewPager2.e {
        public e() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void c(int i6) {
            View view;
            TabLayout tabLayout;
            TabLayout.g h10;
            TabLayout tabLayout2;
            TabLayout.g h11;
            TabLayout tabLayout3;
            View view2;
            TabLayout tabLayout4;
            TabLayout.g h12;
            TabLayout tabLayout5;
            TabLayout.g h13;
            TabLayout tabLayout6;
            FirestoreGoalsActivity firestoreGoalsActivity = FirestoreGoalsActivity.this;
            fm.a aVar = firestoreGoalsActivity.f11151x;
            if (aVar != null) {
                aVar.Q = i6;
            }
            View view3 = null;
            if (i6 == 0) {
                yp.b bVar = firestoreGoalsActivity.f11150w;
                if (bVar != null && (tabLayout6 = bVar.r) != null) {
                    tabLayout6.setSelectedTabIndicatorColor(g0.a.b(firestoreGoalsActivity, R.color.orange));
                }
                yp.b bVar2 = firestoreGoalsActivity.f11150w;
                if (bVar2 != null && (tabLayout5 = bVar2.r) != null && (h13 = tabLayout5.h(0)) != null) {
                    view2 = h13.f9220e;
                } else {
                    view2 = null;
                }
                i.e(view2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                ((RobertoTextView) view2).setTextColor(g0.a.b(firestoreGoalsActivity, R.color.orange));
                yp.b bVar3 = firestoreGoalsActivity.f11150w;
                if (bVar3 != null && (tabLayout4 = bVar3.r) != null && (h12 = tabLayout4.h(1)) != null) {
                    view3 = h12.f9220e;
                }
                i.e(view3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                ((RobertoTextView) view3).setTextColor(g0.a.b(firestoreGoalsActivity, R.color.learning_hub_grey_3));
                return;
            }
            yp.b bVar4 = firestoreGoalsActivity.f11150w;
            if (bVar4 != null && (tabLayout3 = bVar4.r) != null) {
                tabLayout3.setSelectedTabIndicatorColor(g0.a.b(firestoreGoalsActivity, R.color.sea));
            }
            yp.b bVar5 = firestoreGoalsActivity.f11150w;
            if (bVar5 != null && (tabLayout2 = bVar5.r) != null && (h11 = tabLayout2.h(1)) != null) {
                view = h11.f9220e;
            } else {
                view = null;
            }
            i.e(view, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) view).setTextColor(g0.a.b(firestoreGoalsActivity, R.color.sea));
            yp.b bVar6 = firestoreGoalsActivity.f11150w;
            if (bVar6 != null && (tabLayout = bVar6.r) != null && (h10 = tabLayout.h(0)) != null) {
                view3 = h10.f9220e;
            }
            i.e(view3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) view3).setTextColor(g0.a.b(firestoreGoalsActivity, R.color.learning_hub_grey_3));
        }
    }

    public FirestoreGoalsActivity() {
        new LinkedHashMap();
        this.f11149v = LogHelper.INSTANCE.makeLogTag("FirestoreGoalsActivity");
        this.A = -1;
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new am.b(this, 0));
        i.f(registerForActivityResult, "registerForActivityResul…e null }\n        )\n\n    }");
        this.B = registerForActivityResult;
        androidx.activity.result.c<Intent> registerForActivityResult2 = registerForActivityResult(new e.d(), new am.b(this, 1));
        i.f(registerForActivityResult2, "registerForActivityResul…tchData()\n        }\n    }");
        this.C = registerForActivityResult2;
        this.D = new e();
    }

    public final void n0() {
        ConstraintLayout constraintLayout;
        yp.b bVar = this.f11150w;
        if (bVar != null && (constraintLayout = bVar.f38710a) != null) {
            constraintLayout.setOnTouchListener(new h0(9));
        }
        NpsPersistence npsPersistence = NpsPersistence.INSTANCE;
        Integer npsGoalTrackCount = npsPersistence.getNpsGoalTrackCount();
        if (npsGoalTrackCount != null) {
            if (npsGoalTrackCount.intValue() >= 45 && !npsPersistence.isNpsForGoalTrackComplete(45)) {
                npsPersistence.updateNpsGoalStatusForTrack(45, true);
                if (npsPersistence.isNpsSlotAvailable()) {
                    q0(45);
                    NpsPersistence.updateNpsSlot$default(npsPersistence, false, 1, null);
                }
            } else if (npsGoalTrackCount.intValue() >= 30 && !npsPersistence.isNpsForGoalTrackComplete(30) && npsPersistence.getHighestNpsGoalTrackCount() < 30) {
                npsPersistence.updateNpsGoalStatusForTrack(30, true);
                if (npsPersistence.isNpsSlotAvailable()) {
                    q0(30);
                    NpsPersistence.updateNpsSlot$default(npsPersistence, false, 1, null);
                }
            } else if (npsGoalTrackCount.intValue() >= 15 && !npsPersistence.isNpsForGoalTrackComplete(15) && npsPersistence.getHighestNpsGoalTrackCount() < 15) {
                npsPersistence.updateNpsGoalStatusForTrack(15, true);
                if (npsPersistence.isNpsSlotAvailable()) {
                    q0(15);
                    NpsPersistence.updateNpsSlot$default(npsPersistence, false, 1, null);
                }
            }
        }
    }

    public final void o0(boolean z10, boolean z11) {
        CardView cardView;
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_fade_out_left);
            loadAnimation.setAnimationListener(new b(z10, this, z11, AnimationUtils.loadAnimation(this, R.anim.slide_fade_in_right), loadAnimation));
            yp.b bVar = this.f11150w;
            if (bVar != null && (cardView = bVar.f) != null) {
                cardView.startAnimation(loadAnimation);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11149v, e10);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ViewPager2 viewPager2;
        TabLayout tabLayout;
        ViewPager2 viewPager22;
        TabLayout tabLayout2;
        ViewPager2 viewPager23;
        boolean z10;
        TabLayout tabLayout3;
        ViewPager2 viewPager24;
        RobertoTextView robertoTextView;
        ImageView imageView;
        super.onCreate(bundle);
        ViewPager2 viewPager25 = null;
        View inflate = getLayoutInflater().inflate(R.layout.activity_firestore_goals, (ViewGroup) null, false);
        int i6 = R.id.clNPSBottomSheet;
        ConstraintLayout constraintLayout = (ConstraintLayout) hc.d.w(R.id.clNPSBottomSheet, inflate);
        if (constraintLayout != null) {
            i6 = R.id.cvNPSRatingImage;
            if (((CardView) hc.d.w(R.id.cvNPSRatingImage, inflate)) != null) {
                i6 = R.id.feedbackTextInput;
                RobertoEditText robertoEditText = (RobertoEditText) hc.d.w(R.id.feedbackTextInput, inflate);
                if (robertoEditText != null) {
                    i6 = R.id.goalFeedbackCardBack;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) hc.d.w(R.id.goalFeedbackCardBack, inflate);
                    if (constraintLayout2 != null) {
                        i6 = R.id.goalFeedbackCardFront;
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) hc.d.w(R.id.goalFeedbackCardFront, inflate);
                        if (constraintLayout3 != null) {
                            i6 = R.id.goalFeedbackHeader;
                            RobertoTextView robertoTextView2 = (RobertoTextView) hc.d.w(R.id.goalFeedbackHeader, inflate);
                            if (robertoTextView2 != null) {
                                i6 = R.id.goalFeedbackLayout;
                                CardView cardView = (CardView) hc.d.w(R.id.goalFeedbackLayout, inflate);
                                if (cardView != null) {
                                    i6 = R.id.goalFeedbackNo;
                                    RobertoButton robertoButton = (RobertoButton) hc.d.w(R.id.goalFeedbackNo, inflate);
                                    if (robertoButton != null) {
                                        i6 = R.id.goalFeedbackTitle;
                                        if (((RobertoTextView) hc.d.w(R.id.goalFeedbackTitle, inflate)) != null) {
                                            i6 = R.id.goalFeedbackYes;
                                            RobertoButton robertoButton2 = (RobertoButton) hc.d.w(R.id.goalFeedbackYes, inflate);
                                            if (robertoButton2 != null) {
                                                i6 = R.id.goalInfoIcon;
                                                if (((AppCompatImageView) hc.d.w(R.id.goalInfoIcon, inflate)) != null) {
                                                    i6 = R.id.goalInfoLayout;
                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) hc.d.w(R.id.goalInfoLayout, inflate);
                                                    if (constraintLayout4 != null) {
                                                        i6 = R.id.goalInfoText;
                                                        if (((RobertoTextView) hc.d.w(R.id.goalInfoText, inflate)) != null) {
                                                            i6 = R.id.header_arrow_back;
                                                            ImageView imageView2 = (ImageView) hc.d.w(R.id.header_arrow_back, inflate);
                                                            if (imageView2 != null) {
                                                                i6 = R.id.heading;
                                                                if (((RobertoTextView) hc.d.w(R.id.heading, inflate)) != null) {
                                                                    i6 = R.id.ivNPSBottomSheetClose;
                                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.ivNPSBottomSheetClose, inflate);
                                                                    if (appCompatImageView != null) {
                                                                        i6 = R.id.ivNPSRatingImage;
                                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) hc.d.w(R.id.ivNPSRatingImage, inflate);
                                                                        if (appCompatImageView2 != null) {
                                                                            i6 = R.id.ivNPSSeekSelector;
                                                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) hc.d.w(R.id.ivNPSSeekSelector, inflate);
                                                                            if (appCompatImageView3 != null) {
                                                                                i6 = R.id.rbNPSSubmit1;
                                                                                RobertoButton robertoButton3 = (RobertoButton) hc.d.w(R.id.rbNPSSubmit1, inflate);
                                                                                if (robertoButton3 != null) {
                                                                                    i6 = R.id.rvGoalsListCalendar;
                                                                                    RecyclerView recyclerView = (RecyclerView) hc.d.w(R.id.rvGoalsListCalendar, inflate);
                                                                                    if (recyclerView != null) {
                                                                                        i6 = R.id.sbNPSSelector;
                                                                                        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) hc.d.w(R.id.sbNPSSelector, inflate);
                                                                                        if (appCompatSeekBar != null) {
                                                                                            i6 = R.id.submitCTA;
                                                                                            RobertoTextView robertoTextView3 = (RobertoTextView) hc.d.w(R.id.submitCTA, inflate);
                                                                                            if (robertoTextView3 != null) {
                                                                                                i6 = R.id.tabsLayout;
                                                                                                TabLayout tabLayout4 = (TabLayout) hc.d.w(R.id.tabsLayout, inflate);
                                                                                                if (tabLayout4 != null) {
                                                                                                    i6 = R.id.tvCurrentMonth;
                                                                                                    RobertoTextView robertoTextView4 = (RobertoTextView) hc.d.w(R.id.tvCurrentMonth, inflate);
                                                                                                    if (robertoTextView4 != null) {
                                                                                                        i6 = R.id.tvEditGoals;
                                                                                                        RobertoTextView robertoTextView5 = (RobertoTextView) hc.d.w(R.id.tvEditGoals, inflate);
                                                                                                        if (robertoTextView5 != null) {
                                                                                                            i6 = R.id.tvNPSBottomSheetQuestion;
                                                                                                            if (((RobertoTextView) hc.d.w(R.id.tvNPSBottomSheetQuestion, inflate)) != null) {
                                                                                                                i6 = R.id.tvNPSFooterPrompt;
                                                                                                                RobertoTextView robertoTextView6 = (RobertoTextView) hc.d.w(R.id.tvNPSFooterPrompt, inflate);
                                                                                                                if (robertoTextView6 != null) {
                                                                                                                    i6 = R.id.tvNPSHighIndicator;
                                                                                                                    if (((RobertoTextView) hc.d.w(R.id.tvNPSHighIndicator, inflate)) != null) {
                                                                                                                        i6 = R.id.tvNPSLowIndicator;
                                                                                                                        if (((RobertoTextView) hc.d.w(R.id.tvNPSLowIndicator, inflate)) != null) {
                                                                                                                            i6 = R.id.tvNPSSeekLevel0;
                                                                                                                            RobertoTextView robertoTextView7 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel0, inflate);
                                                                                                                            if (robertoTextView7 != null) {
                                                                                                                                i6 = R.id.tvNPSSeekLevel1;
                                                                                                                                RobertoTextView robertoTextView8 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel1, inflate);
                                                                                                                                if (robertoTextView8 != null) {
                                                                                                                                    i6 = R.id.tvNPSSeekLevel10;
                                                                                                                                    RobertoTextView robertoTextView9 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel10, inflate);
                                                                                                                                    if (robertoTextView9 != null) {
                                                                                                                                        i6 = R.id.tvNPSSeekLevel2;
                                                                                                                                        RobertoTextView robertoTextView10 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel2, inflate);
                                                                                                                                        if (robertoTextView10 != null) {
                                                                                                                                            i6 = R.id.tvNPSSeekLevel3;
                                                                                                                                            RobertoTextView robertoTextView11 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel3, inflate);
                                                                                                                                            if (robertoTextView11 != null) {
                                                                                                                                                i6 = R.id.tvNPSSeekLevel4;
                                                                                                                                                RobertoTextView robertoTextView12 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel4, inflate);
                                                                                                                                                if (robertoTextView12 != null) {
                                                                                                                                                    i6 = R.id.tvNPSSeekLevel5;
                                                                                                                                                    RobertoTextView robertoTextView13 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel5, inflate);
                                                                                                                                                    if (robertoTextView13 != null) {
                                                                                                                                                        i6 = R.id.tvNPSSeekLevel6;
                                                                                                                                                        RobertoTextView robertoTextView14 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel6, inflate);
                                                                                                                                                        if (robertoTextView14 != null) {
                                                                                                                                                            i6 = R.id.tvNPSSeekLevel7;
                                                                                                                                                            RobertoTextView robertoTextView15 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel7, inflate);
                                                                                                                                                            if (robertoTextView15 != null) {
                                                                                                                                                                i6 = R.id.tvNPSSeekLevel8;
                                                                                                                                                                RobertoTextView robertoTextView16 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel8, inflate);
                                                                                                                                                                if (robertoTextView16 != null) {
                                                                                                                                                                    i6 = R.id.tvNPSSeekLevel9;
                                                                                                                                                                    RobertoTextView robertoTextView17 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel9, inflate);
                                                                                                                                                                    if (robertoTextView17 != null) {
                                                                                                                                                                        i6 = R.id.viewDashboardBlanketForeground;
                                                                                                                                                                        View w10 = hc.d.w(R.id.viewDashboardBlanketForeground, inflate);
                                                                                                                                                                        if (w10 != null) {
                                                                                                                                                                            i6 = R.id.viewpager;
                                                                                                                                                                            ViewPager2 viewPager26 = (ViewPager2) hc.d.w(R.id.viewpager, inflate);
                                                                                                                                                                            if (viewPager26 != null) {
                                                                                                                                                                                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                                                                                                                                                                                this.f11150w = new yp.b(coordinatorLayout, constraintLayout, robertoEditText, constraintLayout2, constraintLayout3, robertoTextView2, cardView, robertoButton, robertoButton2, constraintLayout4, imageView2, appCompatImageView, appCompatImageView2, appCompatImageView3, robertoButton3, recyclerView, appCompatSeekBar, robertoTextView3, tabLayout4, robertoTextView4, robertoTextView5, robertoTextView6, robertoTextView7, robertoTextView8, robertoTextView9, robertoTextView10, robertoTextView11, robertoTextView12, robertoTextView13, robertoTextView14, robertoTextView15, robertoTextView16, robertoTextView17, w10, viewPager26);
                                                                                                                                                                                setContentView(coordinatorLayout);
                                                                                                                                                                                InsetsUtils.INSTANCE.setStatusBarColor(R.color.login_grey_background, this, false, true);
                                                                                                                                                                                this.f11152y = getIntent().getBooleanExtra("tutorial", false);
                                                                                                                                                                                getOnBackPressedDispatcher().a(this, new f(this));
                                                                                                                                                                                yp.b bVar = this.f11150w;
                                                                                                                                                                                if (bVar != null && (imageView = bVar.f38718j) != null) {
                                                                                                                                                                                    imageView.setOnClickListener(new am.a(this, 2));
                                                                                                                                                                                }
                                                                                                                                                                                yp.b bVar2 = this.f11150w;
                                                                                                                                                                                if (bVar2 != null && (robertoTextView = bVar2.f38727t) != null) {
                                                                                                                                                                                    robertoTextView.setOnClickListener(new am.a(this, 3));
                                                                                                                                                                                }
                                                                                                                                                                                fm.a aVar = (fm.a) new o0(this, new kk.c(MyApplication.V.a(), new j0())).a(fm.a.class);
                                                                                                                                                                                ((w) aVar.C.getValue()).e(this, new m(3, new am.i(this)));
                                                                                                                                                                                ((w) aVar.I.getValue()).e(this, new m(5, new j(this)));
                                                                                                                                                                                ((w) aVar.J.getValue()).e(this, new m(6, new k(this)));
                                                                                                                                                                                ((w) aVar.K.getValue()).e(this, new m(7, new am.l(this)));
                                                                                                                                                                                ((w) aVar.L.getValue()).e(this, new m(8, new am.m(this)));
                                                                                                                                                                                aVar.s().e(this, new m(9, new n(this)));
                                                                                                                                                                                ((w) aVar.P.getValue()).e(this, new m(10, new o(this)));
                                                                                                                                                                                ((w) aVar.V.getValue()).e(this, new m(11, new am.p(this)));
                                                                                                                                                                                ((w) aVar.U.getValue()).e(this, new m(12, new q(this)));
                                                                                                                                                                                ((w) aVar.T.getValue()).e(this, new m(13, new g(this)));
                                                                                                                                                                                ((w) aVar.W.getValue()).e(this, new m(4, new h(this)));
                                                                                                                                                                                v.H(kc.f.H(aVar), aVar.f15184z, 0, new fm.r(aVar, null), 2);
                                                                                                                                                                                this.f11151x = aVar;
                                                                                                                                                                                a aVar2 = new a(this);
                                                                                                                                                                                yp.b bVar3 = this.f11150w;
                                                                                                                                                                                if (bVar3 != null) {
                                                                                                                                                                                    viewPager2 = bVar3.H;
                                                                                                                                                                                } else {
                                                                                                                                                                                    viewPager2 = null;
                                                                                                                                                                                }
                                                                                                                                                                                if (viewPager2 != null) {
                                                                                                                                                                                    viewPager2.setAdapter(aVar2);
                                                                                                                                                                                }
                                                                                                                                                                                yp.b bVar4 = this.f11150w;
                                                                                                                                                                                if (bVar4 != null && (viewPager24 = bVar4.H) != null) {
                                                                                                                                                                                    viewPager24.f3153w.f3171a.add(this.D);
                                                                                                                                                                                }
                                                                                                                                                                                yp.b bVar5 = this.f11150w;
                                                                                                                                                                                if (bVar5 != null && (tabLayout3 = bVar5.r) != null) {
                                                                                                                                                                                    Extensions.INSTANCE.visible(tabLayout3);
                                                                                                                                                                                }
                                                                                                                                                                                yp.b bVar6 = this.f11150w;
                                                                                                                                                                                if (bVar6 != null) {
                                                                                                                                                                                    tabLayout = bVar6.r;
                                                                                                                                                                                } else {
                                                                                                                                                                                    tabLayout = null;
                                                                                                                                                                                }
                                                                                                                                                                                if (tabLayout != null) {
                                                                                                                                                                                    if (bVar6 != null) {
                                                                                                                                                                                        viewPager22 = bVar6.H;
                                                                                                                                                                                    } else {
                                                                                                                                                                                        viewPager22 = null;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (viewPager22 != null) {
                                                                                                                                                                                        if (bVar6 != null) {
                                                                                                                                                                                            tabLayout2 = bVar6.r;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            tabLayout2 = null;
                                                                                                                                                                                        }
                                                                                                                                                                                        i.d(tabLayout2);
                                                                                                                                                                                        yp.b bVar7 = this.f11150w;
                                                                                                                                                                                        if (bVar7 != null) {
                                                                                                                                                                                            viewPager23 = bVar7.H;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            viewPager23 = null;
                                                                                                                                                                                        }
                                                                                                                                                                                        i.d(viewPager23);
                                                                                                                                                                                        new com.google.android.material.tabs.d(tabLayout2, viewPager23, new am.b(this, 2)).a();
                                                                                                                                                                                        Bundle extras = getIntent().getExtras();
                                                                                                                                                                                        if (extras != null) {
                                                                                                                                                                                            String string = extras.getString(Constants.GOAL_ID, "");
                                                                                                                                                                                            if (string != null && !gv.n.B0(string)) {
                                                                                                                                                                                                z10 = false;
                                                                                                                                                                                            } else {
                                                                                                                                                                                                z10 = true;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (!z10 && string.length() >= 7) {
                                                                                                                                                                                                String substring = string.substring(0, 7);
                                                                                                                                                                                                i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                                                                                                                                                if (i.b(substring, "custom_")) {
                                                                                                                                                                                                    yp.b bVar8 = this.f11150w;
                                                                                                                                                                                                    if (bVar8 != null) {
                                                                                                                                                                                                        viewPager25 = bVar8.H;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (viewPager25 != null) {
                                                                                                                                                                                                        viewPager25.setCurrentItem(1);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                n0();
                                                                                                                                                                                return;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        if (ApplicationPersistence.getInstance().getLongValue("goal_feedback_count", 0L) >= 10) {
            p0();
        }
        super.onResume();
    }

    public final void p0() {
        RobertoButton robertoButton;
        RobertoButton robertoButton2;
        CardView cardView;
        try {
            if (!ApplicationPersistence.getInstance().getBooleanValue("goal_feedback_shown", false)) {
                UtilsKt.fireAnalytics("goal_feedback_show", UtilsKt.getAnalyticsBundle());
                yp.b bVar = this.f11150w;
                if (bVar != null && (cardView = bVar.f) != null) {
                    Extensions.INSTANCE.visible(cardView);
                }
                yp.b bVar2 = this.f11150w;
                if (bVar2 != null && (robertoButton2 = bVar2.f38716h) != null) {
                    robertoButton2.setOnClickListener(new am.a(this, 0));
                }
                yp.b bVar3 = this.f11150w;
                if (bVar3 != null && (robertoButton = bVar3.f38715g) != null) {
                    robertoButton.setOnClickListener(new am.a(this, 1));
                }
                NpsPersistence.INSTANCE.updateNpsSlot(true);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11149v, e10);
        }
    }

    public final void q0(int i6) {
        ConstraintLayout constraintLayout;
        AppCompatSeekBar appCompatSeekBar;
        RobertoTextView robertoTextView;
        RobertoTextView robertoTextView2;
        RobertoTextView robertoTextView3;
        RobertoTextView robertoTextView4;
        RobertoTextView robertoTextView5;
        RobertoTextView robertoTextView6;
        RobertoTextView robertoTextView7;
        RobertoTextView robertoTextView8;
        RobertoTextView robertoTextView9;
        RobertoTextView robertoTextView10;
        RobertoTextView robertoTextView11;
        AppCompatImageView appCompatImageView;
        RobertoButton robertoButton;
        AppCompatSeekBar appCompatSeekBar2;
        yp.b bVar = this.f11150w;
        if (bVar != null && (constraintLayout = bVar.f38710a) != null) {
            View view = bVar.G;
            if (view != null) {
                Extensions.INSTANCE.visible(view);
            }
            BottomSheetBehavior.from(constraintLayout).addBottomSheetCallback(new c());
            kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
            vVar.f23467u = -1;
            yp.b bVar2 = this.f11150w;
            AppCompatImageView appCompatImageView2 = null;
            if (bVar2 != null) {
                appCompatSeekBar = bVar2.f38724p;
            } else {
                appCompatSeekBar = null;
            }
            if (appCompatSeekBar != null) {
                appCompatSeekBar.setThumbTintList(ColorStateList.valueOf(g0.a.b(this, R.color.transparent)));
            }
            yp.b bVar3 = this.f11150w;
            if (bVar3 != null) {
                appCompatImageView2 = bVar3.f38720l;
            }
            if (appCompatImageView2 != null) {
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(g0.a.b(this, R.color.login_grey_background)));
            }
            yp.b bVar4 = this.f11150w;
            if (bVar4 != null && (appCompatSeekBar2 = bVar4.f38724p) != null) {
                appCompatSeekBar2.setOnSeekBarChangeListener(new d(vVar));
            }
            yp.b bVar5 = this.f11150w;
            if (bVar5 != null && (robertoButton = bVar5.f38722n) != null) {
                robertoButton.setOnClickListener(new am.c(vVar, this, i6, constraintLayout, 0));
            }
            BottomSheetBehavior.from(constraintLayout).setState(3);
            yp.b bVar6 = this.f11150w;
            if (bVar6 != null && (appCompatImageView = bVar6.f38719k) != null) {
                appCompatImageView.setOnClickListener(new ol.k(9, constraintLayout));
            }
            yp.b bVar7 = this.f11150w;
            if (bVar7 != null && (robertoTextView11 = bVar7.f38729v) != null) {
                robertoTextView11.setOnClickListener(new am.a(this, 7));
            }
            yp.b bVar8 = this.f11150w;
            if (bVar8 != null && (robertoTextView10 = bVar8.f38730w) != null) {
                robertoTextView10.setOnClickListener(new am.a(this, 8));
            }
            yp.b bVar9 = this.f11150w;
            if (bVar9 != null && (robertoTextView9 = bVar9.f38732y) != null) {
                robertoTextView9.setOnClickListener(new am.a(this, 9));
            }
            yp.b bVar10 = this.f11150w;
            if (bVar10 != null && (robertoTextView8 = bVar10.f38733z) != null) {
                robertoTextView8.setOnClickListener(new am.a(this, 10));
            }
            yp.b bVar11 = this.f11150w;
            if (bVar11 != null && (robertoTextView7 = bVar11.A) != null) {
                robertoTextView7.setOnClickListener(new am.a(this, 11));
            }
            yp.b bVar12 = this.f11150w;
            if (bVar12 != null && (robertoTextView6 = bVar12.B) != null) {
                robertoTextView6.setOnClickListener(new am.a(this, 12));
            }
            yp.b bVar13 = this.f11150w;
            if (bVar13 != null && (robertoTextView5 = bVar13.C) != null) {
                robertoTextView5.setOnClickListener(new am.a(this, 13));
            }
            yp.b bVar14 = this.f11150w;
            if (bVar14 != null && (robertoTextView4 = bVar14.D) != null) {
                robertoTextView4.setOnClickListener(new am.a(this, 14));
            }
            yp.b bVar15 = this.f11150w;
            if (bVar15 != null && (robertoTextView3 = bVar15.E) != null) {
                robertoTextView3.setOnClickListener(new am.a(this, 4));
            }
            yp.b bVar16 = this.f11150w;
            if (bVar16 != null && (robertoTextView2 = bVar16.F) != null) {
                robertoTextView2.setOnClickListener(new am.a(this, 5));
            }
            yp.b bVar17 = this.f11150w;
            if (bVar17 != null && (robertoTextView = bVar17.f38731x) != null) {
                robertoTextView.setOnClickListener(new am.a(this, 6));
            }
        }
        String str = gk.a.f16573a;
        Bundle bundle = new Bundle();
        defpackage.e.s(bundle, "course", "type", "goals");
        hs.k kVar = hs.k.f19476a;
        gk.a.b(bundle, "self_care_nps_display");
    }

    /* compiled from: FirestoreGoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends BottomSheetBehavior.f {
        public c() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void c(int i6, View view) {
            View view2;
            yp.b bVar;
            View view3;
            FirestoreGoalsActivity firestoreGoalsActivity = FirestoreGoalsActivity.this;
            if (i6 != 1 && i6 != 3) {
                if (i6 == 4 && (bVar = firestoreGoalsActivity.f11150w) != null && (view3 = bVar.G) != null) {
                    Extensions.INSTANCE.gone(view3);
                    return;
                }
                return;
            }
            yp.b bVar2 = firestoreGoalsActivity.f11150w;
            if (bVar2 != null && (view2 = bVar2.G) != null) {
                Extensions.INSTANCE.visible(view2);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void b(View view) {
        }
    }

    /* compiled from: FirestoreGoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.v f11161b;

        public d(kotlin.jvm.internal.v vVar) {
            this.f11161b = vVar;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i6, boolean z10) {
            AppCompatImageView appCompatImageView;
            RobertoTextView robertoTextView;
            RobertoButton robertoButton;
            boolean z11;
            boolean z12;
            yp.b bVar;
            AppCompatImageView appCompatImageView2;
            AppCompatImageView appCompatImageView3;
            AppCompatImageView appCompatImageView4;
            AppCompatImageView appCompatImageView5;
            ConstraintLayout constraintLayout;
            hs.f fVar;
            AppCompatImageView appCompatImageView6;
            float dimensionPixelSize;
            FirestoreGoalsActivity firestoreGoalsActivity = FirestoreGoalsActivity.this;
            if (seekBar != null) {
                seekBar.setThumbTintList(ColorStateList.valueOf(g0.a.b(firestoreGoalsActivity, R.color.sea)));
            }
            yp.b bVar2 = firestoreGoalsActivity.f11150w;
            AppCompatImageView appCompatImageView7 = null;
            if (bVar2 != null) {
                appCompatImageView = bVar2.f38720l;
            } else {
                appCompatImageView = null;
            }
            if (appCompatImageView != null) {
                appCompatImageView.setImageTintList(null);
            }
            kotlin.jvm.internal.v vVar = this.f11161b;
            vVar.f23467u = i6;
            yp.b bVar3 = firestoreGoalsActivity.f11150w;
            if (bVar3 != null) {
                robertoTextView = bVar3.f38728u;
            } else {
                robertoTextView = null;
            }
            if (robertoTextView != null) {
                robertoTextView.setVisibility(8);
            }
            yp.b bVar4 = firestoreGoalsActivity.f11150w;
            if (bVar4 != null) {
                robertoButton = bVar4.f38722n;
            } else {
                robertoButton = null;
            }
            boolean z13 = false;
            if (robertoButton != null) {
                robertoButton.setVisibility(0);
            }
            int i10 = vVar.f23467u;
            yp.b bVar5 = firestoreGoalsActivity.f11150w;
            if (bVar5 != null && (constraintLayout = bVar5.f38710a) != null) {
                switch (i10) {
                    case 0:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel0), 0);
                        break;
                    case 1:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel1), 0);
                        break;
                    case 2:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel2), 0);
                        break;
                    case 3:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel3), Integer.valueOf((int) R.dimen._1sdp));
                        break;
                    case 4:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel4), Integer.valueOf((int) R.dimen._2sdp));
                        break;
                    case 5:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel5), Integer.valueOf((int) R.dimen._3sdp));
                        break;
                    case 6:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel6), Integer.valueOf((int) R.dimen._3sdp));
                        break;
                    case 7:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel7), Integer.valueOf((int) R.dimen._4sdp));
                        break;
                    case 8:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel8), Integer.valueOf((int) R.dimen._4sdp));
                        break;
                    case 9:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel9), Integer.valueOf((int) R.dimen._5sdp));
                        break;
                    default:
                        fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel10), 0);
                        break;
                }
                androidx.constraintlayout.widget.b bVar6 = new androidx.constraintlayout.widget.b();
                bVar6.f(constraintLayout);
                Number number = (Number) fVar.f19464u;
                bVar6.h(R.id.ivNPSSeekSelector, 3, number.intValue(), 3);
                bVar6.h(R.id.ivNPSSeekSelector, 7, number.intValue(), 7);
                bVar6.h(R.id.ivNPSSeekSelector, 6, number.intValue(), 6);
                bVar6.h(R.id.ivNPSSeekSelector, 4, number.intValue(), 4);
                bVar6.b(constraintLayout);
                yp.b bVar7 = firestoreGoalsActivity.f11150w;
                if (bVar7 != null) {
                    appCompatImageView6 = bVar7.f38721m;
                } else {
                    appCompatImageView6 = null;
                }
                if (appCompatImageView6 != null) {
                    Number number2 = (Number) fVar.f19465v;
                    if (number2.intValue() == 0) {
                        dimensionPixelSize = 0.0f;
                    } else {
                        dimensionPixelSize = firestoreGoalsActivity.getResources().getDimensionPixelSize(number2.intValue());
                    }
                    appCompatImageView6.setTranslationX(dimensionPixelSize);
                }
            }
            yp.b bVar8 = firestoreGoalsActivity.f11150w;
            if (bVar8 != null) {
                appCompatImageView7 = bVar8.f38721m;
            }
            if (appCompatImageView7 != null) {
                appCompatImageView7.setVisibility(0);
            }
            if (i6 >= 0 && i6 < 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                yp.b bVar9 = firestoreGoalsActivity.f11150w;
                if (bVar9 != null && (appCompatImageView5 = bVar9.f38720l) != null) {
                    appCompatImageView5.setImageResource(R.drawable.ic_nps_allie_1);
                    return;
                }
                return;
            }
            if (4 <= i6 && i6 < 7) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                yp.b bVar10 = firestoreGoalsActivity.f11150w;
                if (bVar10 != null && (appCompatImageView4 = bVar10.f38720l) != null) {
                    appCompatImageView4.setImageResource(R.drawable.ic_nps_allie_2);
                    return;
                }
                return;
            }
            if (7 <= i6 && i6 < 10) {
                z13 = true;
            }
            if (z13) {
                yp.b bVar11 = firestoreGoalsActivity.f11150w;
                if (bVar11 != null && (appCompatImageView3 = bVar11.f38720l) != null) {
                    appCompatImageView3.setImageResource(R.drawable.ic_nps_allie_3);
                }
            } else if (i6 == 10 && (bVar = firestoreGoalsActivity.f11150w) != null && (appCompatImageView2 = bVar.f38720l) != null) {
                appCompatImageView2.setImageResource(R.drawable.ic_nps_allie_4);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }
}
