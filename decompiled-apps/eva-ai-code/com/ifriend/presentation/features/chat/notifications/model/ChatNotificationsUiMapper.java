package com.ifriend.presentation.features.chat.notifications.model;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ifriend.common_utils.encoder.SextingEncoder;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatar;
import com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAvailableState;
import com.ifriend.domain.models.chat.notifications.ChatNotification;
import com.ifriend.domain.newChat.chat.models.MessageInfo;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import com.ifriend.ui.theme.AppIcons;
import com.ifriend.ui.theme.icons.calls.IconCallKt;
import com.ifriend.ui.theme.icons.message.IconImageMessageKt;
import com.ifriend.ui.theme.icons.message.IconVoiceMessageKt;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatNotificationsUiMapper.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0096\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\rH\u0096\u0001J\u0013\u0010\u0011\u001a\u00020\r2\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0097\u0001J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0001\u0010\f\u001a\u00020\rH\u0096\u0001J\u0013\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\rH\u0096\u0001J\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00172\b\b\u0001\u0010\f\u001a\u00020\rH\u0096\u0001J\u001b\u0010\u0018\u001a\u00020\u00072\b\b\u0001\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0096\u0001J4\u0010\u0018\u001a\u00020\u00072\b\b\u0001\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c\"\u00020\u001dH\u0096\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00072\b\b\u0001\u0010\u0019\u001a\u00020\rH\u0096\u0001J,\u0010\u001f\u001a\u00020\u00072\b\b\u0001\u0010\u0019\u001a\u00020\r2\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c\"\u00020\u001dH\u0096\u0001¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\b\b\u0001\u0010\u0019\u001a\u00020\rH\u0096\u0001J+\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010)R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/ifriend/presentation/features/chat/notifications/model/ChatNotificationsUiMapper;", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "resourceProvider", "chatMessageAccessInteractor", "Lcom/ifriend/domain/logic/chat/messages/ChatMessageAccessInteractor;", "(Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/domain/logic/chat/messages/ChatMessageAccessInteractor;)V", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "getPackageName", "()Ljava/lang/String;", "getBoolean", "", "resId", "", "getColorStateList", "Landroid/content/res/ColorStateList;", "colorResId", "getDimensionPixelSize", "dimenRes", "getFont", "Landroid/graphics/Typeface;", "getInteger", "getIntegerArray", "", "getQuantityString", "res", FirebaseAnalytics.Param.QUANTITY, "args", "", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "map", "Lcom/ifriend/presentation/features/chat/notifications/model/ChatNotificationUi;", "order", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/ifriend/domain/models/chat/notifications/ChatNotification;", "avatarState", "Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar;", "(ILcom/ifriend/domain/models/chat/notifications/ChatNotification;Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatNotificationsUiMapper implements ResourceProvider {
    public static final int $stable = 8;
    private final ChatMessageAccessInteractor chatMessageAccessInteractor;
    private final ResourceProvider resourceProvider;

    /* compiled from: ChatNotificationsUiMapper.kt */
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

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public boolean getBoolean(int i) {
        return this.resourceProvider.getBoolean(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public ColorStateList getColorStateList(int i) {
        return this.resourceProvider.getColorStateList(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public int getDimensionPixelSize(int i) {
        return this.resourceProvider.getDimensionPixelSize(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public Typeface getFont(int i) {
        return this.resourceProvider.getFont(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public int getInteger(int i) {
        return this.resourceProvider.getInteger(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public List<Integer> getIntegerArray(int i) {
        return this.resourceProvider.getIntegerArray(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getPackageName() {
        return this.resourceProvider.getPackageName();
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getQuantityString(int i, int i2) {
        return this.resourceProvider.getQuantityString(i, i2);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getQuantityString(int i, int i2, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.resourceProvider.getQuantityString(i, i2, args);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getString(int i) {
        return this.resourceProvider.getString(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getString(int i, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.resourceProvider.getString(i, args);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public List<String> getStringArray(int i) {
        return this.resourceProvider.getStringArray(i);
    }

    @Inject
    public ChatNotificationsUiMapper(ResourceProvider resourceProvider, ChatMessageAccessInteractor chatMessageAccessInteractor) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(chatMessageAccessInteractor, "chatMessageAccessInteractor");
        this.resourceProvider = resourceProvider;
        this.chatMessageAccessInteractor = chatMessageAccessInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object map(int i, ChatNotification chatNotification, GeneratedChatAvatar generatedChatAvatar, Continuation<? super ChatNotificationUi> continuation) {
        ChatNotificationsUiMapper$map$1 chatNotificationsUiMapper$map$1;
        int i2;
        String avatarUrl;
        ChatNotificationsUiMapper chatNotificationsUiMapper;
        String str;
        ChatNotification chatNotification2;
        int i3;
        ChatNotification.Content content;
        String string;
        ChatNotification.Content content2;
        ImageVector iconCall;
        if (continuation instanceof ChatNotificationsUiMapper$map$1) {
            chatNotificationsUiMapper$map$1 = (ChatNotificationsUiMapper$map$1) continuation;
            if ((chatNotificationsUiMapper$map$1.label & Integer.MIN_VALUE) != 0) {
                chatNotificationsUiMapper$map$1.label -= Integer.MIN_VALUE;
                Object obj = chatNotificationsUiMapper$map$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = chatNotificationsUiMapper$map$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (generatedChatAvatar instanceof GeneratedChatAvatar.ImageAvatar) {
                        avatarUrl = ((GeneratedChatAvatar.ImageAvatar) generatedChatAvatar).getImageAvatarUri();
                    } else {
                        if (!(generatedChatAvatar instanceof GeneratedChatAvatar.Empty)) {
                            if (generatedChatAvatar instanceof GeneratedChatAvatar.VideoAvatar) {
                                GeneratedChatAvatar.VideoAvatar videoAvatar = (GeneratedChatAvatar.VideoAvatar) generatedChatAvatar;
                                int i4 = WhenMappings.$EnumSwitchMapping$0[videoAvatar.getGeneratingState().ordinal()];
                                if (i4 != 1 && i4 == 2) {
                                    avatarUrl = videoAvatar.getImageAvatarUri();
                                }
                            } else {
                                avatarUrl = chatNotification.getAvatarUrl();
                            }
                        }
                        avatarUrl = "";
                    }
                    ChatMessageAccessInteractor chatMessageAccessInteractor = this.chatMessageAccessInteractor;
                    MessageInfo messageInfo = chatNotification.getMessageInfo();
                    chatNotificationsUiMapper$map$1.L$0 = this;
                    chatNotificationsUiMapper$map$1.L$1 = chatNotification;
                    chatNotificationsUiMapper$map$1.L$2 = avatarUrl;
                    chatNotificationsUiMapper$map$1.I$0 = i;
                    chatNotificationsUiMapper$map$1.label = 1;
                    obj = chatMessageAccessInteractor.getMessageAvailableState(messageInfo, chatNotificationsUiMapper$map$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatNotificationsUiMapper = this;
                    str = avatarUrl;
                    chatNotification2 = chatNotification;
                    i3 = i;
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    int i5 = chatNotificationsUiMapper$map$1.I$0;
                    chatNotification2 = (ChatNotification) chatNotificationsUiMapper$map$1.L$1;
                    chatNotificationsUiMapper = (ChatNotificationsUiMapper) chatNotificationsUiMapper$map$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    i3 = i5;
                    str = (String) chatNotificationsUiMapper$map$1.L$2;
                }
                boolean isAvailable = ((ChatMessageAvailableState) obj).isAvailable();
                String id = chatNotification2.getId();
                String chatId = chatNotification2.getChatId();
                String name = chatNotification2.getName();
                content = chatNotification2.getContent();
                if (!(content instanceof ChatNotification.Content.Audio)) {
                    string = chatNotificationsUiMapper.getString(R.string.in_app_notifications__audio);
                } else if (content instanceof ChatNotification.Content.Image) {
                    string = chatNotificationsUiMapper.getString(R.string.in_app_notifications__photo);
                } else if (content instanceof ChatNotification.Content.Text) {
                    if (isAvailable) {
                        string = ((ChatNotification.Content.Text) content).getText();
                    } else {
                        string = SextingEncoder.INSTANCE.encode(((ChatNotification.Content.Text) content).getText());
                    }
                } else if (content instanceof ChatNotification.Content.EndCall) {
                    string = chatNotificationsUiMapper.getString(com.ifriend.ui.R.string.common__end_call);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                String str2 = string;
                boolean z = ((chatNotification2.getContent() instanceof ChatNotification.Content.Text) || isAvailable) ? false : true;
                content2 = chatNotification2.getContent();
                if (!(content2 instanceof ChatNotification.Content.Audio)) {
                    iconCall = IconVoiceMessageKt.getIconVoiceMessage(AppIcons.INSTANCE);
                } else if (content2 instanceof ChatNotification.Content.Image) {
                    iconCall = IconImageMessageKt.getIconImageMessage(AppIcons.INSTANCE);
                } else {
                    iconCall = content2 instanceof ChatNotification.Content.EndCall ? IconCallKt.getIconCall(AppIcons.INSTANCE) : null;
                }
                return new ChatNotificationUi(id, chatId, name, str2, z, str, iconCall, i3);
            }
        }
        chatNotificationsUiMapper$map$1 = new ChatNotificationsUiMapper$map$1(this, continuation);
        Object obj2 = chatNotificationsUiMapper$map$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = chatNotificationsUiMapper$map$1.label;
        if (i2 != 0) {
        }
        boolean isAvailable2 = ((ChatMessageAvailableState) obj2).isAvailable();
        String id2 = chatNotification2.getId();
        String chatId2 = chatNotification2.getChatId();
        String name2 = chatNotification2.getName();
        content = chatNotification2.getContent();
        if (!(content instanceof ChatNotification.Content.Audio)) {
        }
        String str22 = string;
        if (chatNotification2.getContent() instanceof ChatNotification.Content.Text) {
        }
        content2 = chatNotification2.getContent();
        if (!(content2 instanceof ChatNotification.Content.Audio)) {
        }
        return new ChatNotificationUi(id2, chatId2, name2, str22, z, str, iconCall, i3);
    }
}
