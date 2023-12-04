package com.ifriend.chat.presentation.ui.diary.fragments;

import com.ifriend.chat.presentation.ui.diary.models.DiaryListItem;
import com.ifriend.chat.presentation.ui.diary.models.ThemedDiaryCardItem;
import com.ifriend.domain.useCases.diary.OnDiaryShownUseCase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseDiaryViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryListItem;", "allNotes", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryViewModel$start$2", f = "BaseDiaryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BaseDiaryViewModel$start$2 extends SuspendLambda implements Function2<List<? extends DiaryListItem>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseDiaryViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDiaryViewModel$start$2(BaseDiaryViewModel baseDiaryViewModel, Continuation<? super BaseDiaryViewModel$start$2> continuation) {
        super(2, continuation);
        this.this$0 = baseDiaryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseDiaryViewModel$start$2 baseDiaryViewModel$start$2 = new BaseDiaryViewModel$start$2(this.this$0, continuation);
        baseDiaryViewModel$start$2.L$0 = obj;
        return baseDiaryViewModel$start$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends DiaryListItem> list, Continuation<? super Unit> continuation) {
        return ((BaseDiaryViewModel$start$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String str;
        OnDiaryShownUseCase onDiaryShownUseCase;
        boolean z;
        String str2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List list = (List) this.L$0;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof ThemedDiaryCardItem) {
                arrayList.add(obj3);
            }
        }
        BaseDiaryViewModel baseDiaryViewModel = this.this$0;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            String id = ((ThemedDiaryCardItem) obj2).getUiModel().getId();
            str2 = baseDiaryViewModel.diaryNoteIdToShowAfterStart;
            if (Intrinsics.areEqual(id, str2)) {
                break;
            }
        }
        ThemedDiaryCardItem themedDiaryCardItem = (ThemedDiaryCardItem) obj2;
        str = this.this$0.diaryNoteIdToShowAfterStart;
        if (str != null && themedDiaryCardItem != null) {
            z = this.this$0.isDiaryNoteShownAfterStart;
            if (!z) {
                this.this$0.openDiaryNote(themedDiaryCardItem, list);
                onDiaryShownUseCase = this.this$0.onDiaryShownUseCase;
                onDiaryShownUseCase.onDiaryShown();
                return Unit.INSTANCE;
            }
        }
        this.this$0.updateState(list);
        onDiaryShownUseCase = this.this$0.onDiaryShownUseCase;
        onDiaryShownUseCase.onDiaryShown();
        return Unit.INSTANCE;
    }
}
