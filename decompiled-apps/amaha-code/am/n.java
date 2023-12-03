package am;

import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: FirestoreGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Boolean>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoalsActivity f656u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(FirestoreGoalsActivity firestoreGoalsActivity) {
        super(1);
        this.f656u = firestoreGoalsActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
        Boolean contentIfNotHandled;
        RobertoTextView robertoTextView;
        RobertoTextView robertoTextView2;
        SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
            boolean booleanValue = contentIfNotHandled.booleanValue();
            FirestoreGoalsActivity firestoreGoalsActivity = this.f656u;
            if (booleanValue) {
                yp.b bVar = firestoreGoalsActivity.f11150w;
                if (bVar != null && (robertoTextView2 = bVar.f38727t) != null) {
                    Extensions.INSTANCE.gone(robertoTextView2);
                }
            } else {
                yp.b bVar2 = firestoreGoalsActivity.f11150w;
                if (bVar2 != null && (robertoTextView = bVar2.f38727t) != null) {
                    Extensions.INSTANCE.visible(robertoTextView);
                }
            }
        }
        return hs.k.f19476a;
    }
}
