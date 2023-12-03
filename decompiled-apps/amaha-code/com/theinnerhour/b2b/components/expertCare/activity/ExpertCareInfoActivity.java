package com.theinnerhour.b2b.components.expertCare.activity;

import am.w;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.y;
import androidx.lifecycle.j;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import ol.k;
import t0.u0;
/* compiled from: ExpertCareInfoActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/expertCare/activity/ExpertCareInfoActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ExpertCareInfoActivity extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f11131x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f11133w = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11132v = LogHelper.INSTANCE.makeLogTag("ExpertCareInfoActivity");

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.f11133w;
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

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        String str;
        String str2;
        TabLayout.g h10;
        u0.e aVar;
        String str3 = this.f11132v;
        super.onCreate(bundle);
        try {
            setContentView(R.layout.activity_expert_care_info);
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    Window window = getWindow();
                    View decorView = getWindow().getDecorView();
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 30) {
                        aVar = new u0.d(window);
                    } else if (i6 >= 26) {
                        aVar = new u0.c(decorView, window);
                    } else if (i6 >= 23) {
                        aVar = new u0.b(decorView, window);
                    } else {
                        aVar = new u0.a(decorView, window);
                    }
                    aVar.d(true);
                }
                getWindow().setStatusBarColor(g0.a.b(this, R.color.login_grey_background));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str3, "Error in setting custom status bar", e10);
            }
            y supportFragmentManager = getSupportFragmentManager();
            i.f(supportFragmentManager, "supportFragmentManager");
            j lifecycle = getLifecycle();
            i.f(lifecycle, "lifecycle");
            ((ViewPager2) n0(R.id.vpExpertInfo)).setAdapter(new rl.a(supportFragmentManager, lifecycle));
            TabLayout tabLayout = (TabLayout) n0(R.id.tlExpertInfo);
            i.d(tabLayout);
            tabLayout.a(new a());
            new d((TabLayout) n0(R.id.tlExpertInfo), (ViewPager2) n0(R.id.vpExpertInfo), new w(16, this)).a();
            ((AppCompatImageView) n0(R.id.ivExpertInfoBackButton)).setOnClickListener(new k(8, this));
            Intent intent = getIntent();
            if (intent != null) {
                z10 = intent.getBooleanExtra("isPsychiatryFlow", false);
            } else {
                z10 = false;
            }
            if (z10 && (h10 = ((TabLayout) n0(R.id.tlExpertInfo)).h(1)) != null) {
                h10.a();
            }
            ViewPager2 viewPager2 = (ViewPager2) n0(R.id.vpExpertInfo);
            if (viewPager2 != null) {
                viewPager2.setUserInputEnabled(false);
            }
            String str4 = gk.a.f16573a;
            Bundle bundle2 = new Bundle();
            if (z10) {
                str = "psychiatry";
            } else {
                str = "therapy";
            }
            bundle2.putString("flow", str);
            Intent intent2 = getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("source");
            } else {
                str2 = null;
            }
            bundle2.putString("source", str2);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle2, "therapy_psychiatry_consult_load");
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str3, e11);
        }
    }

    /* compiled from: ExpertCareInfoActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TabLayout.d {
        public a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void b(TabLayout.g gVar) {
            View view;
            String str;
            if (gVar != null && (view = gVar.f9220e) != null) {
                RobertoTextView robertoTextView = (RobertoTextView) view;
                ExpertCareInfoActivity expertCareInfoActivity = ExpertCareInfoActivity.this;
                robertoTextView.setTextColor(g0.a.b(expertCareInfoActivity, R.color.amahaDarkGray));
                String str2 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                String lowerCase = robertoTextView.getText().toString().toLowerCase(Locale.ROOT);
                i.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                bundle.putString("flow", lowerCase);
                Intent intent = expertCareInfoActivity.getIntent();
                if (intent != null) {
                    str = intent.getStringExtra("source");
                } else {
                    str = null;
                }
                bundle.putString("source", str);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "therapy_psychiatry_consult_tab_click");
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void c(TabLayout.g gVar) {
            View view = gVar.f9220e;
            if (view != null) {
                ((RobertoTextView) view).setTextColor(g0.a.b(ExpertCareInfoActivity.this, R.color.templateCtaDisabledGrey));
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a() {
        }
    }
}
