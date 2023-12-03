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
import com.theinnerhour.b2b.R;
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
/* compiled from: GracePeriodMessagingFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp/l;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class l extends Fragment {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f23764z = 0;

    /* renamed from: w  reason: collision with root package name */
    public long f23767w;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f23769y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f23765u = LogHelper.INSTANCE.makeLogTag(l.class);

    /* renamed from: v  reason: collision with root package name */
    public String f23766v = "";

    /* renamed from: x  reason: collision with root package name */
    public final Bundle f23768x = new Bundle();

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f23769y;
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
        this.f23769y.clear();
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
                this.f23766v = string;
            }
            this.f23767w = arguments.getLong("currentDay", 0L);
        }
        ((RobertoButton) _$_findCachedViewById(R.id.btnSubscriptionMessagingCTA1)).setOnClickListener(new View.OnClickListener(this) { // from class: kp.k

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ l f23763v;

            {
                this.f23763v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                l this$0 = this.f23763v;
                switch (i6) {
                    case 0:
                        int i10 = l.f23764z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + SubscriptionPersistence.INSTANCE.getSubscriptionType() + "&package=" + this$0.requireActivity().getPackageName())));
                        String str = gk.a.f16573a;
                        gk.a.b(this$0.f23768x, "grace_message_screen_update_click");
                        this$0.requireActivity().finish();
                        return;
                    case 1:
                        int i11 = l.f23764z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("source", "grace_period_messaging");
                            bundle2.putLong("day", this$0.f23767w);
                            String str2 = gk.a.f16573a;
                            gk.a.b(this$0.f23768x, "grace_message_screen_learn_more_click");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_grace_fullscreen, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                            Window window = styledDialog.getWindow();
                            if (window != null) {
                                window.setLayout(-1, -1);
                            }
                            ((AppCompatImageView) styledDialog.findViewById(R.id.dialogGraceBack)).setOnClickListener(new lm.f(styledDialog, 25));
                            ((RobertoButton) styledDialog.findViewById(R.id.btnGraceDialogCTA)).setOnClickListener(new nn.g(styledDialog, this$0, bundle2, 6));
                            ((RobertoTextView) styledDialog.findViewById(R.id.tvGracePoint3Body)).setMovementMethod(LinkMovementMethod.getInstance());
                            ((RobertoTextView) styledDialog.findViewById(R.id.tvGracePoint5Body)).setMovementMethod(LinkMovementMethod.getInstance());
                            styledDialog.show();
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f23765u, e10);
                            return;
                        }
                    default:
                        int i12 = l.f23764z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        ((RobertoTextView) _$_findCachedViewById(R.id.tvSubscriptionMessagingCTA2)).setOnClickListener(new View.OnClickListener(this) { // from class: kp.k

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ l f23763v;

            {
                this.f23763v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                l this$0 = this.f23763v;
                switch (i6) {
                    case 0:
                        int i10 = l.f23764z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + SubscriptionPersistence.INSTANCE.getSubscriptionType() + "&package=" + this$0.requireActivity().getPackageName())));
                        String str = gk.a.f16573a;
                        gk.a.b(this$0.f23768x, "grace_message_screen_update_click");
                        this$0.requireActivity().finish();
                        return;
                    case 1:
                        int i11 = l.f23764z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("source", "grace_period_messaging");
                            bundle2.putLong("day", this$0.f23767w);
                            String str2 = gk.a.f16573a;
                            gk.a.b(this$0.f23768x, "grace_message_screen_learn_more_click");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_grace_fullscreen, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                            Window window = styledDialog.getWindow();
                            if (window != null) {
                                window.setLayout(-1, -1);
                            }
                            ((AppCompatImageView) styledDialog.findViewById(R.id.dialogGraceBack)).setOnClickListener(new lm.f(styledDialog, 25));
                            ((RobertoButton) styledDialog.findViewById(R.id.btnGraceDialogCTA)).setOnClickListener(new nn.g(styledDialog, this$0, bundle2, 6));
                            ((RobertoTextView) styledDialog.findViewById(R.id.tvGracePoint3Body)).setMovementMethod(LinkMovementMethod.getInstance());
                            ((RobertoTextView) styledDialog.findViewById(R.id.tvGracePoint5Body)).setMovementMethod(LinkMovementMethod.getInstance());
                            styledDialog.show();
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f23765u, e10);
                            return;
                        }
                    default:
                        int i12 = l.f23764z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        ((AppCompatImageView) _$_findCachedViewById(R.id.ivSubscriptionMessagingClose)).setOnClickListener(new View.OnClickListener(this) { // from class: kp.k

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ l f23763v;

            {
                this.f23763v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                l this$0 = this.f23763v;
                switch (i6) {
                    case 0:
                        int i10 = l.f23764z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + SubscriptionPersistence.INSTANCE.getSubscriptionType() + "&package=" + this$0.requireActivity().getPackageName())));
                        String str = gk.a.f16573a;
                        gk.a.b(this$0.f23768x, "grace_message_screen_update_click");
                        this$0.requireActivity().finish();
                        return;
                    case 1:
                        int i11 = l.f23764z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("source", "grace_period_messaging");
                            bundle2.putLong("day", this$0.f23767w);
                            String str2 = gk.a.f16573a;
                            gk.a.b(this$0.f23768x, "grace_message_screen_learn_more_click");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_grace_fullscreen, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                            Window window = styledDialog.getWindow();
                            if (window != null) {
                                window.setLayout(-1, -1);
                            }
                            ((AppCompatImageView) styledDialog.findViewById(R.id.dialogGraceBack)).setOnClickListener(new lm.f(styledDialog, 25));
                            ((RobertoButton) styledDialog.findViewById(R.id.btnGraceDialogCTA)).setOnClickListener(new nn.g(styledDialog, this$0, bundle2, 6));
                            ((RobertoTextView) styledDialog.findViewById(R.id.tvGracePoint3Body)).setMovementMethod(LinkMovementMethod.getInstance());
                            ((RobertoTextView) styledDialog.findViewById(R.id.tvGracePoint5Body)).setMovementMethod(LinkMovementMethod.getInstance());
                            styledDialog.show();
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f23765u, e10);
                            return;
                        }
                    default:
                        int i12 = l.f23764z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        if (kotlin.jvm.internal.i.b(this.f23766v, Constants.GRACE_DIALOG_2_SHOWN)) {
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivSubscriptionMessagingBanner)).setImageResource(R.drawable.ir_grace_period_2);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvSubscriptionMessagingTitle)).setText(R.string.messagingScreenGraceDay3Title);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvSubscriptionMessagingBody)).setText(R.string.messagingScreenGraceDay3Text);
            ((RobertoButton) _$_findCachedViewById(R.id.btnSubscriptionMessagingCTA1)).setText(R.string.messagingScreenGraceDay3CTA1);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvSubscriptionMessagingCTA2)).setText(R.string.messagingScreenGraceDay3CTA2);
        } else {
            SubscriptionModel currentSubscriptionModel = SubscriptionPersistence.INSTANCE.getCurrentSubscriptionModel();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentSubscriptionModel.getExpiryTime());
            String obj = DateFormat.format("dd-MM-yyyy", calendar).toString();
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivSubscriptionMessagingBanner)).setImageResource(R.drawable.ir_grace_period_1);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvSubscriptionMessagingTitle)).setText(R.string.messagingScreenGraceDay1Title);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvSubscriptionMessagingBody)).setText(requireActivity().getString(R.string.messagingScreenGraceDay1Text, obj));
            ((RobertoButton) _$_findCachedViewById(R.id.btnSubscriptionMessagingCTA1)).setText(R.string.messagingScreenGraceDay1CTA1);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvSubscriptionMessagingCTA2)).setText(R.string.messagingScreenGraceDay1CTA2);
        }
        ApplicationPersistence.getInstance().setBooleanValue(this.f23766v, true);
        long j10 = this.f23767w;
        Bundle bundle2 = this.f23768x;
        bundle2.putLong("day", j10);
        gk.a.b(bundle2, "grace_message_screen_display");
    }
}
