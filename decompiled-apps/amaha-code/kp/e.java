package kp;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.subscriptionMessaging.activity.SubscriptionMessagingDashboardActivity;
import com.theinnerhour.b2b.model.SubscriptionModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Calendar;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: AccountHoldMessagingFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e extends Fragment {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f23737z = 0;

    /* renamed from: w  reason: collision with root package name */
    public long f23740w;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f23742y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f23738u = LogHelper.INSTANCE.makeLogTag(e.class);

    /* renamed from: v  reason: collision with root package name */
    public String f23739v = "";

    /* renamed from: x  reason: collision with root package name */
    public final Bundle f23741x = new Bundle();

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f23742y;
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
        return inflater.inflate(R.layout.fragment_subscription_messaging, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f23742y.clear();
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
                this.f23739v = string;
            }
            this.f23740w = arguments.getLong("currentDay", 0L);
        }
        ((RobertoButton) _$_findCachedViewById(R.id.btnSubscriptionMessagingCTA1)).setOnClickListener(new View.OnClickListener(this) { // from class: kp.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ e f23722v;

            {
                this.f23722v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                e this$0 = this.f23722v;
                switch (i6) {
                    case 0:
                        int i10 = e.f23737z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + SubscriptionPersistence.INSTANCE.getSubscriptionType() + "&package=" + this$0.requireActivity().getPackageName())));
                        String str = gk.a.f16573a;
                        gk.a.b(this$0.f23741x, "hold_message_screen_update_click");
                        this$0.requireActivity().finish();
                        return;
                    case 1:
                        int i11 = e.f23737z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        boolean b10 = kotlin.jvm.internal.i.b(this$0.f23739v, Constants.HOLD_DIALOG_4_SHOWN);
                        Bundle bundle2 = this$0.f23741x;
                        if (b10) {
                            p requireActivity = this$0.requireActivity();
                            kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.subscriptionMessaging.activity.SubscriptionMessagingDashboardActivity");
                            SubscriptionMessagingDashboardActivity subscriptionMessagingDashboardActivity = (SubscriptionMessagingDashboardActivity) requireActivity;
                            subscriptionMessagingDashboardActivity.A++;
                            subscriptionMessagingDashboardActivity.o0(true, false);
                            gk.a.b(bundle2, "hold_message_screen_dont_renew_click");
                            return;
                        }
                        try {
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("source", "account_hold_messaging");
                            bundle3.putLong("day", this$0.f23740w);
                            gk.a.b(bundle2, "hold_message_screen_learn_more_click");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_grace_fullscreen, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                            Window window = styledDialog.getWindow();
                            if (window != null) {
                                window.setLayout(-1, -1);
                            }
                            ((AppCompatImageView) styledDialog.findViewById(R.id.dialogGraceBack)).setOnClickListener(new lm.f(styledDialog, 24));
                            ((RobertoButton) styledDialog.findViewById(R.id.btnGraceDialogCTA)).setOnClickListener(new nn.g(styledDialog, this$0, bundle3, 5));
                            ((RobertoTextView) styledDialog.findViewById(R.id.tvGracePoint3Body)).setMovementMethod(LinkMovementMethod.getInstance());
                            ((RobertoTextView) styledDialog.findViewById(R.id.tvGracePoint5Body)).setMovementMethod(LinkMovementMethod.getInstance());
                            styledDialog.show();
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f23738u, e10);
                            return;
                        }
                    default:
                        int i12 = e.f23737z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        ((RobertoTextView) _$_findCachedViewById(R.id.tvSubscriptionMessagingCTA2)).setOnClickListener(new View.OnClickListener(this) { // from class: kp.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ e f23722v;

            {
                this.f23722v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                e this$0 = this.f23722v;
                switch (i6) {
                    case 0:
                        int i10 = e.f23737z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + SubscriptionPersistence.INSTANCE.getSubscriptionType() + "&package=" + this$0.requireActivity().getPackageName())));
                        String str = gk.a.f16573a;
                        gk.a.b(this$0.f23741x, "hold_message_screen_update_click");
                        this$0.requireActivity().finish();
                        return;
                    case 1:
                        int i11 = e.f23737z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        boolean b10 = kotlin.jvm.internal.i.b(this$0.f23739v, Constants.HOLD_DIALOG_4_SHOWN);
                        Bundle bundle2 = this$0.f23741x;
                        if (b10) {
                            p requireActivity = this$0.requireActivity();
                            kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.subscriptionMessaging.activity.SubscriptionMessagingDashboardActivity");
                            SubscriptionMessagingDashboardActivity subscriptionMessagingDashboardActivity = (SubscriptionMessagingDashboardActivity) requireActivity;
                            subscriptionMessagingDashboardActivity.A++;
                            subscriptionMessagingDashboardActivity.o0(true, false);
                            gk.a.b(bundle2, "hold_message_screen_dont_renew_click");
                            return;
                        }
                        try {
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("source", "account_hold_messaging");
                            bundle3.putLong("day", this$0.f23740w);
                            gk.a.b(bundle2, "hold_message_screen_learn_more_click");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_grace_fullscreen, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                            Window window = styledDialog.getWindow();
                            if (window != null) {
                                window.setLayout(-1, -1);
                            }
                            ((AppCompatImageView) styledDialog.findViewById(R.id.dialogGraceBack)).setOnClickListener(new lm.f(styledDialog, 24));
                            ((RobertoButton) styledDialog.findViewById(R.id.btnGraceDialogCTA)).setOnClickListener(new nn.g(styledDialog, this$0, bundle3, 5));
                            ((RobertoTextView) styledDialog.findViewById(R.id.tvGracePoint3Body)).setMovementMethod(LinkMovementMethod.getInstance());
                            ((RobertoTextView) styledDialog.findViewById(R.id.tvGracePoint5Body)).setMovementMethod(LinkMovementMethod.getInstance());
                            styledDialog.show();
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f23738u, e10);
                            return;
                        }
                    default:
                        int i12 = e.f23737z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        ((AppCompatImageView) _$_findCachedViewById(R.id.ivSubscriptionMessagingClose)).setOnClickListener(new View.OnClickListener(this) { // from class: kp.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ e f23722v;

            {
                this.f23722v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                e this$0 = this.f23722v;
                switch (i6) {
                    case 0:
                        int i10 = e.f23737z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + SubscriptionPersistence.INSTANCE.getSubscriptionType() + "&package=" + this$0.requireActivity().getPackageName())));
                        String str = gk.a.f16573a;
                        gk.a.b(this$0.f23741x, "hold_message_screen_update_click");
                        this$0.requireActivity().finish();
                        return;
                    case 1:
                        int i11 = e.f23737z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        boolean b10 = kotlin.jvm.internal.i.b(this$0.f23739v, Constants.HOLD_DIALOG_4_SHOWN);
                        Bundle bundle2 = this$0.f23741x;
                        if (b10) {
                            p requireActivity = this$0.requireActivity();
                            kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.subscriptionMessaging.activity.SubscriptionMessagingDashboardActivity");
                            SubscriptionMessagingDashboardActivity subscriptionMessagingDashboardActivity = (SubscriptionMessagingDashboardActivity) requireActivity;
                            subscriptionMessagingDashboardActivity.A++;
                            subscriptionMessagingDashboardActivity.o0(true, false);
                            gk.a.b(bundle2, "hold_message_screen_dont_renew_click");
                            return;
                        }
                        try {
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("source", "account_hold_messaging");
                            bundle3.putLong("day", this$0.f23740w);
                            gk.a.b(bundle2, "hold_message_screen_learn_more_click");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_grace_fullscreen, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                            Window window = styledDialog.getWindow();
                            if (window != null) {
                                window.setLayout(-1, -1);
                            }
                            ((AppCompatImageView) styledDialog.findViewById(R.id.dialogGraceBack)).setOnClickListener(new lm.f(styledDialog, 24));
                            ((RobertoButton) styledDialog.findViewById(R.id.btnGraceDialogCTA)).setOnClickListener(new nn.g(styledDialog, this$0, bundle3, 5));
                            ((RobertoTextView) styledDialog.findViewById(R.id.tvGracePoint3Body)).setMovementMethod(LinkMovementMethod.getInstance());
                            ((RobertoTextView) styledDialog.findViewById(R.id.tvGracePoint5Body)).setMovementMethod(LinkMovementMethod.getInstance());
                            styledDialog.show();
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f23738u, e10);
                            return;
                        }
                    default:
                        int i12 = e.f23737z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        if (kotlin.jvm.internal.i.b(this.f23739v, Constants.HOLD_DIALOG_4_SHOWN)) {
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivSubscriptionMessagingBanner)).setImageResource(R.drawable.ir_grace_period_2);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvSubscriptionMessagingTitle)).setText(R.string.messagingScreenHoldDay30Title);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvSubscriptionMessagingBody)).setText(R.string.messagingScreenHoldDay30Text);
            ((RobertoButton) _$_findCachedViewById(R.id.btnSubscriptionMessagingCTA1)).setText(R.string.messagingScreenHoldDay30CTA1);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvSubscriptionMessagingCTA2)).setText(R.string.messagingScreenHoldDay30CTA2);
        } else {
            SubscriptionModel currentSubscriptionModel = SubscriptionPersistence.INSTANCE.getCurrentSubscriptionModel();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentSubscriptionModel.getExpiryTime());
            String obj = DateFormat.format("dd-MM-yyyy", calendar).toString();
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivSubscriptionMessagingBanner)).setImageResource(R.drawable.ir_grace_period_2);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvSubscriptionMessagingTitle)).setText(R.string.messagingScreenHoldDay1Title);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvSubscriptionMessagingBody)).setText(requireActivity().getString(R.string.messagingScreenHoldDay1Text, obj));
            ((RobertoButton) _$_findCachedViewById(R.id.btnSubscriptionMessagingCTA1)).setText(R.string.messagingScreenHoldCTA1);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvSubscriptionMessagingCTA2)).setText(R.string.messagingScreenHoldCTA2);
        }
        ApplicationPersistence.getInstance().setBooleanValue(this.f23739v, true);
        long j10 = this.f23740w;
        Bundle bundle2 = this.f23741x;
        bundle2.putLong("day", j10);
        gk.a.b(bundle2, "hold_message_screen_display");
    }
}
