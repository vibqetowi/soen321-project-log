package ho;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.WebviewActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import q.d;
/* compiled from: ProIntroConsentFragment.kt */
/* loaded from: classes2.dex */
public final class y extends ClickableSpan {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ z f18068u;

    public y(z zVar) {
        this.f18068u = zVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View textView) {
        z zVar = this.f18068u;
        kotlin.jvm.internal.i.g(textView, "textView");
        try {
            s5 s5Var = new s5(15);
            Context requireContext = zVar.requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            if (s5Var.b(requireContext)) {
                d.b bVar = new d.b();
                Integer valueOf = Integer.valueOf(g0.a.b(zVar.requireContext(), R.color.dashboard_grey) | (-16777216));
                Bundle bundle = new Bundle();
                if (valueOf != null) {
                    bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                }
                bVar.f29100c = bundle;
                bVar.a().a(zVar.requireContext(), Uri.parse("https://www.amahahealth.com/terms-and-conditions"));
                return;
            }
            Intent intent = new Intent(zVar.requireContext(), WebviewActivity.class);
            intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/terms-and-conditions");
            zVar.startActivity(intent);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(zVar.f18070u, e10);
        }
    }
}
