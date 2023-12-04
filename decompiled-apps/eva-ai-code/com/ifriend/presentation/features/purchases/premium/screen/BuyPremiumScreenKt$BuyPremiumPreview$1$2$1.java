package com.ifriend.presentation.features.purchases.premium.screen;

import androidx.compose.runtime.MutableState;
import com.facebook.internal.NativeProtocol;
import com.ifriend.presentation.features.purchases.premium.model.BuyPremiumPlanUiParams;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyPremiumScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/features/purchases/premium/model/BuyPremiumPlanUiParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumScreenKt$BuyPremiumPreview$1$2$1 extends Lambda implements Function1<BuyPremiumPlanUiParams, Unit> {
    final /* synthetic */ MutableState<PersistentList<BuyPremiumPlanUiParams>> $items$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumScreenKt$BuyPremiumPreview$1$2$1(MutableState<PersistentList<BuyPremiumPlanUiParams>> mutableState) {
        super(1);
        this.$items$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BuyPremiumPlanUiParams buyPremiumPlanUiParams) {
        invoke2(buyPremiumPlanUiParams);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BuyPremiumPlanUiParams params) {
        PersistentList BuyPremiumPreview$lambda$16$lambda$9;
        BuyPremiumPlanUiParams copy;
        Intrinsics.checkNotNullParameter(params, "params");
        MutableState<PersistentList<BuyPremiumPlanUiParams>> mutableState = this.$items$delegate;
        BuyPremiumPreview$lambda$16$lambda$9 = BuyPremiumScreenKt.BuyPremiumPreview$lambda$16$lambda$9(mutableState);
        PersistentList<BuyPremiumPlanUiParams> persistentList = BuyPremiumPreview$lambda$16$lambda$9;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(persistentList, 10));
        for (BuyPremiumPlanUiParams buyPremiumPlanUiParams : persistentList) {
            copy = buyPremiumPlanUiParams.copy((r18 & 1) != 0 ? buyPremiumPlanUiParams.id : null, (r18 & 2) != 0 ? buyPremiumPlanUiParams.sku : null, (r18 & 4) != 0 ? buyPremiumPlanUiParams.durationTitle : null, (r18 & 8) != 0 ? buyPremiumPlanUiParams.durationSubtitle : null, (r18 & 16) != 0 ? buyPremiumPlanUiParams.monthPriceLabel : null, (r18 & 32) != 0 ? buyPremiumPlanUiParams.priceLabel : null, (r18 & 64) != 0 ? buyPremiumPlanUiParams.saveLabel : null, (r18 & 128) != 0 ? buyPremiumPlanUiParams.isSelected : Intrinsics.areEqual(buyPremiumPlanUiParams.getSku(), params.getSku()));
            arrayList.add(copy);
        }
        mutableState.setValue(ExtensionsKt.toPersistentList(arrayList));
    }
}
