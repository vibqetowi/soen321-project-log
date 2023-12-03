package com.theinnerhour.b2b.components.login.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hc.d;
import hs.k;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: SSOLoginPWA.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¨\u0006\n"}, d2 = {"Lcom/theinnerhour/b2b/components/login/activity/SSOLoginPWA;", "Landroidx/appcompat/app/c;", "", "token", "Lhs/k;", "ssoToken", "error", "ssoError", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SSOLoginPWA extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f11314x = 0;

    /* renamed from: v  reason: collision with root package name */
    public final String f11315v;

    /* renamed from: w  reason: collision with root package name */
    public yp.a f11316w;

    /* compiled from: SSOLoginPWA.kt */
    /* loaded from: classes2.dex */
    public static final class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView view, String url) {
            ProgressBar progressBar;
            i.g(view, "view");
            i.g(url, "url");
            yp.a aVar = SSOLoginPWA.this.f11316w;
            if (aVar != null && (progressBar = aVar.f38708e) != null) {
                Extensions.INSTANCE.gone(progressBar);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Integer num;
            Uri uri;
            int errorCode;
            AppCompatImageView appCompatImageView;
            View view;
            RobertoButton robertoButton;
            RobertoTextView robertoTextView;
            ProgressBar progressBar;
            WebView webView2;
            SSOLoginPWA sSOLoginPWA = SSOLoginPWA.this;
            yp.a aVar = sSOLoginPWA.f11316w;
            if (aVar != null && (webView2 = aVar.f38709g) != null) {
                webView2.loadData("<html lang=\"en\">\n<head>\n   <meta charset=\"UTF-8\">\n   <title>Page title</title>\n</head>\n<body>\n</body>\n</html>", "text/html", "utf-8");
            }
            yp.a aVar2 = sSOLoginPWA.f11316w;
            if (aVar2 != null && (progressBar = aVar2.f38708e) != null) {
                Extensions.INSTANCE.gone(progressBar);
            }
            yp.a aVar3 = sSOLoginPWA.f11316w;
            if (aVar3 != null && (robertoTextView = aVar3.f) != null) {
                Extensions.INSTANCE.visible(robertoTextView);
            }
            yp.a aVar4 = sSOLoginPWA.f11316w;
            if (aVar4 != null && (robertoButton = aVar4.f38706c) != null) {
                Extensions.INSTANCE.visible(robertoButton);
            }
            yp.a aVar5 = sSOLoginPWA.f11316w;
            if (aVar5 != null && (view = aVar5.f38705b) != null) {
                Extensions.INSTANCE.visible(view);
            }
            yp.a aVar6 = sSOLoginPWA.f11316w;
            if (aVar6 != null && (appCompatImageView = aVar6.f38707d) != null) {
                Extensions.INSTANCE.visible(appCompatImageView);
            }
            LogHelper logHelper = LogHelper.INSTANCE;
            String str = sSOLoginPWA.f11315v;
            StringBuilder sb2 = new StringBuilder();
            CharSequence charSequence = null;
            if (webResourceError != null) {
                errorCode = webResourceError.getErrorCode();
                num = Integer.valueOf(errorCode);
            } else {
                num = null;
            }
            sb2.append(num);
            sb2.append(' ');
            if (webResourceRequest != null) {
                uri = webResourceRequest.getUrl();
            } else {
                uri = null;
            }
            sb2.append(uri);
            sb2.append(' ');
            if (webResourceError != null) {
                charSequence = webResourceError.getDescription();
            }
            if (charSequence == null) {
                charSequence = "";
            }
            sb2.append((Object) charSequence);
            logHelper.e(str, sb2.toString());
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri uri;
            if (webView != null) {
                if (webResourceRequest != null) {
                    uri = webResourceRequest.getUrl();
                } else {
                    uri = null;
                }
                webView.loadUrl(String.valueOf(uri));
                return true;
            }
            return true;
        }
    }

    /* compiled from: SSOLoginPWA.kt */
    /* loaded from: classes2.dex */
    public static final class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage cm2) {
            i.g(cm2, "cm");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final void onPermissionRequest(PermissionRequest request) {
            i.g(request, "request");
            request.grant(request.getResources());
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            return true;
        }
    }

    public SSOLoginPWA() {
        new LinkedHashMap();
        this.f11315v = LogHelper.INSTANCE.makeLogTag("SSOLoginPWA");
    }

    public final void n0() {
        try {
            if (Build.VERSION.SDK_INT >= 22) {
                CookieManager.getInstance().removeAllCookies(null);
                CookieManager.getInstance().flush();
            } else {
                CookieSyncManager createInstance = CookieSyncManager.createInstance(this);
                createInstance.startSync();
                CookieManager cookieManager = CookieManager.getInstance();
                i.f(cookieManager, "getInstance()");
                cookieManager.removeAllCookie();
                cookieManager.removeSessionCookie();
                createInstance.stopSync();
                createInstance.sync();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11315v, e10);
        }
    }

    public final void o0() {
        WebView webView;
        yp.a aVar;
        WebView webView2;
        String stringExtra = getIntent().getStringExtra(Constants.NOTIFICATION_URL);
        k kVar = null;
        if (stringExtra != null && (aVar = this.f11316w) != null && (webView2 = aVar.f38709g) != null) {
            webView2.loadUrl(stringExtra);
            kVar = k.f19476a;
        }
        if (kVar == null) {
            yp.a aVar2 = this.f11316w;
            if (aVar2 != null && (webView = aVar2.f38709g) != null) {
                webView.clearCache(true);
            }
            finish();
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        WebSettings webSettings;
        WebView webView;
        RobertoButton robertoButton;
        WebView webView2;
        ProgressBar progressBar;
        WebView webView3;
        super.onCreate(bundle);
        WebView webView4 = null;
        View inflate = getLayoutInflater().inflate(R.layout.activity_ssologin_pwa, (ViewGroup) null, false);
        int i6 = R.id.btnSSOErrorButton;
        RobertoButton robertoButton2 = (RobertoButton) d.w(R.id.btnSSOErrorButton, inflate);
        if (robertoButton2 != null) {
            i6 = R.id.imgSSOError;
            AppCompatImageView appCompatImageView = (AppCompatImageView) d.w(R.id.imgSSOError, inflate);
            if (appCompatImageView != null) {
                i6 = R.id.pbSSOProgressBar;
                ProgressBar progressBar2 = (ProgressBar) d.w(R.id.pbSSOProgressBar, inflate);
                if (progressBar2 != null) {
                    i6 = R.id.ssoErrorBG;
                    View w10 = d.w(R.id.ssoErrorBG, inflate);
                    if (w10 != null) {
                        i6 = R.id.tvSSOErrorText;
                        RobertoTextView robertoTextView = (RobertoTextView) d.w(R.id.tvSSOErrorText, inflate);
                        if (robertoTextView != null) {
                            i6 = R.id.wvSSOWebView;
                            WebView webView5 = (WebView) d.w(R.id.wvSSOWebView, inflate);
                            if (webView5 != null) {
                                yp.a aVar = new yp.a((ConstraintLayout) inflate, robertoButton2, appCompatImageView, progressBar2, w10, robertoTextView, webView5);
                                this.f11316w = aVar;
                                setContentView(aVar.a());
                                try {
                                    InsetsUtils.INSTANCE.setStatusBarColor(R.color.loginBGNew, this, false, true);
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(this.f11315v, "Error in setting custom status bar", e10);
                                }
                                yp.a aVar2 = this.f11316w;
                                if (aVar2 != null && (webView3 = aVar2.f38709g) != null) {
                                    webSettings = webView3.getSettings();
                                } else {
                                    webSettings = null;
                                }
                                if (webSettings != null) {
                                    webSettings.setDomStorageEnabled(true);
                                }
                                if (webSettings != null) {
                                    webSettings.setJavaScriptEnabled(true);
                                }
                                if (webSettings != null) {
                                    webSettings.setCacheMode(-1);
                                }
                                if (webSettings != null) {
                                    webSettings.setLoadsImagesAutomatically(true);
                                }
                                if (webSettings != null) {
                                    webSettings.setGeolocationEnabled(false);
                                }
                                if (webSettings != null) {
                                    webSettings.setNeedInitialFocus(false);
                                }
                                if (webSettings != null) {
                                    webSettings.setSaveFormData(false);
                                }
                                if (webSettings != null) {
                                    webSettings.setAllowFileAccess(true);
                                }
                                if (webSettings != null) {
                                    webSettings.setAllowFileAccessFromFileURLs(true);
                                }
                                if (webSettings != null) {
                                    webSettings.setMediaPlaybackRequiresUserGesture(false);
                                }
                                yp.a aVar3 = this.f11316w;
                                if (aVar3 != null && (progressBar = aVar3.f38708e) != null) {
                                    Extensions.INSTANCE.visible(progressBar);
                                }
                                yp.a aVar4 = this.f11316w;
                                if (aVar4 != null) {
                                    webView = aVar4.f38709g;
                                } else {
                                    webView = null;
                                }
                                if (webView != null) {
                                    webView.setWebViewClient(new a());
                                }
                                yp.a aVar5 = this.f11316w;
                                if (aVar5 != null) {
                                    webView4 = aVar5.f38709g;
                                }
                                if (webView4 != null) {
                                    webView4.setWebChromeClient(new b());
                                }
                                yp.a aVar6 = this.f11316w;
                                if (aVar6 != null && (webView2 = aVar6.f38709g) != null) {
                                    webView2.addJavascriptInterface(this, "Android");
                                }
                                o0();
                                yp.a aVar7 = this.f11316w;
                                if (aVar7 != null && (robertoButton = aVar7.f38706c) != null) {
                                    robertoButton.setOnClickListener(new ol.k(25, this));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        WebView webView;
        WebView webView2;
        WebView webView3;
        WebView webView4;
        WebView webView5;
        WebView webView6;
        WebView webView7;
        try {
            yp.a aVar = this.f11316w;
            if (aVar != null && (webView7 = aVar.f38709g) != null) {
                webView7.clearHistory();
            }
            yp.a aVar2 = this.f11316w;
            if (aVar2 != null && (webView6 = aVar2.f38709g) != null) {
                webView6.clearCache(true);
            }
            yp.a aVar3 = this.f11316w;
            if (aVar3 != null && (webView5 = aVar3.f38709g) != null) {
                webView5.loadUrl("about:blank");
            }
            yp.a aVar4 = this.f11316w;
            if (aVar4 != null && (webView4 = aVar4.f38709g) != null) {
                webView4.removeAllViews();
            }
            yp.a aVar5 = this.f11316w;
            if (aVar5 != null && (webView3 = aVar5.f38709g) != null) {
                webView3.destroyDrawingCache();
            }
            yp.a aVar6 = this.f11316w;
            if (aVar6 != null && (webView2 = aVar6.f38709g) != null) {
                webView2.pauseTimers();
            }
            yp.a aVar7 = this.f11316w;
            if (aVar7 != null && (webView = aVar7.f38709g) != null) {
                webView.destroy();
            }
            n0();
            this.f11316w = null;
            super.onDestroy();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11315v, "exception", e10);
        }
    }

    @JavascriptInterface
    public final void ssoError(String error) {
        i.g(error, "error");
        try {
            Intent intent = new Intent();
            intent.putExtra("error", error);
            setResult(0, intent);
            finish();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11315v, e10);
            finish();
        }
    }

    @JavascriptInterface
    public final void ssoToken(String token) {
        i.g(token, "token");
        try {
            Intent intent = new Intent();
            intent.putExtra(Constants.NOTIFICATION_URL, token);
            setResult(-1, intent);
            finish();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11315v, e10);
            finish();
        }
    }
}
