package com.ifriend.domain.data;

import androidx.autofill.HintConstants;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Ethnicity;
import com.ifriend.domain.models.profile.bot.Personality;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;
/* compiled from: BotRepository.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0013H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0019\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0019\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/ifriend/domain/data/BotRepository;", "Lcom/ifriend/domain/data/BotProvider;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setBirthday", "birthday", "Lcom/ifriend/domain/models/profile/Birthday;", "(Lcom/ifriend/domain/models/profile/Birthday;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setEthnicity", "ethnicity", "Lcom/ifriend/domain/models/profile/bot/Ethnicity;", "(Lcom/ifriend/domain/models/profile/bot/Ethnicity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setGender", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/ifriend/domain/models/profile/Gender;", "(Lcom/ifriend/domain/models/profile/Gender;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setName", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPersonality", "personality", "Lcom/ifriend/domain/models/profile/bot/Personality;", "(Lcom/ifriend/domain/models/profile/bot/Personality;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setVoice", "voiceId", "updateGender", "updatePersonality", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BotRepository extends BotProvider {
    Object clear(Continuation<? super Unit> continuation);

    Object setBirthday(Birthday birthday, Continuation<? super Unit> continuation);

    Object setEthnicity(Ethnicity ethnicity, Continuation<? super Unit> continuation);

    Object setGender(Gender gender, Continuation<? super Unit> continuation);

    Object setName(String str, Continuation<? super Unit> continuation);

    Object setPersonality(Personality personality, Continuation<? super Unit> continuation);

    Object setVoice(String str, Continuation<? super Unit> continuation);

    Object updateGender(Gender gender, Continuation<? super Unit> continuation);

    Object updatePersonality(Personality personality, Continuation<? super Unit> continuation);
}
