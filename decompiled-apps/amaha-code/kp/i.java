package kp;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.appsflyer.R;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import kp.i;
import org.json.JSONObject;
import ss.p;
import ta.v;
/* compiled from: CancelledMessagingFragment2.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp/i;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class i extends Fragment {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f23750y = 0;

    /* renamed from: w  reason: collision with root package name */
    public Dialog f23753w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f23754x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f23751u = LogHelper.INSTANCE.makeLogTag(i.class);

    /* renamed from: v  reason: collision with root package name */
    public String f23752v = "";

    /* compiled from: CancelledMessagingFragment2.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.subscriptionMessaging.fragments.CancelledMessagingFragment2$onViewCreated$2$1", f = "CancelledMessagingFragment2.kt", l = {R.styleable.AppCompatTheme_colorError}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f23755u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f23757w;

        /* compiled from: CancelledMessagingFragment2.kt */
        /* renamed from: kp.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0366a extends kotlin.jvm.internal.k implements p<Boolean, JSONObject, hs.k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ i f23758u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0366a(i iVar) {
                super(2);
                this.f23758u = iVar;
            }

            @Override // ss.p
            public final hs.k invoke(Boolean bool, JSONObject jSONObject) {
                boolean booleanValue = bool.booleanValue();
                JSONObject jSONObject2 = jSONObject;
                i iVar = this.f23758u;
                if (booleanValue) {
                    LogHelper logHelper = LogHelper.INSTANCE;
                    String str = iVar.f23751u;
                    logHelper.i(str, "response from cloud functions " + jSONObject2);
                    Toast.makeText(iVar.requireContext(), "Thank you for your feedback", 0).show();
                    iVar.F().dismiss();
                    gk.a.b(null, "cancelled_message_screen_feedback_submit");
                    iVar.requireActivity().finish();
                } else {
                    Toast.makeText(iVar.requireContext(), "Error in sending feedback", 0).show();
                    iVar.F().dismiss();
                }
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f23757w = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f23757w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f23755u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                i iVar = i.this;
                iVar.F().show();
                C0366a c0366a = new C0366a(iVar);
                this.f23755u = 1;
                Object S = v.S(o0.f23642c, new j(iVar, this.f23757w, c0366a, null), this);
                if (S != obj2) {
                    S = hs.k.f19476a;
                }
                if (S == obj2) {
                    return obj2;
                }
            }
            return hs.k.f19476a;
        }
    }

    public final Dialog F() {
        Dialog dialog = this.f23753w;
        if (dialog != null) {
            return dialog;
        }
        kotlin.jvm.internal.i.q("loadingDialog");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f23754x;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(com.theinnerhour.b2b.R.layout.fragment_subscription_messaging, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f23754x.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("selectedScreen", "");
            if (string != null && string.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                string = null;
            }
            if (string != null) {
                this.f23752v = string;
            }
        }
        try {
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(com.theinnerhour.b2b.R.layout.dialog_loading, requireContext(), com.theinnerhour.b2b.R.style.Theme_Dialog);
            kotlin.jvm.internal.i.g(styledDialog, "<set-?>");
            this.f23753w = styledDialog;
            Window window = F().getWindow();
            kotlin.jvm.internal.i.d(window);
            window.getAttributes().windowAnimations = com.theinnerhour.b2b.R.style.DialogGrowInAndShrinkOut;
            F().setCancelable(false);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f23751u, e10);
        }
        ((RobertoButton) _$_findCachedViewById(com.theinnerhour.b2b.R.id.btnSubscriptionMessagingCTA1)).setOnClickListener(new View.OnClickListener(this) { // from class: kp.h

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ i f23749v;

            {
                this.f23749v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                boolean z11;
                int i6 = r2;
                i this$0 = this.f23749v;
                switch (i6) {
                    case 0:
                        int i10 = i.f23750y;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Editable text = ((RobertoEditText) this$0._$_findCachedViewById(com.theinnerhour.b2b.R.id.etSubscriptionMessagingFeedback)).getText();
                        kotlin.jvm.internal.i.d(text);
                        String obj = text.toString();
                        if (n.F0(obj, " ", "").length() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            if (ConnectionStatusReceiver.isConnected()) {
                                androidx.lifecycle.p viewLifecycleOwner = this$0.getViewLifecycleOwner();
                                kotlin.jvm.internal.i.f(viewLifecycleOwner, "viewLifecycleOwner");
                                v.H(ca.a.m0(viewLifecycleOwner), null, 0, new i.a(obj, null), 3);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(this$0.requireContext(), "Enter Feedback", 0).show();
                        return;
                    default:
                        int i11 = i.f23750y;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.requireActivity().onBackPressed();
                        return;
                }
            }
        });
        ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivSubscriptionMessagingClose)).setOnClickListener(new View.OnClickListener(this) { // from class: kp.h

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ i f23749v;

            {
                this.f23749v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                boolean z11;
                int i6 = r2;
                i this$0 = this.f23749v;
                switch (i6) {
                    case 0:
                        int i10 = i.f23750y;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Editable text = ((RobertoEditText) this$0._$_findCachedViewById(com.theinnerhour.b2b.R.id.etSubscriptionMessagingFeedback)).getText();
                        kotlin.jvm.internal.i.d(text);
                        String obj = text.toString();
                        if (n.F0(obj, " ", "").length() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            if (ConnectionStatusReceiver.isConnected()) {
                                androidx.lifecycle.p viewLifecycleOwner = this$0.getViewLifecycleOwner();
                                kotlin.jvm.internal.i.f(viewLifecycleOwner, "viewLifecycleOwner");
                                v.H(ca.a.m0(viewLifecycleOwner), null, 0, new i.a(obj, null), 3);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(this$0.requireContext(), "Enter Feedback", 0).show();
                        return;
                    default:
                        int i11 = i.f23750y;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.requireActivity().onBackPressed();
                        return;
                }
            }
        });
        ((AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivSubscriptionMessagingBanner)).setImageResource(com.theinnerhour.b2b.R.drawable.ir_subscription_cancelled_feedback);
        ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.tvSubscriptionMessagingTitle)).setText(com.theinnerhour.b2b.R.string.messagingScreenCancelledScreen2Title);
        ((RobertoEditText) _$_findCachedViewById(com.theinnerhour.b2b.R.id.etSubscriptionMessagingFeedback)).setHint(com.theinnerhour.b2b.R.string.messagingScreenCancelledScreen2Hint);
        ((RobertoButton) _$_findCachedViewById(com.theinnerhour.b2b.R.id.btnSubscriptionMessagingCTA1)).setText(com.theinnerhour.b2b.R.string.messagingScreenCancelledScreen2CTA1);
        ((RobertoEditText) _$_findCachedViewById(com.theinnerhour.b2b.R.id.etSubscriptionMessagingFeedback)).setVisibility(0);
        ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.tvSubscriptionMessagingCTA2)).setVisibility(8);
        ((RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.tvSubscriptionMessagingBody)).setVisibility(8);
        ApplicationPersistence.getInstance().setBooleanValue(this.f23752v, true);
    }
}
