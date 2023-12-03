package kp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.subscriptionMessaging.activity.SubscriptionMessagingDashboardActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: CancelledMessagingFragment1.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp/g;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g extends Fragment {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f23745w = 0;

    /* renamed from: u  reason: collision with root package name */
    public String f23746u;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f23747v = new LinkedHashMap();

    public g() {
        LogHelper.INSTANCE.makeLogTag(g.class);
        this.f23746u = "";
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f23747v;
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
        this.f23747v.clear();
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
                this.f23746u = string;
            }
        }
        ((RobertoButton) _$_findCachedViewById(R.id.btnSubscriptionMessagingCTA1)).setOnClickListener(new View.OnClickListener(this) { // from class: kp.f

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ g f23744v;

            {
                this.f23744v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                g this$0 = this.f23744v;
                switch (i6) {
                    case 0:
                        int i10 = g.f23745w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + SubscriptionPersistence.INSTANCE.getSubscriptionType() + "&package=" + this$0.requireActivity().getPackageName())));
                        gk.a.b(null, "cancelled_message_screen_update_click");
                        this$0.requireActivity().finish();
                        return;
                    case 1:
                        int i11 = g.f23745w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        p requireActivity = this$0.requireActivity();
                        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.subscriptionMessaging.activity.SubscriptionMessagingDashboardActivity");
                        SubscriptionMessagingDashboardActivity subscriptionMessagingDashboardActivity = (SubscriptionMessagingDashboardActivity) requireActivity;
                        subscriptionMessagingDashboardActivity.A++;
                        subscriptionMessagingDashboardActivity.o0(true, false);
                        gk.a.b(null, "cancelled_message_screen_dont_renew_click");
                        return;
                    default:
                        int i12 = g.f23745w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        ((RobertoTextView) _$_findCachedViewById(R.id.tvSubscriptionMessagingCTA2)).setOnClickListener(new View.OnClickListener(this) { // from class: kp.f

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ g f23744v;

            {
                this.f23744v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                g this$0 = this.f23744v;
                switch (i6) {
                    case 0:
                        int i10 = g.f23745w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + SubscriptionPersistence.INSTANCE.getSubscriptionType() + "&package=" + this$0.requireActivity().getPackageName())));
                        gk.a.b(null, "cancelled_message_screen_update_click");
                        this$0.requireActivity().finish();
                        return;
                    case 1:
                        int i11 = g.f23745w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        p requireActivity = this$0.requireActivity();
                        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.subscriptionMessaging.activity.SubscriptionMessagingDashboardActivity");
                        SubscriptionMessagingDashboardActivity subscriptionMessagingDashboardActivity = (SubscriptionMessagingDashboardActivity) requireActivity;
                        subscriptionMessagingDashboardActivity.A++;
                        subscriptionMessagingDashboardActivity.o0(true, false);
                        gk.a.b(null, "cancelled_message_screen_dont_renew_click");
                        return;
                    default:
                        int i12 = g.f23745w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        ((AppCompatImageView) _$_findCachedViewById(R.id.ivSubscriptionMessagingClose)).setOnClickListener(new View.OnClickListener(this) { // from class: kp.f

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ g f23744v;

            {
                this.f23744v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                g this$0 = this.f23744v;
                switch (i6) {
                    case 0:
                        int i10 = g.f23745w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + SubscriptionPersistence.INSTANCE.getSubscriptionType() + "&package=" + this$0.requireActivity().getPackageName())));
                        gk.a.b(null, "cancelled_message_screen_update_click");
                        this$0.requireActivity().finish();
                        return;
                    case 1:
                        int i11 = g.f23745w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        p requireActivity = this$0.requireActivity();
                        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.subscriptionMessaging.activity.SubscriptionMessagingDashboardActivity");
                        SubscriptionMessagingDashboardActivity subscriptionMessagingDashboardActivity = (SubscriptionMessagingDashboardActivity) requireActivity;
                        subscriptionMessagingDashboardActivity.A++;
                        subscriptionMessagingDashboardActivity.o0(true, false);
                        gk.a.b(null, "cancelled_message_screen_dont_renew_click");
                        return;
                    default:
                        int i12 = g.f23745w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        ((AppCompatImageView) _$_findCachedViewById(R.id.ivSubscriptionMessagingBanner)).setImageResource(R.drawable.ir_grace_period_2);
        ((RobertoTextView) _$_findCachedViewById(R.id.tvSubscriptionMessagingTitle)).setText(R.string.messagingScreenCancelledScreen1Title);
        ((RobertoTextView) _$_findCachedViewById(R.id.tvSubscriptionMessagingBody)).setText(R.string.messagingScreenCancelledScreen1Text);
        ((RobertoButton) _$_findCachedViewById(R.id.btnSubscriptionMessagingCTA1)).setText(R.string.messagingScreenCancelledScreen1CTA1);
        ((RobertoTextView) _$_findCachedViewById(R.id.tvSubscriptionMessagingCTA2)).setText(R.string.messagingScreenCancelledScreen1CTA2);
        ApplicationPersistence.getInstance().setBooleanValue(this.f23746u, true);
        gk.a.b(null, "cancelled_message_screen_display");
    }
}
