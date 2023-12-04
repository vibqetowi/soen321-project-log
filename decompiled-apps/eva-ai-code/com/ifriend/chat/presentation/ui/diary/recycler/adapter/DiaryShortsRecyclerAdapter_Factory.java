package com.ifriend.chat.presentation.ui.diary.recycler.adapter;

import com.ifriend.chat.presentation.ui.diary.models.DiaryShortCardClick;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DiaryShortsRecyclerAdapter_Factory implements Factory<DiaryShortsRecyclerAdapter> {
    private final Provider<DiaryShortCardClick> diaryCardClickProvider;

    public DiaryShortsRecyclerAdapter_Factory(Provider<DiaryShortCardClick> provider) {
        this.diaryCardClickProvider = provider;
    }

    @Override // javax.inject.Provider
    public DiaryShortsRecyclerAdapter get() {
        return newInstance(this.diaryCardClickProvider.get());
    }

    public static DiaryShortsRecyclerAdapter_Factory create(Provider<DiaryShortCardClick> provider) {
        return new DiaryShortsRecyclerAdapter_Factory(provider);
    }

    public static DiaryShortsRecyclerAdapter newInstance(DiaryShortCardClick diaryShortCardClick) {
        return new DiaryShortsRecyclerAdapter(diaryShortCardClick);
    }
}
