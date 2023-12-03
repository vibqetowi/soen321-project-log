package an;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import cn.j0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.CourseDayModelV1;
/* compiled from: LibraryShortCourseDetailFragment.kt */
/* loaded from: classes2.dex */
public final class f0 extends kotlin.jvm.internal.k implements ss.p<CourseDayModelV1, Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d0 f709u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(d0 d0Var) {
        super(2);
        this.f709u = d0Var;
    }

    @Override // ss.p
    public final hs.k invoke(CourseDayModelV1 courseDayModelV1, Boolean bool) {
        String domain;
        boolean z10;
        int i6;
        String str;
        Boolean isFree;
        CourseDayModelV1 dayModel = courseDayModelV1;
        Boolean bool2 = bool;
        kotlin.jvm.internal.i.g(dayModel, "dayModel");
        d0 d0Var = this.f709u;
        if (d0Var.A != null && (domain = d0Var.K().getDomain()) != null && bool2 != null) {
            j0 j0Var = d0Var.A;
            if (j0Var != null) {
                String content_id = dayModel.getContent_id();
                String content_label = dayModel.getContent_label();
                kotlin.jvm.internal.i.d(content_label);
                boolean booleanValue = bool2.booleanValue();
                if (d0Var.f690w != null && (isFree = d0Var.J().isFree()) != null) {
                    z10 = isFree.booleanValue();
                } else {
                    z10 = true;
                }
                if (content_id != null) {
                    ta.v.H(kc.f.H(j0Var), null, 0, new cn.a0(j0Var, content_id, content_label, booleanValue, domain, z10, null), 3);
                }
                Context requireContext = d0Var.requireContext();
                if (bool2.booleanValue()) {
                    i6 = R.string.notV4BookmarkSavedToast;
                } else {
                    i6 = R.string.notV4BookmarkUnsavedToast;
                }
                Toast.makeText(requireContext, d0Var.getString(i6), 0).show();
                String str2 = gk.a.f16573a;
                if (bool2.booleanValue()) {
                    str = "lib_course_inside_activity_bookmark";
                } else {
                    str = "lib_course_inside_activity_bookmark_un";
                }
                Bundle bundle = new Bundle();
                bundle.putString("miniCourse", d0Var.J().getName());
                bundle.putString("miniCourse_chip", d0Var.D);
                bundle.putInt("miniCourse_position_in_list", d0Var.F);
                bundle.putInt("miniCourse_progress", d0Var.E);
                bundle.putString("source", "lib_short_course");
                bundle.putBoolean("paid_miniCourse", d0Var.C);
                bundle.putBoolean("isTopicalCourse", d0Var.B);
                bundle.putString("activity_id", dayModel.getContent_id());
                bundle.putString("status_of_activity_when_clicked", d0Var.I);
                bundle.putInt("activity_position", d0Var.F);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, str);
            } else {
                kotlin.jvm.internal.i.q("libraryShortCoursesViewModel");
                throw null;
            }
        }
        return hs.k.f19476a;
    }
}
