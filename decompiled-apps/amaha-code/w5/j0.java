package w5;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookServiceException;
import com.theinnerhour.b2b.R;
import h5.a;
import h5.q;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import w5.j0;
/* compiled from: WebDialog.kt */
/* loaded from: classes.dex */
public class j0 extends Dialog {
    public static volatile int G;
    public FrameLayout A;
    public final d B;
    public boolean C;
    public boolean D;
    public boolean E;
    public WindowManager.LayoutParams F;

    /* renamed from: u  reason: collision with root package name */
    public String f36477u;

    /* renamed from: v  reason: collision with root package name */
    public String f36478v;

    /* renamed from: w  reason: collision with root package name */
    public c f36479w;

    /* renamed from: x  reason: collision with root package name */
    public f f36480x;

    /* renamed from: y  reason: collision with root package name */
    public ProgressDialog f36481y;

    /* renamed from: z  reason: collision with root package name */
    public ImageView f36482z;

    /* compiled from: WebDialog.kt */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Context f36483a;

        /* renamed from: b  reason: collision with root package name */
        public final String f36484b;

        /* renamed from: c  reason: collision with root package name */
        public c f36485c;

        /* renamed from: d  reason: collision with root package name */
        public Bundle f36486d;

        public a(androidx.fragment.app.p pVar, String str, Bundle bundle) {
            str = str == null ? e0.q(pVar) : str;
            f0.d(str, "applicationId");
            this.f36484b = str;
            this.f36483a = pVar;
            this.f36486d = bundle;
        }
    }

    /* compiled from: WebDialog.kt */
    /* loaded from: classes.dex */
    public final class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j0 f36487a;

        public b(j0 this$0) {
            kotlin.jvm.internal.i.g(this$0, "this$0");
            this.f36487a = this$0;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView view, String url) {
            ProgressDialog progressDialog;
            kotlin.jvm.internal.i.g(view, "view");
            kotlin.jvm.internal.i.g(url, "url");
            super.onPageFinished(view, url);
            j0 j0Var = this.f36487a;
            if (!j0Var.D && (progressDialog = j0Var.f36481y) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = j0Var.A;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            f fVar = j0Var.f36480x;
            if (fVar != null) {
                fVar.setVisibility(0);
            }
            ImageView imageView = j0Var.f36482z;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            j0Var.E = true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView view, String url, Bitmap bitmap) {
            ProgressDialog progressDialog;
            kotlin.jvm.internal.i.g(view, "view");
            kotlin.jvm.internal.i.g(url, "url");
            e0 e0Var = e0.f36453a;
            kotlin.jvm.internal.i.n(url, "Webview loading URL: ");
            h5.p pVar = h5.p.f17269a;
            super.onPageStarted(view, url, bitmap);
            j0 j0Var = this.f36487a;
            if (!j0Var.D && (progressDialog = j0Var.f36481y) != null) {
                progressDialog.show();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView view, int i6, String description, String failingUrl) {
            kotlin.jvm.internal.i.g(view, "view");
            kotlin.jvm.internal.i.g(description, "description");
            kotlin.jvm.internal.i.g(failingUrl, "failingUrl");
            super.onReceivedError(view, i6, description, failingUrl);
            this.f36487a.e(new FacebookDialogException(description, i6, failingUrl));
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            kotlin.jvm.internal.i.g(view, "view");
            kotlin.jvm.internal.i.g(handler, "handler");
            kotlin.jvm.internal.i.g(error, "error");
            super.onReceivedSslError(view, handler, error);
            handler.cancel();
            this.f36487a.e(new FacebookDialogException(null, -11, null));
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean shouldOverrideUrlLoading(WebView view, String url) {
            boolean z10;
            int i6;
            kotlin.jvm.internal.i.g(view, "view");
            kotlin.jvm.internal.i.g(url, "url");
            e0 e0Var = e0.f36453a;
            kotlin.jvm.internal.i.n(url, "Redirect URL: ");
            h5.p pVar = h5.p.f17269a;
            Uri parse = Uri.parse(url);
            if (parse.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", parse.getPath())) {
                z10 = true;
            } else {
                z10 = false;
            }
            j0 j0Var = this.f36487a;
            if (gv.n.H0(url, j0Var.f36478v)) {
                Bundle c10 = j0Var.c(url);
                String string = c10.getString("error");
                if (string == null) {
                    string = c10.getString("error_type");
                }
                String string2 = c10.getString("error_msg");
                if (string2 == null) {
                    string2 = c10.getString("error_message");
                }
                if (string2 == null) {
                    string2 = c10.getString("error_description");
                }
                String string3 = c10.getString("error_code");
                if (string3 != null && !e0.A(string3)) {
                    try {
                        i6 = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                    }
                    if (!e0.A(string) && e0.A(string2) && i6 == -1) {
                        c cVar = j0Var.f36479w;
                        if (cVar != null && !j0Var.C) {
                            j0Var.C = true;
                            cVar.a(c10, null);
                            j0Var.dismiss();
                        }
                    } else if (string == null && (kotlin.jvm.internal.i.b(string, "access_denied") || kotlin.jvm.internal.i.b(string, "OAuthAccessDeniedException"))) {
                        j0Var.cancel();
                    } else if (i6 != 4201) {
                        j0Var.cancel();
                    } else {
                        j0Var.e(new FacebookServiceException(new h5.n(i6, string, string2), string2));
                    }
                    return true;
                }
                i6 = -1;
                if (!e0.A(string)) {
                }
                if (string == null) {
                }
                if (i6 != 4201) {
                }
                return true;
            } else if (gv.n.H0(url, "fbconnect://cancel")) {
                j0Var.cancel();
                return true;
            } else if (z10 || gv.r.J0(url, "touch")) {
                return false;
            } else {
                try {
                    j0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                    return true;
                } catch (ActivityNotFoundException unused2) {
                    return false;
                }
            }
        }
    }

    /* compiled from: WebDialog.kt */
    /* loaded from: classes.dex */
    public interface c {
        void a(Bundle bundle, FacebookException facebookException);
    }

    /* compiled from: WebDialog.kt */
    /* loaded from: classes.dex */
    public final class d extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a  reason: collision with root package name */
        public final String f36488a;

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f36489b;

        /* renamed from: c  reason: collision with root package name */
        public Exception[] f36490c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ j0 f36491d;

        public d(j0 this$0, String action, Bundle bundle) {
            kotlin.jvm.internal.i.g(this$0, "this$0");
            kotlin.jvm.internal.i.g(action, "action");
            this.f36491d = this$0;
            this.f36488a = action;
            this.f36489b = bundle;
            this.f36490c = new Exception[0];
        }

        /* JADX WARN: Type inference failed for: r10v1, types: [w5.k0] */
        public final String[] a(Void... p02) {
            if (b6.a.b(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.i.g(p02, "p0");
                String[] stringArray = this.f36489b.getStringArray("media");
                if (stringArray == null) {
                    return null;
                }
                final String[] strArr = new String[stringArray.length];
                this.f36490c = new Exception[stringArray.length];
                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                Date date = h5.a.F;
                h5.a b10 = a.b.b();
                try {
                    int length = stringArray.length - 1;
                    if (length >= 0) {
                        final int i6 = 0;
                        while (true) {
                            int i10 = i6 + 1;
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((h5.s) it.next()).cancel(true);
                                }
                                return null;
                            }
                            Uri uri = Uri.parse(stringArray[i6]);
                            if (e0.B(uri)) {
                                strArr[i6] = uri.toString();
                                countDownLatch.countDown();
                            } else {
                                ?? r10 = new q.b() { // from class: w5.k0
                                    @Override // h5.q.b
                                    public final void a(h5.u uVar) {
                                        h5.n nVar;
                                        String str;
                                        int i11 = i6;
                                        String[] results = strArr;
                                        kotlin.jvm.internal.i.g(results, "$results");
                                        j0.d this$0 = this;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        CountDownLatch latch = countDownLatch;
                                        kotlin.jvm.internal.i.g(latch, "$latch");
                                        try {
                                            nVar = uVar.f17318c;
                                            str = "Error staging photo.";
                                        } catch (Exception e10) {
                                            this$0.f36490c[i11] = e10;
                                        }
                                        if (nVar != null) {
                                            String a10 = nVar.a();
                                            if (a10 != null) {
                                                str = a10;
                                            }
                                            throw new FacebookGraphResponseException(uVar, str);
                                        }
                                        JSONObject jSONObject = uVar.f17317b;
                                        if (jSONObject != null) {
                                            String optString = jSONObject.optString("uri");
                                            if (optString != null) {
                                                results[i11] = optString;
                                                latch.countDown();
                                                return;
                                            }
                                            throw new FacebookException("Error staging photo.");
                                        }
                                        throw new FacebookException("Error staging photo.");
                                    }
                                };
                                kotlin.jvm.internal.i.f(uri, "uri");
                                concurrentLinkedQueue.add(sc.b.U(b10, uri, r10).d());
                            }
                            if (i10 > length) {
                                break;
                            }
                            i6 = i10;
                        }
                    }
                    countDownLatch.await();
                    return strArr;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((h5.s) it2.next()).cancel(true);
                    }
                    return null;
                }
            } catch (Throwable th2) {
                b6.a.a(this, th2);
                return null;
            }
        }

        public final void b(String[] strArr) {
            Bundle bundle = this.f36489b;
            j0 j0Var = this.f36491d;
            if (b6.a.b(this)) {
                return;
            }
            try {
                ProgressDialog progressDialog = j0Var.f36481y;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                Exception[] excArr = this.f36490c;
                int length = excArr.length;
                int i6 = 0;
                while (i6 < length) {
                    Exception exc = excArr[i6];
                    i6++;
                    if (exc != null) {
                        j0Var.e(exc);
                        return;
                    }
                }
                if (strArr == null) {
                    j0Var.e(new FacebookException("Failed to stage photos for web dialog"));
                    return;
                }
                List G1 = is.i.G1(strArr);
                if (G1.contains(null)) {
                    j0Var.e(new FacebookException("Failed to stage photos for web dialog"));
                    return;
                }
                e0 e0Var = e0.f36453a;
                e0.G(bundle, new JSONArray((Collection) G1));
                String a10 = a0.a();
                j0Var.f36477u = e0.b(a10, h5.p.d() + "/dialog/" + this.f36488a, bundle).toString();
                ImageView imageView = j0Var.f36482z;
                if (imageView != null) {
                    j0Var.f((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } catch (Throwable th2) {
                b6.a.a(this, th2);
            }
        }

        @Override // android.os.AsyncTask
        public final /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (b6.a.b(this)) {
                return null;
            }
            try {
                return a(voidArr);
            } catch (Throwable th2) {
                b6.a.a(this, th2);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (b6.a.b(this)) {
                return;
            }
            try {
                b(strArr);
            } catch (Throwable th2) {
                b6.a.a(this, th2);
            }
        }
    }

    /* compiled from: WebDialog.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f36492a;

        static {
            int[] iArr = new int[g6.a0.valuesCustom().length];
            iArr[1] = 1;
            f36492a = iArr;
        }
    }

    /* compiled from: WebDialog.kt */
    /* loaded from: classes.dex */
    public static final class f extends WebView {
        public f(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            try {
                super.onWindowFocusChanged(z10);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Context context, String str, Bundle bundle, g6.a0 a0Var, c cVar) {
        super(context, G);
        Uri b10;
        f0.e();
        this.f36478v = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = e0.x(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f36478v = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", h5.p.b());
        String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{"16.0.1"}, 1));
        kotlin.jvm.internal.i.f(format, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", format);
        this.f36479w = cVar;
        if (kotlin.jvm.internal.i.b(str, "share") && bundle.containsKey("media")) {
            this.B = new d(this, str, bundle);
            return;
        }
        if (e.f36492a[a0Var.ordinal()] == 1) {
            b10 = e0.b(a0.b(), "oauth/authorize", bundle);
        } else {
            String a10 = a0.a();
            b10 = e0.b(a10, h5.p.d() + "/dialog/" + ((Object) str), bundle);
        }
        this.f36477u = b10.toString();
    }

    public static int a(float f2, int i6, int i10, int i11) {
        double d10;
        int i12 = (int) (i6 / f2);
        if (i12 <= i10) {
            d10 = 1.0d;
        } else if (i12 >= i11) {
            d10 = 0.5d;
        } else {
            d10 = (((i11 - i12) / (i11 - i10)) * 0.5d) + 0.5d;
        }
        return (int) (i6 * d10);
    }

    public static final void b(Context context) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null) {
                bundle = null;
            } else {
                bundle = applicationInfo.metaData;
            }
            if (bundle != null && G == 0) {
                int i6 = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                if (i6 == 0) {
                    i6 = R.style.com_facebook_activity_theme;
                }
                G = i6;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public Bundle c(String str) {
        Uri parse = Uri.parse(str);
        e0 e0Var = e0.f36453a;
        Bundle F = e0.F(parse.getQuery());
        F.putAll(e0.F(parse.getFragment()));
        return F;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f36479w != null && !this.C) {
            e(new FacebookOperationCanceledException());
        }
    }

    public final void d() {
        int i6;
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            if (i10 < i11) {
                i6 = i10;
            } else {
                i6 = i11;
            }
            if (i10 < i11) {
                i10 = i11;
            }
            int min = Math.min(a(displayMetrics.density, i6, 480, 800), displayMetrics.widthPixels);
            int min2 = Math.min(a(displayMetrics.density, i10, 800, 1280), displayMetrics.heightPixels);
            Window window = getWindow();
            if (window != null) {
                window.setLayout(min, min2);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        f fVar = this.f36480x;
        if (fVar != null) {
            fVar.stopLoading();
        }
        if (!this.D && (progressDialog = this.f36481y) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public final void e(Exception exc) {
        FacebookException facebookException;
        if (this.f36479w != null && !this.C) {
            this.C = true;
            if (exc instanceof FacebookException) {
                facebookException = (FacebookException) exc;
            } else {
                facebookException = new FacebookException(exc);
            }
            c cVar = this.f36479w;
            if (cVar != null) {
                cVar.a(null, facebookException);
            }
            dismiss();
        }
    }

    public final void f(int i6) {
        WebSettings settings;
        WebSettings settings2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        f fVar = new f(getContext());
        this.f36480x = fVar;
        fVar.setVerticalScrollBarEnabled(false);
        f fVar2 = this.f36480x;
        if (fVar2 != null) {
            fVar2.setHorizontalScrollBarEnabled(false);
        }
        f fVar3 = this.f36480x;
        if (fVar3 != null) {
            fVar3.setWebViewClient(new b(this));
        }
        f fVar4 = this.f36480x;
        WebSettings webSettings = null;
        if (fVar4 == null) {
            settings = null;
        } else {
            settings = fVar4.getSettings();
        }
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        f fVar5 = this.f36480x;
        if (fVar5 != null) {
            String str = this.f36477u;
            if (str != null) {
                fVar5.loadUrl(str);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        f fVar6 = this.f36480x;
        if (fVar6 != null) {
            fVar6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        f fVar7 = this.f36480x;
        if (fVar7 != null) {
            fVar7.setVisibility(4);
        }
        f fVar8 = this.f36480x;
        if (fVar8 == null) {
            settings2 = null;
        } else {
            settings2 = fVar8.getSettings();
        }
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        f fVar9 = this.f36480x;
        if (fVar9 != null) {
            webSettings = fVar9.getSettings();
        }
        if (webSettings != null) {
            webSettings.setSaveFormData(false);
        }
        f fVar10 = this.f36480x;
        if (fVar10 != null) {
            fVar10.setFocusable(true);
        }
        f fVar11 = this.f36480x;
        if (fVar11 != null) {
            fVar11.setFocusableInTouchMode(true);
        }
        f fVar12 = this.f36480x;
        if (fVar12 != null) {
            fVar12.setOnTouchListener(new h0(0));
        }
        linearLayout.setPadding(i6, i6, i6, i6);
        linearLayout.addView(this.f36480x);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.A;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        IBinder iBinder;
        Window window;
        WindowManager.LayoutParams attributes;
        IBinder iBinder2;
        Object systemService;
        boolean isAutofillSupported;
        boolean isEnabled;
        boolean z10 = false;
        this.D = false;
        e0 e0Var = e0.f36453a;
        Context context = getContext();
        kotlin.jvm.internal.i.f(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            systemService = context.getSystemService(AutofillManager.class);
            AutofillManager autofillManager = (AutofillManager) systemService;
            if (autofillManager != null) {
                isAutofillSupported = autofillManager.isAutofillSupported();
                if (isAutofillSupported) {
                    isEnabled = autofillManager.isEnabled();
                    if (isEnabled) {
                        z10 = true;
                    }
                }
            }
        }
        if (z10 && (layoutParams = this.F) != null) {
            IBinder iBinder3 = null;
            if (layoutParams == null) {
                iBinder = null;
            } else {
                iBinder = layoutParams.token;
            }
            if (iBinder == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    if (ownerActivity == null) {
                        window = null;
                    } else {
                        window = ownerActivity.getWindow();
                    }
                    if (window == null || (attributes = window.getAttributes()) == null) {
                        iBinder2 = null;
                    } else {
                        iBinder2 = attributes.token;
                    }
                    layoutParams.token = iBinder2;
                }
                WindowManager.LayoutParams layoutParams2 = this.F;
                if (layoutParams2 != null) {
                    iBinder3 = layoutParams2.token;
                }
                kotlin.jvm.internal.i.n(iBinder3, "Set token on onAttachedToWindow(): ");
                h5.p pVar = h5.p.f17269a;
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f36481y = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f36481y;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.f36481y;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f36481y;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: w5.g0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    j0 this$0 = j0.this;
                    kotlin.jvm.internal.i.g(this$0, "this$0");
                    this$0.cancel();
                }
            });
        }
        requestWindowFeature(1);
        this.A = new FrameLayout(getContext());
        d();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f36482z = imageView;
        imageView.setOnClickListener(new i0(0, this));
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.com_facebook_close);
        ImageView imageView2 = this.f36482z;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f36482z;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.f36477u != null) {
            ImageView imageView4 = this.f36482z;
            if (imageView4 != null) {
                f((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        FrameLayout frameLayout = this.A;
        if (frameLayout != null) {
            frameLayout.addView(this.f36482z, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.D = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent event) {
        kotlin.jvm.internal.i.g(event, "event");
        if (i6 == 4) {
            f fVar = this.f36480x;
            if (fVar != null && kotlin.jvm.internal.i.b(Boolean.valueOf(fVar.canGoBack()), Boolean.TRUE)) {
                f fVar2 = this.f36480x;
                if (fVar2 != null) {
                    fVar2.goBack();
                    return true;
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i6, event);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        AsyncTask.Status status;
        super.onStart();
        d dVar = this.B;
        if (dVar != null) {
            if (dVar == null) {
                status = null;
            } else {
                status = dVar.getStatus();
            }
            if (status == AsyncTask.Status.PENDING) {
                if (dVar != null) {
                    dVar.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f36481y;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        d();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        d dVar = this.B;
        if (dVar != null) {
            dVar.cancel(true);
            ProgressDialog progressDialog = this.f36481y;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        kotlin.jvm.internal.i.g(params, "params");
        if (params.token == null) {
            this.F = params;
        }
        super.onWindowAttributesChanged(params);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(androidx.fragment.app.p pVar, String str) {
        super(pVar, r0);
        f0.e();
        int i6 = G;
        if (i6 == 0) {
            f0.e();
            i6 = G;
        }
        this.f36478v = "fbconnect://success";
        this.f36477u = str;
    }
}
