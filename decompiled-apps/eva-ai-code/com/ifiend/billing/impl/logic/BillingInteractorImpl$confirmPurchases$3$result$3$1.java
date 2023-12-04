package com.ifiend.billing.impl.logic;

import com.android.billingclient.api.Purchase;
import com.ifiend.billing.impl.manager.BillingManagerImpl;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BillingInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BillingInteractorImpl$confirmPurchases$3$result$3$1 extends Lambda implements Function1<Map<String, String>, Unit> {
    final /* synthetic */ Purchase $purchase;
    final /* synthetic */ List<Purchase> $purchases;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BillingInteractorImpl$confirmPurchases$3$result$3$1(List<? extends Purchase> list, Purchase purchase) {
        super(1);
        this.$purchases = list;
        this.$purchase = purchase;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, String> map) {
        invoke2(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BillingInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "purchase", "Lcom/android/billingclient/api/Purchase;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifiend.billing.impl.logic.BillingInteractorImpl$confirmPurchases$3$result$3$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Purchase, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Purchase purchase) {
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            String originalJson = purchase.getOriginalJson();
            Intrinsics.checkNotNullExpressionValue(originalJson, "getOriginalJson(...)");
            return originalJson;
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, String> logEvent) {
        Intrinsics.checkNotNullParameter(logEvent, "$this$logEvent");
        logEvent.put(BillingManagerImpl.PURCHASES_KEY, CollectionsKt.joinToString$default(this.$purchases, null, null, null, 0, null, AnonymousClass1.INSTANCE, 31, null));
        String originalJson = this.$purchase.getOriginalJson();
        Intrinsics.checkNotNullExpressionValue(originalJson, "getOriginalJson(...)");
        logEvent.put("purchase", originalJson);
    }
}
