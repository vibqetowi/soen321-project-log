package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import com.bumptech.glide.Glide;
import com.bumptech.glide.e;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.LearningHubArticleActivity;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.LearningHubFieldModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: LearningHubArticleActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/LearningHubArticleActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class LearningHubArticleActivity extends c {
    public static final /* synthetic */ int A = 0;

    /* renamed from: w  reason: collision with root package name */
    public LearningHubModel f10435w;

    /* renamed from: x  reason: collision with root package name */
    public ConstraintLayout f10436x;

    /* renamed from: y  reason: collision with root package name */
    public AppCompatImageView f10437y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f10438z = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f10434v = LogHelper.INSTANCE.makeLogTag(LearningHubArticleActivity.class);

    /* compiled from: LearningHubArticleActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage cm2) {
            i.g(cm2, "cm");
            return true;
        }
    }

    /* compiled from: LearningHubArticleActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView view, String url) {
            i.g(view, "view");
            i.g(url, "url");
            if (!n.H0(url, "http://") && !n.H0(url, "https://")) {
                return false;
            }
            LearningHubArticleActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
            return true;
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

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.f10438z;
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

    public final LearningHubModel o0() {
        LearningHubModel learningHubModel = this.f10435w;
        if (learningHubModel != null) {
            return learningHubModel;
        }
        i.q("model");
        throw null;
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        super.onCreate(bundle);
        setContentView(R.layout.activity_learning_hub_article);
        try {
            Serializable serializableExtra = getIntent().getSerializableExtra("model");
            i.e(serializableExtra, "null cannot be cast to non-null type com.theinnerhour.b2b.model.LearningHubModel");
            this.f10435w = (LearningHubModel) serializableExtra;
            ArrayList<LearningHubFieldModel> fields = o0().getFields();
            String post_type = o0().getPost_type();
            if (post_type != null) {
                switch (post_type.hashCode()) {
                    case -1864532585:
                        if (!post_type.equals("Quotes")) {
                            break;
                        } else {
                            getWindow().setStatusBarColor(g0.a.b(this, R.color.statusbar_dark_blue));
                            View inflate = getLayoutInflater().inflate(R.layout.layout_quotes, (ViewGroup) ((LinearLayout) n0(R.id.headerContainer)), false);
                            i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                            this.f10436x = constraintLayout;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) constraintLayout.findViewById(R.id.quotesLogo);
                            i.f(appCompatImageView, "heading.quotesLogo");
                            this.f10437y = appCompatImageView;
                            Iterator<LearningHubFieldModel> it = fields.iterator();
                            while (it.hasNext()) {
                                LearningHubFieldModel next = it.next();
                                if (i.b(next.getData_title(), "short_desc")) {
                                    ConstraintLayout constraintLayout2 = this.f10436x;
                                    if (constraintLayout2 != null) {
                                        RobertoTextView robertoTextView = (RobertoTextView) constraintLayout2.findViewById(R.id.quotesQuote);
                                        Object value = next.getValue();
                                        if (value instanceof String) {
                                            str3 = (String) value;
                                        } else {
                                            str3 = null;
                                        }
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        robertoTextView.setText(str3);
                                    } else {
                                        i.q("heading");
                                        throw null;
                                    }
                                }
                                if (i.b(next.getData_title(), "long_desc")) {
                                    ((LinearLayout) n0(R.id.linearLayout)).setVisibility(8);
                                    RobertoTextView robertoTextView2 = (RobertoTextView) n0(R.id.learningHubDescription);
                                    Object value2 = next.getValue();
                                    if (value2 instanceof String) {
                                        str2 = (String) value2;
                                    } else {
                                        str2 = null;
                                    }
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    robertoTextView2.setText(str2);
                                }
                                if (i.b(next.getData_title(), "author")) {
                                    ConstraintLayout constraintLayout3 = this.f10436x;
                                    if (constraintLayout3 != null) {
                                        RobertoTextView robertoTextView3 = (RobertoTextView) constraintLayout3.findViewById(R.id.authorName);
                                        Object value3 = next.getValue();
                                        if (value3 instanceof String) {
                                            str = (String) value3;
                                        } else {
                                            str = null;
                                        }
                                        if (str == null) {
                                            str = "";
                                        }
                                        robertoTextView3.setText(str);
                                    } else {
                                        i.q("heading");
                                        throw null;
                                    }
                                }
                            }
                            ((ImageView) n0(R.id.ivClose)).setColorFilter(g0.a.b(this, R.color.white), PorterDuff.Mode.SRC_ATOP);
                            LinearLayout linearLayout = (LinearLayout) n0(R.id.headerContainer);
                            ConstraintLayout constraintLayout4 = this.f10436x;
                            if (constraintLayout4 != null) {
                                linearLayout.addView(constraintLayout4);
                                ((FloatingActionButton) n0(R.id.learningHubFAB)).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this, R.color.solid_dark_blue)));
                                break;
                            } else {
                                i.q("heading");
                                throw null;
                            }
                        }
                    case -1692490108:
                        if (!post_type.equals("Creatives")) {
                            break;
                        } else {
                            getWindow().setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
                            View inflate2 = getLayoutInflater().inflate(R.layout.layout_article, (ViewGroup) ((LinearLayout) n0(R.id.headerContainer)), false);
                            i.e(inflate2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                            this.f10436x = (ConstraintLayout) inflate2;
                            Iterator<LearningHubFieldModel> it2 = fields.iterator();
                            while (it2.hasNext()) {
                                LearningHubFieldModel next2 = it2.next();
                                if (i.b(next2.getData_title(), "short_desc")) {
                                    RobertoTextView robertoTextView4 = (RobertoTextView) n0(R.id.learningHubTitle);
                                    Object value4 = next2.getValue();
                                    if (value4 instanceof String) {
                                        str5 = (String) value4;
                                    } else {
                                        str5 = null;
                                    }
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    robertoTextView4.setText(str5);
                                }
                                if (i.b(next2.getData_title(), "long_desc")) {
                                    Object value5 = next2.getValue();
                                    if (value5 instanceof String) {
                                        str4 = (String) value5;
                                    } else {
                                        str4 = null;
                                    }
                                    if (str4 != null) {
                                        q0(str4);
                                    }
                                }
                                if (i.b(next2.getData_title(), "cover")) {
                                    e<Bitmap> a10 = Glide.c(this).d(this).a();
                                    a10.Z = next2.getValue();
                                    a10.f5953b0 = true;
                                    ConstraintLayout constraintLayout5 = this.f10436x;
                                    if (constraintLayout5 != null) {
                                        a10.B((AppCompatImageView) constraintLayout5.findViewById(R.id.articleHeaderImage));
                                    } else {
                                        i.q("heading");
                                        throw null;
                                    }
                                }
                            }
                            ((ImageView) n0(R.id.ivClose)).setColorFilter(g0.a.b(this, R.color.white), PorterDuff.Mode.SRC_ATOP);
                            LinearLayout linearLayout2 = (LinearLayout) n0(R.id.headerContainer);
                            ConstraintLayout constraintLayout6 = this.f10436x;
                            if (constraintLayout6 != null) {
                                linearLayout2.addView(constraintLayout6);
                                break;
                            } else {
                                i.q("heading");
                                throw null;
                            }
                        }
                    case -1164233123:
                        if (!post_type.equals("Articles")) {
                            break;
                        } else {
                            if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getCourseArticleList().contains(o0().getId())) {
                                FirebasePersistence.getInstance().getUser().getUserGamificationModel().getCourseArticleList().add(o0().getId());
                                FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(new GamificationModel(5, Constants.GAMIFICATION_READING_ARTICLE_TASK, FirebasePersistence.getInstance().getUser().getCurrentCourseName()));
                            }
                            getWindow().setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
                            View inflate3 = getLayoutInflater().inflate(R.layout.layout_article, (ViewGroup) ((LinearLayout) n0(R.id.headerContainer)), false);
                            i.e(inflate3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                            this.f10436x = (ConstraintLayout) inflate3;
                            Iterator<LearningHubFieldModel> it3 = fields.iterator();
                            while (it3.hasNext()) {
                                LearningHubFieldModel next3 = it3.next();
                                if (i.b(next3.getData_title(), "title")) {
                                    Object value6 = next3.getValue();
                                    if (value6 instanceof String) {
                                        str7 = (String) value6;
                                    } else {
                                        str7 = null;
                                    }
                                    if (str7 != null) {
                                        ((RobertoTextView) n0(R.id.learningHubTitle)).setText(str7);
                                    }
                                }
                                if (i.b(next3.getData_title(), "long_desc")) {
                                    Object value7 = next3.getValue();
                                    if (value7 instanceof String) {
                                        str6 = (String) value7;
                                    } else {
                                        str6 = null;
                                    }
                                    if (str6 != null) {
                                        q0(str6);
                                    }
                                }
                                if (i.b(next3.getData_title(), "cover")) {
                                    e<Bitmap> a11 = Glide.c(this).d(this).a();
                                    a11.Z = next3.getValue();
                                    a11.f5953b0 = true;
                                    ConstraintLayout constraintLayout7 = this.f10436x;
                                    if (constraintLayout7 != null) {
                                        a11.B((AppCompatImageView) constraintLayout7.findViewById(R.id.articleHeaderImage));
                                    } else {
                                        i.q("heading");
                                        throw null;
                                    }
                                }
                            }
                            ((ImageView) n0(R.id.ivClose)).setColorFilter(g0.a.b(this, R.color.white), PorterDuff.Mode.SRC_ATOP);
                            LinearLayout linearLayout3 = (LinearLayout) n0(R.id.headerContainer);
                            ConstraintLayout constraintLayout8 = this.f10436x;
                            if (constraintLayout8 != null) {
                                linearLayout3.addView(constraintLayout8);
                                break;
                            } else {
                                i.q("heading");
                                throw null;
                            }
                        }
                    case -312086034:
                        if (!post_type.equals("Therapist says")) {
                            break;
                        } else {
                            getWindow().setStatusBarColor(g0.a.b(this, R.color.alt_statusbar_orange));
                            View inflate4 = getLayoutInflater().inflate(R.layout.layout_therapist_says, (ViewGroup) ((LinearLayout) n0(R.id.headerContainer)), false);
                            i.e(inflate4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                            ConstraintLayout constraintLayout9 = (ConstraintLayout) inflate4;
                            this.f10436x = constraintLayout9;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) constraintLayout9.findViewById(R.id.therapistSaysLogo);
                            i.f(appCompatImageView2, "heading.therapistSaysLogo");
                            this.f10437y = appCompatImageView2;
                            Iterator<LearningHubFieldModel> it4 = fields.iterator();
                            while (it4.hasNext()) {
                                LearningHubFieldModel next4 = it4.next();
                                if (i.b(next4.getData_title(), "short_desc")) {
                                    ConstraintLayout constraintLayout10 = this.f10436x;
                                    if (constraintLayout10 != null) {
                                        RobertoTextView robertoTextView5 = (RobertoTextView) constraintLayout10.findViewById(R.id.therapistSaysQuote);
                                        Object value8 = next4.getValue();
                                        if (value8 instanceof String) {
                                            str9 = (String) value8;
                                        } else {
                                            str9 = null;
                                        }
                                        if (str9 == null) {
                                            str9 = "";
                                        }
                                        robertoTextView5.setText(str9);
                                    } else {
                                        i.q("heading");
                                        throw null;
                                    }
                                }
                                if (i.b(next4.getData_title(), "long_desc")) {
                                    ((LinearLayout) n0(R.id.linearLayout)).setVisibility(8);
                                    RobertoTextView robertoTextView6 = (RobertoTextView) n0(R.id.learningHubDescription);
                                    Object value9 = next4.getValue();
                                    if (value9 instanceof String) {
                                        str8 = (String) value9;
                                    } else {
                                        str8 = null;
                                    }
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    robertoTextView6.setText(str8);
                                }
                            }
                            ((ImageView) n0(R.id.ivClose)).setColorFilter(g0.a.b(this, R.color.white), PorterDuff.Mode.SRC_ATOP);
                            LinearLayout linearLayout4 = (LinearLayout) n0(R.id.headerContainer);
                            ConstraintLayout constraintLayout11 = this.f10436x;
                            if (constraintLayout11 != null) {
                                linearLayout4.addView(constraintLayout11);
                                break;
                            } else {
                                i.q("heading");
                                throw null;
                            }
                        }
                    case 2606936:
                        if (!post_type.equals("Tips")) {
                            break;
                        } else {
                            getWindow().setStatusBarColor(g0.a.b(this, R.color.sea));
                            View inflate5 = getLayoutInflater().inflate(R.layout.layout_tips, (ViewGroup) ((LinearLayout) n0(R.id.headerContainer)), false);
                            i.e(inflate5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                            ConstraintLayout constraintLayout12 = (ConstraintLayout) inflate5;
                            this.f10436x = constraintLayout12;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) constraintLayout12.findViewById(R.id.tipsLogo);
                            i.f(appCompatImageView3, "heading.tipsLogo");
                            this.f10437y = appCompatImageView3;
                            Iterator<LearningHubFieldModel> it5 = fields.iterator();
                            while (it5.hasNext()) {
                                LearningHubFieldModel next5 = it5.next();
                                if (i.b(next5.getData_title(), "short_desc")) {
                                    ConstraintLayout constraintLayout13 = this.f10436x;
                                    if (constraintLayout13 != null) {
                                        RobertoTextView robertoTextView7 = (RobertoTextView) constraintLayout13.findViewById(R.id.tipQuote);
                                        Object value10 = next5.getValue();
                                        if (value10 instanceof String) {
                                            str11 = (String) value10;
                                        } else {
                                            str11 = null;
                                        }
                                        if (str11 == null) {
                                            str11 = "";
                                        }
                                        robertoTextView7.setText(str11);
                                    } else {
                                        i.q("heading");
                                        throw null;
                                    }
                                }
                                if (i.b(next5.getData_title(), "long_desc")) {
                                    ((LinearLayout) n0(R.id.linearLayout)).setVisibility(8);
                                    RobertoTextView robertoTextView8 = (RobertoTextView) n0(R.id.learningHubDescription);
                                    Object value11 = next5.getValue();
                                    if (value11 instanceof String) {
                                        str10 = (String) value11;
                                    } else {
                                        str10 = null;
                                    }
                                    if (str10 == null) {
                                        str10 = "";
                                    }
                                    robertoTextView8.setText(str10);
                                }
                            }
                            String layout_id = o0().getLayout_id();
                            if (layout_id != null) {
                                switch (layout_id.hashCode()) {
                                    case 2575126:
                                        if (!layout_id.equals("TIP1")) {
                                            break;
                                        } else {
                                            ConstraintLayout constraintLayout14 = this.f10436x;
                                            if (constraintLayout14 != null) {
                                                ((AppCompatImageView) constraintLayout14.findViewById(R.id.tipsBottomImage)).setImageResource(R.drawable.ic_tips_1);
                                                break;
                                            } else {
                                                i.q("heading");
                                                throw null;
                                            }
                                        }
                                    case 2575127:
                                        if (!layout_id.equals("TIP2")) {
                                            break;
                                        } else {
                                            ConstraintLayout constraintLayout15 = this.f10436x;
                                            if (constraintLayout15 != null) {
                                                ((AppCompatImageView) constraintLayout15.findViewById(R.id.tipsBottomImage)).setImageResource(R.drawable.ic_tips_2);
                                                break;
                                            } else {
                                                i.q("heading");
                                                throw null;
                                            }
                                        }
                                    case 2575128:
                                        if (!layout_id.equals("TIP3")) {
                                            break;
                                        } else {
                                            ConstraintLayout constraintLayout16 = this.f10436x;
                                            if (constraintLayout16 != null) {
                                                ((AppCompatImageView) constraintLayout16.findViewById(R.id.tipsBottomImage)).setImageResource(R.drawable.ic_tips_3);
                                                break;
                                            } else {
                                                i.q("heading");
                                                throw null;
                                            }
                                        }
                                }
                            }
                            LinearLayout linearLayout5 = (LinearLayout) n0(R.id.headerContainer);
                            ConstraintLayout constraintLayout17 = this.f10436x;
                            if (constraintLayout17 != null) {
                                linearLayout5.addView(constraintLayout17);
                                ((ImageView) n0(R.id.ivClose)).setColorFilter(g0.a.b(this, R.color.sea), PorterDuff.Mode.SRC_ATOP);
                                ((FloatingActionButton) n0(R.id.learningHubFAB)).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this, R.color.sea)));
                                break;
                            } else {
                                i.q("heading");
                                throw null;
                            }
                        }
                        break;
                }
            }
            ((WebView) n0(R.id.webview)).setWebChromeClient(new a());
            ((WebView) n0(R.id.webview)).setWebViewClient(new b());
            ((FloatingActionButton) n0(R.id.learningHubFAB)).setOnClickListener(new View.OnClickListener(this) { // from class: dk.g

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ LearningHubArticleActivity f12921v;

                {
                    this.f12921v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    LearningHubArticleActivity this$0 = this.f12921v;
                    switch (i6) {
                        case 0:
                            int i10 = LearningHubArticleActivity.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                if (kotlin.jvm.internal.i.b(this$0.o0().getPost_type(), "Therapist says") || kotlin.jvm.internal.i.b(this$0.o0().getPost_type(), "Tips") || kotlin.jvm.internal.i.b(this$0.o0().getPost_type(), "Quotes")) {
                                    AppCompatImageView appCompatImageView4 = this$0.f10437y;
                                    if (appCompatImageView4 != null) {
                                        appCompatImageView4.setVisibility(0);
                                    } else {
                                        kotlin.jvm.internal.i.q("ihLogo");
                                        throw null;
                                    }
                                }
                                File externalFilesDir = this$0.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
                                kotlin.jvm.internal.i.d(externalFilesDir);
                                if (!externalFilesDir.exists()) {
                                    externalFilesDir.mkdirs();
                                }
                                String format = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
                                File file = new File(externalFilesDir, "share_image_" + format + ".jpg");
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                LinearLayout headerContainer = (LinearLayout) this$0.n0(R.id.headerContainer);
                                kotlin.jvm.internal.i.f(headerContainer, "headerContainer");
                                Bitmap returnedBitmap = Bitmap.createBitmap(headerContainer.getWidth(), headerContainer.getHeight(), Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(returnedBitmap);
                                Drawable background = headerContainer.getBackground();
                                if (background != null) {
                                    background.draw(canvas);
                                } else {
                                    canvas.drawColor(-1);
                                }
                                headerContainer.draw(canvas);
                                kotlin.jvm.internal.i.f(returnedBitmap, "returnedBitmap");
                                returnedBitmap.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream);
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                Uri b10 = FileProvider.b(this$0, "com.theinnerhour.b2b.provider", file);
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setFlags(268435456);
                                intent.addFlags(1);
                                intent.putExtra("android.intent.extra.STREAM", b10);
                                intent.putExtra("android.intent.extra.TEXT", this$0.p0());
                                intent.setType("image/jpg");
                                this$0.startActivity(Intent.createChooser(intent, "Share using"));
                                if (kotlin.jvm.internal.i.b(this$0.o0().getPost_type(), "Therapist says") || kotlin.jvm.internal.i.b(this$0.o0().getPost_type(), "Tips") || kotlin.jvm.internal.i.b(this$0.o0().getPost_type(), "Quotes")) {
                                    AppCompatImageView appCompatImageView5 = this$0.f10437y;
                                    if (appCompatImageView5 != null) {
                                        appCompatImageView5.setVisibility(4);
                                    } else {
                                        kotlin.jvm.internal.i.q("ihLogo");
                                        throw null;
                                    }
                                }
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                bundle2.putString("post_type", this$0.o0().getPost_type());
                                bundle2.putString("post_course", this$0.o0().getProgramme());
                                bundle2.putString("post_id", this$0.o0().getId());
                                gk.a.b(bundle2, "cm_post_share");
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f10434v, "exception", e10);
                                return;
                            }
                        default:
                            int i11 = LearningHubArticleActivity.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.onBackPressed();
                            return;
                    }
                }
            });
            new cg.a(1).c(o0().getId());
            ((ImageView) n0(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: dk.g

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ LearningHubArticleActivity f12921v;

                {
                    this.f12921v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    LearningHubArticleActivity this$0 = this.f12921v;
                    switch (i6) {
                        case 0:
                            int i10 = LearningHubArticleActivity.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                if (kotlin.jvm.internal.i.b(this$0.o0().getPost_type(), "Therapist says") || kotlin.jvm.internal.i.b(this$0.o0().getPost_type(), "Tips") || kotlin.jvm.internal.i.b(this$0.o0().getPost_type(), "Quotes")) {
                                    AppCompatImageView appCompatImageView4 = this$0.f10437y;
                                    if (appCompatImageView4 != null) {
                                        appCompatImageView4.setVisibility(0);
                                    } else {
                                        kotlin.jvm.internal.i.q("ihLogo");
                                        throw null;
                                    }
                                }
                                File externalFilesDir = this$0.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
                                kotlin.jvm.internal.i.d(externalFilesDir);
                                if (!externalFilesDir.exists()) {
                                    externalFilesDir.mkdirs();
                                }
                                String format = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
                                File file = new File(externalFilesDir, "share_image_" + format + ".jpg");
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                LinearLayout headerContainer = (LinearLayout) this$0.n0(R.id.headerContainer);
                                kotlin.jvm.internal.i.f(headerContainer, "headerContainer");
                                Bitmap returnedBitmap = Bitmap.createBitmap(headerContainer.getWidth(), headerContainer.getHeight(), Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(returnedBitmap);
                                Drawable background = headerContainer.getBackground();
                                if (background != null) {
                                    background.draw(canvas);
                                } else {
                                    canvas.drawColor(-1);
                                }
                                headerContainer.draw(canvas);
                                kotlin.jvm.internal.i.f(returnedBitmap, "returnedBitmap");
                                returnedBitmap.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream);
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                Uri b10 = FileProvider.b(this$0, "com.theinnerhour.b2b.provider", file);
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setFlags(268435456);
                                intent.addFlags(1);
                                intent.putExtra("android.intent.extra.STREAM", b10);
                                intent.putExtra("android.intent.extra.TEXT", this$0.p0());
                                intent.setType("image/jpg");
                                this$0.startActivity(Intent.createChooser(intent, "Share using"));
                                if (kotlin.jvm.internal.i.b(this$0.o0().getPost_type(), "Therapist says") || kotlin.jvm.internal.i.b(this$0.o0().getPost_type(), "Tips") || kotlin.jvm.internal.i.b(this$0.o0().getPost_type(), "Quotes")) {
                                    AppCompatImageView appCompatImageView5 = this$0.f10437y;
                                    if (appCompatImageView5 != null) {
                                        appCompatImageView5.setVisibility(4);
                                    } else {
                                        kotlin.jvm.internal.i.q("ihLogo");
                                        throw null;
                                    }
                                }
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                bundle2.putString("post_type", this$0.o0().getPost_type());
                                bundle2.putString("post_course", this$0.o0().getProgramme());
                                bundle2.putString("post_id", this$0.o0().getId());
                                gk.a.b(bundle2, "cm_post_share");
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f10434v, "exception", e10);
                                return;
                            }
                        default:
                            int i11 = LearningHubArticleActivity.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.onBackPressed();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10434v, "exception", e10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String p0() {
        String str;
        String post_type = o0().getPost_type();
        if (post_type != null) {
            switch (post_type.hashCode()) {
                case -1864532585:
                    if (post_type.equals("Quotes")) {
                        str = getString(R.string.resourceShareQuotes);
                        break;
                    }
                    break;
                case -1692490108:
                    if (post_type.equals("Creatives")) {
                        str = getString(R.string.resourceShareCreatives);
                        break;
                    }
                    break;
                case -1164233123:
                    if (post_type.equals("Articles")) {
                        str = getString(R.string.resourceShareArticles, o0().getId());
                        break;
                    }
                    break;
                case -312086034:
                    if (post_type.equals("Therapist says")) {
                        str = getString(R.string.resourceShareTherapistSays);
                        break;
                    }
                    break;
                case 2606936:
                    if (post_type.equals("Tips")) {
                        str = getString(R.string.resourceShareTips);
                        break;
                    }
                    break;
            }
            i.f(str, "when (model.post_type) {…w.theinnerhour.com\"\n    }");
            return str;
        }
        str = "https://www.theinnerhour.com";
        i.f(str, "when (model.post_type) {…w.theinnerhour.com\"\n    }");
        return str;
    }

    public final void q0(String str) {
        ((RobertoTextView) n0(R.id.learningHubDescription)).setVisibility(8);
        ((WebView) n0(R.id.webview)).setVisibility(0);
        ((RobertoTextView) n0(R.id.learningHubDescription)).setVisibility(8);
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
        ((WebView) n0(R.id.webview)).loadDataWithBaseURL("file:///android_asset/", defpackage.b.m("<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///android_asset/fonts/Lato-Medium.ttf\")}body {overflow-wrap: break-word;; font-family: MyFont;font-size: 18;color:#3A3A3A;}p{line-height:1.3em; color: #3A3A3A;}h2{padding: 0; margin: 0;line-height:30px;}h3{padding: 0; margin: 0;line-height:30px;}ul li{line-height:1.3em;}</style></head><body style='padding:20 16 70 16;'>", str, "</body></html>"), "text/html", "UTF-8", null);
        if (FirebasePersistence.getInstance().getUser() == null) {
            finish();
        }
    }
}
