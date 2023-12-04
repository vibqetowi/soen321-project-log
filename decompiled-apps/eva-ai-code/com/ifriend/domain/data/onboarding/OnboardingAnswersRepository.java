package com.ifriend.domain.data.onboarding;

import com.ifriend.domain.models.common.ChatInterestsType;
import com.ifriend.domain.models.onboarding.AiCharacter;
import com.ifriend.domain.models.onboarding.AiVoice;
import com.ifriend.domain.models.onboarding.FavoriteTopic;
import com.ifriend.domain.models.onboarding.OnboardingAnswers;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;
/* compiled from: OnboardingAnswersRepository.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0011\u0010\u001b\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0019H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 H¦@ø\u0001\u0000¢\u0006\u0002\u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/ifriend/domain/data/onboarding/OnboardingAnswersRepository;", "", "getOnboardingAnswers", "Lcom/ifriend/domain/models/onboarding/OnboardingAnswers;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAiCharacter", "", "aiCharacter", "Lcom/ifriend/domain/models/onboarding/AiCharacter;", "(Lcom/ifriend/domain/models/onboarding/AiCharacter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAiVoice", "aiVoice", "Lcom/ifriend/domain/models/onboarding/AiVoice;", "(Lcom/ifriend/domain/models/onboarding/AiVoice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFavoriteTopic", "favoriteTopic", "Lcom/ifriend/domain/models/onboarding/FavoriteTopic;", "(Lcom/ifriend/domain/models/onboarding/FavoriteTopic;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateInterests", "interests", "", "Lcom/ifriend/domain/models/common/ChatInterestsType;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateJokes", "jokes", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOnboardingAnswers", "updateRetentions", "retention", "updateSelectBot", "botId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OnboardingAnswersRepository {
    Object getOnboardingAnswers(Continuation<? super OnboardingAnswers> continuation);

    Object updateAiCharacter(AiCharacter aiCharacter, Continuation<? super Unit> continuation);

    Object updateAiVoice(AiVoice aiVoice, Continuation<? super Unit> continuation);

    Object updateFavoriteTopic(FavoriteTopic favoriteTopic, Continuation<? super Unit> continuation);

    Object updateInterests(List<? extends ChatInterestsType> list, Continuation<? super Unit> continuation);

    Object updateJokes(boolean z, Continuation<? super Unit> continuation);

    Object updateOnboardingAnswers(Continuation<? super OnboardingAnswers> continuation);

    Object updateRetentions(boolean z, Continuation<? super Unit> continuation);

    Object updateSelectBot(String str, Continuation<? super Unit> continuation);
}
