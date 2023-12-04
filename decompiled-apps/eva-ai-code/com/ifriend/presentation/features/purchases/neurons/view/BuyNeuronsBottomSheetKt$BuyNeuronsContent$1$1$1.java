package com.ifriend.presentation.features.purchases.neurons.view;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.ifriend.presentation.features.purchases.neurons.model.BuyNeuronsProductUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyNeuronsBottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsBottomSheetKt$BuyNeuronsContent$1$1$1 extends Lambda implements Function1<LazyGridScope, Unit> {
    final /* synthetic */ BuyNeuronsClicks $clicks;
    final /* synthetic */ ImmutableList<BuyNeuronsProductUiParams> $list;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsBottomSheetKt$BuyNeuronsContent$1$1$1(ImmutableList<BuyNeuronsProductUiParams> immutableList, BuyNeuronsClicks buyNeuronsClicks) {
        super(1);
        this.$list = immutableList;
        this.$clicks = buyNeuronsClicks;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyNeuronsBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ifriend/presentation/features/purchases/neurons/model/BuyNeuronsProductUiParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.neurons.view.BuyNeuronsBottomSheetKt$BuyNeuronsContent$1$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<BuyNeuronsProductUiParams, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(BuyNeuronsProductUiParams it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getProductId();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyGridScope lazyGridScope) {
        invoke2(lazyGridScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        ImmutableList<BuyNeuronsProductUiParams> immutableList = this.$list;
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        BuyNeuronsClicks buyNeuronsClicks = this.$clicks;
        LazyVerticalGrid.items(immutableList.size(), anonymousClass1 != null ? new BuyNeuronsBottomSheetKt$BuyNeuronsContent$1$1$1$invoke$$inlined$items$default$2(anonymousClass1, immutableList) : null, null, new BuyNeuronsBottomSheetKt$BuyNeuronsContent$1$1$1$invoke$$inlined$items$default$4(BuyNeuronsBottomSheetKt$BuyNeuronsContent$1$1$1$invoke$$inlined$items$default$1.INSTANCE, immutableList), ComposableLambdaKt.composableLambdaInstance(699646206, true, new BuyNeuronsBottomSheetKt$BuyNeuronsContent$1$1$1$invoke$$inlined$items$default$5(immutableList, buyNeuronsClicks)));
    }
}
