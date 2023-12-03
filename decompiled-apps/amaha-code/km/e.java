package km;

import com.theinnerhour.b2b.components.inAppFunneling.model.PopupItemModel;
import com.theinnerhour.b2b.model.GamificationBadgesModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.UserGamificationModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import hs.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
/* compiled from: InAppPromptsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.inAppFunneling.viewmodel.InAppPromptsViewModel$getOtherPopUps$2$1", f = "InAppPromptsViewModel.kt", l = {327}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public ls.d f23418u;

    /* renamed from: v  reason: collision with root package name */
    public int f23419v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ls.d<List<? extends PopupItemModel>> f23420w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ d f23421x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(ls.d<? super List<? extends PopupItemModel>> dVar, d dVar2, ls.d<? super e> dVar3) {
        super(2, dVar3);
        this.f23420w = dVar;
        this.f23421x = dVar2;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new e(this.f23420w, this.f23421x, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((e) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ls.d<List<? extends PopupItemModel>> dVar;
        Object s10;
        HashMap<String, String> hashMap;
        UserGamificationModel userGamificationModel;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f23419v;
        if (i6 != 0) {
            if (i6 == 1) {
                ls.d<List<? extends PopupItemModel>> dVar2 = this.f23418u;
                sp.b.d0(obj);
                dVar = dVar2;
                s10 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            im.c cVar = this.f23421x.f23394y;
            dVar = this.f23420w;
            this.f23418u = dVar;
            this.f23419v = 1;
            cVar.getClass();
            kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
            kVar.u();
            try {
                ArrayList arrayList = new ArrayList();
                if (!kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") && !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE) && ApplicationPersistence.getInstance().getLongValue(Constants.VERIFY_EMAIL_POPUP_TIME) < Utils.INSTANCE.getTodayTimeInSeconds()) {
                    arrayList.add(new hs.f(new Integer(1), "b2b_verification"));
                }
                if (ApplicationPersistence.getInstance().getLongValue("dc_v2_app_open_seq", 1L) == 2 && ApplicationPersistence.getInstance().getBooleanValue("show_lock_cm", true)) {
                    arrayList.add(new hs.f(new Integer(5), "setup_lock"));
                }
                long longValue = ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_DASHBOARD_DATE, 0L);
                Utils utils = Utils.INSTANCE;
                if (longValue == utils.getTodayCalendar().getTimeInMillis() && ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_DASHBOARD_GIVEN_DATE, 0L) != utils.getTodayCalendar().getTimeInMillis() && !ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false) && ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_GOAL_DATE, 0L) != utils.getTodayCalendar().getTimeInMillis()) {
                    arrayList.add(new hs.f(new Integer(6), "feedback_card"));
                } else if ((im.c.a(cVar) > 1 || ApplicationPersistence.getInstance().getBooleanValue("app_feedback_day_three", false)) && ApplicationPersistence.getInstance().getBooleanValue(Constants.SHOW_APP_FEEDBACK_POPUP, false) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false) && ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_GOAL_DATE, 0L) != utils.getTodayCalendar().getTimeInMillis()) {
                    arrayList.add(new hs.f(new Integer(6), "feedback_popup"));
                }
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null && (userGamificationModel = user.getUserGamificationModel()) != null) {
                    hashMap = userGamificationModel.getBadges();
                } else {
                    hashMap = null;
                }
                if (hashMap != null) {
                    Iterator<GamificationBadgesModel> it = Constants.getGamificationBadgesV3().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        GamificationBadgesModel next = it.next();
                        if (hashMap.containsKey(next.getId()) && kotlin.jvm.internal.i.b(hashMap.get(next.getId()), Constants.BADGE_ATTAINED)) {
                            arrayList.add(new hs.f(new Integer(7), "badge_earned"));
                            break;
                        }
                    }
                }
                if (kVar.a()) {
                    kVar.resumeWith(arrayList);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(cVar.f20393a, e10);
            }
            s10 = kVar.s();
            if (s10 == aVar) {
                return aVar;
            }
        }
        Iterable<hs.f> iterable = (Iterable) s10;
        ArrayList arrayList2 = new ArrayList(is.i.H1(iterable, 10));
        for (hs.f fVar : iterable) {
            arrayList2.add(new PopupItemModel.DashboardPopup((String) fVar.f19465v, ((Number) fVar.f19464u).intValue()));
        }
        dVar.resumeWith(arrayList2);
        return k.f19476a;
    }
}
