package vo;

import android.text.TextUtils;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import hc.d;
import kotlin.jvm.internal.i;
/* compiled from: ExperimentProfileUtils.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public ExperimentProfileActivity f35293b;

    /* renamed from: a  reason: collision with root package name */
    public final String f35292a = LogHelper.INSTANCE.makeLogTag(b.class);

    /* renamed from: c  reason: collision with root package name */
    public final d f35294c = new d();

    public final String a(CourseDayModelV1 dayModelV1, String course) {
        i.g(course, "course");
        i.g(dayModelV1, "dayModelV1");
        if (!TextUtils.isEmpty(course)) {
            String symptom = dayModelV1.getSymptom();
            i.d(symptom);
            this.f35294c.getClass();
            Integer Z = d.Z(course, symptom);
            if (Z != null) {
                ExperimentProfileActivity experimentProfileActivity = this.f35293b;
                if (experimentProfileActivity != null) {
                    String string = experimentProfileActivity.getString(Z.intValue());
                    i.f(string, "activity.getString(symptomTagId)");
                    return string;
                }
                i.q(Constants.SCREEN_ACTIVITY);
                throw null;
            }
            String symptom2 = dayModelV1.getSymptom();
            i.d(symptom2);
            return symptom2;
        }
        return "";
    }
}
