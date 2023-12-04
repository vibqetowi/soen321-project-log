package com.ifriend.app.di.modules.data;

import com.ifriend.data.storages.diary.DiaryDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideDiaryDaoFactory implements Factory<DiaryDao> {
    @Override // javax.inject.Provider
    public DiaryDao get() {
        return provideDiaryDao();
    }

    public static DataModule_Companion_ProvideDiaryDaoFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DiaryDao provideDiaryDao() {
        return (DiaryDao) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideDiaryDao());
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final DataModule_Companion_ProvideDiaryDaoFactory INSTANCE = new DataModule_Companion_ProvideDiaryDaoFactory();

        private InstanceHolder() {
        }
    }
}
