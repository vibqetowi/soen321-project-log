package am;

import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: FirestoreGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Boolean>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoalsActivity f650u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FirestoreGoalsActivity firestoreGoalsActivity) {
        super(1);
        this.f650u = firestoreGoalsActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
        Boolean contentIfNotHandled;
        SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
            contentIfNotHandled.booleanValue();
            int i6 = FirestoreGoalsActivity.E;
            this.f650u.n0();
        }
        return hs.k.f19476a;
    }
}
