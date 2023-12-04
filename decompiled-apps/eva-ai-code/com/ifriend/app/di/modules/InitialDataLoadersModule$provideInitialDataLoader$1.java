package com.ifriend.app.di.modules;

import com.ifriend.data.initialLoaders.AppConfigLoader;
import com.ifriend.data.initialLoaders.ChatConfigurationLoader;
import com.ifriend.data.initialLoaders.ChatGiftsLoader;
import com.ifriend.data.initialLoaders.DiaryLoader;
import com.ifriend.data.initialLoaders.InitialAvatarLoader;
import com.ifriend.data.initialLoaders.InitialBotLoader;
import com.ifriend.data.initialLoaders.InitialConfigurationBotsAvatarLoader;
import com.ifriend.data.initialLoaders.InitialLevelInfoLoader;
import com.ifriend.data.initialLoaders.InitialTagsLoader;
import com.ifriend.data.initialLoaders.InitialUserConfigLoader;
import com.ifriend.data.initialLoaders.InitialUserLoader;
import com.ifriend.domain.services.initialData.TimeoutDataLoaderBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: InitialDataLoadersModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ifriend/domain/services/initialData/TimeoutDataLoaderBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class InitialDataLoadersModule$provideInitialDataLoader$1 extends Lambda implements Function1<TimeoutDataLoaderBuilder, Unit> {
    final /* synthetic */ AppConfigLoader $appConfigLoader;
    final /* synthetic */ InitialAvatarLoader $avatarLoader;
    final /* synthetic */ InitialBotLoader $botLoader;
    final /* synthetic */ ChatConfigurationLoader $chatConfigurationLoader;
    final /* synthetic */ ChatGiftsLoader $chatGiftsLoader;
    final /* synthetic */ InitialConfigurationBotsAvatarLoader $configurationBotsAvatarLoader;
    final /* synthetic */ DiaryLoader $diaryLoader;
    final /* synthetic */ InitialLevelInfoLoader $levelInfoLoader;
    final /* synthetic */ InitialTagsLoader $tagsLoader;
    final /* synthetic */ InitialUserConfigLoader $userConfigLoader;
    final /* synthetic */ InitialUserLoader $userLoader;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialDataLoadersModule$provideInitialDataLoader$1(InitialAvatarLoader initialAvatarLoader, InitialConfigurationBotsAvatarLoader initialConfigurationBotsAvatarLoader, InitialUserLoader initialUserLoader, InitialBotLoader initialBotLoader, InitialTagsLoader initialTagsLoader, AppConfigLoader appConfigLoader, InitialUserConfigLoader initialUserConfigLoader, InitialLevelInfoLoader initialLevelInfoLoader, DiaryLoader diaryLoader, ChatConfigurationLoader chatConfigurationLoader, ChatGiftsLoader chatGiftsLoader) {
        super(1);
        this.$avatarLoader = initialAvatarLoader;
        this.$configurationBotsAvatarLoader = initialConfigurationBotsAvatarLoader;
        this.$userLoader = initialUserLoader;
        this.$botLoader = initialBotLoader;
        this.$tagsLoader = initialTagsLoader;
        this.$appConfigLoader = appConfigLoader;
        this.$userConfigLoader = initialUserConfigLoader;
        this.$levelInfoLoader = initialLevelInfoLoader;
        this.$diaryLoader = diaryLoader;
        this.$chatConfigurationLoader = chatConfigurationLoader;
        this.$chatGiftsLoader = chatGiftsLoader;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InitialDataLoadersModule.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ifriend/domain/services/initialData/TimeoutDataLoaderBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.app.di.modules.InitialDataLoadersModule$provideInitialDataLoader$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<TimeoutDataLoaderBuilder, Unit> {
        final /* synthetic */ InitialBotLoader $botLoader;
        final /* synthetic */ InitialTagsLoader $tagsLoader;
        final /* synthetic */ InitialUserLoader $userLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InitialUserLoader initialUserLoader, InitialBotLoader initialBotLoader, InitialTagsLoader initialTagsLoader) {
            super(1);
            this.$userLoader = initialUserLoader;
            this.$botLoader = initialBotLoader;
            this.$tagsLoader = initialTagsLoader;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TimeoutDataLoaderBuilder timeoutDataLoaderBuilder) {
            invoke2(timeoutDataLoaderBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(TimeoutDataLoaderBuilder blockingSection) {
            Intrinsics.checkNotNullParameter(blockingSection, "$this$blockingSection");
            blockingSection.parallelLoader(this.$userLoader);
            blockingSection.parallelLoader(this.$botLoader);
            blockingSection.parallelLoader(this.$tagsLoader);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TimeoutDataLoaderBuilder timeoutDataLoaderBuilder) {
        invoke2(timeoutDataLoaderBuilder);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TimeoutDataLoaderBuilder timeoutBlockingSection) {
        Intrinsics.checkNotNullParameter(timeoutBlockingSection, "$this$timeoutBlockingSection");
        timeoutBlockingSection.blockingSection(new AnonymousClass1(this.$userLoader, this.$botLoader, this.$tagsLoader));
        timeoutBlockingSection.blockingSection(new AnonymousClass2(this.$appConfigLoader, this.$userConfigLoader));
        timeoutBlockingSection.blockingSection(new AnonymousClass3(this.$levelInfoLoader, this.$diaryLoader, this.$chatConfigurationLoader, this.$chatGiftsLoader));
        timeoutBlockingSection.backgroundLoader(this.$avatarLoader);
        timeoutBlockingSection.backgroundLoader(this.$configurationBotsAvatarLoader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InitialDataLoadersModule.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ifriend/domain/services/initialData/TimeoutDataLoaderBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.app.di.modules.InitialDataLoadersModule$provideInitialDataLoader$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<TimeoutDataLoaderBuilder, Unit> {
        final /* synthetic */ AppConfigLoader $appConfigLoader;
        final /* synthetic */ InitialUserConfigLoader $userConfigLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AppConfigLoader appConfigLoader, InitialUserConfigLoader initialUserConfigLoader) {
            super(1);
            this.$appConfigLoader = appConfigLoader;
            this.$userConfigLoader = initialUserConfigLoader;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TimeoutDataLoaderBuilder timeoutDataLoaderBuilder) {
            invoke2(timeoutDataLoaderBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(TimeoutDataLoaderBuilder blockingSection) {
            Intrinsics.checkNotNullParameter(blockingSection, "$this$blockingSection");
            blockingSection.parallelLoader(this.$appConfigLoader);
            blockingSection.parallelLoader(this.$userConfigLoader);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InitialDataLoadersModule.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ifriend/domain/services/initialData/TimeoutDataLoaderBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.app.di.modules.InitialDataLoadersModule$provideInitialDataLoader$1$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends Lambda implements Function1<TimeoutDataLoaderBuilder, Unit> {
        final /* synthetic */ ChatConfigurationLoader $chatConfigurationLoader;
        final /* synthetic */ ChatGiftsLoader $chatGiftsLoader;
        final /* synthetic */ DiaryLoader $diaryLoader;
        final /* synthetic */ InitialLevelInfoLoader $levelInfoLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(InitialLevelInfoLoader initialLevelInfoLoader, DiaryLoader diaryLoader, ChatConfigurationLoader chatConfigurationLoader, ChatGiftsLoader chatGiftsLoader) {
            super(1);
            this.$levelInfoLoader = initialLevelInfoLoader;
            this.$diaryLoader = diaryLoader;
            this.$chatConfigurationLoader = chatConfigurationLoader;
            this.$chatGiftsLoader = chatGiftsLoader;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TimeoutDataLoaderBuilder timeoutDataLoaderBuilder) {
            invoke2(timeoutDataLoaderBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(TimeoutDataLoaderBuilder blockingSection) {
            Intrinsics.checkNotNullParameter(blockingSection, "$this$blockingSection");
            blockingSection.parallelLoader(this.$levelInfoLoader);
            blockingSection.parallelLoader(this.$diaryLoader);
            blockingSection.parallelLoader(this.$chatConfigurationLoader);
            blockingSection.parallelLoader(this.$chatGiftsLoader);
        }
    }
}
