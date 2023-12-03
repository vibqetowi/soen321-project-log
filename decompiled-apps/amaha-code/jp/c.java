package jp;

import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.model.AngerCourse;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.DepressionCourse;
import com.theinnerhour.b2b.model.HappinessCourse;
import com.theinnerhour.b2b.model.SleepCourse;
import com.theinnerhour.b2b.model.StressCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.WorryCourse;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import hs.k;
import java.util.ArrayList;
import kotlinx.coroutines.d0;
import lg.f;
import ns.i;
import ss.p;
/* compiled from: SplashScreenRepository.kt */
@ns.e(c = "com.theinnerhour.b2b.components.splash.viewModel.SplashScreenRepository$updateCourseProgress$2", f = "SplashScreenRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f22545u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ls.d<? super c> dVar) {
        super(2, dVar);
        this.f22545u = aVar;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new c(this.f22545u, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ArrayList<CourseDayModelV1> planV3;
        ArrayList<CourseDayModelV1> planV32;
        ArrayList<CourseDayModelV1> planV33;
        ArrayList<CourseDayModelV1> planV34;
        ArrayList<CourseDayModelV1> planV35;
        ArrayList<CourseDayModelV1> planV36;
        sp.b.d0(obj);
        User user = FirebasePersistence.getInstance().getUser();
        if (user == null) {
            return null;
        }
        lg.f d10 = MyApplication.V.a().d();
        DepressionCourse depression = user.getDepression();
        a aVar = this.f22545u;
        f.b bVar = d10.f;
        if (depression != null && (planV36 = depression.getPlanV3()) != null) {
            bVar.f(new Integer(a.a(aVar, planV36)), "Depression Plan Day");
        }
        SleepCourse sleep = user.getSleep();
        if (sleep != null && (planV35 = sleep.getPlanV3()) != null) {
            bVar.f(new Integer(a.a(aVar, planV35)), "Sleep Plan Day");
        }
        WorryCourse worry = user.getWorry();
        if (worry != null && (planV34 = worry.getPlanV3()) != null) {
            bVar.f(new Integer(a.a(aVar, planV34)), "Worry Plan Day");
        }
        StressCourse stress = user.getStress();
        if (stress != null && (planV33 = stress.getPlanV3()) != null) {
            bVar.f(new Integer(a.a(aVar, planV33)), "Stress Plan Day");
        }
        AngerCourse anger = user.getAnger();
        if (anger != null && (planV32 = anger.getPlanV3()) != null) {
            bVar.f(new Integer(a.a(aVar, planV32)), "Anger Plan Day");
        }
        HappinessCourse happiness = user.getHappiness();
        if (happiness == null || (planV3 = happiness.getPlanV3()) == null) {
            return null;
        }
        bVar.f(new Integer(a.a(aVar, planV3)), "Happiness Plan Day");
        return k.f19476a;
    }
}
