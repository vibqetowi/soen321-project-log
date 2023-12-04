package com.ifriend.domain.useCases.diary;

import com.ifriend.domain.data.diary.DiaryRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: RefreshDiaryUseCase.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/ifriend/domain/useCases/diary/RefreshDiaryUseCase;", "", "repository", "Lcom/ifriend/domain/data/diary/DiaryRepository;", "(Lcom/ifriend/domain/data/diary/DiaryRepository;)V", "refresh", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshDiaryUseCase {
    private final DiaryRepository repository;

    public RefreshDiaryUseCase(DiaryRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    public final Object refresh(Continuation<? super Unit> continuation) {
        Object refreshAllNotes = this.repository.refreshAllNotes(continuation);
        return refreshAllNotes == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? refreshAllNotes : Unit.INSTANCE;
    }
}
