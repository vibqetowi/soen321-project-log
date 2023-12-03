package fn;

import android.app.Dialog;
import com.theinnerhour.b2b.components.login.activity.LoginSignupReworkActivity;
import com.theinnerhour.b2b.components.login.model.LoginLoading;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: LoginSignupReworkActivity.kt */
/* loaded from: classes2.dex */
public final class b extends k implements l<LoginLoading, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ LoginSignupReworkActivity f15627u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LoginSignupReworkActivity loginSignupReworkActivity) {
        super(1);
        this.f15627u = loginSignupReworkActivity;
    }

    @Override // ss.l
    public final hs.k invoke(LoginLoading loginLoading) {
        LoginLoading loginLoading2 = loginLoading;
        LoginLoading loginLoading3 = LoginLoading.HIDE_LOADING;
        LoginSignupReworkActivity loginSignupReworkActivity = this.f15627u;
        if (loginLoading2 == loginLoading3) {
            Dialog dialog = loginSignupReworkActivity.f11311x;
            if (dialog != null) {
                dialog.dismiss();
            }
        } else {
            Dialog dialog2 = loginSignupReworkActivity.f11311x;
            if (dialog2 != null) {
                dialog2.show();
            }
        }
        return hs.k.f19476a;
    }
}
