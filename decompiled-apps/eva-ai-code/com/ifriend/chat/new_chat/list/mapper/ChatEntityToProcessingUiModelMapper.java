package com.ifriend.chat.new_chat.list.mapper;

import android.content.Context;
import com.ifriend.chat.new_chat.R;
import com.ifriend.chat.new_chat.list.ui.model.ChatEventUiModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatEntityToProcessingUiModelMapper.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToProcessingUiModelMapper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "map", "Lcom/ifriend/chat/new_chat/list/ui/model/ChatEventUiModel;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatEntityToProcessingUiModelMapper {
    public static final int $stable = 8;
    private final Context context;

    @Inject
    public ChatEntityToProcessingUiModelMapper(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final ChatEventUiModel map() {
        String string = this.context.getString(R.string.bot_processing);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new ChatEventUiModel(string);
    }
}
