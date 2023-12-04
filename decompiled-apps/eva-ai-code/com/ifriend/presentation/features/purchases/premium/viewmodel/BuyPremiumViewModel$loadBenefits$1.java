package com.ifriend.presentation.features.purchases.premium.viewmodel;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.presentation.features.purchases.common.model.SubscriptionBenefitsGroupUiParams;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyPremiumViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel$loadBenefits$1", f = "BuyPremiumViewModel.kt", i = {1, 2, 2, 3, 3}, l = {162, 165, TsExtractor.TS_STREAM_TYPE_AC4, 303}, m = "invokeSuspend", n = {"benefitGroups", "$this$forEachInfinite_u2ddWUq8MI$iv", "delay$iv", "$this$forEachInfinite_u2ddWUq8MI$iv", "delay$iv"}, s = {"L$0", "L$0", "J$0", "L$0", "J$0"})
/* loaded from: classes6.dex */
public final class BuyPremiumViewModel$loadBenefits$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ BuyPremiumViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumViewModel$loadBenefits$1(BuyPremiumViewModel buyPremiumViewModel, Continuation<? super BuyPremiumViewModel$loadBenefits$1> continuation) {
        super(2, continuation);
        this.this$0 = buyPremiumViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyPremiumViewModel$loadBenefits$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuyPremiumViewModel$loadBenefits$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f5  */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00eb -> B:30:0x00ef). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x012b -> B:30:0x00ef). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel$loadBenefits$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyPremiumViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$UiState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel$loadBenefits$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<BuyPremiumViewModel.UiState, BuyPremiumViewModel.UiState> {
        final /* synthetic */ ImmutableList<SubscriptionBenefitsGroupUiParams> $benefitGroups;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ImmutableList<SubscriptionBenefitsGroupUiParams> immutableList) {
            super(1);
            this.$benefitGroups = immutableList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final BuyPremiumViewModel.UiState invoke(BuyPremiumViewModel.UiState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return BuyPremiumViewModel.UiState.copy$default(it, null, null, this.$benefitGroups, null, false, false, null, 123, null);
        }
    }
}
