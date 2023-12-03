package com.theinnerhour.b2b.activity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.R;
import com.bumptech.glide.Glide;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.components.minicourses.MiniCoursesViewModel;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.MiniCourseUtilsKt;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dk.h;
import dk.j;
import dk.o;
import ek.g1;
import g0.a;
import gv.r;
import is.u;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.v;
import ss.l;
import ss.p;
import t0.r0;
import w5.h0;
/* compiled from: MiniCourseActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/MiniCourseActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class MiniCourseActivity extends rr.a {
    public static final /* synthetic */ int O = 0;
    public CourseDayModelV1 A;
    public boolean B;
    public boolean D;
    public boolean E;
    public boolean F;
    public String M;

    /* renamed from: w  reason: collision with root package name */
    public String f10446w;

    /* renamed from: x  reason: collision with root package name */
    public MiniCourse f10447x;

    /* renamed from: y  reason: collision with root package name */
    public MiniCoursesViewModel f10448y;

    /* renamed from: z  reason: collision with root package name */
    public ProgressDialog f10449z;
    public final LinkedHashMap N = new LinkedHashMap();
    public String C = "";
    public int G = -1;
    public final cg.a H = new cg.a(1);
    public final String I = LogHelper.INSTANCE.makeLogTag(MiniCourseActivity.class);
    public final int J = R.styleable.AppCompatTheme_windowFixedWidthMinor;
    public final int K = 1001;
    public final int L = Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;

    /* compiled from: MiniCourseActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<List<? extends MiniCourse>, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends MiniCourse> list) {
            boolean z10;
            List<? extends MiniCourse> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            MiniCourseActivity miniCourseActivity = MiniCourseActivity.this;
            if (!z10) {
                miniCourseActivity.f10447x = list2.get(0);
            }
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            String str = miniCourseActivity.f10446w;
            if (str != null) {
                if (!applicationPersistence.getBooleanValue("mc_welcome_".concat(str), false)) {
                    ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
                    String str2 = miniCourseActivity.f10446w;
                    if (str2 != null) {
                        applicationPersistence2.setBooleanValue("mc_welcome_".concat(str2), true);
                        String str3 = miniCourseActivity.f10446w;
                        if (str3 != null) {
                            MiniCourseActivity.w0(miniCourseActivity, str3);
                        } else {
                            i.q("miniCourseDomain");
                            throw null;
                        }
                    } else {
                        i.q("miniCourseDomain");
                        throw null;
                    }
                } else if (miniCourseActivity.B) {
                    String str4 = miniCourseActivity.f10446w;
                    if (str4 != null) {
                        MiniCourseActivity.w0(miniCourseActivity, str4);
                    } else {
                        i.q("miniCourseDomain");
                        throw null;
                    }
                }
                miniCourseActivity.D0();
                return hs.k.f19476a;
            }
            i.q("miniCourseDomain");
            throw null;
        }
    }

    /* compiled from: MiniCourseActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements p<CourseDayModelV1, Integer, hs.k> {
        public b() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(CourseDayModelV1 courseDayModelV1, Integer num) {
            CourseDayModelV1 dayModel = courseDayModelV1;
            int intValue = num.intValue();
            i.g(dayModel, "dayModel");
            MiniCourseActivity miniCourseActivity = MiniCourseActivity.this;
            miniCourseActivity.G = intValue;
            MiniCourse miniCourse = miniCourseActivity.f10447x;
            if (miniCourse != null) {
                if (intValue == miniCourse.getPlan().size() - 1 && !FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.HAPPINESS_GO_GETTER_BADGE)) {
                    HashMap<String, String> badges = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                    i.f(badges, "getInstance().user.userGamificationModel.badges");
                    badges.put(Constants.HAPPINESS_GO_GETTER_BADGE, Constants.BADGE_ATTAINED);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                }
                ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                MiniCourse miniCourse2 = miniCourseActivity.f10447x;
                if (miniCourse2 != null) {
                    String domain = miniCourse2.getDomain();
                    i.d(domain);
                    applicationPersistence.setLongValue(domain.concat("_mc_time"), Calendar.getInstance().getTimeInMillis());
                    Intent B0 = miniCourseActivity.B0(dayModel);
                    if (B0 != null) {
                        miniCourseActivity.startActivityForResult(B0, miniCourseActivity.J);
                    }
                    String str = miniCourseActivity.f10446w;
                    if (str != null) {
                        miniCourseActivity.H.b(str);
                        return hs.k.f19476a;
                    }
                    i.q("miniCourseDomain");
                    throw null;
                }
                i.q("miniCourse");
                throw null;
            }
            i.q("miniCourse");
            throw null;
        }
    }

    /* compiled from: MiniCourseActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements p<CourseDayModelV1, Integer, hs.k> {
        public c() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(CourseDayModelV1 courseDayModelV1, Integer num) {
            CourseDayModelV1 dayModel = courseDayModelV1;
            int intValue = num.intValue();
            i.g(dayModel, "dayModel");
            MiniCourseActivity miniCourseActivity = MiniCourseActivity.this;
            miniCourseActivity.G = intValue;
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            MiniCourse miniCourse = miniCourseActivity.f10447x;
            if (miniCourse != null) {
                String domain = miniCourse.getDomain();
                i.d(domain);
                applicationPersistence.setLongValue(domain.concat("_mc_time"), Calendar.getInstance().getTimeInMillis());
                Intent B0 = miniCourseActivity.B0(dayModel);
                if (B0 != null) {
                    miniCourseActivity.startActivityForResult(B0, miniCourseActivity.J);
                }
                String str = miniCourseActivity.f10446w;
                if (str != null) {
                    miniCourseActivity.H.b(str);
                    return hs.k.f19476a;
                }
                i.q("miniCourseDomain");
                throw null;
            }
            i.q("miniCourse");
            throw null;
        }
    }

    public static void u0(MiniCourseActivity this$0) {
        i.g(this$0, "this$0");
        super.onBackPressed();
    }

    public static final void w0(MiniCourseActivity miniCourseActivity, String str) {
        String string;
        String str2;
        miniCourseActivity.getClass();
        try {
            MiniCourse miniCourse = miniCourseActivity.f10447x;
            if (miniCourse == null || MiniCourseUtilsKt.getMiniCourseProgress(miniCourse) == 0 || (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && miniCourseActivity.B)) {
                ((ScrollView) miniCourseActivity.v0(com.theinnerhour.b2b.R.id.lockedViewScroll)).setVisibility(0);
                ((AppCompatImageView) miniCourseActivity.v0(com.theinnerhour.b2b.R.id.miniCourseMoreOptions)).setVisibility(8);
                ((RobertoButton) miniCourseActivity.v0(com.theinnerhour.b2b.R.id.miniCourseWelcomeButton)).setOnClickListener(new h(miniCourseActivity, 14));
                RobertoButton robertoButton = (RobertoButton) miniCourseActivity.v0(com.theinnerhour.b2b.R.id.miniCourseWelcomeButton);
                if (miniCourseActivity.B) {
                    string = miniCourseActivity.getString(com.theinnerhour.b2b.R.string.upgrade_subscription);
                } else {
                    string = miniCourseActivity.getString(com.theinnerhour.b2b.R.string.lets_get_started_single);
                }
                robertoButton.setText(string);
                RobertoTextView robertoTextView = (RobertoTextView) miniCourseActivity.v0(com.theinnerhour.b2b.R.id.miniCourseWelcomeTitle);
                MiniCoursesViewModel miniCoursesViewModel = miniCourseActivity.f10448y;
                if (miniCoursesViewModel != null) {
                    String str3 = miniCourseActivity.f10446w;
                    if (str3 != null) {
                        robertoTextView.setText(miniCoursesViewModel.h(str3));
                        MiniCoursesViewModel miniCoursesViewModel2 = miniCourseActivity.f10448y;
                        if (miniCoursesViewModel2 != null) {
                            ArrayList<String> j10 = miniCoursesViewModel2.j(str);
                            RobertoTextView robertoTextView2 = (RobertoTextView) miniCourseActivity.v0(com.theinnerhour.b2b.R.id.miniCourseWelcomeText);
                            if (r.J0(str, "basic")) {
                                if (is.k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.3", Constants.USER_VERSION})) {
                                    str2 = j10.get(0);
                                } else {
                                    str2 = (String) u.o2(j10);
                                }
                            } else {
                                str2 = j10.get(0);
                            }
                            robertoTextView2.setText(str2);
                            ((RobertoTextView) miniCourseActivity.v0(com.theinnerhour.b2b.R.id.miniCourseWelcomePoint1Text)).setText(j10.get(1));
                            ((RobertoTextView) miniCourseActivity.v0(com.theinnerhour.b2b.R.id.miniCourseWelcomePoint2Text)).setText(j10.get(2));
                            ((RobertoTextView) miniCourseActivity.v0(com.theinnerhour.b2b.R.id.miniCourseWelcomePoint3Text)).setText(j10.get(3));
                            return;
                        }
                        i.q("miniCourseViewModel");
                        throw null;
                    }
                    i.q("miniCourseDomain");
                    throw null;
                }
                i.q("miniCourseViewModel");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(miniCourseActivity.I, e10);
        }
    }

    public final void A0() {
        try {
            RobertoTextView robertoTextView = (RobertoTextView) v0(com.theinnerhour.b2b.R.id.basicCourseTitle);
            MiniCoursesViewModel miniCoursesViewModel = this.f10448y;
            if (miniCoursesViewModel != null) {
                String str = this.f10446w;
                if (str != null) {
                    robertoTextView.setText(miniCoursesViewModel.h(str));
                    String str2 = this.f10446w;
                    if (str2 != null) {
                        Integer[] miniCourseImage = MiniCourseUtilsKt.getMiniCourseImage(str2);
                        if (miniCourseImage != null) {
                            ((AppCompatImageView) v0(com.theinnerhour.b2b.R.id.miniCourseIllustrationTop)).setImageResource(miniCourseImage[0].intValue());
                            ((AppCompatImageView) v0(com.theinnerhour.b2b.R.id.miniCourseIllustrationTop)).setBackgroundResource(miniCourseImage[1].intValue());
                        }
                        C0();
                        return;
                    }
                    i.q("miniCourseDomain");
                    throw null;
                }
                i.q("miniCourseDomain");
                throw null;
            }
            i.q("miniCourseViewModel");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.I, e10);
        }
    }

    public final Intent B0(CourseDayModelV1 courseDay) {
        String stringExtra;
        String stringExtra2;
        i.g(courseDay, "courseDay");
        try {
            G0();
            if (courseDay.getStart_date() == 0) {
                MiniCourse miniCourse = this.f10447x;
                if (miniCourse != null) {
                    int size = miniCourse.getPlan().size();
                    for (int i6 = 0; i6 < size; i6++) {
                        MiniCourse miniCourse2 = this.f10447x;
                        if (miniCourse2 != null) {
                            if (i.b(miniCourse2.getPlan().get(i6).getContent_id(), courseDay.getContent_id())) {
                                MiniCourse miniCourse3 = this.f10447x;
                                if (miniCourse3 != null) {
                                    miniCourse3.getPlan().get(i6).setStart_date(Utils.INSTANCE.getTodayTimeInSeconds());
                                    FirebasePersistence.getInstance().updateUserOnFirebase();
                                } else {
                                    i.q("miniCourse");
                                    throw null;
                                }
                            }
                        } else {
                            i.q("miniCourse");
                            throw null;
                        }
                    }
                } else {
                    i.q("miniCourse");
                    throw null;
                }
            }
            this.A = courseDay;
            Bundle bundle = new Bundle();
            bundle.putBoolean("isOnboarding", false);
            MiniCourse miniCourse4 = this.f10447x;
            if (miniCourse4 != null) {
                bundle.putString("miniCourse", miniCourse4.getDomain());
                bundle.putString("course", rr.a.q0());
                bundle.putString("activity_id", courseDay.getContent_id());
                bundle.putInt("activity_position", this.G);
                Intent intent = getIntent();
                if (intent != null && (stringExtra2 = intent.getStringExtra("source")) != null) {
                    bundle.putString("source", stringExtra2);
                }
                Intent intent2 = getIntent();
                if (intent2 != null && (stringExtra = intent2.getStringExtra("status")) != null) {
                    bundle.putString("status", stringExtra);
                }
                gk.a.b(bundle, "basic_activity_start");
                Intent intent3 = new Intent(this, TemplateActivity.class);
                intent3.putExtra("day_plan", courseDay);
                MiniCourse miniCourse5 = this.f10447x;
                if (miniCourse5 != null) {
                    intent3.putExtra("miniCourse", miniCourse5.getDomain());
                    MiniCourse miniCourse6 = this.f10447x;
                    if (miniCourse6 != null) {
                        intent3.putExtra("mcCourse", miniCourse6.getCourse());
                        MiniCourse miniCourse7 = this.f10447x;
                        if (miniCourse7 != null) {
                            intent3.putExtra("goalSource", miniCourse7.getDomain());
                            intent3.putExtra("showAltFeedback", true);
                            MiniCourse miniCourse8 = this.f10447x;
                            if (miniCourse8 != null) {
                                String course = miniCourse8.getCourse();
                                i.d(course);
                                if (!i.b(UtilsKt.getCourseId(course), "")) {
                                    MiniCourse miniCourse9 = this.f10447x;
                                    if (miniCourse9 != null) {
                                        String course2 = miniCourse9.getCourse();
                                        i.d(course2);
                                        intent3.putExtra("mcCourseId", UtilsKt.getCourseId(course2));
                                    } else {
                                        i.q("miniCourse");
                                        throw null;
                                    }
                                }
                                return intent3;
                            }
                            i.q("miniCourse");
                            throw null;
                        }
                        i.q("miniCourse");
                        throw null;
                    }
                    i.q("miniCourse");
                    throw null;
                }
                i.q("miniCourse");
                throw null;
            }
            i.q("miniCourse");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.I, "exception", e10);
            return null;
        }
    }

    public final void C0() {
        MiniCourse miniCourse;
        try {
            D0();
            if (i.b(this.C, "basic") && this.F && (miniCourse = this.f10447x) != null) {
                if (miniCourse != null) {
                    if (!miniCourse.getPlan().isEmpty()) {
                        MiniCourse miniCourse2 = this.f10447x;
                        if (miniCourse2 != null) {
                            if (miniCourse2.getPlan().get(0).getStart_date() == 0) {
                                ((CardView) v0(com.theinnerhour.b2b.R.id.proPurchaseLayout)).setVisibility(8);
                                RobertoTextView robertoTextView = (RobertoTextView) v0(com.theinnerhour.b2b.R.id.basicCourseTitle);
                                if (robertoTextView != null) {
                                    MiniCoursesViewModel miniCoursesViewModel = this.f10448y;
                                    if (miniCoursesViewModel != null) {
                                        String str = this.f10446w;
                                        if (str != null) {
                                            robertoTextView.setText(miniCoursesViewModel.h(str));
                                        } else {
                                            i.q("miniCourseDomain");
                                            throw null;
                                        }
                                    } else {
                                        i.q("miniCourseViewModel");
                                        throw null;
                                    }
                                }
                                ((RecyclerView) v0(com.theinnerhour.b2b.R.id.basicCourseRecyclerView)).setVisibility(8);
                                v0(com.theinnerhour.b2b.R.id.newTutorialLayout).setVisibility(0);
                                RobertoTextView robertoTextView2 = (RobertoTextView) v0(com.theinnerhour.b2b.R.id.newTutorialLayout).findViewById(com.theinnerhour.b2b.R.id.basicCourseTitle);
                                MiniCourse miniCourse3 = this.f10447x;
                                if (miniCourse3 != null) {
                                    robertoTextView2.setText(miniCourse3.getPlan().get(0).getContent_label());
                                    ((RobertoTextView) v0(com.theinnerhour.b2b.R.id.newTutorialLayout).findViewById(com.theinnerhour.b2b.R.id.basicCourseDayText)).setText("Day 1");
                                    Object obj = g0.a.f16164a;
                                    ((AppCompatImageView) v0(com.theinnerhour.b2b.R.id.newTutorialLayout).findViewById(com.theinnerhour.b2b.R.id.basicCourseTickImageView)).setBackground(a.c.b(this, com.theinnerhour.b2b.R.drawable.circle_hollow_title_grey));
                                    ((AppCompatImageView) v0(com.theinnerhour.b2b.R.id.newTutorialLayout).findViewById(com.theinnerhour.b2b.R.id.basicCourseTickImageView)).setVisibility(0);
                                    ((AppCompatImageView) v0(com.theinnerhour.b2b.R.id.newTutorialLayout).findViewById(com.theinnerhour.b2b.R.id.basicCourseChevron)).setVisibility(0);
                                    ((RobertoTextView) v0(com.theinnerhour.b2b.R.id.newTutDesc)).setVisibility(0);
                                    Handler handler = new Handler();
                                    handler.postDelayed(new dk.l(this, 0), 500L);
                                    v0(com.theinnerhour.b2b.R.id.newTutorialLayout).setOnClickListener(new defpackage.a(this, 6, handler));
                                    return;
                                }
                                i.q("miniCourse");
                                throw null;
                            }
                            return;
                        }
                        i.q("miniCourse");
                        throw null;
                    }
                    return;
                }
                i.q("miniCourse");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.I, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: Exception -> 0x00c5, TRY_LEAVE, TryCatch #0 {Exception -> 0x00c5, blocks: (B:3:0x0003, B:5:0x0012, B:7:0x0024, B:12:0x003b, B:14:0x0052, B:17:0x0068, B:19:0x006e, B:29:0x00ae, B:20:0x0089, B:21:0x008c, B:22:0x008d, B:26:0x0095, B:28:0x0099, B:30:0x00c1, B:31:0x00c4), top: B:35:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D0() {
        int i6;
        try {
            CardView cardView = (CardView) v0(com.theinnerhour.b2b.R.id.proPurchaseLayout);
            if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && (i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE))) {
                i6 = 0;
                cardView.setVisibility(i6);
                ((CardView) v0(com.theinnerhour.b2b.R.id.proPurchaseLayout)).setOnClickListener(new h(this, 15));
                if (this.f10447x == null) {
                    boolean z10 = true;
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
                    if (i.b(this.C, "basic")) {
                        MiniCourse miniCourse = this.f10447x;
                        if (miniCourse != null) {
                            ArrayList<CourseDayModelV1> plan = miniCourse.getPlan();
                            b bVar = new b();
                            i.g(plan, "plan");
                            ((RecyclerView) v0(com.theinnerhour.b2b.R.id.basicCourseRecyclerView)).setAdapter(new ek.h(this, plan, null, bVar));
                        } else {
                            i.q("miniCourse");
                            throw null;
                        }
                    } else {
                        if (this.B) {
                            z10 = false;
                        }
                        MiniCourse miniCourse2 = this.f10447x;
                        if (miniCourse2 != null) {
                            ((RecyclerView) v0(com.theinnerhour.b2b.R.id.basicCourseRecyclerView)).setAdapter(new g1(this, z10, miniCourse2.getPlan(), new c()));
                        } else {
                            i.q("miniCourse");
                            throw null;
                        }
                    }
                    ((RecyclerView) v0(com.theinnerhour.b2b.R.id.basicCourseRecyclerView)).setFocusable(false);
                    ((RecyclerView) v0(com.theinnerhour.b2b.R.id.basicCourseRecyclerView)).setLayoutManager(linearLayoutManager);
                    return;
                }
                return;
            }
            i6 = 8;
            cardView.setVisibility(i6);
            ((CardView) v0(com.theinnerhour.b2b.R.id.proPurchaseLayout)).setOnClickListener(new h(this, 15));
            if (this.f10447x == null) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.I, e10);
        }
    }

    public final void E0(boolean z10) {
        if (!z10) {
            try {
                if (this.F) {
                    this.F = false;
                }
                if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && i.b(this.C, "basic") && this.E) {
                    CourseDayModelV1 courseDayModelV1 = this.A;
                    i.d(courseDayModelV1);
                    y0(courseDayModelV1);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.I, e10);
            }
        }
    }

    public final void F0(String str) {
        if ((z0() > 1 || ApplicationPersistence.getInstance().getBooleanValue("app_feedback_day_three", false)) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
            long longValue = ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_DASHBOARD_DATE, 0L);
            Utils utils = Utils.INSTANCE;
            if (longValue != utils.getTodayCalendar().getTimeInMillis() && ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_GOAL_DATE, 0L) != utils.getTodayCalendar().getTimeInMillis()) {
                ApplicationPersistence.getInstance().setBooleanValue(str, false);
                ApplicationPersistence.getInstance().setBooleanValue(Constants.SHOW_APP_FEEDBACK_POPUP, false);
                ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DATE, utils.getTodayCalendar().getTimeInMillis());
                NpsPersistence.INSTANCE.updateNpsSlot(true);
                ApplicationPersistence.getInstance().setBooleanValue("app_feedback_day_three", false);
                Dialog styledDialog = UiUtils.Companion.getStyledDialog(com.theinnerhour.b2b.R.layout.dialog_feedback_activity_finish, this, com.theinnerhour.b2b.R.style.Theme_Dialog_Fullscreen);
                Window window = styledDialog.getWindow();
                i.d(window);
                window.getAttributes().windowAnimations = com.theinnerhour.b2b.R.style.DialogGrowInAndShrinkOut;
                Glide.c(this).d(this).o(Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.template_background)).B((AppCompatImageView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.backgroundImage));
                ((RobertoButton) styledDialog.findViewById(com.theinnerhour.b2b.R.id.feedback_yes)).setOnClickListener(new dk.i(this, styledDialog));
                ((RobertoButton) styledDialog.findViewById(com.theinnerhour.b2b.R.id.feedback_no)).setOnClickListener(new dk.i(styledDialog, this, 1));
                Window window2 = styledDialog.getWindow();
                if (window2 != null) {
                    window2.setLayout(-1, -1);
                }
                styledDialog.setOnCancelListener(new j(0));
                styledDialog.setOnDismissListener(new dk.k(0));
                styledDialog.show();
                Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                analyticsBundle.putString("trigger", ApplicationPersistence.getInstance().getStringValue(Constants.APP_FEEDBACK_TRIGGER));
                gk.a.b(analyticsBundle, "feedback_basic_course_playstore_show");
                return;
            }
        }
        if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && this.E && !this.D) {
            if (defpackage.b.u(SessionManager.KEY_USERTYPE, "patient") || !i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) {
                startActivityForResult(tr.r.s(this, true).putExtra("source", "basic_course_end").putExtra(Constants.CAMPAIGN_ID, this.M), this.L);
            }
        }
    }

    public final void G0() {
        MiniCoursesViewModel miniCoursesViewModel = this.f10448y;
        if (miniCoursesViewModel != null) {
            String str = this.f10446w;
            if (str != null) {
                miniCoursesViewModel.g(str);
                return;
            } else {
                i.q("miniCourseDomain");
                throw null;
            }
        }
        i.q("miniCourseViewModel");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f6 A[Catch: Exception -> 0x05e8, TryCatch #0 {Exception -> 0x05e8, blocks: (B:3:0x000f, B:5:0x001b, B:7:0x0023, B:8:0x002a, B:10:0x002e, B:13:0x0034, B:20:0x0059, B:26:0x0069, B:65:0x011f, B:67:0x0131, B:69:0x013f, B:71:0x014e, B:72:0x0159, B:74:0x0164, B:76:0x0178, B:78:0x0180, B:79:0x0186, B:81:0x0191, B:83:0x019c, B:85:0x01a2, B:89:0x01b7, B:94:0x01c5, B:99:0x01d1, B:103:0x01dc, B:105:0x01e8, B:107:0x01ee, B:108:0x01f2, B:110:0x01f8, B:112:0x0207, B:118:0x0214, B:120:0x0218, B:122:0x021e, B:123:0x0222, B:125:0x0228, B:127:0x0237, B:129:0x023d, B:133:0x0245, B:135:0x0249, B:139:0x025c, B:141:0x0265, B:143:0x0286, B:144:0x0299, B:146:0x029f, B:148:0x02ae, B:154:0x02bb, B:156:0x02bf, B:158:0x02c5, B:159:0x02ca, B:161:0x02d0, B:171:0x02f6, B:164:0x02ea, B:151:0x02b5, B:152:0x02b9, B:172:0x02fc, B:174:0x0300, B:175:0x0313, B:177:0x0319, B:179:0x0328, B:185:0x0335, B:187:0x034f, B:189:0x035d, B:191:0x036d, B:193:0x0378, B:194:0x0399, B:195:0x03ae, B:197:0x03bc, B:199:0x03cc, B:182:0x032f, B:183:0x0333, B:200:0x03df, B:201:0x03e3, B:202:0x03e4, B:204:0x03e8, B:206:0x03f6, B:208:0x0406, B:115:0x020e, B:116:0x0212, B:209:0x0418, B:210:0x041e, B:90:0x01bc, B:211:0x0424, B:212:0x0428, B:213:0x0429, B:214:0x042d, B:301:0x05ae, B:306:0x05b7, B:308:0x05c0, B:309:0x05d8, B:27:0x0080, B:29:0x008b, B:30:0x009e, B:32:0x00a4, B:34:0x00b8, B:41:0x00c9, B:43:0x00cd, B:45:0x00d3, B:46:0x00d8, B:48:0x00de, B:62:0x0115, B:51:0x00fc, B:38:0x00c2, B:39:0x00c6, B:217:0x0436, B:221:0x0446, B:223:0x0452, B:225:0x045f, B:227:0x0465, B:231:0x0476, B:233:0x047c, B:234:0x0483, B:235:0x0496, B:237:0x049c, B:239:0x04ab, B:245:0x04b8, B:247:0x04bc, B:249:0x04c2, B:250:0x04c6, B:252:0x04cc, B:256:0x04e8, B:258:0x04ec, B:260:0x04f2, B:262:0x04fc, B:264:0x051d, B:265:0x0530, B:267:0x0536, B:269:0x0545, B:275:0x0552, B:277:0x0556, B:279:0x055c, B:280:0x0561, B:282:0x0567, B:294:0x0590, B:285:0x0581, B:272:0x054c, B:273:0x0550, B:295:0x0594, B:296:0x0598, B:297:0x0599, B:242:0x04b2, B:243:0x04b6, B:298:0x059f, B:299:0x05a7, B:300:0x05ad, B:310:0x05dc, B:311:0x05e0, B:312:0x05e1, B:313:0x05e7), top: B:317:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069 A[Catch: Exception -> 0x05e8, TryCatch #0 {Exception -> 0x05e8, blocks: (B:3:0x000f, B:5:0x001b, B:7:0x0023, B:8:0x002a, B:10:0x002e, B:13:0x0034, B:20:0x0059, B:26:0x0069, B:65:0x011f, B:67:0x0131, B:69:0x013f, B:71:0x014e, B:72:0x0159, B:74:0x0164, B:76:0x0178, B:78:0x0180, B:79:0x0186, B:81:0x0191, B:83:0x019c, B:85:0x01a2, B:89:0x01b7, B:94:0x01c5, B:99:0x01d1, B:103:0x01dc, B:105:0x01e8, B:107:0x01ee, B:108:0x01f2, B:110:0x01f8, B:112:0x0207, B:118:0x0214, B:120:0x0218, B:122:0x021e, B:123:0x0222, B:125:0x0228, B:127:0x0237, B:129:0x023d, B:133:0x0245, B:135:0x0249, B:139:0x025c, B:141:0x0265, B:143:0x0286, B:144:0x0299, B:146:0x029f, B:148:0x02ae, B:154:0x02bb, B:156:0x02bf, B:158:0x02c5, B:159:0x02ca, B:161:0x02d0, B:171:0x02f6, B:164:0x02ea, B:151:0x02b5, B:152:0x02b9, B:172:0x02fc, B:174:0x0300, B:175:0x0313, B:177:0x0319, B:179:0x0328, B:185:0x0335, B:187:0x034f, B:189:0x035d, B:191:0x036d, B:193:0x0378, B:194:0x0399, B:195:0x03ae, B:197:0x03bc, B:199:0x03cc, B:182:0x032f, B:183:0x0333, B:200:0x03df, B:201:0x03e3, B:202:0x03e4, B:204:0x03e8, B:206:0x03f6, B:208:0x0406, B:115:0x020e, B:116:0x0212, B:209:0x0418, B:210:0x041e, B:90:0x01bc, B:211:0x0424, B:212:0x0428, B:213:0x0429, B:214:0x042d, B:301:0x05ae, B:306:0x05b7, B:308:0x05c0, B:309:0x05d8, B:27:0x0080, B:29:0x008b, B:30:0x009e, B:32:0x00a4, B:34:0x00b8, B:41:0x00c9, B:43:0x00cd, B:45:0x00d3, B:46:0x00d8, B:48:0x00de, B:62:0x0115, B:51:0x00fc, B:38:0x00c2, B:39:0x00c6, B:217:0x0436, B:221:0x0446, B:223:0x0452, B:225:0x045f, B:227:0x0465, B:231:0x0476, B:233:0x047c, B:234:0x0483, B:235:0x0496, B:237:0x049c, B:239:0x04ab, B:245:0x04b8, B:247:0x04bc, B:249:0x04c2, B:250:0x04c6, B:252:0x04cc, B:256:0x04e8, B:258:0x04ec, B:260:0x04f2, B:262:0x04fc, B:264:0x051d, B:265:0x0530, B:267:0x0536, B:269:0x0545, B:275:0x0552, B:277:0x0556, B:279:0x055c, B:280:0x0561, B:282:0x0567, B:294:0x0590, B:285:0x0581, B:272:0x054c, B:273:0x0550, B:295:0x0594, B:296:0x0598, B:297:0x0599, B:242:0x04b2, B:243:0x04b6, B:298:0x059f, B:299:0x05a7, B:300:0x05ad, B:310:0x05dc, B:311:0x05e0, B:312:0x05e1, B:313:0x05e7), top: B:317:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[Catch: Exception -> 0x05e8, TryCatch #0 {Exception -> 0x05e8, blocks: (B:3:0x000f, B:5:0x001b, B:7:0x0023, B:8:0x002a, B:10:0x002e, B:13:0x0034, B:20:0x0059, B:26:0x0069, B:65:0x011f, B:67:0x0131, B:69:0x013f, B:71:0x014e, B:72:0x0159, B:74:0x0164, B:76:0x0178, B:78:0x0180, B:79:0x0186, B:81:0x0191, B:83:0x019c, B:85:0x01a2, B:89:0x01b7, B:94:0x01c5, B:99:0x01d1, B:103:0x01dc, B:105:0x01e8, B:107:0x01ee, B:108:0x01f2, B:110:0x01f8, B:112:0x0207, B:118:0x0214, B:120:0x0218, B:122:0x021e, B:123:0x0222, B:125:0x0228, B:127:0x0237, B:129:0x023d, B:133:0x0245, B:135:0x0249, B:139:0x025c, B:141:0x0265, B:143:0x0286, B:144:0x0299, B:146:0x029f, B:148:0x02ae, B:154:0x02bb, B:156:0x02bf, B:158:0x02c5, B:159:0x02ca, B:161:0x02d0, B:171:0x02f6, B:164:0x02ea, B:151:0x02b5, B:152:0x02b9, B:172:0x02fc, B:174:0x0300, B:175:0x0313, B:177:0x0319, B:179:0x0328, B:185:0x0335, B:187:0x034f, B:189:0x035d, B:191:0x036d, B:193:0x0378, B:194:0x0399, B:195:0x03ae, B:197:0x03bc, B:199:0x03cc, B:182:0x032f, B:183:0x0333, B:200:0x03df, B:201:0x03e3, B:202:0x03e4, B:204:0x03e8, B:206:0x03f6, B:208:0x0406, B:115:0x020e, B:116:0x0212, B:209:0x0418, B:210:0x041e, B:90:0x01bc, B:211:0x0424, B:212:0x0428, B:213:0x0429, B:214:0x042d, B:301:0x05ae, B:306:0x05b7, B:308:0x05c0, B:309:0x05d8, B:27:0x0080, B:29:0x008b, B:30:0x009e, B:32:0x00a4, B:34:0x00b8, B:41:0x00c9, B:43:0x00cd, B:45:0x00d3, B:46:0x00d8, B:48:0x00de, B:62:0x0115, B:51:0x00fc, B:38:0x00c2, B:39:0x00c6, B:217:0x0436, B:221:0x0446, B:223:0x0452, B:225:0x045f, B:227:0x0465, B:231:0x0476, B:233:0x047c, B:234:0x0483, B:235:0x0496, B:237:0x049c, B:239:0x04ab, B:245:0x04b8, B:247:0x04bc, B:249:0x04c2, B:250:0x04c6, B:252:0x04cc, B:256:0x04e8, B:258:0x04ec, B:260:0x04f2, B:262:0x04fc, B:264:0x051d, B:265:0x0530, B:267:0x0536, B:269:0x0545, B:275:0x0552, B:277:0x0556, B:279:0x055c, B:280:0x0561, B:282:0x0567, B:294:0x0590, B:285:0x0581, B:272:0x054c, B:273:0x0550, B:295:0x0594, B:296:0x0598, B:297:0x0599, B:242:0x04b2, B:243:0x04b6, B:298:0x059f, B:299:0x05a7, B:300:0x05ad, B:310:0x05dc, B:311:0x05e0, B:312:0x05e1, B:313:0x05e7), top: B:317:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i6, int i10, Intent intent) {
        int i11;
        int i12;
        Intent intent2;
        Object obj;
        ArrayList<CourseDayModelV1> plan;
        Object obj2;
        boolean z10;
        Object obj3;
        boolean z11;
        ArrayList<CourseDayModelV1> plan2;
        int i13;
        String str;
        boolean z12;
        ArrayList<MiniCourse> miniCourses;
        Object obj4;
        ArrayList<CourseDayModelV1> plan3;
        Object obj5;
        Object obj6;
        Object obj7;
        boolean z13;
        ArrayList<CourseDayModelV1> plan4;
        boolean z14;
        boolean z15;
        Object obj8;
        boolean z16;
        ArrayList<CourseDayModelV1> plan5;
        super.onActivityResult(i6, i10, intent);
        try {
            if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.FFM_MINICOURSES, false) && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                ApplicationPersistence.getInstance().setBooleanValue(Constants.FFM_MINICOURSES, true);
            }
            MiniCoursesViewModel miniCoursesViewModel = this.f10448y;
            if (miniCoursesViewModel == null) {
                i.q("miniCourseViewModel");
                throw null;
            }
            String str2 = this.f10446w;
            if (str2 != null) {
                miniCoursesViewModel.g(str2);
                boolean b10 = i.b(this.C, "basic");
                int i14 = this.J;
                if (b10) {
                    int i15 = this.K;
                    if (i6 == i15) {
                        if (intent != null) {
                            str = "miniCourse";
                            if (intent.getBooleanExtra("monetization_open", false)) {
                                z14 = true;
                                if (!z14) {
                                    Intent intent3 = new Intent();
                                    intent3.putExtra("tutorial", true);
                                    setResult(-1, intent3);
                                    this.D = false;
                                    finish();
                                    i13 = i15;
                                } else {
                                    CourseDayModelV1 courseDayModelV1 = this.A;
                                    i.d(courseDayModelV1);
                                    if (courseDayModelV1.getPosition() != 0) {
                                        ArrayList<MiniCourse> miniCourses2 = FirebasePersistence.getInstance().getUser().getMiniCourses();
                                        i.f(miniCourses2, "getInstance().user.miniCourses");
                                        Iterator it = miniCourses2.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                obj8 = null;
                                                break;
                                            }
                                            Object next = it.next();
                                            Iterator it2 = it;
                                            String domain = ((MiniCourse) next).getDomain();
                                            obj8 = next;
                                            String str3 = this.f10446w;
                                            if (str3 == null) {
                                                i.q("miniCourseDomain");
                                                throw null;
                                            } else if (i.b(domain, str3)) {
                                                break;
                                            } else {
                                                it = it2;
                                            }
                                        }
                                        MiniCourse miniCourse = (MiniCourse) obj8;
                                        if (miniCourse == null || (plan5 = miniCourse.getPlan()) == null) {
                                            i13 = i15;
                                        } else {
                                            Iterator<CourseDayModelV1> it3 = plan5.iterator();
                                            int i16 = 0;
                                            while (true) {
                                                if (!it3.hasNext()) {
                                                    i13 = i15;
                                                    i16 = -1;
                                                    break;
                                                }
                                                Iterator<CourseDayModelV1> it4 = it3;
                                                String content_id = it3.next().getContent_id();
                                                i13 = i15;
                                                CourseDayModelV1 courseDayModelV12 = this.A;
                                                i.d(courseDayModelV12);
                                                if (i.b(content_id, courseDayModelV12.getContent_id())) {
                                                    break;
                                                }
                                                i16++;
                                                i15 = i13;
                                                it3 = it4;
                                            }
                                            if (i16 == 0) {
                                                z16 = true;
                                                if (z16) {
                                                    z15 = false;
                                                    E0(z15);
                                                }
                                            }
                                        }
                                        z16 = false;
                                        if (z16) {
                                        }
                                    } else {
                                        i13 = i15;
                                    }
                                    z15 = true;
                                    E0(z15);
                                }
                            }
                        } else {
                            str = "miniCourse";
                        }
                        z14 = false;
                        if (!z14) {
                        }
                    } else {
                        i13 = i15;
                        str = "miniCourse";
                    }
                    if (i6 == i14) {
                        ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("mc_welcome_");
                        String str4 = this.f10446w;
                        if (str4 != null) {
                            sb2.append(str4);
                            if (applicationPersistence.getBooleanValue(sb2.toString(), false) && ((ScrollView) v0(com.theinnerhour.b2b.R.id.lockedViewScroll)).getVisibility() == 0) {
                                ((ScrollView) v0(com.theinnerhour.b2b.R.id.lockedViewScroll)).setVisibility(8);
                            }
                            z0();
                            G0();
                            if (this.G == 2 && !FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("show_discount_40_time") && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                                gk.a.b(null, "basic_course_day_3");
                            }
                            Bundle bundle = new Bundle();
                            MiniCourse miniCourse2 = this.f10447x;
                            if (miniCourse2 != null) {
                                bundle.putString("course", miniCourse2.getCourse());
                                CourseDayModelV1 courseDayModelV13 = this.A;
                                bundle.putString("activity_id", courseDayModelV13 != null ? courseDayModelV13.getContent_id() : null);
                                bundle.putInt("activity_position", this.G);
                                if (getIntent().hasExtra("tutorial")) {
                                    bundle.putBoolean("isOnboarding", true);
                                    z12 = false;
                                } else {
                                    z12 = false;
                                    bundle.putBoolean("isOnboarding", false);
                                }
                                if (i10 == -1) {
                                    this.E = (intent != null && intent.getBooleanExtra("showSelling", z12)) && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled();
                                    User user = FirebasePersistence.getInstance().getUser();
                                    if (user != null && (miniCourses = user.getMiniCourses()) != null) {
                                        Iterator<T> it5 = miniCourses.iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                obj4 = null;
                                                break;
                                            }
                                            obj4 = it5.next();
                                            String domain2 = ((MiniCourse) obj4).getDomain();
                                            String str5 = this.f10446w;
                                            if (str5 == null) {
                                                i.q("miniCourseDomain");
                                                throw null;
                                            } else if (i.b(domain2, str5)) {
                                                break;
                                            }
                                        }
                                        MiniCourse miniCourse3 = (MiniCourse) obj4;
                                        if (miniCourse3 != null && (plan3 = miniCourse3.getPlan()) != null) {
                                            Iterator<T> it6 = plan3.iterator();
                                            while (true) {
                                                if (!it6.hasNext()) {
                                                    obj5 = null;
                                                    break;
                                                }
                                                obj5 = it6.next();
                                                String content_id2 = ((CourseDayModelV1) obj5).getContent_id();
                                                CourseDayModelV1 courseDayModelV14 = this.A;
                                                if (i.b(content_id2, courseDayModelV14 != null ? courseDayModelV14.getContent_id() : null)) {
                                                    break;
                                                }
                                            }
                                            CourseDayModelV1 courseDayModelV15 = (CourseDayModelV1) obj5;
                                            if (courseDayModelV15 != null) {
                                                if (!courseDayModelV15.isCompleted()) {
                                                    courseDayModelV15.setCompleted(true);
                                                    MiniCourse miniCourse4 = this.f10447x;
                                                    if (miniCourse4 != null) {
                                                        FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(new GamificationModel(5, Constants.GAMIFICATION_DASHBOARD_DAILY_TASK, miniCourse4.getCourse()));
                                                        FirebasePersistence.getInstance().updateUserOnFirebase();
                                                        CourseDayModelV1 courseDayModelV16 = this.A;
                                                        i.d(courseDayModelV16);
                                                        if (courseDayModelV16.getPosition() != 0) {
                                                            ArrayList<MiniCourse> miniCourses3 = FirebasePersistence.getInstance().getUser().getMiniCourses();
                                                            i.f(miniCourses3, "getInstance().user.miniCourses");
                                                            Iterator<T> it7 = miniCourses3.iterator();
                                                            while (true) {
                                                                if (!it7.hasNext()) {
                                                                    obj7 = null;
                                                                    break;
                                                                }
                                                                obj7 = it7.next();
                                                                String domain3 = ((MiniCourse) obj7).getDomain();
                                                                String str6 = this.f10446w;
                                                                if (str6 == null) {
                                                                    i.q("miniCourseDomain");
                                                                    throw null;
                                                                } else if (i.b(domain3, str6)) {
                                                                    break;
                                                                }
                                                            }
                                                            MiniCourse miniCourse5 = (MiniCourse) obj7;
                                                            if (miniCourse5 != null && (plan4 = miniCourse5.getPlan()) != null) {
                                                                Iterator<CourseDayModelV1> it8 = plan4.iterator();
                                                                int i17 = 0;
                                                                while (true) {
                                                                    if (!it8.hasNext()) {
                                                                        i17 = -1;
                                                                        break;
                                                                    }
                                                                    String content_id3 = it8.next().getContent_id();
                                                                    CourseDayModelV1 courseDayModelV17 = this.A;
                                                                    i.d(courseDayModelV17);
                                                                    if (i.b(content_id3, courseDayModelV17.getContent_id())) {
                                                                        break;
                                                                    }
                                                                    i17++;
                                                                }
                                                                if (i17 == 0) {
                                                                    z13 = true;
                                                                    if (z13) {
                                                                        E0(false);
                                                                    }
                                                                }
                                                            }
                                                            z13 = false;
                                                            if (z13) {
                                                            }
                                                        }
                                                        if (this.E) {
                                                            ArrayList<MiniCourse> miniCourses4 = FirebasePersistence.getInstance().getUser().getMiniCourses();
                                                            i.f(miniCourses4, "getInstance().user.miniCourses");
                                                            Iterator<T> it9 = miniCourses4.iterator();
                                                            while (true) {
                                                                if (!it9.hasNext()) {
                                                                    obj6 = null;
                                                                    break;
                                                                }
                                                                obj6 = it9.next();
                                                                String domain4 = ((MiniCourse) obj6).getDomain();
                                                                String str7 = this.f10446w;
                                                                if (str7 == null) {
                                                                    i.q("miniCourseDomain");
                                                                    throw null;
                                                                } else if (i.b(domain4, str7)) {
                                                                    break;
                                                                }
                                                            }
                                                            i.d(obj6);
                                                            if (((MiniCourse) obj6).getPlan().get(1).getStart_date() == 0) {
                                                                if (i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) {
                                                                    if (ApplicationPersistence.getInstance().getBooleanValue(Constants.KEY_SHOW_REWARD_SCREEN, true)) {
                                                                        startActivityForResult(tr.r.s(this, true).putExtra("source", "basic_course_end").putExtra("tutorial", true).putExtra(Constants.CAMPAIGN_ID, this.M), i13);
                                                                        ApplicationPersistence.getInstance().setBooleanValue(Constants.KEY_SHOW_REWARD_SCREEN, false);
                                                                    } else {
                                                                        startActivityForResult(tr.r.s(this, true).putExtra("source", "basic_course_end").putExtra(Constants.CAMPAIGN_ID, this.M), i13);
                                                                    }
                                                                }
                                                            } else if (i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) {
                                                                startActivity(tr.r.s(this, true).putExtra("source", "basic_course_end").putExtra(Constants.CAMPAIGN_ID, this.M));
                                                            }
                                                        }
                                                    } else {
                                                        i.q(str);
                                                        throw null;
                                                    }
                                                } else if (this.E && (i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE))) {
                                                    startActivity(tr.r.s(this, true).putExtra("source", "basic_course_end").putExtra(Constants.CAMPAIGN_ID, this.M));
                                                }
                                            }
                                        }
                                    }
                                    gk.a.b(bundle, "basic_activity_finish");
                                } else {
                                    gk.a.b(bundle, "basic_activity_incomplete");
                                }
                            } else {
                                i.q(str);
                                throw null;
                            }
                        } else {
                            i.q("miniCourseDomain");
                            throw null;
                        }
                    }
                } else if (i.b(this.C, "mini")) {
                    i11 = i6;
                    if (i11 == i14) {
                        G0();
                        Bundle bundle2 = new Bundle();
                        MiniCourse miniCourse6 = this.f10447x;
                        if (miniCourse6 != null) {
                            bundle2.putString("miniCourse", miniCourse6.getDomain());
                            CourseDayModelV1 courseDayModelV18 = this.A;
                            bundle2.putString("activity_id", courseDayModelV18 != null ? courseDayModelV18.getContent_id() : null);
                            bundle2.putInt("activity_position", this.G);
                            i12 = i10;
                            if (i12 == -1) {
                                intent2 = intent;
                                if (intent2 != null && intent2.hasExtra("showSelling")) {
                                    this.E = intent2.getBooleanExtra("showSelling", false);
                                }
                                ArrayList<MiniCourse> miniCourses5 = FirebasePersistence.getInstance().getUser().getMiniCourses();
                                i.f(miniCourses5, "getInstance().user.miniCourses");
                                Iterator<T> it10 = miniCourses5.iterator();
                                while (true) {
                                    if (!it10.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it10.next();
                                    String domain5 = ((MiniCourse) obj).getDomain();
                                    String str8 = this.f10446w;
                                    if (str8 == null) {
                                        i.q("miniCourseDomain");
                                        throw null;
                                    } else if (i.b(domain5, str8)) {
                                        break;
                                    }
                                }
                                MiniCourse miniCourse7 = (MiniCourse) obj;
                                if (miniCourse7 != null && (plan = miniCourse7.getPlan()) != null) {
                                    Iterator<T> it11 = plan.iterator();
                                    while (true) {
                                        if (!it11.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it11.next();
                                        String content_id4 = ((CourseDayModelV1) obj2).getContent_id();
                                        CourseDayModelV1 courseDayModelV19 = this.A;
                                        i.d(courseDayModelV19);
                                        if (i.b(content_id4, courseDayModelV19.getContent_id())) {
                                            break;
                                        }
                                    }
                                    CourseDayModelV1 courseDayModelV110 = (CourseDayModelV1) obj2;
                                    if (courseDayModelV110 != null && !courseDayModelV110.isCompleted()) {
                                        courseDayModelV110.setCompleted(true);
                                        MiniCourse miniCourse8 = this.f10447x;
                                        if (miniCourse8 != null) {
                                            FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(new GamificationModel(5, Constants.GAMIFICATION_DASHBOARD_DAILY_TASK, miniCourse8.getCourse()));
                                            FirebasePersistence.getInstance().updateUserOnFirebase();
                                            CourseDayModelV1 courseDayModelV111 = this.A;
                                            i.d(courseDayModelV111);
                                            if (courseDayModelV111.getPosition() != 0) {
                                                ArrayList<MiniCourse> miniCourses6 = FirebasePersistence.getInstance().getUser().getMiniCourses();
                                                i.f(miniCourses6, "getInstance().user.miniCourses");
                                                Iterator<T> it12 = miniCourses6.iterator();
                                                while (true) {
                                                    if (!it12.hasNext()) {
                                                        obj3 = null;
                                                        break;
                                                    }
                                                    obj3 = it12.next();
                                                    String domain6 = ((MiniCourse) obj3).getDomain();
                                                    String str9 = this.f10446w;
                                                    if (str9 == null) {
                                                        i.q("miniCourseDomain");
                                                        throw null;
                                                    } else if (i.b(domain6, str9)) {
                                                        break;
                                                    }
                                                }
                                                MiniCourse miniCourse9 = (MiniCourse) obj3;
                                                if (miniCourse9 != null && (plan2 = miniCourse9.getPlan()) != null) {
                                                    Iterator<CourseDayModelV1> it13 = plan2.iterator();
                                                    int i18 = 0;
                                                    while (true) {
                                                        if (!it13.hasNext()) {
                                                            i18 = -1;
                                                            break;
                                                        }
                                                        String content_id5 = it13.next().getContent_id();
                                                        CourseDayModelV1 courseDayModelV112 = this.A;
                                                        i.d(courseDayModelV112);
                                                        if (i.b(content_id5, courseDayModelV112.getContent_id())) {
                                                            break;
                                                        }
                                                        i18++;
                                                    }
                                                    if (i18 == 0) {
                                                        z11 = true;
                                                        if (z11) {
                                                            z10 = false;
                                                            E0(z10);
                                                        }
                                                    }
                                                }
                                                z11 = false;
                                                if (z11) {
                                                }
                                            }
                                            z10 = true;
                                            E0(z10);
                                        } else {
                                            i.q("miniCourse");
                                            throw null;
                                        }
                                    }
                                }
                                gk.a.b(bundle2, "mini_activity_finish");
                            } else {
                                intent2 = intent;
                                gk.a.b(bundle2, "mini_activity_incomplete");
                            }
                            if (i11 == this.L && i12 == -1 && intent2 != null && intent2.getBooleanExtra("purchase_successful", false)) {
                                this.B = false;
                                A0();
                                ((RobertoButton) v0(com.theinnerhour.b2b.R.id.miniCourseWelcomeButton)).setText(getString(com.theinnerhour.b2b.R.string.lets_get_started_single));
                            }
                            x0();
                            return;
                        }
                        i.q("miniCourse");
                        throw null;
                    }
                    i12 = i10;
                    intent2 = intent;
                    if (i11 == this.L) {
                        this.B = false;
                        A0();
                        ((RobertoButton) v0(com.theinnerhour.b2b.R.id.miniCourseWelcomeButton)).setText(getString(com.theinnerhour.b2b.R.string.lets_get_started_single));
                    }
                    x0();
                    return;
                }
                i11 = i6;
                i12 = i10;
                intent2 = intent;
                if (i11 == this.L) {
                }
                x0();
                return;
            }
            i.q("miniCourseDomain");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.I, e10);
        }
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (BottomSheetBehavior.from((ConstraintLayout) v0(com.theinnerhour.b2b.R.id.clNPSBottomSheet)).getState() == 3) {
            BottomSheetBehavior.from((ConstraintLayout) v0(com.theinnerhour.b2b.R.id.clNPSBottomSheet)).setState(4);
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        boolean z11;
        HashMap<String, Object> appConfig;
        String str;
        super.onCreate(bundle);
        setContentView(com.theinnerhour.b2b.R.layout.activity_basic_courses);
        r0.a(getWindow(), false);
        InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
        AppCompatImageView header_arrow_back = (AppCompatImageView) v0(com.theinnerhour.b2b.R.id.header_arrow_back);
        i.f(header_arrow_back, "header_arrow_back");
        insetsUtils.addStatusBarHeight(header_arrow_back);
        insetsUtils.setStatusBarColor(com.theinnerhour.b2b.R.color.transparent, this, true, true);
        ((AppCompatImageView) v0(com.theinnerhour.b2b.R.id.header_arrow_back)).setOnClickListener(new h(this, 0));
        ((AppCompatImageView) v0(com.theinnerhour.b2b.R.id.miniCourseMoreOptions)).setVisibility(0);
        this.f10449z = new ProgressDialog(this);
        this.F = getIntent().getBooleanExtra("newTut", false);
        this.M = getIntent().getStringExtra(Constants.CAMPAIGN_ID);
        if (getIntent().hasExtra("mccourse")) {
            String stringExtra = getIntent().getStringExtra("mccourse");
            i.d(stringExtra);
            this.f10446w = stringExtra;
            if (r.J0(stringExtra, "basic")) {
                str = "basic";
            } else {
                str = "mini";
            }
            this.C = str;
        } else {
            n0();
        }
        MiniCoursesViewModel miniCoursesViewModel = (MiniCoursesViewModel) new o0(this).a(MiniCoursesViewModel.class);
        this.f10448y = miniCoursesViewModel;
        if (miniCoursesViewModel != null) {
            miniCoursesViewModel.f11379z.e(this, new dk.a(3, new a()));
            MiniCoursesViewModel miniCoursesViewModel2 = this.f10448y;
            if (miniCoursesViewModel2 != null) {
                String str2 = this.f10446w;
                if (str2 != null) {
                    miniCoursesViewModel2.g(str2);
                    if (i.b(this.C, "basic")) {
                        try {
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null && (appConfig = user.getAppConfig()) != null && appConfig.containsKey("offer")) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                Object obj = FirebasePersistence.getInstance().getUser().getAppConfig().get("offer");
                                i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<java.util.HashMap<kotlin.String, kotlin.Any>>{ kotlin.collections.TypeAliasesKt.ArrayList<java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }> }");
                                Iterator it = ((ArrayList) obj).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    HashMap hashMap = (HashMap) it.next();
                                    Object obj2 = hashMap.get("slug");
                                    i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                                    String str3 = (String) obj2;
                                    Object obj3 = hashMap.get("time");
                                    i.e(obj3, "null cannot be cast to non-null type kotlin.Long");
                                    if (((Long) obj3).longValue() != 0) {
                                        Object obj4 = hashMap.get("used");
                                        i.e(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                                        if (((Boolean) obj4).booleanValue()) {
                                            continue;
                                        } else {
                                            Object obj5 = hashMap.get("time");
                                            i.e(obj5, "null cannot be cast to non-null type kotlin.Long");
                                            long timeInMillis = (Calendar.getInstance().getTimeInMillis() / 1000) - ((Long) obj5).longValue();
                                            if (1 <= timeInMillis && timeInMillis < 86401) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11) {
                                                if (r.J0(str3, Constants.SUBSCRIPTION_GOLD_3)) {
                                                    ((RobertoTextView) v0(com.theinnerhour.b2b.R.id.proPurchaseText)).setText(getString(com.theinnerhour.b2b.R.string.getMoreWithProText));
                                                } else if (r.J0(str3, Constants.SUBSCRIPTION_BASIC_5)) {
                                                    ((RobertoTextView) v0(com.theinnerhour.b2b.R.id.proPurchaseText)).setText(getString(com.theinnerhour.b2b.R.string.mc_generic_upgrade));
                                                } else {
                                                    ((RobertoTextView) v0(com.theinnerhour.b2b.R.id.proPurchaseText)).setText(getString(com.theinnerhour.b2b.R.string.mc_generic_upgrade));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this.I, e10);
                        }
                    }
                    ((AppCompatImageView) v0(com.theinnerhour.b2b.R.id.miniCourseMoreOptions)).setOnClickListener(new h(this, 1));
                    return;
                }
                i.q("miniCourseDomain");
                throw null;
            }
            i.q("miniCourseViewModel");
            throw null;
        }
        i.q("miniCourseViewModel");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (com.theinnerhour.b2b.persistence.SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() == false) goto L27;
     */
    @Override // androidx.fragment.app.p, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResume() {
        String str;
        super.onResume();
        try {
            User user = FirebasePersistence.getInstance().getUser();
            boolean z10 = false;
            if (i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) {
                if (i.b(this.C, "basic")) {
                    String str2 = null;
                    if (user != null) {
                        str = user.getVersion();
                    } else {
                        str = null;
                    }
                    if (!i.b(str, "v2.3")) {
                        if (user != null) {
                            str2 = user.getVersion();
                        }
                        if (!i.b(str2, Constants.USER_VERSION) && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                            z10 = true;
                        }
                    }
                }
            }
            this.B = z10;
            A0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.I, e10);
        }
    }

    public final View v0(int i6) {
        LinkedHashMap linkedHashMap = this.N;
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

    /* JADX WARN: Removed duplicated region for block: B:119:0x005c A[EDGE_INSN: B:119:0x005c->B:25:0x005c ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x0() {
        ArrayList<MiniCourse> miniCourses;
        Object obj;
        String str;
        String str2;
        String str3;
        boolean z10;
        boolean z11;
        ConstraintLayout constraintLayout = (ConstraintLayout) v0(com.theinnerhour.b2b.R.id.clNPSBottomSheet);
        if (constraintLayout != null) {
            constraintLayout.setOnTouchListener(new h0(1));
        }
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && (miniCourses = user.getMiniCourses()) != null) {
            Iterator<T> it = miniCourses.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    MiniCourse miniCourse = (MiniCourse) obj;
                    if (miniCourse.getDomain() != null) {
                        String domain = miniCourse.getDomain();
                        MiniCourse miniCourse2 = this.f10447x;
                        if (miniCourse2 != null) {
                            if (i.b(domain, miniCourse2.getDomain())) {
                                z11 = true;
                                continue;
                                if (z11) {
                                    break;
                                }
                            }
                        } else {
                            i.q("miniCourse");
                            throw null;
                        }
                    }
                    z11 = false;
                    continue;
                    if (z11) {
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            MiniCourse miniCourse3 = (MiniCourse) obj;
            if (miniCourse3 != null) {
                CourseDayModelV1 courseDayModelV1 = this.A;
                if (courseDayModelV1 != null) {
                    str = courseDayModelV1.getContent_id();
                } else {
                    str = null;
                }
                if (str != null) {
                    CourseDayModelV1 courseDayModelV12 = (CourseDayModelV1) u.p2(miniCourse3.getPlan());
                    if (courseDayModelV12 != null) {
                        str2 = courseDayModelV12.getContent_id();
                    } else {
                        str2 = null;
                    }
                    CourseDayModelV1 courseDayModelV13 = this.A;
                    if (courseDayModelV13 != null) {
                        str3 = courseDayModelV13.getContent_id();
                    } else {
                        str3 = null;
                    }
                    if (i.b(str2, str3)) {
                        String domain2 = miniCourse3.getDomain();
                        if (domain2 != null && r.J0(domain2, "basic")) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            NpsPersistence npsPersistence = NpsPersistence.INSTANCE;
                            String str4 = this.f10446w;
                            if (str4 != null) {
                                CourseDayModelV1 courseDayModelV14 = this.A;
                                i.d(courseDayModelV14);
                                if (!npsPersistence.isNpsForMiniCoursePlanDayComplete(str4, courseDayModelV14.getPosition())) {
                                    String str5 = this.f10446w;
                                    if (str5 != null) {
                                        npsPersistence.updateMiniCoursePlanDayNps(str5, miniCourse3.getPosition(), true);
                                        if (npsPersistence.isNpsSlotAvailable()) {
                                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) v0(com.theinnerhour.b2b.R.id.clNPSContainer);
                                            if (coordinatorLayout != null) {
                                                coordinatorLayout.setVisibility(0);
                                            }
                                            BottomSheetBehavior.from((ConstraintLayout) v0(com.theinnerhour.b2b.R.id.clNPSBottomSheet)).addBottomSheetCallback(new o(this));
                                            v vVar = new v();
                                            vVar.f23467u = -1;
                                            AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) v0(com.theinnerhour.b2b.R.id.sbNPSSelector);
                                            if (appCompatSeekBar != null) {
                                                appCompatSeekBar.setThumbTintList(ColorStateList.valueOf(g0.a.b(this, com.theinnerhour.b2b.R.color.transparent)));
                                            }
                                            AppCompatImageView appCompatImageView = (AppCompatImageView) v0(com.theinnerhour.b2b.R.id.ivNPSRatingImage);
                                            if (appCompatImageView != null) {
                                                appCompatImageView.setImageTintList(ColorStateList.valueOf(g0.a.b(this, com.theinnerhour.b2b.R.color.login_grey_background)));
                                            }
                                            AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar) v0(com.theinnerhour.b2b.R.id.sbNPSSelector);
                                            if (appCompatSeekBar2 != null) {
                                                appCompatSeekBar2.setOnSeekBarChangeListener(new dk.p(this, vVar));
                                            }
                                            RobertoButton robertoButton = (RobertoButton) v0(com.theinnerhour.b2b.R.id.rbNPSSubmit1);
                                            if (robertoButton != null) {
                                                robertoButton.setOnClickListener(new defpackage.a(vVar, 7, this));
                                            }
                                            ((AppCompatImageView) v0(com.theinnerhour.b2b.R.id.ivNPSBottomSheetClose)).setOnClickListener(DebouncedOnClickListener.wrap(new h(this, 5)));
                                            View v02 = v0(com.theinnerhour.b2b.R.id.viewMiniCourseActivityBlanketForeground);
                                            if (v02 != null) {
                                                v02.setVisibility(0);
                                            }
                                            BottomSheetBehavior.from((ConstraintLayout) v0(com.theinnerhour.b2b.R.id.clNPSBottomSheet)).setState(3);
                                            RobertoTextView robertoTextView = (RobertoTextView) v0(com.theinnerhour.b2b.R.id.tvNPSSeekLevel0);
                                            if (robertoTextView != null) {
                                                robertoTextView.setOnClickListener(new h(this, 6));
                                            }
                                            RobertoTextView robertoTextView2 = (RobertoTextView) v0(com.theinnerhour.b2b.R.id.tvNPSSeekLevel1);
                                            if (robertoTextView2 != null) {
                                                robertoTextView2.setOnClickListener(new h(this, 7));
                                            }
                                            RobertoTextView robertoTextView3 = (RobertoTextView) v0(com.theinnerhour.b2b.R.id.tvNPSSeekLevel2);
                                            if (robertoTextView3 != null) {
                                                robertoTextView3.setOnClickListener(new h(this, 8));
                                            }
                                            RobertoTextView robertoTextView4 = (RobertoTextView) v0(com.theinnerhour.b2b.R.id.tvNPSSeekLevel3);
                                            if (robertoTextView4 != null) {
                                                robertoTextView4.setOnClickListener(new h(this, 9));
                                            }
                                            RobertoTextView robertoTextView5 = (RobertoTextView) v0(com.theinnerhour.b2b.R.id.tvNPSSeekLevel4);
                                            if (robertoTextView5 != null) {
                                                robertoTextView5.setOnClickListener(new h(this, 10));
                                            }
                                            RobertoTextView robertoTextView6 = (RobertoTextView) v0(com.theinnerhour.b2b.R.id.tvNPSSeekLevel5);
                                            if (robertoTextView6 != null) {
                                                robertoTextView6.setOnClickListener(new h(this, 11));
                                            }
                                            RobertoTextView robertoTextView7 = (RobertoTextView) v0(com.theinnerhour.b2b.R.id.tvNPSSeekLevel6);
                                            if (robertoTextView7 != null) {
                                                robertoTextView7.setOnClickListener(new h(this, 12));
                                            }
                                            RobertoTextView robertoTextView8 = (RobertoTextView) v0(com.theinnerhour.b2b.R.id.tvNPSSeekLevel7);
                                            if (robertoTextView8 != null) {
                                                robertoTextView8.setOnClickListener(new h(this, 13));
                                            }
                                            RobertoTextView robertoTextView9 = (RobertoTextView) v0(com.theinnerhour.b2b.R.id.tvNPSSeekLevel8);
                                            if (robertoTextView9 != null) {
                                                robertoTextView9.setOnClickListener(new h(this, 2));
                                            }
                                            RobertoTextView robertoTextView10 = (RobertoTextView) v0(com.theinnerhour.b2b.R.id.tvNPSSeekLevel9);
                                            if (robertoTextView10 != null) {
                                                robertoTextView10.setOnClickListener(new h(this, 3));
                                            }
                                            RobertoTextView robertoTextView11 = (RobertoTextView) v0(com.theinnerhour.b2b.R.id.tvNPSSeekLevel10);
                                            if (robertoTextView11 != null) {
                                                robertoTextView11.setOnClickListener(new h(this, 4));
                                            }
                                            String str6 = gk.a.f16573a;
                                            Bundle bundle = new Bundle();
                                            e.s(bundle, "course", "type", "foundation_course");
                                            hs.k kVar = hs.k.f19476a;
                                            gk.a.b(bundle, "self_care_nps_display");
                                            NpsPersistence.updateNpsSlot$default(npsPersistence, false, 1, null);
                                            return;
                                        }
                                        return;
                                    }
                                    i.q("miniCourseDomain");
                                    throw null;
                                }
                                return;
                            }
                            i.q("miniCourseDomain");
                            throw null;
                        }
                    }
                }
            }
        }
    }

    public final void y0(CourseDayModelV1 courseDayModelV1) {
        int i6;
        try {
            int i10 = this.G;
            int i11 = this.L;
            if (i10 > 0 && courseDayModelV1.getStart_date() != 0) {
                if (this.G < 4) {
                    i6 = 2;
                } else {
                    i6 = 6;
                }
                if (i6 != 0) {
                    ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                    if (applicationPersistence.getBooleanValue("check_mini_" + i6, true)) {
                        if (i6 == 2) {
                            ApplicationPersistence.getInstance().setBooleanValue("app_feedback_day_three", true);
                        }
                        ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
                        applicationPersistence2.setStringValue(Constants.APP_FEEDBACK_TRIGGER, "mini_course_day_" + i6);
                        F0("check_mini_" + i6);
                        return;
                    }
                }
                if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && this.E && !this.D) {
                    if (i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) {
                        startActivityForResult(tr.r.s(this, true).putExtra("source", "basic_course_end").putExtra(Constants.CAMPAIGN_ID, this.M), i11);
                    }
                }
            } else if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && this.E && !this.D) {
                if (i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) {
                    startActivityForResult(tr.r.s(this, true).putExtra("source", "basic_course_end").putExtra(Constants.CAMPAIGN_ID, this.M), i11);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.I, "exception in check show app feed back", e10);
        }
    }

    public final long z0() {
        if (ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_DATE) == 0) {
            ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DATE, Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
        }
        return TimeUnit.DAYS.convert(Utils.INSTANCE.getTodayCalendar().getTimeInMillis() - ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_DATE), TimeUnit.MILLISECONDS);
    }
}
