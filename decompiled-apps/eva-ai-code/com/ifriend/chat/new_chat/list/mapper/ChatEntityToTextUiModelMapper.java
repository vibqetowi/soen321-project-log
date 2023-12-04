package com.ifriend.chat.new_chat.list.mapper;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.chat.new_chat.list.presentationSystems.levels.ExperienceMessageAnimationComponent;
import com.ifriend.chat.new_chat.list.presentationSystems.newMessagesAnimation.NeedToAnimateComponent;
import com.ifriend.chat.new_chat.list.ui.model.PaidTextMessageFromBotUi;
import com.ifriend.chat.new_chat.list.ui.model.TextMessageBotUiModel;
import com.ifriend.chat.new_chat.list.ui.model.TextMessageUiModel;
import com.ifriend.chat.new_chat.list.ui.model.TextMessageUserUiModel;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_utils.encoder.SextingEncoder;
import com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAvailableState;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.ui.utils.CustomTypefaceSpan;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
/* compiled from: ChatEntityToTextUiModelMapper.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToTextUiModelMapper;", "", "resourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "messageAccessInteractor", "Lcom/ifriend/domain/logic/chat/messages/ChatMessageAccessInteractor;", "(Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/domain/logic/chat/messages/ChatMessageAccessInteractor;)V", "boldMarkRegexes", "", "Lkotlin/text/Regex;", "getBoldMarkRegexes", "()Ljava/util/List;", "boldMarkRegexes$delegate", "Lkotlin/Lazy;", "boldTypeface", "Landroid/graphics/Typeface;", "getBoldTypeface", "()Landroid/graphics/Typeface;", "boldTypeface$delegate", "boldRolePlays", "Landroid/text/SpannableStringBuilder;", "text", "", "map", "Lcom/ifriend/chat/new_chat/list/ui/model/TextMessageUiModel;", "entity", "Lcom/ifriend/common_entities_engine/Entity;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", FirebaseAnalytics.Param.CONTENT, "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Text;", "availableState", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAvailableState;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatEntityToTextUiModelMapper {
    public static final int $stable = 8;
    private final Lazy boldMarkRegexes$delegate;
    private final Lazy boldTypeface$delegate;
    private final ChatMessageAccessInteractor messageAccessInteractor;
    private final ResourceProvider resourceProvider;

    @Inject
    public ChatEntityToTextUiModelMapper(ResourceProvider resourceProvider, ChatMessageAccessInteractor messageAccessInteractor) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(messageAccessInteractor, "messageAccessInteractor");
        this.resourceProvider = resourceProvider;
        this.messageAccessInteractor = messageAccessInteractor;
        this.boldTypeface$delegate = LazyKt.lazy(new ChatEntityToTextUiModelMapper$boldTypeface$2(this));
        this.boldMarkRegexes$delegate = LazyKt.lazy(ChatEntityToTextUiModelMapper$boldMarkRegexes$2.INSTANCE);
    }

    private final Typeface getBoldTypeface() {
        return (Typeface) this.boldTypeface$delegate.getValue();
    }

    private final List<Regex> getBoldMarkRegexes() {
        return (List) this.boldMarkRegexes$delegate.getValue();
    }

    public final TextMessageUiModel map(Entity entity, ChatMessage message, MessageContent.Text content, ChatMessageAvailableState availableState) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(availableState, "availableState");
        NeedToAnimateComponent needToAnimateComponent = (NeedToAnimateComponent) entity.get(Reflection.getOrCreateKotlinClass(NeedToAnimateComponent.class));
        if (message.getInfo().isFromUser()) {
            ExperienceMessageAnimationComponent experienceMessageAnimationComponent = (ExperienceMessageAnimationComponent) entity.get(Reflection.getOrCreateKotlinClass(ExperienceMessageAnimationComponent.class));
            return new TextMessageUserUiModel(ChatMessageKt.getTag(message), boldRolePlays(content.getText()), needToAnimateComponent != null, experienceMessageAnimationComponent != null ? Integer.valueOf(experienceMessageAnimationComponent.getExperienceChange()) : null, message);
        } else if (!availableState.isAvailable()) {
            return new PaidTextMessageFromBotUi(ChatMessageKt.getTag(message), SextingEncoder.INSTANCE.encode(content.getText()), needToAnimateComponent != null, needToAnimateComponent != null ? needToAnimateComponent.getAnimation() : null, ChatMessageKt.getId(message));
        } else {
            return new TextMessageBotUiModel(ChatMessageKt.getTag(message), boldRolePlays(content.getText()), needToAnimateComponent != null, needToAnimateComponent != null ? needToAnimateComponent.getAnimation() : null, message);
        }
    }

    private final SpannableStringBuilder boldRolePlays(String str) {
        String str2 = str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        Typeface boldTypeface = getBoldTypeface();
        if (boldTypeface == null) {
            return spannableStringBuilder;
        }
        for (Regex regex : getBoldMarkRegexes()) {
            for (MatchResult matchResult : Regex.findAll$default(regex, str2, 0, 2, null)) {
                IntRange range = matchResult.getRange();
                int first = range.getFirst();
                int last = range.getLast();
                if (first <= last) {
                    while (true) {
                        int i = first + 1;
                        spannableStringBuilder.setSpan(new CustomTypefaceSpan(boldTypeface), first, i, 17);
                        if (first != last) {
                            first = i;
                        }
                    }
                }
            }
        }
        return spannableStringBuilder;
    }
}
