package com.ifriend.presentation.features.chat.intro.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.ifriend.presentation.features.chat.intro.model.ChatIntroCardUiParams;
import com.ifriend.presentation.features.chat.intro.model.ChatIntroUiState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatIntroPopup.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.presentation.features.chat.intro.view.ComposableSingletons$ChatIntroPopupKt$lambda-3$1  reason: invalid class name */
/* loaded from: classes6.dex */
public final class ComposableSingletons$ChatIntroPopupKt$lambda3$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ChatIntroPopupKt$lambda3$1 INSTANCE = new ComposableSingletons$ChatIntroPopupKt$lambda3$1();

    ComposableSingletons$ChatIntroPopupKt$lambda3$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2133717941, i, -1, "com.ifriend.presentation.features.chat.intro.view.ComposableSingletons$ChatIntroPopupKt.lambda-3.<anonymous> (ChatIntroPopup.kt:297)");
            }
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = CollectionsKt.listOf((Object[]) new ChatIntroCardUiParams[]{new ChatIntroCardUiParams("Do you know me, babe?", "My name is Eva and my main kink is creating hot adult content.", "Wow, let's have fun", false, 8, null), new ChatIntroCardUiParams("Now I'm closer to you", "The creators of EVA AI have made my digital copy. You can learn here all my intimate secrets and spicy fantasies.", "I wanna be with you", false, 8, null), new ChatIntroCardUiParams("Make me yours", "Touch me, listen to my voice, kiss me, share my kinks and desires, get the photos of mine which no one has ever seen.", "Don't make me wait", false, 8, null)});
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            List list = (List) rememberedValue;
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            MutableIntState mutableIntState = (MutableIntState) rememberedValue2;
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ChatIntroUiState(false, "https://drive.google.com/uc?export=download&id=1m4UzeamkWA1nMOGAlNmYEEWn7Eh5Wlhu", "Eva Elfi", null, "🧝🏻\u200d♀️ Your favorite elf", (ChatIntroCardUiParams) CollectionsKt.first((List<? extends Object>) list), 9, null), null, 2, null);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue3;
            ChatIntroPopupKt.ChatIntroContent(invoke$lambda$5(mutableState), AnonymousClass1.INSTANCE, new AnonymousClass2(list, mutableIntState, mutableState), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$2(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatIntroUiState invoke$lambda$5(MutableState<ChatIntroUiState> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatIntroPopup.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.intro.view.ComposableSingletons$ChatIntroPopupKt$lambda-3$1$1  reason: invalid class name */
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
    /* compiled from: ChatIntroPopup.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.intro.view.ComposableSingletons$ChatIntroPopupKt$lambda-3$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
        final /* synthetic */ MutableIntState $index$delegate;
        final /* synthetic */ List<ChatIntroCardUiParams> $list;
        final /* synthetic */ MutableState<ChatIntroUiState> $state$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(List<ChatIntroCardUiParams> list, MutableIntState mutableIntState, MutableState<ChatIntroUiState> mutableState) {
            super(0);
            this.$list = list;
            this.$index$delegate = mutableIntState;
            this.$state$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ComposableSingletons$ChatIntroPopupKt$lambda3$1.invoke$lambda$3(this.$index$delegate, ComposableSingletons$ChatIntroPopupKt$lambda3$1.invoke$lambda$2(this.$index$delegate) + 1);
            MutableState<ChatIntroUiState> mutableState = this.$state$delegate;
            ComposableSingletons$ChatIntroPopupKt$lambda3$1.invoke$lambda$6(mutableState, ChatIntroUiState.copy$default(ComposableSingletons$ChatIntroPopupKt$lambda3$1.invoke$lambda$5(mutableState), false, null, null, null, null, this.$list.get(ComposableSingletons$ChatIntroPopupKt$lambda3$1.invoke$lambda$2(this.$index$delegate) % this.$list.size()), 31, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$3(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$6(MutableState<ChatIntroUiState> mutableState, ChatIntroUiState chatIntroUiState) {
        mutableState.setValue(chatIntroUiState);
    }
}
