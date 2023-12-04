package com.ifriend.ui.base.modalMessage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ifriend.popup.api.GeneratingAvatarPopupResultModel;
import com.ifriend.popup.api.PopupFragmentFactory;
import com.ifriend.popup.api.PopupModelFactory;
import com.ifriend.popup.api.PopupResultModelKt;
import com.ifriend.ui.base.BaseActivity;
import com.ifriend.ui.utils.UIUtils;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GeneratingAnimatedAvatarPopupDelegate.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ&\u0010\u0015\u001a\u00020\u00132\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0006\u0010\u0016\u001a\u00020\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ifriend/ui/base/modalMessage/GeneratingAnimatedAvatarPopupDelegate;", "", "activity", "Lcom/ifriend/ui/base/BaseActivity;", "popupFragmentFactory", "Lcom/ifriend/popup/api/PopupFragmentFactory;", "popupModelFactory", "Lcom/ifriend/popup/api/PopupModelFactory;", "(Lcom/ifriend/ui/base/BaseActivity;Lcom/ifriend/popup/api/PopupFragmentFactory;Lcom/ifriend/popup/api/PopupModelFactory;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onActionClick", "Lkotlin/Function0;", "", "onCancel", "setOnResultListeners", "show", "Companion", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GeneratingAnimatedAvatarPopupDelegate {
    private static final String generatingAnimatedAvatarRequestKey = "generatingAnimatedAvatarRequestKey";
    private final Context context;
    private final FragmentManager fragmentManager;
    private final LifecycleOwner lifecycleOwner;
    private Function0<Unit> onActionClick;
    private Function0<Unit> onCancel;
    private PopupFragmentFactory popupFragmentFactory;
    private PopupModelFactory popupModelFactory;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GeneratingAnimatedAvatarPopupDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GeneratingAvatarPopupResultModel.values().length];
            try {
                iArr[GeneratingAvatarPopupResultModel.ACTION_CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GeneratingAvatarPopupResultModel.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public GeneratingAnimatedAvatarPopupDelegate(BaseActivity activity, PopupFragmentFactory popupFragmentFactory, PopupModelFactory popupModelFactory) {
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
        this.onCancel = GeneratingAnimatedAvatarPopupDelegate$onCancel$1.INSTANCE;
        this.onActionClick = GeneratingAnimatedAvatarPopupDelegate$onActionClick$1.INSTANCE;
        supportFragmentManager.setFragmentResultListener(generatingAnimatedAvatarRequestKey, baseActivity, new FragmentResultListener() { // from class: com.ifriend.ui.base.modalMessage.GeneratingAnimatedAvatarPopupDelegate$$ExternalSyntheticLambda0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                GeneratingAnimatedAvatarPopupDelegate._init_$lambda$0(GeneratingAnimatedAvatarPopupDelegate.this, str, bundle);
            }
        });
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(GeneratingAnimatedAvatarPopupDelegate this$0, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Serializable serializable = bundle.getSerializable(PopupResultModelKt.GeneratingAvatarPopupResultKey);
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.ifriend.popup.api.GeneratingAvatarPopupResultModel");
        int i = WhenMappings.$EnumSwitchMapping$0[((GeneratingAvatarPopupResultModel) serializable).ordinal()];
        if (i == 1) {
            this$0.onActionClick.invoke();
        } else if (i != 2) {
        } else {
            this$0.onCancel.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setOnResultListeners$default(GeneratingAnimatedAvatarPopupDelegate generatingAnimatedAvatarPopupDelegate, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = GeneratingAnimatedAvatarPopupDelegate$setOnResultListeners$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            function02 = GeneratingAnimatedAvatarPopupDelegate$setOnResultListeners$2.INSTANCE;
        }
        generatingAnimatedAvatarPopupDelegate.setOnResultListeners(function0, function02);
    }

    public final void setOnResultListeners(Function0<Unit> onActionClick, Function0<Unit> onCancel) {
        Intrinsics.checkNotNullParameter(onActionClick, "onActionClick");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        this.onActionClick = onActionClick;
        this.onCancel = onCancel;
    }

    public final void show() {
        PopupModelFactory popupModelFactory = this.popupModelFactory;
        Resources resources = this.context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        UIUtils.INSTANCE.showWithBlur(this.popupFragmentFactory.getGeneratingAvatarPopupFragment(popupModelFactory.getGeneratingAnimatedAvatarPopupModel(resources)), LifecycleOwnerKt.getLifecycleScope(this.lifecycleOwner), this.fragmentManager, generatingAnimatedAvatarRequestKey);
    }

    /* compiled from: GeneratingAnimatedAvatarPopupDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/ui/base/modalMessage/GeneratingAnimatedAvatarPopupDelegate$Companion;", "", "()V", GeneratingAnimatedAvatarPopupDelegate.generatingAnimatedAvatarRequestKey, "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
