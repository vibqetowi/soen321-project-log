package com.theinnerhour.b2b.utils;

import android.app.Activity;
import android.app.Dialog;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.LoadingDots;
import kotlin.Metadata;
/* compiled from: ProgressDialogUtil.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\"\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/theinnerhour/b2b/utils/ProgressDialogUtil;", "", "Lhs/k;", "show", "dismiss", "Landroid/app/Activity;", Constants.SCREEN_ACTIVITY, "Landroid/app/Activity;", "getActivity$app_productionRelease", "()Landroid/app/Activity;", "setActivity$app_productionRelease", "(Landroid/app/Activity;)V", "", "TAG", "Ljava/lang/String;", "Landroid/app/Dialog;", "loadingDialog", "Landroid/app/Dialog;", "<init>", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProgressDialogUtil {
    private final String TAG;
    private Activity activity;
    private Dialog loadingDialog;

    public ProgressDialogUtil(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
        this.activity = activity;
        this.TAG = LogHelper.INSTANCE.makeLogTag(ProgressDialogUtil.class);
        Dialog dialog = UiUtils.Companion.getDialog(R.layout.popup_loading_dots, this.activity);
        LoadingDots loadingDots = (LoadingDots) dialog.findViewById(R.id.loadingDots);
        if (loadingDots != null) {
            loadingDots.setDotsColor(g0.a.b(this.activity, R.color.sea));
        }
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        this.loadingDialog = dialog;
    }

    public final void dismiss() {
        if (this.loadingDialog.isShowing()) {
            this.loadingDialog.dismiss();
        }
    }

    public final Activity getActivity$app_productionRelease() {
        return this.activity;
    }

    public final void setActivity$app_productionRelease(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "<set-?>");
        this.activity = activity;
    }

    public final void show() {
        if (!this.loadingDialog.isShowing()) {
            try {
                this.loadingDialog.show();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.TAG, "Exception in progress dialog show", e10);
            }
        }
    }
}
