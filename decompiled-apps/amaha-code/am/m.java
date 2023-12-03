package am;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: FirestoreGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Boolean>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoalsActivity f655u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(FirestoreGoalsActivity firestoreGoalsActivity) {
        super(1);
        this.f655u = firestoreGoalsActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
        Boolean contentIfNotHandled;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
            boolean booleanValue = contentIfNotHandled.booleanValue();
            FirestoreGoalsActivity firestoreGoalsActivity = this.f655u;
            if (booleanValue) {
                yp.b bVar = firestoreGoalsActivity.f11150w;
                if (bVar != null && (constraintLayout2 = bVar.f38717i) != null) {
                    Extensions.INSTANCE.visible(constraintLayout2);
                }
            } else {
                yp.b bVar2 = firestoreGoalsActivity.f11150w;
                if (bVar2 != null && (constraintLayout = bVar2.f38717i) != null) {
                    Extensions.INSTANCE.gone(constraintLayout);
                }
            }
        }
        return hs.k.f19476a;
    }
}
