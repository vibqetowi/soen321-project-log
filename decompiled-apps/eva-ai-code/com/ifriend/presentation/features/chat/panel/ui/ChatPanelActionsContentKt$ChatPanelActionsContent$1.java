package com.ifriend.presentation.features.chat.panel.ui;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.ifriend.presentation.features.chat.panel.models.ChatPanelActionMarker;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;
/* compiled from: ChatPanelActionsContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatPanelActionsContentKt$ChatPanelActionsContent$1 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ Function1<ChatPanelActionMarker, Unit> $onPanelActionClick;
    final /* synthetic */ ChatTopicsUiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatPanelActionsContentKt$ChatPanelActionsContent$1(ChatTopicsUiState chatTopicsUiState, Function1<? super ChatPanelActionMarker, Unit> function1) {
        super(1);
        this.$state = chatTopicsUiState;
        this.$onPanelActionClick = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
        invoke2(lazyListScope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatPanelActionsContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "topic", "Lcom/ifriend/presentation/features/chat/panel/models/ChatPanelActionMarker;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.panel.ui.ChatPanelActionsContentKt$ChatPanelActionsContent$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ChatPanelActionMarker, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ChatPanelActionMarker topic) {
            Intrinsics.checkNotNullParameter(topic, "topic");
            return topic.getId();
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        ImmutableList<ChatPanelActionMarker> topics = this.$state.getTopics();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        Function1<ChatPanelActionMarker, Unit> function1 = this.$onPanelActionClick;
        LazyRow.items(topics.size(), anonymousClass1 != null ? new ChatPanelActionsContentKt$ChatPanelActionsContent$1$invoke$$inlined$items$default$2(anonymousClass1, topics) : null, new ChatPanelActionsContentKt$ChatPanelActionsContent$1$invoke$$inlined$items$default$3(ChatPanelActionsContentKt$ChatPanelActionsContent$1$invoke$$inlined$items$default$1.INSTANCE, topics), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new ChatPanelActionsContentKt$ChatPanelActionsContent$1$invoke$$inlined$items$default$4(topics, function1)));
    }
}
