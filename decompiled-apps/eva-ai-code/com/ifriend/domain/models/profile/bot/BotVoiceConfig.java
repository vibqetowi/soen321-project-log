package com.ifriend.domain.models.profile.bot;

import androidx.autofill.HintConstants;
import com.ifriend.domain.models.profile.Gender;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: BotVoiceConfig.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\t\u0010\u001b\u001a\u00020\nHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/ifriend/domain/models/profile/bot/BotVoiceConfig;", "", "currentSpeakerId", "", "speakers", "Lcom/ifriend/domain/models/profile/bot/Speakers;", "(Ljava/lang/String;Lcom/ifriend/domain/models/profile/bot/Speakers;)V", "getCurrentSpeakerId", "()Ljava/lang/String;", "currentVoiceIndex", "", "getCurrentVoiceIndex", "()I", "getSpeakers", "()Lcom/ifriend/domain/models/profile/bot/Speakers;", "component1", "component2", "copy", "equals", "", "other", "getAvailableVoices", "", "Lcom/ifriend/domain/models/profile/bot/BotVoice;", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/ifriend/domain/models/profile/Gender;", "getCurrentVoice", "hashCode", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotVoiceConfig {
    private final String currentSpeakerId;
    private final Speakers speakers;

    /* compiled from: BotVoiceConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ BotVoiceConfig copy$default(BotVoiceConfig botVoiceConfig, String str, Speakers speakers, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botVoiceConfig.currentSpeakerId;
        }
        if ((i & 2) != 0) {
            speakers = botVoiceConfig.speakers;
        }
        return botVoiceConfig.copy(str, speakers);
    }

    public final String component1() {
        return this.currentSpeakerId;
    }

    public final Speakers component2() {
        return this.speakers;
    }

    public final BotVoiceConfig copy(String currentSpeakerId, Speakers speakers) {
        Intrinsics.checkNotNullParameter(currentSpeakerId, "currentSpeakerId");
        Intrinsics.checkNotNullParameter(speakers, "speakers");
        return new BotVoiceConfig(currentSpeakerId, speakers);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BotVoiceConfig) {
            BotVoiceConfig botVoiceConfig = (BotVoiceConfig) obj;
            return Intrinsics.areEqual(this.currentSpeakerId, botVoiceConfig.currentSpeakerId) && Intrinsics.areEqual(this.speakers, botVoiceConfig.speakers);
        }
        return false;
    }

    public int hashCode() {
        return (this.currentSpeakerId.hashCode() * 31) + this.speakers.hashCode();
    }

    public String toString() {
        String str = this.currentSpeakerId;
        Speakers speakers = this.speakers;
        return "BotVoiceConfig(currentSpeakerId=" + str + ", speakers=" + speakers + ")";
    }

    public BotVoiceConfig(String currentSpeakerId, Speakers speakers) {
        Intrinsics.checkNotNullParameter(currentSpeakerId, "currentSpeakerId");
        Intrinsics.checkNotNullParameter(speakers, "speakers");
        this.currentSpeakerId = currentSpeakerId;
        this.speakers = speakers;
    }

    public final String getCurrentSpeakerId() {
        return this.currentSpeakerId;
    }

    public final Speakers getSpeakers() {
        return this.speakers;
    }

    public final int getCurrentVoiceIndex() {
        int i = 0;
        for (BotVoice botVoice : CollectionsKt.plus((Collection) this.speakers.getMal(), (Iterable) this.speakers.getFem())) {
            if (Intrinsics.areEqual(botVoice.getId(), this.currentSpeakerId)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final BotVoice getCurrentVoice(Gender gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        List<BotVoice> availableVoices = getAvailableVoices(gender);
        Object obj = null;
        if (availableVoices != null) {
            Iterator<T> it = availableVoices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((BotVoice) next).getId(), this.currentSpeakerId)) {
                    obj = next;
                    break;
                }
            }
            return (BotVoice) obj;
        }
        return null;
    }

    public final List<BotVoice> getAvailableVoices(Gender gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        int i = WhenMappings.$EnumSwitchMapping$0[gender.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.speakers.getFem();
            }
            return this.speakers.getFem();
        }
        return this.speakers.getMal();
    }
}
