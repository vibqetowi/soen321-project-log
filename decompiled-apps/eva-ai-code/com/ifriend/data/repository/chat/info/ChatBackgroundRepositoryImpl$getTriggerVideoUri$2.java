package com.ifriend.data.repository.chat.info;

import android.net.Uri;
import com.ifriend.domain.data.files.FileProvider;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.logic.chat.ChatBackgroundTrigger;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatBackgroundRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.chat.info.ChatBackgroundRepositoryImpl$getTriggerVideoUri$2", f = "ChatBackgroundRepositoryImpl.kt", i = {}, l = {63, 77}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatBackgroundRepositoryImpl$getTriggerVideoUri$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ ChatBackgroundTrigger $backgroundTrigger;
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatBackgroundRepositoryImpl this$0;

    /* compiled from: ChatBackgroundRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatBackgroundTrigger.values().length];
            try {
                iArr[ChatBackgroundTrigger.DIARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatBackgroundTrigger.SEXTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChatBackgroundTrigger.IDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChatBackgroundTrigger.ENTERING_PRODUCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBackgroundRepositoryImpl$getTriggerVideoUri$2(ChatBackgroundRepositoryImpl chatBackgroundRepositoryImpl, ChatBackgroundTrigger chatBackgroundTrigger, String str, Continuation<? super ChatBackgroundRepositoryImpl$getTriggerVideoUri$2> continuation) {
        super(2, continuation);
        this.this$0 = chatBackgroundRepositoryImpl;
        this.$backgroundTrigger = chatBackgroundTrigger;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatBackgroundRepositoryImpl$getTriggerVideoUri$2(this.this$0, this.$backgroundTrigger, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((ChatBackgroundRepositoryImpl$getTriggerVideoUri$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource;
        Object obj2;
        String idleSextingUrl;
        FileProvider fileProvider;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        String str = "";
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatConfigsMemoryCachedSource = this.this$0.configurationBotsSource;
            this.label = 1;
            obj = chatConfigsMemoryCachedSource.getChatConfigs(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                Uri fromFile = Uri.fromFile((File) obj);
                Intrinsics.checkNotNullExpressionValue(fromFile, "fromFile(this)");
                str = fromFile.toString();
                Intrinsics.checkNotNull(str);
                return str;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        String str2 = this.$chatId;
        Iterator it = ((Iterable) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.areEqual(((ChatConfig) obj2).getChatId(), str2)) {
                break;
            }
        }
        ChatConfig chatConfig = (ChatConfig) obj2;
        if (chatConfig != null) {
            ChatConfig.Animations animations = chatConfig.getAnimations();
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.$backgroundTrigger.ordinal()];
            if (i2 == 1 || i2 == 2) {
                idleSextingUrl = animations.getIdleSextingUrl();
            } else if (i2 == 3) {
                idleSextingUrl = animations.getIdleUrl();
            } else if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            } else {
                idleSextingUrl = animations.getIdleStartUrl();
            }
            if (StringsKt.isBlank(idleSextingUrl)) {
                return "";
            }
            fileProvider = this.this$0.fileProvider;
            this.label = 2;
            obj = fileProvider.getFile(idleSextingUrl, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Uri fromFile2 = Uri.fromFile((File) obj);
            Intrinsics.checkNotNullExpressionValue(fromFile2, "fromFile(this)");
            str = fromFile2.toString();
        }
        Intrinsics.checkNotNull(str);
        return str;
    }
}
