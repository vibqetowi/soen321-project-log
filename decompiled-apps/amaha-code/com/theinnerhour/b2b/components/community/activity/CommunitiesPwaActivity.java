package com.theinnerhour.b2b.components.community.activity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.lifecycle.o0;
import androidx.lifecycle.w;
import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import gv.n;
import gv.r;
import ik.j1;
import java.util.LinkedHashMap;
import kc.f;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.e0;
import r1.b0;
import ss.l;
import t0.u0;
import ta.v;
import v.g;
import v.h;
/* compiled from: CommunitiesPwaActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0007J \u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u0010"}, d2 = {"Lcom/theinnerhour/b2b/components/community/activity/CommunitiesPwaActivity;", "Landroidx/appcompat/app/c;", "Lhs/k;", "closeWebView", "openDialer", "", Constants.NOTIFICATION_URL, "openLink", "text", "copyText", "showToast", "title", "body", "shareProvider", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CommunitiesPwaActivity extends androidx.appcompat.app.c {
    public static final /* synthetic */ int C = 0;
    public String A;
    public final String B;

    /* renamed from: v  reason: collision with root package name */
    public final String f10633v;

    /* renamed from: w  reason: collision with root package name */
    public yp.a f10634w;

    /* renamed from: x  reason: collision with root package name */
    public yk.b f10635x;

    /* renamed from: y  reason: collision with root package name */
    public ValueCallback<Uri[]> f10636y;

    /* renamed from: z  reason: collision with root package name */
    public final int f10637z;

    /* compiled from: CommunitiesPwaActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<String, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(String str) {
            boolean z10;
            String str2 = str;
            if (str2 != null) {
                CommunitiesPwaActivity communitiesPwaActivity = CommunitiesPwaActivity.this;
                String str3 = communitiesPwaActivity.A;
                boolean z11 = true;
                boolean z12 = false;
                if (str3 != null && !n.B0(str3)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                hs.k kVar = null;
                if (z10) {
                    str3 = null;
                }
                String str4 = communitiesPwaActivity.B;
                if (str3 != null) {
                    StringBuilder c10 = h.c(str3);
                    String str5 = "?";
                    if (r.J0(str3, "?")) {
                        str5 = "&";
                    }
                    c10.append(str5);
                    c10.append("token=");
                    c10.append(str2);
                    c10.append("&variant=");
                    String b10 = b0.b(c10, str4, "&platform=android&source=app_homescreen");
                    Intent intent = communitiesPwaActivity.getIntent();
                    if ((intent == null || !intent.hasExtra("isAnonymous")) ? false : false) {
                        StringBuilder d10 = g.d(b10, "&isAnonymous=");
                        Intent intent2 = communitiesPwaActivity.getIntent();
                        if (intent2 != null) {
                            z12 = intent2.getBooleanExtra("isAnonymous", false);
                        }
                        d10.append(z12);
                        b10 = d10.toString();
                    }
                    CommunitiesPwaActivity.n0(communitiesPwaActivity, b10);
                    kVar = hs.k.f19476a;
                }
                if (kVar == null) {
                    CommunitiesPwaActivity.n0(communitiesPwaActivity, "https://community.amahahealth.com/switch?token=" + str2 + "&variant=" + str4 + "&platform=android&source=app_homescreen");
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: CommunitiesPwaActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<Boolean, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            ProgressBar progressBar;
            Boolean bool2 = bool;
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                CommunitiesPwaActivity communitiesPwaActivity = CommunitiesPwaActivity.this;
                yp.a aVar = communitiesPwaActivity.f10634w;
                if (aVar != null && (progressBar = aVar.f38708e) != null) {
                    Extensions.INSTANCE.gone(progressBar);
                }
                if (booleanValue) {
                    communitiesPwaActivity.onBackPressed();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: CommunitiesPwaActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements l<String, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(String str) {
            String str2 = str;
            if (str2 != null) {
                Toast.makeText(CommunitiesPwaActivity.this, str2, 1).show();
            }
            return hs.k.f19476a;
        }
    }

    public CommunitiesPwaActivity() {
        new LinkedHashMap();
        this.f10633v = LogHelper.INSTANCE.makeLogTag("CommunitiesPwa");
        this.f10637z = R.styleable.AppCompatTheme_tooltipForegroundColor;
        this.B = e0.n();
    }

    public static final void n0(CommunitiesPwaActivity communitiesPwaActivity, String str) {
        WebSettings webSettings;
        WebView webView;
        RobertoButton robertoButton;
        WebView webView2;
        WebView webView3;
        ProgressBar progressBar;
        WebView webView4;
        String str2 = communitiesPwaActivity.f10633v;
        try {
            yp.a aVar = communitiesPwaActivity.f10634w;
            WebView webView5 = null;
            if (aVar != null && (webView4 = aVar.f38709g) != null) {
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
            yp.a aVar2 = communitiesPwaActivity.f10634w;
            if (aVar2 != null && (progressBar = aVar2.f38708e) != null) {
                Extensions.INSTANCE.visible(progressBar);
            }
            yp.a aVar3 = communitiesPwaActivity.f10634w;
            if (aVar3 != null) {
                webView = aVar3.f38709g;
            } else {
                webView = null;
            }
            if (webView != null) {
                webView.setWebViewClient(new sk.a(communitiesPwaActivity));
            }
            yp.a aVar4 = communitiesPwaActivity.f10634w;
            if (aVar4 != null) {
                webView5 = aVar4.f38709g;
            }
            if (webView5 != null) {
                webView5.setWebChromeClient(new sk.b(communitiesPwaActivity));
            }
            yp.a aVar5 = communitiesPwaActivity.f10634w;
            if (aVar5 != null && (webView3 = aVar5.f38709g) != null) {
                webView3.addJavascriptInterface(communitiesPwaActivity, "Android");
            }
            try {
                yp.a aVar6 = communitiesPwaActivity.f10634w;
                if (aVar6 != null && (webView2 = aVar6.f38709g) != null) {
                    webView2.loadUrl(str);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str2, e10);
            }
            yp.a aVar7 = communitiesPwaActivity.f10634w;
            if (aVar7 != null && (robertoButton = aVar7.f38706c) != null) {
                robertoButton.setOnClickListener(new j1(communitiesPwaActivity, 4, str));
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str2, e11);
        }
    }

    @JavascriptInterface
    public final void closeWebView() {
        Intent intent = new Intent();
        intent.putExtra("ACTIVITY_SUCCESS", true);
        setResult(-1, intent);
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
            Toast.makeText(this, getString(com.theinnerhour.b2b.R.string.telecommunicationsCopyToast), 1).show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10633v, e10);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        Uri uri;
        super.onActivityResult(i6, i10, intent);
        try {
            if (i6 == this.f10637z) {
                if (i10 == -1) {
                    Uri[] uriArr = new Uri[1];
                    if (intent != null) {
                        uri = intent.getData();
                    } else {
                        uri = null;
                    }
                    i.d(uri);
                    uriArr[0] = uri;
                    ValueCallback<Uri[]> valueCallback = this.f10636y;
                    if (valueCallback != null) {
                        valueCallback.onReceiveValue(uriArr);
                    }
                }
                this.f10636y = null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10633v, "exception", e10);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        u0.e aVar;
        u0.e eVar;
        String str2 = this.f10633v;
        super.onCreate(bundle);
        try {
            yp.a b10 = yp.a.b(getLayoutInflater());
            this.f10634w = b10;
            setContentView(b10.f38704a);
            Intent intent = getIntent();
            if (intent != null) {
                str = intent.getStringExtra("redirect_url");
            } else {
                str = null;
            }
            this.A = str;
            boolean z10 = true;
            try {
                Window window = getWindow();
                if (Build.VERSION.SDK_INT >= 23) {
                    View decorView = window.getDecorView();
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 30) {
                        eVar = new u0.d(window);
                    } else {
                        if (i6 >= 26) {
                            aVar = new u0.c(decorView, window);
                        } else if (i6 >= 23) {
                            aVar = new u0.b(decorView, window);
                        } else {
                            aVar = new u0.a(decorView, window);
                        }
                        eVar = aVar;
                    }
                    eVar.d(true);
                }
                window.setStatusBarColor(g0.a.b(this, com.theinnerhour.b2b.R.color.white));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str2, "Error in setting custom status bar", e10);
            }
            yk.b bVar = (yk.b) new o0(this).a(yk.b.class);
            this.f10635x = bVar;
            if (bVar != null) {
                try {
                    v.H(f.H(bVar), null, 0, new yk.a(bVar, "https://api.theinnerhour.com/v1/giveaccesstoken", null), 3);
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(bVar.f38663y, e11);
                }
                yk.b bVar2 = this.f10635x;
                if (bVar2 != null) {
                    w<String> wVar = bVar2.f38664z;
                    if (wVar.f2358c <= 0) {
                        z10 = false;
                    }
                    if (!z10) {
                        if (bVar2 != null) {
                            wVar.e(this, new dk.a(7, new a()));
                        } else {
                            i.q("communitiesPwaViewModel");
                            throw null;
                        }
                    }
                    yk.b bVar3 = this.f10635x;
                    if (bVar3 != null) {
                        bVar3.B.e(this, new dk.a(8, new b()));
                        yk.b bVar4 = this.f10635x;
                        if (bVar4 != null) {
                            bVar4.A.e(this, new dk.a(9, new c()));
                            return;
                        } else {
                            i.q("communitiesPwaViewModel");
                            throw null;
                        }
                    }
                    i.q("communitiesPwaViewModel");
                    throw null;
                }
                i.q("communitiesPwaViewModel");
                throw null;
            }
            i.q("communitiesPwaViewModel");
            throw null;
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(str2, e12);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        yk.b bVar = this.f10635x;
        if (bVar != null) {
            if (bVar != null) {
                bVar.f38664z.k(this);
                yk.b bVar2 = this.f10635x;
                if (bVar2 != null) {
                    bVar2.B.k(this);
                    yk.b bVar3 = this.f10635x;
                    if (bVar3 != null) {
                        bVar3.A.k(this);
                    } else {
                        i.q("communitiesPwaViewModel");
                        throw null;
                    }
                } else {
                    i.q("communitiesPwaViewModel");
                    throw null;
                }
            } else {
                i.q("communitiesPwaViewModel");
                throw null;
            }
        }
        this.f10634w = null;
    }

    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent event) {
        WebView webView;
        WebView webView2;
        i.g(event, "event");
        if (event.getAction() == 0 && i6 == 4) {
            yp.a aVar = this.f10634w;
            boolean z10 = false;
            if (aVar != null && (webView2 = aVar.f38709g) != null && webView2.canGoBack()) {
                z10 = true;
            }
            if (z10) {
                yp.a aVar2 = this.f10634w;
                if (aVar2 != null && (webView = aVar2.f38709g) != null) {
                    webView.goBack();
                }
                return true;
            }
            setResult(-1, new Intent());
            finish();
            return super.onKeyDown(i6, event);
        }
        return super.onKeyDown(i6, event);
    }

    @JavascriptInterface
    public final void openDialer() {
        startActivity(new Intent("android.intent.action.DIAL"));
    }

    @JavascriptInterface
    public final void openLink(String url) {
        i.g(url, "url");
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10633v, e10);
        }
    }

    @JavascriptInterface
    public final void shareProvider(String str, String str2, String str3) {
        e.u(str, "title", str2, "body", str3, Constants.NOTIFICATION_URL);
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TITLE", str);
            intent.putExtra("android.intent.extra.TEXT", str2 + ": " + str3);
            startActivity(Intent.createChooser(intent, "Share using"));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10633v, e10);
        }
    }

    @JavascriptInterface
    public final void showToast(String text) {
        i.g(text, "text");
        try {
            Toast.makeText(this, text, 1).show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10633v, e10);
        }
    }
}
