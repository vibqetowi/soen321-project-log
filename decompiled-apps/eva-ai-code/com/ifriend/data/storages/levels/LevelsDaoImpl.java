package com.ifriend.data.storages.levels;

import com.ifriend.domain.models.levels.LevelInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: LevelsDaoImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/data/storages/levels/LevelsDaoImpl;", "Lcom/ifriend/data/storages/levels/LevelsDao;", "()V", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/domain/models/levels/LevelInfo;", "clear", "", "getCurrentLevelInfo", "getLevelInfo", "Lkotlinx/coroutines/flow/Flow;", "updateLevelInfo", "info", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LevelsDaoImpl implements LevelsDao {
    private final MutableStateFlow<LevelInfo> state = StateFlowKt.MutableStateFlow(null);

    @Override // com.ifriend.data.storages.levels.LevelsDao
    public Flow<LevelInfo> getLevelInfo() {
        return this.state;
    }

    @Override // com.ifriend.data.storages.levels.LevelsDao
    public LevelInfo getCurrentLevelInfo() {
        return this.state.getValue();
    }

    @Override // com.ifriend.data.storages.levels.LevelsDao
    public void updateLevelInfo(LevelInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.state.setValue(info);
    }

    @Override // com.ifriend.data.storages.levels.LevelsDao
    public void clear() {
        this.state.setValue(null);
    }
}
