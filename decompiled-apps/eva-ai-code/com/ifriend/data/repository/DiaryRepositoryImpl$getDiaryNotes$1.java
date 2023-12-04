package com.ifriend.data.repository;

import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.models.profile.user.User;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
/* compiled from: DiaryRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"Lcom/ifriend/domain/models/profile/user/User;", "user", "Lcom/ifriend/domain/models/profile/bot/Bot;", "bot", "Lkotlin/Pair;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$1", f = "DiaryRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DiaryRepositoryImpl$getDiaryNotes$1 extends SuspendLambda implements Function3<User, Bot, Continuation<? super Pair<? extends User, ? extends Bot>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DiaryRepositoryImpl$getDiaryNotes$1(Continuation<? super DiaryRepositoryImpl$getDiaryNotes$1> continuation) {
        super(3, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(User user, Bot bot, Continuation<? super Pair<User, Bot>> continuation) {
        DiaryRepositoryImpl$getDiaryNotes$1 diaryRepositoryImpl$getDiaryNotes$1 = new DiaryRepositoryImpl$getDiaryNotes$1(continuation);
        diaryRepositoryImpl$getDiaryNotes$1.L$0 = user;
        diaryRepositoryImpl$getDiaryNotes$1.L$1 = bot;
        return diaryRepositoryImpl$getDiaryNotes$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(User user, Bot bot, Continuation<? super Pair<? extends User, ? extends Bot>> continuation) {
        return invoke2(user, bot, (Continuation<? super Pair<User, Bot>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return TuplesKt.to((User) this.L$0, (Bot) this.L$1);
    }
}
