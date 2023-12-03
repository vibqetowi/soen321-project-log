package com.theinnerhour.b2b.components.login.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import com.google.android.material.textfield.TextInputLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.activity.LoginSignupReworkActivity;
import com.theinnerhour.b2b.components.login.fragment.ReworkForgotPasswordFragment;
import com.theinnerhour.b2b.components.login.model.LoginLoading;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hc.d;
import hn.a0;
import hn.q;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
/* compiled from: ReworkForgotPasswordFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/login/fragment/ReworkForgotPasswordFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReworkForgotPasswordFragment extends Fragment {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f11318x = 0;

    /* renamed from: u  reason: collision with root package name */
    public com.google.android.material.datepicker.c f11319u;

    /* renamed from: v  reason: collision with root package name */
    public final m0 f11320v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f11321w = new LinkedHashMap();

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11322u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f11322u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return e.m(this.f11322u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11323u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f11323u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f11323u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11324u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f11324u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f11324u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public ReworkForgotPasswordFragment() {
        LogHelper.INSTANCE.makeLogTag("ReworkForgotPassword");
        this.f11320v = b0.j(this, y.a(q.class), new a(this), new b(this), new c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.g(inflater, "inflater");
        View inflate = getLayoutInflater().inflate(R.layout.fragment_forgot_password_new, (ViewGroup) null, false);
        int i6 = R.id.btnForgotBack;
        AppCompatImageView appCompatImageView = (AppCompatImageView) d.w(R.id.btnForgotBack, inflate);
        if (appCompatImageView != null) {
            i6 = R.id.btnReset;
            RobertoButton robertoButton = (RobertoButton) d.w(R.id.btnReset, inflate);
            if (robertoButton != null) {
                i6 = R.id.editText_email;
                RobertoEditText robertoEditText = (RobertoEditText) d.w(R.id.editText_email, inflate);
                if (robertoEditText != null) {
                    i6 = R.id.editText_email_container;
                    TextInputLayout textInputLayout = (TextInputLayout) d.w(R.id.editText_email_container, inflate);
                    if (textInputLayout != null) {
                        i6 = R.id.forgotTitle;
                        RobertoTextView robertoTextView = (RobertoTextView) d.w(R.id.forgotTitle, inflate);
                        if (robertoTextView != null) {
                            ScrollView scrollView = (ScrollView) inflate;
                            RobertoTextView robertoTextView2 = (RobertoTextView) d.w(R.id.resetPrompt, inflate);
                            if (robertoTextView2 != null) {
                                this.f11319u = new com.google.android.material.datepicker.c(scrollView, appCompatImageView, robertoButton, robertoEditText, textInputLayout, robertoTextView, scrollView, robertoTextView2);
                                return scrollView;
                            }
                            i6 = R.id.resetPrompt;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11321w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AppCompatImageView appCompatImageView;
        RobertoButton robertoButton;
        String string;
        com.google.android.material.datepicker.c cVar;
        RobertoEditText robertoEditText;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString(SessionManager.KEY_EMAIL)) != null && (cVar = this.f11319u) != null && (robertoEditText = (RobertoEditText) cVar.f8944d) != null) {
            robertoEditText.setText(string);
        }
        com.google.android.material.datepicker.c cVar2 = this.f11319u;
        if (cVar2 != null && (robertoButton = (RobertoButton) cVar2.f8943c) != null) {
            robertoButton.setOnClickListener(new View.OnClickListener(this) { // from class: gn.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkForgotPasswordFragment f16623v;

                {
                    this.f16623v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    OnBackPressedDispatcher onBackPressedDispatcher;
                    String str;
                    boolean z10;
                    RobertoEditText robertoEditText2;
                    Editable text;
                    int i6 = r2;
                    LoginSignupReworkActivity loginSignupReworkActivity = null;
                    ReworkForgotPasswordFragment this$0 = this.f16623v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkForgotPasswordFragment.f11318x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q qVar = (hn.q) this$0.f11320v.getValue();
                            com.google.android.material.datepicker.c cVar3 = this$0.f11319u;
                            if (cVar3 != null && (robertoEditText2 = (RobertoEditText) cVar3.f8944d) != null && (text = robertoEditText2.getText()) != null) {
                                str = text.toString();
                            } else {
                                str = null;
                            }
                            qVar.getClass();
                            if (str != null && !gv.n.B0(str)) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (!z10 && Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
                                gk.a.b(null, "fp_submit_click");
                                qVar.F.i(LoginLoading.SHOW_LOADING);
                                ta.v.H(kc.f.H(qVar), kotlinx.coroutines.o0.f23642c, 0, new a0(qVar, str, null), 2);
                                return;
                            }
                            qVar.H.i("Please enter a valid email id.");
                            return;
                        default:
                            int i11 = ReworkForgotPasswordFragment.f11318x;
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
                    }
                }
            });
        }
        com.google.android.material.datepicker.c cVar3 = this.f11319u;
        if (cVar3 != null && (appCompatImageView = (AppCompatImageView) cVar3.f8942b) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: gn.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ReworkForgotPasswordFragment f16623v;

                {
                    this.f16623v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    OnBackPressedDispatcher onBackPressedDispatcher;
                    String str;
                    boolean z10;
                    RobertoEditText robertoEditText2;
                    Editable text;
                    int i6 = r2;
                    LoginSignupReworkActivity loginSignupReworkActivity = null;
                    ReworkForgotPasswordFragment this$0 = this.f16623v;
                    switch (i6) {
                        case 0:
                            int i10 = ReworkForgotPasswordFragment.f11318x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            hn.q qVar = (hn.q) this$0.f11320v.getValue();
                            com.google.android.material.datepicker.c cVar32 = this$0.f11319u;
                            if (cVar32 != null && (robertoEditText2 = (RobertoEditText) cVar32.f8944d) != null && (text = robertoEditText2.getText()) != null) {
                                str = text.toString();
                            } else {
                                str = null;
                            }
                            qVar.getClass();
                            if (str != null && !gv.n.B0(str)) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (!z10 && Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
                                gk.a.b(null, "fp_submit_click");
                                qVar.F.i(LoginLoading.SHOW_LOADING);
                                ta.v.H(kc.f.H(qVar), kotlinx.coroutines.o0.f23642c, 0, new a0(qVar, str, null), 2);
                                return;
                            }
                            qVar.H.i("Please enter a valid email id.");
                            return;
                        default:
                            int i11 = ReworkForgotPasswordFragment.f11318x;
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
                    }
                }
            });
        }
    }
}
