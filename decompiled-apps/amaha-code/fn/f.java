package fn;

import com.theinnerhour.b2b.components.login.activity.LoginSignupReworkActivity;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: LoginSignupReworkActivity.kt */
/* loaded from: classes2.dex */
public final class f extends k implements l<SingleUseEvent<? extends Integer>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ LoginSignupReworkActivity f15631u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LoginSignupReworkActivity loginSignupReworkActivity) {
        super(1);
        this.f15631u = loginSignupReworkActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends Integer> singleUseEvent) {
        Integer contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
        if (contentIfNotHandled != null) {
            int intValue = contentIfNotHandled.intValue();
            int i6 = LoginSignupReworkActivity.C;
            this.f15631u.q0(intValue);
        }
        return hs.k.f19476a;
    }
}
