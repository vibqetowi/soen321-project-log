package am;

import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: FirestoreGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends String>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoalsActivity f657u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(FirestoreGoalsActivity firestoreGoalsActivity) {
        super(1);
        this.f657u = firestoreGoalsActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends String> singleUseEvent) {
        String contentIfNotHandled;
        RobertoTextView robertoTextView;
        SingleUseEvent<? extends String> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
            yp.b bVar = this.f657u.f11150w;
            if (bVar != null) {
                robertoTextView = bVar.f38727t;
            } else {
                robertoTextView = null;
            }
            if (robertoTextView != null) {
                robertoTextView.setText(contentIfNotHandled);
            }
        }
        return hs.k.f19476a;
    }
}
