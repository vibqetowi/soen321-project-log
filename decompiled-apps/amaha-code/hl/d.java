package hl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f17663u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ g f17664v;

    public /* synthetic */ d(g gVar, int i6) {
        this.f17663u = i6;
        this.f17664v = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f17663u;
        g this$0 = this.f17664v;
        switch (i6) {
            case 0:
                int i10 = g.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (((LinearLayoutCompat) this$0._$_findCachedViewById(R.id.llCoursePickerLayout)).getVisibility() == 0) {
                    this$0.U();
                    return;
                }
                return;
            case 1:
                int i11 = g.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                analyticsBundle.putString("source", "db_card");
                UtilsKt.fireAnalytics("dashboard_lib_explore_click", analyticsBundle);
                this$0.startActivity(new Intent(this$0.requireActivity(), LibraryActivity.class));
                return;
            case 2:
                int i12 = g.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                User user = firebasePersistence.getUser();
                if (user != null) {
                    user.setCurrentCourseName(Constants.COURSE_ADHD);
                }
                User user2 = firebasePersistence.getUser();
                if (user2 != null) {
                    user2.setCurrentCourse(UtilsKt.getCourseId(Constants.COURSE_ADHD));
                }
                firebasePersistence.updateUserOnFirebase();
                this$0.F();
                String str = gk.a.f16573a;
                Bundle a10 = r1.b0.a("course", Constants.COURSE_ADHD);
                a10.putString("variant", (String) ri.e.d(Constants.ONBOARDING_EXPERIMENT));
                a10.putBoolean("reset_flow", false);
                a10.putString("source", "top_nav");
                hs.k kVar = hs.k.f19476a;
                gk.a.b(a10, "pre_domain_selection_existing");
                return;
            case 3:
                int i13 = g.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                FirebasePersistence firebasePersistence2 = FirebasePersistence.getInstance();
                User user3 = firebasePersistence2.getUser();
                if (user3 != null) {
                    user3.setCurrentCourseName(Constants.COURSE_OCD);
                }
                User user4 = firebasePersistence2.getUser();
                if (user4 != null) {
                    user4.setCurrentCourse(UtilsKt.getCourseId(Constants.COURSE_OCD));
                }
                firebasePersistence2.updateUserOnFirebase();
                this$0.F();
                String str2 = gk.a.f16573a;
                Bundle a11 = r1.b0.a("course", Constants.COURSE_OCD);
                a11.putString("variant", (String) ri.e.d(Constants.ONBOARDING_EXPERIMENT));
                a11.putBoolean("reset_flow", false);
                a11.putString("source", "top_nav");
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(a11, "pre_domain_selection_existing");
                return;
            case 4:
                int i14 = g.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                FirebasePersistence firebasePersistence3 = FirebasePersistence.getInstance();
                User user5 = firebasePersistence3.getUser();
                if (user5 != null) {
                    user5.setCurrentCourseName(Constants.COURSE_GENERIC);
                }
                User user6 = firebasePersistence3.getUser();
                if (user6 != null) {
                    user6.setCurrentCourse(UtilsKt.getCourseId(Constants.COURSE_GENERIC));
                }
                firebasePersistence3.updateUserOnFirebase();
                this$0.F();
                String str3 = gk.a.f16573a;
                Bundle a12 = r1.b0.a("course", Constants.COURSE_GENERIC);
                a12.putString("variant", (String) ri.e.d(Constants.ONBOARDING_EXPERIMENT));
                a12.putBoolean("reset_flow", false);
                a12.putString("source", "top_nav");
                hs.k kVar3 = hs.k.f19476a;
                gk.a.b(a12, "pre_domain_selection_existing");
                return;
            default:
                int i15 = g.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                    androidx.fragment.app.p requireActivity = this$0.requireActivity();
                    kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                    this$0.startActivity(tr.r.r(requireActivity).putExtra("source", "top_nav"));
                    this$0.requireActivity().finish();
                    return;
                }
                return;
        }
    }
}
