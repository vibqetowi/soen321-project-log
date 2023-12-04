package com.ifriend.data.toggle;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.domain.config.ConfigState;
import com.ifriend.domain.models.diary.DiaryMode;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DiaryFeatureToggle.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/data/toggle/DiaryFeatureToggle;", "Lcom/ifriend/data/toggle/TypedConfigFeatureToggle;", "Lcom/ifriend/domain/models/diary/DiaryMode;", "appConfigLocalDataSource", "Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;Lkotlinx/coroutines/CoroutineScope;)V", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiaryFeatureToggle extends TypedConfigFeatureToggle<DiaryMode> {

    /* compiled from: DiaryFeatureToggle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/config/ConfigState;", "it", "Lcom/ifriend/domain/models/diary/DiaryMode;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.toggle.DiaryFeatureToggle$1", f = "DiaryFeatureToggle.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.data.toggle.DiaryFeatureToggle$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ConfigState, Continuation<? super DiaryMode>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConfigState configState, Continuation<? super DiaryMode> continuation) {
            return ((AnonymousClass1) create(configState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = ((ConfigState) this.L$0).getStringFeature(DiaryFeatureToggleKt.DIARY_MODE_TOGGLE_NAME, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            String str = (String) obj;
            if (str == null) {
                return null;
            }
            return Intrinsics.areEqual(str, "light") ? DiaryMode.LIGHT : Intrinsics.areEqual(str, "dark") ? DiaryMode.DARK : DiaryMode.HIDE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public DiaryFeatureToggle(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        super(appConfigLocalDataSource, coroutineScope, null, null, new AnonymousClass1(null), 8, null);
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
    }
}
