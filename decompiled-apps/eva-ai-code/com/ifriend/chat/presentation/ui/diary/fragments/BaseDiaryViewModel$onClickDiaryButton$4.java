package com.ifriend.chat.presentation.ui.diary.fragments;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenState;
import com.ifriend.chat.presentation.ui.diary.views.DiaryButtonState;
import com.ifriend.domain.useCases.diary.ReplyDiaryNoteUseCase;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseDiaryViewModel.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryViewModel$onClickDiaryButton$4", f = "BaseDiaryViewModel.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BaseDiaryViewModel$onClickDiaryButton$4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ DiaryScreenState $state;
    int label;
    final /* synthetic */ BaseDiaryViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDiaryViewModel$onClickDiaryButton$4(BaseDiaryViewModel baseDiaryViewModel, DiaryScreenState diaryScreenState, Continuation<? super BaseDiaryViewModel$onClickDiaryButton$4> continuation) {
        super(1, continuation);
        this.this$0 = baseDiaryViewModel;
        this.$state = diaryScreenState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new BaseDiaryViewModel$onClickDiaryButton$4(this.this$0, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((BaseDiaryViewModel$onClickDiaryButton$4) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ReplyDiaryNoteUseCase replyDiaryNoteUseCase;
        RouterProvider routerProvider;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.updateButtonState(DiaryButtonState.Loading.INSTANCE);
            replyDiaryNoteUseCase = this.this$0.replyDiaryNoteUseCase;
            this.label = 1;
            obj = replyDiaryNoteUseCase.reply(((DiaryScreenState.DiaryDetail) this.$state).getDiary().getDomainModel(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            routerProvider = this.this$0.routerProvider;
            routerProvider.getRoute().exit();
        } else {
            this.this$0.changeState(AnonymousClass1.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseDiaryViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryViewModel$onClickDiaryButton$4$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<DiaryScreenState, DiaryScreenState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final DiaryScreenState invoke(DiaryScreenState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (state instanceof DiaryScreenState.DiariesList) {
                return state;
            }
            if (state instanceof DiaryScreenState.DiaryDetail) {
                return DiaryScreenState.DiaryDetail.copy$default((DiaryScreenState.DiaryDetail) state, null, null, false, false, null, new DiaryButtonState.TextBot("Back to chat"), 31, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
