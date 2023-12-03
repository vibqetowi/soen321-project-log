package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AllMiniCoursesActivity;
import com.theinnerhour.b2b.activity.DeepLinkActivationActivity;
import com.theinnerhour.b2b.activity.DeeplinkCodeActivationActivity;
import com.theinnerhour.b2b.activity.DynamicCardsNotificationActivity;
import com.theinnerhour.b2b.activity.FAQActivity;
import com.theinnerhour.b2b.activity.LearningHubActivity;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
import com.theinnerhour.b2b.activity.SettingsActivity;
import com.theinnerhour.b2b.activity.SevenDayProgressActivity;
import com.theinnerhour.b2b.activity.T5Activity;
import com.theinnerhour.b2b.activity.T8Activity;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.components.minicourses.MiniCoursesViewModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.GratitudeLetterModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.ScreenResult10Model;
import com.theinnerhour.b2b.model.ScreenResult14Model;
import com.theinnerhour.b2b.model.ScreenResult16Model;
import com.theinnerhour.b2b.model.ScreenResult1Model;
import com.theinnerhour.b2b.model.ScreenResult21Model;
import com.theinnerhour.b2b.model.ScreenResult22Model;
import com.theinnerhour.b2b.model.ScreenResult28Model;
import com.theinnerhour.b2b.model.ScreenResult30Model;
import com.theinnerhour.b2b.model.ScreenResult31Model;
import com.theinnerhour.b2b.model.ScreenResult3Model;
import com.theinnerhour.b2b.model.ScreenResult4Model;
import com.theinnerhour.b2b.model.ScreenResult6Model;
import com.theinnerhour.b2b.model.ScreenResult9Model;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.StatPersistence;
import com.theinnerhour.b2b.utils.CustomVolleyStringRequest;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dk.l;
import ek.b0;
import ek.d0;
import ek.e0;
import ek.g0;
import ek.i0;
import ek.k0;
import ek.m0;
import ek.o0;
import ek.p0;
import ek.q;
import ek.r;
import ek.r0;
import ek.t;
import ek.t0;
import ek.v0;
import ek.x;
import ek.z;
import fq.f1;
import fq.i1;
import fq.k1;
import hr.b;
import hr.c;
import hr.e;
import hr.e4;
import hr.f3;
import hr.g;
import hr.g1;
import hr.h;
import hr.p1;
import hr.q0;
import hr.q9;
import hr.t2;
import hs.k;
import ik.w0;
import ik.x0;
import java.util.HashMap;
import kc.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;
import ln.d;
/* compiled from: R8$$SyntheticClass */
/* renamed from: a  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f2u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f3v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f4w;

    public /* synthetic */ a(Object obj, int i6, Object obj2) {
        this.f2u = i6;
        this.f3v = obj;
        this.f4w = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f2u;
        Object obj = this.f4w;
        Object obj2 = this.f3v;
        switch (i6) {
            case 0:
                f this$0 = (f) obj2;
                ScreenResult6Model goalData = (ScreenResult6Model) obj;
                i.g(this$0, "this$0");
                i.g(goalData, "$goalData");
                T8Activity t8Activity = this$0.f14592y;
                HashMap<String, Object> hashMap = t8Activity.B;
                String str = this$0.A;
                hashMap.put(str, goalData);
                t8Activity.x0(new k1(), str);
                return;
            case 1:
                MiniCourse mc2 = (MiniCourse) obj2;
                AllMiniCoursesActivity this$02 = (AllMiniCoursesActivity) obj;
                int i10 = AllMiniCoursesActivity.G;
                i.g(mc2, "$mc");
                i.g(this$02, "this$0");
                Bundle bundle = new Bundle();
                bundle.putString("miniCourse", mc2.getDomain());
                bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                gk.a.b(bundle, "all_mini_courses_continue_card_click");
                Intent intent = new Intent(this$02, MiniCourseActivity.class);
                String domain = mc2.getDomain();
                i.d(domain);
                this$02.startActivityForResult(intent.putExtra("mccourse", domain).putExtra("source", "mc_listing_page").putExtra("status", "resume"), this$02.f10306x);
                return;
            case 2:
                Dialog errorDialog = (Dialog) obj2;
                DeepLinkActivationActivity this$03 = (DeepLinkActivationActivity) obj;
                int i11 = DeepLinkActivationActivity.f10350z;
                i.g(errorDialog, "$errorDialog");
                i.g(this$03, "this$0");
                errorDialog.dismiss();
                this$03.finish();
                return;
            case 3:
                Dialog errorDialog2 = (Dialog) obj2;
                DeeplinkCodeActivationActivity this$04 = (DeeplinkCodeActivationActivity) obj;
                int i12 = DeeplinkCodeActivationActivity.f10355z;
                i.g(errorDialog2, "$errorDialog");
                i.g(this$04, "this$0");
                errorDialog2.dismiss();
                this$04.finish();
                return;
            case 4:
                Intent intent2 = (Intent) obj2;
                DynamicCardsNotificationActivity this$05 = (DynamicCardsNotificationActivity) obj;
                int i13 = DynamicCardsNotificationActivity.f10396w;
                i.g(this$05, "this$0");
                if (intent2 != null) {
                    this$05.startActivity(intent2);
                    return;
                }
                return;
            case 5:
                RobertoTextView faqAns = (RobertoTextView) obj2;
                int i14 = FAQActivity.f10402x;
                i.g(faqAns, "$faqAns");
                i.g((FAQActivity) obj, "this$0");
                if (faqAns.getVisibility() == 0) {
                    faqAns.setVisibility(8);
                    return;
                } else {
                    faqAns.setVisibility(0);
                    return;
                }
            case 6:
                MiniCourseActivity this$06 = (MiniCourseActivity) obj2;
                Handler rippleHandler = (Handler) obj;
                int i15 = MiniCourseActivity.O;
                i.g(this$06, "this$0");
                i.g(rippleHandler, "$rippleHandler");
                this$06.G = 0;
                MiniCourse miniCourse = this$06.f10447x;
                if (miniCourse != null) {
                    CourseDayModelV1 courseDayModelV1 = miniCourse.getPlan().get(0);
                    i.f(courseDayModelV1, "miniCourse.plan[0]");
                    Intent B0 = this$06.B0(courseDayModelV1);
                    if (B0 != null) {
                        this$06.startActivityForResult(B0, this$06.J);
                    }
                    this$06.D = true;
                    new Handler().postDelayed(new l(this$06, 1), 200L);
                    rippleHandler.removeCallbacksAndMessages(null);
                    return;
                }
                i.q("miniCourse");
                throw null;
            case 7:
                v score = (v) obj2;
                MiniCourseActivity this$07 = (MiniCourseActivity) obj;
                int i16 = MiniCourseActivity.O;
                i.g(score, "$score");
                i.g(this$07, "this$0");
                int i17 = score.f23467u;
                if (i17 != -1) {
                    String str2 = this$07.f10446w;
                    if (str2 != null) {
                        MiniCoursesViewModel miniCoursesViewModel = this$07.f10448y;
                        if (miniCoursesViewModel != null) {
                            ta.v.H(f.H(miniCoursesViewModel), null, 0, new d(miniCoursesViewModel, i17, str2, null), 3);
                        }
                        BottomSheetBehavior.from((ConstraintLayout) this$07.v0(R.id.clNPSBottomSheet)).setState(4);
                        String str3 = gk.a.f16573a;
                        Bundle bundle2 = new Bundle();
                        e.s(bundle2, "course", "type", "foundation_course");
                        bundle2.putInt("rating", score.f23467u);
                        k kVar = k.f19476a;
                        gk.a.b(bundle2, "self_care_nps_submit");
                        return;
                    }
                    i.q("miniCourseDomain");
                    throw null;
                }
                return;
            case 8:
                Dialog logoutDialog = (Dialog) obj2;
                u logoutFromAllDevice = (u) obj;
                int i18 = SettingsActivity.f10478z;
                i.g(logoutDialog, "$logoutDialog");
                i.g(logoutFromAllDevice, "$logoutFromAllDevice");
                String str4 = gk.a.f16573a;
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_logout_all_devices", logoutFromAllDevice.f23466u);
                k kVar2 = k.f19476a;
                gk.a.b(bundle3, "dashboard_logout_cancel");
                logoutDialog.dismiss();
                return;
            case 9:
                SettingsActivity this$08 = (SettingsActivity) obj2;
                Dialog dialog = (Dialog) obj;
                int i19 = SettingsActivity.f10478z;
                i.g(this$08, "this$0");
                i.g(dialog, "$dialog");
                StatPersistence.INSTANCE.updateAllieTrackCount(0L);
                try {
                    VolleySingleton.getInstance().add(new CustomVolleyStringRequest(1, "https://api.theinnerhour.com/v1/allie/" + SessionManager.getInstance().getStringValue(SessionManager.KEY_UUID), new dk.u(this$08, 0), new dk.v(this$08)));
                } catch (Exception unused) {
                }
                Bundle bundle4 = new Bundle();
                if (FirebasePersistence.getInstance().getUser() != null) {
                    d.m(bundle4, "course");
                }
                gk.a.b(bundle4, "reset_bot");
                dialog.dismiss();
                return;
            case 10:
                SevenDayProgressActivity this$09 = (SevenDayProgressActivity) obj;
                int i20 = SevenDayProgressActivity.f10485y;
                i.g(this$09, "this$0");
                Bundle bundle5 = new Bundle();
                bundle5.putString("course", ((Course) obj2).getCourseName());
                bundle5.putString("week_no", String.valueOf(this$09.f10486v));
                gk.a.b(bundle5, "weeky_report_cta");
                this$09.finish();
                return;
            case 11:
                q this$010 = (q) obj2;
                LearningHubModel model = (LearningHubModel) obj;
                i.g(this$010, "this$0");
                i.g(model, "$model");
                Context context = this$010.f14263y;
                context.startActivity(new Intent(context, LearningHubActivity.class).putExtra("model", model));
                return;
            case 12:
                r this$011 = (r) obj2;
                ScreenResult10Model goalData2 = (ScreenResult10Model) obj;
                i.g(this$011, "this$0");
                i.g(goalData2, "$goalData");
                TemplateActivity templateActivity = this$011.f14274y;
                templateActivity.F.put("data", goalData2);
                templateActivity.s0(new b());
                return;
            case 13:
                t this$012 = (t) obj2;
                GratitudeLetterModel goalData3 = (GratitudeLetterModel) obj;
                i.g(this$012, "this$0");
                i.g(goalData3, "$goalData");
                TemplateActivity templateActivity2 = this$012.f14298y;
                HashMap<String, Object> hashMap2 = templateActivity2.F;
                hashMap2.put("goalData", goalData3);
                hashMap2.put("log", Boolean.TRUE);
                templateActivity2.s0(new q9());
                return;
            case 14:
                x this$013 = (x) obj2;
                ScreenResult14Model goalData4 = (ScreenResult14Model) obj;
                i.g(this$013, "this$0");
                i.g(goalData4, "$goalData");
                TemplateActivity templateActivity3 = this$013.f14337y;
                templateActivity3.F.put("data", goalData4);
                templateActivity3.s0(new c());
                return;
            case 15:
                z this$014 = (z) obj2;
                ScreenResult16Model goalData5 = (ScreenResult16Model) obj;
                i.g(this$014, "this$0");
                i.g(goalData5, "$goalData");
                TemplateActivity templateActivity4 = this$014.f14359y;
                HashMap<String, Object> hashMap3 = templateActivity4.F;
                hashMap3.put("data", goalData5);
                hashMap3.put("log", Boolean.TRUE);
                templateActivity4.s0(new q0());
                return;
            case 16:
                b0 this$015 = (b0) obj2;
                ScreenResult1Model goalData6 = (ScreenResult1Model) obj;
                i.g(this$015, "this$0");
                i.g(goalData6, "$goalData");
                TemplateActivity templateActivity5 = this$015.f14071y;
                HashMap<String, Object> hashMap4 = templateActivity5.F;
                hashMap4.put("qus", goalData6.getHeadings());
                hashMap4.put("ans", goalData6.getList());
                Boolean bool = Boolean.TRUE;
                hashMap4.put("log", bool);
                String title = goalData6.getTitle();
                i.e(title, "null cannot be cast to non-null type kotlin.String");
                hashMap4.put("heading", title);
                hashMap4.put("log_back", bool);
                templateActivity5.s0(new g1());
                return;
            case 17:
                d0 this$016 = (d0) obj2;
                ScreenResult1Model goalData7 = (ScreenResult1Model) obj;
                i.g(this$016, "this$0");
                i.g(goalData7, "$goalData");
                T8Activity t8Activity2 = this$016.f14096y;
                t8Activity2.B.put("result_static_three_good_things", goalData7);
                t8Activity2.x0(new f1(), "result_static_three_good_things");
                return;
            case 18:
                e0 this$017 = (e0) obj2;
                ScreenResult21Model goalData8 = (ScreenResult21Model) obj;
                i.g(this$017, "this$0");
                i.g(goalData8, "$goalData");
                TemplateActivity templateActivity6 = this$017.f14111y;
                HashMap<String, Object> hashMap5 = templateActivity6.F;
                hashMap5.put("data", goalData8);
                hashMap5.put("log", Boolean.TRUE);
                templateActivity6.s0(new p1());
                return;
            case 19:
                g0 this$018 = (g0) obj2;
                ScreenResult22Model goalData9 = (ScreenResult22Model) obj;
                i.g(this$018, "this$0");
                i.g(goalData9, "$goalData");
                TemplateActivity templateActivity7 = this$018.f14138y;
                templateActivity7.F.put("data", goalData9);
                templateActivity7.s0(new e());
                return;
            case 20:
                i0 this$019 = (i0) obj2;
                ScreenResult28Model goalData10 = (ScreenResult28Model) obj;
                i.g(this$019, "this$0");
                i.g(goalData10, "$goalData");
                TemplateActivity templateActivity8 = this$019.f14165y;
                templateActivity8.F.put("data", goalData10);
                templateActivity8.s0(new hr.f());
                return;
            case 21:
                k0 this$020 = (k0) obj2;
                ScreenResult30Model goalData11 = (ScreenResult30Model) obj;
                i.g(this$020, "this$0");
                i.g(goalData11, "$goalData");
                TemplateActivity templateActivity9 = this$020.f14188y;
                HashMap<String, Object> hashMap6 = templateActivity9.F;
                hashMap6.put("data", goalData11);
                hashMap6.put("log", Boolean.TRUE);
                templateActivity9.s0(new t2());
                return;
            case 22:
                m0 this$021 = (m0) obj2;
                ScreenResult31Model goalData12 = (ScreenResult31Model) obj;
                i.g(this$021, "this$0");
                i.g(goalData12, "$goalData");
                TemplateActivity templateActivity10 = this$021.f14213y;
                templateActivity10.F.put("data", goalData12);
                templateActivity10.s0(new g());
                return;
            case 23:
                o0 this$022 = (o0) obj2;
                ScreenResult10Model goalData13 = (ScreenResult10Model) obj;
                i.g(this$022, "this$0");
                i.g(goalData13, "$goalData");
                T5Activity t5Activity = this$022.f14237y;
                HashMap<String, Object> hashMap7 = t5Activity.B;
                String str5 = this$022.A;
                hashMap7.put(str5, goalData13);
                t5Activity.w0(new i1(), str5);
                return;
            case 24:
                p0 this$023 = (p0) obj2;
                ScreenResult3Model goalData14 = (ScreenResult3Model) obj;
                i.g(this$023, "this$0");
                i.g(goalData14, "$goalData");
                TemplateActivity templateActivity11 = this$023.f14257y;
                templateActivity11.F.put("data", goalData14);
                templateActivity11.s0(new h());
                return;
            case 25:
                r0 this$024 = (r0) obj2;
                ScreenResult4Model goalData15 = (ScreenResult4Model) obj;
                i.g(this$024, "this$0");
                i.g(goalData15, "$goalData");
                TemplateActivity templateActivity12 = this$024.f14280y;
                HashMap<String, Object> hashMap8 = templateActivity12.F;
                hashMap8.put("data", goalData15);
                Boolean bool2 = Boolean.TRUE;
                hashMap8.put("log", bool2);
                hashMap8.put("log_back", bool2);
                templateActivity12.s0(new f3());
                return;
            case 26:
                t0 this$025 = (t0) obj2;
                ScreenResult6Model goalData16 = (ScreenResult6Model) obj;
                i.g(this$025, "this$0");
                i.g(goalData16, "$goalData");
                TemplateActivity templateActivity13 = this$025.f14305y;
                templateActivity13.F.put("data", goalData16);
                templateActivity13.s0(new hr.i());
                return;
            case 27:
                v0 this$026 = (v0) obj2;
                ScreenResult9Model goalData17 = (ScreenResult9Model) obj;
                i.g(this$026, "this$0");
                i.g(goalData17, "$goalData");
                TemplateActivity templateActivity14 = this$026.f14324y;
                HashMap<String, Object> hashMap9 = templateActivity14.F;
                hashMap9.put("data", goalData17);
                hashMap9.put("log", Boolean.TRUE);
                templateActivity14.s0(new e4());
                return;
            case 28:
                Bundle analyticsBundle = (Bundle) obj2;
                w0 this$027 = (w0) obj;
                int i21 = w0.f20321x;
                i.g(analyticsBundle, "$analyticsBundle");
                i.g(this$027, "this$0");
                gk.a.b(analyticsBundle, "progragmme_assessment_result");
                InitialAssessmentActivity initialAssessmentActivity = this$027.f20323v;
                if (initialAssessmentActivity != null) {
                    initialAssessmentActivity.O = true;
                    initialAssessmentActivity.t0();
                    return;
                }
                i.q("act");
                throw null;
            default:
                Bundle analyticsBundle2 = (Bundle) obj2;
                x0 this$028 = (x0) obj;
                int i22 = x0.f20338x;
                i.g(analyticsBundle2, "$analyticsBundle");
                i.g(this$028, "this$0");
                gk.a.b(analyticsBundle2, "progragmme_assessment_result");
                InitialAssessmentActivity initialAssessmentActivity2 = this$028.f20340v;
                if (initialAssessmentActivity2 != null) {
                    initialAssessmentActivity2.t0();
                    return;
                } else {
                    i.q("act");
                    throw null;
                }
        }
    }
}
