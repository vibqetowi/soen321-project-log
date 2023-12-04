package com.ifriend.presentation.features.purchases.neurons.view;

import com.ifriend.presentation.features.purchases.neurons.model.BuyNeuronsProductUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BuyNeuronsBottomSheet.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b\u0012\u0010\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b\u0012\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b\u0012\u0010\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b¢\u0006\u0002\u0010\fJ\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0013\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\bHÆ\u0003J\u0013\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\bHÆ\u0003J\u0013\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\bHÆ\u0003J\u0013\u0010\u0018\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\bHÆ\u0003Jo\u0010\u0019\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b2\u0012\b\u0002\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b2\u0012\b\u0002\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b2\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001b\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001b\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006!"}, d2 = {"Lcom/ifriend/presentation/features/purchases/neurons/view/BuyNeuronsClicks;", "", "onItemClick", "Lkotlin/Function1;", "Lcom/ifriend/presentation/features/purchases/neurons/model/BuyNeuronsProductUiParams;", "", "onContinueClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "onPrivacyClick", "onRestorePurchaseClick", "onTermsClick", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnContinueClick", "()Lkotlin/jvm/functions/Function0;", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "getOnPrivacyClick", "getOnRestorePurchaseClick", "getOnTermsClick", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsClicks {
    public static final int $stable = 0;
    private final Function0<Unit> onContinueClick;
    private final Function1<BuyNeuronsProductUiParams, Unit> onItemClick;
    private final Function0<Unit> onPrivacyClick;
    private final Function0<Unit> onRestorePurchaseClick;
    private final Function0<Unit> onTermsClick;

    public static /* synthetic */ BuyNeuronsClicks copy$default(BuyNeuronsClicks buyNeuronsClicks, Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, Object obj) {
        Function1<BuyNeuronsProductUiParams, Unit> function12 = function1;
        if ((i & 1) != 0) {
            function12 = buyNeuronsClicks.onItemClick;
        }
        Function0<Unit> function05 = function0;
        if ((i & 2) != 0) {
            function05 = buyNeuronsClicks.onContinueClick;
        }
        Function0 function06 = function05;
        Function0<Unit> function07 = function02;
        if ((i & 4) != 0) {
            function07 = buyNeuronsClicks.onPrivacyClick;
        }
        Function0 function08 = function07;
        Function0<Unit> function09 = function03;
        if ((i & 8) != 0) {
            function09 = buyNeuronsClicks.onRestorePurchaseClick;
        }
        Function0 function010 = function09;
        Function0<Unit> function011 = function04;
        if ((i & 16) != 0) {
            function011 = buyNeuronsClicks.onTermsClick;
        }
        return buyNeuronsClicks.copy(function12, function06, function08, function010, function011);
    }

    public final Function1<BuyNeuronsProductUiParams, Unit> component1() {
        return this.onItemClick;
    }

    public final Function0<Unit> component2() {
        return this.onContinueClick;
    }

    public final Function0<Unit> component3() {
        return this.onPrivacyClick;
    }

    public final Function0<Unit> component4() {
        return this.onRestorePurchaseClick;
    }

    public final Function0<Unit> component5() {
        return this.onTermsClick;
    }

    public final BuyNeuronsClicks copy(Function1<? super BuyNeuronsProductUiParams, Unit> onItemClick, Function0<Unit> onContinueClick, Function0<Unit> onPrivacyClick, Function0<Unit> onRestorePurchaseClick, Function0<Unit> onTermsClick) {
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
        Intrinsics.checkNotNullParameter(onPrivacyClick, "onPrivacyClick");
        Intrinsics.checkNotNullParameter(onRestorePurchaseClick, "onRestorePurchaseClick");
        Intrinsics.checkNotNullParameter(onTermsClick, "onTermsClick");
        return new BuyNeuronsClicks(onItemClick, onContinueClick, onPrivacyClick, onRestorePurchaseClick, onTermsClick);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuyNeuronsClicks) {
            BuyNeuronsClicks buyNeuronsClicks = (BuyNeuronsClicks) obj;
            return Intrinsics.areEqual(this.onItemClick, buyNeuronsClicks.onItemClick) && Intrinsics.areEqual(this.onContinueClick, buyNeuronsClicks.onContinueClick) && Intrinsics.areEqual(this.onPrivacyClick, buyNeuronsClicks.onPrivacyClick) && Intrinsics.areEqual(this.onRestorePurchaseClick, buyNeuronsClicks.onRestorePurchaseClick) && Intrinsics.areEqual(this.onTermsClick, buyNeuronsClicks.onTermsClick);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.onItemClick.hashCode() * 31) + this.onContinueClick.hashCode()) * 31) + this.onPrivacyClick.hashCode()) * 31) + this.onRestorePurchaseClick.hashCode()) * 31) + this.onTermsClick.hashCode();
    }

    public String toString() {
        Function1<BuyNeuronsProductUiParams, Unit> function1 = this.onItemClick;
        Function0<Unit> function0 = this.onContinueClick;
        Function0<Unit> function02 = this.onPrivacyClick;
        Function0<Unit> function03 = this.onRestorePurchaseClick;
        Function0<Unit> function04 = this.onTermsClick;
        return "BuyNeuronsClicks(onItemClick=" + function1 + ", onContinueClick=" + function0 + ", onPrivacyClick=" + function02 + ", onRestorePurchaseClick=" + function03 + ", onTermsClick=" + function04 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuyNeuronsClicks(Function1<? super BuyNeuronsProductUiParams, Unit> onItemClick, Function0<Unit> onContinueClick, Function0<Unit> onPrivacyClick, Function0<Unit> onRestorePurchaseClick, Function0<Unit> onTermsClick) {
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
        Intrinsics.checkNotNullParameter(onPrivacyClick, "onPrivacyClick");
        Intrinsics.checkNotNullParameter(onRestorePurchaseClick, "onRestorePurchaseClick");
        Intrinsics.checkNotNullParameter(onTermsClick, "onTermsClick");
        this.onItemClick = onItemClick;
        this.onContinueClick = onContinueClick;
        this.onPrivacyClick = onPrivacyClick;
        this.onRestorePurchaseClick = onRestorePurchaseClick;
        this.onTermsClick = onTermsClick;
    }

    public final Function1<BuyNeuronsProductUiParams, Unit> getOnItemClick() {
        return this.onItemClick;
    }

    public final Function0<Unit> getOnContinueClick() {
        return this.onContinueClick;
    }

    public final Function0<Unit> getOnPrivacyClick() {
        return this.onPrivacyClick;
    }

    public final Function0<Unit> getOnRestorePurchaseClick() {
        return this.onRestorePurchaseClick;
    }

    public final Function0<Unit> getOnTermsClick() {
        return this.onTermsClick;
    }
}
