package com.moe.pushlibrary.activities;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.R;
import di.b;
import gv.n;
import hh.a;
import hh.g;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: MoEActivity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/moe/pushlibrary/activities/MoEActivity;", "Landroidx/fragment/app/p;", "Landroid/os/Bundle;", "savedInstanceState", "Lhs/k;", "onCreate", "", "tag", "Ljava/lang/String;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class MoEActivity extends p {
    private final String tag = "Core_MoEActivity";

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x0008, B:5:0x0017, B:7:0x0025, B:9:0x003e, B:12:0x0045, B:14:0x004b, B:20:0x0057, B:22:0x0065, B:23:0x0099), top: B:28:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x0008, B:5:0x0017, B:7:0x0025, B:9:0x003e, B:12:0x0045, B:14:0x004b, B:20:0x0057, B:22:0x0065, B:23:0x0099), top: B:28:0x0008 }] */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) {
        boolean z10;
        super.onCreate(bundle);
        try {
            Context applicationContext = getApplicationContext();
            i.f(applicationContext, "this.applicationContext");
            if (!b.c(applicationContext)) {
                a aVar = g.f17610d;
                g.a.b(0, new MoEActivity$onCreate$1(this), 3);
                finish();
                return;
            }
            setContentView(R.layout.activity_moe_rich_landing);
            WebView webView = (WebView) findViewById(R.id.moeRichLandingWebView);
            Bundle extras = getIntent().getExtras();
            if (extras != null && extras.containsKey("gcm_webUrl")) {
                String string = extras.getString("gcm_webUrl");
                if (string != null && !n.B0(string)) {
                    z10 = false;
                    if (!z10) {
                        a aVar2 = g.f17610d;
                        g.a.b(0, new MoEActivity$onCreate$2(this), 3);
                        finish();
                        return;
                    }
                    final boolean z11 = extras.getBoolean("isEmbeddedWebView", false);
                    a aVar3 = g.f17610d;
                    g.a.b(0, new MoEActivity$onCreate$3(this, z11), 3);
                    webView.loadUrl(string);
                    WebSettings settings = webView.getSettings();
                    bh.a.f4292a.getClass();
                    bh.a.f4296e.getClass();
                    settings.setJavaScriptEnabled(true);
                    webView.getSettings().setBuiltInZoomControls(true);
                    webView.setWebViewClient(new WebViewClient() { // from class: com.moe.pushlibrary.activities.MoEActivity$onCreate$4
                        @Override // android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView view, String url) {
                            i.g(view, "view");
                            i.g(url, "url");
                            try {
                                a aVar4 = g.f17610d;
                                g.a.b(0, new MoEActivity$onCreate$4$shouldOverrideUrlLoading$1(this, url), 3);
                                Uri parse = Uri.parse(url);
                                String scheme = parse.getScheme();
                                if (z11 && (i.b("http", scheme) || i.b("https", scheme))) {
                                    return false;
                                }
                                this.startActivity(new Intent("android.intent.action.VIEW", parse));
                                return true;
                            } catch (Throwable th2) {
                                a aVar5 = g.f17610d;
                                g.a.a(1, th2, new MoEActivity$onCreate$4$shouldOverrideUrlLoading$2(this));
                                return false;
                            }
                        }
                    });
                    return;
                }
                z10 = true;
                if (!z10) {
                }
            }
            finish();
        } catch (Throwable th2) {
            a aVar4 = g.f17610d;
            g.a.a(1, th2, new MoEActivity$onCreate$5(this));
            g.a.b(0, new MoEActivity$onCreate$6(this), 3);
            finish();
        }
    }
}
