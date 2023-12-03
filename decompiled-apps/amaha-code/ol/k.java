package ol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import cm.z;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AddCustomGoalsActivity;
import com.theinnerhour.b2b.activity.AddGoalsActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.LibraryScreenLogsActivity;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N12CScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N1ScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N30ScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N4ScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N5ScreenFragment;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertCareInfoActivity;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.components.goals.activity.V2GoalsActivity;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.components.journal.activity.JournalActivity;
import com.theinnerhour.b2b.components.journal.activity.JournalParentActivity;
import com.theinnerhour.b2b.components.login.activity.SSOLoginPWA;
import com.theinnerhour.b2b.components.monetization.activitiy.MiniMonetizationActivity;
import com.theinnerhour.b2b.components.monetization.activitiy.MonetizationSuccessActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ol.m;
import pl.t0;
import r1.b0;
import sm.h0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f27655u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f27656v;

    public /* synthetic */ k(int i6, Object obj) {
        this.f27655u = i6;
        this.f27656v = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AppCompatImageView appCompatImageView;
        View view2;
        RobertoButton robertoButton;
        RobertoTextView robertoTextView;
        ProgressBar progressBar;
        int i6 = this.f27655u;
        boolean z10 = true;
        NewDynamicParentActivity newDynamicParentActivity = null;
        String str = null;
        Object obj = this.f27656v;
        switch (i6) {
            case 0:
                m.a this_apply = (m.a) obj;
                kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                MotionLayout motionLayout = this_apply.f27663u;
                if (motionLayout.getProgress() != 1.0f) {
                    z10 = false;
                }
                if (z10) {
                    motionLayout.m(0.0f);
                    return;
                } else {
                    motionLayout.A();
                    return;
                }
            case 1:
                N12CScreenFragment this$0 = (N12CScreenFragment) obj;
                int i10 = N12CScreenFragment.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (((HorizontalScrollView) this$0._$_findCachedViewById(R.id.hsv12CScreenContainer)).getVisibility() == 8) {
                    ((HorizontalScrollView) this$0._$_findCachedViewById(R.id.hsv12CScreenContainer)).setVisibility(0);
                    ((AppCompatImageView) this$0._$_findCachedViewById(R.id.iv12CScreenArrow)).startAnimation(Utils.INSTANCE.rotateBy180(0.0f, 180.0f));
                    return;
                }
                ((HorizontalScrollView) this$0._$_findCachedViewById(R.id.hsv12CScreenContainer)).setVisibility(8);
                ((AppCompatImageView) this$0._$_findCachedViewById(R.id.iv12CScreenArrow)).startAnimation(Utils.INSTANCE.rotateBy180(180.0f, 360.0f));
                return;
            case 2:
                N1ScreenFragment this$02 = (N1ScreenFragment) obj;
                int i11 = N1ScreenFragment.B;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                N1ScreenFragment.a aVar = this$02.f11019y;
                if (aVar != null) {
                    aVar.show(this$02.requireActivity().getSupportFragmentManager(), "HelpTextBottomSheetFragment");
                    return;
                } else {
                    kotlin.jvm.internal.i.q("helpTextBottomSheetFragment");
                    throw null;
                }
            case 3:
                N1ScreenFragment.a this$03 = (N1ScreenFragment.a) obj;
                int i12 = N1ScreenFragment.a.f11021y;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                com.google.android.material.bottomsheet.e eVar = this$03.f11024w;
                if (eVar != null) {
                    eVar.dismiss();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("dialog");
                    throw null;
                }
            case 4:
                N30ScreenFragment this$04 = (N30ScreenFragment) obj;
                int i13 = N30ScreenFragment.f11045z;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                Bundle bundle = new Bundle();
                bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle.putString("activity_name", this$04.P().T);
                bundle.putBoolean("main_activity", this$04.P().K);
                bundle.putBoolean("is_revamped", true);
                gk.a.b(bundle, "activity_related_do_later");
                androidx.fragment.app.p requireActivity = this$04.requireActivity();
                if (requireActivity instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
                }
                if (newDynamicParentActivity != null) {
                    int i14 = NewDynamicParentActivity.F;
                    newDynamicParentActivity.L0(false);
                    return;
                }
                return;
            case 5:
                N4ScreenFragment this$05 = (N4ScreenFragment) obj;
                int i15 = N4ScreenFragment.I;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                if (((HorizontalScrollView) this$05._$_findCachedViewById(R.id.hsvN4ScreenContainer)).getVisibility() == 8) {
                    ((HorizontalScrollView) this$05._$_findCachedViewById(R.id.hsvN4ScreenContainer)).setVisibility(0);
                    ((AppCompatImageView) this$05._$_findCachedViewById(R.id.ivN4ScreenArrow)).startAnimation(Utils.INSTANCE.rotateBy180(0.0f, 180.0f));
                    return;
                }
                ((HorizontalScrollView) this$05._$_findCachedViewById(R.id.hsvN4ScreenContainer)).setVisibility(8);
                ((AppCompatImageView) this$05._$_findCachedViewById(R.id.ivN4ScreenArrow)).startAnimation(Utils.INSTANCE.rotateBy180(180.0f, 360.0f));
                return;
            case 6:
                N5ScreenFragment this$06 = (N5ScreenFragment) obj;
                int i16 = N5ScreenFragment.I;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                if (((HorizontalScrollView) this$06._$_findCachedViewById(R.id.hsvN5ScreenContainer)).getVisibility() == 8) {
                    ((HorizontalScrollView) this$06._$_findCachedViewById(R.id.hsvN5ScreenContainer)).setVisibility(0);
                    ((AppCompatImageView) this$06._$_findCachedViewById(R.id.ivN5ScreenArrow)).startAnimation(Utils.INSTANCE.rotateBy180(0.0f, 180.0f));
                    return;
                }
                ((HorizontalScrollView) this$06._$_findCachedViewById(R.id.hsvN5ScreenContainer)).setVisibility(8);
                ((AppCompatImageView) this$06._$_findCachedViewById(R.id.ivN5ScreenArrow)).startAnimation(Utils.INSTANCE.rotateBy180(180.0f, 360.0f));
                return;
            case 7:
                t0 this$07 = (t0) obj;
                int i17 = t0.f28634x;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                this$07.requireActivity().onBackPressed();
                return;
            case 8:
                ExpertCareInfoActivity this$08 = (ExpertCareInfoActivity) obj;
                int i18 = ExpertCareInfoActivity.f11131x;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                this$08.onBackPressed();
                gk.a.b(null, "therapy_psychiatry_consult_back");
                return;
            case 9:
                ConstraintLayout bottomSheet = (ConstraintLayout) obj;
                int i19 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(bottomSheet, "$bottomSheet");
                BottomSheetBehavior.from(bottomSheet).setState(4);
                String str2 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                defpackage.e.s(bundle2, "course", "type", "goals");
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle2, "self_care_nps_cancel");
                return;
            case 10:
                bm.d this$09 = (bm.d) obj;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                this$09.A.b();
                return;
            case 11:
                bm.i this$010 = (bm.i) obj;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                Activity activity = this$010.f4466x;
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.activity.V2GoalsActivity");
                V2GoalsActivity v2GoalsActivity = (V2GoalsActivity) activity;
                v2GoalsActivity.startActivityForResult(new Intent(activity, AddGoalsActivity.class), v2GoalsActivity.f11177z);
                return;
            case 12:
                bm.m this$011 = (bm.m) obj;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
                boolean subscriptionEnabled = subscriptionPersistence.getSubscriptionEnabled();
                Activity activity2 = this$011.f4489x;
                if (!subscriptionEnabled && !this$011.D) {
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity");
                    V3GoalsActivity v3GoalsActivity = (V3GoalsActivity) activity2;
                    try {
                        gk.a.b(null, "custom_goal_subscription_click");
                        v3GoalsActivity.startActivityForResult(tr.r.s(v3GoalsActivity, false).putExtra("source", "goals_custom_goal"), v3GoalsActivity.f11190y);
                        return;
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(v3GoalsActivity.f11187v, e10);
                        return;
                    }
                }
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity");
                ((V3GoalsActivity) activity2).C0(new Intent(activity2, AddCustomGoalsActivity.class), true);
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("subscription_status", subscriptionPersistence.getSubscriptionEnabled());
                gk.a.b(bundle3, "custom_goal_add_goal_click");
                return;
            case 13:
                bm.o this$012 = (bm.o) obj;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                Activity activity3 = this$012.f4509x;
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity");
                ((V3GoalsActivity) activity3).C0(new Intent(activity3, AddGoalsActivity.class), false);
                return;
            case 14:
                cm.l this$013 = (cm.l) obj;
                int i20 = cm.l.B;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                fm.a aVar2 = this$013.f5357w;
                if (aVar2 != null) {
                    Intent putExtra = new Intent(this$013.requireActivity(), AddCustomGoalsActivity.class).putExtra("isFirestoreGoalsExperiment", true);
                    kotlin.jvm.internal.i.f(putExtra, "Intent(requireActivity()…reGoalsExperiment\", true)");
                    aVar2.z(putExtra);
                }
                String str3 = gk.a.f16573a;
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("subscription_status", SubscriptionPersistence.INSTANCE.getSubscriptionEnabled());
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(bundle4, "custom_goal_add_goal_click");
                return;
            case 15:
                z this$014 = (z) obj;
                int i21 = z.D;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                try {
                    V3GoalsActivity v3GoalsActivity2 = this$014.f5392w;
                    if (v3GoalsActivity2 != null) {
                        V3GoalsActivity v3GoalsActivity3 = this$014.f5392w;
                        if (v3GoalsActivity3 != null) {
                            v3GoalsActivity2.C0(new Intent(v3GoalsActivity3, AddCustomGoalsActivity.class), true);
                            Bundle bundle5 = new Bundle();
                            bundle5.putBoolean("subscription_status", SubscriptionPersistence.INSTANCE.getSubscriptionEnabled());
                            gk.a.b(bundle5, "custom_goal_add_goal_click");
                            return;
                        }
                        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                        throw null;
                    }
                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                    throw null;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$014.f5390u, e11);
                    return;
                }
            case 16:
                hm.a this$015 = (hm.a) obj;
                int i22 = hm.a.B;
                kotlin.jvm.internal.i.g(this$015, "this$0");
                this$015.f17778z.a(new Intent(this$015.requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.THERAPIST_LISTING).putExtra("override_source_value", "app_onboarding_matching"));
                String str4 = gk.a.f16573a;
                Bundle a10 = b0.a("flow", "therapy");
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str = user.getCurrentCourseName();
                }
                a10.putString("domain", str);
                hs.k kVar3 = hs.k.f19476a;
                gk.a.b(a10, "in_app_matching_view_all_profile");
                return;
            case 17:
                mm.g this$016 = (mm.g) obj;
                kotlin.jvm.internal.i.g(this$016, "this$0");
                this$016.A.invoke();
                return;
            case 18:
                nm.a this$017 = (nm.a) obj;
                int i23 = nm.a.f26387z;
                kotlin.jvm.internal.i.g(this$017, "this$0");
                Bundle bundle6 = new Bundle();
                bundle6.putString("action", "main_card");
                bundle6.putString("source", Constants.SCREEN_DASHBOARD);
                Intent intent = new Intent(this$017.requireActivity(), JournalActivity.class);
                if (!this$017.f26390w) {
                    this$017.f26390w = true;
                    intent.putExtra("type", "template_question");
                }
                gk.a.b(bundle6, "journal_card_click");
                this$017.f26391x.a(intent);
                return;
            case 19:
                sm.l this$018 = (sm.l) obj;
                int i24 = sm.l.E;
                kotlin.jvm.internal.i.g(this$018, "this$0");
                if (!this$018.J().isEmpty()) {
                    this$018.I();
                    androidx.fragment.app.p requireActivity2 = this$018.requireActivity();
                    kotlin.jvm.internal.i.e(requireActivity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                    ((JournalParentActivity) requireActivity2).v0();
                    String str5 = gk.a.f16573a;
                    Bundle bundle7 = new Bundle();
                    bundle7.putStringArrayList("feeling", new ArrayList<>(this$018.J()));
                    hs.k kVar4 = hs.k.f19476a;
                    gk.a.b(bundle7, "journal_feeling_added");
                    return;
                }
                Toast.makeText(this$018.requireActivity(), this$018.getString(R.string.journal_selection_error), 0).show();
                return;
            case 20:
                h0 this$019 = (h0) obj;
                int i25 = h0.E;
                kotlin.jvm.internal.i.g(this$019, "this$0");
                String str6 = gk.a.f16573a;
                Bundle bundle8 = new Bundle();
                List<HashMap<String, String>> J = this$019.J();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = J.iterator();
                while (it.hasNext()) {
                    String str7 = (String) ((HashMap) it.next()).get("title");
                    if (str7 != null) {
                        arrayList.add(str7);
                    }
                }
                bundle8.putStringArrayList("thinking_style", new ArrayList<>(arrayList));
                hs.k kVar5 = hs.k.f19476a;
                gk.a.b(bundle8, "journal_thinking_style_select");
                this$019.I();
                androidx.fragment.app.p requireActivity3 = this$019.requireActivity();
                kotlin.jvm.internal.i.e(requireActivity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                ((JournalParentActivity) requireActivity3).v0();
                return;
            case 21:
                an.c this$020 = (an.c) obj;
                int i26 = an.c.f680w;
                kotlin.jvm.internal.i.g(this$020, "this$0");
                this$020.requireActivity().onBackPressed();
                return;
            case 22:
                an.h this$021 = (an.h) obj;
                int i27 = an.h.F;
                kotlin.jvm.internal.i.g(this$021, "this$0");
                String str8 = gk.a.f16573a;
                Bundle bundle9 = new Bundle();
                bundle9.putString("miniCourse_chip_selected", this$021.K());
                hs.k kVar6 = hs.k.f19476a;
                gk.a.b(bundle9, "lib_course_list_view_back_click");
                this$021.requireActivity().onBackPressed();
                return;
            case 23:
                an.j this$022 = (an.j) obj;
                int i28 = an.j.G;
                kotlin.jvm.internal.i.g(this$022, "this$0");
                this$022.requireActivity().onBackPressed();
                return;
            case 24:
                an.n this$023 = (an.n) obj;
                int i29 = an.n.I;
                kotlin.jvm.internal.i.g(this$023, "this$0");
                this$023.requireActivity().onBackPressed();
                return;
            case 25:
                SSOLoginPWA this$024 = (SSOLoginPWA) obj;
                int i30 = SSOLoginPWA.f11314x;
                kotlin.jvm.internal.i.g(this$024, "this$0");
                if (Utils.INSTANCE.checkConnectivity(this$024)) {
                    yp.a aVar3 = this$024.f11316w;
                    if (aVar3 != null && (progressBar = aVar3.f38708e) != null) {
                        Extensions.INSTANCE.visible(progressBar);
                    }
                    yp.a aVar4 = this$024.f11316w;
                    if (aVar4 != null && (robertoTextView = aVar4.f) != null) {
                        Extensions.INSTANCE.gone(robertoTextView);
                    }
                    yp.a aVar5 = this$024.f11316w;
                    if (aVar5 != null && (robertoButton = aVar5.f38706c) != null) {
                        Extensions.INSTANCE.gone(robertoButton);
                    }
                    yp.a aVar6 = this$024.f11316w;
                    if (aVar6 != null && (view2 = aVar6.f38705b) != null) {
                        Extensions.INSTANCE.gone(view2);
                    }
                    yp.a aVar7 = this$024.f11316w;
                    if (aVar7 != null && (appCompatImageView = aVar7.f38707d) != null) {
                        Extensions.INSTANCE.gone(appCompatImageView);
                    }
                    this$024.o0();
                    return;
                }
                return;
            case 26:
                jn.b this$025 = (jn.b) obj;
                int i31 = jn.b.D;
                kotlin.jvm.internal.i.g(this$025, "this$0");
                androidx.fragment.app.p activity4 = this$025.getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity4).getOnBackPressedDispatcher().b();
                return;
            case 27:
                jn.c this$026 = (jn.c) obj;
                int i32 = jn.c.f22501y;
                kotlin.jvm.internal.i.g(this$026, "this$0");
                androidx.fragment.app.p activity5 = this$026.getActivity();
                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dashboard.experiment.activity.LibraryScreenLogsActivity");
                ((LibraryScreenLogsActivity) activity5).onBackPressed();
                return;
            case 28:
                MiniMonetizationActivity this$027 = (MiniMonetizationActivity) obj;
                int i33 = MiniMonetizationActivity.f11396b0;
                kotlin.jvm.internal.i.g(this$027, "this$0");
                this$027.finish();
                return;
            default:
                MonetizationSuccessActivity this$028 = (MonetizationSuccessActivity) obj;
                kotlin.jvm.internal.i.g(this$028, "this$0");
                this$028.finish();
                return;
        }
    }
}
