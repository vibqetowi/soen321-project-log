package ik;

import android.app.Dialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.storage.FirebaseStorage;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.components.bookmarking.activities.BookmarkingActivity;
import com.theinnerhour.b2b.components.chat.model.ChatMessage;
import com.theinnerhour.b2b.components.chat.model.ChatUser;
import com.theinnerhour.b2b.components.community.activity.CommunitiesPwaActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CommunityOnBoardingWelcomeActivity;
import com.theinnerhour.b2b.components.dashboard.utils.V3DashboardUtils;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.data.N12AItemListModel;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N18AScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N24ScreenFragment;
import com.theinnerhour.b2b.components.libraryExperiment.model.UserLibraryItemAccessModel;
import com.theinnerhour.b2b.components.monetization.activitiy.MonetizationActivity;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.AssessmentResponseAll;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayDomainModelV1;
import com.theinnerhour.b2b.model.CourseDayModel;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ol.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j1 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f20210u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f20211v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f20212w;

    public /* synthetic */ j1(Course course, Fragment fragment, int i6) {
        this.f20210u = i6;
        this.f20211v = course;
        this.f20212w = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6;
        Object obj;
        String str;
        WebView webView;
        AppCompatImageView appCompatImageView;
        View view2;
        RobertoButton robertoButton;
        RobertoTextView robertoTextView;
        ProgressBar progressBar;
        String str2;
        String str3;
        Object obj2;
        String str4;
        String str5;
        boolean z10;
        Object obj3;
        String str6;
        String str7;
        boolean z11;
        String str8;
        Object obj4;
        String str9;
        Object obj5;
        String str10;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13 = this.f20210u;
        Object obj6 = this.f20211v;
        Object obj7 = this.f20212w;
        switch (i13) {
            case 0:
                k1 this$0 = (k1) obj7;
                Course course = (Course) obj6;
                int i14 = k1.I;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                InitialAssessmentActivity initialAssessmentActivity = this$0.D;
                if (initialAssessmentActivity != null) {
                    initialAssessmentActivity.t0();
                    if (ca.a.k("v1", "v2").contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                        InitialAssessmentActivity initialAssessmentActivity2 = this$0.D;
                        if (initialAssessmentActivity2 != null) {
                            if (initialAssessmentActivity2.getIntent().getIntExtra("daymodel_position", -1) != 28) {
                                i6 = 1;
                            }
                            i6 = 28;
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    } else {
                        InitialAssessmentActivity initialAssessmentActivity3 = this$0.D;
                        if (initialAssessmentActivity3 != null) {
                            if (initialAssessmentActivity3.getIntent().getIntExtra("daymodel_position", -1) != 28) {
                                i6 = 0;
                            }
                            i6 = 28;
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    if (defpackage.d.q(Constants.USER_VERSION)) {
                        InitialAssessmentActivity initialAssessmentActivity4 = this$0.D;
                        if (initialAssessmentActivity4 != null) {
                            i6 = initialAssessmentActivity4.L;
                            if (i6 != 0) {
                                if (i6 == 30) {
                                    course.setFinalAssessmentScore(this$0.f20223y);
                                }
                            } else {
                                course.setInitialAssessmentScore(this$0.f20223y);
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    } else {
                        InitialAssessmentActivity initialAssessmentActivity5 = this$0.D;
                        if (initialAssessmentActivity5 != null) {
                            if (initialAssessmentActivity5.getIntent().getIntExtra("daymodel_position", -1) == 28) {
                                course.setFinalAssessmentScore(this$0.f20223y);
                                CourseDayModel courseDayModel = (CourseDayModel) is.u.j2(28, course.getPlan());
                                if (courseDayModel != null) {
                                    courseDayModel.setCompleted(true);
                                }
                            } else {
                                course.setInitialAssessmentScore(this$0.f20223y);
                                course.getPlan().get(0).setCompleted(true);
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    int i15 = i6;
                    ArrayList<AssessmentResponseAll> assessments = course.getAssessments();
                    InitialAssessmentActivity initialAssessmentActivity6 = this$0.D;
                    if (initialAssessmentActivity6 != null) {
                        assessments.add(new AssessmentResponseAll(initialAssessmentActivity6.C, initialAssessmentActivity6.D, initialAssessmentActivity6.E, this$0.f20223y, i15));
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        Bundle bundle = new Bundle();
                        bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                        InitialAssessmentActivity initialAssessmentActivity7 = this$0.D;
                        if (initialAssessmentActivity7 != null) {
                            int i16 = initialAssessmentActivity7.L;
                            if (i16 != 0) {
                                if (i16 != 15) {
                                    if (i16 != 30) {
                                        bundle.putInt("day", -1);
                                    } else {
                                        bundle.putInt("day", 28);
                                    }
                                } else {
                                    bundle.putInt("day", 15);
                                }
                            } else {
                                bundle.putInt("day", 0);
                            }
                            defpackage.d.m(bundle, "course");
                            bundle.putInt("score", this$0.f20223y);
                            bundle.putString("variant", (String) FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.ONBOARDING_EXPERIMENT));
                            gk.a.b(bundle, "assessment_score_click");
                            new Handler().postDelayed(new i5.b(18), 500L);
                            return;
                        }
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            case 1:
                m1 this$02 = (m1) obj7;
                int i17 = m1.J;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                if (((Course) obj6).getAssessments().size() > 0) {
                    InitialAssessmentActivity initialAssessmentActivity8 = this$02.F;
                    if (initialAssessmentActivity8 != null) {
                        initialAssessmentActivity8.t0();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                InitialAssessmentActivity initialAssessmentActivity9 = this$02.F;
                if (initialAssessmentActivity9 != null) {
                    initialAssessmentActivity9.n0();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            case 2:
                BookmarkingActivity this$03 = (BookmarkingActivity) obj7;
                CourseDayDomainModelV1 modelToBeUnsaved = (CourseDayDomainModelV1) obj6;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.g(modelToBeUnsaved, "$modelToBeUnsaved");
                int i18 = BookmarkingActivity.I;
                try {
                    if (modelToBeUnsaved.getDayModelV1().getContent_id() != null) {
                        Iterator<T> it = CourseUtilKt.getCourse(modelToBeUnsaved.getCourseName()).getPlanV3().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (kotlin.jvm.internal.i.b(((CourseDayModelV1) obj).getContent_id(), modelToBeUnsaved.getDayModelV1().getContent_id())) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        CourseDayModelV1 courseDayModelV1 = (CourseDayModelV1) obj;
                        if (courseDayModelV1 != null) {
                            courseDayModelV1.setFavorite(false);
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                            this$03.r0();
                        }
                    }
                    Animation loadAnimation = AnimationUtils.loadAnimation(this$03, R.anim.slide_fade_out_left);
                    loadAnimation.setAnimationListener(new mk.h(this$03));
                    ConstraintLayout constraintLayout = (ConstraintLayout) this$03.n0(R.id.clBookmarkBottomSheetContainer1);
                    if (constraintLayout != null) {
                        constraintLayout.startAnimation(loadAnimation);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$03.f10620w, e10);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle2.putString("activity_name", modelToBeUnsaved.getDayModelV1().getContent_label());
                bundle2.putString("activity_course", this$03.o0().getCourseName());
                if (modelToBeUnsaved.getDayModelV1().getLast_accessed_date() != 0) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(modelToBeUnsaved.getDayModelV1().getLast_accessed_date() * 1000);
                    bundle2.putString("last_accessed_on", new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).format(calendar.getTime()).toString());
                }
                gk.a.b(bundle2, "bookmark_activity_unsave_confirm");
                return;
            case 3:
                qk.e eVar = (qk.e) obj7;
                ChatMessage chatMessage = (ChatMessage) obj6;
                try {
                    int i19 = Build.VERSION.SDK_INT;
                    Context context = eVar.f29651z;
                    if (i19 < 29 && g0.a.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        eVar.A.C();
                        return;
                    }
                    Toast.makeText(context, context.getString(R.string.downloadMessage), 1).show();
                    String message = chatMessage.getMessage();
                    if (message.contains("firebasestorage")) {
                        str = FirebaseStorage.getInstance().getReferenceFromUrl(chatMessage.getMessage()).getName();
                    } else {
                        String[] split = message.split("/");
                        str = split[split.length - 1];
                    }
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(message));
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str);
                    request.setNotificationVisibility(1);
                    ((DownloadManager) context.getSystemService("download")).enqueue(request);
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(e11);
                    return;
                }
            case 4:
                CommunitiesPwaActivity this$04 = (CommunitiesPwaActivity) obj7;
                String url = (String) obj6;
                int i20 = CommunitiesPwaActivity.C;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.g(url, "$url");
                if (Utils.INSTANCE.checkConnectivity(this$04)) {
                    yp.a aVar = this$04.f10634w;
                    if (aVar != null && (progressBar = aVar.f38708e) != null) {
                        Extensions.INSTANCE.visible(progressBar);
                    }
                    yp.a aVar2 = this$04.f10634w;
                    if (aVar2 != null && (robertoTextView = aVar2.f) != null) {
                        Extensions.INSTANCE.gone(robertoTextView);
                    }
                    yp.a aVar3 = this$04.f10634w;
                    if (aVar3 != null && (robertoButton = aVar3.f38706c) != null) {
                        Extensions.INSTANCE.gone(robertoButton);
                    }
                    yp.a aVar4 = this$04.f10634w;
                    if (aVar4 != null && (view2 = aVar4.f38705b) != null) {
                        Extensions.INSTANCE.gone(view2);
                    }
                    yp.a aVar5 = this$04.f10634w;
                    if (aVar5 != null && (appCompatImageView = aVar5.f38707d) != null) {
                        Extensions.INSTANCE.gone(appCompatImageView);
                    }
                    try {
                        yp.a aVar6 = this$04.f10634w;
                        if (aVar6 != null && (webView = aVar6.f38709g) != null) {
                            webView.loadUrl(url);
                            return;
                        }
                        return;
                    } catch (Exception e12) {
                        LogHelper.INSTANCE.e(this$04.f10633v, e12);
                        return;
                    }
                }
                return;
            case 5:
                tk.c this$05 = (tk.c) obj7;
                kotlin.jvm.internal.u isAnonymousSelected = (kotlin.jvm.internal.u) obj6;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                kotlin.jvm.internal.i.g(isAnonymousSelected, "$isAnonymousSelected");
                String str11 = gk.a.f16573a;
                Bundle f = defpackage.e.f("variant", "variant_d", "experiment", "comm_acquisition");
                User f2 = defpackage.b.f(f, "platform", "android_app");
                if (f2 != null) {
                    str2 = f2.getCurrentCourseName();
                } else {
                    str2 = null;
                }
                User f10 = defpackage.b.f(f, "domain", str2);
                if (f10 != null) {
                    str3 = f10.getCurrentCourseName();
                } else {
                    str3 = null;
                }
                f.putString("course", str3);
                f.putBoolean("group_joined", !this$05.D.isEmpty());
                f.putString("channel_name", this$05.f33176z);
                f.putBoolean("post_anonymous", isAnonymousSelected.f23466u);
                Boolean bool = this$05.C;
                if (bool != null) {
                    f.putBoolean("onboarding_completed", bool.booleanValue());
                }
                hs.k kVar = hs.k.f19476a;
                gk.a.b(f, "communities_db_card_click");
                String b10 = r1.b0.b(new StringBuilder("https://community.amahahealth.com/onboarding/"), this$05.A, "/posts");
                xk.a aVar7 = this$05.H;
                if (aVar7 != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putBoolean("isAnonymous", isAnonymousSelected.f23466u);
                    aVar7.E(bundle3, b10);
                    return;
                }
                return;
            case 6:
                tk.c this$06 = (tk.c) obj7;
                List communitiesGroupData = (List) obj6;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(communitiesGroupData, "$communitiesGroupData");
                if (Utils.INSTANCE.checkConnectivity(this$06.requireActivity())) {
                    if (communitiesGroupData.isEmpty()) {
                        xk.a aVar8 = this$06.H;
                        if (aVar8 != null) {
                            aVar8.W();
                        }
                    } else {
                        xk.a aVar9 = this$06.H;
                        if (aVar9 != null) {
                            aVar9.E(null, null);
                        }
                    }
                    Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                    analyticsBundle.putBoolean("group_joined", !communitiesGroupData.isEmpty());
                    UtilsKt.fireAnalytics("communities_db_card_click", analyticsBundle);
                    return;
                }
                return;
            case 7:
                zk.j this$07 = (zk.j) obj7;
                androidx.fragment.app.p activity = (androidx.fragment.app.p) obj6;
                int i21 = zk.j.D;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                kotlin.jvm.internal.i.g(activity, "$activity");
                if (this$07.A) {
                    if (Utils.INSTANCE.checkConnectivity(this$07.requireActivity())) {
                        ProgressBar progressBar2 = (ProgressBar) this$07._$_findCachedViewById(R.id.csaFinishPromptPrimaryCtaProgress);
                        if (progressBar2 != null) {
                            progressBar2.setVisibility(0);
                        }
                        RobertoButton robertoButton2 = (RobertoButton) this$07._$_findCachedViewById(R.id.csaFinishPromptPrimaryCta);
                        if (robertoButton2 != null) {
                            robertoButton2.setText("");
                        }
                        this$07.J(0, this$07.f39450x);
                    }
                    if (!is.k.Q1(this$07.f39450x, new String[]{Constants.COURSE_ADHD, Constants.COURSE_OCD, Constants.COURSE_GENERIC})) {
                        String str12 = gk.a.f16573a;
                        Bundle bundle4 = new Bundle();
                        bundle4.putString("variant", (String) ri.e.d(Constants.ONBOARDING_EXPERIMENT));
                        bundle4.putString("course", this$07.f39450x);
                        Intent intent = activity.getIntent();
                        if (intent != null) {
                            z10 = intent.getBooleanExtra("reset_flag", false);
                        } else {
                            z10 = false;
                        }
                        bundle4.putBoolean("reset_flow", z10);
                        HashMap<String, Object> appConfig = FirebasePersistence.getInstance().getUser().getAppConfig();
                        if (appConfig != null) {
                            obj3 = appConfig.get(Constants.NEW_COURSES_EXPERIMENT);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str6 = (String) obj3;
                        } else {
                            str6 = null;
                        }
                        bundle4.putString(Constants.NEW_COURSES_EXPERIMENT, str6);
                        hs.k kVar2 = hs.k.f19476a;
                        gk.a.b(bundle4, "onboarding_selection_assessment");
                        return;
                    }
                    String str13 = gk.a.f16573a;
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("course", this$07.f39450x);
                    HashMap<String, Object> appConfig2 = FirebasePersistence.getInstance().getUser().getAppConfig();
                    if (appConfig2 != null) {
                        obj2 = appConfig2.get(Constants.NEW_COURSES_EXPERIMENT);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof String) {
                        str4 = (String) obj2;
                    } else {
                        str4 = null;
                    }
                    bundle5.putString(Constants.NEW_COURSES_EXPERIMENT, str4);
                    Bundle arguments = this$07.getArguments();
                    if (arguments != null) {
                        str5 = arguments.getString("source");
                    } else {
                        str5 = null;
                    }
                    bundle5.putString("source", str5);
                    hs.k kVar3 = hs.k.f19476a;
                    gk.a.b(bundle5, "go_to_dashboard");
                    return;
                }
                return;
            case 8:
                Intent intent2 = (Intent) obj7;
                V2DashboardActivity this$08 = (V2DashboardActivity) obj6;
                int i22 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                if (intent2 != null) {
                    this$08.startActivityForResult(intent2, this$08.K);
                    return;
                }
                return;
            case 9:
                V2DashboardActivity this$09 = (V2DashboardActivity) obj7;
                String selectedScreen = (String) obj6;
                int i23 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                kotlin.jvm.internal.i.g(selectedScreen, "$selectedScreen");
                ((ConstraintLayout) this$09.n0(R.id.clSubscriptionMessaging)).setVisibility(8);
                ApplicationPersistence.getInstance().setBooleanValue(selectedScreen, true);
                return;
            case 10:
                V2DashboardActivity this$010 = (V2DashboardActivity) obj7;
                kotlin.jvm.internal.x message2 = (kotlin.jvm.internal.x) obj6;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                kotlin.jvm.internal.i.g(message2, "$message");
                Intent putExtra = new Intent(this$010, MonetizationActivity.class).putExtra("source", "dashboard_shortcut");
                kotlin.jvm.internal.i.f(putExtra, "Intent(this@V2DashboardA…e\", \"dashboard_shortcut\")");
                if (((ChatMessage) message2.f23469u).getSend_by_user_id() != null) {
                    ChatUser chatUser = new ChatUser();
                    chatUser.setKey(((ChatMessage) message2.f23469u).getSend_by_user_id());
                    chatUser.setFirstName(((ChatMessage) message2.f23469u).getUser_name());
                    putExtra.putExtra("user", chatUser);
                }
                this$010.startActivity(putExtra);
                String str14 = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "pro_dashboard_card_click");
                return;
            case 11:
                V3DashboardActivity this$011 = (V3DashboardActivity) obj7;
                String str15 = (String) obj6;
                int i24 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                this$011.startActivity(new Intent(this$011, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.THERAPIST_MATCHING_FLOW));
                String str16 = gk.a.f16573a;
                Bundle bundle6 = new Bundle();
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str7 = user.getCurrentCourseName();
                } else {
                    str7 = null;
                }
                bundle6.putString("domain", str7);
                bundle6.putString("variant_reason", str15);
                hs.k kVar4 = hs.k.f19476a;
                gk.a.b(bundle6, "in_app_matching_banner_click");
                return;
            case 12:
                V3DashboardActivity this$012 = (V3DashboardActivity) obj7;
                Bundle analyticsBundle2 = (Bundle) obj6;
                int i25 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                kotlin.jvm.internal.i.g(analyticsBundle2, "$analyticsBundle");
                this$012.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + SubscriptionPersistence.INSTANCE.getSubscriptionType() + "&package=" + this$012.getPackageName())));
                gk.a.b(analyticsBundle2, "hold_message_snackbar_update_click");
                return;
            case 13:
                V3DashboardActivity this$013 = (V3DashboardActivity) obj7;
                Integer num = (Integer) obj6;
                int i26 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                Extensions extensions = Extensions.INSTANCE;
                Extensions.toast$default(extensions, this$013, this$013.getString(R.string.planExperimentAvailableLater) + '!', 0, 2, null);
                if (num != null) {
                    this$013.h1(num);
                    return;
                } else {
                    this$013.h1(null);
                    return;
                }
            case 14:
                V3DashboardActivity this$014 = (V3DashboardActivity) obj7;
                kotlin.jvm.internal.x message3 = (kotlin.jvm.internal.x) obj6;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                kotlin.jvm.internal.i.g(message3, "$message");
                Intent putExtra2 = tr.r.s(this$014, false).putExtra("source", "dashboard_shortcut");
                kotlin.jvm.internal.i.f(putExtra2, "SellingScreenSelectionUt…e\", \"dashboard_shortcut\")");
                if (((ChatMessage) message3.f23469u).getSend_by_user_id() != null) {
                    ChatUser chatUser2 = new ChatUser();
                    chatUser2.setKey(((ChatMessage) message3.f23469u).getSend_by_user_id());
                    chatUser2.setFirstName(((ChatMessage) message3.f23469u).getUser_name());
                    putExtra2.putExtra("user", chatUser2);
                }
                this$014.startActivity(putExtra2);
                String str17 = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "pro_dashboard_card_click");
                return;
            case 15:
                el.d this$015 = (el.d) obj7;
                CourseDayModelV1 it2 = (CourseDayModelV1) obj6;
                kotlin.jvm.internal.i.g(this$015, "this$0");
                kotlin.jvm.internal.i.g(it2, "$it");
                if (this$015.f14381y && it2.getPosition() == this$015.f14380x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this$015.D.invoke(it2, Boolean.valueOf(z11));
                return;
            case 16:
                ViewGroup collection = (ViewGroup) obj7;
                CommunityOnBoardingWelcomeActivity this$016 = (CommunityOnBoardingWelcomeActivity) obj6;
                kotlin.jvm.internal.i.g(collection, "$collection");
                kotlin.jvm.internal.i.g(this$016, "this$0");
                if (Utils.INSTANCE.checkConnectivity(collection.getContext())) {
                    this$016.f10803x.a(new Intent(collection.getContext(), CommunitiesPwaActivity.class));
                    return;
                }
                return;
            case 17:
                hl.g this$017 = (hl.g) obj7;
                Dialog subscriptionExpireDialog = (Dialog) obj6;
                int i27 = hl.g.K;
                kotlin.jvm.internal.i.g(this$017, "this$0");
                kotlin.jvm.internal.i.g(subscriptionExpireDialog, "$subscriptionExpireDialog");
                androidx.fragment.app.p requireActivity = this$017.requireActivity();
                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                this$017.startActivity(tr.r.s(requireActivity, false).putExtra("source", Constants.SCREEN_DASHBOARD));
                subscriptionExpireDialog.dismiss();
                gk.a.b(null, "pr_app_sub_repurchase_popup_cta_click");
                return;
            case 18:
                Course course2 = (Course) obj6;
                hl.g this$018 = (hl.g) obj7;
                int i28 = hl.g.K;
                kotlin.jvm.internal.i.g(this$018, "this$0");
                if (course2.getCourseName() != null) {
                    FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                    User user2 = firebasePersistence.getUser();
                    if (user2 != null) {
                        user2.setCurrentCourseName(course2.getCourseName());
                    }
                    User user3 = firebasePersistence.getUser();
                    if (user3 != null) {
                        String courseName = course2.getCourseName();
                        kotlin.jvm.internal.i.d(courseName);
                        user3.setCurrentCourse(UtilsKt.getCourseId(courseName));
                    }
                    firebasePersistence.updateUserOnFirebase();
                    this$018.startActivity(new Intent(this$018.requireActivity(), V3DashboardActivity.class));
                    this$018.requireActivity().finish();
                    String str18 = gk.a.f16573a;
                    Bundle bundle7 = new Bundle();
                    String courseName2 = course2.getCourseName();
                    kotlin.jvm.internal.i.d(courseName2);
                    bundle7.putString("course", courseName2);
                    bundle7.putString("variant", (String) FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.ONBOARDING_EXPERIMENT));
                    bundle7.putBoolean("reset_flow", false);
                    bundle7.putString("source", "top_nav");
                    hs.k kVar5 = hs.k.f19476a;
                    gk.a.b(bundle7, "pre_domain_selection_existing");
                    return;
                }
                return;
            case 19:
                hl.s this$019 = (hl.s) obj7;
                Dialog subscriptionExpireDialog2 = (Dialog) obj6;
                int i29 = hl.s.f17728g0;
                kotlin.jvm.internal.i.g(this$019, "this$0");
                kotlin.jvm.internal.i.g(subscriptionExpireDialog2, "$subscriptionExpireDialog");
                androidx.fragment.app.p requireActivity2 = this$019.requireActivity();
                kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                this$019.f17730b0.a(tr.r.s(requireActivity2, false).putExtra("source", Constants.SCREEN_DASHBOARD));
                subscriptionExpireDialog2.dismiss();
                gk.a.b(null, "pr_app_sub_repurchase_popup_cta_click");
                return;
            case 20:
                il.c this$020 = (il.c) obj7;
                UserLibraryItemAccessModel it3 = (UserLibraryItemAccessModel) obj6;
                kotlin.jvm.internal.i.g(this$020, "this$0");
                kotlin.jvm.internal.i.g(it3, "$it");
                this$020.D.y(it3.getId(), it3.getItemType(), it3.getParentId(), it3.getParentType(), it3);
                return;
            case 21:
                Dialog dialog = (Dialog) obj7;
                il.q this$021 = (il.q) obj6;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$021, "this$0");
                try {
                    dialog.dismiss();
                    return;
                } catch (Exception e13) {
                    LogHelper.INSTANCE.e(this$021.f20386c, "error in creating intent for play store rating", e13);
                    return;
                }
            case 22:
                nd.z this$022 = (nd.z) obj7;
                RecommendedActivityModel model = (RecommendedActivityModel) obj6;
                kotlin.jvm.internal.i.g(this$022, "this$0");
                kotlin.jvm.internal.i.g(model, "$model");
                String str19 = gk.a.f16573a;
                Bundle bundle8 = new Bundle();
                bundle8.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle8.putString("activity_id", model.getGoalId());
                bundle8.putString("activity_name", model.getTitle());
                String lowerCase = model.getTemplateType().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                bundle8.putString("type", lowerCase);
                bundle8.putString("source", "home");
                hs.k kVar6 = hs.k.f19476a;
                gk.a.b(bundle8, "activity_card_click");
                this$022.g().startActivity(new Intent(this$022.g(), RecommendedActivitiesPlaybackActivity.class).putExtra("model", model).putExtra("source", "home"));
                return;
            case 23:
                V3DashboardUtils this$023 = (V3DashboardUtils) obj7;
                RecommendedActivityModel model2 = (RecommendedActivityModel) obj6;
                kotlin.jvm.internal.i.g(this$023, "this$0");
                kotlin.jvm.internal.i.g(model2, "$model");
                String str20 = gk.a.f16573a;
                Bundle bundle9 = new Bundle();
                bundle9.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle9.putString("activity_id", model2.getGoalId());
                bundle9.putString("activity_name", model2.getTitle());
                String lowerCase2 = model2.getTemplateType().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                bundle9.putString("type", lowerCase2);
                bundle9.putString("source", "home");
                hs.k kVar7 = hs.k.f19476a;
                gk.a.b(bundle9, "activity_card_click");
                this$023.f().startActivity(new Intent(this$023.f(), RecommendedActivitiesPlaybackActivity.class).putExtra("model", model2).putExtra("source", "home"));
                return;
            case 24:
                View this_apply = (View) obj7;
                HashMap tt2 = (HashMap) obj6;
                kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                kotlin.jvm.internal.i.g(tt2, "$tt");
                RobertoEditText robertoEditText = (RobertoEditText) this_apply.findViewById(R.id.etN12CAdditionalTextInput);
                if (robertoEditText != null) {
                    Object obj8 = tt2.get("list_key");
                    if (obj8 instanceof String) {
                        str8 = (String) obj8;
                    } else {
                        str8 = null;
                    }
                    robertoEditText.setText(str8);
                    return;
                }
                return;
            case 25:
                ol.g this$024 = (ol.g) obj7;
                HashMap hashMap = (HashMap) obj6;
                kotlin.jvm.internal.i.g(this$024, "this$0");
                if (hashMap != null) {
                    obj4 = hashMap.get("activity_id");
                } else {
                    obj4 = null;
                }
                if (obj4 instanceof String) {
                    str9 = (String) obj4;
                } else {
                    str9 = null;
                }
                if (hashMap != null) {
                    obj5 = hashMap.get("activity_variant");
                } else {
                    obj5 = null;
                }
                if (obj5 instanceof String) {
                    str10 = (String) obj5;
                } else {
                    str10 = null;
                }
                this$024.f27627z.invoke(str9, str10);
                return;
            case 26:
                o.a holder = (o.a) obj7;
                ol.o this$025 = (ol.o) obj6;
                kotlin.jvm.internal.i.g(holder, "$holder");
                kotlin.jvm.internal.i.g(this$025, "this$0");
                View view3 = holder.f2751a;
                if (((MotionLayout) view3.findViewById(R.id.mlN5ParentContainer)).getProgress() == 1.0f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    ((AppCompatImageView) view3.findViewById(R.id.ivN5ScreenRowArrow)).startAnimation(Utils.INSTANCE.rotateBy180(0.0f, 180.0f));
                    ((MotionLayout) view3.findViewById(R.id.mlN5ParentContainer)).m(0.0f);
                } else {
                    ((AppCompatImageView) view3.findViewById(R.id.ivN5ScreenRowArrow)).startAnimation(Utils.INSTANCE.rotateBy180(180.0f, 360.0f));
                    ((MotionLayout) view3.findViewById(R.id.mlN5ParentContainer)).A();
                }
                this$025.A.invoke();
                return;
            case 27:
                N12AItemListModel n12AItemListModel = (N12AItemListModel) obj7;
                ol.p this$026 = (ol.p) obj6;
                kotlin.jvm.internal.i.g(this$026, "this$0");
                if (n12AItemListModel != null) {
                    this$026.B.invoke(n12AItemListModel);
                    return;
                }
                return;
            case 28:
                Dialog dialog2 = (Dialog) obj7;
                N18AScreenFragment this$027 = (N18AScreenFragment) obj6;
                int i30 = N18AScreenFragment.A;
                kotlin.jvm.internal.i.g(dialog2, "$dialog");
                kotlin.jvm.internal.i.g(this$027, "this$0");
                dialog2.dismiss();
                this$027.requireActivity().finish();
                return;
            default:
                NewDynamicParentActivity newDynamicParentActivity = null;
                N24ScreenFragment this$028 = (N24ScreenFragment) obj7;
                kotlin.jvm.internal.v count = (kotlin.jvm.internal.v) obj6;
                int i31 = N24ScreenFragment.F;
                kotlin.jvm.internal.i.g(this$028, "this$0");
                kotlin.jvm.internal.i.g(count, "$count");
                int i32 = this$028.f11036w + 1;
                this$028.f11036w = i32;
                ArrayList arrayList = this$028.A;
                if (arrayList != null) {
                    i10 = arrayList.size();
                } else {
                    i10 = 1;
                }
                if (i32 < i10 * count.f23467u) {
                    RobertoTextView robertoTextView2 = (RobertoTextView) this$028._$_findCachedViewById(R.id.tvN24ScreenCounter);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this$028.f11036w + 1);
                    sb2.append('/');
                    ArrayList arrayList2 = this$028.A;
                    if (arrayList2 != null) {
                        i12 = arrayList2.size();
                    } else {
                        i12 = 1;
                    }
                    sb2.append(i12 * count.f23467u);
                    robertoTextView2.setText(sb2.toString());
                    RecyclerView recyclerView = (RecyclerView) this$028._$_findCachedViewById(R.id.rvN24ScreenPromptScroller);
                    if (recyclerView != null) {
                        recyclerView.l0(this$028.f11036w);
                    }
                    RecyclerView recyclerView2 = (RecyclerView) this$028._$_findCachedViewById(R.id.rvN24ScreenImageScroller);
                    if (recyclerView2 != null) {
                        recyclerView2.l0(this$028.f11036w);
                        return;
                    }
                    return;
                }
                this$028.f11036w = 0;
                RobertoTextView robertoTextView3 = (RobertoTextView) this$028._$_findCachedViewById(R.id.tvN24ScreenCounter);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this$028.f11036w + 1);
                sb3.append('/');
                ArrayList arrayList3 = this$028.A;
                if (arrayList3 != null) {
                    i11 = arrayList3.size();
                } else {
                    i11 = 1;
                }
                sb3.append(i11 * count.f23467u);
                robertoTextView3.setText(sb3.toString());
                androidx.fragment.app.p requireActivity3 = this$028.requireActivity();
                if (requireActivity3 instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity3;
                }
                if (newDynamicParentActivity != null) {
                    int i33 = NewDynamicParentActivity.F;
                    newDynamicParentActivity.L0(false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ j1(Object obj, int i6, Object obj2) {
        this.f20210u = i6;
        this.f20212w = obj;
        this.f20211v = obj2;
    }
}
