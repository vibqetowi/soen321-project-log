package com.ifiend.billing.impl.logic;

import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.google.android.exoplayer2.C;
import com.ifiend.billing.impl.events.BillingClientEvents;
import com.ifiend.billing.impl.logic.repository.BillingRepository;
import com.ifiend.billing.impl.manager.BillingManager;
import com.ifiend.billing.impl.manager.BillingManagerImpl;
import com.ifriend.billing.api.exception.BillingManagerException;
import com.ifriend.billing.api.logic.BillingInteractor;
import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.billing.api.models.BillingProductFilter;
import com.ifriend.billing.api.models.BillingPurchaseProductType;
import com.ifriend.billing.api.models.BillingPurchasesResult;
import com.ifriend.logger.api.events.LoggerLevel;
import com.ifriend.logger.api.events.PurchaseEvent;
import com.ifriend.logger.api.logic.AppLoggerInteractor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: BillingInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 :2\u00020\u0001:\u0001:B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ)\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001b\u0010#\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010$J\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010&\u001a\u00020'H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010(J\u001f\u0010)\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010*J@\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020 2%\b\u0002\u0010.\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 00\u0012\u0004\u0012\u00020,0/¢\u0006\u0002\b1H\u0082@ø\u0001\u0000¢\u0006\u0002\u00102J\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u00104J\"\u00105\u001a\b\u0012\u0004\u0012\u00020,06H\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b7\u00104J(\u00108\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013*\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010\u001a\u001a\u00020 2\u0006\u00109\u001a\u00020 H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"Lcom/ifiend/billing/impl/logic/BillingInteractorImpl;", "Lcom/ifriend/billing/api/logic/BillingInteractor;", "billingManager", "Lcom/ifiend/billing/impl/manager/BillingManager;", "billingRepository", "Lcom/ifiend/billing/impl/logic/repository/BillingRepository;", "appLoggerInteractor", "Lcom/ifriend/logger/api/logic/AppLoggerInteractor;", "(Lcom/ifiend/billing/impl/manager/BillingManager;Lcom/ifiend/billing/impl/logic/repository/BillingRepository;Lcom/ifriend/logger/api/logic/AppLoggerInteractor;)V", "billingProductUpdatesFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/billing/api/models/BillingPurchasesResult;", "getBillingProductUpdatesFlow$annotations", "()V", "getBillingProductUpdatesFlow", "()Lkotlinx/coroutines/flow/Flow;", "confirmPurchases", "", BillingManagerImpl.PURCHASES_KEY, "", "Lcom/android/billingclient/api/Purchase;", "delayMillis", "", "(Ljava/util/List;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppProducts", "Lcom/ifriend/billing/api/models/BillingProduct;", "productType", "Lcom/ifriend/billing/api/models/BillingPurchaseProductType;", "(Lcom/ifriend/billing/api/models/BillingPurchaseProductType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBillingFlowParams", "Lcom/android/billingclient/api/BillingFlowParams;", "productId", "", "(Ljava/lang/String;Lcom/ifriend/billing/api/models/BillingPurchaseProductType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBillingProductType", "getProduct", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "filter", "Lcom/ifriend/billing/api/models/BillingProductFilter;", "(Lcom/ifriend/billing/api/models/BillingProductFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleSuccessfulPurchases", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logEvent", "", "eventName", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "restorePurchases", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startBillingConnection", "Lkotlin/Result;", "startBillingConnection-IoAF18A", "filterProducts", "productIdFilter", "Companion", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingInteractorImpl implements BillingInteractor {
    public static final Companion Companion = new Companion(null);
    private static final String NEURONS_PRODUCT_ID = "com.ai.android.coinpack";
    private static final String SUBSCRIPTION_PRODUCT_ID = ".membership.";
    private static final String TAG = "BillingInteractor";
    private final AppLoggerInteractor appLoggerInteractor;
    private final BillingManager billingManager;
    private final Flow<BillingPurchasesResult> billingProductUpdatesFlow;
    private final BillingRepository billingRepository;

    /* compiled from: BillingInteractorImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BillingPurchaseProductType.values().length];
            try {
                iArr[BillingPurchaseProductType.PURCHASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BillingPurchaseProductType.SUBSCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getBillingProductUpdatesFlow$annotations() {
    }

    @Inject
    public BillingInteractorImpl(BillingManager billingManager, BillingRepository billingRepository, AppLoggerInteractor appLoggerInteractor) {
        Intrinsics.checkNotNullParameter(billingManager, "billingManager");
        Intrinsics.checkNotNullParameter(billingRepository, "billingRepository");
        Intrinsics.checkNotNullParameter(appLoggerInteractor, "appLoggerInteractor");
        this.billingManager = billingManager;
        this.billingRepository = billingRepository;
        this.appLoggerInteractor = appLoggerInteractor;
        this.billingProductUpdatesFlow = FlowKt.mapLatest(billingManager.getBillingProductUpdatesFlow(), new BillingInteractorImpl$billingProductUpdatesFlow$1(this, null));
    }

    /* compiled from: BillingInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ifiend/billing/impl/logic/BillingInteractorImpl$Companion;", "", "()V", "NEURONS_PRODUCT_ID", "", "SUBSCRIPTION_PRODUCT_ID", "TAG", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.ifriend.billing.api.logic.BillingInteractor
    public Flow<BillingPurchasesResult> getBillingProductUpdatesFlow() {
        return this.billingProductUpdatesFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleSuccessfulPurchases(List<? extends Purchase> list, Continuation<? super BillingPurchasesResult> continuation) {
        BillingInteractorImpl$handleSuccessfulPurchases$1 billingInteractorImpl$handleSuccessfulPurchases$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        BillingInteractorImpl billingInteractorImpl;
        List list2;
        if (continuation instanceof BillingInteractorImpl$handleSuccessfulPurchases$1) {
            billingInteractorImpl$handleSuccessfulPurchases$1 = (BillingInteractorImpl$handleSuccessfulPurchases$1) continuation;
            if ((billingInteractorImpl$handleSuccessfulPurchases$1.label & Integer.MIN_VALUE) != 0) {
                billingInteractorImpl$handleSuccessfulPurchases$1.label -= Integer.MIN_VALUE;
                obj = billingInteractorImpl$handleSuccessfulPurchases$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingInteractorImpl$handleSuccessfulPurchases$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((Purchase) obj2).getPurchaseState() == 1) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = arrayList;
                    String eventName = BillingClientEvents.ConfirmPurchases.StartConfirmPurchases.INSTANCE.getEventName();
                    billingInteractorImpl$handleSuccessfulPurchases$1.L$0 = this;
                    billingInteractorImpl$handleSuccessfulPurchases$1.L$1 = arrayList2;
                    billingInteractorImpl$handleSuccessfulPurchases$1.label = 1;
                    if (logEvent$default(this, eventName, null, billingInteractorImpl$handleSuccessfulPurchases$1, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    billingInteractorImpl = this;
                    list2 = arrayList2;
                } else if (i != 1) {
                    if (i == 2) {
                        list2 = (List) billingInteractorImpl$handleSuccessfulPurchases$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (((Boolean) obj).booleanValue()) {
                            return new BillingPurchasesResult.Successful(list2);
                        }
                        return BillingPurchasesResult.Failure.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    list2 = (List) billingInteractorImpl$handleSuccessfulPurchases$1.L$1;
                    billingInteractorImpl = (BillingInteractorImpl) billingInteractorImpl$handleSuccessfulPurchases$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                billingInteractorImpl$handleSuccessfulPurchases$1.L$0 = list2;
                billingInteractorImpl$handleSuccessfulPurchases$1.L$1 = null;
                billingInteractorImpl$handleSuccessfulPurchases$1.label = 2;
                obj = confirmPurchases$default(billingInteractorImpl, list2, 0L, billingInteractorImpl$handleSuccessfulPurchases$1, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }
        billingInteractorImpl$handleSuccessfulPurchases$1 = new BillingInteractorImpl$handleSuccessfulPurchases$1(this, continuation);
        obj = billingInteractorImpl$handleSuccessfulPurchases$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingInteractorImpl$handleSuccessfulPurchases$1.label;
        if (i != 0) {
        }
        billingInteractorImpl$handleSuccessfulPurchases$1.L$0 = list2;
        billingInteractorImpl$handleSuccessfulPurchases$1.L$1 = null;
        billingInteractorImpl$handleSuccessfulPurchases$1.label = 2;
        obj = confirmPurchases$default(billingInteractorImpl, list2, 0L, billingInteractorImpl$handleSuccessfulPurchases$1, 2, null);
        if (obj == coroutine_suspended) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.ifriend.billing.api.logic.BillingInteractor
    /* renamed from: startBillingConnection-IoAF18A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo6782startBillingConnectionIoAF18A(Continuation<? super Result<Unit>> continuation) {
        BillingInteractorImpl$startBillingConnection$1 billingInteractorImpl$startBillingConnection$1;
        int i;
        Object mo6784startBillingConnectionIoAF18A;
        BillingInteractorImpl billingInteractorImpl;
        Object obj;
        if (continuation instanceof BillingInteractorImpl$startBillingConnection$1) {
            billingInteractorImpl$startBillingConnection$1 = (BillingInteractorImpl$startBillingConnection$1) continuation;
            if ((billingInteractorImpl$startBillingConnection$1.label & Integer.MIN_VALUE) != 0) {
                billingInteractorImpl$startBillingConnection$1.label -= Integer.MIN_VALUE;
                Object obj2 = billingInteractorImpl$startBillingConnection$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingInteractorImpl$startBillingConnection$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    BillingManager billingManager = this.billingManager;
                    billingInteractorImpl$startBillingConnection$1.L$0 = this;
                    billingInteractorImpl$startBillingConnection$1.label = 1;
                    mo6784startBillingConnectionIoAF18A = billingManager.mo6784startBillingConnectionIoAF18A(billingInteractorImpl$startBillingConnection$1);
                    if (mo6784startBillingConnectionIoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    billingInteractorImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        obj = billingInteractorImpl$startBillingConnection$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    billingInteractorImpl = (BillingInteractorImpl) billingInteractorImpl$startBillingConnection$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    mo6784startBillingConnectionIoAF18A = ((Result) obj2).m7280unboximpl();
                }
                if (Result.m7278isSuccessimpl(mo6784startBillingConnectionIoAF18A)) {
                    return mo6784startBillingConnectionIoAF18A;
                }
                BillingRepository billingRepository = billingInteractorImpl.billingRepository;
                billingInteractorImpl$startBillingConnection$1.L$0 = mo6784startBillingConnectionIoAF18A;
                billingInteractorImpl$startBillingConnection$1.label = 2;
                if (billingRepository.fetchProducts(billingInteractorImpl$startBillingConnection$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = mo6784startBillingConnectionIoAF18A;
                return obj;
            }
        }
        billingInteractorImpl$startBillingConnection$1 = new BillingInteractorImpl$startBillingConnection$1(this, continuation);
        Object obj22 = billingInteractorImpl$startBillingConnection$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingInteractorImpl$startBillingConnection$1.label;
        if (i != 0) {
        }
        if (Result.m7278isSuccessimpl(mo6784startBillingConnectionIoAF18A)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r2.getProductId(), (java.lang.CharSequence) com.ifiend.billing.impl.logic.BillingInteractorImpl.SUBSCRIPTION_PRODUCT_ID, false, 2, (java.lang.Object) null) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r2.getProductId(), (java.lang.CharSequence) com.ifiend.billing.impl.logic.BillingInteractorImpl.NEURONS_PRODUCT_ID, false, 2, (java.lang.Object) null) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
        r8 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0053 A[SYNTHETIC] */
    @Override // com.ifriend.billing.api.logic.BillingInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAppProducts(BillingPurchaseProductType billingPurchaseProductType, Continuation<? super List<BillingProduct>> continuation) {
        BillingInteractorImpl$getAppProducts$1 billingInteractorImpl$getAppProducts$1;
        int i;
        if (continuation instanceof BillingInteractorImpl$getAppProducts$1) {
            billingInteractorImpl$getAppProducts$1 = (BillingInteractorImpl$getAppProducts$1) continuation;
            if ((billingInteractorImpl$getAppProducts$1.label & Integer.MIN_VALUE) != 0) {
                billingInteractorImpl$getAppProducts$1.label -= Integer.MIN_VALUE;
                Object obj = billingInteractorImpl$getAppProducts$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingInteractorImpl$getAppProducts$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    BillingRepository billingRepository = this.billingRepository;
                    billingInteractorImpl$getAppProducts$1.L$0 = billingPurchaseProductType;
                    billingInteractorImpl$getAppProducts$1.label = 1;
                    obj = billingRepository.fetchProducts(billingInteractorImpl$getAppProducts$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    billingPurchaseProductType = (BillingPurchaseProductType) billingInteractorImpl$getAppProducts$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    BillingProduct billingProduct = (BillingProduct) obj2;
                    String productType = billingProduct.getProductDetails().getProductType();
                    Intrinsics.checkNotNullExpressionValue(productType, "getProductType(...)");
                    int i2 = WhenMappings.$EnumSwitchMapping$0[billingPurchaseProductType.ordinal()];
                    boolean z = false;
                    if (i2 == 1) {
                        if (Intrinsics.areEqual(productType, "inapp")) {
                        }
                        if (!z) {
                        }
                    } else if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        if (Intrinsics.areEqual(productType, "subs")) {
                        }
                        if (!z) {
                            arrayList.add(obj2);
                        }
                    }
                }
                return arrayList;
            }
        }
        billingInteractorImpl$getAppProducts$1 = new BillingInteractorImpl$getAppProducts$1(this, continuation);
        Object obj3 = billingInteractorImpl$getAppProducts$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingInteractorImpl$getAppProducts$1.label;
        if (i != 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r11.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    @Override // com.ifriend.billing.api.logic.BillingInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getProducts(BillingProductFilter billingProductFilter, Continuation<? super List<BillingProduct>> continuation) {
        BillingInteractorImpl$getProducts$1 billingInteractorImpl$getProducts$1;
        int i;
        BillingProductFilter billingProductFilter2;
        String str;
        BillingInteractorImpl billingInteractorImpl;
        if (continuation instanceof BillingInteractorImpl$getProducts$1) {
            billingInteractorImpl$getProducts$1 = (BillingInteractorImpl$getProducts$1) continuation;
            if ((billingInteractorImpl$getProducts$1.label & Integer.MIN_VALUE) != 0) {
                billingInteractorImpl$getProducts$1.label -= Integer.MIN_VALUE;
                Object obj = billingInteractorImpl$getProducts$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingInteractorImpl$getProducts$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String billingProductType = getBillingProductType(billingProductFilter.getProductType());
                    BillingRepository billingRepository = this.billingRepository;
                    billingInteractorImpl$getProducts$1.L$0 = this;
                    billingInteractorImpl$getProducts$1.L$1 = billingProductFilter;
                    billingInteractorImpl$getProducts$1.L$2 = billingProductType;
                    billingInteractorImpl$getProducts$1.label = 1;
                    Object fetchProducts = billingRepository.fetchProducts(billingInteractorImpl$getProducts$1);
                    if (fetchProducts == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    billingProductFilter2 = billingProductFilter;
                    str = billingProductType;
                    obj = fetchProducts;
                    billingInteractorImpl = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) billingInteractorImpl$getProducts$1.L$2;
                    billingProductFilter2 = (BillingProductFilter) billingInteractorImpl$getProducts$1.L$1;
                    billingInteractorImpl = (BillingInteractorImpl) billingInteractorImpl$getProducts$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return billingInteractorImpl.filterProducts((List) obj, str, billingProductFilter2.getProductIdFilter());
            }
        }
        billingInteractorImpl$getProducts$1 = new BillingInteractorImpl$getProducts$1(this, continuation);
        Object obj2 = billingInteractorImpl$getProducts$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingInteractorImpl$getProducts$1.label;
        if (i != 0) {
        }
        return billingInteractorImpl.filterProducts((List) obj2, str, billingProductFilter2.getProductIdFilter());
    }

    private final String getBillingProductType(BillingPurchaseProductType billingPurchaseProductType) {
        int i = WhenMappings.$EnumSwitchMapping$0[billingPurchaseProductType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "subs";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "inapp";
    }

    private final List<BillingProduct> filterProducts(List<BillingProduct> list, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            BillingProduct billingProduct = (BillingProduct) obj;
            boolean z = false;
            if (Intrinsics.areEqual(str, billingProduct.getProductDetails().getProductType()) && StringsKt.contains$default((CharSequence) billingProduct.getProductId(), (CharSequence) str2, false, 2, (Object) null)) {
                z = true;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.ifriend.billing.api.logic.BillingInteractor
    public Object getProduct(String str, Continuation<? super BillingProduct> continuation) {
        return this.billingRepository.getProduct(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    @Override // com.ifriend.billing.api.logic.BillingInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getBillingFlowParams(String str, BillingPurchaseProductType billingPurchaseProductType, Continuation<? super BillingFlowParams> continuation) {
        BillingInteractorImpl$getBillingFlowParams$1 billingInteractorImpl$getBillingFlowParams$1;
        int i;
        BillingInteractorImpl billingInteractorImpl;
        BillingProduct billingProduct;
        ProductDetails productDetails;
        if (continuation instanceof BillingInteractorImpl$getBillingFlowParams$1) {
            billingInteractorImpl$getBillingFlowParams$1 = (BillingInteractorImpl$getBillingFlowParams$1) continuation;
            if ((billingInteractorImpl$getBillingFlowParams$1.label & Integer.MIN_VALUE) != 0) {
                billingInteractorImpl$getBillingFlowParams$1.label -= Integer.MIN_VALUE;
                Object obj = billingInteractorImpl$getBillingFlowParams$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingInteractorImpl$getBillingFlowParams$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    BillingRepository billingRepository = this.billingRepository;
                    billingInteractorImpl$getBillingFlowParams$1.L$0 = this;
                    billingInteractorImpl$getBillingFlowParams$1.L$1 = billingPurchaseProductType;
                    billingInteractorImpl$getBillingFlowParams$1.label = 1;
                    obj = billingRepository.getProduct(str, billingInteractorImpl$getBillingFlowParams$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    billingInteractorImpl = this;
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    billingPurchaseProductType = (BillingPurchaseProductType) billingInteractorImpl$getBillingFlowParams$1.L$1;
                    billingInteractorImpl = (BillingInteractorImpl) billingInteractorImpl$getBillingFlowParams$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                billingProduct = (BillingProduct) obj;
                if (billingProduct != null || (productDetails = billingProduct.getProductDetails()) == null) {
                    throw BillingManagerException.BillingClientCanNotFindProductException.INSTANCE;
                }
                BillingRepository billingRepository2 = billingInteractorImpl.billingRepository;
                billingInteractorImpl$getBillingFlowParams$1.L$0 = null;
                billingInteractorImpl$getBillingFlowParams$1.L$1 = null;
                billingInteractorImpl$getBillingFlowParams$1.label = 2;
                obj = billingRepository2.getBillingFlowParams(productDetails, billingPurchaseProductType, billingInteractorImpl$getBillingFlowParams$1);
                return obj == coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        billingInteractorImpl$getBillingFlowParams$1 = new BillingInteractorImpl$getBillingFlowParams$1(this, continuation);
        Object obj2 = billingInteractorImpl$getBillingFlowParams$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingInteractorImpl$getBillingFlowParams$1.label;
        if (i != 0) {
        }
        billingProduct = (BillingProduct) obj2;
        if (billingProduct != null) {
        }
        throw BillingManagerException.BillingClientCanNotFindProductException.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    @Override // com.ifriend.billing.api.logic.BillingInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object restorePurchases(Continuation<? super List<? extends Purchase>> continuation) {
        BillingInteractorImpl$restorePurchases$1 billingInteractorImpl$restorePurchases$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        BillingInteractorImpl billingInteractorImpl;
        List list;
        BillingInteractorImpl billingInteractorImpl2;
        List list2;
        BillingInteractorImpl billingInteractorImpl3;
        if (continuation instanceof BillingInteractorImpl$restorePurchases$1) {
            billingInteractorImpl$restorePurchases$1 = (BillingInteractorImpl$restorePurchases$1) continuation;
            if ((billingInteractorImpl$restorePurchases$1.label & Integer.MIN_VALUE) != 0) {
                billingInteractorImpl$restorePurchases$1.label -= Integer.MIN_VALUE;
                obj = billingInteractorImpl$restorePurchases$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingInteractorImpl$restorePurchases$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String eventName = BillingClientEvents.RestorePurchases.StartRestorePurchase.INSTANCE.getEventName();
                    billingInteractorImpl$restorePurchases$1.L$0 = this;
                    billingInteractorImpl$restorePurchases$1.label = 1;
                    if (logEvent$default(this, eventName, null, billingInteractorImpl$restorePurchases$1, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    billingInteractorImpl = this;
                } else if (i == 1) {
                    billingInteractorImpl = (BillingInteractorImpl) billingInteractorImpl$restorePurchases$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            List list3 = (List) billingInteractorImpl$restorePurchases$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            return list3;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) billingInteractorImpl$restorePurchases$1.L$1;
                    billingInteractorImpl3 = (BillingInteractorImpl) billingInteractorImpl$restorePurchases$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    list = list2;
                    billingInteractorImpl2 = billingInteractorImpl3;
                    String eventName2 = BillingClientEvents.RestorePurchases.EndRestorePurchase.INSTANCE.getEventName();
                    billingInteractorImpl$restorePurchases$1.L$0 = list;
                    billingInteractorImpl$restorePurchases$1.L$1 = null;
                    billingInteractorImpl$restorePurchases$1.label = 4;
                    return logEvent$default(billingInteractorImpl2, eventName2, null, billingInteractorImpl$restorePurchases$1, 2, null) == coroutine_suspended ? coroutine_suspended : list;
                } else {
                    billingInteractorImpl = (BillingInteractorImpl) billingInteractorImpl$restorePurchases$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    BillingInteractorImpl billingInteractorImpl4 = billingInteractorImpl;
                    list = (List) obj;
                    if (!list.isEmpty()) {
                        billingInteractorImpl$restorePurchases$1.L$0 = billingInteractorImpl4;
                        billingInteractorImpl$restorePurchases$1.L$1 = list;
                        billingInteractorImpl$restorePurchases$1.label = 3;
                        if (confirmPurchases$default(billingInteractorImpl4, list, 0L, billingInteractorImpl$restorePurchases$1, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list2 = list;
                        billingInteractorImpl3 = billingInteractorImpl4;
                        list = list2;
                        billingInteractorImpl2 = billingInteractorImpl3;
                        String eventName22 = BillingClientEvents.RestorePurchases.EndRestorePurchase.INSTANCE.getEventName();
                        billingInteractorImpl$restorePurchases$1.L$0 = list;
                        billingInteractorImpl$restorePurchases$1.L$1 = null;
                        billingInteractorImpl$restorePurchases$1.label = 4;
                        if (logEvent$default(billingInteractorImpl2, eventName22, null, billingInteractorImpl$restorePurchases$1, 2, null) == coroutine_suspended) {
                        }
                    } else {
                        billingInteractorImpl2 = billingInteractorImpl4;
                        String eventName222 = BillingClientEvents.RestorePurchases.EndRestorePurchase.INSTANCE.getEventName();
                        billingInteractorImpl$restorePurchases$1.L$0 = list;
                        billingInteractorImpl$restorePurchases$1.L$1 = null;
                        billingInteractorImpl$restorePurchases$1.label = 4;
                        if (logEvent$default(billingInteractorImpl2, eventName222, null, billingInteractorImpl$restorePurchases$1, 2, null) == coroutine_suspended) {
                        }
                    }
                }
                BillingRepository billingRepository = billingInteractorImpl.billingRepository;
                billingInteractorImpl$restorePurchases$1.L$0 = billingInteractorImpl;
                billingInteractorImpl$restorePurchases$1.label = 2;
                obj = billingRepository.getPurchases(billingInteractorImpl$restorePurchases$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                BillingInteractorImpl billingInteractorImpl42 = billingInteractorImpl;
                list = (List) obj;
                if (!list.isEmpty()) {
                }
            }
        }
        billingInteractorImpl$restorePurchases$1 = new BillingInteractorImpl$restorePurchases$1(this, continuation);
        obj = billingInteractorImpl$restorePurchases$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingInteractorImpl$restorePurchases$1.label;
        if (i != 0) {
        }
        BillingRepository billingRepository2 = billingInteractorImpl.billingRepository;
        billingInteractorImpl$restorePurchases$1.L$0 = billingInteractorImpl;
        billingInteractorImpl$restorePurchases$1.label = 2;
        obj = billingRepository2.getPurchases(billingInteractorImpl$restorePurchases$1);
        if (obj == coroutine_suspended) {
        }
        BillingInteractorImpl billingInteractorImpl422 = billingInteractorImpl;
        list = (List) obj;
        if (!list.isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02af  */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0211 -> B:59:0x0241). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x023e -> B:59:0x0241). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object confirmPurchases(List<? extends Purchase> list, long j, Continuation<? super Boolean> continuation) {
        BillingInteractorImpl$confirmPurchases$1 billingInteractorImpl$confirmPurchases$1;
        long j2;
        BillingInteractorImpl billingInteractorImpl;
        Iterator it;
        List<? extends Purchase> list2;
        ArrayList arrayList;
        BillingInteractorImpl billingInteractorImpl2;
        int i;
        int i2;
        Purchase purchase;
        int i3;
        Purchase purchase2;
        Iterator it2;
        List list3;
        List<? extends Purchase> list4;
        BillingInteractorImpl billingInteractorImpl3;
        Object obj;
        Purchase purchase3;
        Iterator it3;
        List list5;
        List<? extends Purchase> list6;
        BillingInteractorImpl billingInteractorImpl4;
        boolean z;
        Object m7271constructorimpl;
        BillingInteractorImpl billingInteractorImpl5;
        List<? extends Purchase> list7;
        List list8;
        Iterator it4;
        Purchase purchase4;
        Throwable m7274exceptionOrNullimpl;
        ArrayList arrayList2;
        boolean z2;
        boolean z3;
        ?? r0;
        Object logEvent;
        boolean m7277isFailureimpl;
        int i4;
        List<? extends Purchase> list9 = list;
        if (continuation instanceof BillingInteractorImpl$confirmPurchases$1) {
            billingInteractorImpl$confirmPurchases$1 = (BillingInteractorImpl$confirmPurchases$1) continuation;
            if ((billingInteractorImpl$confirmPurchases$1.label & Integer.MIN_VALUE) != 0) {
                billingInteractorImpl$confirmPurchases$1.label -= Integer.MIN_VALUE;
                Object obj2 = billingInteractorImpl$confirmPurchases$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = 2;
                boolean z4 = true;
                Object obj3 = null;
                switch (billingInteractorImpl$confirmPurchases$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj2);
                        billingInteractorImpl$confirmPurchases$1.L$0 = this;
                        billingInteractorImpl$confirmPurchases$1.L$1 = list9;
                        j2 = j;
                        billingInteractorImpl$confirmPurchases$1.J$0 = j2;
                        billingInteractorImpl$confirmPurchases$1.label = 1;
                        if (logEvent(BillingClientEvents.ConfirmPurchases.StartConfirmPurchase.INSTANCE.getEventName(), new BillingInteractorImpl$confirmPurchases$2(list9), billingInteractorImpl$confirmPurchases$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        billingInteractorImpl = this;
                        it = list9.iterator();
                        list2 = list9;
                        arrayList = new ArrayList();
                        billingInteractorImpl2 = billingInteractorImpl;
                        i = 0;
                        if (!it.hasNext()) {
                            Object next = it.next();
                            i3 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            Purchase purchase5 = (Purchase) next;
                            if (i != 0) {
                                billingInteractorImpl$confirmPurchases$1.L$0 = billingInteractorImpl2;
                                billingInteractorImpl$confirmPurchases$1.L$1 = list2;
                                billingInteractorImpl$confirmPurchases$1.L$2 = arrayList;
                                billingInteractorImpl$confirmPurchases$1.L$3 = it;
                                billingInteractorImpl$confirmPurchases$1.L$4 = purchase5;
                                billingInteractorImpl$confirmPurchases$1.L$5 = obj3;
                                billingInteractorImpl$confirmPurchases$1.J$0 = j2;
                                billingInteractorImpl$confirmPurchases$1.I$0 = i3;
                                billingInteractorImpl$confirmPurchases$1.label = i5;
                                if (DelayKt.delay(j2, billingInteractorImpl$confirmPurchases$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                i2 = i3;
                                purchase = purchase5;
                                arrayList2 = arrayList;
                                billingInteractorImpl3 = billingInteractorImpl2;
                                list4 = list2;
                                list3 = arrayList2;
                                it2 = it;
                                purchase2 = purchase;
                                i3 = i2;
                                Result.Companion companion = Result.Companion;
                                BillingInteractorImpl billingInteractorImpl6 = billingInteractorImpl3;
                                BillingRepository billingRepository = billingInteractorImpl3.billingRepository;
                                billingInteractorImpl$confirmPurchases$1.L$0 = billingInteractorImpl3;
                                billingInteractorImpl$confirmPurchases$1.L$1 = list4;
                                billingInteractorImpl$confirmPurchases$1.L$2 = list3;
                                billingInteractorImpl$confirmPurchases$1.L$3 = it2;
                                billingInteractorImpl$confirmPurchases$1.L$4 = purchase2;
                                billingInteractorImpl$confirmPurchases$1.L$5 = obj3;
                                billingInteractorImpl$confirmPurchases$1.J$0 = j2;
                                billingInteractorImpl$confirmPurchases$1.I$0 = i3;
                                billingInteractorImpl$confirmPurchases$1.label = 3;
                                obj2 = billingRepository.confirmPurchase(purchase2, billingInteractorImpl$confirmPurchases$1);
                                if (obj2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                m7271constructorimpl = Result.m7271constructorimpl(Boxing.boxBoolean(((Boolean) obj2).booleanValue()));
                                purchase4 = purchase2;
                                billingInteractorImpl4 = billingInteractorImpl3;
                                int i6 = i3;
                                obj = m7271constructorimpl;
                                i = i6;
                                List list10 = list3;
                                Iterator it5 = it2;
                                long j3 = j2;
                                List<? extends Purchase> list11 = list4;
                                m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(obj);
                                if (m7274exceptionOrNullimpl == null) {
                                    AppLoggerInteractor appLoggerInteractor = billingInteractorImpl4.appLoggerInteractor;
                                    String eventName = BillingClientEvents.ConfirmPurchases.ConfirmPurchaseError.INSTANCE.getEventName();
                                    LoggerLevel loggerLevel = LoggerLevel.ERROR;
                                    Object obj4 = coroutine_suspended;
                                    Pair[] pairArr = new Pair[i5];
                                    pairArr[0] = TuplesKt.to("purchase", purchase4.getOriginalJson());
                                    z = true;
                                    pairArr[1] = TuplesKt.to(BillingManagerImpl.ERROR_MESSAGE_KEY, m7274exceptionOrNullimpl.toString());
                                    billingInteractorImpl$confirmPurchases$1.L$0 = billingInteractorImpl4;
                                    billingInteractorImpl$confirmPurchases$1.L$1 = list11;
                                    billingInteractorImpl$confirmPurchases$1.L$2 = list10;
                                    billingInteractorImpl$confirmPurchases$1.L$3 = it5;
                                    billingInteractorImpl$confirmPurchases$1.L$4 = purchase4;
                                    billingInteractorImpl$confirmPurchases$1.L$5 = obj;
                                    billingInteractorImpl$confirmPurchases$1.J$0 = j3;
                                    billingInteractorImpl$confirmPurchases$1.I$0 = i;
                                    billingInteractorImpl$confirmPurchases$1.label = 4;
                                    if (AppLoggerInteractor.DefaultImpls.logEvent$default(appLoggerInteractor, new PurchaseEvent(eventName, loggerLevel, MapsKt.mapOf(pairArr), TAG), false, billingInteractorImpl$confirmPurchases$1, 2, null) == obj4) {
                                        return obj4;
                                    }
                                    list5 = list10;
                                    purchase3 = purchase4;
                                    it3 = it5;
                                    coroutine_suspended = obj4;
                                    list6 = list11;
                                    j2 = j3;
                                    purchase4 = purchase3;
                                    it4 = it3;
                                    list8 = list5;
                                    list7 = list6;
                                    billingInteractorImpl5 = billingInteractorImpl4;
                                    if (Result.m7278isSuccessimpl(obj)) {
                                        ((Boolean) obj).booleanValue();
                                        billingInteractorImpl$confirmPurchases$1.L$0 = billingInteractorImpl5;
                                        billingInteractorImpl$confirmPurchases$1.L$1 = list7;
                                        billingInteractorImpl$confirmPurchases$1.L$2 = list8;
                                        billingInteractorImpl$confirmPurchases$1.L$3 = it4;
                                        billingInteractorImpl$confirmPurchases$1.L$4 = obj;
                                        billingInteractorImpl$confirmPurchases$1.L$5 = null;
                                        billingInteractorImpl$confirmPurchases$1.J$0 = j2;
                                        billingInteractorImpl$confirmPurchases$1.I$0 = i;
                                        billingInteractorImpl$confirmPurchases$1.label = 5;
                                        if (billingInteractorImpl5.logEvent(BillingClientEvents.ConfirmPurchases.ConfirmPurchaseSuccess.INSTANCE.getEventName(), new BillingInteractorImpl$confirmPurchases$3$result$3$1(list7, purchase4), billingInteractorImpl$confirmPurchases$1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    it = it4;
                                    ArrayList arrayList3 = list8;
                                    list2 = list7;
                                    billingInteractorImpl2 = billingInteractorImpl5;
                                    Boolean boxBoolean = Boxing.boxBoolean(false);
                                    m7277isFailureimpl = Result.m7277isFailureimpl(obj);
                                    Boolean bool = obj;
                                    if (m7277isFailureimpl) {
                                        bool = boxBoolean;
                                    }
                                    arrayList3.add(bool);
                                    z4 = z;
                                    i5 = 2;
                                    obj3 = null;
                                    arrayList = arrayList3;
                                    if (!it.hasNext()) {
                                        z2 = z4;
                                        z3 = false;
                                        ArrayList<Boolean> arrayList4 = arrayList;
                                        if (!(arrayList4 instanceof Collection) || !arrayList4.isEmpty()) {
                                            for (Boolean bool2 : arrayList4) {
                                                if (!bool2.booleanValue()) {
                                                    r0 = 0;
                                                    billingInteractorImpl$confirmPurchases$1.L$0 = null;
                                                    billingInteractorImpl$confirmPurchases$1.L$1 = null;
                                                    billingInteractorImpl$confirmPurchases$1.L$2 = null;
                                                    billingInteractorImpl$confirmPurchases$1.L$3 = null;
                                                    billingInteractorImpl$confirmPurchases$1.L$4 = null;
                                                    billingInteractorImpl$confirmPurchases$1.L$5 = null;
                                                    billingInteractorImpl$confirmPurchases$1.I$0 = r0;
                                                    billingInteractorImpl$confirmPurchases$1.label = 6;
                                                    logEvent = billingInteractorImpl2.logEvent(BillingClientEvents.ConfirmPurchases.EndConfirmPurchases.INSTANCE.getEventName(), new BillingInteractorImpl$confirmPurchases$4(list2, r0), billingInteractorImpl$confirmPurchases$1);
                                                    i4 = r0;
                                                    if (logEvent == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                }
                                            }
                                        }
                                        r0 = z2;
                                        billingInteractorImpl$confirmPurchases$1.L$0 = null;
                                        billingInteractorImpl$confirmPurchases$1.L$1 = null;
                                        billingInteractorImpl$confirmPurchases$1.L$2 = null;
                                        billingInteractorImpl$confirmPurchases$1.L$3 = null;
                                        billingInteractorImpl$confirmPurchases$1.L$4 = null;
                                        billingInteractorImpl$confirmPurchases$1.L$5 = null;
                                        billingInteractorImpl$confirmPurchases$1.I$0 = r0;
                                        billingInteractorImpl$confirmPurchases$1.label = 6;
                                        logEvent = billingInteractorImpl2.logEvent(BillingClientEvents.ConfirmPurchases.EndConfirmPurchases.INSTANCE.getEventName(), new BillingInteractorImpl$confirmPurchases$4(list2, r0), billingInteractorImpl$confirmPurchases$1);
                                        i4 = r0;
                                        if (logEvent == coroutine_suspended) {
                                        }
                                    }
                                } else {
                                    z = z4;
                                    list8 = list10;
                                    it4 = it5;
                                    billingInteractorImpl5 = billingInteractorImpl4;
                                    coroutine_suspended = coroutine_suspended;
                                    list7 = list11;
                                    j2 = j3;
                                    if (Result.m7278isSuccessimpl(obj)) {
                                    }
                                    it = it4;
                                    ArrayList arrayList32 = list8;
                                    list2 = list7;
                                    billingInteractorImpl2 = billingInteractorImpl5;
                                    Boolean boxBoolean2 = Boxing.boxBoolean(false);
                                    m7277isFailureimpl = Result.m7277isFailureimpl(obj);
                                    Boolean bool3 = obj;
                                    if (m7277isFailureimpl) {
                                    }
                                    arrayList32.add(bool3);
                                    z4 = z;
                                    i5 = 2;
                                    obj3 = null;
                                    arrayList = arrayList32;
                                    if (!it.hasNext()) {
                                    }
                                }
                            } else {
                                billingInteractorImpl3 = billingInteractorImpl2;
                                list4 = list2;
                                list3 = arrayList;
                                it2 = it;
                                purchase2 = purchase5;
                                Result.Companion companion2 = Result.Companion;
                                BillingInteractorImpl billingInteractorImpl62 = billingInteractorImpl3;
                                BillingRepository billingRepository2 = billingInteractorImpl3.billingRepository;
                                billingInteractorImpl$confirmPurchases$1.L$0 = billingInteractorImpl3;
                                billingInteractorImpl$confirmPurchases$1.L$1 = list4;
                                billingInteractorImpl$confirmPurchases$1.L$2 = list3;
                                billingInteractorImpl$confirmPurchases$1.L$3 = it2;
                                billingInteractorImpl$confirmPurchases$1.L$4 = purchase2;
                                billingInteractorImpl$confirmPurchases$1.L$5 = obj3;
                                billingInteractorImpl$confirmPurchases$1.J$0 = j2;
                                billingInteractorImpl$confirmPurchases$1.I$0 = i3;
                                billingInteractorImpl$confirmPurchases$1.label = 3;
                                obj2 = billingRepository2.confirmPurchase(purchase2, billingInteractorImpl$confirmPurchases$1);
                                if (obj2 == coroutine_suspended) {
                                }
                                m7271constructorimpl = Result.m7271constructorimpl(Boxing.boxBoolean(((Boolean) obj2).booleanValue()));
                                purchase4 = purchase2;
                                billingInteractorImpl4 = billingInteractorImpl3;
                                int i62 = i3;
                                obj = m7271constructorimpl;
                                i = i62;
                                List list102 = list3;
                                Iterator it52 = it2;
                                long j32 = j2;
                                List<? extends Purchase> list112 = list4;
                                m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(obj);
                                if (m7274exceptionOrNullimpl == null) {
                                }
                            }
                        }
                        break;
                    case 1:
                        j2 = billingInteractorImpl$confirmPurchases$1.J$0;
                        list9 = (List) billingInteractorImpl$confirmPurchases$1.L$1;
                        billingInteractorImpl = (BillingInteractorImpl) billingInteractorImpl$confirmPurchases$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        it = list9.iterator();
                        list2 = list9;
                        arrayList = new ArrayList();
                        billingInteractorImpl2 = billingInteractorImpl;
                        i = 0;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 2:
                        i2 = billingInteractorImpl$confirmPurchases$1.I$0;
                        j2 = billingInteractorImpl$confirmPurchases$1.J$0;
                        purchase = (Purchase) billingInteractorImpl$confirmPurchases$1.L$4;
                        it = (Iterator) billingInteractorImpl$confirmPurchases$1.L$3;
                        list2 = (List) billingInteractorImpl$confirmPurchases$1.L$1;
                        billingInteractorImpl2 = (BillingInteractorImpl) billingInteractorImpl$confirmPurchases$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        arrayList2 = (List) billingInteractorImpl$confirmPurchases$1.L$2;
                        billingInteractorImpl3 = billingInteractorImpl2;
                        list4 = list2;
                        list3 = arrayList2;
                        it2 = it;
                        purchase2 = purchase;
                        i3 = i2;
                        Result.Companion companion22 = Result.Companion;
                        BillingInteractorImpl billingInteractorImpl622 = billingInteractorImpl3;
                        BillingRepository billingRepository22 = billingInteractorImpl3.billingRepository;
                        billingInteractorImpl$confirmPurchases$1.L$0 = billingInteractorImpl3;
                        billingInteractorImpl$confirmPurchases$1.L$1 = list4;
                        billingInteractorImpl$confirmPurchases$1.L$2 = list3;
                        billingInteractorImpl$confirmPurchases$1.L$3 = it2;
                        billingInteractorImpl$confirmPurchases$1.L$4 = purchase2;
                        billingInteractorImpl$confirmPurchases$1.L$5 = obj3;
                        billingInteractorImpl$confirmPurchases$1.J$0 = j2;
                        billingInteractorImpl$confirmPurchases$1.I$0 = i3;
                        billingInteractorImpl$confirmPurchases$1.label = 3;
                        obj2 = billingRepository22.confirmPurchase(purchase2, billingInteractorImpl$confirmPurchases$1);
                        if (obj2 == coroutine_suspended) {
                        }
                        m7271constructorimpl = Result.m7271constructorimpl(Boxing.boxBoolean(((Boolean) obj2).booleanValue()));
                        purchase4 = purchase2;
                        billingInteractorImpl4 = billingInteractorImpl3;
                        int i622 = i3;
                        obj = m7271constructorimpl;
                        i = i622;
                        List list1022 = list3;
                        Iterator it522 = it2;
                        long j322 = j2;
                        List<? extends Purchase> list1122 = list4;
                        m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(obj);
                        if (m7274exceptionOrNullimpl == null) {
                        }
                        break;
                    case 3:
                        i3 = billingInteractorImpl$confirmPurchases$1.I$0;
                        j2 = billingInteractorImpl$confirmPurchases$1.J$0;
                        purchase2 = (Purchase) billingInteractorImpl$confirmPurchases$1.L$4;
                        it2 = (Iterator) billingInteractorImpl$confirmPurchases$1.L$3;
                        list3 = (List) billingInteractorImpl$confirmPurchases$1.L$2;
                        list4 = (List) billingInteractorImpl$confirmPurchases$1.L$1;
                        billingInteractorImpl3 = (BillingInteractorImpl) billingInteractorImpl$confirmPurchases$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj2);
                        } catch (Throwable th) {
                            Result.Companion companion3 = Result.Companion;
                            m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                        }
                        m7271constructorimpl = Result.m7271constructorimpl(Boxing.boxBoolean(((Boolean) obj2).booleanValue()));
                        purchase4 = purchase2;
                        billingInteractorImpl4 = billingInteractorImpl3;
                        int i6222 = i3;
                        obj = m7271constructorimpl;
                        i = i6222;
                        List list10222 = list3;
                        Iterator it5222 = it2;
                        long j3222 = j2;
                        List<? extends Purchase> list11222 = list4;
                        m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(obj);
                        if (m7274exceptionOrNullimpl == null) {
                        }
                        break;
                    case 4:
                        i = billingInteractorImpl$confirmPurchases$1.I$0;
                        j2 = billingInteractorImpl$confirmPurchases$1.J$0;
                        obj = billingInteractorImpl$confirmPurchases$1.L$5;
                        purchase3 = (Purchase) billingInteractorImpl$confirmPurchases$1.L$4;
                        it3 = (Iterator) billingInteractorImpl$confirmPurchases$1.L$3;
                        list5 = (List) billingInteractorImpl$confirmPurchases$1.L$2;
                        list6 = (List) billingInteractorImpl$confirmPurchases$1.L$1;
                        billingInteractorImpl4 = (BillingInteractorImpl) billingInteractorImpl$confirmPurchases$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        z = true;
                        purchase4 = purchase3;
                        it4 = it3;
                        list8 = list5;
                        list7 = list6;
                        billingInteractorImpl5 = billingInteractorImpl4;
                        if (Result.m7278isSuccessimpl(obj)) {
                        }
                        it = it4;
                        ArrayList arrayList322 = list8;
                        list2 = list7;
                        billingInteractorImpl2 = billingInteractorImpl5;
                        Boolean boxBoolean22 = Boxing.boxBoolean(false);
                        m7277isFailureimpl = Result.m7277isFailureimpl(obj);
                        Boolean bool32 = obj;
                        if (m7277isFailureimpl) {
                        }
                        arrayList322.add(bool32);
                        z4 = z;
                        i5 = 2;
                        obj3 = null;
                        arrayList = arrayList322;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 5:
                        i = billingInteractorImpl$confirmPurchases$1.I$0;
                        j2 = billingInteractorImpl$confirmPurchases$1.J$0;
                        obj = billingInteractorImpl$confirmPurchases$1.L$4;
                        it4 = (Iterator) billingInteractorImpl$confirmPurchases$1.L$3;
                        list8 = (List) billingInteractorImpl$confirmPurchases$1.L$2;
                        list7 = (List) billingInteractorImpl$confirmPurchases$1.L$1;
                        billingInteractorImpl5 = (BillingInteractorImpl) billingInteractorImpl$confirmPurchases$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        z = true;
                        it = it4;
                        ArrayList arrayList3222 = list8;
                        list2 = list7;
                        billingInteractorImpl2 = billingInteractorImpl5;
                        Boolean boxBoolean222 = Boxing.boxBoolean(false);
                        m7277isFailureimpl = Result.m7277isFailureimpl(obj);
                        Boolean bool322 = obj;
                        if (m7277isFailureimpl) {
                        }
                        arrayList3222.add(bool322);
                        z4 = z;
                        i5 = 2;
                        obj3 = null;
                        arrayList = arrayList3222;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 6:
                        int i7 = billingInteractorImpl$confirmPurchases$1.I$0;
                        ResultKt.throwOnFailure(obj2);
                        z2 = true;
                        z3 = false;
                        i4 = i7;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Boxing.boxBoolean(i4 == 0 ? z2 : z3);
            }
        }
        billingInteractorImpl$confirmPurchases$1 = new BillingInteractorImpl$confirmPurchases$1(this, continuation);
        Object obj22 = billingInteractorImpl$confirmPurchases$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i52 = 2;
        boolean z42 = true;
        Object obj32 = null;
        switch (billingInteractorImpl$confirmPurchases$1.label) {
        }
        return Boxing.boxBoolean(i4 == 0 ? z2 : z3);
    }

    static /* synthetic */ Object confirmPurchases$default(BillingInteractorImpl billingInteractorImpl, List list, long j, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
        }
        return billingInteractorImpl.confirmPurchases(list, j, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object logEvent$default(BillingInteractorImpl billingInteractorImpl, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = BillingInteractorImpl$logEvent$2.INSTANCE;
        }
        return billingInteractorImpl.logEvent(str, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object logEvent(String str, Function1<? super Map<String, String>, Unit> function1, Continuation<? super Unit> continuation) {
        AppLoggerInteractor appLoggerInteractor = this.appLoggerInteractor;
        LoggerLevel loggerLevel = LoggerLevel.INFO;
        Map createMapBuilder = MapsKt.createMapBuilder();
        function1.invoke(createMapBuilder);
        Object logEvent$default = AppLoggerInteractor.DefaultImpls.logEvent$default(appLoggerInteractor, new PurchaseEvent(str, loggerLevel, MapsKt.build(createMapBuilder), TAG), false, continuation, 2, null);
        return logEvent$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? logEvent$default : Unit.INSTANCE;
    }
}
