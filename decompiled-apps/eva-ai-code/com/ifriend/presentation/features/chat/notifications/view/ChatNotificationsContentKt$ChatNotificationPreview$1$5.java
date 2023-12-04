package com.ifriend.presentation.features.chat.notifications.view;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.ifriend.presentation.features.chat.notifications.model.ChatNotificationUi;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatNotificationsContent.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatNotificationsContentKt$ChatNotificationPreview$1$5 extends Lambda implements Function0<Unit> {
    final /* synthetic */ List<String> $images;
    final /* synthetic */ MutableState<PersistentList<ChatNotificationUi>> $list$delegate;
    final /* synthetic */ List<String> $names;
    final /* synthetic */ MutableIntState $order$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatNotificationsContentKt$ChatNotificationPreview$1$5(MutableState<PersistentList<ChatNotificationUi>> mutableState, List<String> list, List<String> list2, MutableIntState mutableIntState) {
        super(0);
        this.$list$delegate = mutableState;
        this.$names = list;
        this.$images = list2;
        this.$order$delegate = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PersistentList ChatNotificationPreview$lambda$13;
        MutableState<PersistentList<ChatNotificationUi>> mutableState = this.$list$delegate;
        ChatNotificationPreview$lambda$13 = ChatNotificationsContentKt.ChatNotificationPreview$lambda$13(mutableState);
        List mutableList = CollectionsKt.toMutableList((Collection) ChatNotificationPreview$lambda$13);
        mutableList.add(ChatNotificationsContentKt.ChatNotificationPreview$createMessage(this.$names, this.$images, this.$order$delegate));
        CollectionsKt.removeFirst(mutableList);
        mutableState.setValue(ExtensionsKt.toPersistentList(mutableList));
    }
}
