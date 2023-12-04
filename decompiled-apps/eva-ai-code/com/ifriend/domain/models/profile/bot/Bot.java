package com.ifriend.domain.models.profile.bot;

import androidx.autofill.HintConstants;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.Gender;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: Bot.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003JQ\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00062"}, d2 = {"Lcom/ifriend/domain/models/profile/bot/Bot;", "", "name", "", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/ifriend/domain/models/profile/Gender;", "birthday", "Lcom/ifriend/domain/models/profile/Birthday;", "ethnicity", "Lcom/ifriend/domain/models/profile/bot/Ethnicity;", "personality", "Lcom/ifriend/domain/models/profile/bot/Personality;", "voiceConfig", "Lcom/ifriend/domain/models/profile/bot/BotVoiceConfig;", "(Ljava/lang/String;Lcom/ifriend/domain/models/profile/Gender;Lcom/ifriend/domain/models/profile/Birthday;Lcom/ifriend/domain/models/profile/bot/Ethnicity;Lcom/ifriend/domain/models/profile/bot/Personality;Lcom/ifriend/domain/models/profile/bot/BotVoiceConfig;)V", "availableVoices", "", "Lcom/ifriend/domain/models/profile/bot/BotVoice;", "getAvailableVoices", "()Ljava/util/List;", "getBirthday", "()Lcom/ifriend/domain/models/profile/Birthday;", "currentVoice", "getCurrentVoice", "()Lcom/ifriend/domain/models/profile/bot/BotVoice;", "getEthnicity", "()Lcom/ifriend/domain/models/profile/bot/Ethnicity;", "getGender", "()Lcom/ifriend/domain/models/profile/Gender;", "getName", "()Ljava/lang/String;", "getPersonality", "()Lcom/ifriend/domain/models/profile/bot/Personality;", "getVoiceConfig", "()Lcom/ifriend/domain/models/profile/bot/BotVoiceConfig;", "setVoiceConfig", "(Lcom/ifriend/domain/models/profile/bot/BotVoiceConfig;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Bot {
    private final Birthday birthday;
    private final Ethnicity ethnicity;
    private final Gender gender;
    private final String name;
    private final Personality personality;
    private BotVoiceConfig voiceConfig;

    public static /* synthetic */ Bot copy$default(Bot bot, String str, Gender gender, Birthday birthday, Ethnicity ethnicity, Personality personality, BotVoiceConfig botVoiceConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bot.name;
        }
        if ((i & 2) != 0) {
            gender = bot.gender;
        }
        Gender gender2 = gender;
        if ((i & 4) != 0) {
            birthday = bot.birthday;
        }
        Birthday birthday2 = birthday;
        if ((i & 8) != 0) {
            ethnicity = bot.ethnicity;
        }
        Ethnicity ethnicity2 = ethnicity;
        if ((i & 16) != 0) {
            personality = bot.personality;
        }
        Personality personality2 = personality;
        if ((i & 32) != 0) {
            botVoiceConfig = bot.voiceConfig;
        }
        return bot.copy(str, gender2, birthday2, ethnicity2, personality2, botVoiceConfig);
    }

    public final String component1() {
        return this.name;
    }

    public final Gender component2() {
        return this.gender;
    }

    public final Birthday component3() {
        return this.birthday;
    }

    public final Ethnicity component4() {
        return this.ethnicity;
    }

    public final Personality component5() {
        return this.personality;
    }

    public final BotVoiceConfig component6() {
        return this.voiceConfig;
    }

    public final Bot copy(String str, Gender gender, Birthday birthday, Ethnicity ethnicity, Personality personality, BotVoiceConfig botVoiceConfig) {
        return new Bot(str, gender, birthday, ethnicity, personality, botVoiceConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Bot) {
            Bot bot = (Bot) obj;
            return Intrinsics.areEqual(this.name, bot.name) && this.gender == bot.gender && Intrinsics.areEqual(this.birthday, bot.birthday) && this.ethnicity == bot.ethnicity && this.personality == bot.personality && Intrinsics.areEqual(this.voiceConfig, bot.voiceConfig);
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Gender gender = this.gender;
        int hashCode2 = (hashCode + (gender == null ? 0 : gender.hashCode())) * 31;
        Birthday birthday = this.birthday;
        int hashCode3 = (hashCode2 + (birthday == null ? 0 : birthday.hashCode())) * 31;
        Ethnicity ethnicity = this.ethnicity;
        int hashCode4 = (hashCode3 + (ethnicity == null ? 0 : ethnicity.hashCode())) * 31;
        Personality personality = this.personality;
        int hashCode5 = (hashCode4 + (personality == null ? 0 : personality.hashCode())) * 31;
        BotVoiceConfig botVoiceConfig = this.voiceConfig;
        return hashCode5 + (botVoiceConfig != null ? botVoiceConfig.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        Gender gender = this.gender;
        Birthday birthday = this.birthday;
        Ethnicity ethnicity = this.ethnicity;
        Personality personality = this.personality;
        BotVoiceConfig botVoiceConfig = this.voiceConfig;
        return "Bot(name=" + str + ", gender=" + gender + ", birthday=" + birthday + ", ethnicity=" + ethnicity + ", personality=" + personality + ", voiceConfig=" + botVoiceConfig + ")";
    }

    public Bot(String str, Gender gender, Birthday birthday, Ethnicity ethnicity, Personality personality, BotVoiceConfig botVoiceConfig) {
        this.name = str;
        this.gender = gender;
        this.birthday = birthday;
        this.ethnicity = ethnicity;
        this.personality = personality;
        this.voiceConfig = botVoiceConfig;
    }

    public /* synthetic */ Bot(String str, Gender gender, Birthday birthday, Ethnicity ethnicity, Personality personality, BotVoiceConfig botVoiceConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, gender, birthday, (i & 8) != 0 ? null : ethnicity, (i & 16) != 0 ? null : personality, (i & 32) != 0 ? null : botVoiceConfig);
    }

    public final String getName() {
        return this.name;
    }

    public final Gender getGender() {
        return this.gender;
    }

    public final Birthday getBirthday() {
        return this.birthday;
    }

    public final Ethnicity getEthnicity() {
        return this.ethnicity;
    }

    public final Personality getPersonality() {
        return this.personality;
    }

    public final BotVoiceConfig getVoiceConfig() {
        return this.voiceConfig;
    }

    public final void setVoiceConfig(BotVoiceConfig botVoiceConfig) {
        this.voiceConfig = botVoiceConfig;
    }

    public final BotVoice getCurrentVoice() {
        BotVoiceConfig botVoiceConfig;
        Gender gender = this.gender;
        if (gender == null || (botVoiceConfig = this.voiceConfig) == null) {
            return null;
        }
        return botVoiceConfig.getCurrentVoice(gender);
    }

    public final List<BotVoice> getAvailableVoices() {
        Gender gender = this.gender;
        if (gender != null) {
            BotVoiceConfig botVoiceConfig = this.voiceConfig;
            List<BotVoice> availableVoices = botVoiceConfig != null ? botVoiceConfig.getAvailableVoices(gender) : null;
            if (availableVoices != null) {
                return availableVoices;
            }
        }
        return CollectionsKt.emptyList();
    }
}
