package fn;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.login.activity.LoginSignupReworkActivity;
import com.theinnerhour.b2b.utils.Constants;
import kotlin.jvm.internal.k;
import ss.l;
import tr.r;
/* compiled from: LoginSignupReworkActivity.kt */
/* loaded from: classes2.dex */
public final class d extends k implements l<String, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ LoginSignupReworkActivity f15629u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LoginSignupReworkActivity loginSignupReworkActivity) {
        super(1);
        this.f15629u = loginSignupReworkActivity;
    }

    @Override // ss.l
    public final hs.k invoke(String str) {
        String str2 = str;
        boolean b10 = kotlin.jvm.internal.i.b(str2, "condition_selection");
        LoginSignupReworkActivity loginSignupReworkActivity = this.f15629u;
        if (b10) {
            Intent r = r.r(loginSignupReworkActivity);
            if (loginSignupReworkActivity.getIntent().getExtras() != null) {
                Bundle extras = loginSignupReworkActivity.getIntent().getExtras();
                kotlin.jvm.internal.i.d(extras);
                r.putExtras(extras);
            }
            int i6 = LoginSignupReworkActivity.C;
            r.putExtra("login_flag", true);
            loginSignupReworkActivity.startActivity(r);
            loginSignupReworkActivity.finish();
        } else if (kotlin.jvm.internal.i.b(str2, Constants.SCREEN_DASHBOARD)) {
            Intent a10 = new ll.b().a(loginSignupReworkActivity, false);
            a10.putExtra("login_activity_new", true);
            if (loginSignupReworkActivity.getIntent().getExtras() != null) {
                Bundle extras2 = loginSignupReworkActivity.getIntent().getExtras();
                kotlin.jvm.internal.i.d(extras2);
                a10.putExtras(extras2);
            }
            int i10 = LoginSignupReworkActivity.C;
            a10.putExtra("login_flag", true);
            loginSignupReworkActivity.startActivity(a10);
            loginSignupReworkActivity.finish();
        }
        return hs.k.f19476a;
    }
}
