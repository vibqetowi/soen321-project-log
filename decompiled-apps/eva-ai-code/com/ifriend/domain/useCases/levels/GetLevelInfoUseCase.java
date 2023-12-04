package com.ifriend.domain.useCases.levels;

import com.ifriend.common_utils.data.Resource;
import com.ifriend.domain.data.levels.LevelsRepository;
import com.ifriend.domain.models.levels.LevelInfo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: GetLevelInfoUseCase.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/useCases/levels/GetLevelInfoUseCase;", "", "repository", "Lcom/ifriend/domain/data/levels/LevelsRepository;", "(Lcom/ifriend/domain/data/levels/LevelsRepository;)V", "current", "Lcom/ifriend/domain/models/levels/LevelInfo;", "flow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/common_utils/data/Resource;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetLevelInfoUseCase {
    private final LevelsRepository repository;

    public GetLevelInfoUseCase(LevelsRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    public final Object flow(Continuation<? super Flow<? extends Resource<LevelInfo>>> continuation) {
        return this.repository.getLevelInfo(continuation);
    }

    public final LevelInfo current() {
        return this.repository.getCurrentLevelInfo();
    }
}
