package tp;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.topicalcourses.activity.TopicalCourseActivity;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.MiniCourseUtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
/* compiled from: TopicalCourseActivity.kt */
/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ TopicalCourseActivity f33406u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TopicalCourseActivity topicalCourseActivity) {
        super(0);
        this.f33406u = topicalCourseActivity;
    }

    @Override // ss.a
    public final hs.k invoke() {
        TopicalCourseActivity topicalCourseActivity = this.f33406u;
        if (!n.B0(topicalCourseActivity.A)) {
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            if (!applicationPersistence.getBooleanValue(topicalCourseActivity.A + "_welcome_dialog_hide", false)) {
                MiniCourse miniCourse = topicalCourseActivity.f11670z;
                kotlin.jvm.internal.i.d(miniCourse);
                if (MiniCourseUtilsKt.getMiniCourseProgress(miniCourse) == 0) {
                    ((ConstraintLayout) topicalCourseActivity.u0(R.id.topicalCourseWelcomeScreen)).setVisibility(0);
                    View inflate = topicalCourseActivity.getLayoutInflater().inflate(R.layout.layout_topical_course_welcome, (ViewGroup) ((ConstraintLayout) topicalCourseActivity.u0(R.id.topicalCourseWelcomeScreen)), false);
                    ((ConstraintLayout) topicalCourseActivity.u0(R.id.topicalCourseWelcomeScreen)).addView(inflate);
                    String str = topicalCourseActivity.A;
                    switch (str.hashCode()) {
                        case -1552422584:
                            if (str.equals(Constants.TOPICAL_2022_TIME_MANAGEMENT)) {
                                ((AppCompatImageView) pl.a.d(topicalCourseActivity, R.string.topical2022TimeManagementSubtitle, (RobertoTextView) pl.a.d(topicalCourseActivity, R.string.topical2022TimeManagementTitle, (RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeTitle), inflate, R.id.topicalCourseWelcomeSubtitle), inflate, R.id.topicalCourseWelcomeImg1)).setImageResource(R.drawable.ir_2022_topical_time_management_1);
                                ((AppCompatImageView) pl.a.d(topicalCourseActivity, R.string.topical2022TimeManagementWelcome1, (RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeImgSubtitle1), inflate, R.id.topicalCourseWelcomeImg2)).setImageResource(R.drawable.ir_2022_topical_time_management_2);
                                ((AppCompatImageView) pl.a.d(topicalCourseActivity, R.string.topical2022TimeManagementWelcome2, (RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeImgSubtitle2), inflate, R.id.topicalCourseWelcomeImg3)).setImageResource(R.drawable.ir_2022_topical_time_management_3);
                                ((RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeImgSubtitle3)).setText(topicalCourseActivity.getString(R.string.topical2022TimeManagementWelcome3));
                                break;
                            }
                            break;
                        case -1190562844:
                            if (str.equals(Constants.TOPICAL_2022_HEALTH_ANXIETY)) {
                                ((AppCompatImageView) pl.a.d(topicalCourseActivity, R.string.topicalHealthAnxietySubtitle, (RobertoTextView) pl.a.d(topicalCourseActivity, R.string.topicalHealthAnxietyTitle, (RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeTitle), inflate, R.id.topicalCourseWelcomeSubtitle), inflate, R.id.topicalCourseWelcomeImg1)).setImageResource(R.drawable.ir_2022_topical_health_anxiety_welcome_1);
                                ((AppCompatImageView) pl.a.d(topicalCourseActivity, R.string.topicalHealthAnxietyWelcome1, (RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeImgSubtitle1), inflate, R.id.topicalCourseWelcomeImg2)).setImageResource(R.drawable.ir_2022_topical_health_anxiety_welcome_2);
                                ((AppCompatImageView) pl.a.d(topicalCourseActivity, R.string.topicalHealthAnxietyWelcome2, (RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeImgSubtitle2), inflate, R.id.topicalCourseWelcomeImg3)).setImageResource(R.drawable.ir_2022_topical_health_anxiety_welcome_3);
                                ((RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeImgSubtitle3)).setText(topicalCourseActivity.getString(R.string.topicalHealthAnxietyWelcome3));
                                break;
                            }
                            break;
                        case 58855846:
                            if (str.equals(Constants.TOPICAL_2022_COVID)) {
                                ((AppCompatImageView) pl.a.d(topicalCourseActivity, R.string.topical2022CovidSubtitle, (RobertoTextView) pl.a.d(topicalCourseActivity, R.string.topical2022CovidTitle, (RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeTitle), inflate, R.id.topicalCourseWelcomeSubtitle), inflate, R.id.topicalCourseWelcomeImg1)).setImageResource(R.drawable.ir_2022_topical_covid_welcome_1);
                                ((AppCompatImageView) pl.a.d(topicalCourseActivity, R.string.topical2022CovidWelcome1, (RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeImgSubtitle1), inflate, R.id.topicalCourseWelcomeImg2)).setImageResource(R.drawable.ir_2022_topical_covid_welcome_2);
                                ((AppCompatImageView) pl.a.d(topicalCourseActivity, R.string.topical2022CovidWelcome2, (RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeImgSubtitle2), inflate, R.id.topicalCourseWelcomeImg3)).setImageResource(R.drawable.ir_2022_topical_covid_welcome_3);
                                ((RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeImgSubtitle3)).setText(topicalCourseActivity.getString(R.string.topical2022CovidWelcome3));
                                break;
                            }
                            break;
                        case 378061269:
                            if (str.equals(Constants.TOPICAL_2022_MOTIVATION)) {
                                ((AppCompatImageView) pl.a.d(topicalCourseActivity, R.string.topical2022MotivationSubtitle, (RobertoTextView) pl.a.d(topicalCourseActivity, R.string.topical2022MotivationTitle, (RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeTitle), inflate, R.id.topicalCourseWelcomeSubtitle), inflate, R.id.topicalCourseWelcomeImg1)).setImageResource(R.drawable.ir_2022_topical_motivation_welcome_1);
                                ((AppCompatImageView) pl.a.d(topicalCourseActivity, R.string.topical2022MotivationWelcome1, (RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeImgSubtitle1), inflate, R.id.topicalCourseWelcomeImg2)).setImageResource(R.drawable.ir_2022_topical_motivation_welcome_2);
                                ((AppCompatImageView) pl.a.d(topicalCourseActivity, R.string.topical2022MotivationWelcome2, (RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeImgSubtitle2), inflate, R.id.topicalCourseWelcomeImg3)).setImageResource(R.drawable.ir_2022_topical_motivation_welcome_3);
                                ((RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeImgSubtitle3)).setText(topicalCourseActivity.getString(R.string.topical2022MotivationWelcome3));
                                break;
                            }
                            break;
                        case 416780353:
                            if (str.equals(Constants.TOPICAL_2022_NURTURING_RELATIONSHIP)) {
                                ((AppCompatImageView) pl.a.d(topicalCourseActivity, R.string.topical2022NurturingRelationshipsSubtitle, (RobertoTextView) pl.a.d(topicalCourseActivity, R.string.topical2022NurturingRelationshipsTitle, (RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeTitle), inflate, R.id.topicalCourseWelcomeSubtitle), inflate, R.id.topicalCourseWelcomeImg1)).setImageResource(R.drawable.ir_2022_topical_nurturing_relationship_1);
                                ((AppCompatImageView) pl.a.d(topicalCourseActivity, R.string.topical2022NurturingRelationshipsWelcome1, (RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeImgSubtitle1), inflate, R.id.topicalCourseWelcomeImg2)).setImageResource(R.drawable.ir_2022_topical_nurturing_relationship_2);
                                ((AppCompatImageView) pl.a.d(topicalCourseActivity, R.string.topical2022NurturingRelationshipsWelcome2, (RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeImgSubtitle2), inflate, R.id.topicalCourseWelcomeImg3)).setImageResource(R.drawable.ir_2022_topical_nurturing_relationship_3);
                                ((RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeImgSubtitle3)).setText(topicalCourseActivity.getString(R.string.topical2022NurturingRelationshipsWelcome3));
                                break;
                            }
                            break;
                        case 1196421508:
                            if (str.equals(Constants.TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY)) {
                                ((AppCompatImageView) pl.a.d(topicalCourseActivity, R.string.topical2022ConflictEmpathySubtitle, (RobertoTextView) pl.a.d(topicalCourseActivity, R.string.topical2022ConflictEmpathyTitle, (RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeTitle), inflate, R.id.topicalCourseWelcomeSubtitle), inflate, R.id.topicalCourseWelcomeImg1)).setImageResource(R.drawable.ir_2022_topical_conflict_empathy_1);
                                ((AppCompatImageView) pl.a.d(topicalCourseActivity, R.string.topical2022ConflictEmpathyWelcome1, (RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeImgSubtitle1), inflate, R.id.topicalCourseWelcomeImg2)).setImageResource(R.drawable.ir_2022_topical_conflict_empathy_2);
                                ((AppCompatImageView) pl.a.d(topicalCourseActivity, R.string.topical2022ConflictEmpathyWelcome2, (RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeImgSubtitle2), inflate, R.id.topicalCourseWelcomeImg3)).setImageResource(R.drawable.ir_2022_topical_conflict_empathy_3);
                                ((RobertoTextView) inflate.findViewById(R.id.topicalCourseWelcomeImgSubtitle3)).setText(topicalCourseActivity.getString(R.string.topical2022ConflictEmpathyWelcome3));
                                break;
                            }
                            break;
                    }
                    ((RobertoButton) inflate.findViewById(R.id.topicalWelcomeBtnCTA)).setOnClickListener(new c(topicalCourseActivity, 3));
                }
            }
            ((ConstraintLayout) topicalCourseActivity.u0(R.id.topicalCourseWelcomeScreen)).setVisibility(8);
            ((ConstraintLayout) topicalCourseActivity.u0(R.id.topicalBottomShareLayout)).setVisibility(0);
        }
        return hs.k.f19476a;
    }
}
