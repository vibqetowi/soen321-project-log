package fm;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.onboarding.model.UserOnboardingModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
/* compiled from: FirestoreGoalsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$getCalendarStartDate$1", f = "FirestoreGoalsViewModel.kt", l = {R.styleable.AppCompatTheme_switchStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public androidx.lifecycle.w f15519u;

    /* renamed from: v  reason: collision with root package name */
    public int f15520v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ a f15521w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a aVar, ls.d<? super r> dVar) {
        super(2, dVar);
        this.f15521w = aVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new r(this.f15521w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((r) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.w wVar;
        String str;
        long longValue;
        String str2;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15520v;
        boolean z10 = true;
        if (i6 != 0) {
            if (i6 == 1) {
                wVar = this.f15519u;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            a aVar2 = this.f15521w;
            androidx.lifecycle.w wVar2 = (androidx.lifecycle.w) aVar2.C.getValue();
            this.f15519u = wVar2;
            this.f15520v = 1;
            j0 j0Var = aVar2.f15183y;
            j0Var.getClass();
            kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
            kVar.u();
            try {
                String[] strArr = {Constants.COURSE_ADHD, Constants.COURSE_OCD, Constants.COURSE_GENERIC};
                User user = FirebasePersistence.getInstance().getUser();
                Long l2 = null;
                if (user != null) {
                    str = user.getCurrentCourseName();
                } else {
                    str = null;
                }
                if (is.k.Q1(str, strArr)) {
                    FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                    UserOnboardingModel userOnboardingModel = firebasePersistence.getUserOnboardingModel();
                    User user2 = firebasePersistence.getUser();
                    if (user2 != null) {
                        str2 = user2.getCurrentCourseName();
                    } else {
                        str2 = null;
                    }
                    Long l10 = new Long(userOnboardingModel.getCourseStartDate(str2));
                    if (l10.longValue() != 0) {
                        z10 = false;
                    }
                    if (!Boolean.valueOf(z10).booleanValue()) {
                        l2 = l10;
                    }
                    if (l2 != null) {
                        longValue = l2.longValue();
                    } else {
                        longValue = Utils.INSTANCE.getTodayTimeInSeconds();
                    }
                } else {
                    FirebasePersistence firebasePersistence2 = FirebasePersistence.getInstance();
                    longValue = new Long(firebasePersistence2.getCourseById(firebasePersistence2.getUser().getCurrentCourse()).getStartDate().getTime()).longValue();
                }
                ArrayList<Course> courses = FirebasePersistence.getInstance().getCourses();
                if (courses != null) {
                    Iterator<Course> it = courses.iterator();
                    while (it.hasNext()) {
                        Course next = it.next();
                        if (longValue > next.getStartDate().getTime()) {
                            longValue = next.getStartDate().getTime();
                        }
                    }
                }
                if (kVar.a()) {
                    kVar.resumeWith(new Long(longValue));
                }
            } catch (Exception e10) {
                if (kVar.a()) {
                    kVar.resumeWith(new Long(Calendar.getInstance().getTimeInMillis()));
                }
                LogHelper.INSTANCE.e(j0Var.f15374a, e10);
            }
            obj = kVar.s();
            if (obj == aVar) {
                return aVar;
            }
            wVar = wVar2;
        }
        wVar.i(obj);
        return hs.k.f19476a;
    }
}
