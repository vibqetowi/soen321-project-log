package com.ifriend.presentation.features.chatsettings.mappers;

import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import com.ifriend.domain.logic.chat.configuration.ChatsConfiguration;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatType;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Personality;
import com.ifriend.presentation.common.mappers.GenderMapper;
import com.ifriend.presentation.common.mappers.PersonalityMapper;
import com.ifriend.presentation.features.chatsettings.viewmodel.ChatSettingsViewModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatSettingsActionTagsMapperUi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ifriend/presentation/features/chatsettings/mappers/ChatSettingsActionTagsMapperUi;", "", "genderMapper", "Lcom/ifriend/presentation/common/mappers/GenderMapper;", "personalityMapper", "Lcom/ifriend/presentation/common/mappers/PersonalityMapper;", "(Lcom/ifriend/presentation/common/mappers/GenderMapper;Lcom/ifriend/presentation/common/mappers/PersonalityMapper;)V", "map", "", "Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState$ActionTag;", "configuration", "Lcom/ifriend/domain/logic/chat/configuration/ChatsConfiguration;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSettingsActionTagsMapperUi {
    public static final int $stable = 8;
    private final GenderMapper genderMapper;
    private final PersonalityMapper personalityMapper;

    /* compiled from: ChatSettingsActionTagsMapperUi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatType.values().length];
            try {
                iArr[ChatType.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatType.INFLUENCER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChatType.COMMON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public ChatSettingsActionTagsMapperUi(GenderMapper genderMapper, PersonalityMapper personalityMapper) {
        Intrinsics.checkNotNullParameter(genderMapper, "genderMapper");
        Intrinsics.checkNotNullParameter(personalityMapper, "personalityMapper");
        this.genderMapper = genderMapper;
        this.personalityMapper = personalityMapper;
    }

    public final List<ChatSettingsViewModel.UiState.ActionTag> map(ChatsConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        ChatInfo chatInfo = configuration.getChatInfo();
        ChatConfig chatConfig = configuration.getChatConfig();
        int i = WhenMappings.$EnumSwitchMapping$0[chatInfo.getChatType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return CollectionsKt.emptyList();
                }
                throw new NoWhenBranchMatchedException();
            } else if (chatConfig == null) {
                return CollectionsKt.emptyList();
            } else {
                ChatConfig.Profile profile = chatConfig.getProfile();
                List createListBuilder = CollectionsKt.createListBuilder();
                Gender gender = profile.getGender();
                if (gender != null) {
                    createListBuilder.add(new ChatSettingsViewModel.UiState.ActionTag(this.genderMapper.map(gender), false, ChatSettingsViewModel.UiState.ActionTag.ActionType.GENDER));
                }
                Birthday birthday = profile.getBirthday();
                if (birthday != null) {
                    createListBuilder.add(new ChatSettingsViewModel.UiState.ActionTag(String.valueOf(birthday.getAge()), false, ChatSettingsViewModel.UiState.ActionTag.ActionType.AGE));
                }
                Personality personality = profile.getPersonality();
                if (personality != null) {
                    createListBuilder.add(new ChatSettingsViewModel.UiState.ActionTag(this.personalityMapper.map(personality), false, ChatSettingsViewModel.UiState.ActionTag.ActionType.PERSONALITY));
                }
                return CollectionsKt.build(createListBuilder);
            }
        }
        return CollectionsKt.emptyList();
    }
}
