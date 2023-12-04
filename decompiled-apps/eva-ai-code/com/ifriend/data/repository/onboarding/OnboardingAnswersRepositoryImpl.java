package com.ifriend.data.repository.onboarding;

import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.data.networking.api.onboarding.OnboardingApiDelegate;
import com.ifriend.data.networking.api.onboarding.models.OnboardingAnswersResponse;
import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import com.ifriend.domain.models.common.ChatInterestsType;
import com.ifriend.domain.models.onboarding.AiCharacter;
import com.ifriend.domain.models.onboarding.AiVoice;
import com.ifriend.domain.models.onboarding.FavoriteTopic;
import com.ifriend.domain.models.onboarding.OnboardingAnswers;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingAnswersRepositoryImpl.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012H\u0002J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!J\u001f\u0010\"\u001a\u00020\u00162\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J\u0019\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010'J\u0011\u0010(\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0019\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010'J\u0019\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010-R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/ifriend/data/repository/onboarding/OnboardingAnswersRepositoryImpl;", "Lcom/ifriend/domain/data/onboarding/OnboardingAnswersRepository;", "apiDelegate", "Lcom/ifriend/data/networking/api/onboarding/OnboardingApiDelegate;", "(Lcom/ifriend/data/networking/api/onboarding/OnboardingApiDelegate;)V", "CACHED_KEY", "", "kotlin.jvm.PlatformType", "cachedAnswersSource", "Lcom/ifriend/data/common/InMemoryCachedSource;", "Lcom/ifriend/domain/models/onboarding/OnboardingAnswers;", "getCachedAnswersSource", "()Lcom/ifriend/data/common/InMemoryCachedSource;", "cachedAnswersSource$delegate", "Lkotlin/Lazy;", "getOnboardingAnswers", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseInterests", "", "Lcom/ifriend/domain/models/common/ChatInterestsType;", "interests", "updateAiCharacter", "", "aiCharacter", "Lcom/ifriend/domain/models/onboarding/AiCharacter;", "(Lcom/ifriend/domain/models/onboarding/AiCharacter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAiVoice", "aiVoice", "Lcom/ifriend/domain/models/onboarding/AiVoice;", "(Lcom/ifriend/domain/models/onboarding/AiVoice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFavoriteTopic", "favoriteTopic", "Lcom/ifriend/domain/models/onboarding/FavoriteTopic;", "(Lcom/ifriend/domain/models/onboarding/FavoriteTopic;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateInterests", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateJokes", "jokes", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOnboardingAnswers", "updateRetentions", "retention", "updateSelectBot", "botId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingAnswersRepositoryImpl implements OnboardingAnswersRepository {
    private final String CACHED_KEY;
    private final OnboardingApiDelegate apiDelegate;
    private final Lazy cachedAnswersSource$delegate;

    /* compiled from: OnboardingAnswersRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class EntriesMappings {
        public static final /* synthetic */ EnumEntries<ChatInterestsType> entries$0 = EnumEntriesKt.enumEntries(ChatInterestsType.values());
    }

    public OnboardingAnswersRepositoryImpl(OnboardingApiDelegate apiDelegate) {
        Intrinsics.checkNotNullParameter(apiDelegate, "apiDelegate");
        this.apiDelegate = apiDelegate;
        this.CACHED_KEY = "OnboardingAnswersRepositoryImpl";
        this.cachedAnswersSource$delegate = LazyKt.lazy(new OnboardingAnswersRepositoryImpl$cachedAnswersSource$2(this));
    }

    private final InMemoryCachedSource<String, OnboardingAnswers> getCachedAnswersSource() {
        return (InMemoryCachedSource) this.cachedAnswersSource$delegate.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(2:3|(17:5|6|(1:(1:(2:10|11)(2:13|14))(1:15))(2:42|(1:44)(1:45))|16|17|18|(10:20|22|23|(6:25|26|27|(1:29)|31|(1:33)(2:34|35))|38|26|27|(0)|31|(0)(0))|40|22|23|(0)|38|26|27|(0)|31|(0)(0)))|46|6|(0)(0)|16|17|18|(0)|40|22|23|(0)|38|26|27|(0)|31|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[Catch: Exception -> 0x0069, TRY_LEAVE, TryCatch #1 {Exception -> 0x0069, blocks: (B:21:0x005e, B:23:0x0064), top: B:44:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[Catch: Exception -> 0x0075, TRY_LEAVE, TryCatch #2 {Exception -> 0x0075, blocks: (B:26:0x006a, B:28:0x0070), top: B:46:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[Catch: Exception -> 0x0080, TRY_LEAVE, TryCatch #0 {Exception -> 0x0080, blocks: (B:31:0x0076, B:33:0x007c), top: B:42:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    @Override // com.ifriend.domain.data.onboarding.OnboardingAnswersRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateOnboardingAnswers(Continuation<? super OnboardingAnswers> continuation) {
        OnboardingAnswersRepositoryImpl$updateOnboardingAnswers$1 onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1;
        Object coroutine_suspended;
        int i;
        OnboardingAnswersRepositoryImpl onboardingAnswersRepositoryImpl;
        AiVoice aiVoice;
        FavoriteTopic favoriteTopic;
        String aiCharacter;
        String favoriteTopic2;
        String aiVoice2;
        if (continuation instanceof OnboardingAnswersRepositoryImpl$updateOnboardingAnswers$1) {
            onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1 = (OnboardingAnswersRepositoryImpl$updateOnboardingAnswers$1) continuation;
            if ((onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1.label & Integer.MIN_VALUE) != 0) {
                onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1.label -= Integer.MIN_VALUE;
                Object obj = onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    OnboardingApiDelegate onboardingApiDelegate = this.apiDelegate;
                    onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1.L$0 = this;
                    onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1.label = 1;
                    obj = onboardingApiDelegate.getOnboardingAnswers(onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    onboardingAnswersRepositoryImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        OnboardingAnswers onboardingAnswers = (OnboardingAnswers) onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        return onboardingAnswers;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    onboardingAnswersRepositoryImpl = (OnboardingAnswersRepositoryImpl) onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                OnboardingAnswersResponse onboardingAnswersResponse = (OnboardingAnswersResponse) obj;
                Boolean retention = onboardingAnswersResponse.getRetention();
                Boolean jokes = onboardingAnswersResponse.getJokes();
                AiCharacter aiCharacter2 = null;
                aiVoice2 = onboardingAnswersResponse.getAiVoice();
                if (aiVoice2 != null) {
                    aiVoice = AiVoice.valueOf(aiVoice2);
                    favoriteTopic2 = onboardingAnswersResponse.getFavoriteTopic();
                    if (favoriteTopic2 != null) {
                        favoriteTopic = FavoriteTopic.valueOf(favoriteTopic2);
                        aiCharacter = onboardingAnswersResponse.getAiCharacter();
                        if (aiCharacter != null) {
                            aiCharacter2 = AiCharacter.valueOf(aiCharacter);
                        }
                        OnboardingAnswers onboardingAnswers2 = new OnboardingAnswers(retention, jokes, aiVoice, favoriteTopic, aiCharacter2, onboardingAnswersRepositoryImpl.parseInterests(onboardingAnswersResponse.getInterests()), onboardingAnswersResponse.getSelectedBot());
                        InMemoryCachedSource<String, OnboardingAnswers> cachedAnswersSource = onboardingAnswersRepositoryImpl.getCachedAnswersSource();
                        String CACHED_KEY = onboardingAnswersRepositoryImpl.CACHED_KEY;
                        Intrinsics.checkNotNullExpressionValue(CACHED_KEY, "CACHED_KEY");
                        onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1.L$0 = onboardingAnswers2;
                        onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1.label = 2;
                        return cachedAnswersSource.replace(CACHED_KEY, onboardingAnswers2, onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1) != coroutine_suspended ? coroutine_suspended : onboardingAnswers2;
                    }
                    favoriteTopic = null;
                    aiCharacter = onboardingAnswersResponse.getAiCharacter();
                    if (aiCharacter != null) {
                    }
                    OnboardingAnswers onboardingAnswers22 = new OnboardingAnswers(retention, jokes, aiVoice, favoriteTopic, aiCharacter2, onboardingAnswersRepositoryImpl.parseInterests(onboardingAnswersResponse.getInterests()), onboardingAnswersResponse.getSelectedBot());
                    InMemoryCachedSource<String, OnboardingAnswers> cachedAnswersSource2 = onboardingAnswersRepositoryImpl.getCachedAnswersSource();
                    String CACHED_KEY2 = onboardingAnswersRepositoryImpl.CACHED_KEY;
                    Intrinsics.checkNotNullExpressionValue(CACHED_KEY2, "CACHED_KEY");
                    onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1.L$0 = onboardingAnswers22;
                    onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1.label = 2;
                    if (cachedAnswersSource2.replace(CACHED_KEY2, onboardingAnswers22, onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1) != coroutine_suspended) {
                    }
                }
                aiVoice = null;
                favoriteTopic2 = onboardingAnswersResponse.getFavoriteTopic();
                if (favoriteTopic2 != null) {
                }
                favoriteTopic = null;
                aiCharacter = onboardingAnswersResponse.getAiCharacter();
                if (aiCharacter != null) {
                }
                OnboardingAnswers onboardingAnswers222 = new OnboardingAnswers(retention, jokes, aiVoice, favoriteTopic, aiCharacter2, onboardingAnswersRepositoryImpl.parseInterests(onboardingAnswersResponse.getInterests()), onboardingAnswersResponse.getSelectedBot());
                InMemoryCachedSource<String, OnboardingAnswers> cachedAnswersSource22 = onboardingAnswersRepositoryImpl.getCachedAnswersSource();
                String CACHED_KEY22 = onboardingAnswersRepositoryImpl.CACHED_KEY;
                Intrinsics.checkNotNullExpressionValue(CACHED_KEY22, "CACHED_KEY");
                onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1.L$0 = onboardingAnswers222;
                onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1.label = 2;
                if (cachedAnswersSource22.replace(CACHED_KEY22, onboardingAnswers222, onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1) != coroutine_suspended) {
                }
            }
        }
        onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1 = new OnboardingAnswersRepositoryImpl$updateOnboardingAnswers$1(this, continuation);
        Object obj2 = onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1.label;
        if (i != 0) {
        }
        OnboardingAnswersResponse onboardingAnswersResponse2 = (OnboardingAnswersResponse) obj2;
        Boolean retention2 = onboardingAnswersResponse2.getRetention();
        Boolean jokes2 = onboardingAnswersResponse2.getJokes();
        AiCharacter aiCharacter22 = null;
        aiVoice2 = onboardingAnswersResponse2.getAiVoice();
        if (aiVoice2 != null) {
        }
        aiVoice = null;
        favoriteTopic2 = onboardingAnswersResponse2.getFavoriteTopic();
        if (favoriteTopic2 != null) {
        }
        favoriteTopic = null;
        aiCharacter = onboardingAnswersResponse2.getAiCharacter();
        if (aiCharacter != null) {
        }
        OnboardingAnswers onboardingAnswers2222 = new OnboardingAnswers(retention2, jokes2, aiVoice, favoriteTopic, aiCharacter22, onboardingAnswersRepositoryImpl.parseInterests(onboardingAnswersResponse2.getInterests()), onboardingAnswersResponse2.getSelectedBot());
        InMemoryCachedSource<String, OnboardingAnswers> cachedAnswersSource222 = onboardingAnswersRepositoryImpl.getCachedAnswersSource();
        String CACHED_KEY222 = onboardingAnswersRepositoryImpl.CACHED_KEY;
        Intrinsics.checkNotNullExpressionValue(CACHED_KEY222, "CACHED_KEY");
        onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1.L$0 = onboardingAnswers2222;
        onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1.label = 2;
        if (cachedAnswersSource222.replace(CACHED_KEY222, onboardingAnswers2222, onboardingAnswersRepositoryImpl$updateOnboardingAnswers$1) != coroutine_suspended) {
        }
    }

    @Override // com.ifriend.domain.data.onboarding.OnboardingAnswersRepository
    public Object getOnboardingAnswers(Continuation<? super OnboardingAnswers> continuation) {
        InMemoryCachedSource<String, OnboardingAnswers> cachedAnswersSource = getCachedAnswersSource();
        String CACHED_KEY = this.CACHED_KEY;
        Intrinsics.checkNotNullExpressionValue(CACHED_KEY, "CACHED_KEY");
        return cachedAnswersSource.getFromCache(CACHED_KEY);
    }

    private final List<ChatInterestsType> parseInterests(List<String> list) {
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : EntriesMappings.entries$0) {
            if (list.contains(((ChatInterestsType) obj).name())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.ifriend.domain.data.onboarding.OnboardingAnswersRepository
    public Object updateRetentions(boolean z, Continuation<? super Unit> continuation) {
        Object updateRetentions = this.apiDelegate.updateRetentions(z, continuation);
        return updateRetentions == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateRetentions : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.onboarding.OnboardingAnswersRepository
    public Object updateJokes(boolean z, Continuation<? super Unit> continuation) {
        Object updateJokes = this.apiDelegate.updateJokes(z, continuation);
        return updateJokes == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateJokes : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.onboarding.OnboardingAnswersRepository
    public Object updateAiVoice(AiVoice aiVoice, Continuation<? super Unit> continuation) {
        Object updateAiVoice = this.apiDelegate.updateAiVoice(aiVoice.name(), continuation);
        return updateAiVoice == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateAiVoice : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.onboarding.OnboardingAnswersRepository
    public Object updateFavoriteTopic(FavoriteTopic favoriteTopic, Continuation<? super Unit> continuation) {
        Object updateFavoriteTopic = this.apiDelegate.updateFavoriteTopic(favoriteTopic.name(), continuation);
        return updateFavoriteTopic == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateFavoriteTopic : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.onboarding.OnboardingAnswersRepository
    public Object updateAiCharacter(AiCharacter aiCharacter, Continuation<? super Unit> continuation) {
        Object updateAiCharacter = this.apiDelegate.updateAiCharacter(aiCharacter.name(), continuation);
        return updateAiCharacter == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateAiCharacter : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.onboarding.OnboardingAnswersRepository
    public Object updateInterests(List<? extends ChatInterestsType> list, Continuation<? super Unit> continuation) {
        OnboardingApiDelegate onboardingApiDelegate = this.apiDelegate;
        List<? extends ChatInterestsType> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (ChatInterestsType chatInterestsType : list2) {
            arrayList.add(chatInterestsType.name());
        }
        Object updateInterests = onboardingApiDelegate.updateInterests(arrayList, continuation);
        return updateInterests == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateInterests : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.onboarding.OnboardingAnswersRepository
    public Object updateSelectBot(String str, Continuation<? super Unit> continuation) {
        Object updateSelectBot = this.apiDelegate.updateSelectBot(str, continuation);
        return updateSelectBot == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateSelectBot : Unit.INSTANCE;
    }
}
