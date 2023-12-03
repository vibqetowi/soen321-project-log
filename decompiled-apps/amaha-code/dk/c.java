package dk;

import com.theinnerhour.b2b.activity.AddCustomGoalsActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AddCustomGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.k implements ss.l<List<? extends FirestoreGoal>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ AddCustomGoalsActivity f12907u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AddCustomGoalsActivity addCustomGoalsActivity) {
        super(1);
        this.f12907u = addCustomGoalsActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
        if (((java.lang.Boolean) r0).booleanValue() == false) goto L10;
     */
    @Override // ss.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs.k invoke(List<? extends FirestoreGoal> list) {
        List<? extends FirestoreGoal> list2 = list;
        if (list2 != null) {
            ArrayList<FirestoreGoal> arrayList = new ArrayList<>(list2);
            AddCustomGoalsActivity addCustomGoalsActivity = this.f12907u;
            addCustomGoalsActivity.getClass();
            addCustomGoalsActivity.E = arrayList;
            is.q.U1(addCustomGoalsActivity.f10298y, new b(addCustomGoalsActivity));
            User user = FirebasePersistence.getInstance().getUser();
            if (user.getAppConfig().containsKey("custom_goal_disclaimer")) {
                if (user.getAppConfig().containsKey("custom_goal_disclaimer")) {
                    Object obj = user.getAppConfig().get("custom_goal_disclaimer");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
                }
                addCustomGoalsActivity.w0();
            }
            addCustomGoalsActivity.v0();
        }
        return hs.k.f19476a;
    }
}
