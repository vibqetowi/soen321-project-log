package com.theinnerhour.b2b.components.onboarding.activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.activity.h;
import androidx.appcompat.app.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import bo.e;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DeepLinkActivationActivity;
import com.theinnerhour.b2b.components.onboarding.activity.OnboardingFlowActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilsKt;
import eo.g;
import hs.f;
import hs.k;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: OnboardingFlowActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/onboarding/activity/OnboardingFlowActivity;", "Landroidx/appcompat/app/c;", "Leo/g;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class OnboardingFlowActivity extends c implements g {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f11496y = 0;

    /* renamed from: v  reason: collision with root package name */
    public final String f11497v;

    /* renamed from: w  reason: collision with root package name */
    public int f11498w;

    /* renamed from: x  reason: collision with root package name */
    public eo.a f11499x;

    /* compiled from: OnboardingFlowActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11500a;

        static {
            int[] iArr = new int[eo.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11500a = iArr;
        }
    }

    /* compiled from: OnboardingFlowActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends h {
        public b() {
            super(true);
        }

        @Override // androidx.activity.h
        public final void a() {
            f fVar;
            String str;
            WindowManager.LayoutParams layoutParams;
            final OnboardingFlowActivity onboardingFlowActivity = OnboardingFlowActivity.this;
            eo.a aVar = onboardingFlowActivity.f11499x;
            eo.a aVar2 = eo.a.MATCHING_THERAPY;
            String str2 = "result";
            String str3 = "true";
            if (aVar == aVar2) {
                switch (onboardingFlowActivity.f11498w) {
                    case 1:
                        fVar = new f("welcome", "not_valid");
                        break;
                    case 2:
                        if (!OnboardingFlowActivity.n0(onboardingFlowActivity)) {
                            str3 = "false";
                        }
                        fVar = new f("q1", str3);
                        break;
                    case 3:
                        if (!OnboardingFlowActivity.n0(onboardingFlowActivity)) {
                            str3 = "false";
                        }
                        fVar = new f("q2", str3);
                        break;
                    case 4:
                        if (!OnboardingFlowActivity.n0(onboardingFlowActivity)) {
                            str3 = "false";
                        }
                        fVar = new f("q3", str3);
                        break;
                    case 5:
                        if (!OnboardingFlowActivity.n0(onboardingFlowActivity)) {
                            str3 = "false";
                        }
                        fVar = new f("q4", str3);
                        break;
                    case 6:
                        if (!OnboardingFlowActivity.n0(onboardingFlowActivity)) {
                            str3 = "false";
                        }
                        fVar = new f("q5", str3);
                        break;
                    case 7:
                        fVar = new f("review", "not_valid");
                        break;
                    case 8:
                        if (!onboardingFlowActivity.p0()) {
                            str2 = "loader";
                        }
                        fVar = new f(str2, "not_valid");
                        break;
                    default:
                        fVar = new f("q0", "not_valid");
                        break;
                }
            } else {
                switch (onboardingFlowActivity.f11498w) {
                    case 1:
                        fVar = new f("welcome", "not_valid");
                        break;
                    case 2:
                        if (!OnboardingFlowActivity.n0(onboardingFlowActivity)) {
                            str3 = "false";
                        }
                        fVar = new f("q1", str3);
                        break;
                    case 3:
                        if (!OnboardingFlowActivity.n0(onboardingFlowActivity)) {
                            str3 = "false";
                        }
                        fVar = new f("q2", str3);
                        break;
                    case 4:
                        if (!OnboardingFlowActivity.n0(onboardingFlowActivity)) {
                            str3 = "false";
                        }
                        fVar = new f("q3", str3);
                        break;
                    case 5:
                        fVar = new f("review", "not_valid");
                        break;
                    case 6:
                        if (!onboardingFlowActivity.p0()) {
                            str2 = "loader";
                        }
                        fVar = new f(str2, "not_valid");
                        break;
                    default:
                        fVar = new f("q0", "not_valid");
                        break;
                }
            }
            String str4 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("screen", (String) fVar.f19464u);
            String str5 = "therapy";
            if (onboardingFlowActivity.f11499x == aVar2) {
                str = "therapy";
            } else {
                str = "psychiatry";
            }
            bundle.putString("flow", str);
            bundle.putString("source", "app_onboarding_matching");
            bundle.putString("set_pref", (String) fVar.f19465v);
            k kVar = k.f19476a;
            gk.a.b(bundle, "setpref_flow_back");
            int i6 = onboardingFlowActivity.f11498w;
            if ((i6 >= 8 && onboardingFlowActivity.f11499x == aVar2) || (i6 >= 6 && onboardingFlowActivity.f11499x == eo.a.MATCHING_PSYCHIATRY)) {
                try {
                    final Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_journal_save_popup, onboardingFlowActivity, R.style.Theme_Dialog);
                    Window window = styledDialog.getWindow();
                    if (window != null) {
                        layoutParams = window.getAttributes();
                    } else {
                        layoutParams = null;
                    }
                    if (layoutParams != null) {
                        layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                    }
                    TextView textView = (TextView) styledDialog.findViewById(R.id.tvJournalDialogTitle);
                    if (textView != null) {
                        textView.setText(onboardingFlowActivity.getString(R.string.matchingQuitDialogHeader));
                    }
                    TextView textView2 = (TextView) styledDialog.findViewById(R.id.tvJournalDialogMessage);
                    if (textView2 != null) {
                        textView2.setText(onboardingFlowActivity.getString(R.string.matchingQuitDialogSubHeader));
                    }
                    TextView textView3 = (TextView) styledDialog.findViewById(R.id.tvJournalDialogCancel);
                    textView3.setText(onboardingFlowActivity.getString(R.string.recommended_activity_feedback_no));
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: zn.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Bundle extras;
                            eo.a aVar3 = eo.a.MATCHING_THERAPY;
                            int i10 = r3;
                            String str6 = "therapy";
                            OnboardingFlowActivity this$0 = onboardingFlowActivity;
                            Dialog templateChangeDialog = styledDialog;
                            switch (i10) {
                                case 0:
                                    int i11 = OnboardingFlowActivity.f11496y;
                                    i.g(templateChangeDialog, "$templateChangeDialog");
                                    i.g(this$0, "this$0");
                                    String str7 = gk.a.f16573a;
                                    Bundle bundle2 = new Bundle();
                                    if (this$0.f11499x != aVar3) {
                                        str6 = "psychiatry";
                                    }
                                    bundle2.putString("flow", str6);
                                    bundle2.putString("source", "app_onboarding_matching");
                                    bundle2.putBoolean("results_loaded", this$0.p0());
                                    k kVar2 = k.f19476a;
                                    gk.a.b(bundle2, "onboarding_matching_exit_no");
                                    templateChangeDialog.dismiss();
                                    return;
                                default:
                                    int i12 = OnboardingFlowActivity.f11496y;
                                    i.g(templateChangeDialog, "$templateChangeDialog");
                                    i.g(this$0, "this$0");
                                    templateChangeDialog.dismiss();
                                    String str8 = gk.a.f16573a;
                                    Bundle bundle3 = new Bundle();
                                    if (this$0.f11499x != aVar3) {
                                        str6 = "psychiatry";
                                    }
                                    bundle3.putString("flow", str6);
                                    bundle3.putString("source", "app_onboarding_matching");
                                    bundle3.putBoolean("results_loaded", this$0.p0());
                                    k kVar3 = k.f19476a;
                                    gk.a.b(bundle3, "onboarding_matching_exit_yes");
                                    Intent a10 = new ll.b().a(this$0, false);
                                    Intent intent = this$0.getIntent();
                                    if (intent != null && (extras = intent.getExtras()) != null) {
                                        a10.putExtras(extras);
                                    }
                                    this$0.startActivity(a10);
                                    this$0.finish();
                                    return;
                            }
                        }
                    });
                    ((ConstraintLayout) styledDialog.findViewById(R.id.clJournalDialogYes)).setOnClickListener(new View.OnClickListener() { // from class: zn.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Bundle extras;
                            eo.a aVar3 = eo.a.MATCHING_THERAPY;
                            int i10 = r3;
                            String str6 = "therapy";
                            OnboardingFlowActivity this$0 = onboardingFlowActivity;
                            Dialog templateChangeDialog = styledDialog;
                            switch (i10) {
                                case 0:
                                    int i11 = OnboardingFlowActivity.f11496y;
                                    i.g(templateChangeDialog, "$templateChangeDialog");
                                    i.g(this$0, "this$0");
                                    String str7 = gk.a.f16573a;
                                    Bundle bundle2 = new Bundle();
                                    if (this$0.f11499x != aVar3) {
                                        str6 = "psychiatry";
                                    }
                                    bundle2.putString("flow", str6);
                                    bundle2.putString("source", "app_onboarding_matching");
                                    bundle2.putBoolean("results_loaded", this$0.p0());
                                    k kVar2 = k.f19476a;
                                    gk.a.b(bundle2, "onboarding_matching_exit_no");
                                    templateChangeDialog.dismiss();
                                    return;
                                default:
                                    int i12 = OnboardingFlowActivity.f11496y;
                                    i.g(templateChangeDialog, "$templateChangeDialog");
                                    i.g(this$0, "this$0");
                                    templateChangeDialog.dismiss();
                                    String str8 = gk.a.f16573a;
                                    Bundle bundle3 = new Bundle();
                                    if (this$0.f11499x != aVar3) {
                                        str6 = "psychiatry";
                                    }
                                    bundle3.putString("flow", str6);
                                    bundle3.putString("source", "app_onboarding_matching");
                                    bundle3.putBoolean("results_loaded", this$0.p0());
                                    k kVar3 = k.f19476a;
                                    gk.a.b(bundle3, "onboarding_matching_exit_yes");
                                    Intent a10 = new ll.b().a(this$0, false);
                                    Intent intent = this$0.getIntent();
                                    if (intent != null && (extras = intent.getExtras()) != null) {
                                        a10.putExtras(extras);
                                    }
                                    this$0.startActivity(a10);
                                    this$0.finish();
                                    return;
                            }
                        }
                    });
                    ((TextView) styledDialog.findViewById(R.id.tvJournalDialogYes)).setText(onboardingFlowActivity.getString(R.string.yes_quit));
                    styledDialog.show();
                    Bundle bundle2 = new Bundle();
                    if (onboardingFlowActivity.f11499x != aVar2) {
                        str5 = "psychiatry";
                    }
                    bundle2.putString("flow", str5);
                    bundle2.putString("source", "app_onboarding_matching");
                    bundle2.putBoolean("results_loaded", onboardingFlowActivity.p0());
                    gk.a.b(bundle2, "onboarding_matching_exit_dialogue");
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(onboardingFlowActivity.f11497v, e10);
                    return;
                }
            }
            int i10 = i6 - 1;
            onboardingFlowActivity.f11498w = i10;
            if (i10 >= 0) {
                if (i10 == 0) {
                    InsetsUtils.INSTANCE.setStatusBarColor(R.color.white, onboardingFlowActivity, true, true);
                } else {
                    InsetsUtils.INSTANCE.setStatusBarColor(R.color.darkMossGreen, onboardingFlowActivity, true, true);
                }
                onboardingFlowActivity.getSupportFragmentManager().W();
                return;
            }
            onboardingFlowActivity.finish();
        }
    }

    public OnboardingFlowActivity() {
        new LinkedHashMap();
        this.f11497v = LogHelper.INSTANCE.makeLogTag("OnboardingFlowActivity");
    }

    public static final boolean n0(OnboardingFlowActivity onboardingFlowActivity) {
        bo.k kVar;
        onboardingFlowActivity.getClass();
        try {
            Fragment E = onboardingFlowActivity.getSupportFragmentManager().E(R.id.fragmentContainer);
            if (E instanceof bo.k) {
                kVar = (bo.k) E;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                return false;
            }
            if (!kVar.I()) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(onboardingFlowActivity.f11497v, e10);
            return false;
        }
    }

    @Override // eo.g
    public final void M() {
        this.f11498w++;
        q0();
    }

    @Override // eo.g
    public final void P(int i6) {
        int i10 = i6 + 2;
        while (this.f11498w != i10) {
            try {
                getSupportFragmentManager().W();
                this.f11498w--;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f11497v, e10);
                return;
            }
        }
    }

    @Override // eo.g
    public final void S(eo.a aVar) {
        this.f11499x = aVar;
    }

    @Override // eo.g
    public final int getCurrentPosition() {
        return this.f11498w;
    }

    @Override // eo.g
    public final eo.a h() {
        return this.f11499x;
    }

    public final Fragment o0() {
        Fragment hVar;
        try {
            int i6 = -1;
            switch (this.f11498w) {
                case 0:
                    hVar = new bo.h();
                    break;
                case 1:
                    eo.a aVar = this.f11499x;
                    if (aVar != null) {
                        i6 = a.f11500a[aVar.ordinal()];
                    }
                    if (i6 != 1) {
                        if (i6 != 2) {
                            return null;
                        }
                        bo.i iVar = new bo.i();
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("isTherapy", false);
                        return UtilsKt.withArgs(iVar, bundle);
                    }
                    bo.i iVar2 = new bo.i();
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("isTherapy", true);
                    return UtilsKt.withArgs(iVar2, bundle2);
                case 2:
                    eo.a aVar2 = this.f11499x;
                    if (aVar2 != null) {
                        i6 = a.f11500a[aVar2.ordinal()];
                    }
                    if (i6 != 1) {
                        if (i6 != 2) {
                            return null;
                        }
                        bo.k kVar = new bo.k();
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("questionType", "domain");
                        return UtilsKt.withArgs(kVar, bundle3);
                    }
                    bo.k kVar2 = new bo.k();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("questionType", "domain");
                    return UtilsKt.withArgs(kVar2, bundle4);
                case 3:
                    eo.a aVar3 = this.f11499x;
                    if (aVar3 != null) {
                        i6 = a.f11500a[aVar3.ordinal()];
                    }
                    if (i6 != 1) {
                        if (i6 != 2) {
                            return null;
                        }
                        bo.k kVar3 = new bo.k();
                        Bundle bundle5 = new Bundle();
                        bundle5.putString("questionType", "duration");
                        return UtilsKt.withArgs(kVar3, bundle5);
                    }
                    bo.k kVar4 = new bo.k();
                    Bundle bundle6 = new Bundle();
                    bundle6.putString("questionType", "duration");
                    return UtilsKt.withArgs(kVar4, bundle6);
                case 4:
                    eo.a aVar4 = this.f11499x;
                    if (aVar4 != null) {
                        i6 = a.f11500a[aVar4.ordinal()];
                    }
                    if (i6 != 1) {
                        if (i6 != 2) {
                            return null;
                        }
                        bo.k kVar5 = new bo.k();
                        Bundle bundle7 = new Bundle();
                        bundle7.putString("questionType", "age");
                        return UtilsKt.withArgs(kVar5, bundle7);
                    }
                    bo.k kVar6 = new bo.k();
                    Bundle bundle8 = new Bundle();
                    bundle8.putString("questionType", "difficulty");
                    return UtilsKt.withArgs(kVar6, bundle8);
                case 5:
                    eo.a aVar5 = this.f11499x;
                    if (aVar5 != null) {
                        i6 = a.f11500a[aVar5.ordinal()];
                    }
                    if (i6 != 1) {
                        if (i6 != 2) {
                            return null;
                        }
                        bo.k kVar7 = new bo.k();
                        Bundle bundle9 = new Bundle();
                        bundle9.putString("questionType", "summary");
                        return UtilsKt.withArgs(kVar7, bundle9);
                    }
                    bo.k kVar8 = new bo.k();
                    Bundle bundle10 = new Bundle();
                    bundle10.putString("questionType", "language");
                    return UtilsKt.withArgs(kVar8, bundle10);
                case 6:
                    eo.a aVar6 = this.f11499x;
                    if (aVar6 != null) {
                        i6 = a.f11500a[aVar6.ordinal()];
                    }
                    if (i6 != 1) {
                        if (i6 != 2) {
                            return null;
                        }
                        e eVar = new e();
                        Bundle bundle11 = new Bundle();
                        bundle11.putBoolean("isTherapist", false);
                        return UtilsKt.withArgs(eVar, bundle11);
                    }
                    bo.k kVar9 = new bo.k();
                    Bundle bundle12 = new Bundle();
                    bundle12.putString("questionType", "age");
                    return UtilsKt.withArgs(kVar9, bundle12);
                case 7:
                    eo.a aVar7 = this.f11499x;
                    if (aVar7 != null) {
                        i6 = a.f11500a[aVar7.ordinal()];
                    }
                    if (i6 != 1) {
                        if (i6 != 2) {
                            return null;
                        }
                        hVar = new e();
                        break;
                    } else {
                        bo.k kVar10 = new bo.k();
                        Bundle bundle13 = new Bundle();
                        bundle13.putString("questionType", "summary");
                        return UtilsKt.withArgs(kVar10, bundle13);
                    }
                case 8:
                    eo.a aVar8 = this.f11499x;
                    if (aVar8 != null) {
                        i6 = a.f11500a[aVar8.ordinal()];
                    }
                    if (i6 != 1) {
                        return null;
                    }
                    e eVar2 = new e();
                    Bundle bundle14 = new Bundle();
                    bundle14.putBoolean("isTherapist", true);
                    return UtilsKt.withArgs(eVar2, bundle14);
                case 9:
                    eo.a aVar9 = this.f11499x;
                    if (aVar9 != null) {
                        i6 = a.f11500a[aVar9.ordinal()];
                    }
                    if (i6 != 1) {
                        return null;
                    }
                    hVar = new e();
                    break;
                default:
                    return null;
            }
            return hVar;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11497v, e10);
            return null;
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView(R.layout.activity_condition_selection_a3);
            l0 a10 = new o0(this).a(eo.f.class);
            ((eo.f) a10).f();
            eo.f fVar = (eo.f) a10;
            q0();
            getOnBackPressedDispatcher().a(this, new b());
            if (!i.b(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_SIGNUP_LINK), "")) {
                startActivity(new Intent(this, DeepLinkActivationActivity.class));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11497v, e10);
        }
    }

    public final boolean p0() {
        e eVar;
        try {
            Fragment E = getSupportFragmentManager().E(R.id.fragmentContainer);
            if (E instanceof e) {
                eVar = (e) E;
            } else {
                eVar = null;
            }
            if (eVar == null) {
                return false;
            }
            if (!eVar.f4571z) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11497v, e10);
            return false;
        }
    }

    public final void q0() {
        try {
            if (this.f11498w == 0) {
                InsetsUtils.INSTANCE.setStatusBarColor(R.color.white, this, true, true);
            } else {
                InsetsUtils.INSTANCE.setStatusBarColor(R.color.darkMossGreen, this, true, true);
            }
            Fragment o02 = o0();
            if (o02 != null) {
                y supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
                aVar.f(R.id.fragmentContainer, o02, null);
                aVar.d(null);
                aVar.j();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11497v, e10);
        }
    }
}
