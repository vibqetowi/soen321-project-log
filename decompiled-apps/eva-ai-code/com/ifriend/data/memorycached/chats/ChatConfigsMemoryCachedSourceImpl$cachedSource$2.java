package com.ifriend.data.memorycached.chats;

import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatConfigsMemoryCachedSourceImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ifriend/data/common/InMemoryCachedSource;", "", "", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatConfigsMemoryCachedSourceImpl$cachedSource$2 extends Lambda implements Function0<InMemoryCachedSource<String, List<? extends ChatConfig>>> {
    final /* synthetic */ ChatConfigsMemoryCachedSourceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatConfigsMemoryCachedSourceImpl$cachedSource$2(ChatConfigsMemoryCachedSourceImpl chatConfigsMemoryCachedSourceImpl) {
        super(0);
        this.this$0 = chatConfigsMemoryCachedSourceImpl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatConfigsMemoryCachedSourceImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.memorycached.chats.ChatConfigsMemoryCachedSourceImpl$cachedSource$2$1", f = "ChatConfigsMemoryCachedSourceImpl.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.data.memorycached.chats.ChatConfigsMemoryCachedSourceImpl$cachedSource$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super List<? extends ChatConfig>>, Object> {
        int label;
        final /* synthetic */ ChatConfigsMemoryCachedSourceImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatConfigsMemoryCachedSourceImpl chatConfigsMemoryCachedSourceImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chatConfigsMemoryCachedSourceImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(String str, Continuation<? super List<? extends ChatConfig>> continuation) {
            return invoke2(str, (Continuation<? super List<ChatConfig>>) continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(String str, Continuation<? super List<ChatConfig>> continuation) {
            return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.this$0.getRemoteConfigurations(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final InMemoryCachedSource<String, List<? extends ChatConfig>> invoke2() {
        return new InMemoryCachedSource<>(null, new AnonymousClass1(this.this$0, null), null, 5, null);
    }
}
