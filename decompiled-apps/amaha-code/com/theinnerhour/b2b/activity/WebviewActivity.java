package com.theinnerhour.b2b.activity;

import android.app.DownloadManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.FileProvider;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.R;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.community.activity.CommunitiesPwaActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dk.i0;
import gv.e;
import gv.n;
import gv.r;
import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ml.q;
import rp.t;
import ss.l;
/* compiled from: WebviewActivity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J \u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0007J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0007J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0007J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0007J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0005H\u0007J\b\u0010\u0015\u001a\u00020\u0002H\u0007JH\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H\u0007J\u0018\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0007J\b\u0010\"\u001a\u00020\u0002H\u0007J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0007J\b\u0010'\u001a\u00020\u0002H\u0007J \u0010+\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005H\u0007J\b\u0010,\u001a\u00020\u0002H\u0007¨\u0006/"}, d2 = {"Lcom/theinnerhour/b2b/activity/WebviewActivity;", "Landroidx/appcompat/app/c;", "Lhs/k;", "closeWebView", "openDialer", "", Constants.NOTIFICATION_URL, "openLink", "openLinkInSameWindow", "title", "body", "shareProvider", "coupon", "copyCoupon", "text", "copyText", "showToast", SessionManager.KEY_NAME, "downloadFile", "bookingDetails", "addToCalendar", "offeringFlowDismiss", "price", "currency", "flow", "providerName", "sessionSlot", "sessionDuration", "sessionMode", "sessionCount", "trackAppsFlyerPurchase", "eventName", "payload", "trackAppsFlyerEvent", "checkAndPromptForPermissions", "type", "", "isTherapy", "bseAccess", "setOverrideHardBack", "lat", "long", "label", "openMap", "openCommunity", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class WebviewActivity extends androidx.appcompat.app.c {
    public static final /* synthetic */ int F = 0;
    public t D;

    /* renamed from: w  reason: collision with root package name */
    public boolean f10564w;

    /* renamed from: x  reason: collision with root package name */
    public String f10565x;

    /* renamed from: y  reason: collision with root package name */
    public String f10566y;
    public final LinkedHashMap E = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f10563v = LogHelper.INSTANCE.makeLogTag("WebviewActivity");

    /* renamed from: z  reason: collision with root package name */
    public final int f10567z = R.styleable.AppCompatTheme_tooltipForegroundColor;
    public final int A = R.styleable.AppCompatTheme_toolbarStyle;
    public final int B = R.styleable.AppCompatTheme_textColorSearchUrl;
    public final String[] C = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};

    /* compiled from: WebviewActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<String, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(String str) {
            String str2;
            String str3 = str;
            WebviewActivity webviewActivity = WebviewActivity.this;
            Intent intent = webviewActivity.getIntent();
            if (intent != null) {
                str2 = intent.getStringExtra(Constants.NOTIFICATION_URL);
            } else {
                str2 = null;
            }
            webviewActivity.r0(str2, str3);
            return hs.k.f19476a;
        }
    }

    /* compiled from: WebviewActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView view, String url) {
            i.g(view, "view");
            i.g(url, "url");
            WebviewActivity webviewActivity = WebviewActivity.this;
            ((ProgressBar) webviewActivity.n0(com.theinnerhour.b2b.R.id.pbCommunitiesPwa)).setVisibility(8);
            if (webviewActivity.f10564w) {
                view.clearHistory();
                webviewActivity.f10564w = false;
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i6, String str, String str2) {
            String string;
            WebviewActivity webviewActivity = WebviewActivity.this;
            ((WebView) webviewActivity.n0(com.theinnerhour.b2b.R.id.wvCommunitiesPwa)).loadData("<html lang=\"en\">\n<head>\n   <meta charset=\"UTF-8\">\n   <title>Page title</title>\n</head>\n<body>\n</body>\n</html>", "text/html", "utf-8");
            ((ProgressBar) webviewActivity.n0(com.theinnerhour.b2b.R.id.pbCommunitiesPwa)).setVisibility(8);
            ((RobertoTextView) webviewActivity.n0(com.theinnerhour.b2b.R.id.tvCommunitiesPwaError)).setVisibility(0);
            ((RobertoButton) webviewActivity.n0(com.theinnerhour.b2b.R.id.btnCommunitiesPwaError)).setVisibility(0);
            webviewActivity.n0(com.theinnerhour.b2b.R.id.bgCommunitiesPwa).setVisibility(0);
            ((AppCompatImageView) webviewActivity.n0(com.theinnerhour.b2b.R.id.ivCommunitiesPwaError)).setVisibility(0);
            RobertoTextView robertoTextView = (RobertoTextView) webviewActivity.n0(com.theinnerhour.b2b.R.id.tvCommunitiesPwaError);
            if (robertoTextView != null) {
                if (is.k.Q1(Integer.valueOf(i6), new Integer[]{-6, -2})) {
                    string = webviewActivity.getString(com.theinnerhour.b2b.R.string.no_internet_msg);
                } else {
                    string = webviewActivity.getString(com.theinnerhour.b2b.R.string.something_went_wrong);
                }
                robertoTextView.setText(string);
            }
            LogHelper logHelper = LogHelper.INSTANCE;
            String str3 = webviewActivity.f10563v;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i6);
            sb2.append(' ');
            if (str2 == null) {
                str2 = "";
            }
            sb2.append(str2);
            sb2.append(' ');
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            logHelper.e(str3, sb2.toString());
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView view, String url) {
            i.g(view, "view");
            i.g(url, "url");
            boolean H0 = n.H0(url, "tel:");
            WebviewActivity webviewActivity = WebviewActivity.this;
            if (H0) {
                webviewActivity.startActivity(new Intent("android.intent.action.DIAL").setData(Uri.parse(url)));
                return true;
            } else if (n.H0(url, "mailto:")) {
                webviewActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                return true;
            } else {
                return super.shouldOverrideUrlLoading(view, url);
            }
        }
    }

    /* compiled from: WebviewActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onPermissionRequest(PermissionRequest request) {
            i.g(request, "request");
            try {
                request.grant(request.getResources());
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(WebviewActivity.this.f10563v, e10);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            WebviewActivity webviewActivity = WebviewActivity.this;
            try {
                int i6 = WebviewActivity.F;
                webviewActivity.getClass();
                webviewActivity.s0();
                return true;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(webviewActivity.f10563v, e10);
                return true;
            }
        }
    }

    @JavascriptInterface
    public final void addToCalendar(String bookingDetails) {
        String absolutePath;
        i.g(bookingDetails, "bookingDetails");
        try {
            File externalFilesDir = getExternalFilesDir(null);
            if (externalFilesDir != null && (absolutePath = externalFilesDir.getAbsolutePath()) != null) {
                File file = new File(absolutePath);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = File.createTempFile("booking_", ".ics", file);
                i.f(file2, "file");
                ca.a.D1(file2, bookingDetails);
                Uri b10 = FileProvider.b(this, getApplicationContext().getPackageName() + ".provider", file2);
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(file2).toString()));
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(b10, mimeTypeFromExtension);
                intent.addFlags(1);
                startActivity(intent);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10563v, e10);
        }
    }

    @JavascriptInterface
    public final void bseAccess(String type, boolean z10) {
        i.g(type, "type");
        String str = "therapy";
        if (i.b(type, "bse_tips")) {
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            if (!z10) {
                str = "psychiatry";
            }
            applicationPersistence.setBooleanValue(Constants.TC_NOTIFICATION_SESSION_TIPS.concat(str), true);
            return;
        }
        ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
        if (!z10) {
            str = "psychiatry";
        }
        applicationPersistence2.setBooleanValue(Constants.TC_NOTIFICATION_PREPARATION_THINGS.concat(str), true);
    }

    @JavascriptInterface
    public final void checkAndPromptForPermissions() {
        if (g0.a.a(this, "android.permission.CAMERA") != 0 || g0.a.a(this, "android.permission.RECORD_AUDIO") != 0) {
            if (!f0.a.f(this, "android.permission.CAMERA") && !f0.a.f(this, "android.permission.RECORD_AUDIO")) {
                f0.a.e(this, this.C, this.B);
            } else {
                o0();
            }
        }
    }

    @JavascriptInterface
    public final void closeWebView() {
        try {
            finish();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10563v, e10);
        }
    }

    @JavascriptInterface
    public final void copyCoupon(String coupon) {
        ClipboardManager clipboardManager;
        i.g(coupon, "coupon");
        try {
            Object systemService = getSystemService("clipboard");
            if (systemService instanceof ClipboardManager) {
                clipboardManager = (ClipboardManager) systemService;
            } else {
                clipboardManager = null;
            }
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("coupon_code_copy", coupon));
            }
            Toast.makeText(this, getString(com.theinnerhour.b2b.R.string.telecommunicationsPackageDiscountCopyToast), 1).show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10563v, e10);
        }
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
            LogHelper.INSTANCE.e(this.f10563v, e10);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0036 -> B:20:0x0046). Please submit an issue!!! */
    @JavascriptInterface
    public final void downloadFile(String url, String name) {
        String str = this.f10563v;
        i.g(url, "url");
        i.g(name, "name");
        try {
            this.f10565x = url;
            this.f10566y = name;
            if (Build.VERSION.SDK_INT < 29 && g0.a.a(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                try {
                    if (f0.a.f(this, "android.permission.READ_EXTERNAL_STORAGE")) {
                        p0();
                    } else {
                        f0.a.e(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, this.A);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str, e10);
                }
            } else {
                q0();
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.E;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final void o0() {
        b.a aVar = new b.a(this);
        AlertController.b bVar = aVar.f1046a;
        bVar.f1036l = true;
        bVar.f1028c = com.theinnerhour.b2b.R.drawable.ic_amaha_logo_white_bg;
        aVar.setTitle("Permission necessary");
        bVar.f1031g = "Camera and Microphone permission is necessary";
        aVar.setPositiveButton(17039379, new i0(this, 0));
        androidx.appcompat.app.b create = aVar.create();
        i.f(create, "alertBuilder.create()");
        create.show();
    }

    @JavascriptInterface
    public final void offeringFlowDismiss() {
        String str;
        HashMap<String, Object> appConfig = FirebasePersistence.getInstance().getUser().getAppConfig();
        if (appConfig != null) {
            appConfig.put("provider_tele_card_day", 4);
        }
        FirebasePersistence.getInstance().updateUserOnFirebase();
        String str2 = gk.a.f16573a;
        Bundle bundle = new Bundle();
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            str = user.getCurrentCourseName();
        } else {
            str = null;
        }
        bundle.putString("course", str);
        hs.k kVar = hs.k.f19476a;
        gk.a.b(bundle, "therapy_psychiatry_not_for_now");
        finish();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.theinnerhour.b2b.R.layout.activity_communities_pwa);
        try {
            u0();
            t0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10563v, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0028 A[Catch: Exception -> 0x000c, TryCatch #0 {Exception -> 0x000c, blocks: (B:4:0x0004, B:13:0x0014, B:15:0x001f, B:19:0x0028, B:21:0x0030), top: B:26:0x0004 }] */
    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        boolean z10;
        WebView webView;
        boolean z11 = false;
        if (keyEvent != null) {
            try {
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f10563v, e10);
            }
            if (keyEvent.getAction() == 0) {
                z10 = true;
                if (z10 && i6 == 4) {
                    webView = (WebView) n0(com.theinnerhour.b2b.R.id.wvCommunitiesPwa);
                    if (webView != null && webView.canGoBack()) {
                        z11 = true;
                    }
                    if (z11) {
                        WebView webView2 = (WebView) n0(com.theinnerhour.b2b.R.id.wvCommunitiesPwa);
                        if (webView2 != null) {
                            webView2.goBack();
                        }
                        return true;
                    }
                }
                return super.onKeyDown(i6, keyEvent);
            }
        }
        z10 = false;
        if (z10) {
            webView = (WebView) n0(com.theinnerhour.b2b.R.id.wvCommunitiesPwa);
            if (webView != null) {
                z11 = true;
            }
            if (z11) {
            }
        }
        return super.onKeyDown(i6, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
        if (r0 != false) goto L20;
     */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onRequestPermissionsResult(int i6, String[] permissions, int[] grantResults) {
        boolean z10;
        boolean z11;
        boolean z12;
        i.g(permissions, "permissions");
        i.g(grantResults, "grantResults");
        if (i6 == this.B) {
            if (grantResults.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int length = grantResults.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (grantResults[i10] != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            z11 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z11 = false;
                        break;
                    }
                }
            }
            Toast.makeText(this, "Permission is needed for live session", 0).show();
            if (!f0.a.f(this, "android.permission.CAMERA") && !f0.a.f(this, "android.permission.RECORD_AUDIO")) {
                b.a aVar = new b.a(this);
                AlertController.b bVar = aVar.f1046a;
                bVar.f1036l = true;
                bVar.f1028c = com.theinnerhour.b2b.R.drawable.ic_amaha_logo_white_bg;
                aVar.setTitle("Permission necessary");
                bVar.f1031g = "Camera and Microphone permissions were denied. Please enable Camera and Microphone permissions in application settings.";
                aVar.setPositiveButton(17039379, new i0(this, 2));
                androidx.appcompat.app.b create = aVar.create();
                i.f(create, "alertBuilder.create()");
                create.show();
            } else {
                o0();
            }
        }
        super.onRequestPermissionsResult(i6, permissions, grantResults);
    }

    @JavascriptInterface
    public final void openCommunity() {
        startActivity(new Intent(this, CommunitiesPwaActivity.class));
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
            LogHelper.INSTANCE.e(this.f10563v, e10);
        }
    }

    @JavascriptInterface
    public final void openLinkInSameWindow(String url) {
        i.g(url, "url");
        try {
            r0(url, null);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10563v, e10);
        }
    }

    @JavascriptInterface
    public final void openMap(String str, String str2, String str3) {
        e.u(str, "lat", str2, "long", str3, "label");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:<" + str + ">,<" + str2 + ">?z=15&q=<" + str + ">,<" + str2 + ">(" + str3 + ')'));
            intent.setPackage("com.google.android.apps.maps");
            startActivity(intent);
        } catch (Exception unused) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:<" + str + ">,<" + str2 + ">?q=<" + str + ">,<" + str2 + ">(" + str3 + ')')));
        }
    }

    public final void p0() {
        try {
            b.a aVar = new b.a(this);
            AlertController.b bVar = aVar.f1046a;
            bVar.f1036l = true;
            bVar.f1028c = com.theinnerhour.b2b.R.drawable.ic_amaha_logo_white_bg;
            aVar.setTitle("Permission necessary");
            bVar.f1031g = "Storage permission is necessary";
            aVar.setPositiveButton(17039379, new i0(this, 1));
            androidx.appcompat.app.b create = aVar.create();
            i.f(create, "alertBuilder.create()");
            create.show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10563v, e10);
        }
    }

    public final void q0() {
        try {
            String str = this.f10565x;
            if (str != null) {
                String str2 = this.f10566y;
                if (str2 == null) {
                    if (r.J0(str, "firebasestorage") && r.J0(str, ".pdf")) {
                        str2 = "file_" + Calendar.getInstance().getTimeInMillis() + ".pdf";
                    } else {
                        String[] strArr = (String[]) new e("/").c(str).toArray(new String[0]);
                        str2 = strArr[strArr.length - 1];
                    }
                }
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                String str3 = Environment.DIRECTORY_DOWNLOADS;
                if (str2 == null) {
                    str2 = "file";
                }
                request.setDestinationInExternalPublicDir(str3, str2);
                request.setNotificationVisibility(1);
                Object systemService = getSystemService("download");
                i.e(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
                ((DownloadManager) systemService).enqueue(request);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10563v, "exception", e10);
        }
    }

    public final void r0(String str, String str2) {
        try {
            if (str == null) {
                Toast.makeText(this, "Something went wrong, please try again", 0).show();
                finish();
                return;
            }
            runOnUiThread(new ni.c(str2, this, str, 4));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10563v, e10);
        }
    }

    public final void s0() {
        Uri uri;
        Uri uri2;
        try {
            int i6 = Build.VERSION.SDK_INT;
            int i10 = this.f10567z;
            if (i6 >= 29) {
                if (!i.b(Build.MANUFACTURER, "samsung")) {
                    uri2 = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                    Intent intent = new Intent("android.intent.action.PICK", uri2);
                    intent.setType("*/*");
                    intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/pdf", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword", "*/*"});
                    startActivityForResult(Intent.createChooser(intent, "Select File"), i10);
                } else {
                    try {
                        Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
                        intent2.setType("*/*");
                        startActivityForResult(Intent.createChooser(intent2, "Select File"), i10);
                    } catch (Exception unused) {
                        uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                        Intent intent3 = new Intent("android.intent.action.PICK", uri);
                        intent3.setType("*/*");
                        intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/pdf", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword", "*/*"});
                        startActivityForResult(Intent.createChooser(intent3, "Select File"), i10);
                    }
                }
            } else {
                Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent4.addCategory("android.intent.category.OPENABLE");
                intent4.setType("*/*");
                intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/pdf", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword", "*/*"});
                startActivityForResult(intent4, i10);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10563v, e10);
        }
    }

    @JavascriptInterface
    public final void setOverrideHardBack() {
        this.f10564w = true;
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
            LogHelper.INSTANCE.e(this.f10563v, e10);
        }
    }

    @JavascriptInterface
    public final void showToast(String text) {
        i.g(text, "text");
        try {
            Toast.makeText(this, text, 1).show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10563v, e10);
        }
    }

    public final void t0() {
        boolean z10;
        String str;
        try {
            Intent intent = getIntent();
            if (intent != null && intent.getBooleanExtra("requireAccessToken", false)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                l0 a10 = new o0(this, new q(new rp.a(0), MyApplication.V.a(), 1)).a(t.class);
                ((t) a10).A.e(this, new dk.a(4, new a()));
                this.D = (t) a10;
                return;
            }
            Intent intent2 = getIntent();
            if (intent2 != null) {
                str = intent2.getStringExtra(Constants.NOTIFICATION_URL);
            } else {
                str = null;
            }
            r0(str, null);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10563v, e10);
        }
    }

    @JavascriptInterface
    public final void trackAppsFlyerEvent(String eventName, String payload) {
        i.g(eventName, "eventName");
        i.g(payload, "payload");
        try {
            if (new gk.e().a()) {
                Object b10 = new sf.i().b(HashMap.class, payload);
                i.e(b10, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
                AppsFlyerLib.getInstance().logEvent(getApplicationContext(), eventName, (HashMap) b10);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10563v, e10);
        }
    }

    @JavascriptInterface
    public final void trackAppsFlyerPurchase(String price, String currency, String flow, String providerName, String sessionSlot, String sessionDuration, String sessionMode, String sessionCount) {
        i.g(price, "price");
        i.g(currency, "currency");
        i.g(flow, "flow");
        i.g(providerName, "providerName");
        i.g(sessionSlot, "sessionSlot");
        i.g(sessionDuration, "sessionDuration");
        i.g(sessionMode, "sessionMode");
        i.g(sessionCount, "sessionCount");
        try {
            if (new gk.e().a()) {
                AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
                Context applicationContext = getApplicationContext();
                HashMap hashMap = new HashMap();
                hashMap.put(AFInAppEventParameterName.REVENUE, price);
                hashMap.put(AFInAppEventParameterName.CURRENCY, currency);
                hashMap.put("flow", flow);
                hashMap.put("providerName", providerName);
                hashMap.put("sessionSlot", sessionSlot);
                hashMap.put("duration", sessionDuration);
                hashMap.put("mode", sessionMode);
                hashMap.put("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                hashMap.put("session_count", sessionCount);
                hs.k kVar = hs.k.f19476a;
                appsFlyerLib.logEvent(applicationContext, AFInAppEventType.PURCHASE, hashMap);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10563v, e10);
        }
    }

    public final void u0() {
        try {
            WebSettings settings = ((WebView) n0(com.theinnerhour.b2b.R.id.wvCommunitiesPwa)).getSettings();
            i.f(settings, "wvCommunitiesPwa.settings");
            settings.setDomStorageEnabled(true);
            settings.setJavaScriptEnabled(true);
            settings.setCacheMode(-1);
            settings.setLoadsImagesAutomatically(true);
            settings.setGeolocationEnabled(false);
            settings.setNeedInitialFocus(false);
            settings.setSaveFormData(false);
            settings.setAllowFileAccess(true);
            settings.setAllowFileAccessFromFileURLs(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            ((ProgressBar) n0(com.theinnerhour.b2b.R.id.pbCommunitiesPwa)).setVisibility(0);
            ((WebView) n0(com.theinnerhour.b2b.R.id.wvCommunitiesPwa)).setWebViewClient(new b());
            ((WebView) n0(com.theinnerhour.b2b.R.id.wvCommunitiesPwa)).addJavascriptInterface(this, "Android");
            ((WebView) n0(com.theinnerhour.b2b.R.id.wvCommunitiesPwa)).setWebChromeClient(new c());
            ((RobertoButton) n0(com.theinnerhour.b2b.R.id.btnCommunitiesPwaError)).setOnClickListener(new w5.i0(11, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10563v, e10);
        }
    }
}
