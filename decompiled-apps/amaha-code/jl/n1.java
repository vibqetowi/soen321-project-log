package jl;

import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: NotV4DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$setCourseDay$1", f = "NotV4DashboardViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public n1(ls.d<? super n1> dVar) {
        super(2, dVar);
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new n1(dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return new n1(dVar).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String str;
        sp.b.d0(obj);
        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            str = user.getCurrentCourse();
        } else {
            str = null;
        }
        Course courseById = firebasePersistence.getCourseById(str);
        if (courseById != null) {
            courseById.getCourseOpenDate();
            long courseOpenDate = courseById.getCourseOpenDate();
            Utils utils = Utils.INSTANCE;
            if (courseOpenDate < utils.getTodayTimeInSeconds()) {
                courseById.setCourseOpenDate(utils.getTodayTimeInSeconds());
                courseById.setCourseOpenDay(courseById.getCourseOpenDay() + 1);
                FirebasePersistence.getInstance().updateUserOnFirebase();
            }
        }
        return hs.k.f19476a;
    }
}
