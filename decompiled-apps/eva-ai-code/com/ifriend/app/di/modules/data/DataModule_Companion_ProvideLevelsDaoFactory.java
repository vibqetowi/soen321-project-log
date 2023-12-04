package com.ifriend.app.di.modules.data;

import com.ifriend.data.storages.levels.LevelsDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideLevelsDaoFactory implements Factory<LevelsDao> {
    @Override // javax.inject.Provider
    public LevelsDao get() {
        return provideLevelsDao();
    }

    public static DataModule_Companion_ProvideLevelsDaoFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LevelsDao provideLevelsDao() {
        return (LevelsDao) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideLevelsDao());
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final DataModule_Companion_ProvideLevelsDaoFactory INSTANCE = new DataModule_Companion_ProvideLevelsDaoFactory();

        private InstanceHolder() {
        }
    }
}
