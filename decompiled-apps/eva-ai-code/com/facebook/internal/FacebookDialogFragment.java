package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.FacebookWebFallbackDialog;
import com.facebook.internal.WebDialog;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
/* compiled from: FacebookDialogFragment.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000bJ\u001c\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/facebook/internal/FacebookDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "innerDialog", "Landroid/app/Dialog;", "getInnerDialog", "()Landroid/app/Dialog;", "setInnerDialog", "(Landroid/app/Dialog;)V", "initDialog", "", "initDialog$facebook_common_release", "onCompleteWebDialog", "values", "Landroid/os/Bundle;", "error", "Lcom/facebook/FacebookException;", "onCompleteWebFallbackDialog", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "onCreateDialog", "onDestroyView", "onResume", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FacebookDialogFragment extends DialogFragment {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "FacebookDialogFragment";
    private Dialog innerDialog;

    public final Dialog getInnerDialog() {
        return this.innerDialog;
    }

    public final void setInnerDialog(Dialog dialog) {
        this.innerDialog = dialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initDialog$facebook_common_release();
    }

    public final void initDialog$facebook_common_release() {
        FragmentActivity activity;
        FacebookWebFallbackDialog newInstance;
        if (this.innerDialog == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            Bundle methodArgumentsFromIntent = NativeProtocol.getMethodArgumentsFromIntent(intent);
            if (!(methodArgumentsFromIntent == null ? false : methodArgumentsFromIntent.getBoolean(NativeProtocol.WEB_DIALOG_IS_FALLBACK, false))) {
                String string = methodArgumentsFromIntent == null ? null : methodArgumentsFromIntent.getString(NativeProtocol.WEB_DIALOG_ACTION);
                Bundle bundle = methodArgumentsFromIntent != null ? methodArgumentsFromIntent.getBundle(NativeProtocol.WEB_DIALOG_PARAMS) : null;
                Utility utility = Utility.INSTANCE;
                if (Utility.isNullOrEmpty(string)) {
                    Utility utility2 = Utility.INSTANCE;
                    Utility.logd(TAG, "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                }
                FragmentActivity fragmentActivity = activity;
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                newInstance = new WebDialog.Builder(fragmentActivity, string, bundle).setOnCompleteListener(new WebDialog.OnCompleteListener() { // from class: com.facebook.internal.FacebookDialogFragment$$ExternalSyntheticLambda0
                    @Override // com.facebook.internal.WebDialog.OnCompleteListener
                    public final void onComplete(Bundle bundle2, FacebookException facebookException) {
                        FacebookDialogFragment.m6378initDialog$lambda0(FacebookDialogFragment.this, bundle2, facebookException);
                    }
                }).build();
            } else {
                String string2 = methodArgumentsFromIntent != null ? methodArgumentsFromIntent.getString("url") : null;
                Utility utility3 = Utility.INSTANCE;
                if (Utility.isNullOrEmpty(string2)) {
                    Utility utility4 = Utility.INSTANCE;
                    Utility.logd(TAG, "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                String format = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                FacebookWebFallbackDialog.Companion companion = FacebookWebFallbackDialog.Companion;
                FragmentActivity fragmentActivity2 = activity;
                if (string2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                newInstance = companion.newInstance(fragmentActivity2, string2, format);
                newInstance.setOnCompleteListener(new WebDialog.OnCompleteListener() { // from class: com.facebook.internal.FacebookDialogFragment$$ExternalSyntheticLambda1
                    @Override // com.facebook.internal.WebDialog.OnCompleteListener
                    public final void onComplete(Bundle bundle2, FacebookException facebookException) {
                        FacebookDialogFragment.m6379initDialog$lambda1(FacebookDialogFragment.this, bundle2, facebookException);
                    }
                });
            }
            this.innerDialog = newInstance;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initDialog$lambda-0  reason: not valid java name */
    public static final void m6378initDialog$lambda0(FacebookDialogFragment this$0, Bundle bundle, FacebookException facebookException) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onCompleteWebDialog(bundle, facebookException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initDialog$lambda-1  reason: not valid java name */
    public static final void m6379initDialog$lambda1(FacebookDialogFragment this$0, Bundle bundle, FacebookException facebookException) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onCompleteWebFallbackDialog(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.innerDialog;
        if (dialog != null) {
            if (dialog != null) {
                return dialog;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
        }
        onCompleteWebDialog(null, null);
        setShowsDialog(false);
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = this.innerDialog;
        if (dialog instanceof WebDialog) {
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((WebDialog) dialog).resize();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.innerDialog instanceof WebDialog) && isResumed()) {
            Dialog dialog = this.innerDialog;
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((WebDialog) dialog).resize();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    private final void onCompleteWebDialog(Bundle bundle, FacebookException facebookException) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
        Intent intent = activity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "fragmentActivity.intent");
        activity.setResult(facebookException == null ? -1 : 0, NativeProtocol.createProtocolResultIntent(intent, bundle, facebookException));
        activity.finish();
    }

    private final void onCompleteWebFallbackDialog(Bundle bundle) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }

    /* compiled from: FacebookDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/facebook/internal/FacebookDialogFragment$Companion;", "", "()V", "TAG", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
