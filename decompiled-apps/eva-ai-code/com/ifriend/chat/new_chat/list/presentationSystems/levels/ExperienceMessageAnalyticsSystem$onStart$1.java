package com.ifriend.chat.new_chat.list.presentationSystems.levels;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.ifriend.chat.new_chat.list.presentationSystems.levels.LevelsAnalytics;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.core.tools.api.AppIdentityConverter;
import com.ifriend.domain.newChat.chat.ChatClientKt;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.socket.MessagesSourceMessage;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ExperienceMessageAnalyticsSystem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.presentationSystems.levels.ExperienceMessageAnalyticsSystem$onStart$1", f = "ExperienceMessageAnalyticsSystem.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ExperienceMessageAnalyticsSystem$onStart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ExperienceMessageAnalyticsSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperienceMessageAnalyticsSystem$onStart$1(ExperienceMessageAnalyticsSystem experienceMessageAnalyticsSystem, Continuation<? super ExperienceMessageAnalyticsSystem$onStart$1> continuation) {
        super(2, continuation);
        this.this$0 = experienceMessageAnalyticsSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExperienceMessageAnalyticsSystem$onStart$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ExperienceMessageAnalyticsSystem$onStart$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MessagesSource messagesSource;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            messagesSource = this.this$0.messagesSource;
            final Flow<MessagesSourceMessage> allMessages = messagesSource.getAllMessages(true);
            this.label = 1;
            if (FlowKt.collect(FlowKt.onEach(new Flow<Object>() { // from class: com.ifriend.chat.new_chat.list.presentationSystems.levels.ExperienceMessageAnalyticsSystem$onStart$1$invokeSuspend$$inlined$getMessagesOf$default$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", "com/ifriend/domain/socket/MessagesSourceKt$getMessagesOf$$inlined$filterIsInstance$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.ifriend.chat.new_chat.list.presentationSystems.levels.ExperienceMessageAnalyticsSystem$onStart$1$invokeSuspend$$inlined$getMessagesOf$default$1$2  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.ifriend.chat.new_chat.list.presentationSystems.levels.ExperienceMessageAnalyticsSystem$onStart$1$invokeSuspend$$inlined$getMessagesOf$default$1$2", f = "ExperienceMessageAnalyticsSystem.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                    /* renamed from: com.ifriend.chat.new_chat.list.presentationSystems.levels.ExperienceMessageAnalyticsSystem$onStart$1$invokeSuspend$$inlined$getMessagesOf$default$1$2$1  reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label -= Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    if (obj instanceof MessagesSourceMessage.LevelInfoUpdate) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(continuation);
                        Object obj22 = anonymousClass1.result;
                        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, new AnonymousClass1(this.this$0, null)), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExperienceMessageAnalyticsSystem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.chat.new_chat.list.presentationSystems.levels.ExperienceMessageAnalyticsSystem$onStart$1$1", f = "ExperienceMessageAnalyticsSystem.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.chat.new_chat.list.presentationSystems.levels.ExperienceMessageAnalyticsSystem$onStart$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<MessagesSourceMessage.LevelInfoUpdate, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ExperienceMessageAnalyticsSystem this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ExperienceMessageAnalyticsSystem experienceMessageAnalyticsSystem, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = experienceMessageAnalyticsSystem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MessagesSourceMessage.LevelInfoUpdate levelInfoUpdate, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(levelInfoUpdate, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AppIdentityConverter appIdentityConverter;
            String str;
            AppIdentityConverter appIdentityConverter2;
            String str2;
            List<ChatMessage> messages;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MessagesSourceMessage.LevelInfoUpdate levelInfoUpdate = (MessagesSourceMessage.LevelInfoUpdate) this.L$0;
            MessagesSourceMessage.LevelInfoUpdate.Changes.Reason reason = levelInfoUpdate.getChanges().getReason();
            ChatMessage chatMessage = null;
            String messageTag = reason != null ? reason.getMessageTag() : null;
            EntitiesState access$currentState = ExperienceMessageAnalyticsSystem.access$currentState(this.this$0);
            if (access$currentState != null && (messages = ChatClientKt.getMessages(access$currentState)) != null) {
                Iterator<T> it = messages.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.areEqual(ChatMessageKt.getTag((ChatMessage) next), messageTag)) {
                        chatMessage = next;
                        break;
                    }
                }
                chatMessage = chatMessage;
            }
            int experienceChanged = levelInfoUpdate.getChanges().getExperienceChanged();
            if (experienceChanged > 0 && chatMessage != null) {
                appIdentityConverter2 = this.this$0.appIdentityConverter;
                str2 = this.this$0.chatId;
                LevelsAnalytics.INSTANCE.expGained(experienceChanged, new LevelsAnalytics.ExpGainedReason.Message(ChatMessageKt.getId(chatMessage)), appIdentityConverter2.convertToDbId(str2));
            }
            if (levelInfoUpdate.getChanges().getLevelChanged() > 0) {
                LevelsAnalytics levelsAnalytics = LevelsAnalytics.INSTANCE;
                int level = levelInfoUpdate.getCurrent().getLevel();
                appIdentityConverter = this.this$0.appIdentityConverter;
                str = this.this$0.chatId;
                levelsAnalytics.levelAchieved(level, appIdentityConverter.convertToDbId(str));
            }
            return Unit.INSTANCE;
        }
    }
}
