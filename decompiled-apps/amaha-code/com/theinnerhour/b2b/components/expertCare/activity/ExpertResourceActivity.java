package com.theinnerhour.b2b.components.expertCare.activity;

import android.app.Application;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.lifecycle.o0;
import cn.z0;
import com.bumptech.glide.Glide;
import com.bumptech.glide.e;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertResourceActivity;
import com.theinnerhour.b2b.components.resources.model.PrimaryCategory;
import com.theinnerhour.b2b.components.resources.model.ResourceDetailResponse;
import com.theinnerhour.b2b.components.resources.model.ResourceDetailResponseData;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import hl.p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import kc.f;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
import ta.v;
/* compiled from: ExpertResourceActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/expertCare/activity/ExpertResourceActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ExpertResourceActivity extends androidx.appcompat.app.c {
    public static final /* synthetic */ int C = 0;
    public ResourceDetailResponseData A;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11135v = LogHelper.INSTANCE.makeLogTag("ExpertResourceActivity");

    /* renamed from: w  reason: collision with root package name */
    public vl.b f11136w;

    /* renamed from: x  reason: collision with root package name */
    public ConstraintLayout f11137x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f11138y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f11139z;

    /* compiled from: ExpertResourceActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<ResourceDetailResponse, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(ResourceDetailResponse resourceDetailResponse) {
            ResourceDetailResponseData resourceDetailResponseData;
            String body;
            ResourceDetailResponse resourceDetailResponse2 = resourceDetailResponse;
            if (resourceDetailResponse2 != null) {
                resourceDetailResponseData = resourceDetailResponse2.getResourceDetailResponseData();
            } else {
                resourceDetailResponseData = null;
            }
            if (resourceDetailResponseData != null) {
                ResourceDetailResponseData resourceDetailResponseData2 = resourceDetailResponse2.getResourceDetailResponseData();
                String str = "";
                String str2 = (resourceDetailResponseData2 == null || (str2 = resourceDetailResponseData2.getTitle()) == null) ? "" : "";
                ResourceDetailResponseData resourceDetailResponseData3 = resourceDetailResponse2.getResourceDetailResponseData();
                String str3 = (resourceDetailResponseData3 == null || (str3 = resourceDetailResponseData3.getCover()) == null) ? "" : "";
                ResourceDetailResponseData resourceDetailResponseData4 = resourceDetailResponse2.getResourceDetailResponseData();
                if (resourceDetailResponseData4 != null && (body = resourceDetailResponseData4.getBody()) != null) {
                    str = body;
                }
                int i6 = ExpertResourceActivity.C;
                ExpertResourceActivity expertResourceActivity = ExpertResourceActivity.this;
                expertResourceActivity.s0(str2, str3, str);
                expertResourceActivity.A = resourceDetailResponse2.getResourceDetailResponseData();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExpertResourceActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage cm2) {
            i.g(cm2, "cm");
            return true;
        }
    }

    /* compiled from: ExpertResourceActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView view, String url) {
            i.g(view, "view");
            i.g(url, "url");
            if (!n.H0(url, "http://") && !n.H0(url, "https://")) {
                return false;
            }
            ExpertResourceActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
            return true;
        }
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.B;
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

    public final void o0(String str) {
        try {
            WebView webView = (WebView) n0(R.id.webview);
            webView.loadDataWithBaseURL("file:///android_asset/", "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///android_asset/fonts/Lato-Medium.ttf\")}body {overflow-wrap: break-word;; font-family: MyFont;font-size: 16;color:#465A62; letter-spacing: 0.22;}p{line-height:1.3em; color: #465A62;}h2{padding: 0; margin: 0;line-height:30px;}h3{padding: 0; margin: 0;line-height:30px;}ul li{line-height:1.3em;}</style></head><body style='padding:20 16 70 16;'>" + str + "</body></html>", "text/html", "UTF-8", null);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11135v, e10);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_expert_resource);
        try {
            getWindow().setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
            String str = "";
            if (getIntent().hasExtra("fetchData") && getIntent().getBooleanExtra("fetchData", false)) {
                String stringExtra = getIntent().getStringExtra("slug");
                if (stringExtra != null) {
                    str = stringExtra;
                }
                Application application = getApplication();
                i.f(application, "this@ExpertResourceActivity.application");
                hp.a aVar = (hp.a) new o0(this, new z0(application, 2)).a(hp.a.class);
                aVar.E.e(this, new p(23, new a()));
                try {
                    v.H(f.H(aVar), null, 0, new hp.b(aVar, n.F0(str, " ", "%20"), null), 3);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(aVar.f18073y, e10);
                }
                this.f11139z = false;
            } else {
                Serializable serializableExtra = getIntent().getSerializableExtra("model");
                i.e(serializableExtra, "null cannot be cast to non-null type com.theinnerhour.b2b.components.expertCare.model.ExpertResourceItem");
                this.f11136w = (vl.b) serializableExtra;
                this.f11138y = getIntent().getBooleanExtra("isTherapy", false);
                String f = q0().f();
                if (f == null) {
                    f = "";
                }
                String b10 = q0().b();
                if (b10 == null) {
                    b10 = "";
                }
                String a10 = q0().a();
                if (a10 != null) {
                    str = a10;
                }
                s0(f, b10, str);
                this.f11139z = true;
            }
            ((WebView) n0(R.id.webview)).setWebChromeClient(new b());
            ((WebView) n0(R.id.webview)).setWebViewClient(new c());
            ((AppCompatImageView) n0(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: rl.b

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExpertResourceActivity f30787v;

                {
                    this.f30787v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    PrimaryCategory primaryCategory;
                    Bundle bundleExtra;
                    String str7;
                    int i6 = r2;
                    ExpertResourceActivity this$0 = this.f30787v;
                    switch (i6) {
                        case 0:
                            int i10 = ExpertResourceActivity.C;
                            i.g(this$0, "this$0");
                            this$0.onBackPressed();
                            return;
                        default:
                            int i11 = ExpertResourceActivity.C;
                            i.g(this$0, "this$0");
                            try {
                                File externalFilesDir = this$0.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
                                i.d(externalFilesDir);
                                if (!externalFilesDir.exists()) {
                                    externalFilesDir.mkdirs();
                                }
                                File file = new File(externalFilesDir, "share_image_" + new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date()) + ".jpg");
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                LinearLayout headerContainer = (LinearLayout) this$0.n0(R.id.headerContainer);
                                i.f(headerContainer, "headerContainer");
                                this$0.p0(headerContainer).compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream);
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                Uri b11 = FileProvider.b(this$0, "com.theinnerhour.b2b.provider", file);
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setFlags(268435456);
                                boolean z10 = true;
                                intent.addFlags(1);
                                intent.setClipData(ClipData.newRawUri("", b11));
                                intent.putExtra("android.intent.extra.STREAM", b11);
                                if (this$0.f11136w != null) {
                                    intent.putExtra("android.intent.extra.TEXT", this$0.getString(R.string.resourceShareArticles, this$0.q0().c()));
                                } else {
                                    ResourceDetailResponseData resourceDetailResponseData = this$0.A;
                                    if (resourceDetailResponseData != null) {
                                        intent.putExtra("android.intent.extra.TEXT", this$0.getString(R.string.resourceShareArticles, resourceDetailResponseData.getId()));
                                    }
                                }
                                intent.setType("image/jpg");
                                this$0.startActivity(Intent.createChooser(intent, "Share using"));
                                if (this$0.f11139z) {
                                    String str8 = gk.a.f16573a;
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("source", "app_expert_care");
                                    if (this$0.f11138y) {
                                        str7 = "therapy";
                                    } else {
                                        str7 = "psychiatry";
                                    }
                                    bundle2.putString("flow", str7);
                                    bundle2.putString("slug", this$0.q0().d());
                                    hs.k kVar = hs.k.f19476a;
                                    gk.a.b(bundle2, "resources_article_share_cta");
                                    return;
                                }
                                Intent intent2 = this$0.getIntent();
                                if (intent2 == null || !intent2.hasExtra("share_bundle")) {
                                    z10 = false;
                                }
                                if (z10) {
                                    String str9 = gk.a.f16573a;
                                    Bundle bundle3 = new Bundle();
                                    Intent intent3 = this$0.getIntent();
                                    if (intent3 != null && (bundleExtra = intent3.getBundleExtra("share_bundle")) != null) {
                                        bundle3.putAll(bundleExtra);
                                    }
                                    User user = FirebasePersistence.getInstance().getUser();
                                    String str10 = null;
                                    if (user != null) {
                                        str2 = user.getCurrentCourseName();
                                    } else {
                                        str2 = null;
                                    }
                                    bundle3.putString("course", str2);
                                    User user2 = FirebasePersistence.getInstance().getUser();
                                    if (user2 != null) {
                                        str3 = user2.getCurrentCourseName();
                                    } else {
                                        str3 = null;
                                    }
                                    bundle3.putString("domain", str3);
                                    ResourceDetailResponseData resourceDetailResponseData2 = this$0.A;
                                    if (resourceDetailResponseData2 != null) {
                                        str4 = resourceDetailResponseData2.getId();
                                    } else {
                                        str4 = null;
                                    }
                                    bundle3.putString("post_id", str4);
                                    ResourceDetailResponseData resourceDetailResponseData3 = this$0.A;
                                    if (resourceDetailResponseData3 != null) {
                                        str5 = resourceDetailResponseData3.getEntityType();
                                    } else {
                                        str5 = null;
                                    }
                                    bundle3.putString("post_type", str5);
                                    ResourceDetailResponseData resourceDetailResponseData4 = this$0.A;
                                    if (resourceDetailResponseData4 != null) {
                                        str6 = resourceDetailResponseData4.getTitle();
                                    } else {
                                        str6 = null;
                                    }
                                    bundle3.putString("post_name", str6);
                                    ResourceDetailResponseData resourceDetailResponseData5 = this$0.A;
                                    if (resourceDetailResponseData5 != null && (primaryCategory = resourceDetailResponseData5.getPrimaryCategory()) != null) {
                                        str10 = primaryCategory.getName();
                                    }
                                    bundle3.putString("post_course", str10);
                                    hs.k kVar2 = hs.k.f19476a;
                                    gk.a.b(bundle3, "resources_article_share_cta");
                                    return;
                                }
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f11135v, "exception", e11);
                                return;
                            }
                    }
                }
            });
            ((FloatingActionButton) n0(R.id.fbExpertResourcesFAB)).setOnClickListener(new View.OnClickListener(this) { // from class: rl.b

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExpertResourceActivity f30787v;

                {
                    this.f30787v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    PrimaryCategory primaryCategory;
                    Bundle bundleExtra;
                    String str7;
                    int i6 = r2;
                    ExpertResourceActivity this$0 = this.f30787v;
                    switch (i6) {
                        case 0:
                            int i10 = ExpertResourceActivity.C;
                            i.g(this$0, "this$0");
                            this$0.onBackPressed();
                            return;
                        default:
                            int i11 = ExpertResourceActivity.C;
                            i.g(this$0, "this$0");
                            try {
                                File externalFilesDir = this$0.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
                                i.d(externalFilesDir);
                                if (!externalFilesDir.exists()) {
                                    externalFilesDir.mkdirs();
                                }
                                File file = new File(externalFilesDir, "share_image_" + new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date()) + ".jpg");
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                LinearLayout headerContainer = (LinearLayout) this$0.n0(R.id.headerContainer);
                                i.f(headerContainer, "headerContainer");
                                this$0.p0(headerContainer).compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream);
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                Uri b11 = FileProvider.b(this$0, "com.theinnerhour.b2b.provider", file);
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setFlags(268435456);
                                boolean z10 = true;
                                intent.addFlags(1);
                                intent.setClipData(ClipData.newRawUri("", b11));
                                intent.putExtra("android.intent.extra.STREAM", b11);
                                if (this$0.f11136w != null) {
                                    intent.putExtra("android.intent.extra.TEXT", this$0.getString(R.string.resourceShareArticles, this$0.q0().c()));
                                } else {
                                    ResourceDetailResponseData resourceDetailResponseData = this$0.A;
                                    if (resourceDetailResponseData != null) {
                                        intent.putExtra("android.intent.extra.TEXT", this$0.getString(R.string.resourceShareArticles, resourceDetailResponseData.getId()));
                                    }
                                }
                                intent.setType("image/jpg");
                                this$0.startActivity(Intent.createChooser(intent, "Share using"));
                                if (this$0.f11139z) {
                                    String str8 = gk.a.f16573a;
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("source", "app_expert_care");
                                    if (this$0.f11138y) {
                                        str7 = "therapy";
                                    } else {
                                        str7 = "psychiatry";
                                    }
                                    bundle2.putString("flow", str7);
                                    bundle2.putString("slug", this$0.q0().d());
                                    hs.k kVar = hs.k.f19476a;
                                    gk.a.b(bundle2, "resources_article_share_cta");
                                    return;
                                }
                                Intent intent2 = this$0.getIntent();
                                if (intent2 == null || !intent2.hasExtra("share_bundle")) {
                                    z10 = false;
                                }
                                if (z10) {
                                    String str9 = gk.a.f16573a;
                                    Bundle bundle3 = new Bundle();
                                    Intent intent3 = this$0.getIntent();
                                    if (intent3 != null && (bundleExtra = intent3.getBundleExtra("share_bundle")) != null) {
                                        bundle3.putAll(bundleExtra);
                                    }
                                    User user = FirebasePersistence.getInstance().getUser();
                                    String str10 = null;
                                    if (user != null) {
                                        str2 = user.getCurrentCourseName();
                                    } else {
                                        str2 = null;
                                    }
                                    bundle3.putString("course", str2);
                                    User user2 = FirebasePersistence.getInstance().getUser();
                                    if (user2 != null) {
                                        str3 = user2.getCurrentCourseName();
                                    } else {
                                        str3 = null;
                                    }
                                    bundle3.putString("domain", str3);
                                    ResourceDetailResponseData resourceDetailResponseData2 = this$0.A;
                                    if (resourceDetailResponseData2 != null) {
                                        str4 = resourceDetailResponseData2.getId();
                                    } else {
                                        str4 = null;
                                    }
                                    bundle3.putString("post_id", str4);
                                    ResourceDetailResponseData resourceDetailResponseData3 = this$0.A;
                                    if (resourceDetailResponseData3 != null) {
                                        str5 = resourceDetailResponseData3.getEntityType();
                                    } else {
                                        str5 = null;
                                    }
                                    bundle3.putString("post_type", str5);
                                    ResourceDetailResponseData resourceDetailResponseData4 = this$0.A;
                                    if (resourceDetailResponseData4 != null) {
                                        str6 = resourceDetailResponseData4.getTitle();
                                    } else {
                                        str6 = null;
                                    }
                                    bundle3.putString("post_name", str6);
                                    ResourceDetailResponseData resourceDetailResponseData5 = this$0.A;
                                    if (resourceDetailResponseData5 != null && (primaryCategory = resourceDetailResponseData5.getPrimaryCategory()) != null) {
                                        str10 = primaryCategory.getName();
                                    }
                                    bundle3.putString("post_course", str10);
                                    hs.k kVar2 = hs.k.f19476a;
                                    gk.a.b(bundle3, "resources_article_share_cta");
                                    return;
                                }
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f11135v, "exception", e11);
                                return;
                            }
                    }
                }
            });
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.f11135v, e11);
        }
    }

    public final Bitmap p0(View view) {
        Bitmap returnedBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(returnedBitmap);
            Drawable background = view.getBackground();
            if (background != null) {
                background.draw(canvas);
            } else {
                canvas.drawColor(-1);
            }
            view.draw(canvas);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11135v, e10);
        }
        i.f(returnedBitmap, "returnedBitmap");
        return returnedBitmap;
    }

    public final vl.b q0() {
        vl.b bVar = this.f11136w;
        if (bVar != null) {
            return bVar;
        }
        i.q("model");
        throw null;
    }

    public final void r0(String str) {
        try {
            ((RobertoTextView) n0(R.id.tvExpertResourcesDescription)).setVisibility(8);
            ((WebView) n0(R.id.webview)).setVisibility(0);
            ((RobertoTextView) n0(R.id.tvExpertResourcesDescription)).setVisibility(8);
            WebSettings settings = ((WebView) n0(R.id.webview)).getSettings();
            i.f(settings, "webview.settings");
            settings.setDomStorageEnabled(true);
            settings.setJavaScriptEnabled(true);
            settings.setCacheMode(-1);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setCacheMode(2);
            settings.setBlockNetworkImage(true);
            settings.setLoadsImagesAutomatically(true);
            settings.setGeolocationEnabled(false);
            settings.setNeedInitialFocus(false);
            settings.setSaveFormData(false);
            settings.setAllowFileAccessFromFileURLs(true);
            o0(str);
            if (FirebasePersistence.getInstance().getUser() == null) {
                finish();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11135v, e10);
        }
    }

    public final void s0(String str, String str2, String str3) {
        try {
            View inflate = getLayoutInflater().inflate(R.layout.layout_article, (ViewGroup) ((LinearLayout) n0(R.id.headerContainer)), false);
            i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            this.f11137x = (ConstraintLayout) inflate;
            ((RobertoTextView) n0(R.id.tvExpertResourcesTitle)).setText(str);
            r0(str3);
            e<Bitmap> a10 = Glide.c(this).d(this).a();
            a10.Z = "https:".concat(str2);
            a10.f5953b0 = true;
            ConstraintLayout constraintLayout = this.f11137x;
            if (constraintLayout != null) {
                a10.B((AppCompatImageView) constraintLayout.findViewById(R.id.articleHeaderImage));
                ((AppCompatImageView) n0(R.id.ivClose)).setColorFilter(g0.a.b(this, R.color.white), PorterDuff.Mode.SRC_ATOP);
                LinearLayout linearLayout = (LinearLayout) n0(R.id.headerContainer);
                ConstraintLayout constraintLayout2 = this.f11137x;
                if (constraintLayout2 != null) {
                    linearLayout.addView(constraintLayout2);
                    return;
                } else {
                    i.q("heading");
                    throw null;
                }
            }
            i.q("heading");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11135v, "WebView Load failed", e10);
        }
    }
}
