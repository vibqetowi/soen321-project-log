package com.ifriend.chat.presentation.ui.menu.botProfile;

import androidx.autofill.HintConstants;
import com.ifriend.chat.presentation.ui.chat.presentation.LevelUiModel;
import com.ifriend.domain.media.PlaybackController;
import com.ifriend.domain.models.avatar.GeneratedAvatar;
import com.ifriend.domain.models.levels.LevelInfo;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.BotVoiceConfig;
import com.ifriend.domain.models.profile.bot.Ethnicity;
import com.ifriend.domain.models.profile.bot.Personality;
import com.ifriend.ui.base.mvvm.BaseState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BotProfileState.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 52\u00020\u0001:\u0003456BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u0011HÆ\u0003Jl\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\u0005HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00067"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState;", "Lcom/ifriend/ui/base/mvvm/BaseState;", "name", "", "age", "", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/ifriend/domain/models/profile/Gender;", "ethnicity", "Lcom/ifriend/domain/models/profile/bot/Ethnicity;", "personality", "Lcom/ifriend/domain/models/profile/bot/Personality;", "avatarState", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState$AvatarState;", "voice", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState$Voice;", "levelInfo", "Lcom/ifriend/chat/presentation/ui/chat/presentation/LevelUiModel;", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/ifriend/domain/models/profile/Gender;Lcom/ifriend/domain/models/profile/bot/Ethnicity;Lcom/ifriend/domain/models/profile/bot/Personality;Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState$AvatarState;Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState$Voice;Lcom/ifriend/chat/presentation/ui/chat/presentation/LevelUiModel;)V", "getAge", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAvatarState", "()Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState$AvatarState;", "getEthnicity", "()Lcom/ifriend/domain/models/profile/bot/Ethnicity;", "getGender", "()Lcom/ifriend/domain/models/profile/Gender;", "getLevelInfo", "()Lcom/ifriend/chat/presentation/ui/chat/presentation/LevelUiModel;", "getName", "()Ljava/lang/String;", "getPersonality", "()Lcom/ifriend/domain/models/profile/bot/Personality;", "getVoice", "()Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState$Voice;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/ifriend/domain/models/profile/Gender;Lcom/ifriend/domain/models/profile/bot/Ethnicity;Lcom/ifriend/domain/models/profile/bot/Personality;Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState$AvatarState;Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState$Voice;Lcom/ifriend/chat/presentation/ui/chat/presentation/LevelUiModel;)Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState;", "equals", "", "other", "", "hashCode", "toString", "AvatarState", "Companion", "Voice", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotProfileState extends BaseState {
    private final Integer age;
    private final AvatarState avatarState;
    private final Ethnicity ethnicity;
    private final Gender gender;
    private final LevelUiModel levelInfo;
    private final String name;
    private final Personality personality;
    private final Voice voice;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final String component1() {
        return this.name;
    }

    public final Integer component2() {
        return this.age;
    }

    public final Gender component3() {
        return this.gender;
    }

    public final Ethnicity component4() {
        return this.ethnicity;
    }

    public final Personality component5() {
        return this.personality;
    }

    public final AvatarState component6() {
        return this.avatarState;
    }

    public final Voice component7() {
        return this.voice;
    }

    public final LevelUiModel component8() {
        return this.levelInfo;
    }

    public final BotProfileState copy(String str, Integer num, Gender gender, Ethnicity ethnicity, Personality personality, AvatarState avatarState, Voice voice, LevelUiModel levelInfo) {
        Intrinsics.checkNotNullParameter(levelInfo, "levelInfo");
        return new BotProfileState(str, num, gender, ethnicity, personality, avatarState, voice, levelInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BotProfileState) {
            BotProfileState botProfileState = (BotProfileState) obj;
            return Intrinsics.areEqual(this.name, botProfileState.name) && Intrinsics.areEqual(this.age, botProfileState.age) && this.gender == botProfileState.gender && this.ethnicity == botProfileState.ethnicity && this.personality == botProfileState.personality && Intrinsics.areEqual(this.avatarState, botProfileState.avatarState) && Intrinsics.areEqual(this.voice, botProfileState.voice) && Intrinsics.areEqual(this.levelInfo, botProfileState.levelInfo);
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.age;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Gender gender = this.gender;
        int hashCode3 = (hashCode2 + (gender == null ? 0 : gender.hashCode())) * 31;
        Ethnicity ethnicity = this.ethnicity;
        int hashCode4 = (hashCode3 + (ethnicity == null ? 0 : ethnicity.hashCode())) * 31;
        Personality personality = this.personality;
        int hashCode5 = (hashCode4 + (personality == null ? 0 : personality.hashCode())) * 31;
        AvatarState avatarState = this.avatarState;
        int hashCode6 = (hashCode5 + (avatarState == null ? 0 : avatarState.hashCode())) * 31;
        Voice voice = this.voice;
        return ((hashCode6 + (voice != null ? voice.hashCode() : 0)) * 31) + this.levelInfo.hashCode();
    }

    public String toString() {
        String str = this.name;
        Integer num = this.age;
        Gender gender = this.gender;
        Ethnicity ethnicity = this.ethnicity;
        Personality personality = this.personality;
        AvatarState avatarState = this.avatarState;
        Voice voice = this.voice;
        LevelUiModel levelUiModel = this.levelInfo;
        return "BotProfileState(name=" + str + ", age=" + num + ", gender=" + gender + ", ethnicity=" + ethnicity + ", personality=" + personality + ", avatarState=" + avatarState + ", voice=" + voice + ", levelInfo=" + levelUiModel + ")";
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getAge() {
        return this.age;
    }

    public final Gender getGender() {
        return this.gender;
    }

    public final Ethnicity getEthnicity() {
        return this.ethnicity;
    }

    public final Personality getPersonality() {
        return this.personality;
    }

    public final AvatarState getAvatarState() {
        return this.avatarState;
    }

    public final Voice getVoice() {
        return this.voice;
    }

    public final LevelUiModel getLevelInfo() {
        return this.levelInfo;
    }

    public BotProfileState(String str, Integer num, Gender gender, Ethnicity ethnicity, Personality personality, AvatarState avatarState, Voice voice, LevelUiModel levelInfo) {
        Intrinsics.checkNotNullParameter(levelInfo, "levelInfo");
        this.name = str;
        this.age = num;
        this.gender = gender;
        this.ethnicity = ethnicity;
        this.personality = personality;
        this.avatarState = avatarState;
        this.voice = voice;
        this.levelInfo = levelInfo;
    }

    /* compiled from: BotProfileState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState$Companion;", "", "()V", "initial", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState;", "levelInfo", "Lcom/ifriend/domain/models/levels/LevelInfo;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BotProfileState initial(LevelInfo levelInfo) {
            LevelUiModel levelUiModel;
            if (levelInfo != null) {
                levelUiModel = new LevelUiModel.Show(levelInfo.getLevel(), levelInfo.getCurrentPoints(), levelInfo.getNextLevelPoints());
            } else {
                levelUiModel = LevelUiModel.NotLoaded.INSTANCE;
            }
            return new BotProfileState(null, null, null, null, null, null, null, levelUiModel);
        }
    }

    /* compiled from: BotProfileState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState$AvatarState;", "", "generatedAvatar", "Lcom/ifriend/domain/models/avatar/GeneratedAvatar;", "isGenerating", "", "isVideoEnabled", "isAnimationFeatureEnabled", "isVideoGenerationInProgress", "isPlaceholder", "(Lcom/ifriend/domain/models/avatar/GeneratedAvatar;ZZZZZ)V", "getGeneratedAvatar", "()Lcom/ifriend/domain/models/avatar/GeneratedAvatar;", "setGeneratedAvatar", "(Lcom/ifriend/domain/models/avatar/GeneratedAvatar;)V", "()Z", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class AvatarState {
        public static final int $stable = 8;
        private GeneratedAvatar generatedAvatar;
        private final boolean isAnimationFeatureEnabled;
        private final boolean isGenerating;
        private final boolean isPlaceholder;
        private final boolean isVideoEnabled;
        private final boolean isVideoGenerationInProgress;

        public AvatarState(GeneratedAvatar generatedAvatar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.generatedAvatar = generatedAvatar;
            this.isGenerating = z;
            this.isVideoEnabled = z2;
            this.isAnimationFeatureEnabled = z3;
            this.isVideoGenerationInProgress = z4;
            this.isPlaceholder = z5;
        }

        public final GeneratedAvatar getGeneratedAvatar() {
            return this.generatedAvatar;
        }

        public final void setGeneratedAvatar(GeneratedAvatar generatedAvatar) {
            this.generatedAvatar = generatedAvatar;
        }

        public final boolean isGenerating() {
            return this.isGenerating;
        }

        public final boolean isVideoEnabled() {
            return this.isVideoEnabled;
        }

        public final boolean isAnimationFeatureEnabled() {
            return this.isAnimationFeatureEnabled;
        }

        public final boolean isVideoGenerationInProgress() {
            return this.isVideoGenerationInProgress;
        }

        public final boolean isPlaceholder() {
            return this.isPlaceholder;
        }
    }

    /* compiled from: BotProfileState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState$Voice;", "", "isPlayingAvailable", "", "sampleUrl", "", "playbackController", "Lcom/ifriend/domain/media/PlaybackController;", "config", "Lcom/ifriend/domain/models/profile/bot/BotVoiceConfig;", "(ZLjava/lang/String;Lcom/ifriend/domain/media/PlaybackController;Lcom/ifriend/domain/models/profile/bot/BotVoiceConfig;)V", "getConfig", "()Lcom/ifriend/domain/models/profile/bot/BotVoiceConfig;", "()Z", "getPlaybackController", "()Lcom/ifriend/domain/media/PlaybackController;", "getSampleUrl", "()Ljava/lang/String;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Voice {
        public static final int $stable = 8;
        private final BotVoiceConfig config;
        private final boolean isPlayingAvailable;
        private final PlaybackController playbackController;
        private final String sampleUrl;

        public Voice(boolean z, String sampleUrl, PlaybackController playbackController, BotVoiceConfig config) {
            Intrinsics.checkNotNullParameter(sampleUrl, "sampleUrl");
            Intrinsics.checkNotNullParameter(playbackController, "playbackController");
            Intrinsics.checkNotNullParameter(config, "config");
            this.isPlayingAvailable = z;
            this.sampleUrl = sampleUrl;
            this.playbackController = playbackController;
            this.config = config;
        }

        public final boolean isPlayingAvailable() {
            return this.isPlayingAvailable;
        }

        public final String getSampleUrl() {
            return this.sampleUrl;
        }

        public final PlaybackController getPlaybackController() {
            return this.playbackController;
        }

        public final BotVoiceConfig getConfig() {
            return this.config;
        }
    }
}
