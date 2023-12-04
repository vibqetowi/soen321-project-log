package com.ifriend.data.storages.levels;

import com.ifriend.domain.models.levels.LevelInfo;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
/* compiled from: LevelsDao.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/ifriend/data/storages/levels/LevelsDao;", "", "clear", "", "getCurrentLevelInfo", "Lcom/ifriend/domain/models/levels/LevelInfo;", "getLevelInfo", "Lkotlinx/coroutines/flow/Flow;", "updateLevelInfo", "info", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LevelsDao {
    void clear();

    LevelInfo getCurrentLevelInfo();

    Flow<LevelInfo> getLevelInfo();

    void updateLevelInfo(LevelInfo levelInfo);
}
