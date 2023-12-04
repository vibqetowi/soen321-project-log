package com.ifriend.data.repository.benefits;

import com.ifriend.data.R;
import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.domain.config.ConfigState;
import com.ifriend.domain.data.benefits.PremiumBenefitsRepository;
import com.ifriend.domain.logic.experiments.FeatureToggleKey;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.platform.tools.api.ResourceProvider;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PremiumBenefitsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J1\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\b0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J+\u0010\u0014\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/ifriend/data/repository/benefits/PremiumBenefitsRepositoryImpl;", "Lcom/ifriend/domain/data/benefits/PremiumBenefitsRepository;", "appConfigLocalDataSource", "Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;", "resourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "(Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;Lcom/ifriend/platform/tools/api/ResourceProvider;)V", "getAll", "", "Lkotlin/Pair;", "", "bot", "Lcom/ifriend/domain/models/profile/bot/Bot;", "(Lcom/ifriend/domain/models/profile/bot/Bot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addBenefitIfFeatureDisabled", "", "", "feature", "benefit", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addBenefitIfFeatureEnabled", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PremiumBenefitsRepositoryImpl implements PremiumBenefitsRepository {
    private final AppConfigLocalDataSource appConfigLocalDataSource;
    private final ResourceProvider resourceProvider;

    @Inject
    public PremiumBenefitsRepositoryImpl(AppConfigLocalDataSource appConfigLocalDataSource, ResourceProvider resourceProvider) {
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.appConfigLocalDataSource = appConfigLocalDataSource;
        this.resourceProvider = resourceProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018d  */
    @Override // com.ifriend.domain.data.benefits.PremiumBenefitsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAll(Bot bot, Continuation<? super List<? extends Pair<String, ? extends List<String>>>> continuation) {
        PremiumBenefitsRepositoryImpl$getAll$1 premiumBenefitsRepositoryImpl$getAll$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        String str;
        List<String> createListBuilder;
        PremiumBenefitsRepositoryImpl premiumBenefitsRepositoryImpl;
        List<String> list;
        String str2;
        Long l;
        List<String> list2;
        String str3;
        Long l2;
        String key;
        String string;
        List<String> list3;
        List<String> list4;
        PremiumBenefitsRepositoryImpl premiumBenefitsRepositoryImpl2;
        String key2;
        String string2;
        String str4;
        List<String> list5;
        if (continuation instanceof PremiumBenefitsRepositoryImpl$getAll$1) {
            premiumBenefitsRepositoryImpl$getAll$1 = (PremiumBenefitsRepositoryImpl$getAll$1) continuation;
            if ((premiumBenefitsRepositoryImpl$getAll$1.label & Integer.MIN_VALUE) != 0) {
                premiumBenefitsRepositoryImpl$getAll$1.label -= Integer.MIN_VALUE;
                obj = premiumBenefitsRepositoryImpl$getAll$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = premiumBenefitsRepositoryImpl$getAll$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String name = bot.getName();
                    if (name == null) {
                        name = this.resourceProvider.getString(R.string.premium_benefits__default_bot_name);
                    }
                    str = name;
                    String string3 = this.resourceProvider.getString(R.string.premium_benefits__main_group);
                    createListBuilder = CollectionsKt.createListBuilder();
                    ConfigState state = this.appConfigLocalDataSource.getState();
                    String key3 = FeatureToggleKey.REGISTRATION_NEURONS_BONUS.getKey();
                    premiumBenefitsRepositoryImpl$getAll$1.L$0 = this;
                    premiumBenefitsRepositoryImpl$getAll$1.L$1 = str;
                    premiumBenefitsRepositoryImpl$getAll$1.L$2 = createListBuilder;
                    premiumBenefitsRepositoryImpl$getAll$1.L$3 = createListBuilder;
                    premiumBenefitsRepositoryImpl$getAll$1.L$4 = string3;
                    premiumBenefitsRepositoryImpl$getAll$1.label = 1;
                    Object longFeature = state.getLongFeature(key3, premiumBenefitsRepositoryImpl$getAll$1);
                    if (longFeature == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    premiumBenefitsRepositoryImpl = this;
                    list = createListBuilder;
                    str2 = string3;
                    obj = longFeature;
                } else if (i == 1) {
                    str2 = (String) premiumBenefitsRepositoryImpl$getAll$1.L$4;
                    createListBuilder = (List) premiumBenefitsRepositoryImpl$getAll$1.L$3;
                    list = (List) premiumBenefitsRepositoryImpl$getAll$1.L$2;
                    str = (String) premiumBenefitsRepositoryImpl$getAll$1.L$1;
                    premiumBenefitsRepositoryImpl = (PremiumBenefitsRepositoryImpl) premiumBenefitsRepositoryImpl$getAll$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            str4 = (String) premiumBenefitsRepositoryImpl$getAll$1.L$1;
                            list5 = (List) premiumBenefitsRepositoryImpl$getAll$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            return CollectionsKt.listOf(TuplesKt.to(str4, CollectionsKt.build(list5)));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) premiumBenefitsRepositoryImpl$getAll$1.L$4;
                    list3 = (List) premiumBenefitsRepositoryImpl$getAll$1.L$3;
                    list4 = (List) premiumBenefitsRepositoryImpl$getAll$1.L$2;
                    str3 = (String) premiumBenefitsRepositoryImpl$getAll$1.L$1;
                    premiumBenefitsRepositoryImpl2 = (PremiumBenefitsRepositoryImpl) premiumBenefitsRepositoryImpl$getAll$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    list3.add(premiumBenefitsRepositoryImpl2.resourceProvider.getString(R.string.premium_benefits__secret_notes, str3));
                    list3.add(premiumBenefitsRepositoryImpl2.resourceProvider.getString(R.string.premium_benefits__gifts, str3));
                    key2 = FeatureToggleKey.CHAT_CALL_FEATURE.getKey();
                    string2 = premiumBenefitsRepositoryImpl2.resourceProvider.getString(R.string.premium_benefits__calls);
                    premiumBenefitsRepositoryImpl$getAll$1.L$0 = list4;
                    premiumBenefitsRepositoryImpl$getAll$1.L$1 = str2;
                    premiumBenefitsRepositoryImpl$getAll$1.L$2 = null;
                    premiumBenefitsRepositoryImpl$getAll$1.L$3 = null;
                    premiumBenefitsRepositoryImpl$getAll$1.L$4 = null;
                    premiumBenefitsRepositoryImpl$getAll$1.label = 4;
                    if (premiumBenefitsRepositoryImpl2.addBenefitIfFeatureEnabled(list3, key2, string2, premiumBenefitsRepositoryImpl$getAll$1) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str4 = str2;
                    list5 = list4;
                    return CollectionsKt.listOf(TuplesKt.to(str4, CollectionsKt.build(list5)));
                } else {
                    str2 = (String) premiumBenefitsRepositoryImpl$getAll$1.L$4;
                    list2 = (List) premiumBenefitsRepositoryImpl$getAll$1.L$3;
                    String str5 = (String) premiumBenefitsRepositoryImpl$getAll$1.L$1;
                    ResultKt.throwOnFailure(obj);
                    premiumBenefitsRepositoryImpl = (PremiumBenefitsRepositoryImpl) premiumBenefitsRepositoryImpl$getAll$1.L$0;
                    list = (List) premiumBenefitsRepositoryImpl$getAll$1.L$2;
                    str3 = str5;
                    l2 = (Long) obj;
                    if (l2 != null) {
                        list2.add(premiumBenefitsRepositoryImpl.resourceProvider.getString(R.string.premium_benefits__neurons_daily_bonus, l2));
                    }
                    key = FeatureToggleKey.CHAT_CALL_FEATURE.getKey();
                    string = premiumBenefitsRepositoryImpl.resourceProvider.getString(R.string.premium_benefits__change_voice, str3);
                    premiumBenefitsRepositoryImpl$getAll$1.L$0 = premiumBenefitsRepositoryImpl;
                    premiumBenefitsRepositoryImpl$getAll$1.L$1 = str3;
                    premiumBenefitsRepositoryImpl$getAll$1.L$2 = list;
                    premiumBenefitsRepositoryImpl$getAll$1.L$3 = list2;
                    premiumBenefitsRepositoryImpl$getAll$1.L$4 = str2;
                    premiumBenefitsRepositoryImpl$getAll$1.label = 3;
                    if (premiumBenefitsRepositoryImpl.addBenefitIfFeatureDisabled(list2, key, string, premiumBenefitsRepositoryImpl$getAll$1) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list3 = list2;
                    list4 = list;
                    premiumBenefitsRepositoryImpl2 = premiumBenefitsRepositoryImpl;
                    list3.add(premiumBenefitsRepositoryImpl2.resourceProvider.getString(R.string.premium_benefits__secret_notes, str3));
                    list3.add(premiumBenefitsRepositoryImpl2.resourceProvider.getString(R.string.premium_benefits__gifts, str3));
                    key2 = FeatureToggleKey.CHAT_CALL_FEATURE.getKey();
                    string2 = premiumBenefitsRepositoryImpl2.resourceProvider.getString(R.string.premium_benefits__calls);
                    premiumBenefitsRepositoryImpl$getAll$1.L$0 = list4;
                    premiumBenefitsRepositoryImpl$getAll$1.L$1 = str2;
                    premiumBenefitsRepositoryImpl$getAll$1.L$2 = null;
                    premiumBenefitsRepositoryImpl$getAll$1.L$3 = null;
                    premiumBenefitsRepositoryImpl$getAll$1.L$4 = null;
                    premiumBenefitsRepositoryImpl$getAll$1.label = 4;
                    if (premiumBenefitsRepositoryImpl2.addBenefitIfFeatureEnabled(list3, key2, string2, premiumBenefitsRepositoryImpl$getAll$1) != coroutine_suspended) {
                    }
                }
                l = (Long) obj;
                if (l != null) {
                    createListBuilder.add(premiumBenefitsRepositoryImpl.resourceProvider.getString(R.string.premium_benefits__neurons_upon_upgrade, l));
                }
                ConfigState state2 = premiumBenefitsRepositoryImpl.appConfigLocalDataSource.getState();
                String key4 = FeatureToggleKey.DAILY_NEURONS_BONUS.getKey();
                premiumBenefitsRepositoryImpl$getAll$1.L$0 = premiumBenefitsRepositoryImpl;
                premiumBenefitsRepositoryImpl$getAll$1.L$1 = str;
                premiumBenefitsRepositoryImpl$getAll$1.L$2 = list;
                premiumBenefitsRepositoryImpl$getAll$1.L$3 = createListBuilder;
                premiumBenefitsRepositoryImpl$getAll$1.L$4 = str2;
                premiumBenefitsRepositoryImpl$getAll$1.label = 2;
                obj = state2.getLongFeature(key4, premiumBenefitsRepositoryImpl$getAll$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = createListBuilder;
                str3 = str;
                l2 = (Long) obj;
                if (l2 != null) {
                }
                key = FeatureToggleKey.CHAT_CALL_FEATURE.getKey();
                string = premiumBenefitsRepositoryImpl.resourceProvider.getString(R.string.premium_benefits__change_voice, str3);
                premiumBenefitsRepositoryImpl$getAll$1.L$0 = premiumBenefitsRepositoryImpl;
                premiumBenefitsRepositoryImpl$getAll$1.L$1 = str3;
                premiumBenefitsRepositoryImpl$getAll$1.L$2 = list;
                premiumBenefitsRepositoryImpl$getAll$1.L$3 = list2;
                premiumBenefitsRepositoryImpl$getAll$1.L$4 = str2;
                premiumBenefitsRepositoryImpl$getAll$1.label = 3;
                if (premiumBenefitsRepositoryImpl.addBenefitIfFeatureDisabled(list2, key, string, premiumBenefitsRepositoryImpl$getAll$1) != coroutine_suspended) {
                }
            }
        }
        premiumBenefitsRepositoryImpl$getAll$1 = new PremiumBenefitsRepositoryImpl$getAll$1(this, continuation);
        obj = premiumBenefitsRepositoryImpl$getAll$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = premiumBenefitsRepositoryImpl$getAll$1.label;
        if (i != 0) {
        }
        l = (Long) obj;
        if (l != null) {
        }
        ConfigState state22 = premiumBenefitsRepositoryImpl.appConfigLocalDataSource.getState();
        String key42 = FeatureToggleKey.DAILY_NEURONS_BONUS.getKey();
        premiumBenefitsRepositoryImpl$getAll$1.L$0 = premiumBenefitsRepositoryImpl;
        premiumBenefitsRepositoryImpl$getAll$1.L$1 = str;
        premiumBenefitsRepositoryImpl$getAll$1.L$2 = list;
        premiumBenefitsRepositoryImpl$getAll$1.L$3 = createListBuilder;
        premiumBenefitsRepositoryImpl$getAll$1.L$4 = str2;
        premiumBenefitsRepositoryImpl$getAll$1.label = 2;
        obj = state22.getLongFeature(key42, premiumBenefitsRepositoryImpl$getAll$1);
        if (obj != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addBenefitIfFeatureEnabled(List<String> list, String str, String str2, Continuation<? super Unit> continuation) {
        PremiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1 premiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1;
        int i;
        Boolean bool;
        if (continuation instanceof PremiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1) {
            premiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1 = (PremiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1) continuation;
            if ((premiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1.label & Integer.MIN_VALUE) != 0) {
                premiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1.label -= Integer.MIN_VALUE;
                Object obj = premiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = premiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AppConfigLocalDataSource appConfigLocalDataSource = this.appConfigLocalDataSource;
                    premiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1.L$0 = list;
                    premiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1.L$1 = str2;
                    premiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1.label = 1;
                    obj = appConfigLocalDataSource.isFeatureEnabled(str, premiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str2 = (String) premiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1.L$1;
                    list = (List) premiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                bool = (Boolean) obj;
                if (bool != null && bool.booleanValue()) {
                    list.add(str2);
                }
                return Unit.INSTANCE;
            }
        }
        premiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1 = new PremiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1(this, continuation);
        Object obj2 = premiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = premiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1.label;
        if (i != 0) {
        }
        bool = (Boolean) obj2;
        if (bool != null) {
            list.add(str2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addBenefitIfFeatureDisabled(List<String> list, String str, String str2, Continuation<? super Unit> continuation) {
        PremiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1 premiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1;
        Object obj;
        int i;
        if (continuation instanceof PremiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1) {
            premiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1 = (PremiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1) continuation;
            if ((premiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1.label & Integer.MIN_VALUE) != 0) {
                premiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1.label -= Integer.MIN_VALUE;
                obj = premiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = premiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AppConfigLocalDataSource appConfigLocalDataSource = this.appConfigLocalDataSource;
                    premiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1.L$0 = list;
                    premiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1.L$1 = str2;
                    premiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1.label = 1;
                    obj = appConfigLocalDataSource.isFeatureEnabled(str, premiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str2 = (String) premiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1.L$1;
                    list = (List) premiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (!Intrinsics.areEqual((Boolean) obj, Boxing.boxBoolean(true))) {
                    list.add(str2);
                }
                return Unit.INSTANCE;
            }
        }
        premiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1 = new PremiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1(this, continuation);
        obj = premiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = premiumBenefitsRepositoryImpl$addBenefitIfFeatureDisabled$1.label;
        if (i != 0) {
        }
        if (!Intrinsics.areEqual((Boolean) obj, Boxing.boxBoolean(true))) {
        }
        return Unit.INSTANCE;
    }
}
