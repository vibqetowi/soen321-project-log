package fn;

import android.os.Bundle;
import com.theinnerhour.b2b.components.login.activity.LoginSignupReworkActivity;
import com.theinnerhour.b2b.components.login.model.NavigationScreenName;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: LoginSignupReworkActivity.kt */
/* loaded from: classes2.dex */
public final class g extends k implements l<SingleUseEvent<? extends hs.f<? extends NavigationScreenName, ? extends Bundle>>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ LoginSignupReworkActivity f15632u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LoginSignupReworkActivity loginSignupReworkActivity) {
        super(1);
        this.f15632u = loginSignupReworkActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends hs.f<? extends NavigationScreenName, ? extends Bundle>> singleUseEvent) {
        hs.f<? extends NavigationScreenName, ? extends Bundle> contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
        if (contentIfNotHandled != null) {
            LoginSignupReworkActivity.p0(this.f15632u, (NavigationScreenName) contentIfNotHandled.f19464u, (Bundle) contentIfNotHandled.f19465v, 2);
        }
        return hs.k.f19476a;
    }
}
