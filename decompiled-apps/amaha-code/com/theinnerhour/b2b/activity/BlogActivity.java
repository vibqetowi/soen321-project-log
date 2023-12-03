package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.bumptech.glide.Glide;
import com.bumptech.glide.e;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Article;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.MascotAnimationUtils;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class BlogActivity extends androidx.appcompat.app.c {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f10314x = 0;

    /* renamed from: v  reason: collision with root package name */
    public ImageView f10315v;

    /* renamed from: w  reason: collision with root package name */
    public WebView f10316w;

    /* loaded from: classes2.dex */
    public class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!str.startsWith("http://") && !str.startsWith("https://")) {
                return false;
            }
            BlogActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i6 = BlogActivity.f10314x;
            BlogActivity blogActivity = BlogActivity.this;
            blogActivity.getClass();
            blogActivity.setResult(-1, new Intent());
            blogActivity.finish();
        }
    }

    public final void n0(ArrayList<Article> arrayList, int i6, String str) {
        try {
            if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getCourseArticleList().contains(str)) {
                FirebasePersistence.getInstance().getUser().getUserGamificationModel().getCourseArticleList().add(str);
                FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(new GamificationModel(5, Constants.GAMIFICATION_READING_ARTICLE_TASK, FirebasePersistence.getInstance().getUser().getCurrentCourseName()));
            }
            RobertoTextView robertoTextView = (RobertoTextView) findViewById(R.id.title);
            Iterator<Article> it = arrayList.iterator();
            while (it.hasNext()) {
                Article next = it.next();
                if ((i6 != -1 && next.getDay() == i6) || (str != null && str.equals(next.get_id()))) {
                    if (next.getThumb() != null) {
                        ImageView imageView = (ImageView) findViewById(R.id.img_art);
                        imageView.setVisibility(0);
                        String replace = next.getThumb().replace(" ", "%20");
                        e<Bitmap> a10 = Glide.c(this).d(this).a();
                        a10.Z = "http:" + replace;
                        a10.f5953b0 = true;
                        a10.B(imageView);
                    }
                    String body = next.getBody();
                    WebView webView = this.f10316w;
                    webView.loadDataWithBaseURL("file:///android_asset/", "<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///android_asset/fonts/Lato-Medium.ttf\")}body {font-family: MyFont;font-size: 13px;color:#9B9DA0;}p{line-height:20px;}h2{padding: 0; margin: 0;line-height:30px;}h3{padding: 0; margin: 0;line-height:30px;}ul li{line-height:20px; padding-bottom:10px;}</style></head><body>" + body + "</body></html>", "text/html", "UTF-8", null);
                    robertoTextView.setText(next.getTitle());
                    Bundle bundle = new Bundle();
                    if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourseName() != null) {
                        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    }
                    bundle.putString("article_id", next.get_id());
                    bundle.putString("article_title", next.getTitle());
                    gk.a.b(bundle, "article_activity");
                    return;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("blogactivity", "exception", e10);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        setResult(-1, new Intent());
        finish();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:6|(2:8|(6:10|11|12|(1:14)(1:17)|15|16)(2:20|(1:22)))|23|11|12|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bd, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e("assessmentactivity", "exception", r10);
        finish();
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098 A[Catch: Exception -> 0x00bc, TryCatch #0 {Exception -> 0x00bc, blocks: (B:15:0x0088, B:17:0x0098, B:18:0x00b8), top: B:24:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8 A[Catch: Exception -> 0x00bc, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bc, blocks: (B:15:0x0088, B:17:0x0098, B:18:0x00b8), top: B:24:0x0088 }] */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String str;
        int i6;
        ArrayList<Article> arrayList;
        super.onCreate(bundle);
        setContentView(R.layout.activity_blog);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        WebView webView = (WebView) findViewById(R.id.webview);
        this.f10316w = webView;
        WebSettings settings = webView.getSettings();
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
        if (FirebasePersistence.getInstance().getUser() == null) {
            finish();
            return;
        }
        String n10 = defpackage.c.n();
        Bundle extras = getIntent().getExtras();
        String str2 = null;
        if (extras != null) {
            if (extras.containsKey("course_position")) {
                i6 = extras.getInt("course_position", 0);
                str = null;
                arrayList = ApplicationPersistence.getInstance().getArticlesMap().get(n10);
                if (arrayList != null) {
                    ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
                    progressBar.setVisibility(0);
                    CourseApiUtil courseApiUtil = new CourseApiUtil();
                    courseApiUtil.setCourseApiListener(new a(progressBar, n10, i6, str));
                    courseApiUtil.getAssets();
                } else {
                    n0(arrayList, i6, str);
                }
                this.f10316w.setWebChromeClient(new b());
                this.f10316w.setWebViewClient(new c());
                ImageView imageView = (ImageView) findViewById(R.id.header_arrow_back);
                this.f10315v = imageView;
                UiUtils.Companion.increaseImageClickArea(imageView);
                this.f10315v.setOnClickListener(new d());
                new MascotAnimationUtils().initMascot(findViewById(R.id.rl_main), getClass().getSimpleName(), Constants.SCREEN_COPING, "Love reading?", "You’ll find a lot of articles in this section that will help you feel better!", "OK, GOT IT", null);
            } else if (extras.containsKey("blog_id")) {
                str2 = extras.getString("blog_id", null);
            }
        }
        str = str2;
        i6 = -1;
        arrayList = ApplicationPersistence.getInstance().getArticlesMap().get(n10);
        if (arrayList != null) {
        }
        this.f10316w.setWebChromeClient(new b());
        this.f10316w.setWebViewClient(new c());
        ImageView imageView2 = (ImageView) findViewById(R.id.header_arrow_back);
        this.f10315v = imageView2;
        UiUtils.Companion.increaseImageClickArea(imageView2);
        this.f10315v.setOnClickListener(new d());
        new MascotAnimationUtils().initMascot(findViewById(R.id.rl_main), getClass().getSimpleName(), Constants.SCREEN_COPING, "Love reading?", "You’ll find a lot of articles in this section that will help you feel better!", "OK, GOT IT", null);
    }

    /* loaded from: classes2.dex */
    public class a implements CourseApiUtil.CourseApiUtilInterface {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ProgressBar f10317u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f10318v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f10319w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f10320x;

        public a(ProgressBar progressBar, String str, int i6, String str2) {
            this.f10317u = progressBar;
            this.f10318v = str;
            this.f10319w = i6;
            this.f10320x = str2;
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void courseApiComplete(boolean z10) {
            this.f10317u.setVisibility(8);
            int i6 = BlogActivity.f10314x;
            BlogActivity.this.n0(ApplicationPersistence.getInstance().getArticlesMap().get(this.f10318v), this.f10319w, this.f10320x);
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void errorLoadingData(Exception exc) {
            BlogActivity.this.finish();
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void audioDownloadComplete() {
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void notificationFetchComplete(boolean z10) {
        }
    }
}
