package com.ifriend.chat.new_chat.list.mapper;

import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.decode.AudioDecodingStatusComponent;
import com.ifriend.chat.new_chat.list.presentationSystems.newMessagesAnimation.NeedToAnimateComponent;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageBotUiModel;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageUiModel;
import com.ifriend.chat.new_chat.list.ui.model.EndCallUi;
import com.ifriend.chat.new_chat.list.ui.model.OlderMessagesUiModel;
import com.ifriend.chat.new_chat.list.ui.model.PaidTextMessageFromBotUi;
import com.ifriend.chat.new_chat.list.ui.model.RegenerateMessageUiModel;
import com.ifriend.chat.new_chat.list.ui.model.TagHolder;
import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_utils.encoder.SextingEncoder;
import com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAvailableState;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import com.ifriend.domain.newChat.chat.systems.dateSeparator.DateSeparatorComponent;
import com.ifriend.domain.newChat.chat.systems.events.processing.ProcessingComponent;
import com.ifriend.domain.newChat.chat.systems.messages.history.loadMore.LoadMoreComponent;
import com.ifriend.domain.newChat.chat.systems.messages.regeneration.RegeneratingComponent;
import com.ifriend.domain.newChat.chat.systems.messages.topics.TopicComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
/* compiled from: ChatEntityToUiModelMapper.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJD\u0010\u001e\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00150 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u001dH\u0002J<\u0010'\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00150 2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u001dH\u0002J*\u0010(\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00150 2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u0010)\u001a\u00020*H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToUiModelMapper;", "", "audioMapper", "Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToAudioUiModelMapper;", "giftMapper", "Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToGiftUiModelMapper;", "textMapper", "Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToTextUiModelMapper;", "dateMapper", "Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToDateUiModelMapper;", "processingMapper", "Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToProcessingUiModelMapper;", "topicSeparatorMapper", "Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToTopicSeparatorUiModelMapper;", "photoMessageMapper", "Lcom/ifriend/chat/new_chat/list/mapper/ChatPhotoMessageMapper;", "messageAccessInteractor", "Lcom/ifriend/domain/logic/chat/messages/ChatMessageAccessInteractor;", "(Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToAudioUiModelMapper;Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToGiftUiModelMapper;Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToTextUiModelMapper;Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToDateUiModelMapper;Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToProcessingUiModelMapper;Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToTopicSeparatorUiModelMapper;Lcom/ifriend/chat/new_chat/list/mapper/ChatPhotoMessageMapper;Lcom/ifriend/domain/logic/chat/messages/ChatMessageAccessInteractor;)V", "map", "", "Lcom/ifriend/chat/new_chat/list/ui/model/TagHolder;", "list", "Lcom/ifriend/common_entities_engine/Entity;", "bot", "Lcom/ifriend/domain/models/profile/bot/Bot;", "chatInfo", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "isMessageRegenerationEnabled", "", "addAudioMessage", "", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", FirebaseAnalytics.Param.CONTENT, "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Audio;", "from", "canRegenerate", "addMessage", "addRegeneratingMessageIfNeed", "availableState", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAvailableState;", "Companion", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatEntityToUiModelMapper {
    private static final String SUFFIX_REGENERATION = "_regeneration";
    private final ChatEntityToAudioUiModelMapper audioMapper;
    private final ChatEntityToDateUiModelMapper dateMapper;
    private final ChatEntityToGiftUiModelMapper giftMapper;
    private final ChatMessageAccessInteractor messageAccessInteractor;
    private final ChatPhotoMessageMapper photoMessageMapper;
    private final ChatEntityToProcessingUiModelMapper processingMapper;
    private final ChatEntityToTextUiModelMapper textMapper;
    private final ChatEntityToTopicSeparatorUiModelMapper topicSeparatorMapper;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Inject
    public ChatEntityToUiModelMapper(ChatEntityToAudioUiModelMapper audioMapper, ChatEntityToGiftUiModelMapper giftMapper, ChatEntityToTextUiModelMapper textMapper, ChatEntityToDateUiModelMapper dateMapper, ChatEntityToProcessingUiModelMapper processingMapper, ChatEntityToTopicSeparatorUiModelMapper topicSeparatorMapper, ChatPhotoMessageMapper photoMessageMapper, ChatMessageAccessInteractor messageAccessInteractor) {
        Intrinsics.checkNotNullParameter(audioMapper, "audioMapper");
        Intrinsics.checkNotNullParameter(giftMapper, "giftMapper");
        Intrinsics.checkNotNullParameter(textMapper, "textMapper");
        Intrinsics.checkNotNullParameter(dateMapper, "dateMapper");
        Intrinsics.checkNotNullParameter(processingMapper, "processingMapper");
        Intrinsics.checkNotNullParameter(topicSeparatorMapper, "topicSeparatorMapper");
        Intrinsics.checkNotNullParameter(photoMessageMapper, "photoMessageMapper");
        Intrinsics.checkNotNullParameter(messageAccessInteractor, "messageAccessInteractor");
        this.audioMapper = audioMapper;
        this.giftMapper = giftMapper;
        this.textMapper = textMapper;
        this.dateMapper = dateMapper;
        this.processingMapper = processingMapper;
        this.topicSeparatorMapper = topicSeparatorMapper;
        this.photoMessageMapper = photoMessageMapper;
        this.messageAccessInteractor = messageAccessInteractor;
    }

    /* compiled from: ChatEntityToUiModelMapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToUiModelMapper$Companion;", "", "()V", "SUFFIX_REGENERATION", "", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final List<TagHolder> map(List<Entity> list, Bot bot, ChatInfo chatInfo, boolean z) {
        Entity entity;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(chatInfo, "chatInfo");
        ArrayList arrayList = new ArrayList();
        ListIterator<Entity> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                entity = null;
                break;
            }
            entity = listIterator.previous();
            Entity entity2 = entity;
            Set<Component> components = entity2.getComponents();
            if (!(components instanceof Collection) || !components.isEmpty()) {
                for (Component component : components) {
                    if (entity2.get(Reflection.getOrCreateKotlinClass(ChatMessage.class)) != null) {
                        z12 = true;
                        continue;
                    } else {
                        z12 = false;
                        continue;
                    }
                    if (z12) {
                        z13 = true;
                        continue;
                        break;
                    }
                }
            }
            z13 = false;
            continue;
            if (z13) {
                break;
            }
        }
        Entity entity3 = entity;
        for (Entity entity4 : list) {
            Set<Component> components2 = entity4.getComponents();
            if (!(components2 instanceof Collection) || !components2.isEmpty()) {
                for (Component component2 : components2) {
                    if (entity4.get(Reflection.getOrCreateKotlinClass(ChatMessage.class)) != null) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            if (z3) {
                addMessage(arrayList, entity4, (ChatMessage) entity4.require(Reflection.getOrCreateKotlinClass(ChatMessage.class)), bot, chatInfo, z && Intrinsics.areEqual(entity4, entity3));
            } else {
                Set<Component> components3 = entity4.getComponents();
                if (!(components3 instanceof Collection) || !components3.isEmpty()) {
                    for (Component component3 : components3) {
                        if (entity4.get(Reflection.getOrCreateKotlinClass(LoadMoreComponent.class)) != null) {
                            z4 = true;
                            continue;
                        } else {
                            z4 = false;
                            continue;
                        }
                        if (z4) {
                            z5 = true;
                            break;
                        }
                    }
                }
                z5 = false;
                if (z5) {
                    arrayList.add(OlderMessagesUiModel.INSTANCE);
                } else {
                    Set<Component> components4 = entity4.getComponents();
                    if (!(components4 instanceof Collection) || !components4.isEmpty()) {
                        for (Component component4 : components4) {
                            if (entity4.get(Reflection.getOrCreateKotlinClass(ProcessingComponent.class)) != null) {
                                z6 = true;
                                continue;
                            } else {
                                z6 = false;
                                continue;
                            }
                            if (z6) {
                                z7 = true;
                                break;
                            }
                        }
                    }
                    z7 = false;
                    if (z7) {
                        arrayList.add(this.processingMapper.map());
                    } else {
                        Set<Component> components5 = entity4.getComponents();
                        if (!(components5 instanceof Collection) || !components5.isEmpty()) {
                            for (Component component5 : components5) {
                                if (entity4.get(Reflection.getOrCreateKotlinClass(TopicComponent.class)) != null) {
                                    z8 = true;
                                    continue;
                                } else {
                                    z8 = false;
                                    continue;
                                }
                                if (z8) {
                                    z9 = true;
                                    break;
                                }
                            }
                        }
                        z9 = false;
                        if (z9) {
                            ChatEntityToTopicSeparatorUiModelMapper chatEntityToTopicSeparatorUiModelMapper = this.topicSeparatorMapper;
                            Component component6 = entity4.get(Reflection.getOrCreateKotlinClass(TopicComponent.class));
                            Intrinsics.checkNotNull(component6);
                            arrayList.add(chatEntityToTopicSeparatorUiModelMapper.map((TopicComponent) component6));
                        } else {
                            Set<Component> components6 = entity4.getComponents();
                            if (!(components6 instanceof Collection) || !components6.isEmpty()) {
                                for (Component component7 : components6) {
                                    if (entity4.get(Reflection.getOrCreateKotlinClass(DateSeparatorComponent.class)) != null) {
                                        z10 = true;
                                        continue;
                                    } else {
                                        z10 = false;
                                        continue;
                                    }
                                    if (z10) {
                                        z11 = true;
                                        break;
                                    }
                                }
                            }
                            z11 = false;
                            if (z11) {
                                ChatEntityToDateUiModelMapper chatEntityToDateUiModelMapper = this.dateMapper;
                                Component component8 = entity4.get(Reflection.getOrCreateKotlinClass(DateSeparatorComponent.class));
                                Intrinsics.checkNotNull(component8);
                                arrayList.add(chatEntityToDateUiModelMapper.map((DateSeparatorComponent) component8));
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final void addMessage(List<TagHolder> list, Entity entity, ChatMessage chatMessage, Bot bot, ChatInfo chatInfo, boolean z) {
        MessageContent content = chatMessage.getContent();
        if (content instanceof MessageContent.EndCall) {
            list.add(EndCallUi.INSTANCE);
        } else if (content instanceof MessageContent.Audio) {
            addAudioMessage(list, chatMessage, (MessageContent.Audio) content, entity, bot, chatInfo, z);
        } else if (content instanceof MessageContent.Image) {
            list.add(this.photoMessageMapper.map(chatMessage, (MessageContent.Image) content, chatInfo));
        } else if (content instanceof MessageContent.Text) {
            ChatMessageAvailableState messageAvailableState = this.messageAccessInteractor.getMessageAvailableState(chatMessage.getInfo(), chatInfo);
            list.add(this.textMapper.map(entity, chatMessage, (MessageContent.Text) content, messageAvailableState));
            if (z) {
                addRegeneratingMessageIfNeed(list, entity, chatMessage, messageAvailableState);
            }
        } else if (content instanceof MessageContent.Gift) {
            list.add(this.giftMapper.mapItem(chatMessage, (MessageContent.Gift) content, entity));
        }
    }

    private final void addAudioMessage(List<TagHolder> list, ChatMessage chatMessage, MessageContent.Audio audio, Entity entity, Bot bot, ChatInfo chatInfo, boolean z) {
        boolean isFromUser = chatMessage.getInfo().isFromUser();
        boolean isAvailable = this.messageAccessInteractor.getMessageAvailableState(chatMessage.getInfo(), chatInfo).isAvailable();
        if (!isFromUser && !isAvailable) {
            String encode = SextingEncoder.INSTANCE.encode(audio.getText());
            NeedToAnimateComponent needToAnimateComponent = (NeedToAnimateComponent) entity.get(Reflection.getOrCreateKotlinClass(NeedToAnimateComponent.class));
            list.add(new PaidTextMessageFromBotUi(ChatMessageKt.getTag(chatMessage), encode, needToAnimateComponent != null, needToAnimateComponent != null ? needToAnimateComponent.getAnimation() : null, ChatMessageKt.getId(chatMessage)));
        } else {
            AudioMessageUiModel map = this.audioMapper.map(chatMessage, audio, entity, bot, chatInfo);
            list.add(map);
            if (map instanceof AudioMessageBotUiModel) {
                AudioMessageBotUiModel audioMessageBotUiModel = (AudioMessageBotUiModel) map;
                if (audioMessageBotUiModel.getDecodingStatus() instanceof AudioDecodingStatusComponent.DecodingStatus.Decoded) {
                    list.add(this.audioMapper.mapDecodedModel(chatMessage, (AudioDecodingStatusComponent.DecodingStatus.Decoded) audioMessageBotUiModel.getDecodingStatus()));
                }
            }
        }
        ChatMessageAvailableState messageAvailableState = this.messageAccessInteractor.getMessageAvailableState(chatMessage.getInfo(), chatInfo);
        if (z) {
            addRegeneratingMessageIfNeed(list, entity, chatMessage, messageAvailableState);
        }
    }

    private final void addRegeneratingMessageIfNeed(List<TagHolder> list, Entity entity, ChatMessage chatMessage, ChatMessageAvailableState chatMessageAvailableState) {
        boolean z;
        boolean z2;
        Set<Component> components = entity.getComponents();
        boolean z3 = true;
        if (!(components instanceof Collection) || !components.isEmpty()) {
            for (Component component : components) {
                if (entity.get(Reflection.getOrCreateKotlinClass(RegeneratingComponent.class)) != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (!chatMessage.getInfo().getRegenerate().isAllowed() && !z2) {
            z3 = false;
        }
        if (z3 && chatMessageAvailableState.isAvailable()) {
            list.add(new RegenerateMessageUiModel(ChatMessageKt.getTag(chatMessage) + SUFFIX_REGENERATION, z2, chatMessage.getInfo().getIds()));
        }
    }
}
