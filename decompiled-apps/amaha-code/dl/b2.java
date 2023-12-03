package dl;

import android.app.Dialog;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.Locale;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class b2 extends kotlin.jvm.internal.k implements ss.l<Long, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f12984u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(V3DashboardActivity v3DashboardActivity) {
        super(1);
        this.f12984u = v3DashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(Long l2) {
        WindowManager.LayoutParams layoutParams;
        Long expiryTime = l2;
        if (expiryTime == null || expiryTime.longValue() != 0) {
            kotlin.jvm.internal.i.f(expiryTime, "expiryTime");
            long longValue = expiryTime.longValue();
            int i6 = V3DashboardActivity.f10714r1;
            V3DashboardActivity v3DashboardActivity = this.f12984u;
            v3DashboardActivity.getClass();
            try {
                String format = LocalDateTime.ofEpochSecond(longValue / 1000, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(longValue))).format(DateTimeFormatter.ofPattern("MMMM dd, yyyy").withLocale(Locale.ENGLISH));
                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_subscription_expired, v3DashboardActivity, R.style.Theme_Dialog);
                Window window = styledDialog.getWindow();
                if (window != null) {
                    layoutParams = window.getAttributes();
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                }
                TextView textView = (TextView) styledDialog.findViewById(R.id.tvSubscriptionExpireDialogMessage);
                if (textView != null) {
                    textView.setText(v3DashboardActivity.getString(R.string.subscription_expire_popup_description, format));
                }
                ((TextView) styledDialog.findViewById(R.id.tvSubscriptionExpireDialogCancel)).setOnClickListener(new dk.n(styledDialog, 12));
                ((ConstraintLayout) styledDialog.findViewById(R.id.clSubscriptionExpireDialogPurchaseNow)).setOnClickListener(new k0(v3DashboardActivity, styledDialog, 1));
                ApplicationPersistence.getInstance().setBooleanValue(Constants.SUBSCRIPTION_EXPIRY_SHOWN, true);
                styledDialog.show();
                gk.a.b(null, "pr_app_sub_repurchase_popup_show");
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(v3DashboardActivity.f10748v, e10);
            }
        }
        return hs.k.f19476a;
    }
}
