package com.ifriend.domain.onboarding.interactor;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import com.ifriend.domain.models.common.ChatInterestsType;
import com.ifriend.domain.models.onboarding.OnboardingAnswers;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.onboarding.model.OnboardingStep;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: OnboardingInteractor.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u001f\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\f\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u000b0\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/ifriend/domain/onboarding/interactor/OnboardingInteractor;", "", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "onboardingAnswersRepository", "Lcom/ifriend/domain/data/onboarding/OnboardingAnswersRepository;", "(Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/data/BotRepository;Lcom/ifriend/domain/data/onboarding/OnboardingAnswersRepository;)V", "activeSteps", "", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "areAllOnboardingStepsPassed", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOnboardingSteps", "", "addIfActive", "", "", "step", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingInteractor {
    private final Set<OnboardingStep> activeSteps;
    private final BotRepository botRepository;
    private final OnboardingAnswersRepository onboardingAnswersRepository;
    private final UserRepository userRepository;

    @Inject
    public OnboardingInteractor(UserRepository userRepository, BotRepository botRepository, OnboardingAnswersRepository onboardingAnswersRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        Intrinsics.checkNotNullParameter(onboardingAnswersRepository, "onboardingAnswersRepository");
        this.userRepository = userRepository;
        this.botRepository = botRepository;
        this.onboardingAnswersRepository = onboardingAnswersRepository;
        this.activeSteps = SetsKt.mutableSetOf(OnboardingStep.UserName.INSTANCE, OnboardingStep.Welcome.INSTANCE, OnboardingStep.LetUsKnowMore.INSTANCE, OnboardingStep.UserGender.INSTANCE, OnboardingStep.AskEveryDay.INSTANCE, OnboardingStep.BotVoice.INSTANCE, OnboardingStep.BotPersonality.INSTANCE, OnboardingStep.UserInterests.INSTANCE, OnboardingStep.UserBirthDate.INSTANCE, OnboardingStep.LastStep.INSTANCE, OnboardingStep.BotName.INSTANCE, OnboardingStep.BotAge.INSTANCE, OnboardingStep.BotGender.INSTANCE, OnboardingStep.BotsPager.INSTANCE, OnboardingStep.Awesome.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object areAllOnboardingStepsPassed(Continuation<? super Boolean> continuation) {
        OnboardingInteractor$areAllOnboardingStepsPassed$1 onboardingInteractor$areAllOnboardingStepsPassed$1;
        int i;
        if (continuation instanceof OnboardingInteractor$areAllOnboardingStepsPassed$1) {
            onboardingInteractor$areAllOnboardingStepsPassed$1 = (OnboardingInteractor$areAllOnboardingStepsPassed$1) continuation;
            if ((onboardingInteractor$areAllOnboardingStepsPassed$1.label & Integer.MIN_VALUE) != 0) {
                onboardingInteractor$areAllOnboardingStepsPassed$1.label -= Integer.MIN_VALUE;
                Object obj = onboardingInteractor$areAllOnboardingStepsPassed$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = onboardingInteractor$areAllOnboardingStepsPassed$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    onboardingInteractor$areAllOnboardingStepsPassed$1.label = 1;
                    obj = getOnboardingSteps(onboardingInteractor$areAllOnboardingStepsPassed$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(((Set) obj).isEmpty());
            }
        }
        onboardingInteractor$areAllOnboardingStepsPassed$1 = new OnboardingInteractor$areAllOnboardingStepsPassed$1(this, continuation);
        Object obj2 = onboardingInteractor$areAllOnboardingStepsPassed$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = onboardingInteractor$areAllOnboardingStepsPassed$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(((Set) obj2).isEmpty());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getOnboardingSteps(Continuation<? super Set<? extends OnboardingStep>> continuation) {
        OnboardingInteractor$getOnboardingSteps$1 onboardingInteractor$getOnboardingSteps$1;
        int i;
        boolean z;
        User currentUser;
        List list;
        List list2;
        OnboardingInteractor onboardingInteractor;
        OnboardingAnswers onboardingAnswers;
        List<ChatInterestsType> interests;
        String selectedBot;
        if (continuation instanceof OnboardingInteractor$getOnboardingSteps$1) {
            onboardingInteractor$getOnboardingSteps$1 = (OnboardingInteractor$getOnboardingSteps$1) continuation;
            if ((onboardingInteractor$getOnboardingSteps$1.label & Integer.MIN_VALUE) != 0) {
                onboardingInteractor$getOnboardingSteps$1.label -= Integer.MIN_VALUE;
                Object obj = onboardingInteractor$getOnboardingSteps$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = onboardingInteractor$getOnboardingSteps$1.label;
                z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    currentUser = this.userRepository.getCurrentUser();
                    if (currentUser == null) {
                        return this.activeSteps;
                    }
                    List createListBuilder = CollectionsKt.createListBuilder();
                    Bot currentBot = this.botRepository.getCurrentBot();
                    if ((currentBot != null ? currentBot.getGender() : null) == null) {
                        addIfActive(createListBuilder, OnboardingStep.BotGender.INSTANCE);
                    }
                    if ((currentBot != null ? currentBot.getName() : null) == null) {
                        addIfActive(createListBuilder, OnboardingStep.BotName.INSTANCE);
                    }
                    if ((currentBot != null ? currentBot.getBirthday() : null) == null) {
                        addIfActive(createListBuilder, OnboardingStep.BotAge.INSTANCE);
                    }
                    if (currentBot != null && currentBot.getPersonality() == null) {
                        addIfActive(createListBuilder, OnboardingStep.BotPersonality.INSTANCE);
                    }
                    OnboardingAnswersRepository onboardingAnswersRepository = this.onboardingAnswersRepository;
                    onboardingInteractor$getOnboardingSteps$1.L$0 = this;
                    onboardingInteractor$getOnboardingSteps$1.L$1 = currentUser;
                    onboardingInteractor$getOnboardingSteps$1.L$2 = createListBuilder;
                    onboardingInteractor$getOnboardingSteps$1.L$3 = createListBuilder;
                    onboardingInteractor$getOnboardingSteps$1.label = 1;
                    Object updateOnboardingAnswers = onboardingAnswersRepository.updateOnboardingAnswers(onboardingInteractor$getOnboardingSteps$1);
                    if (updateOnboardingAnswers == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = createListBuilder;
                    list2 = list;
                    obj = updateOnboardingAnswers;
                    onboardingInteractor = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    list = (List) onboardingInteractor$getOnboardingSteps$1.L$3;
                    list2 = (List) onboardingInteractor$getOnboardingSteps$1.L$2;
                    currentUser = (User) onboardingInteractor$getOnboardingSteps$1.L$1;
                    onboardingInteractor = (OnboardingInteractor) onboardingInteractor$getOnboardingSteps$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                onboardingAnswers = (OnboardingAnswers) obj;
                if (onboardingAnswers.getRetention() == null) {
                    onboardingInteractor.addIfActive(list, OnboardingStep.AskEveryDay.INSTANCE);
                }
                if (onboardingAnswers.getAiVoice() == null) {
                    onboardingInteractor.addIfActive(list, OnboardingStep.BotVoice.INSTANCE);
                }
                interests = onboardingAnswers.getInterests();
                if (interests != null || interests.isEmpty()) {
                    onboardingInteractor.addIfActive(list, OnboardingStep.UserInterests.INSTANCE);
                }
                selectedBot = onboardingAnswers.getSelectedBot();
                if (selectedBot != null && selectedBot.length() != 0) {
                    z = false;
                }
                if (z) {
                    onboardingInteractor.addIfActive(list, OnboardingStep.BotsPager.INSTANCE);
                }
                if (currentUser.getName() == null) {
                    List list3 = list;
                    onboardingInteractor.addIfActive(list3, OnboardingStep.UserName.INSTANCE);
                    onboardingInteractor.addIfActive(list3, OnboardingStep.Welcome.INSTANCE);
                    onboardingInteractor.addIfActive(list3, OnboardingStep.LetUsKnowMore.INSTANCE);
                }
                if (currentUser.getBirthday() == null) {
                    onboardingInteractor.addIfActive(list, OnboardingStep.UserBirthDate.INSTANCE);
                }
                if (currentUser.getGender() == null) {
                    onboardingInteractor.addIfActive(list, OnboardingStep.UserGender.INSTANCE);
                }
                if (list.size() > 0) {
                    onboardingInteractor.addIfActive(list, OnboardingStep.Awesome.INSTANCE);
                }
                return CollectionsKt.toSet(CollectionsKt.sortedWith(CollectionsKt.build(list2), new Comparator() { // from class: com.ifriend.domain.onboarding.interactor.OnboardingInteractor$getOnboardingSteps$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Integer.valueOf(((OnboardingStep) t).getOrder()), Integer.valueOf(((OnboardingStep) t2).getOrder()));
                    }
                }));
            }
        }
        onboardingInteractor$getOnboardingSteps$1 = new OnboardingInteractor$getOnboardingSteps$1(this, continuation);
        Object obj2 = onboardingInteractor$getOnboardingSteps$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = onboardingInteractor$getOnboardingSteps$1.label;
        z = true;
        if (i != 0) {
        }
        onboardingAnswers = (OnboardingAnswers) obj2;
        if (onboardingAnswers.getRetention() == null) {
        }
        if (onboardingAnswers.getAiVoice() == null) {
        }
        interests = onboardingAnswers.getInterests();
        if (interests != null || interests.isEmpty()) {
        }
        selectedBot = onboardingAnswers.getSelectedBot();
        if (selectedBot != null) {
            z = false;
        }
        if (z) {
        }
        if (currentUser.getName() == null) {
        }
        if (currentUser.getBirthday() == null) {
        }
        if (currentUser.getGender() == null) {
        }
        if (list.size() > 0) {
        }
        return CollectionsKt.toSet(CollectionsKt.sortedWith(CollectionsKt.build(list2), new Comparator() { // from class: com.ifriend.domain.onboarding.interactor.OnboardingInteractor$getOnboardingSteps$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((OnboardingStep) t).getOrder()), Integer.valueOf(((OnboardingStep) t2).getOrder()));
            }
        }));
    }

    private final void addIfActive(Collection<OnboardingStep> collection, OnboardingStep onboardingStep) {
        if (this.activeSteps.contains(onboardingStep)) {
            collection.add(onboardingStep);
        }
    }
}
