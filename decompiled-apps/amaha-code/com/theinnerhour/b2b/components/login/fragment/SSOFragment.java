package com.theinnerhour.b2b.components.login.fragment;

import am.w;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.google.android.material.textfield.TextInputLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.WebviewActivity;
import com.theinnerhour.b2b.components.login.activity.LoginSignupReworkActivity;
import com.theinnerhour.b2b.components.login.activity.SSOLoginPWA;
import com.theinnerhour.b2b.components.login.fragment.SSOFragment;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hn.g0;
import hn.q;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import q.d;
import ss.l;
import yp.h;
/* compiled from: SSOFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/login/fragment/SSOFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SSOFragment extends Fragment {
    public static final /* synthetic */ int A = 0;

    /* renamed from: w  reason: collision with root package name */
    public h f11362w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f11363x;

    /* renamed from: y  reason: collision with root package name */
    public final dc.b f11364y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f11365z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f11360u = LogHelper.INSTANCE.makeLogTag("SSOFragment");

    /* renamed from: v  reason: collision with root package name */
    public final m0 f11361v = b0.j(this, y.a(q.class), new e(this), new f(this), new g(this));

    /* compiled from: SSOFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<SingleUseEvent<? extends String>, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends String> singleUseEvent) {
            String contentIfNotHandled;
            SingleUseEvent<? extends String> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
                SSOFragment sSOFragment = SSOFragment.this;
                sSOFragment.f11363x.a(new Intent(sSOFragment.requireActivity(), SSOLoginPWA.class).putExtra(Constants.NOTIFICATION_URL, contentIfNotHandled));
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: SSOFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<SingleUseEvent<? extends String>, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends String> singleUseEvent) {
            String contentIfNotHandled;
            RobertoTextView robertoTextView;
            SingleUseEvent<? extends String> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
                SSOFragment sSOFragment = SSOFragment.this;
                h hVar = sSOFragment.f11362w;
                RobertoTextView robertoTextView2 = null;
                if (hVar != null) {
                    robertoTextView = hVar.f38805e;
                } else {
                    robertoTextView = null;
                }
                if (robertoTextView != null) {
                    robertoTextView.setVisibility(0);
                }
                h hVar2 = sSOFragment.f11362w;
                if (hVar2 != null) {
                    robertoTextView2 = hVar2.f38805e;
                }
                if (robertoTextView2 != null) {
                    robertoTextView2.setText(contentIfNotHandled);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: SSOFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends ClickableSpan {
        public c() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View widget) {
            SSOFragment sSOFragment = SSOFragment.this;
            i.g(widget, "widget");
            try {
                s5 s5Var = new s5(15);
                Context requireContext = sSOFragment.requireContext();
                i.f(requireContext, "requireContext()");
                if (s5Var.b(requireContext)) {
                    d.b bVar = new d.b();
                    Integer valueOf = Integer.valueOf(g0.a.b(sSOFragment.requireContext(), R.color.newTemplateDarkGrey) | (-16777216));
                    Bundle bundle = new Bundle();
                    if (valueOf != null) {
                        bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                    }
                    bVar.f29100c = bundle;
                    bVar.a().a(sSOFragment.requireContext(), Uri.parse("https://www.amahahealth.com/privacy-policy"));
                    return;
                }
                Intent intent = new Intent(sSOFragment.requireContext(), WebviewActivity.class);
                intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/privacy-policy");
                sSOFragment.startActivity(intent);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(sSOFragment.f11360u, e10);
            }
        }
    }

    /* compiled from: SSOFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends ClickableSpan {
        public d() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View textView) {
            SSOFragment sSOFragment = SSOFragment.this;
            i.g(textView, "textView");
            try {
                s5 s5Var = new s5(15);
                Context requireContext = sSOFragment.requireContext();
                i.f(requireContext, "requireContext()");
                if (s5Var.b(requireContext)) {
                    d.b bVar = new d.b();
                    Integer valueOf = Integer.valueOf(g0.a.b(sSOFragment.requireContext(), R.color.newTemplateDarkGrey) | (-16777216));
                    Bundle bundle = new Bundle();
                    if (valueOf != null) {
                        bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                    }
                    bVar.f29100c = bundle;
                    bVar.a().a(sSOFragment.requireContext(), Uri.parse("https://www.amahahealth.com/terms-and-conditions"));
                    return;
                }
                Intent intent = new Intent(sSOFragment.requireContext(), WebviewActivity.class);
                intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/terms-and-conditions");
                sSOFragment.startActivity(intent);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(sSOFragment.f11360u, e10);
            }
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11370u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f11370u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f11370u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class f extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11371u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f11371u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f11371u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class g extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11372u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f11372u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f11372u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public SSOFragment() {
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new w(22, this));
        i.f(registerForActivityResult, "registerForActivityResul…leSSOResult(result)\n    }");
        this.f11363x = registerForActivityResult;
        this.f11364y = new dc.b(4, this);
    }

    public final q F() {
        return (q) this.f11361v.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.g(inflater, "inflater");
        View inflate = getLayoutInflater().inflate(R.layout.fragment_sso, (ViewGroup) null, false);
        int i6 = R.id.btnSSOContinue;
        RobertoButton robertoButton = (RobertoButton) hc.d.w(R.id.btnSSOContinue, inflate);
        if (robertoButton != null) {
            i6 = R.id.cbSSOTnC;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) hc.d.w(R.id.cbSSOTnC, inflate);
            if (appCompatCheckBox != null) {
                i6 = R.id.etSSOEmail;
                RobertoEditText robertoEditText = (RobertoEditText) hc.d.w(R.id.etSSOEmail, inflate);
                if (robertoEditText != null) {
                    i6 = R.id.guideline20;
                    if (((Guideline) hc.d.w(R.id.guideline20, inflate)) != null) {
                        i6 = R.id.guideline80;
                        if (((Guideline) hc.d.w(R.id.guideline80, inflate)) != null) {
                            i6 = R.id.ivSSOBack;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.ivSSOBack, inflate);
                            if (appCompatImageView != null) {
                                i6 = R.id.ssoBlankSpace;
                                if (hc.d.w(R.id.ssoBlankSpace, inflate) != null) {
                                    i6 = R.id.tilSSOEmail;
                                    if (((TextInputLayout) hc.d.w(R.id.tilSSOEmail, inflate)) != null) {
                                        i6 = R.id.tvSSOEmailError;
                                        RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.tvSSOEmailError, inflate);
                                        if (robertoTextView != null) {
                                            i6 = R.id.tvSSOSubtext;
                                            if (((RobertoTextView) hc.d.w(R.id.tvSSOSubtext, inflate)) != null) {
                                                i6 = R.id.tvSSOTitle;
                                                if (((RobertoTextView) hc.d.w(R.id.tvSSOTitle, inflate)) != null) {
                                                    i6 = R.id.tvSSOTnC;
                                                    RobertoTextView robertoTextView2 = (RobertoTextView) hc.d.w(R.id.tvSSOTnC, inflate);
                                                    if (robertoTextView2 != null) {
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                        this.f11362w = new h(constraintLayout, robertoButton, appCompatCheckBox, robertoEditText, appCompatImageView, robertoTextView, robertoTextView2);
                                                        return constraintLayout;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f11362w = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11365z.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RobertoTextView robertoTextView;
        RobertoTextView robertoTextView2;
        RobertoButton robertoButton;
        AppCompatImageView appCompatImageView;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        q F = F();
        F.J.e(getViewLifecycleOwner(), new gn.l(5, new a()));
        F.K.e(getViewLifecycleOwner(), new gn.l(6, new b()));
        SpannableString spannableString = new SpannableString(getString(R.string.ssoTCAndPP));
        d dVar = new d();
        c cVar = new c();
        spannableString.setSpan(dVar, 17, 35, 33);
        spannableString.setSpan(cVar, 40, 54, 33);
        h hVar = this.f11362w;
        RobertoEditText robertoEditText = null;
        if (hVar != null) {
            robertoTextView = hVar.f;
        } else {
            robertoTextView = null;
        }
        if (robertoTextView != null) {
            robertoTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        h hVar2 = this.f11362w;
        if (hVar2 != null) {
            robertoTextView2 = hVar2.f;
        } else {
            robertoTextView2 = null;
        }
        if (robertoTextView2 != null) {
            robertoTextView2.setText(spannableString);
        }
        h hVar3 = this.f11362w;
        if (hVar3 != null && (appCompatImageView = hVar3.f38804d) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: gn.x

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ SSOFragment f16663v;

                {
                    this.f16663v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean z10;
                    RobertoTextView robertoTextView3;
                    String str;
                    RobertoEditText robertoEditText2;
                    Editable text;
                    AppCompatCheckBox appCompatCheckBox;
                    OnBackPressedDispatcher onBackPressedDispatcher;
                    int i6 = r2;
                    LoginSignupReworkActivity loginSignupReworkActivity = null;
                    SSOFragment this$0 = this.f16663v;
                    switch (i6) {
                        case 0:
                            int i10 = SSOFragment.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            if (requireActivity instanceof LoginSignupReworkActivity) {
                                loginSignupReworkActivity = (LoginSignupReworkActivity) requireActivity;
                            }
                            if (loginSignupReworkActivity != null && (onBackPressedDispatcher = loginSignupReworkActivity.getOnBackPressedDispatcher()) != null) {
                                onBackPressedDispatcher.b();
                                return;
                            }
                            return;
                        default:
                            int i11 = SSOFragment.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            yp.h hVar4 = this$0.f11362w;
                            boolean z11 = true;
                            if (hVar4 != null && (appCompatCheckBox = hVar4.f38802b) != null && appCompatCheckBox.isChecked()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                yp.h hVar5 = this$0.f11362w;
                                if (hVar5 != null) {
                                    robertoTextView3 = hVar5.f38805e;
                                } else {
                                    robertoTextView3 = null;
                                }
                                if (robertoTextView3 != null) {
                                    robertoTextView3.setVisibility(8);
                                }
                                hn.q F2 = this$0.F();
                                yp.h hVar6 = this$0.f11362w;
                                if (hVar6 != null && (robertoEditText2 = hVar6.f38803c) != null && (text = robertoEditText2.getText()) != null) {
                                    str = text.toString();
                                } else {
                                    str = null;
                                }
                                hs.f<Boolean, String> w10 = F2.w(str);
                                if (F2.k() && w10.f19464u.booleanValue()) {
                                    ta.v.H(kc.f.H(F2), null, 0, new g0(F2, str, null), 3);
                                }
                                String str2 = w10.f19465v;
                                if (str2 != null) {
                                    F2.K.i(new SingleUseEvent<>(str2));
                                }
                                Bundle a10 = r1.b0.a("type", "sso");
                                a10.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                                gk.a.b(a10, "login_click");
                                hn.q F3 = this$0.F();
                                if (F3.N != 3) {
                                    z11 = false;
                                }
                                if (!z11) {
                                    F3.j();
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            });
        }
        h hVar4 = this.f11362w;
        if (hVar4 != null && (robertoButton = hVar4.f38801a) != null) {
            robertoButton.setOnClickListener(new View.OnClickListener(this) { // from class: gn.x

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ SSOFragment f16663v;

                {
                    this.f16663v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean z10;
                    RobertoTextView robertoTextView3;
                    String str;
                    RobertoEditText robertoEditText2;
                    Editable text;
                    AppCompatCheckBox appCompatCheckBox;
                    OnBackPressedDispatcher onBackPressedDispatcher;
                    int i6 = r2;
                    LoginSignupReworkActivity loginSignupReworkActivity = null;
                    SSOFragment this$0 = this.f16663v;
                    switch (i6) {
                        case 0:
                            int i10 = SSOFragment.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            if (requireActivity instanceof LoginSignupReworkActivity) {
                                loginSignupReworkActivity = (LoginSignupReworkActivity) requireActivity;
                            }
                            if (loginSignupReworkActivity != null && (onBackPressedDispatcher = loginSignupReworkActivity.getOnBackPressedDispatcher()) != null) {
                                onBackPressedDispatcher.b();
                                return;
                            }
                            return;
                        default:
                            int i11 = SSOFragment.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            yp.h hVar42 = this$0.f11362w;
                            boolean z11 = true;
                            if (hVar42 != null && (appCompatCheckBox = hVar42.f38802b) != null && appCompatCheckBox.isChecked()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                yp.h hVar5 = this$0.f11362w;
                                if (hVar5 != null) {
                                    robertoTextView3 = hVar5.f38805e;
                                } else {
                                    robertoTextView3 = null;
                                }
                                if (robertoTextView3 != null) {
                                    robertoTextView3.setVisibility(8);
                                }
                                hn.q F2 = this$0.F();
                                yp.h hVar6 = this$0.f11362w;
                                if (hVar6 != null && (robertoEditText2 = hVar6.f38803c) != null && (text = robertoEditText2.getText()) != null) {
                                    str = text.toString();
                                } else {
                                    str = null;
                                }
                                hs.f<Boolean, String> w10 = F2.w(str);
                                if (F2.k() && w10.f19464u.booleanValue()) {
                                    ta.v.H(kc.f.H(F2), null, 0, new g0(F2, str, null), 3);
                                }
                                String str2 = w10.f19465v;
                                if (str2 != null) {
                                    F2.K.i(new SingleUseEvent<>(str2));
                                }
                                Bundle a10 = r1.b0.a("type", "sso");
                                a10.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                                gk.a.b(a10, "login_click");
                                hn.q F3 = this$0.F();
                                if (F3.N != 3) {
                                    z11 = false;
                                }
                                if (!z11) {
                                    F3.j();
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            });
        }
        h hVar5 = this.f11362w;
        if (hVar5 != null) {
            robertoEditText = hVar5.f38803c;
        }
        if (robertoEditText != null) {
            robertoEditText.setOnFocusChangeListener(this.f11364y);
        }
    }
}
