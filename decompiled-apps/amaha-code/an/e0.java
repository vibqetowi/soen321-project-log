package an;

import android.animation.AnimatorSet;
import android.content.Intent;
import android.os.Bundle;
import cn.j0;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import java.util.Calendar;
/* compiled from: LibraryShortCourseDetailFragment.kt */
/* loaded from: classes2.dex */
public final class e0 extends kotlin.jvm.internal.k implements ss.p<CourseDayModelV1, Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d0 f699u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(d0 d0Var) {
        super(2);
        this.f699u = d0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0148 A[Catch: Exception -> 0x014f, TRY_LEAVE, TryCatch #0 {Exception -> 0x014f, blocks: (B:3:0x0011, B:5:0x0039, B:8:0x004a, B:42:0x0144, B:44:0x0148, B:9:0x004f, B:16:0x0067, B:18:0x00cd, B:20:0x00d3, B:21:0x00d8, B:23:0x00e9, B:25:0x00f3, B:27:0x00f9, B:29:0x00fe, B:31:0x0111, B:33:0x011b, B:39:0x0136, B:40:0x013e, B:41:0x0143, B:12:0x0058, B:36:0x0123), top: B:50:0x0011, inners: #1 }] */
    @Override // ss.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs.k invoke(CourseDayModelV1 courseDayModelV1, Integer num) {
        String str;
        String domain;
        String content_id;
        boolean z10;
        Boolean isFree;
        AnimatorSet animatorSet;
        CourseDayModelV1 dayModel = courseDayModelV1;
        int intValue = num.intValue();
        d0 d0Var = this.f699u;
        kotlin.jvm.internal.i.g(dayModel, "dayModel");
        try {
            d0Var.f691x = intValue;
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            String domain2 = d0Var.K().getDomain();
            kotlin.jvm.internal.i.d(domain2);
            applicationPersistence.setLongValue(domain2.concat("_mc_time"), Calendar.getInstance().getTimeInMillis());
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(d0Var.f688u, e10);
        }
        if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && !kotlin.jvm.internal.i.b(d0Var.J().isFree(), Boolean.TRUE)) {
            d0.F(d0Var);
            animatorSet = d0Var.H;
            if (animatorSet != null) {
                animatorSet.end();
                animatorSet.removeAllListeners();
            }
            return hs.k.f19476a;
        }
        if (dayModel.isCompleted()) {
            str = "completed";
        } else if (dayModel.getStart_date() != 0) {
            str = "incomplete";
        } else {
            str = "not_started";
        }
        d0Var.I = str;
        String str2 = gk.a.f16573a;
        Bundle bundle = new Bundle();
        bundle.putString("miniCourse", d0Var.J().getName());
        bundle.putString("miniCourse_chip", d0Var.D);
        bundle.putInt("miniCourse_position_in_list", intValue);
        bundle.putInt("miniCourse_progress", d0Var.E);
        bundle.putString("source", "lib_short_course");
        bundle.putBoolean("paid_miniCourse", d0Var.C);
        bundle.putBoolean("isTopicalCourse", d0Var.B);
        bundle.putString("activity_id", dayModel.getContent_id());
        bundle.putString("status_of_activity_when_clicked", d0Var.I);
        bundle.putInt("activity_position", intValue);
        hs.k kVar = hs.k.f19476a;
        gk.a.b(bundle, "lib_course_inside_activity_click");
        if (Utils.INSTANCE.checkConnectivity(d0Var.requireActivity())) {
            Intent M = d0Var.M(dayModel);
            if (M != null) {
                d0Var.K.a(M);
            }
            d0Var.f693z.b(d0Var.K().getDomain());
            if (d0Var.A != null && (domain = d0Var.K().getDomain()) != null && (content_id = dayModel.getContent_id()) != null) {
                j0 j0Var = d0Var.A;
                if (j0Var != null) {
                    String content_label = dayModel.getContent_label();
                    kotlin.jvm.internal.i.d(content_label);
                    long timeInMillis = Calendar.getInstance().getTimeInMillis();
                    if (d0Var.f690w != null && (isFree = d0Var.J().isFree()) != null) {
                        z10 = isFree.booleanValue();
                    } else {
                        z10 = true;
                    }
                    try {
                        ta.v.H(kc.f.H(j0Var), null, 0, new cn.z(j0Var, content_id, content_label, timeInMillis, domain, z10, null), 3);
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(j0Var.f5582y, e11);
                    }
                } else {
                    kotlin.jvm.internal.i.q("libraryShortCoursesViewModel");
                    throw null;
                }
            }
        }
        animatorSet = d0Var.H;
        if (animatorSet != null) {
        }
        return hs.k.f19476a;
    }
}
