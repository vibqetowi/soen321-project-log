package com.ifriend.chat.presentation.ui.diary.fragments;

import com.ifriend.base.navigation.api.cicerone.Screen;
import com.ifriend.chat.presentation.ui.diary.fragments.dark.DarkDiaryScreen;
import com.ifriend.chat.presentation.ui.diary.fragments.light.LightDiaryScreen;
import com.ifriend.data.toggle.DiaryFeatureToggle;
import com.ifriend.domain.models.diary.DiaryMode;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DiaryScreenFactory.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenFactory;", "", "diaryToggle", "Lcom/ifriend/data/toggle/DiaryFeatureToggle;", "(Lcom/ifriend/data/toggle/DiaryFeatureToggle;)V", "diaryScreen", "Lcom/ifriend/base/navigation/api/cicerone/Screen;", "noteId", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiaryScreenFactory {
    public static final int $stable = 8;
    private final DiaryFeatureToggle diaryToggle;

    @Inject
    public DiaryScreenFactory(DiaryFeatureToggle diaryToggle) {
        Intrinsics.checkNotNullParameter(diaryToggle, "diaryToggle");
        this.diaryToggle = diaryToggle;
    }

    public static /* synthetic */ Screen diaryScreen$default(DiaryScreenFactory diaryScreenFactory, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return diaryScreenFactory.diaryScreen(str);
    }

    public final Screen diaryScreen(String str) {
        if (this.diaryToggle.value() == DiaryMode.DARK) {
            return new DarkDiaryScreen(str);
        }
        return new LightDiaryScreen(str);
    }
}
