package com.ifriend.ui.base.modalMessage;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ifriend.popup.api.PopupFragmentFactory;
import com.ifriend.popup.api.PopupModelFactory;
import com.ifriend.popup.api.UpgradePopupResultModel;
import com.ifriend.ui.base.BaseActivity;
import com.ifriend.ui.utils.UIUtils;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: UpgradeAppPopupDelegate.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ6\u0010\u0014\u001a\u00020\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0016\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ifriend/ui/base/modalMessage/UpgradeAppPopupDelegate;", "", "activity", "Lcom/ifriend/ui/base/BaseActivity;", "popupFragmentFactory", "Lcom/ifriend/popup/api/PopupFragmentFactory;", "popupModelFactory", "Lcom/ifriend/popup/api/PopupModelFactory;", "(Lcom/ifriend/ui/base/BaseActivity;Lcom/ifriend/popup/api/PopupFragmentFactory;Lcom/ifriend/popup/api/PopupModelFactory;)V", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onCancel", "Lkotlin/Function0;", "", "onSecondButtonClick", "onUpgradeClick", "setOnResultListeners", "showUpgradeApp", "title", "", "secondaryButtonText", "Companion", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpgradeAppPopupDelegate {
    private static final String upgradeAppRequestKey = "upgradeAppRequestKey";
    private final Context context;
    private final FragmentManager fragmentManager;
    private final LifecycleOwner lifecycleOwner;
    private Function0<Unit> onCancel;
    private Function0<Unit> onSecondButtonClick;
    private Function0<Unit> onUpgradeClick;
    private PopupFragmentFactory popupFragmentFactory;
    private PopupModelFactory popupModelFactory;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: UpgradeAppPopupDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpgradePopupResultModel.values().length];
            try {
                iArr[UpgradePopupResultModel.UPGRADE_CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpgradePopupResultModel.SECOND_BUTTON_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UpgradePopupResultModel.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public UpgradeAppPopupDelegate(BaseActivity activity, PopupFragmentFactory popupFragmentFactory, PopupModelFactory popupModelFactory) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(popupFragmentFactory, "popupFragmentFactory");
        Intrinsics.checkNotNullParameter(popupModelFactory, "popupModelFactory");
        this.popupFragmentFactory = popupFragmentFactory;
        this.popupModelFactory = popupModelFactory;
        BaseActivity baseActivity = activity;
        this.lifecycleOwner = baseActivity;
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        this.fragmentManager = supportFragmentManager;
        this.context = activity;
        this.onUpgradeClick = UpgradeAppPopupDelegate$onUpgradeClick$1.INSTANCE;
        this.onSecondButtonClick = UpgradeAppPopupDelegate$onSecondButtonClick$1.INSTANCE;
        this.onCancel = UpgradeAppPopupDelegate$onCancel$1.INSTANCE;
        supportFragmentManager.setFragmentResultListener(upgradeAppRequestKey, baseActivity, new FragmentResultListener() { // from class: com.ifriend.ui.base.modalMessage.UpgradeAppPopupDelegate$$ExternalSyntheticLambda0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                UpgradeAppPopupDelegate._init_$lambda$0(UpgradeAppPopupDelegate.this, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(UpgradeAppPopupDelegate this$0, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Serializable serializable = bundle.getSerializable("UpgradePopupResultKey");
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.ifriend.popup.api.UpgradePopupResultModel");
        int i = WhenMappings.$EnumSwitchMapping$0[((UpgradePopupResultModel) serializable).ordinal()];
        if (i == 1) {
            this$0.onUpgradeClick.invoke();
        } else if (i == 2) {
            this$0.onSecondButtonClick.invoke();
        } else if (i != 3) {
        } else {
            this$0.onCancel.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setOnResultListeners$default(UpgradeAppPopupDelegate upgradeAppPopupDelegate, Function0 function0, Function0 function02, Function0 function03, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = UpgradeAppPopupDelegate$setOnResultListeners$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            function02 = UpgradeAppPopupDelegate$setOnResultListeners$2.INSTANCE;
        }
        if ((i & 4) != 0) {
            function03 = UpgradeAppPopupDelegate$setOnResultListeners$3.INSTANCE;
        }
        upgradeAppPopupDelegate.setOnResultListeners(function0, function02, function03);
    }

    public final void setOnResultListeners(Function0<Unit> onUpgradeClick, Function0<Unit> onSecondButtonClick, Function0<Unit> onCancel) {
        Intrinsics.checkNotNullParameter(onUpgradeClick, "onUpgradeClick");
        Intrinsics.checkNotNullParameter(onSecondButtonClick, "onSecondButtonClick");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        this.onUpgradeClick = onUpgradeClick;
        this.onSecondButtonClick = onSecondButtonClick;
        this.onCancel = onCancel;
    }

    public final void showUpgradeApp(CharSequence title, CharSequence secondaryButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        UIUtils.INSTANCE.showWithBlur(this.popupFragmentFactory.getUpgradePopupFragment(this.popupModelFactory.getUpgradePopupModel(title, secondaryButtonText)), LifecycleOwnerKt.getLifecycleScope(this.lifecycleOwner), this.fragmentManager, upgradeAppRequestKey);
    }

    /* compiled from: UpgradeAppPopupDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/ui/base/modalMessage/UpgradeAppPopupDelegate$Companion;", "", "()V", UpgradeAppPopupDelegate.upgradeAppRequestKey, "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
