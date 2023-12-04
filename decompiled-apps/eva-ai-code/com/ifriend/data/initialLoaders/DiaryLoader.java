package com.ifriend.data.initialLoaders;

import com.ifriend.data.toggle.ConfigFeatureToggleKt;
import com.ifriend.data.toggle.DiaryFeatureToggle;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.diary.DiaryRepository;
import com.ifriend.domain.models.diary.DiaryMode;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DiaryLoader.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/data/initialLoaders/DiaryLoader;", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "diaryFeatureToggle", "Lcom/ifriend/data/toggle/DiaryFeatureToggle;", "diaryRepository", "Lcom/ifriend/domain/data/diary/DiaryRepository;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "(Lcom/ifriend/data/toggle/DiaryFeatureToggle;Lcom/ifriend/domain/data/diary/DiaryRepository;Lcom/ifriend/domain/data/UserRepository;)V", "load", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiaryLoader implements InitialDataLoader {
    private final DiaryFeatureToggle diaryFeatureToggle;
    private final DiaryRepository diaryRepository;
    private final UserRepository userRepository;

    public DiaryLoader(DiaryFeatureToggle diaryFeatureToggle, DiaryRepository diaryRepository, UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(diaryFeatureToggle, "diaryFeatureToggle");
        Intrinsics.checkNotNullParameter(diaryRepository, "diaryRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.diaryFeatureToggle = diaryFeatureToggle;
        this.diaryRepository = diaryRepository;
        this.userRepository = userRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(4:11|12|13|14)(2:17|18))(1:19))(2:29|(1:31)(1:32))|20|(2:22|23)(4:24|(3:26|(1:28)|12)|13|14)))|35|6|7|(0)(0)|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
        r0 = kotlin.Result.Companion;
        kotlin.Result.m7271constructorimpl(kotlin.ResultKt.createFailure(r7));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    @Override // com.ifriend.domain.services.initialData.InitialDataLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(Continuation<? super Boolean> continuation) {
        DiaryLoader$load$1 diaryLoader$load$1;
        int i;
        DiaryLoader diaryLoader;
        if (continuation instanceof DiaryLoader$load$1) {
            diaryLoader$load$1 = (DiaryLoader$load$1) continuation;
            if ((diaryLoader$load$1.label & Integer.MIN_VALUE) != 0) {
                diaryLoader$load$1.label -= Integer.MIN_VALUE;
                Object obj = diaryLoader$load$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = diaryLoader$load$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    diaryLoader$load$1.L$0 = this;
                    diaryLoader$load$1.label = 1;
                    if (ConfigFeatureToggleKt.waitUntilFeatureToggleLoaded(this.diaryFeatureToggle, diaryLoader$load$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    diaryLoader = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        Result.m7271constructorimpl(Unit.INSTANCE);
                        return Boxing.boxBoolean(true);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    diaryLoader = (DiaryLoader) diaryLoader$load$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (diaryLoader.diaryFeatureToggle.value() != DiaryMode.HIDE) {
                    return Boxing.boxBoolean(true);
                }
                if (diaryLoader.userRepository.getCurrentUser() != null) {
                    Result.Companion companion = Result.Companion;
                    DiaryLoader diaryLoader2 = diaryLoader;
                    DiaryRepository diaryRepository = diaryLoader.diaryRepository;
                    diaryLoader$load$1.L$0 = null;
                    diaryLoader$load$1.label = 2;
                    if (diaryRepository.refreshAllNotes(diaryLoader$load$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Result.m7271constructorimpl(Unit.INSTANCE);
                }
                return Boxing.boxBoolean(true);
            }
        }
        diaryLoader$load$1 = new DiaryLoader$load$1(this, continuation);
        Object obj2 = diaryLoader$load$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = diaryLoader$load$1.label;
        if (i != 0) {
        }
        if (diaryLoader.diaryFeatureToggle.value() != DiaryMode.HIDE) {
        }
    }
}
