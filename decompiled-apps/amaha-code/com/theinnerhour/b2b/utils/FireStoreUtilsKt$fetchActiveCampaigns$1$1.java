package com.theinnerhour.b2b.utils;

import android.content.SharedPreferences;
import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.components.monetization.models.CampaignModel;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import fe.r;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ss.p;
import ta.v;
/* compiled from: FireStoreUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@ns.e(c = "com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchActiveCampaigns$1$1", f = "FireStoreUtils.kt", l = {513}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FireStoreUtilsKt$fetchActiveCampaigns$1$1 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
    final /* synthetic */ ya.h<r> $it;
    final /* synthetic */ p<Boolean, ArrayList<CampaignModel>, Object> $onLoad;
    int label;

    /* compiled from: FireStoreUtils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @ns.e(c = "com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchActiveCampaigns$1$1$2", f = "FireStoreUtils.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchActiveCampaigns$1$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends ns.i implements p<d0, ls.d<? super Object>, Object> {
        final /* synthetic */ ya.h<r> $it;
        final /* synthetic */ p<Boolean, ArrayList<CampaignModel>, Object> $onLoad;
        final /* synthetic */ ArrayList<CampaignModel> $returnList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(p<? super Boolean, ? super ArrayList<CampaignModel>, ? extends Object> pVar, ya.h<r> hVar, ArrayList<CampaignModel> arrayList, ls.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$onLoad = pVar;
            this.$it = hVar;
            this.$returnList = arrayList;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new AnonymousClass2(this.$onLoad, this.$it, this.$returnList, dVar);
        }

        @Override // ss.p
        public /* bridge */ /* synthetic */ Object invoke(d0 d0Var, ls.d<? super Object> dVar) {
            return invoke2(d0Var, (ls.d<Object>) dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                sp.b.d0(obj);
                return this.$onLoad.invoke(Boolean.valueOf(this.$it.isSuccessful()), this.$returnList);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(d0 d0Var, ls.d<Object> dVar) {
            return ((AnonymousClass2) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FireStoreUtilsKt$fetchActiveCampaigns$1$1(ya.h<r> hVar, p<? super Boolean, ? super ArrayList<CampaignModel>, ? extends Object> pVar, ls.d<? super FireStoreUtilsKt$fetchActiveCampaigns$1$1> dVar) {
        super(2, dVar);
        this.$it = hVar;
        this.$onLoad = pVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new FireStoreUtilsKt$fetchActiveCampaigns$1$1(this.$it, this.$onLoad, dVar);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.Object] */
    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        ArrayList<CampaignModel> arrayList;
        boolean z10;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.label;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                LogHelper logHelper = LogHelper.INSTANCE;
                str2 = FireStoreUtilsKt.TAG;
                logHelper.i(str2, "on complete listener fetchActiveCampaigns " + this.$it.isSuccessful());
                ArrayList arrayList2 = new ArrayList();
                if (this.$it.isSuccessful()) {
                    Type type = new TypeToken<ArrayList<String>>() { // from class: com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchActiveCampaigns$1$1$type$1
                    }.getType();
                    x xVar = new x();
                    try {
                        xVar.f23469u = new sf.i().c(pn.a.a("purchase_history"), type);
                    } catch (Exception e10) {
                        LogHelper logHelper2 = LogHelper.INSTANCE;
                        str3 = FireStoreUtilsKt.TAG;
                        logHelper2.e(str3, e10);
                    }
                    r result = this.$it.getResult();
                    if (result != null) {
                        arrayList = result.g(CampaignModel.class);
                    } else {
                        arrayList = null;
                    }
                    kotlin.jvm.internal.i.e(arrayList, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.components.monetization.models.CampaignModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.components.monetization.models.CampaignModel> }");
                    for (CampaignModel campaignModel : arrayList) {
                        if (campaignModel.getGeographies().contains("GLOBAL") || campaignModel.getGeographies().contains(LocationPersistence.INSTANCE.getCurrentCountry())) {
                            if (campaignModel.getMinAppVersion() <= 214 && campaignModel.getStartDate() < Calendar.getInstance().getTimeInMillis() && campaignModel.getEndDate() > Calendar.getInstance().getTimeInMillis()) {
                                if (xVar.f23469u != 0) {
                                    ArrayList<String> skuListAndroid = campaignModel.getSkuListAndroid();
                                    if (!(skuListAndroid instanceof Collection) || !skuListAndroid.isEmpty()) {
                                        for (String str4 : skuListAndroid) {
                                            if (((ArrayList) xVar.f23469u).contains(str4)) {
                                                z10 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z10 = false;
                                    if (z10) {
                                    }
                                }
                                arrayList2.add(campaignModel);
                            }
                        }
                    }
                }
                Type type2 = new TypeToken<ArrayList<CampaignModel>>() { // from class: com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchActiveCampaigns$1$1$typeToken$1
                }.getType();
                SharedPreferences sharedPreferences = pn.a.f28723a;
                String h10 = new sf.i().h(arrayList2, type2);
                if (h10 != null) {
                    SharedPreferences.Editor edit = pn.a.f28723a.edit();
                    edit.putString("campaign_list", h10);
                    edit.apply();
                }
                kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onLoad, this.$it, arrayList2, null);
                this.label = 1;
                if (v.S(k1Var, anonymousClass2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e11) {
            LogHelper logHelper3 = LogHelper.INSTANCE;
            str = FireStoreUtilsKt.TAG;
            logHelper3.e(str, e11);
        }
        return hs.k.f19476a;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((FireStoreUtilsKt$fetchActiveCampaigns$1$1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }
}
