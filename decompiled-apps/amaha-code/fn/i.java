package fn;

import com.theinnerhour.b2b.components.login.activity.LoginSignupReworkActivity;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import kotlin.jvm.internal.k;
import s1.y;
import ss.l;
/* compiled from: LoginSignupReworkActivity.kt */
/* loaded from: classes2.dex */
public final class i extends k implements l<SingleUseEvent<? extends Boolean>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ LoginSignupReworkActivity f15634u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(LoginSignupReworkActivity loginSignupReworkActivity) {
        super(1);
        this.f15634u = loginSignupReworkActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
        Boolean contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
        if (contentIfNotHandled != null && contentIfNotHandled.booleanValue()) {
            y yVar = this.f15634u.A;
            if (yVar != null) {
                yVar.n();
            } else {
                kotlin.jvm.internal.i.q("navController");
                throw null;
            }
        }
        return hs.k.f19476a;
    }
}
