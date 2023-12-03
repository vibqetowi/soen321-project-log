package am;

import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: FirestoreGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends String>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoalsActivity f649u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FirestoreGoalsActivity firestoreGoalsActivity) {
        super(1);
        this.f649u = firestoreGoalsActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends String> singleUseEvent) {
        String contentIfNotHandled;
        SingleUseEvent<? extends String> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
            di.b.x(this.f649u, contentIfNotHandled);
        }
        return hs.k.f19476a;
    }
}
