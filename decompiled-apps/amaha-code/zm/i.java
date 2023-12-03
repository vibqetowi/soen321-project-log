package zm;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import zm.j;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ ArrayList A;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f39655u = 0;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ j f39656v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ MiniCourseMetadata f39657w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ MiniCourse f39658x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f39659y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ j.a f39660z;

    public /* synthetic */ i(j.a aVar, MiniCourseMetadata miniCourseMetadata, int i6, j jVar, ArrayList arrayList, MiniCourse miniCourse) {
        this.f39660z = aVar;
        this.f39657w = miniCourseMetadata;
        this.f39659y = i6;
        this.f39656v = jVar;
        this.A = arrayList;
        this.f39658x = miniCourse;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        Boolean isFree;
        boolean z11;
        String str;
        Boolean isFree2;
        int i6 = this.f39655u;
        MiniCourse miniCourse = this.f39658x;
        ArrayList<CourseDayModelV1> arrayList = this.A;
        int i10 = this.f39659y;
        String str2 = null;
        MiniCourseMetadata miniCourseMetadata = this.f39657w;
        j this$0 = this.f39656v;
        j.a holder = this.f39660z;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(holder, "$holder");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Bundle bundle = new Bundle();
                if (miniCourseMetadata != null) {
                    str2 = miniCourseMetadata.getName();
                }
                bundle.putString("miniCourse", str2);
                bundle.putInt("miniCourse_position_in_list", i10);
                bundle.putString("source_of_action", this$0.f39661x);
                kotlin.jvm.internal.i.e(arrayList, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?> }");
                bundle.putInt("miniCourse_progress", this$0.v(arrayList));
                bundle.putString("miniCourse_chip", this$0.f39662y);
                if (miniCourseMetadata != null && (isFree = miniCourseMetadata.isFree()) != null) {
                    bundle.putBoolean("paid_miniCourse", !isFree.booleanValue());
                }
                bundle.putBoolean("isTopicalCourse", kotlin.jvm.internal.i.b(miniCourse.getCourse(), Constants.COURSE_GENERIC));
                View view2 = holder.f2751a;
                if (((MotionLayout) view2.findViewById(R.id.clRowScContainer)).getProgress() == 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((MotionLayout) view2.findViewById(R.id.clRowScContainer)).m(0.0f);
                    gk.a.b(bundle, "lib_course_card_collapse");
                    return;
                }
                gk.a.b(bundle, "lib_course_card_expand");
                ((MotionLayout) view2.findViewById(R.id.clRowScContainer)).A();
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(holder, "$holder");
                String str3 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                if (miniCourseMetadata != null) {
                    str2 = miniCourseMetadata.getName();
                }
                bundle2.putString("miniCourse", str2);
                bundle2.putInt("miniCourse_position_in_list", i10);
                if (((MotionLayout) holder.f2751a.findViewById(R.id.clRowScContainer)).getProgress() == 1.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    str = "expanded";
                } else {
                    str = "collapsed";
                }
                bundle2.putString("chevron_status", str);
                bundle2.putString("source_of_action", this$0.f39661x);
                kotlin.jvm.internal.i.e(arrayList, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.CourseDayModelV1?> }");
                bundle2.putInt("miniCourse_progress", this$0.v(arrayList));
                bundle2.putString("miniCourse_chip", this$0.f39662y);
                if (miniCourseMetadata != null && (isFree2 = miniCourseMetadata.isFree()) != null) {
                    bundle2.putBoolean("paid_miniCourse", !isFree2.booleanValue());
                }
                bundle2.putBoolean("isTopicalCourse", kotlin.jvm.internal.i.b(miniCourse.getCourse(), Constants.COURSE_GENERIC));
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle2, "lib_course_card_cta_click");
                this$0.f39663z.r(miniCourseMetadata, miniCourse, this$0.f39662y, Integer.valueOf(i10));
                return;
        }
    }

    public /* synthetic */ i(j jVar, MiniCourseMetadata miniCourseMetadata, MiniCourse miniCourse, int i6, j.a aVar, ArrayList arrayList) {
        this.f39656v = jVar;
        this.f39657w = miniCourseMetadata;
        this.f39658x = miniCourse;
        this.f39659y = i6;
        this.f39660z = aVar;
        this.A = arrayList;
    }
}
