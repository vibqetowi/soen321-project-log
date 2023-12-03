package wn;

import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.UserGamificationModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.HashMap;
import kotlinx.coroutines.d0;
/* compiled from: MultiTrackerViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.multiTracker.utils.MultiTrackerViewModel$checkAndAssignMoodTrackBadge$1", f = "MultiTrackerViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ t f36833u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, ls.d<? super q> dVar) {
        super(2, dVar);
        this.f36833u = tVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new q(this.f36833u, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((q) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String str;
        UserGamificationModel userGamificationModel;
        HashMap<String, String> badges;
        UserGamificationModel userGamificationModel2;
        HashMap<String, String> badges2;
        sp.b.d0(obj);
        try {
            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
            User user = firebasePersistence.getUser();
            if (user != null && (userGamificationModel2 = user.getUserGamificationModel()) != null && (badges2 = userGamificationModel2.getBadges()) != null) {
                str = badges2.get(Constants.TRACKING_YOUR_MOOD_BADGE);
            } else {
                str = null;
            }
            if (!kotlin.jvm.internal.i.b(str, Constants.BADGE_ATTAINED)) {
                User user2 = firebasePersistence.getUser();
                if (user2 != null && (userGamificationModel = user2.getUserGamificationModel()) != null && (badges = userGamificationModel.getBadges()) != null) {
                    badges.put(Constants.TRACKING_YOUR_MOOD_BADGE, Constants.BADGE_ATTAINED);
                }
                firebasePersistence.updateUserOnFirebase();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f36833u.f36859x, e10);
        }
        return hs.k.f19476a;
    }
}
