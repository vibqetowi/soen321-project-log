package com.ifriend.ui.base.modalMessage;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ifriend.popup.api.PopupFragmentFactory;
import com.ifriend.ui.utils.UIUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RequestSextingPopupDelegate.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RequestSextingPopupDelegate$showSextingRequest$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ RequestSextingPopupDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestSextingPopupDelegate$showSextingRequest$1(RequestSextingPopupDelegate requestSextingPopupDelegate) {
        super(0);
        this.this$0 = requestSextingPopupDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PopupFragmentFactory popupFragmentFactory;
        LifecycleOwner lifecycleOwner;
        FragmentManager fragmentManager;
        UIUtils uIUtils = UIUtils.INSTANCE;
        popupFragmentFactory = this.this$0.popupFragmentFactory;
        DialogFragment requestSextingPopupFragment = popupFragmentFactory.getRequestSextingPopupFragment();
        lifecycleOwner = this.this$0.lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner);
        fragmentManager = this.this$0.fragmentManager;
        uIUtils.showWithBlur(requestSextingPopupFragment, lifecycleScope, fragmentManager, "sextingRequestKey");
    }
}
