package com.ifriend.presentation.features.chat.panel.ui.topics;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.facebook.share.internal.ShareConstants;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import com.ifriend.presentation.features.chat.panel.models.TopicPopupDataUi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: PremiumTopicPopupContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.presentation.features.chat.panel.ui.topics.ComposableSingletons$PremiumTopicPopupContentKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$PremiumTopicPopupContentKt$lambda1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$PremiumTopicPopupContentKt$lambda1$1 INSTANCE = new ComposableSingletons$PremiumTopicPopupContentKt$lambda1$1();

    ComposableSingletons$PremiumTopicPopupContentKt$lambda1$1() {
        super(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PremiumTopicPopupContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.panel.ui.topics.ComposableSingletons$PremiumTopicPopupContentKt$lambda-1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PremiumTopicPopupContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.panel.ui.topics.ComposableSingletons$PremiumTopicPopupContentKt$lambda-1$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<Boolean, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        public final void invoke(boolean z) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1589610020, i, -1, "com.ifriend.presentation.features.chat.panel.ui.topics.ComposableSingletons$PremiumTopicPopupContentKt.lambda-1.<anonymous> (PremiumTopicPopupContent.kt:54)");
            }
            PremiumTopicPopupContentKt.PremiumTopicPopupContent(new ChatTopicsUiState(null, false, new TopicPopupDataUi("Title", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Remind me tommorow", Integer.valueOf(R.drawable.img_droplets)), false, false, false, 59, null), AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE, composer, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
