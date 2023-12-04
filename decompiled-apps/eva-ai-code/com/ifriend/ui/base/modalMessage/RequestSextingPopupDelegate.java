package com.ifriend.ui.base.modalMessage;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import com.ifriend.popup.api.PopupFragmentFactory;
import com.ifriend.popup.api.SextingRequestResultModel;
import com.ifriend.ui.base.BaseActivity;
import com.ifriend.ui.utils.UIHelper;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: RequestSextingPopupDelegate.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J&\u0010\u0013\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0006\u0010\u0014\u001a\u00020\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ifriend/ui/base/modalMessage/RequestSextingPopupDelegate;", "", "activity", "Lcom/ifriend/ui/base/BaseActivity;", "popupFragmentFactory", "Lcom/ifriend/popup/api/PopupFragmentFactory;", "(Lcom/ifriend/ui/base/BaseActivity;Lcom/ifriend/popup/api/PopupFragmentFactory;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onCancel", "Lkotlin/Function0;", "", "onSextingActivate", "setOnResultListeners", "showSextingRequest", "Companion", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RequestSextingPopupDelegate {
    private static final String requestKey = "sextingRequestKey";
    private final Context context;
    private final FragmentManager fragmentManager;
    private final LifecycleOwner lifecycleOwner;
    private Function0<Unit> onCancel;
    private Function0<Unit> onSextingActivate;
    private PopupFragmentFactory popupFragmentFactory;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Inject
    public RequestSextingPopupDelegate(BaseActivity activity, PopupFragmentFactory popupFragmentFactory) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(popupFragmentFactory, "popupFragmentFactory");
        this.popupFragmentFactory = popupFragmentFactory;
        BaseActivity baseActivity = activity;
        this.lifecycleOwner = baseActivity;
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        this.fragmentManager = supportFragmentManager;
        this.context = activity;
        this.onSextingActivate = RequestSextingPopupDelegate$onSextingActivate$1.INSTANCE;
        this.onCancel = RequestSextingPopupDelegate$onCancel$1.INSTANCE;
        supportFragmentManager.setFragmentResultListener(requestKey, baseActivity, new FragmentResultListener() { // from class: com.ifriend.ui.base.modalMessage.RequestSextingPopupDelegate$$ExternalSyntheticLambda0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                RequestSextingPopupDelegate._init_$lambda$0(RequestSextingPopupDelegate.this, str, bundle);
            }
        });
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(RequestSextingPopupDelegate this$0, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Serializable serializable = bundle.getSerializable("UpgradePopupResultKey");
        if (serializable == SextingRequestResultModel.REQUEST_SEXTING) {
            this$0.onSextingActivate.invoke();
        } else if (serializable == SextingRequestResultModel.CANCEL) {
            this$0.onCancel.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setOnResultListeners$default(RequestSextingPopupDelegate requestSextingPopupDelegate, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = RequestSextingPopupDelegate$setOnResultListeners$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            function02 = RequestSextingPopupDelegate$setOnResultListeners$2.INSTANCE;
        }
        requestSextingPopupDelegate.setOnResultListeners(function0, function02);
    }

    public final void setOnResultListeners(Function0<Unit> onSextingActivate, Function0<Unit> onCancel) {
        Intrinsics.checkNotNullParameter(onSextingActivate, "onSextingActivate");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        this.onSextingActivate = onSextingActivate;
        this.onCancel = onCancel;
    }

    public final void showSextingRequest() {
        UIHelper.INSTANCE.hideKeyboardIfOpened(this.context, new RequestSextingPopupDelegate$showSextingRequest$1(this));
    }

    /* compiled from: RequestSextingPopupDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/ui/base/modalMessage/RequestSextingPopupDelegate$Companion;", "", "()V", "requestKey", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
