package am;

import android.content.Intent;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: FirestoreGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Intent>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoalsActivity f652u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(FirestoreGoalsActivity firestoreGoalsActivity) {
        super(1);
        this.f652u = firestoreGoalsActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends Intent> singleUseEvent) {
        Intent contentIfNotHandled;
        SingleUseEvent<? extends Intent> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
            this.f652u.B.a(contentIfNotHandled);
        }
        return hs.k.f19476a;
    }
}
