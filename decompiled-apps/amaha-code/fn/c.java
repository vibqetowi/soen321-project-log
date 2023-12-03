package fn;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.activity.LoginSignupReworkActivity;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: LoginSignupReworkActivity.kt */
/* loaded from: classes2.dex */
public final class c extends k implements l<String, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ LoginSignupReworkActivity f15628u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LoginSignupReworkActivity loginSignupReworkActivity) {
        super(1);
        this.f15628u = loginSignupReworkActivity;
    }

    @Override // ss.l
    public final hs.k invoke(String str) {
        String str2 = str;
        int i6 = LoginSignupReworkActivity.C;
        LoginSignupReworkActivity loginSignupReworkActivity = this.f15628u;
        loginSignupReworkActivity.getClass();
        if (str2 != null) {
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_error, loginSignupReworkActivity, R.style.Theme_Dialog_Fullscreen);
            View findViewById = styledDialog.findViewById(R.id.errorText);
            kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) findViewById).setText(str2);
            View findViewById2 = styledDialog.findViewById(R.id.okButton);
            kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) findViewById2).setOnClickListener(new lm.f(styledDialog, 2));
            Window window = styledDialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -2);
            }
            styledDialog.show();
        }
        return hs.k.f19476a;
    }
}
