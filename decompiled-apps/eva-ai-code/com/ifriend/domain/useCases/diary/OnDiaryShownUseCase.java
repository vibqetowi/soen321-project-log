package com.ifriend.domain.useCases.diary;

import com.ifriend.domain.data.diary.DiaryRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: OnDiaryShownUseCase.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/useCases/diary/OnDiaryShownUseCase;", "", "repository", "Lcom/ifriend/domain/data/diary/DiaryRepository;", "(Lcom/ifriend/domain/data/diary/DiaryRepository;)V", "onDiaryShown", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnDiaryShownUseCase {
    private final DiaryRepository repository;

    public OnDiaryShownUseCase(DiaryRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    public final void onDiaryShown() {
        this.repository.markAllNotesAsShown();
    }
}
