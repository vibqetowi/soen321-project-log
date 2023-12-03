package dk;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.b;
import bm.d;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SettingsActivity;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.bookmarking.activities.BookmarkingActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CustomDashboardActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NotV4Activity;
import com.theinnerhour.b2b.components.dashboard.utils.V3DashboardUtils;
import com.theinnerhour.b2b.components.dynamicActivities.data.N12AItemListModel;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N12AScreenFragment;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.journal.activity.JournalParentActivity;
import com.theinnerhour.b2b.components.journal.model.JournalThoughtThinkingItemListModel;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubArticleExperimentActivity;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubExperimentVideoActivity;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.components.teleEntryPoint.activity.ProviderVideoActivity;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.GamificationBadgesModel;
import com.theinnerhour.b2b.model.GratitudeLetterModel;
import com.theinnerhour.b2b.model.LearningHubFieldModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.network.model.OfflineClinicDetail;
import com.theinnerhour.b2b.network.model.OfflineClinicLocationDetail;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
import com.theinnerhour.b2b.network.model.UpcomingBooking;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.FeedBackUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import ek.h1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mm.h;
import mm.i;
import org.json.JSONObject;
import sl.c;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12953u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f12954v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f12955w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f12956x;

    public /* synthetic */ t(int i6, Object obj, Object obj2, Object obj3) {
        this.f12953u = i6;
        this.f12954v = obj;
        this.f12955w = obj2;
        this.f12956x = obj3;
    }

    private final void a() {
        List<String> list;
        an.f this$0 = (an.f) this.f12954v;
        ArrayList<String> tempFilterList = (ArrayList) this.f12955w;
        Dialog filterDialog = (Dialog) this.f12956x;
        int i6 = an.f.C;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(tempFilterList, "$tempFilterList");
        kotlin.jvm.internal.i.g(filterDialog, "$filterDialog");
        if (tempFilterList.isEmpty()) {
            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.ivLibraryResourcesFilterAlert)).setVisibility(8);
        } else {
            ((AppCompatImageView) this$0._$_findCachedViewById(R.id.ivLibraryResourcesFilterAlert)).setVisibility(0);
        }
        this$0.f704y = tempFilterList;
        String str = gk.a.f16573a;
        Bundle bundle = new Bundle();
        bundle.putString("resource_chip ", this$0.f701v);
        bundle.putStringArrayList("filters_selected_during_apply ", this$0.J());
        hs.k kVar = hs.k.f19476a;
        gk.a.b(bundle, "lib_resource_filter_apply_click");
        cn.w wVar = this$0.f703x;
        if (wVar != null) {
            String str2 = this$0.f701v;
            if (!this$0.J().isEmpty()) {
                list = is.u.I2(this$0.J());
            } else {
                list = this$0.f705z;
                if (list == null) {
                    kotlin.jvm.internal.i.q("predefinedPostTypeFilters");
                    throw null;
                }
            }
            wVar.f(str2, list);
            filterDialog.dismiss();
            return;
        }
        kotlin.jvm.internal.i.q("libraryResourcesViewModel");
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        boolean z10;
        String str3;
        String str4;
        yp.c cVar;
        ConstraintLayout constraintLayout;
        yp.c cVar2;
        ConstraintLayout constraintLayout2;
        String str5;
        String str6;
        String str7;
        String str8;
        OfflineClinicLocationDetail locationDetail;
        boolean z11;
        boolean z12;
        String str9;
        Object obj;
        Object obj2;
        String str10;
        Object obj3;
        Object obj4;
        String str11;
        int i6 = this.f12953u;
        Object obj5 = this.f12956x;
        Object obj6 = this.f12955w;
        Object obj7 = this.f12954v;
        switch (i6) {
            case 0:
                Bundle analyticsBundle = (Bundle) obj7;
                SettingsActivity this$0 = (SettingsActivity) obj6;
                Dialog dialog = (Dialog) obj5;
                int i10 = SettingsActivity.f10478z;
                kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                gk.a.b(analyticsBundle, "account_delete_confirm");
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(SessionManager.KEY_EMAIL, SessionManager.getInstance().getStringValue(SessionManager.KEY_UID));
                    VolleySingleton.getInstance().add(new CustomVolleyJsonObjectRequest(1, "https://api.theinnerhour.com/v1/global/delete", jSONObject, new u(this$0, 1), new w(this$0)));
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f10479v, "exception in sending delete account request", e10);
                }
                dialog.dismiss();
                return;
            case 1:
                ek.t this$02 = (ek.t) obj7;
                GratitudeLetterModel goalData = (GratitudeLetterModel) obj6;
                z4.f requestOptions = (z4.f) obj5;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(goalData, "$goalData");
                kotlin.jvm.internal.i.g(requestOptions, "$requestOptions");
                TemplateActivity templateActivity = this$02.f14298y;
                Dialog dialog2 = new Dialog(templateActivity, 16973834);
                dialog2.setContentView(R.layout.dialog_image_fullscreen);
                com.bumptech.glide.e<Bitmap> a10 = Glide.i(templateActivity).a();
                a10.Z = "https://" + goalData.getDownloadUrl();
                a10.f5953b0 = true;
                a10.z(new ek.u(dialog2));
                View findViewById = dialog2.findViewById(R.id.ivClose);
                kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
                ((ImageView) findViewById).setOnClickListener(new n(dialog2, 2));
                Window window = dialog2.getWindow();
                kotlin.jvm.internal.i.d(window);
                window.setLayout(-1, -1);
                dialog2.show();
                return;
            case 2:
                ek.v this$03 = (ek.v) obj7;
                GratitudeLetterModel goalData2 = (GratitudeLetterModel) obj6;
                z4.f requestOptions2 = (z4.f) obj5;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.g(goalData2, "$goalData");
                kotlin.jvm.internal.i.g(requestOptions2, "$requestOptions");
                Context context = this$03.f14318y;
                kotlin.jvm.internal.i.d(context);
                Dialog dialog3 = new Dialog(context, 16973834);
                dialog3.setContentView(R.layout.dialog_image_fullscreen);
                com.bumptech.glide.e<Bitmap> a11 = Glide.c(context).c(context).a();
                a11.Z = "https://" + goalData2.getDownloadUrl();
                a11.f5953b0 = true;
                a11.z(new ek.w(dialog3));
                View findViewById2 = dialog3.findViewById(R.id.ivClose);
                kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
                ((ImageView) findViewById2).setOnClickListener(new n(dialog3, 3));
                Window window2 = dialog3.getWindow();
                if (window2 != null) {
                    window2.setLayout(-1, -1);
                }
                dialog3.show();
                return;
            case 3:
                h1 this$04 = (h1) obj7;
                MiniCourse miniCourse = (MiniCourse) obj6;
                h1.a holder = (h1.a) obj5;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.g(miniCourse, "$miniCourse");
                kotlin.jvm.internal.i.g(holder, "$holder");
                CardView cardView = (CardView) holder.f2751a.findViewById(R.id.cardRowMiniCourses);
                kotlin.jvm.internal.i.f(cardView, "holder.itemView.cardRowMiniCourses");
                this$04.B.invoke(miniCourse, cardView);
                return;
            case 4:
                BookmarkingActivity this$05 = (BookmarkingActivity) obj7;
                String optionText = (String) obj6;
                View view2 = (View) obj5;
                int i11 = BookmarkingActivity.I;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                kotlin.jvm.internal.i.g(optionText, "$optionText");
                ArrayList<String> arrayList = this$05.B;
                if (arrayList.contains(optionText)) {
                    ((AppCompatImageView) view2.findViewById(R.id.ivBookmarkUnSaveCheckBox)).setImageResource(R.drawable.ic_check_box_outline_blank_blue_24dp);
                    ((AppCompatImageView) view2.findViewById(R.id.ivBookmarkUnSaveCheckBox)).setImageTintList(ColorStateList.valueOf(g0.a.b(this$05, R.color.title_high_contrast)));
                    arrayList.remove(optionText);
                    return;
                }
                ((AppCompatImageView) view2.findViewById(R.id.ivBookmarkUnSaveCheckBox)).setImageResource(R.drawable.ic_check_box_sea_curved);
                ((AppCompatImageView) view2.findViewById(R.id.ivBookmarkUnSaveCheckBox)).setImageTintList(null);
                arrayList.add(optionText);
                return;
            case 5:
                vk.a aVar = (vk.a) obj7;
                tk.c this$06 = (tk.c) obj6;
                View v10 = (View) obj5;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(v10, "$v");
                if (aVar != null) {
                    int i12 = tk.c.J;
                    try {
                        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_community_card_v4_pick_group, this$06.requireContext(), R.style.Theme_Dialog);
                        Window window3 = styledDialog.getWindow();
                        kotlin.jvm.internal.i.d(window3);
                        window3.getAttributes().windowAnimations = R.style.DialogSlideInAndShrinkOut;
                        View findViewById3 = styledDialog.findViewById(R.id.rvCommunitiesCardV4);
                        kotlin.jvm.internal.i.e(findViewById3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                        RecyclerView recyclerView = (RecyclerView) findViewById3;
                        recyclerView.setLayoutManager(new LinearLayoutManager(this$06.requireContext(), 1, false));
                        Context requireContext = this$06.requireContext();
                        kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                        recyclerView.setAdapter(new el.a(requireContext, aVar.a(), new tk.x(uVar, this$06, v10, styledDialog)));
                        String str12 = gk.a.f16573a;
                        Bundle bundle = new Bundle();
                        bundle.putString("variant", "variant_d");
                        bundle.putString("experiment", "comm_acquisition");
                        bundle.putString("platform", "android_app");
                        User user = FirebasePersistence.getInstance().getUser();
                        if (user != null) {
                            str = user.getCurrentCourseName();
                        } else {
                            str = null;
                        }
                        bundle.putString("domain", str);
                        User user2 = FirebasePersistence.getInstance().getUser();
                        if (user2 != null) {
                            str2 = user2.getCurrentCourseName();
                        } else {
                            str2 = null;
                        }
                        bundle.putString("course", str2);
                        bundle.putString("channel_name", this$06.f33176z);
                        if (!this$06.D.isEmpty()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        bundle.putBoolean("group_joined", z10);
                        Boolean bool = this$06.C;
                        if (bool != null) {
                            bundle.putBoolean("onboarding_completed", bool.booleanValue());
                        }
                        hs.k kVar = hs.k.f19476a;
                        gk.a.b(bundle, "comm_db_channel_modal_open");
                        styledDialog.setOnDismissListener(new tk.a(uVar, 0, this$06));
                        styledDialog.show();
                        return;
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(this$06.f33171u, "exception", e11);
                        return;
                    }
                }
                return;
            case 6:
                Animation animation = (Animation) obj7;
                V2DashboardActivity this$07 = (V2DashboardActivity) obj6;
                int i13 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                animation.setAnimationListener(new V2DashboardActivity.t((Animation) obj5));
                ((CardView) this$07.n0(R.id.cardDashboardFeedback)).startAnimation(animation);
                return;
            case 7:
                V2DashboardActivity this$08 = (V2DashboardActivity) obj7;
                CourseApiUtil courseApiUtil = (CourseApiUtil) obj6;
                int i14 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                kotlin.jvm.internal.i.g(courseApiUtil, "$courseApiUtil");
                this$08.O0().show();
                String courseName = ((Course) obj5).getCourseName();
                kotlin.jvm.internal.i.d(courseName);
                CourseApiUtil.sendCourseApiRequest$default(courseApiUtil, courseName, null, 2, null);
                return;
            case 8:
                V3DashboardActivity this$09 = (V3DashboardActivity) obj7;
                MiniCourse miniCourse2 = (MiniCourse) obj6;
                int i15 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                kotlin.jvm.internal.i.g(miniCourse2, "$miniCourse");
                Intent intent = new Intent(this$09, LibraryActivity.class);
                Bundle bundle2 = new Bundle();
                bundle2.putString("operation", "open");
                bundle2.putSerializable("mc_model", miniCourse2);
                bundle2.putSerializable("mc_meta", (MiniCourseMetadata) obj5);
                bundle2.putString("parentType", "mini_course");
                bundle2.putBoolean("finish_on_back_pressed", false);
                bundle2.putBoolean("disable_coachmark", true);
                hs.k kVar2 = hs.k.f19476a;
                this$09.f10736m1.a(intent.putExtras(bundle2));
                ApplicationPersistence.getInstance().setBooleanValue("lib_coach_mark_sc", true);
                return;
            case 9:
                V3DashboardActivity this$010 = (V3DashboardActivity) obj7;
                kotlin.jvm.internal.x courseApiUtil2 = (kotlin.jvm.internal.x) obj6;
                Course course = (Course) obj5;
                int i16 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                kotlin.jvm.internal.i.g(courseApiUtil2, "$courseApiUtil");
                ProgressDialog progressDialog = this$010.f10750w;
                if (progressDialog != null) {
                    progressDialog.show();
                    Utils.INSTANCE.cancelNotifications();
                    CourseApiUtil courseApiUtil3 = (CourseApiUtil) courseApiUtil2.f23469u;
                    if (courseApiUtil3 != null) {
                        String courseName2 = course.getCourseName();
                        kotlin.jvm.internal.i.d(courseName2);
                        CourseApiUtil.sendCourseApiRequest$default(courseApiUtil3, courseName2, null, 2, null);
                    }
                    String str13 = gk.a.f16573a;
                    Bundle bundle3 = new Bundle();
                    String courseName3 = course.getCourseName();
                    kotlin.jvm.internal.i.d(courseName3);
                    bundle3.putString("course", courseName3);
                    bundle3.putString("variant", (String) FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.ONBOARDING_EXPERIMENT));
                    bundle3.putBoolean("reset_flow", false);
                    bundle3.putString("source", "top_nav");
                    hs.k kVar3 = hs.k.f19476a;
                    gk.a.b(bundle3, "pre_domain_selection_existing");
                    return;
                }
                kotlin.jvm.internal.i.q("progressDialog");
                throw null;
            case 10:
                kotlin.jvm.internal.v score = (kotlin.jvm.internal.v) obj7;
                V3DashboardActivity this$011 = (V3DashboardActivity) obj6;
                Animation animation2 = (Animation) obj5;
                int i17 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(score, "$score");
                kotlin.jvm.internal.i.g(this$011, "this$0");
                if (score.f23467u != -1) {
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) this$011.n0(R.id.clNPSBottomSheetView1);
                    if (constraintLayout3 != null) {
                        constraintLayout3.startAnimation(animation2);
                    }
                    String str14 = gk.a.f16573a;
                    Bundle bundle4 = new Bundle();
                    defpackage.e.s(bundle4, "course", "type", "overall");
                    bundle4.putInt("rating", score.f23467u);
                    hs.k kVar4 = hs.k.f19476a;
                    gk.a.b(bundle4, "self_care_nps_submit");
                    return;
                }
                return;
            case 11:
                V3DashboardActivity this$012 = (V3DashboardActivity) obj7;
                ProviderDetailHolderModel providerDetailHolderModel = (ProviderDetailHolderModel) obj6;
                Dialog this_apply = (Dialog) obj5;
                int i18 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                this$012.f10742p1.a(new Intent(this$012, ProviderVideoActivity.class).putExtra("pro_video_url", providerDetailHolderModel.getVideoLink()).putExtra("isInAppProfileDropOffPrompt", true));
                this$012.f10740o1 = false;
                this_apply.dismiss();
                String str15 = gk.a.f16573a;
                Bundle bundle5 = new Bundle();
                if (kotlin.jvm.internal.i.b(providerDetailHolderModel.getProviderType(), "psychiatrist")) {
                    bundle5.putString("psychiatrist_name", providerDetailHolderModel.getName());
                    bundle5.putString("psychiatrist_uuid", providerDetailHolderModel.getUuid());
                } else {
                    bundle5.putString("therapist_name", providerDetailHolderModel.getName());
                    bundle5.putString("therapist_uuid", providerDetailHolderModel.getUuid());
                }
                bundle5.putString("source", "in_app_provider_video");
                String providerType = providerDetailHolderModel.getProviderType();
                if (kotlin.jvm.internal.i.b(providerType, "couplestherapist")) {
                    str3 = "couples";
                } else if (kotlin.jvm.internal.i.b(providerType, "therapist")) {
                    str3 = "therapy";
                } else {
                    str3 = "psychiatry";
                }
                User f = defpackage.b.f(bundle5, "flow", str3);
                if (f != null) {
                    str4 = f.getCurrentCourseName();
                } else {
                    str4 = null;
                }
                bundle5.putString("domain", str4);
                bundle5.putString("platform", "android_app");
                hs.k kVar5 = hs.k.f19476a;
                gk.a.b(bundle5, "therapy_psychiatry_video_click");
                return;
            case 12:
                V3DashboardActivity this$013 = (V3DashboardActivity) obj6;
                String selectedScreen = (String) obj5;
                Bundle analyticsBundle2 = (Bundle) obj7;
                int i19 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                kotlin.jvm.internal.i.g(selectedScreen, "$selectedScreen");
                kotlin.jvm.internal.i.g(analyticsBundle2, "$analyticsBundle");
                ((ConstraintLayout) this$013.n0(R.id.clSubscriptionMessaging)).setVisibility(8);
                ApplicationPersistence.getInstance().setBooleanValue(selectedScreen, true);
                gk.a.b(analyticsBundle2, "hold_message_snackbar_skip_click");
                return;
            case 13:
                kotlin.jvm.internal.v score2 = (kotlin.jvm.internal.v) obj7;
                CustomDashboardActivity this$014 = (CustomDashboardActivity) obj6;
                Animation animation3 = (Animation) obj5;
                int i20 = CustomDashboardActivity.C;
                kotlin.jvm.internal.i.g(score2, "$score");
                kotlin.jvm.internal.i.g(this$014, "this$0");
                if (score2.f23467u != -1) {
                    v.c cVar3 = this$014.A;
                    if (cVar3 != null && (cVar = (yp.c) cVar3.f34632w) != null && (constraintLayout = cVar.f38735b) != null) {
                        constraintLayout.startAnimation(animation3);
                    }
                    String str16 = gk.a.f16573a;
                    Bundle bundle6 = new Bundle();
                    defpackage.e.s(bundle6, "course", "type", "overall");
                    bundle6.putInt("rating", score2.f23467u);
                    hs.k kVar6 = hs.k.f19476a;
                    gk.a.b(bundle6, "self_care_nps_submit");
                    return;
                }
                return;
            case 14:
                kotlin.jvm.internal.v score3 = (kotlin.jvm.internal.v) obj7;
                NotV4Activity this$015 = (NotV4Activity) obj6;
                Animation animation4 = (Animation) obj5;
                int i21 = NotV4Activity.G;
                kotlin.jvm.internal.i.g(score3, "$score");
                kotlin.jvm.internal.i.g(this$015, "this$0");
                if (score3.f23467u != -1) {
                    v.c cVar4 = this$015.F;
                    if (cVar4 != null && (cVar2 = (yp.c) cVar4.f34633x) != null && (constraintLayout2 = cVar2.f38735b) != null) {
                        constraintLayout2.startAnimation(animation4);
                    }
                    String str17 = gk.a.f16573a;
                    Bundle bundle7 = new Bundle();
                    defpackage.e.s(bundle7, "course", "type", "overall");
                    bundle7.putInt("rating", score3.f23467u);
                    hs.k kVar7 = hs.k.f19476a;
                    gk.a.b(bundle7, "self_care_nps_submit");
                    return;
                }
                return;
            case 15:
                Dialog dialog4 = (Dialog) obj5;
                hl.g this$016 = (hl.g) obj7;
                FeedBackUtils feedBackUtils = (FeedBackUtils) obj6;
                int i22 = hl.g.K;
                kotlin.jvm.internal.i.g(dialog4, "$dialog");
                kotlin.jvm.internal.i.g(this$016, "this$0");
                kotlin.jvm.internal.i.g(feedBackUtils, "$feedBackUtils");
                String str18 = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "topical_remove_dialog_positive");
                dialog4.dismiss();
                if (ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p requireActivity = this$016.requireActivity();
                    String string = this$016.getString(R.string.topicalCourseEndNoteToast);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.topicalCourseEndNoteToast)");
                    utils.showCustomToast(requireActivity, string);
                    return;
                }
                feedBackUtils.showPlayStoreReviewFeedbackPopup();
                return;
            case 16:
                Dialog dialog5 = (Dialog) obj5;
                hl.s this$017 = (hl.s) obj7;
                FeedBackUtils feedBackUtils2 = (FeedBackUtils) obj6;
                int i23 = hl.s.f17728g0;
                kotlin.jvm.internal.i.g(dialog5, "$dialog");
                kotlin.jvm.internal.i.g(this$017, "this$0");
                kotlin.jvm.internal.i.g(feedBackUtils2, "$feedBackUtils");
                String str19 = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "topical_remove_dialog_positive");
                dialog5.dismiss();
                if (ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
                    Utils utils2 = Utils.INSTANCE;
                    androidx.fragment.app.p requireActivity2 = this$017.requireActivity();
                    String string2 = this$017.getString(R.string.topicalCourseEndNoteToast);
                    kotlin.jvm.internal.i.f(string2, "getString(R.string.topicalCourseEndNoteToast)");
                    utils2.showCustomToast(requireActivity2, string2);
                    return;
                }
                feedBackUtils2.showPlayStoreReviewFeedbackPopup();
                return;
            case 17:
                nd.z this$018 = (nd.z) obj7;
                Dialog dialog6 = (Dialog) obj5;
                GamificationBadgesModel badgesModel = (GamificationBadgesModel) obj6;
                kotlin.jvm.internal.i.g(this$018, "this$0");
                kotlin.jvm.internal.i.g(dialog6, "$dialog");
                kotlin.jvm.internal.i.g(badgesModel, "$badgesModel");
                this$018.g().startActivityForResult(new Intent(this$018.g(), ExperimentProfileActivity.class), this$018.g().K);
                Bundle analyticsBundle3 = UtilsKt.getAnalyticsBundle();
                analyticsBundle3.putString("gamification_id", badgesModel.getId());
                UtilsKt.fireAnalytics("dashboard_badge_show", analyticsBundle3);
                dialog6.dismiss();
                return;
            case 18:
                V3DashboardUtils this$019 = (V3DashboardUtils) obj7;
                Dialog dialog7 = (Dialog) obj5;
                GamificationBadgesModel badgesModel2 = (GamificationBadgesModel) obj6;
                kotlin.jvm.internal.i.g(this$019, "this$0");
                kotlin.jvm.internal.i.g(dialog7, "$dialog");
                kotlin.jvm.internal.i.g(badgesModel2, "$badgesModel");
                Intent intent2 = new Intent(this$019.f(), ExperimentProfileActivity.class);
                V3DashboardActivity f2 = this$019.f();
                if (f2.Q0) {
                    f2.S0 = true;
                }
                this$019.f().startActivityForResult(intent2, this$019.f().N);
                Bundle analyticsBundle4 = UtilsKt.getAnalyticsBundle();
                analyticsBundle4.putString("gamification_id", badgesModel2.getId());
                UtilsKt.fireAnalytics("dashboard_badge_show", analyticsBundle4);
                dialog7.dismiss();
                return;
            case 19:
                ol.b this$020 = (ol.b) obj7;
                View this_apply2 = (View) obj6;
                kotlin.jvm.internal.i.g(this$020, "this$0");
                kotlin.jvm.internal.i.g(this_apply2, "$this_apply");
                Context context2 = this_apply2.getContext();
                kotlin.jvm.internal.i.f(context2, "this.context");
                this$020.v(context2, (RobertoEditText) obj5);
                return;
            case 20:
                N12AScreenFragment this$021 = (N12AScreenFragment) obj7;
                View view3 = (View) obj6;
                N12AItemListModel optionItem = (N12AItemListModel) obj5;
                int i24 = N12AScreenFragment.I;
                kotlin.jvm.internal.i.g(this$021, "this$0");
                kotlin.jvm.internal.i.g(optionItem, "$optionItem");
                ArrayList<N12AItemListModel> arrayList2 = this$021.f10923y;
                Iterator<N12AItemListModel> it = arrayList2.iterator();
                int i25 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (!kotlin.jvm.internal.i.b(it.next().getId(), optionItem.getId())) {
                            i25++;
                        }
                    } else {
                        i25 = -1;
                    }
                }
                if (i25 != -1) {
                    arrayList2.remove(i25);
                    View findViewById4 = view3.findViewById(R.id.clRowN6AParentContainer);
                    if (findViewById4 != null) {
                        findViewById4.setBackgroundColor(g0.a.b(this$021.requireActivity(), R.color.white));
                        return;
                    }
                    return;
                }
                arrayList2.add(optionItem);
                View findViewById5 = view3.findViewById(R.id.clRowN6AParentContainer);
                if (findViewById5 != null) {
                    findViewById5.setBackgroundColor(g0.a.b(this$021.requireActivity(), R.color.templateMossGreen));
                    return;
                }
                return;
            case 21:
                sl.c this$022 = (sl.c) obj7;
                c.a this_apply3 = (c.a) obj6;
                TherapistPackagesModel it2 = (TherapistPackagesModel) obj5;
                kotlin.jvm.internal.i.g(this$022, "this$0");
                kotlin.jvm.internal.i.g(this_apply3, "$this_apply");
                kotlin.jvm.internal.i.g(it2, "$it");
                boolean z13 = this$022.f31653y;
                if (z13) {
                    String str20 = gk.a.f16573a;
                    Bundle f10 = defpackage.e.f("source", "app_expert_care", "flow", "therapy");
                    f10.putString("therapist_name", it2.getFirstname() + ' ' + it2.getLastname());
                    f10.putString("therapist_uuid", it2.getUuid());
                    f10.putString("platform", "android_app");
                    hs.k kVar8 = hs.k.f19476a;
                    gk.a.b(f10, "therapy_psychiatry_video_click");
                } else {
                    String str21 = gk.a.f16573a;
                    Bundle f11 = defpackage.e.f("source", "app_expert_care", "flow", "psychiatry");
                    f11.putString("psychiatrist_name", it2.getFirstname() + ' ' + it2.getLastname());
                    f11.putString("psychiatrist_uuid", it2.getUuid());
                    f11.putString("platform", "android_app");
                    hs.k kVar9 = hs.k.f19476a;
                    gk.a.b(f11, "therapy_psychiatry_video_click");
                }
                View view4 = this_apply3.f2751a;
                Context context3 = view4.getContext();
                Intent putExtra = new Intent(view4.getContext(), ProviderVideoActivity.class).putExtra("pro_video_url", it2.getVideo()).putExtra("isTherapy", z13).putExtra("isExpertCare", true);
                context3.startActivity(putExtra.putExtra("provider_name", it2.getFirstname() + ' ' + it2.getLastname()).putExtra("provider_uuid", it2.getUuid()));
                return;
            case 22:
                UpcomingBooking upcomingBooking = (UpcomingBooking) obj7;
                tl.d this$023 = (tl.d) obj6;
                zl.b sessionInfo = (zl.b) obj5;
                int i26 = tl.d.R;
                kotlin.jvm.internal.i.g(this$023, "this$0");
                kotlin.jvm.internal.i.g(sessionInfo, "$sessionInfo");
                StringBuilder sb2 = new StringBuilder("http://maps.google.com/maps?q=loc:");
                OfflineClinicDetail clinicDetails = upcomingBooking.getClinicDetails();
                if (clinicDetails != null) {
                    str5 = clinicDetails.getGeoLat();
                } else {
                    str5 = null;
                }
                sb2.append(str5);
                sb2.append(',');
                OfflineClinicDetail clinicDetails2 = upcomingBooking.getClinicDetails();
                if (clinicDetails2 != null) {
                    str6 = clinicDetails2.getGeoLong();
                } else {
                    str6 = null;
                }
                sb2.append(str6);
                this$023.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb2.toString())));
                String str22 = gk.a.f16573a;
                Bundle bundle8 = new Bundle();
                bundle8.putString("source", this$023.U());
                hs.f Y = tl.d.Y(this$023, sessionInfo, null, 2);
                hs.f fVar = (hs.f) Y.f19464u;
                bundle8.putString((String) fVar.f19464u, (String) fVar.f19465v);
                hs.f fVar2 = (hs.f) Y.f19465v;
                bundle8.putString((String) fVar2.f19464u, (String) fVar2.f19465v);
                bundle8.putString("flow", tl.d.X(this$023, sessionInfo, null, 2));
                OfflineClinicDetail clinicDetails3 = upcomingBooking.getClinicDetails();
                if (clinicDetails3 != null) {
                    str7 = clinicDetails3.getName();
                } else {
                    str7 = null;
                }
                bundle8.putString("center_name", str7);
                OfflineClinicDetail clinicDetails4 = upcomingBooking.getClinicDetails();
                if (clinicDetails4 != null && (locationDetail = clinicDetails4.getLocationDetail()) != null) {
                    str8 = locationDetail.getCity();
                } else {
                    str8 = null;
                }
                bundle8.putString("center_location", str8);
                OfflineClinicDetail clinicDetails5 = upcomingBooking.getClinicDetails();
                if (clinicDetails5 != null) {
                    bundle8.putInt("clinic_id", clinicDetails5.getId());
                }
                hs.k kVar10 = hs.k.f19476a;
                gk.a.b(bundle8, "offline_map_click");
                return;
            case 23:
                b.d this_with = (b.d) obj7;
                bm.b this$024 = (bm.b) obj6;
                FirestoreGoal goal = (FirestoreGoal) obj5;
                kotlin.jvm.internal.i.g(this_with, "$this_with");
                kotlin.jvm.internal.i.g(this$024, "this$0");
                kotlin.jvm.internal.i.g(goal, "$goal");
                Extensions extensions = Extensions.INSTANCE;
                yp.n nVar = this_with.f4411u;
                ProgressBar progressBar = nVar.f38877d;
                kotlin.jvm.internal.i.f(progressBar, "binding.pbRowGoalProgress");
                extensions.visible(progressBar);
                AppCompatImageView appCompatImageView = nVar.f38875b;
                kotlin.jvm.internal.i.f(appCompatImageView, "binding.ivRowGoalCheckMark");
                extensions.gone(appCompatImageView);
                this$024.f4408z.c(goal);
                return;
            case 24:
                d.c this_with2 = (d.c) obj7;
                bm.d this$025 = (bm.d) obj6;
                FirestoreGoal goal2 = (FirestoreGoal) obj5;
                kotlin.jvm.internal.i.g(this_with2, "$this_with");
                kotlin.jvm.internal.i.g(this$025, "this$0");
                kotlin.jvm.internal.i.g(goal2, "$goal");
                Extensions extensions2 = Extensions.INSTANCE;
                yp.n nVar2 = this_with2.f4434u;
                ProgressBar progressBar2 = nVar2.f38877d;
                kotlin.jvm.internal.i.f(progressBar2, "binding.pbRowGoalProgress");
                extensions2.visible(progressBar2);
                AppCompatImageView appCompatImageView2 = nVar2.f38875b;
                kotlin.jvm.internal.i.f(appCompatImageView2, "binding.ivRowGoalCheckMark");
                extensions2.gone(appCompatImageView2);
                this$025.A.c(goal2);
                return;
            case 25:
                JournalParentActivity this$026 = (JournalParentActivity) obj7;
                Integer num = (Integer) obj6;
                Dialog templateChangeDialog = (Dialog) obj5;
                int i27 = JournalParentActivity.C;
                kotlin.jvm.internal.i.g(this$026, "this$0");
                kotlin.jvm.internal.i.g(templateChangeDialog, "$templateChangeDialog");
                tm.e eVar = this$026.f11217v;
                if (eVar != null) {
                    ta.v.H(kc.f.H(eVar), null, 0, new tm.c(eVar, null), 3);
                }
                if (num != null) {
                    this$026.y0(num.intValue());
                } else {
                    Intent intent3 = new Intent();
                    intent3.putExtra("draftEntrySavedInCurrSession", this$026.f11221z);
                    hs.k kVar11 = hs.k.f19476a;
                    this$026.setResult(0, intent3);
                    this$026.finish();
                }
                templateChangeDialog.dismiss();
                return;
            case 26:
                h.a holder2 = (h.a) obj7;
                mm.h this$027 = (mm.h) obj6;
                hs.f tempN5AItemListModel = (hs.f) obj5;
                kotlin.jvm.internal.i.g(holder2, "$holder");
                kotlin.jvm.internal.i.g(this$027, "this$0");
                kotlin.jvm.internal.i.g(tempN5AItemListModel, "$tempN5AItemListModel");
                View view5 = holder2.f2751a;
                if (((MotionLayout) view5.findViewById(R.id.mlJTAParentContainer)).getProgress() == 1.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    ((AppCompatImageView) view5.findViewById(R.id.ivJTAScreenRowArrow)).startAnimation(Utils.INSTANCE.rotateBy180(0.0f, 180.0f));
                    ((MotionLayout) view5.findViewById(R.id.mlJTAParentContainer)).m(0.0f);
                    return;
                }
                ((AppCompatImageView) view5.findViewById(R.id.ivJTAScreenRowArrow)).startAnimation(Utils.INSTANCE.rotateBy180(180.0f, 360.0f));
                ((MotionLayout) view5.findViewById(R.id.mlJTAParentContainer)).A();
                this$027.A.invoke(tempN5AItemListModel.f19464u);
                return;
            case 27:
                JournalThoughtThinkingItemListModel journalThoughtThinkingItemListModel = (JournalThoughtThinkingItemListModel) obj7;
                i.a holder3 = (i.a) obj6;
                mm.i this$028 = (mm.i) obj5;
                kotlin.jvm.internal.i.g(holder3, "$holder");
                kotlin.jvm.internal.i.g(this$028, "this$0");
                if (journalThoughtThinkingItemListModel != null) {
                    journalThoughtThinkingItemListModel.setExpanded(!journalThoughtThinkingItemListModel.isExpanded());
                }
                View view6 = holder3.f2751a;
                if (((MotionLayout) view6.findViewById(R.id.mlJournalThoughtThinkingParentContainer)).getProgress() == 1.0f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    ((MotionLayout) view6.findViewById(R.id.mlJournalThoughtThinkingParentContainer)).m(0.0f);
                    return;
                }
                ((MotionLayout) view6.findViewById(R.id.mlJournalThoughtThinkingParentContainer)).A();
                this$028.B.invoke(journalThoughtThinkingItemListModel);
                return;
            case 28:
                LearningHubArticleExperimentActivity this$029 = (LearningHubArticleExperimentActivity) obj7;
                LearningHubFieldModel tt2 = (LearningHubFieldModel) obj6;
                ArrayList values = (ArrayList) obj5;
                int i28 = LearningHubArticleExperimentActivity.I;
                kotlin.jvm.internal.i.g(this$029, "this$0");
                kotlin.jvm.internal.i.g(tt2, "$tt");
                kotlin.jvm.internal.i.g(values, "$values");
                Intent intent4 = new Intent(this$029, LearningHubExperimentVideoActivity.class);
                Object value = tt2.getValue();
                if (value instanceof String) {
                    str9 = (String) value;
                } else {
                    str9 = null;
                }
                if (str9 == null) {
                    str9 = "";
                }
                Intent putExtra2 = intent4.putExtra(Constants.NOTIFICATION_URL, str9);
                Iterator it3 = values.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj = it3.next();
                        if (kotlin.jvm.internal.i.b(((LearningHubFieldModel) obj).getData_title(), "thumbnail")) {
                        }
                    } else {
                        obj = null;
                    }
                }
                LearningHubFieldModel learningHubFieldModel = (LearningHubFieldModel) obj;
                if (learningHubFieldModel != null) {
                    obj2 = learningHubFieldModel.getValue();
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str10 = (String) obj2;
                } else {
                    str10 = null;
                }
                Intent putExtra3 = putExtra2.putExtra("thumbnail", str10);
                Iterator it4 = values.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj3 = it4.next();
                        if (kotlin.jvm.internal.i.b(((LearningHubFieldModel) obj3).getData_title(), "title")) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                LearningHubFieldModel learningHubFieldModel2 = (LearningHubFieldModel) obj3;
                if (learningHubFieldModel2 != null) {
                    obj4 = learningHubFieldModel2.getValue();
                } else {
                    obj4 = null;
                }
                if (obj4 instanceof String) {
                    str11 = (String) obj4;
                } else {
                    str11 = null;
                }
                this$029.startActivity(putExtra3.putExtra("post_name", str11).putExtra("post_id", this$029.q0().getId()));
                return;
            default:
                a();
                return;
        }
    }

    public /* synthetic */ t(Dialog dialog, Fragment fragment, FeedBackUtils feedBackUtils, int i6) {
        this.f12953u = i6;
        this.f12956x = dialog;
        this.f12954v = fragment;
        this.f12955w = feedBackUtils;
    }

    public /* synthetic */ t(V3DashboardActivity v3DashboardActivity, String str, Bundle bundle) {
        this.f12953u = 12;
        this.f12955w = v3DashboardActivity;
        this.f12956x = str;
        this.f12954v = bundle;
    }

    public /* synthetic */ t(Object obj, Dialog dialog, GamificationBadgesModel gamificationBadgesModel, int i6) {
        this.f12953u = i6;
        this.f12954v = obj;
        this.f12956x = dialog;
        this.f12955w = gamificationBadgesModel;
    }
}
