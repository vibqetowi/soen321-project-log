package com.ifriend.data.initialLoaders;

import com.ifriend.data.common.UserTags;
import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.data.chat.ChatsRepository;
import com.ifriend.domain.models.Tag;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InitialUserConfigLoader.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/data/initialLoaders/InitialUserConfigLoader;", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "chatsRepository", "Lcom/ifriend/domain/data/chat/ChatsRepository;", "tagsProvider", "Lcom/ifriend/domain/data/TagsProvider;", "(Lcom/ifriend/domain/data/chat/ChatsRepository;Lcom/ifriend/domain/data/TagsProvider;)V", "load", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitialUserConfigLoader implements InitialDataLoader {
    private final ChatsRepository chatsRepository;
    private final TagsProvider tagsProvider;

    public InitialUserConfigLoader(ChatsRepository chatsRepository, TagsProvider tagsProvider) {
        Intrinsics.checkNotNullParameter(chatsRepository, "chatsRepository");
        Intrinsics.checkNotNullParameter(tagsProvider, "tagsProvider");
        this.chatsRepository = chatsRepository;
        this.tagsProvider = tagsProvider;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(5:18|(1:20)|21|(2:22|(2:24|(1:26))(2:33|34))|(2:28|29)(2:30|(1:32)))|11|12|13))|37|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
        r0 = kotlin.Result.Companion;
        kotlin.Result.m7271constructorimpl(kotlin.ResultKt.createFailure(r7));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // com.ifriend.domain.services.initialData.InitialDataLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(Continuation<? super Boolean> continuation) {
        InitialUserConfigLoader$load$1 initialUserConfigLoader$load$1;
        int i;
        Object obj;
        if (continuation instanceof InitialUserConfigLoader$load$1) {
            initialUserConfigLoader$load$1 = (InitialUserConfigLoader$load$1) continuation;
            if ((initialUserConfigLoader$load$1.label & Integer.MIN_VALUE) != 0) {
                initialUserConfigLoader$load$1.label -= Integer.MIN_VALUE;
                Object obj2 = initialUserConfigLoader$load$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initialUserConfigLoader$load$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    List<Tag> current = this.tagsProvider.current();
                    if (current == null) {
                        current = CollectionsKt.emptyList();
                    }
                    Iterator<T> it = current.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.areEqual(((Tag) obj).getValue(), UserTags.SUBSCRIPTION_AVAILABLE)) {
                            break;
                        }
                    }
                    if (obj != null) {
                        return Boxing.boxBoolean(true);
                    }
                    Result.Companion companion = Result.Companion;
                    InitialUserConfigLoader initialUserConfigLoader = this;
                    ChatsRepository chatsRepository = this.chatsRepository;
                    initialUserConfigLoader$load$1.label = 1;
                    if (chatsRepository.setChatUserConfigure(initialUserConfigLoader$load$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj2);
                }
                Result.m7271constructorimpl(Unit.INSTANCE);
                return Boxing.boxBoolean(true);
            }
        }
        initialUserConfigLoader$load$1 = new InitialUserConfigLoader$load$1(this, continuation);
        Object obj22 = initialUserConfigLoader$load$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initialUserConfigLoader$load$1.label;
        if (i != 0) {
        }
        Result.m7271constructorimpl(Unit.INSTANCE);
        return Boxing.boxBoolean(true);
    }
}
