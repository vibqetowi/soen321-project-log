package jl;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: NotV4DashboardViewModel.kt */
/* loaded from: classes2.dex */
public final class k1 extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ApplicationPersistence.getInstance().setBooleanValue(Constants.TELE_CACHED, true);
    }
}
