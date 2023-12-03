package com.theinnerhour.b2b.activity;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
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
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.persistence.StatPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hc.d;
import hs.k;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import w5.i0;
/* compiled from: BotPwaActivity.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0007¨\u0006\u000e"}, d2 = {"Lcom/theinnerhour/b2b/activity/BotPwaActivity;", "Landroidx/appcompat/app/c;", "", Constants.API_COURSE_LINK, "Lhs/k;", "openActivity", "data", "toast", "closeWebView", "resetBotStats", "text", "copyText", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class BotPwaActivity extends c {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f10324y = 0;

    /* renamed from: v  reason: collision with root package name */
    public final String f10325v;

    /* renamed from: w  reason: collision with root package name */
    public yp.a f10326w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f10327x;

    /* compiled from: BotPwaActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView view, String url) {
            ProgressBar progressBar;
            i.g(view, "view");
            i.g(url, "url");
            yp.a aVar = BotPwaActivity.this.f10326w;
            if (aVar != null && (progressBar = aVar.f38708e) != null) {
                Extensions.INSTANCE.gone(progressBar);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x0028, B:9:0x002b, B:14:0x0033), top: B:19:0x0004 }] */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Uri url;
            k kVar;
            BotPwaActivity botPwaActivity = BotPwaActivity.this;
            if (webResourceRequest != null) {
                try {
                    url = webResourceRequest.getUrl();
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(botPwaActivity.f10325v, e10);
                }
                if (url != null) {
                    Pattern compile = Pattern.compile("firebasestorage|assets.theinnerhour.com|faceboook|heapanalytics|moengage|mixpanel|bugsnag|onelink|analytics|appsflyer");
                    i.f(compile, "compile(pattern)");
                    String uri = url.toString();
                    i.f(uri, "it.toString()");
                    if (!compile.matcher(uri).find()) {
                        BotPwaActivity.n0(botPwaActivity, webResourceRequest, webResourceError);
                    }
                    kVar = k.f19476a;
                    if (kVar == null) {
                        BotPwaActivity.n0(botPwaActivity, webResourceRequest, webResourceError);
                    }
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                }
            }
            kVar = null;
            if (kVar == null) {
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
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

    /* compiled from: BotPwaActivity.kt */
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

    public BotPwaActivity() {
        new LinkedHashMap();
        this.f10325v = LogHelper.INSTANCE.makeLogTag("BotPwaActivity");
    }

    public static final void n0(BotPwaActivity botPwaActivity, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Integer num;
        String str;
        WebView webView;
        Uri url;
        int errorCode;
        AppCompatImageView appCompatImageView;
        View view;
        RobertoButton robertoButton;
        RobertoTextView robertoTextView;
        ProgressBar progressBar;
        String str2 = botPwaActivity.f10325v;
        try {
            yp.a aVar = botPwaActivity.f10326w;
            if (aVar != null && (progressBar = aVar.f38708e) != null) {
                Extensions.INSTANCE.gone(progressBar);
            }
            yp.a aVar2 = botPwaActivity.f10326w;
            if (aVar2 != null && (robertoTextView = aVar2.f) != null) {
                Extensions.INSTANCE.visible(robertoTextView);
            }
            yp.a aVar3 = botPwaActivity.f10326w;
            if (aVar3 != null && (robertoButton = aVar3.f38706c) != null) {
                Extensions.INSTANCE.visible(robertoButton);
            }
            yp.a aVar4 = botPwaActivity.f10326w;
            if (aVar4 != null && (view = aVar4.f38705b) != null) {
                Extensions.INSTANCE.visible(view);
            }
            yp.a aVar5 = botPwaActivity.f10326w;
            if (aVar5 != null && (appCompatImageView = aVar5.f38707d) != null) {
                Extensions.INSTANCE.visible(appCompatImageView);
            }
            LogHelper logHelper = LogHelper.INSTANCE;
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
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                str = url.toString();
            } else {
                str = null;
            }
            sb2.append(str);
            sb2.append(' ');
            if (webResourceError != null) {
                charSequence = webResourceError.getDescription();
            }
            sb2.append((Object) charSequence);
            logHelper.e(str2, sb2.toString());
            yp.a aVar6 = botPwaActivity.f10326w;
            if (aVar6 != null && (webView = aVar6.f38709g) != null) {
                webView.loadData("<html lang=\"en\">\n<head>\n   <meta charset=\"UTF-8\">\n   <title>Page title</title>\n</head>\n<body>\n</body>\n</html>", "text/html", "utf-8");
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str2, e10);
        }
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        boolean z10;
        if (Build.VERSION.SDK_INT < 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        super.applyOverrideConfiguration(configuration);
    }

    @JavascriptInterface
    public final void closeWebView() {
        finish();
    }

    @JavascriptInterface
    public final void copyText(String text) {
        ClipboardManager clipboardManager;
        i.g(text, "text");
        try {
            Object systemService = getSystemService("clipboard");
            if (systemService instanceof ClipboardManager) {
                clipboardManager = (ClipboardManager) systemService;
            } else {
                clipboardManager = null;
            }
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("ih_pwa_copy", text));
            }
            Toast.makeText(this, getString(R.string.telecommunicationsCopyToast), 1).show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10325v, e10);
        }
    }

    public final void o0() {
        WebView webView;
        String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_UID);
        i.f(stringValue, "getInstance().getStringValue(KEY_UID)");
        Charset UTF_8 = StandardCharsets.UTF_8;
        i.f(UTF_8, "UTF_8");
        byte[] bytes = stringValue.getBytes(UTF_8);
        i.f(bytes, "this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        yp.a aVar = this.f10326w;
        if (aVar != null && (webView = aVar.f38709g) != null) {
            webView.loadUrl("https://bot.theinnerhour.com/bot/ih_android/" + SessionManager.getInstance().getStringValue(SessionManager.KEY_UUID) + '/' + encodeToString);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        WebSettings webSettings;
        WebView webView;
        WebView webView2;
        RobertoButton robertoButton;
        WebView webView3;
        ProgressBar progressBar;
        WebView webView4;
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_bot_pwa, (ViewGroup) null, false);
        int i6 = R.id.botErrorBG;
        View w10 = d.w(R.id.botErrorBG, inflate);
        if (w10 != null) {
            i6 = R.id.botErrorButton;
            RobertoButton robertoButton2 = (RobertoButton) d.w(R.id.botErrorButton, inflate);
            if (robertoButton2 != null) {
                i6 = R.id.botErrorImg;
                AppCompatImageView appCompatImageView = (AppCompatImageView) d.w(R.id.botErrorImg, inflate);
                if (appCompatImageView != null) {
                    i6 = R.id.botErrorText;
                    RobertoTextView robertoTextView = (RobertoTextView) d.w(R.id.botErrorText, inflate);
                    if (robertoTextView != null) {
                        i6 = R.id.botProgressBar;
                        ProgressBar progressBar2 = (ProgressBar) d.w(R.id.botProgressBar, inflate);
                        if (progressBar2 != null) {
                            i6 = R.id.webview;
                            WebView webView5 = (WebView) d.w(R.id.webview, inflate);
                            if (webView5 != null) {
                                yp.a aVar = new yp.a((ConstraintLayout) inflate, w10, robertoButton2, appCompatImageView, robertoTextView, progressBar2, webView5);
                                this.f10326w = aVar;
                                setContentView(aVar.a());
                                yp.a aVar2 = this.f10326w;
                                if (aVar2 != null && (webView4 = aVar2.f38709g) != null) {
                                    webSettings = webView4.getSettings();
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
                                yp.a aVar3 = this.f10326w;
                                if (aVar3 != null && (progressBar = aVar3.f38708e) != null) {
                                    Extensions.INSTANCE.visible(progressBar);
                                }
                                yp.a aVar4 = this.f10326w;
                                if (aVar4 != null) {
                                    webView = aVar4.f38709g;
                                } else {
                                    webView = null;
                                }
                                if (webView != null) {
                                    webView.setWebViewClient(new a());
                                }
                                yp.a aVar5 = this.f10326w;
                                if (aVar5 != null) {
                                    webView2 = aVar5.f38709g;
                                } else {
                                    webView2 = null;
                                }
                                if (webView2 != null) {
                                    webView2.setWebChromeClient(new b());
                                }
                                yp.a aVar6 = this.f10326w;
                                if (aVar6 != null && (webView3 = aVar6.f38709g) != null) {
                                    webView3.addJavascriptInterface(this, "Android");
                                }
                                o0();
                                yp.a aVar7 = this.f10326w;
                                if (aVar7 != null && (robertoButton = aVar7.f38706c) != null) {
                                    robertoButton.setOnClickListener(new i0(6, this));
                                }
                                StatPersistence.updateAllieTrackCount$default(StatPersistence.INSTANCE, null, 1, null);
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
            if (!this.f10327x) {
                yp.a aVar = this.f10326w;
                if (aVar != null && (webView7 = aVar.f38709g) != null) {
                    webView7.clearHistory();
                }
                yp.a aVar2 = this.f10326w;
                if (aVar2 != null && (webView6 = aVar2.f38709g) != null) {
                    webView6.clearCache(true);
                }
                yp.a aVar3 = this.f10326w;
                if (aVar3 != null && (webView5 = aVar3.f38709g) != null) {
                    webView5.loadUrl("about:blank");
                }
                yp.a aVar4 = this.f10326w;
                if (aVar4 != null && (webView4 = aVar4.f38709g) != null) {
                    webView4.removeAllViews();
                }
                yp.a aVar5 = this.f10326w;
                if (aVar5 != null && (webView3 = aVar5.f38709g) != null) {
                    webView3.destroyDrawingCache();
                }
                yp.a aVar6 = this.f10326w;
                if (aVar6 != null && (webView2 = aVar6.f38709g) != null) {
                    webView2.pauseTimers();
                }
                yp.a aVar7 = this.f10326w;
                if (aVar7 != null && (webView = aVar7.f38709g) != null) {
                    webView.destroy();
                }
            }
            this.f10326w = null;
            super.onDestroy();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10325v, "exception", e10);
        }
    }

    @JavascriptInterface
    public final void openActivity(String link) {
        i.g(link, "link");
        switch (link.hashCode()) {
            case -1223173142:
                if (link.equals("gotoPlayStore")) {
                    try {
                        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + getPackageName())));
                    } catch (ActivityNotFoundException unused) {
                        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));
                    }
                    finish();
                    return;
                }
                return;
            case -1163766011:
                if (link.equals("bookingDirector")) {
                    this.f10327x = true;
                    startActivity(new Intent(this, TelecommunicationsPWAActivity.class));
                    finish();
                    return;
                }
                return;
            case -611292322:
                if (link.equals("userProfile")) {
                    startActivity(new Intent(this, ExperimentProfileActivity.class));
                    finish();
                    return;
                }
                return;
            case 916140809:
                if (link.equals("userDashboard")) {
                    finish();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @JavascriptInterface
    public final void resetBotStats() {
        StatPersistence.INSTANCE.updateAllieTrackCount(0L);
    }

    @JavascriptInterface
    public final void toast(String data) {
        i.g(data, "data");
        Utils.INSTANCE.showCustomToast(this, data);
    }
}
