package com.ifriend.data.repository.purchases;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.purchases.BillingPurchasesHistory;
import com.ifriend.domain.logic.purchase.PurchaseType;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: BillingPurchasesHistoryImpl.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u000bJ@\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\f\u0010\u0019\u001a\u00020\u001a*\u00020\u0015H\u0002R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/ifriend/data/repository/purchases/BillingPurchasesHistoryImpl;", "Lcom/ifriend/domain/data/purchases/BillingPurchasesHistory;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "coreExecuteCatching", "(Lcom/ifriend/domain/data/Preferences;Lcom/ifriend/data/common/CoreExecuteCatching;)V", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPurchasesHistoryCount", "", "type", "Lcom/ifriend/domain/logic/purchase/PurchaseType;", "(Lcom/ifriend/domain/logic/purchase/PurchaseType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePurchase", "", "toKey", "", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingPurchasesHistoryImpl implements BillingPurchasesHistory, CoreExecuteCatching {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final String IN_APP = "user_purchases_in_app";
    @Deprecated
    public static final String SUBSCRIPTIONS = "user_purchases_subscriptions";
    private final CoreExecuteCatching coreExecuteCatching;
    private final Preferences preferences;

    /* compiled from: BillingPurchasesHistoryImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            try {
                iArr[PurchaseType.IN_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseType.SUBSCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(function2, continuation);
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(kFunction, continuation);
    }

    @Inject
    public BillingPurchasesHistoryImpl(Preferences preferences, CoreExecuteCatching coreExecuteCatching) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        this.preferences = preferences;
        this.coreExecuteCatching = coreExecuteCatching;
    }

    /* compiled from: BillingPurchasesHistoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ifriend/data/repository/purchases/BillingPurchasesHistoryImpl$Companion;", "", "()V", "IN_APP", "", "SUBSCRIPTIONS", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.ifriend.domain.data.purchases.BillingPurchasesHistory
    public Object getPurchasesHistoryCount(PurchaseType purchaseType, Continuation<? super Integer> continuation) {
        ArrayList arrayList = new ArrayList();
        for (String str : this.preferences.getStringSetWithKey(toKey(purchaseType))) {
            Long longOrNull = StringsKt.toLongOrNull(str);
            if (longOrNull != null) {
                arrayList.add(longOrNull);
            }
        }
        return Boxing.boxInt(arrayList.size());
    }

    @Override // com.ifriend.domain.data.purchases.BillingPurchasesHistory
    public Object savePurchase(PurchaseType purchaseType, Continuation<? super Unit> continuation) {
        this.preferences.addValueToStringSetWithKey(toKey(purchaseType), String.valueOf(System.currentTimeMillis()));
        return Unit.INSTANCE;
    }

    private final String toKey(PurchaseType purchaseType) {
        int i = WhenMappings.$EnumSwitchMapping$0[purchaseType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return SUBSCRIPTIONS;
            }
            throw new NoWhenBranchMatchedException();
        }
        return IN_APP;
    }
}
