package com.ifriend.presentation.features.profile.header.mappers;

import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatar;
import com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatAvatarMapper.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/presentation/features/profile/header/mappers/ChatAvatarMapper;", "", "()V", "map", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState;", "avatar", "Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatAvatarMapper {
    public static final int $stable = 0;

    /* compiled from: ChatAvatarMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GeneratedChatAvatar.VideoAvatar.GeneratingState.values().length];
            try {
                iArr[GeneratedChatAvatar.VideoAvatar.GeneratingState.GENERATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GeneratedChatAvatar.VideoAvatar.GeneratingState.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final AnimatedAvatarViewState map(GeneratedChatAvatar avatar) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        if (Intrinsics.areEqual(avatar, GeneratedChatAvatar.Empty.INSTANCE)) {
            return new AnimatedAvatarViewState.Placeholder(0, AnimatedAvatarViewState.Placeholder.Presentation.Small.INSTANCE, 1, null);
        }
        if (avatar instanceof GeneratedChatAvatar.ImageAvatar) {
            GeneratedChatAvatar.ImageAvatar imageAvatar = (GeneratedChatAvatar.ImageAvatar) avatar;
            return new AnimatedAvatarViewState.StaticAvatar(imageAvatar.getImageAvatarUri(), imageAvatar.getAvatarId(), 0, 4, null);
        } else if (avatar instanceof GeneratedChatAvatar.VideoAvatar) {
            GeneratedChatAvatar.VideoAvatar videoAvatar = (GeneratedChatAvatar.VideoAvatar) avatar;
            int i = WhenMappings.$EnumSwitchMapping$0[videoAvatar.getGeneratingState().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new AnimatedAvatarViewState.PlayingVideoAvatar(videoAvatar.getImageAvatarUri(), videoAvatar.getAvatarId(), 0, videoAvatar.getVideoUri(), false, 4, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new AnimatedAvatarViewState.GeneratingVideoAvatar(videoAvatar.getImageAvatarUri(), videoAvatar.getAvatarId(), 0, false, 4, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
