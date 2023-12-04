package com.ifiend.billing.impl.data;

import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.google.gson.Gson;
import com.ifiend.billing.impl.logic.repository.BillingRepository;
import com.ifiend.billing.impl.manager.BillingManager;
import com.ifriend.billing.api.exception.BillingManagerException;
import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.billing.api.models.BillingProductsResult;
import com.ifriend.billing.api.models.BillingPurchaseProductType;
import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.core.common.core.CachedListData;
import com.ifriend.core.remote.datasources.billing.BillingRemoteDataSource;
import com.ifriend.core.remote.datasources.billing.models.BillingProductRemote;
import com.ifriend.core.remote.datasources.billing.models.BillingReceiptRemoteParams;
import com.ifriend.core.tools.api.DispatcherProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
/* compiled from: BillingRepositoryImpl.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u001b\u0010#\u001a\u0004\u0018\u00010\u000f2\u0006\u0010$\u001a\u00020%H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&J\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00170\u001aH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0019\u0010(\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0019\u0010)\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0010\u0010+\u001a\u00020%2\u0006\u0010 \u001a\u00020!H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/ifiend/billing/impl/data/BillingRepositoryImpl;", "Lcom/ifiend/billing/impl/logic/repository/BillingRepository;", "billingRemoteDataSource", "Lcom/ifriend/core/remote/datasources/billing/BillingRemoteDataSource;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "billingManager", "Lcom/ifiend/billing/impl/manager/BillingManager;", "billingProductMapper", "Lcom/ifiend/billing/impl/data/BillingProductMapper;", "gson", "Lcom/google/gson/Gson;", "(Lcom/ifriend/core/remote/datasources/billing/BillingRemoteDataSource;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifiend/billing/impl/manager/BillingManager;Lcom/ifiend/billing/impl/data/BillingProductMapper;Lcom/google/gson/Gson;)V", "cachedData", "Lcom/ifriend/core/common/core/CachedListData;", "Lcom/ifriend/billing/api/models/BillingProduct;", "getCachedData", "()Lcom/ifriend/core/common/core/CachedListData;", "cachedData$delegate", "Lkotlin/Lazy;", "confirmPurchase", "", "purchase", "Lcom/android/billingclient/api/Purchase;", "(Lcom/android/billingclient/api/Purchase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchProducts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBillingFlowParams", "Lcom/android/billingclient/api/BillingFlowParams;", "product", "Lcom/android/billingclient/api/ProductDetails;", "productType", "Lcom/ifriend/billing/api/models/BillingPurchaseProductType;", "(Lcom/android/billingclient/api/ProductDetails;Lcom/ifriend/billing/api/models/BillingPurchaseProductType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProduct", "productId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPurchases", "getReceipt", "hasSubscription", "loadProducts", "provideBillingProductType", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingRepositoryImpl implements BillingRepository {
    private final BillingManager billingManager;
    private final BillingProductMapper billingProductMapper;
    private final BillingRemoteDataSource billingRemoteDataSource;
    private final Lazy cachedData$delegate;
    private final DispatcherProvider dispatcherProvider;
    private final Gson gson;

    /* compiled from: BillingRepositoryImpl.kt */
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

    @Inject
    public BillingRepositoryImpl(BillingRemoteDataSource billingRemoteDataSource, DispatcherProvider dispatcherProvider, BillingManager billingManager, BillingProductMapper billingProductMapper, Gson gson) {
        Intrinsics.checkNotNullParameter(billingRemoteDataSource, "billingRemoteDataSource");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(billingManager, "billingManager");
        Intrinsics.checkNotNullParameter(billingProductMapper, "billingProductMapper");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.billingRemoteDataSource = billingRemoteDataSource;
        this.dispatcherProvider = dispatcherProvider;
        this.billingManager = billingManager;
        this.billingProductMapper = billingProductMapper;
        this.gson = gson;
        this.cachedData$delegate = LazyKt.lazy(new BillingRepositoryImpl$cachedData$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CachedListData<BillingProduct> getCachedData() {
        return (CachedListData) this.cachedData$delegate.getValue();
    }

    @Override // com.ifiend.billing.impl.logic.repository.BillingRepository
    public Object fetchProducts(Continuation<? super List<BillingProduct>> continuation) {
        return BuildersKt.withContext(this.dispatcherProvider.background(), new BillingRepositoryImpl$fetchProducts$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d A[LOOP:2: B:23:0x0087->B:25:0x008d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadProducts(Continuation<? super List<BillingProduct>> continuation) {
        BillingRepositoryImpl$loadProducts$1 billingRepositoryImpl$loadProducts$1;
        Object coroutine_suspended;
        int i;
        BillingRepositoryImpl billingRepositoryImpl;
        ArrayList arrayList;
        Object products;
        List list;
        Object products2;
        BillingProductsResult billingProductsResult;
        BillingRepositoryImpl billingRepositoryImpl2;
        List<BillingProductRemote> list2;
        BillingProduct billingProduct;
        Object obj;
        BillingProduct billingProduct2;
        if (continuation instanceof BillingRepositoryImpl$loadProducts$1) {
            billingRepositoryImpl$loadProducts$1 = (BillingRepositoryImpl$loadProducts$1) continuation;
            if ((billingRepositoryImpl$loadProducts$1.label & Integer.MIN_VALUE) != 0) {
                billingRepositoryImpl$loadProducts$1.label -= Integer.MIN_VALUE;
                Object obj22 = billingRepositoryImpl$loadProducts$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingRepositoryImpl$loadProducts$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj22);
                    BillingRemoteDataSource billingRemoteDataSource = this.billingRemoteDataSource;
                    billingRepositoryImpl$loadProducts$1.L$0 = this;
                    billingRepositoryImpl$loadProducts$1.label = 1;
                    obj22 = billingRemoteDataSource.getProducts(billingRepositoryImpl$loadProducts$1);
                    if (obj22 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    billingRepositoryImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        list = (List) billingRepositoryImpl$loadProducts$1.L$1;
                        BillingRepositoryImpl billingRepositoryImpl3 = (BillingRepositoryImpl) billingRepositoryImpl$loadProducts$1.L$0;
                        ResultKt.throwOnFailure(obj22);
                        arrayList = (List) billingRepositoryImpl$loadProducts$1.L$2;
                        billingRepositoryImpl = billingRepositoryImpl3;
                        BillingProductsResult billingProductsResult22 = (BillingProductsResult) obj22;
                        BillingManager billingManager3 = billingRepositoryImpl.billingManager;
                        billingRepositoryImpl$loadProducts$1.L$0 = billingRepositoryImpl;
                        billingRepositoryImpl$loadProducts$1.L$1 = list;
                        billingRepositoryImpl$loadProducts$1.L$2 = billingProductsResult22;
                        billingRepositoryImpl$loadProducts$1.label = 3;
                        products2 = billingManager3.getProducts(arrayList, "subs", billingRepositoryImpl$loadProducts$1);
                        if (products2 != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        billingProductsResult = billingProductsResult22;
                        obj22 = products2;
                        billingRepositoryImpl2 = billingRepositoryImpl;
                        list2 = list;
                        BillingProductsResult billingProductsResult32 = (BillingProductsResult) obj22;
                        if (billingProductsResult.isSuccessful()) {
                        }
                        throw BillingManagerException.BillingClientFetchProductsException.INSTANCE;
                    } else if (i == 3) {
                        billingProductsResult = (BillingProductsResult) billingRepositoryImpl$loadProducts$1.L$2;
                        list2 = (List) billingRepositoryImpl$loadProducts$1.L$1;
                        billingRepositoryImpl2 = (BillingRepositoryImpl) billingRepositoryImpl$loadProducts$1.L$0;
                        ResultKt.throwOnFailure(obj22);
                        BillingProductsResult billingProductsResult322 = (BillingProductsResult) obj22;
                        if (billingProductsResult.isSuccessful() || !billingProductsResult322.isSuccessful()) {
                            throw BillingManagerException.BillingClientFetchProductsException.INSTANCE;
                        }
                        List plus = CollectionsKt.plus((Collection) billingProductsResult.getProducts(), (Iterable) billingProductsResult322.getProducts());
                        ArrayList arrayList2 = new ArrayList();
                        for (BillingProductRemote billingProductRemote : list2) {
                            Iterator it = plus.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (Intrinsics.areEqual(((ProductDetails) obj).getProductId(), billingProductRemote.getProductId())) {
                                    break;
                                }
                            }
                            ProductDetails productDetails = (ProductDetails) obj;
                            if (productDetails != null) {
                                try {
                                    Result.Companion companion = Result.Companion;
                                    BillingRepositoryImpl billingRepositoryImpl4 = billingRepositoryImpl2;
                                    billingProduct2 = Result.m7271constructorimpl(billingRepositoryImpl2.billingProductMapper.map(billingProductRemote, productDetails));
                                } catch (Throwable th) {
                                    Result.Companion companion2 = Result.Companion;
                                    billingProduct2 = Result.m7271constructorimpl(ResultKt.createFailure(th));
                                }
                                billingProduct = Result.m7277isFailureimpl(billingProduct2) ? null : billingProduct2;
                            }
                            if (billingProduct != null) {
                                arrayList2.add(billingProduct);
                            }
                        }
                        return arrayList2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    billingRepositoryImpl = (BillingRepositoryImpl) billingRepositoryImpl$loadProducts$1.L$0;
                    ResultKt.throwOnFailure(obj22);
                }
                List list32 = (List) obj22;
                List<BillingProductRemote> list42 = list32;
                ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list42, 10));
                for (BillingProductRemote billingProductRemote2 : list42) {
                    arrayList32.add(billingProductRemote2.getProductId());
                }
                arrayList = arrayList32;
                BillingManager billingManager22 = billingRepositoryImpl.billingManager;
                billingRepositoryImpl$loadProducts$1.L$0 = billingRepositoryImpl;
                billingRepositoryImpl$loadProducts$1.L$1 = list32;
                billingRepositoryImpl$loadProducts$1.L$2 = arrayList;
                billingRepositoryImpl$loadProducts$1.label = 2;
                products = billingManager22.getProducts(arrayList, "inapp", billingRepositoryImpl$loadProducts$1);
                if (products != coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = list32;
                obj22 = products;
                BillingProductsResult billingProductsResult222 = (BillingProductsResult) obj22;
                BillingManager billingManager32 = billingRepositoryImpl.billingManager;
                billingRepositoryImpl$loadProducts$1.L$0 = billingRepositoryImpl;
                billingRepositoryImpl$loadProducts$1.L$1 = list;
                billingRepositoryImpl$loadProducts$1.L$2 = billingProductsResult222;
                billingRepositoryImpl$loadProducts$1.label = 3;
                products2 = billingManager32.getProducts(arrayList, "subs", billingRepositoryImpl$loadProducts$1);
                if (products2 != coroutine_suspended) {
                }
            }
        }
        billingRepositoryImpl$loadProducts$1 = new BillingRepositoryImpl$loadProducts$1(this, continuation);
        Object obj222 = billingRepositoryImpl$loadProducts$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingRepositoryImpl$loadProducts$1.label;
        if (i != 0) {
        }
        List list322 = (List) obj222;
        List<BillingProductRemote> list422 = list322;
        ArrayList arrayList322 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list422, 10));
        while (r5.hasNext()) {
        }
        arrayList = arrayList322;
        BillingManager billingManager222 = billingRepositoryImpl.billingManager;
        billingRepositoryImpl$loadProducts$1.L$0 = billingRepositoryImpl;
        billingRepositoryImpl$loadProducts$1.L$1 = list322;
        billingRepositoryImpl$loadProducts$1.L$2 = arrayList;
        billingRepositoryImpl$loadProducts$1.label = 2;
        products = billingManager222.getProducts(arrayList, "inapp", billingRepositoryImpl$loadProducts$1);
        if (products != coroutine_suspended) {
        }
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:664)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:522)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089 A[SYNTHETIC] */
    @Override // com.ifiend.billing.impl.logic.repository.BillingRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object getProduct(java.lang.String r9, kotlin.coroutines.Continuation<? super com.ifriend.billing.api.models.BillingProduct> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.ifiend.billing.impl.data.BillingRepositoryImpl$getProduct$1
            if (r0 == 0) goto L14
            r0 = r10
            com.ifiend.billing.impl.data.BillingRepositoryImpl$getProduct$1 r0 = (com.ifiend.billing.impl.data.BillingRepositoryImpl$getProduct$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            com.ifiend.billing.impl.data.BillingRepositoryImpl$getProduct$1 r0 = new com.ifiend.billing.impl.data.BillingRepositoryImpl$getProduct$1
            r0.<init>(r8, r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L56
            if (r2 == r5) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto Lac
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$0
            com.ifiend.billing.impl.data.BillingRepositoryImpl r2 = (com.ifiend.billing.impl.data.BillingRepositoryImpl) r2
            kotlin.ResultKt.throwOnFailure(r10)
            goto L9b
        L4a:
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$0
            com.ifiend.billing.impl.data.BillingRepositoryImpl r2 = (com.ifiend.billing.impl.data.BillingRepositoryImpl) r2
            kotlin.ResultKt.throwOnFailure(r10)
            goto L6b
        L56:
            kotlin.ResultKt.throwOnFailure(r10)
            com.ifriend.core.common.core.CachedListData r10 = r8.getCachedData()
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r10.getData(r0)
            if (r10 != r1) goto L6a
            return r1
        L6a:
            r2 = r8
        L6b:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L71:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L89
            java.lang.Object r5 = r10.next()
            r7 = r5
            com.ifriend.billing.api.models.BillingProduct r7 = (com.ifriend.billing.api.models.BillingProduct) r7
            java.lang.String r7 = r7.getProductId()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r9)
            if (r7 == 0) goto L71
            goto L8a
        L89:
            r5 = r6
        L8a:
            com.ifriend.billing.api.models.BillingProduct r5 = (com.ifriend.billing.api.models.BillingProduct) r5
            if (r5 != 0) goto Lcb
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r2.fetchProducts(r0)
            if (r10 != r1) goto L9b
            return r1
        L9b:
            com.ifriend.core.common.core.CachedListData r10 = r2.getCachedData()
            r0.L$0 = r9
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r10 = r10.getData(r0)
            if (r10 != r1) goto Lac
            return r1
        Lac:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        Lb2:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lca
            java.lang.Object r0 = r10.next()
            r1 = r0
            com.ifriend.billing.api.models.BillingProduct r1 = (com.ifriend.billing.api.models.BillingProduct) r1
            java.lang.String r1 = r1.getProductId()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r9)
            if (r1 == 0) goto Lb2
            r6 = r0
        Lca:
            return r6
        Lcb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ifiend.billing.impl.data.BillingRepositoryImpl.getProduct(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.ifiend.billing.impl.logic.repository.BillingRepository
    public Object getBillingFlowParams(ProductDetails productDetails, BillingPurchaseProductType billingPurchaseProductType, Continuation<? super BillingFlowParams> continuation) {
        return this.billingManager.getBillingFlowParams(productDetails, provideBillingProductType(billingPurchaseProductType), continuation);
    }

    private final String provideBillingProductType(BillingPurchaseProductType billingPurchaseProductType) {
        int i = WhenMappings.$EnumSwitchMapping$0[billingPurchaseProductType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "subs";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "inapp";
    }

    @Override // com.ifiend.billing.impl.logic.repository.BillingRepository
    public Object confirmPurchase(Purchase purchase, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(this.dispatcherProvider.background(), new BillingRepositoryImpl$confirmPurchase$2(this, purchase, null), continuation);
    }

    @Override // com.ifiend.billing.impl.logic.repository.BillingRepository
    public Object getPurchases(Continuation<? super List<? extends Purchase>> continuation) {
        return BuildersKt.withContext(this.dispatcherProvider.background(), new BillingRepositoryImpl$getPurchases$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4 A[PHI: r11 
      PHI: (r11v20 java.lang.Object) = (r11v18 java.lang.Object), (r11v1 java.lang.Object) binds: [B:39:0x00d1, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getReceipt(Purchase purchase, Continuation<? super String> continuation) {
        BillingRepositoryImpl$getReceipt$1 billingRepositoryImpl$getReceipt$1;
        Object obj;
        int i;
        BillingRepositoryImpl billingRepositoryImpl;
        if (continuation instanceof BillingRepositoryImpl$getReceipt$1) {
            billingRepositoryImpl$getReceipt$1 = (BillingRepositoryImpl$getReceipt$1) continuation;
            if ((billingRepositoryImpl$getReceipt$1.label & Integer.MIN_VALUE) != 0) {
                billingRepositoryImpl$getReceipt$1.label -= Integer.MIN_VALUE;
                BillingRepositoryImpl$getReceipt$1 billingRepositoryImpl$getReceipt$12 = billingRepositoryImpl$getReceipt$1;
                obj = billingRepositoryImpl$getReceipt$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingRepositoryImpl$getReceipt$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    billingRepositoryImpl$getReceipt$12.L$0 = this;
                    billingRepositoryImpl$getReceipt$12.L$1 = purchase;
                    billingRepositoryImpl$getReceipt$12.label = 1;
                    obj = hasSubscription(purchase, billingRepositoryImpl$getReceipt$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    billingRepositoryImpl = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    purchase = (Purchase) billingRepositoryImpl$getReceipt$12.L$1;
                    billingRepositoryImpl = (BillingRepositoryImpl) billingRepositoryImpl$getReceipt$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    BillingProduct billingProduct = (BillingProduct) obj;
                    BillingRemoteDataSource billingRemoteDataSource = billingRepositoryImpl.billingRemoteDataSource;
                    int quantity = purchase.getQuantity();
                    List<String> products = purchase.getProducts();
                    Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
                    String str = (String) CollectionsKt.first((List<? extends Object>) products);
                    String str2 = str != null ? str : "";
                    double orZero = ommonKt.orZero(billingProduct == null ? Boxing.boxDouble(billingProduct.backendPrice()) : null);
                    String signature = purchase.getSignature();
                    String originalJson = purchase.getOriginalJson();
                    Intrinsics.checkNotNull(signature);
                    Intrinsics.checkNotNull(originalJson);
                    billingRepositoryImpl$getReceipt$12.L$0 = null;
                    billingRepositoryImpl$getReceipt$12.L$1 = null;
                    billingRepositoryImpl$getReceipt$12.label = 3;
                    obj = billingRemoteDataSource.getReceipt(str2, orZero, quantity, signature, originalJson, billingRepositoryImpl$getReceipt$12);
                    return obj != coroutine_suspended ? coroutine_suspended : obj;
                } else {
                    purchase = (Purchase) billingRepositoryImpl$getReceipt$12.L$1;
                    billingRepositoryImpl = (BillingRepositoryImpl) billingRepositoryImpl$getReceipt$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    List<String> products2 = purchase.getProducts();
                    Intrinsics.checkNotNullExpressionValue(products2, "getProducts(...)");
                    String str3 = (String) CollectionsKt.first((List<? extends Object>) products2);
                    if (str3 == null) {
                        str3 = "";
                    }
                    billingRepositoryImpl$getReceipt$12.L$0 = billingRepositoryImpl;
                    billingRepositoryImpl$getReceipt$12.L$1 = purchase;
                    billingRepositoryImpl$getReceipt$12.label = 2;
                    obj = billingRepositoryImpl.getProduct(str3, billingRepositoryImpl$getReceipt$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    BillingProduct billingProduct2 = (BillingProduct) obj;
                    BillingRemoteDataSource billingRemoteDataSource2 = billingRepositoryImpl.billingRemoteDataSource;
                    int quantity2 = purchase.getQuantity();
                    List<String> products3 = purchase.getProducts();
                    Intrinsics.checkNotNullExpressionValue(products3, "getProducts(...)");
                    String str4 = (String) CollectionsKt.first((List<? extends Object>) products3);
                    if (str4 != null) {
                    }
                    double orZero2 = ommonKt.orZero(billingProduct2 == null ? Boxing.boxDouble(billingProduct2.backendPrice()) : null);
                    String signature2 = purchase.getSignature();
                    String originalJson2 = purchase.getOriginalJson();
                    Intrinsics.checkNotNull(signature2);
                    Intrinsics.checkNotNull(originalJson2);
                    billingRepositoryImpl$getReceipt$12.L$0 = null;
                    billingRepositoryImpl$getReceipt$12.L$1 = null;
                    billingRepositoryImpl$getReceipt$12.label = 3;
                    obj = billingRemoteDataSource2.getReceipt(str2, orZero2, quantity2, signature2, originalJson2, billingRepositoryImpl$getReceipt$12);
                    if (obj != coroutine_suspended) {
                    }
                } else {
                    Gson gson = billingRepositoryImpl.gson;
                    String signature3 = purchase.getSignature();
                    Intrinsics.checkNotNullExpressionValue(signature3, "getSignature(...)");
                    String originalJson3 = purchase.getOriginalJson();
                    Intrinsics.checkNotNullExpressionValue(originalJson3, "getOriginalJson(...)");
                    String json = gson.toJson(new BillingReceiptRemoteParams.GetReceiptRequisitesRequest(signature3, originalJson3));
                    Intrinsics.checkNotNull(json);
                    return json;
                }
            }
        }
        billingRepositoryImpl$getReceipt$1 = new BillingRepositoryImpl$getReceipt$1(this, continuation);
        BillingRepositoryImpl$getReceipt$1 billingRepositoryImpl$getReceipt$122 = billingRepositoryImpl$getReceipt$1;
        obj = billingRepositoryImpl$getReceipt$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingRepositoryImpl$getReceipt$122.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006a -> B:20:0x006d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hasSubscription(Purchase purchase, Continuation<? super Boolean> continuation) {
        BillingRepositoryImpl$hasSubscription$1 billingRepositoryImpl$hasSubscription$1;
        int i;
        BillingRepositoryImpl billingRepositoryImpl;
        Object obj;
        Iterator it;
        if (continuation instanceof BillingRepositoryImpl$hasSubscription$1) {
            billingRepositoryImpl$hasSubscription$1 = (BillingRepositoryImpl$hasSubscription$1) continuation;
            if ((billingRepositoryImpl$hasSubscription$1.label & Integer.MIN_VALUE) != 0) {
                billingRepositoryImpl$hasSubscription$1.label -= Integer.MIN_VALUE;
                Object obj2 = billingRepositoryImpl$hasSubscription$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingRepositoryImpl$hasSubscription$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    List<String> products = purchase.getProducts();
                    billingRepositoryImpl = this;
                    obj = products;
                    it = products.iterator();
                    if (it.hasNext()) {
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    it = (Iterator) billingRepositoryImpl$hasSubscription$1.L$2;
                    obj = (Iterable) billingRepositoryImpl$hasSubscription$1.L$1;
                    billingRepositoryImpl = (BillingRepositoryImpl) billingRepositoryImpl$hasSubscription$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    BillingProduct billingProduct = (BillingProduct) obj2;
                    if (billingProduct == null && billingProduct.isSubscription()) {
                        return Boxing.boxBoolean(true);
                    }
                    if (it.hasNext()) {
                        String str = (String) it.next();
                        Intrinsics.checkNotNull(str);
                        billingRepositoryImpl$hasSubscription$1.L$0 = billingRepositoryImpl;
                        billingRepositoryImpl$hasSubscription$1.L$1 = obj;
                        billingRepositoryImpl$hasSubscription$1.L$2 = it;
                        billingRepositoryImpl$hasSubscription$1.label = 1;
                        obj2 = billingRepositoryImpl.getProduct(str, billingRepositoryImpl$hasSubscription$1);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        BillingProduct billingProduct2 = (BillingProduct) obj2;
                        if (billingProduct2 == null && billingProduct2.isSubscription()) {
                        }
                        if (it.hasNext()) {
                            return Boxing.boxBoolean(false);
                        }
                    }
                }
            }
        }
        billingRepositoryImpl$hasSubscription$1 = new BillingRepositoryImpl$hasSubscription$1(this, continuation);
        Object obj22 = billingRepositoryImpl$hasSubscription$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingRepositoryImpl$hasSubscription$1.label;
        if (i != 0) {
        }
    }
}
