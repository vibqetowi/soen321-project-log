package com.theinnerhour.b2b.components.learningHub.experiment.activities;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.e;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.CreativeCarouselPagerActivity;
import com.theinnerhour.b2b.model.LearningHubFieldModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.CustomViewPager;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import is.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.o0;
import ta.v;
/* compiled from: CreativeCarouselPagerActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/theinnerhour/b2b/components/learningHub/experiment/activities/CreativeCarouselPagerActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "a", Constants.ONBOARDING_VARIANT, "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CreativeCarouselPagerActivity extends c {
    public static final /* synthetic */ int A = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f11231w;

    /* renamed from: y  reason: collision with root package name */
    public LearningHubModel f11233y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f11234z = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11230v = LogHelper.INSTANCE.makeLogTag(CreativeCarouselPagerActivity.class);

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f11232x = new ArrayList<>();

    /* compiled from: CreativeCarouselPagerActivity.kt */
    /* loaded from: classes2.dex */
    public final class a extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<String> f11235c;

        /* renamed from: d  reason: collision with root package name */
        public final Context f11236d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ CreativeCarouselPagerActivity f11237e;

        public a(CreativeCarouselPagerActivity creativeCarouselPagerActivity, Context context, ArrayList<String> imgUrls) {
            i.g(context, "context");
            i.g(imgUrls, "imgUrls");
            this.f11237e = creativeCarouselPagerActivity;
            this.f11235c = new ArrayList<>();
            this.f11235c = imgUrls;
            this.f11236d = context;
        }

        @Override // k2.a
        public final void e(ViewGroup container, int i6, Object object) {
            i.g(container, "container");
            i.g(object, "object");
            try {
                container.removeView((View) object);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f11237e.f11230v, e10);
            }
        }

        @Override // k2.a
        public final int g() {
            return this.f11235c.size();
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup container) {
            i.g(container, "container");
            Context context = this.f11236d;
            View inflate = LayoutInflater.from(context).inflate(R.layout.row_carousel_view_pager, container, false);
            i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            if (context != null) {
                ((ProgressBar) constraintLayout.findViewById(R.id.pbCarousel)).setVisibility(0);
                e<Drawable> p10 = Glide.c(context).c(context).p(this.f11235c.get(i6));
                com.theinnerhour.b2b.components.learningHub.experiment.activities.a aVar = new com.theinnerhour.b2b.components.learningHub.experiment.activities.a(constraintLayout);
                p10.f5952a0 = null;
                p10.w(aVar);
                p10.e(R.drawable.background_lock_code_error).B((AppCompatImageView) constraintLayout.findViewById(R.id.ivPhoto));
            }
            container.addView(constraintLayout);
            return constraintLayout;
        }

        @Override // k2.a
        public final boolean j(View view, Object object) {
            i.g(view, "view");
            i.g(object, "object");
            if (view == object) {
                return true;
            }
            return false;
        }
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.f11234z;
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

    public final void o0(int i6, int i10) {
        try {
            View[] viewArr = new View[i10];
            ((LinearLayout) n0(R.id.layoutDots)).removeAllViews();
            boolean z10 = false;
            for (int i11 = 0; i11 < i10; i11++) {
                View inflate = getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) ((LinearLayout) n0(R.id.layoutDots)), false);
                viewArr[i11] = inflate;
                i.d(inflate);
                Object obj = g0.a.f16164a;
                inflate.setBackground(a.c.b(this, R.drawable.circle_filled_white_carousel));
                ((LinearLayout) n0(R.id.layoutDots)).addView(viewArr[i11]);
            }
            if (i10 == 0) {
                z10 = true;
            }
            if (!z10) {
                View view = viewArr[i6];
                i.d(view);
                Object obj2 = g0.a.f16164a;
                view.setBackground(a.c.b(this, R.drawable.circle_filled_sea_carousel));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_creative_carousel_pager);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.colorBlack));
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("photoUrls");
        i.e(stringArrayListExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
        this.f11232x = stringArrayListExtra;
        Serializable serializableExtra = getIntent().getSerializableExtra("model");
        i.e(serializableExtra, "null cannot be cast to non-null type com.theinnerhour.b2b.model.LearningHubModel");
        this.f11233y = (LearningHubModel) serializableExtra;
        ((CustomViewPager) n0(R.id.creativeCarouselViewPager)).setAdapter(new a(this, this, this.f11232x));
        ((CustomViewPager) n0(R.id.creativeCarouselViewPager)).b(new b(this.f11232x.size()));
        if (this.f11232x.size() > 1) {
            o0(0, this.f11232x.size());
            ((RobertoTextView) n0(R.id.tvSelectPosition)).setText(getString(R.string.carouselPositionSelection, Integer.valueOf(this.f11231w + 1), Integer.valueOf(this.f11232x.size())));
        }
        ((AppCompatImageView) n0(R.id.ivClose)).setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener(this) { // from class: vm.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ CreativeCarouselPagerActivity f35274v;

            {
                this.f35274v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i6 = r2;
                CreativeCarouselPagerActivity this$0 = this.f35274v;
                switch (i6) {
                    case 0:
                        int i10 = CreativeCarouselPagerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    default:
                        int i11 = CreativeCarouselPagerActivity.A;
                        i.g(this$0, "this$0");
                        String str2 = (String) u.j2(this$0.f11231w, this$0.f11232x);
                        if (str2 != null) {
                            v.H(h.c(o0.f23642c), null, 0, new b(this$0, str2, null), 3);
                        }
                        Bundle bundle2 = new Bundle();
                        defpackage.d.m(bundle2, "course");
                        LearningHubModel learningHubModel = this$0.f11233y;
                        if (learningHubModel != null) {
                            bundle2.putString("post_id", learningHubModel.getId());
                            LearningHubModel learningHubModel2 = this$0.f11233y;
                            if (learningHubModel2 != null) {
                                bundle2.putString("post_type", learningHubModel2.getPost_type());
                                LearningHubModel learningHubModel3 = this$0.f11233y;
                                if (learningHubModel3 != null) {
                                    Iterator<LearningHubFieldModel> it = learningHubModel3.getFields().iterator();
                                    while (it.hasNext()) {
                                        LearningHubFieldModel next = it.next();
                                        if (i.b(next.getData_title(), "title")) {
                                            Object value = next.getValue();
                                            if (value instanceof String) {
                                                str = (String) value;
                                            } else {
                                                str = null;
                                            }
                                            if (str == null) {
                                                str = "";
                                            }
                                            bundle2.putString("post_name", str);
                                        }
                                    }
                                    gk.a.b(bundle2, "cm_post_share");
                                    return;
                                }
                                i.q("model");
                                throw null;
                            }
                            i.q("model");
                            throw null;
                        }
                        i.q("model");
                        throw null;
                }
            }
        }));
        ((AppCompatImageView) n0(R.id.learningHubFAB)).setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener(this) { // from class: vm.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ CreativeCarouselPagerActivity f35274v;

            {
                this.f35274v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i6 = r2;
                CreativeCarouselPagerActivity this$0 = this.f35274v;
                switch (i6) {
                    case 0:
                        int i10 = CreativeCarouselPagerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    default:
                        int i11 = CreativeCarouselPagerActivity.A;
                        i.g(this$0, "this$0");
                        String str2 = (String) u.j2(this$0.f11231w, this$0.f11232x);
                        if (str2 != null) {
                            v.H(h.c(o0.f23642c), null, 0, new b(this$0, str2, null), 3);
                        }
                        Bundle bundle2 = new Bundle();
                        defpackage.d.m(bundle2, "course");
                        LearningHubModel learningHubModel = this$0.f11233y;
                        if (learningHubModel != null) {
                            bundle2.putString("post_id", learningHubModel.getId());
                            LearningHubModel learningHubModel2 = this$0.f11233y;
                            if (learningHubModel2 != null) {
                                bundle2.putString("post_type", learningHubModel2.getPost_type());
                                LearningHubModel learningHubModel3 = this$0.f11233y;
                                if (learningHubModel3 != null) {
                                    Iterator<LearningHubFieldModel> it = learningHubModel3.getFields().iterator();
                                    while (it.hasNext()) {
                                        LearningHubFieldModel next = it.next();
                                        if (i.b(next.getData_title(), "title")) {
                                            Object value = next.getValue();
                                            if (value instanceof String) {
                                                str = (String) value;
                                            } else {
                                                str = null;
                                            }
                                            if (str == null) {
                                                str = "";
                                            }
                                            bundle2.putString("post_name", str);
                                        }
                                    }
                                    gk.a.b(bundle2, "cm_post_share");
                                    return;
                                }
                                i.q("model");
                                throw null;
                            }
                            i.q("model");
                            throw null;
                        }
                        i.q("model");
                        throw null;
                }
            }
        }));
    }

    /* compiled from: CreativeCarouselPagerActivity.kt */
    /* loaded from: classes2.dex */
    public final class b implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f11238a;

        public b(int i6) {
            this.f11238a = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10 = CreativeCarouselPagerActivity.A;
            CreativeCarouselPagerActivity creativeCarouselPagerActivity = CreativeCarouselPagerActivity.this;
            int i11 = this.f11238a;
            creativeCarouselPagerActivity.o0(i6, i11);
            ((RobertoTextView) creativeCarouselPagerActivity.n0(R.id.tvSelectPosition)).setText(creativeCarouselPagerActivity.getString(R.string.carouselPositionSelection, Integer.valueOf(i6 + 1), Integer.valueOf(i11)));
            creativeCarouselPagerActivity.f11231w = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
