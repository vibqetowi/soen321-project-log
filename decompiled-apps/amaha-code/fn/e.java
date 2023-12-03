package fn;

import android.widget.Toast;
import com.theinnerhour.b2b.components.login.activity.LoginSignupReworkActivity;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: LoginSignupReworkActivity.kt */
/* loaded from: classes2.dex */
public final class e extends k implements l<SingleUseEvent<? extends String>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ LoginSignupReworkActivity f15630u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LoginSignupReworkActivity loginSignupReworkActivity) {
        super(1);
        this.f15630u = loginSignupReworkActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends String> singleUseEvent) {
        Toast.makeText(this.f15630u, singleUseEvent.getContentIfNotHandled(), 0).show();
        return hs.k.f19476a;
    }
}
