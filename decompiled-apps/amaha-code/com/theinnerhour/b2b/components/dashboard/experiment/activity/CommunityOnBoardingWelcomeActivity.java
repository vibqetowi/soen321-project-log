package com.theinnerhour.b2b.components.dashboard.experiment.activity;

import am.w;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.activity.h;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hc.d;
import ik.j1;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import s1.s;
import t0.u0;
/* compiled from: CommunityOnBoardingWelcomeActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/theinnerhour/b2b/components/dashboard/experiment/activity/CommunityOnBoardingWelcomeActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "a", Constants.ONBOARDING_VARIANT, "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CommunityOnBoardingWelcomeActivity extends androidx.appcompat.app.c {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f10800z = 0;

    /* renamed from: w  reason: collision with root package name */
    public s f10802w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f10803x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f10804y = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f10801v = LogHelper.INSTANCE.makeLogTag("CommunityOnBoardingWelcomeActivity");

    /* compiled from: CommunityOnBoardingWelcomeActivity.kt */
    /* loaded from: classes2.dex */
    public final class b extends k2.a {
        public b() {
        }

        @Override // k2.a
        public final void e(ViewGroup collection, int i6, Object view) {
            i.g(collection, "collection");
            i.g(view, "view");
            collection.removeView((View) view);
        }

        @Override // k2.a
        public final int g() {
            return 2;
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup collection) {
            ConstraintLayout constraintLayout;
            i.g(collection, "collection");
            CommunityOnBoardingWelcomeActivity communityOnBoardingWelcomeActivity = CommunityOnBoardingWelcomeActivity.this;
            if (i6 == 0) {
                View inflate = LayoutInflater.from(collection.getContext()).inflate(R.layout.layout_community_onboarding_welcome_screen_1, (ViewGroup) null, false);
                int i10 = R.id.clCommunityWelcome1;
                if (((ConstraintLayout) d.w(R.id.clCommunityWelcome1, inflate)) != null) {
                    constraintLayout = (ConstraintLayout) inflate;
                    if (((LinearLayout) d.w(R.id.clSupportGroup1, inflate)) != null) {
                        if (((LinearLayout) d.w(R.id.clSupportGroup2, inflate)) != null) {
                            if (((LinearLayout) d.w(R.id.clSupportGroup3, inflate)) != null) {
                                if (((AppCompatImageView) d.w(R.id.ivSupportGroup1, inflate)) != null) {
                                    if (((AppCompatImageView) d.w(R.id.ivSupportGroup2, inflate)) != null) {
                                        if (((AppCompatImageView) d.w(R.id.ivSupportGroup3, inflate)) != null) {
                                            if (((HorizontalScrollView) d.w(R.id.llSupportGroup, inflate)) != null) {
                                                if (((RobertoTextView) d.w(R.id.tvCommunityWelcome1Description, inflate)) != null) {
                                                    if (((RobertoTextView) d.w(R.id.tvCommunityWelcome1SupportGroupDescription, inflate)) != null) {
                                                        if (((RobertoTextView) d.w(R.id.tvCommunityWelcome1Title, inflate)) != null) {
                                                            if (((RobertoTextView) d.w(R.id.tvCommunityWelcomeScreenTapAnywhere, inflate)) != null) {
                                                                if (((RobertoTextView) d.w(R.id.tvSupportGroup1, inflate)) != null) {
                                                                    if (((RobertoTextView) d.w(R.id.tvSupportGroup2, inflate)) != null) {
                                                                        if (((RobertoTextView) d.w(R.id.tvSupportGroup3, inflate)) != null) {
                                                                            collection.addView(constraintLayout);
                                                                            constraintLayout.setOnClickListener(DebouncedOnClickListener.wrap(new fl.a(communityOnBoardingWelcomeActivity, 2)));
                                                                        } else {
                                                                            i10 = R.id.tvSupportGroup3;
                                                                        }
                                                                    } else {
                                                                        i10 = R.id.tvSupportGroup2;
                                                                    }
                                                                } else {
                                                                    i10 = R.id.tvSupportGroup1;
                                                                }
                                                            } else {
                                                                i10 = R.id.tvCommunityWelcomeScreenTapAnywhere;
                                                            }
                                                        } else {
                                                            i10 = R.id.tvCommunityWelcome1Title;
                                                        }
                                                    } else {
                                                        i10 = R.id.tvCommunityWelcome1SupportGroupDescription;
                                                    }
                                                } else {
                                                    i10 = R.id.tvCommunityWelcome1Description;
                                                }
                                            } else {
                                                i10 = R.id.llSupportGroup;
                                            }
                                        } else {
                                            i10 = R.id.ivSupportGroup3;
                                        }
                                    } else {
                                        i10 = R.id.ivSupportGroup2;
                                    }
                                } else {
                                    i10 = R.id.ivSupportGroup1;
                                }
                            } else {
                                i10 = R.id.clSupportGroup3;
                            }
                        } else {
                            i10 = R.id.clSupportGroup2;
                        }
                    } else {
                        i10 = R.id.clSupportGroup1;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
            }
            View inflate2 = LayoutInflater.from(collection.getContext()).inflate(R.layout.layout_community_onboarding_welcome_screen_2, (ViewGroup) null, false);
            int i11 = R.id.clCommunityFeature1;
            if (((ConstraintLayout) d.w(R.id.clCommunityFeature1, inflate2)) != null) {
                i11 = R.id.clCommunityFeature2;
                if (((ConstraintLayout) d.w(R.id.clCommunityFeature2, inflate2)) != null) {
                    i11 = R.id.clCommunityFeature3;
                    if (((ConstraintLayout) d.w(R.id.clCommunityFeature3, inflate2)) != null) {
                        i11 = R.id.clCommunityFeature4;
                        if (((ConstraintLayout) d.w(R.id.clCommunityFeature4, inflate2)) != null) {
                            constraintLayout = (ConstraintLayout) inflate2;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) d.w(R.id.clCommunityWelcomeScreenCta, inflate2);
                            if (constraintLayout2 != null) {
                                if (((ConstraintLayout) d.w(R.id.clCtaView, inflate2)) != null) {
                                    if (((AppCompatImageView) d.w(R.id.ivCommunityWelcomeScreen2Feature1, inflate2)) != null) {
                                        if (((AppCompatImageView) d.w(R.id.ivCommunityWelcomeScreen2Feature2, inflate2)) != null) {
                                            if (((AppCompatImageView) d.w(R.id.ivCommunityWelcomeScreen2Feature3, inflate2)) != null) {
                                                if (((AppCompatImageView) d.w(R.id.ivCommunityWelcomeScreen2Feature4, inflate2)) != null) {
                                                    if (((RobertoTextView) d.w(R.id.tvCommunityWelcome2Title, inflate2)) != null) {
                                                        if (((RobertoTextView) d.w(R.id.tvCommunityWelcomeScreen2Feature1Description, inflate2)) != null) {
                                                            if (((RobertoTextView) d.w(R.id.tvCommunityWelcomeScreen2Feature1Title, inflate2)) != null) {
                                                                if (((RobertoTextView) d.w(R.id.tvCommunityWelcomeScreen2Feature2Description, inflate2)) != null) {
                                                                    if (((RobertoTextView) d.w(R.id.tvCommunityWelcomeScreen2Feature2Title, inflate2)) != null) {
                                                                        if (((RobertoTextView) d.w(R.id.tvCommunityWelcomeScreen2Feature3Description, inflate2)) != null) {
                                                                            if (((RobertoTextView) d.w(R.id.tvCommunityWelcomeScreen2Feature3Title, inflate2)) != null) {
                                                                                if (((RobertoTextView) d.w(R.id.tvCommunityWelcomeScreen2Feature4Description, inflate2)) != null) {
                                                                                    if (((RobertoTextView) d.w(R.id.tvCommunityWelcomeScreen2Feature4Title, inflate2)) != null) {
                                                                                        if (((RobertoTextView) d.w(R.id.tvCommunityWelcomeScreenText, inflate2)) != null) {
                                                                                            collection.addView(constraintLayout);
                                                                                            constraintLayout2.setOnClickListener(DebouncedOnClickListener.wrap(new j1(collection, 16, communityOnBoardingWelcomeActivity)));
                                                                                        } else {
                                                                                            i11 = R.id.tvCommunityWelcomeScreenText;
                                                                                        }
                                                                                    } else {
                                                                                        i11 = R.id.tvCommunityWelcomeScreen2Feature4Title;
                                                                                    }
                                                                                } else {
                                                                                    i11 = R.id.tvCommunityWelcomeScreen2Feature4Description;
                                                                                }
                                                                            } else {
                                                                                i11 = R.id.tvCommunityWelcomeScreen2Feature3Title;
                                                                            }
                                                                        } else {
                                                                            i11 = R.id.tvCommunityWelcomeScreen2Feature3Description;
                                                                        }
                                                                    } else {
                                                                        i11 = R.id.tvCommunityWelcomeScreen2Feature2Title;
                                                                    }
                                                                } else {
                                                                    i11 = R.id.tvCommunityWelcomeScreen2Feature2Description;
                                                                }
                                                            } else {
                                                                i11 = R.id.tvCommunityWelcomeScreen2Feature1Title;
                                                            }
                                                        } else {
                                                            i11 = R.id.tvCommunityWelcomeScreen2Feature1Description;
                                                        }
                                                    } else {
                                                        i11 = R.id.tvCommunityWelcome2Title;
                                                    }
                                                } else {
                                                    i11 = R.id.ivCommunityWelcomeScreen2Feature4;
                                                }
                                            } else {
                                                i11 = R.id.ivCommunityWelcomeScreen2Feature3;
                                            }
                                        } else {
                                            i11 = R.id.ivCommunityWelcomeScreen2Feature2;
                                        }
                                    } else {
                                        i11 = R.id.ivCommunityWelcomeScreen2Feature1;
                                    }
                                } else {
                                    i11 = R.id.clCtaView;
                                }
                            } else {
                                i11 = R.id.clCommunityWelcomeScreenCta;
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i11)));
            i.f(constraintLayout, "if(position==0){\n       …layout.root\n            }");
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

    /* compiled from: CommunityOnBoardingWelcomeActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends h {
        public c() {
            super(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
            if (r1.getCurrentItem() == 1) goto L7;
         */
        @Override // androidx.activity.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a() {
            boolean z10;
            ViewPager viewPager;
            CommunityOnBoardingWelcomeActivity communityOnBoardingWelcomeActivity = CommunityOnBoardingWelcomeActivity.this;
            s sVar = communityOnBoardingWelcomeActivity.f10802w;
            if (sVar != null && (r1 = (ViewPager) sVar.f31226x) != null) {
                z10 = true;
            }
            z10 = false;
            if (z10) {
                s sVar2 = communityOnBoardingWelcomeActivity.f10802w;
                if (sVar2 != null) {
                    viewPager = (ViewPager) sVar2.f31226x;
                } else {
                    viewPager = null;
                }
                if (viewPager != null) {
                    viewPager.setCurrentItem(0);
                    return;
                }
                return;
            }
            communityOnBoardingWelcomeActivity.finish();
        }
    }

    public CommunityOnBoardingWelcomeActivity() {
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new w(12, this));
        i.f(registerForActivityResult, "registerForActivityResul…ivityResult(result)\n    }");
        this.f10803x = registerForActivityResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        ViewPager viewPager;
        ConstraintLayout constraintLayout;
        s sVar;
        s sVar2;
        AppCompatImageView appCompatImageView;
        ViewPager viewPager2;
        ViewPager viewPager3;
        u0.e aVar;
        u0.e eVar;
        super.onCreate(bundle);
        View view = null;
        View inflate = getLayoutInflater().inflate(R.layout.activity_community_onboarding_welcome, (ViewGroup) null, false);
        int i6 = R.id.ivArrowBack;
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) d.w(R.id.ivArrowBack, inflate);
        if (appCompatImageView2 != null) {
            i6 = R.id.vpWelcomeScreen;
            ViewPager viewPager4 = (ViewPager) d.w(R.id.vpWelcomeScreen, inflate);
            if (viewPager4 != null) {
                s sVar3 = new s(25, (ConstraintLayout) inflate, appCompatImageView2, viewPager4);
                this.f10802w = sVar3;
                setContentView((ConstraintLayout) sVar3.f31224v);
                try {
                    Window window = getWindow();
                    if (Build.VERSION.SDK_INT >= 23) {
                        View decorView = window.getDecorView();
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 30) {
                            eVar = new u0.d(window);
                        } else {
                            if (i10 >= 26) {
                                aVar = new u0.c(decorView, window);
                            } else if (i10 >= 23) {
                                aVar = new u0.b(decorView, window);
                            } else {
                                aVar = new u0.a(decorView, window);
                            }
                            eVar = aVar;
                        }
                        eVar.d(true);
                    }
                    window.setStatusBarColor(g0.a.b(this, R.color.login_grey_background));
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this.f10801v, "Error in setting custom status bar", e10);
                }
                s sVar4 = this.f10802w;
                if (sVar4 != null) {
                    viewPager = (ViewPager) sVar4.f31226x;
                } else {
                    viewPager = null;
                }
                if (viewPager != null) {
                    viewPager.setAdapter(new b());
                }
                s sVar5 = this.f10802w;
                if (sVar5 != null && (viewPager3 = (ViewPager) sVar5.f31226x) != null) {
                    viewPager3.v(0);
                }
                LinkedHashMap linkedHashMap = this.f10804y;
                View view2 = (View) linkedHashMap.get(Integer.valueOf((int) R.id.clCommunityWelcomeScreenCta));
                if (view2 == null) {
                    view2 = findViewById(R.id.clCommunityWelcomeScreenCta);
                    if (view2 != null) {
                        linkedHashMap.put(Integer.valueOf((int) R.id.clCommunityWelcomeScreenCta), view2);
                    }
                    constraintLayout = (ConstraintLayout) view;
                    if (constraintLayout != null) {
                        constraintLayout.setOnClickListener(DebouncedOnClickListener.wrap(new fl.a(this, 0)));
                    }
                    sVar = this.f10802w;
                    if (sVar != null && (viewPager2 = (ViewPager) sVar.f31226x) != null) {
                        viewPager2.b(new a());
                    }
                    sVar2 = this.f10802w;
                    if (sVar2 != null && (appCompatImageView = (AppCompatImageView) sVar2.f31225w) != null) {
                        appCompatImageView.setOnClickListener(DebouncedOnClickListener.wrap(new fl.a(this, 1)));
                    }
                    getOnBackPressedDispatcher().a(this, new c());
                    return;
                }
                view = view2;
                constraintLayout = (ConstraintLayout) view;
                if (constraintLayout != null) {
                }
                sVar = this.f10802w;
                if (sVar != null) {
                    viewPager2.b(new a());
                }
                sVar2 = this.f10802w;
                if (sVar2 != null) {
                    appCompatImageView.setOnClickListener(DebouncedOnClickListener.wrap(new fl.a(this, 1)));
                }
                getOnBackPressedDispatcher().a(this, new c());
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        this.f10802w = null;
        super.onDestroy();
    }

    /* compiled from: CommunityOnBoardingWelcomeActivity.kt */
    /* loaded from: classes2.dex */
    public final class a implements ViewPager.i {
        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            String str;
            Bundle bundle = new Bundle();
            if (i6 == 0) {
                str = "one";
            } else {
                str = "two";
            }
            bundle.putString("step", str);
            UtilsKt.fireAnalytics("dashboard_community_onboarding_click", bundle);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
