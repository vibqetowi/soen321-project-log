package sk;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.theinnerhour.b2b.components.community.activity.CommunitiesPwaActivity;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import gv.r;
import kotlin.jvm.internal.i;
/* compiled from: CommunitiesPwaActivity.kt */
/* loaded from: classes2.dex */
public final class a extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CommunitiesPwaActivity f31643a;

    public a(CommunitiesPwaActivity communitiesPwaActivity) {
        this.f31643a = communitiesPwaActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        ProgressBar progressBar;
        i.g(view, "view");
        i.g(url, "url");
        yp.a aVar = this.f31643a.f10634w;
        if (aVar != null && (progressBar = aVar.f38708e) != null) {
            Extensions.INSTANCE.gone(progressBar);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String request) {
        CommunitiesPwaActivity communitiesPwaActivity = this.f31643a;
        i.g(view, "view");
        i.g(request, "request");
        if (!r.J0(request, "https://community.amahahealth.com/") && !r.J0(request, "firebaseapp")) {
            try {
                communitiesPwaActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(request)));
                return true;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(communitiesPwaActivity.f10633v, e10);
                return true;
            }
        }
        view.loadUrl(request);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        CommunitiesPwaActivity communitiesPwaActivity = this.f31643a;
        if (!r.J0(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null), "https://community.amahahealth.com/")) {
            if (!r.J0(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null), "firebaseapp")) {
                try {
                    communitiesPwaActivity.startActivity(new Intent("android.intent.action.VIEW", webResourceRequest != null ? webResourceRequest.getUrl() : null));
                    return true;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(communitiesPwaActivity.f10633v, e10);
                    return true;
                }
            }
        }
        if (webView != null) {
            webView.loadUrl(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
            return true;
        }
        return true;
    }
}
