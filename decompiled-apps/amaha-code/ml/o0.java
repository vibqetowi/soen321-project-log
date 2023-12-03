package ml;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: V3DashboardViewModel.kt */
/* loaded from: classes2.dex */
public final class o0 extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ApplicationPersistence.getInstance().setBooleanValue(Constants.TELE_CACHED, true);
    }
}
