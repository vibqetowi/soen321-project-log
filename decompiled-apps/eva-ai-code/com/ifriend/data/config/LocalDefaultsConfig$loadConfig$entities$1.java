package com.ifriend.data.config;

import androidx.autofill.HintConstants;
import com.ifriend.data.toggle.AvatarInPushToggleKt;
import com.ifriend.data.toggle.AvatarInRetentionPushToggleKt;
import com.ifriend.data.toggle.ChatGiftsStoreToggleKt;
import com.ifriend.data.toggle.ChatVideoBackgroundFeatureToggleImpl;
import com.ifriend.data.toggle.DiaryFeatureToggleKt;
import com.ifriend.data.toggle.IsRateAppDialogEnabledToggle;
import com.ifriend.data.toggle.SextingRequestToggleKt;
import com.ifriend.domain.config.ConfigKeys;
import com.ifriend.domain.config.LocalDefaultsConfigBuilder;
import com.ifriend.domain.logic.experiments.FeatureToggleKey;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocalDefaultsConfig.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.config.LocalDefaultsConfig$loadConfig$entities$1", f = "LocalDefaultsConfig.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class LocalDefaultsConfig$loadConfig$entities$1 extends SuspendLambda implements Function2<LocalDefaultsConfigBuilder, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LocalDefaultsConfig this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalDefaultsConfig$loadConfig$entities$1(LocalDefaultsConfig localDefaultsConfig, Continuation<? super LocalDefaultsConfig$loadConfig$entities$1> continuation) {
        super(2, continuation);
        this.this$0 = localDefaultsConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LocalDefaultsConfig$loadConfig$entities$1 localDefaultsConfig$loadConfig$entities$1 = new LocalDefaultsConfig$loadConfig$entities$1(this.this$0, continuation);
        localDefaultsConfig$loadConfig$entities$1.L$0 = obj;
        return localDefaultsConfig$loadConfig$entities$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LocalDefaultsConfigBuilder localDefaultsConfigBuilder, Continuation<? super Unit> continuation) {
        return ((LocalDefaultsConfig$loadConfig$entities$1) create(localDefaultsConfigBuilder, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        LocalDefaultsConfigBuilder localDefaultsConfigBuilder = (LocalDefaultsConfigBuilder) this.L$0;
        localDefaultsConfigBuilder.link(ConfigKeys.TERMS, "\"/terms.html\"");
        localDefaultsConfigBuilder.link(ConfigKeys.PRIVACY_POLICY, "\"/pp.html\"");
        localDefaultsConfigBuilder.endpoint(ConfigKeys.WEB_HOST, "\"https://www.evaapp.ai\"");
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, ConfigKeys.ANIMATE_BACKGROUND_URL, "https://resources.lovinga.com/droplet/android/1.1.0", (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, ConfigKeys.SUBSCRIPTION_TILE, Boxing.boxBoolean(false), (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, "reset_ai_enabled", Boxing.boxBoolean(true), (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, "icon_change_enabled", Boxing.boxBoolean(false), (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, "show_all_membership_benefits", Boxing.boxBoolean(true), (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, "sexting_communication_only_with_membership", Boxing.boxBoolean(true), (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, ConfigKeys.AI_PHOTO_ENABLED, Boxing.boxBoolean(false), (String) null, AnonymousClass1.INSTANCE, 4, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, "generate_ai_photos_for_man_enabled", Boxing.boxBoolean(false), (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, FeatureToggleKey.GENERATE_AI_PHOTOS.getKey(), Boxing.boxBoolean(true), (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, "confirm_email", Boxing.boxBoolean(false), (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, SextingRequestToggleKt.USER_SEXTING_REQUEST_FEATURE, Boxing.boxBoolean(false), (String) null, AnonymousClass2.INSTANCE, 4, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, SextingRequestToggleKt.MESSAGES_FROM_USER_TO_SHOW_SEXTING_REQUEST_FLIRTY, Boxing.boxInt(3), (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, SextingRequestToggleKt.MESSAGES_FROM_USER_TO_SHOW_SEXTING_REQUEST_FRIENDLY, Boxing.boxInt(20), (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, ConfigKeys.EMAIL_CONFIRMATION_DELAY, Boxing.boxLong(60000L), (String) null, (Function1) null, 12, (Object) null);
        this.this$0.neurons(localDefaultsConfigBuilder);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, ConfigKeys.AVATAR_GENERATION_COST, Boxing.boxInt(50), (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, ConfigKeys.AVATAR_GENERATION_COUNT, Boxing.boxInt(6), (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, "chat_avatar_animation", Boxing.boxBoolean(false), (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, "avatar_animation_enabled", Boxing.boxBoolean(false), (String) null, AnonymousClass3.INSTANCE, 4, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, AvatarInPushToggleKt.AVATAR_IN_PUSH_ENABLED, Boxing.boxBoolean(false), (String) null, AnonymousClass4.INSTANCE, 4, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, AvatarInRetentionPushToggleKt.AVATAR_IN_RETENTION_PUSH_ENABLED, Boxing.boxBoolean(false), (String) null, AnonymousClass5.INSTANCE, 4, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, "rate_and_review_us_enabled", Boxing.boxBoolean(false), (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, IsRateAppDialogEnabledToggle.RATE_APP_DIALOG_ENABLED_FEATURE, Boxing.boxBoolean(true), (String) null, AnonymousClass6.INSTANCE, 4, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, ChatVideoBackgroundFeatureToggleImpl.VIDEO_BACKGROUND_FEATURE, Boxing.boxBoolean(false), (String) null, AnonymousClass7.INSTANCE, 4, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, DiaryFeatureToggleKt.DIARY_MODE_TOGGLE_NAME, "hide", (String) null, AnonymousClass8.INSTANCE, 4, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, ChatGiftsStoreToggleKt.GIFTS_SHOP_ENABLED, Boxing.boxBoolean(false), (String) null, AnonymousClass9.INSTANCE, 4, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, ConfigKeys.IN_APP_UPDATES_THRESHOLDS, "172800,86400,172800,230400,230400,302400", (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, FeatureToggleKey.MESSAGE_REGENERATION.getKey(), Boxing.boxBoolean(false), (String) null, AnonymousClass10.INSTANCE, 4, (Object) null);
        localDefaultsConfigBuilder.feature(FeatureToggleKey.CHAT_CALL_FEATURE.getKey(), (String) Boxing.boxBoolean(false), AppPayloadConfig.INSTANCE.getMainChatPayload(), (Function1<? super LocalDefaultsConfigBuilder.FeatureBuilder<String>, Unit>) AnonymousClass11.INSTANCE);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, FeatureToggleKey.DIARY_ENABLED.getKey(), Boxing.boxBoolean(false), AppPayloadConfig.INSTANCE.getMainChatPayload(), (Function1) null, 8, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, FeatureToggleKey.TOPICS_ENABLED.getKey(), Boxing.boxBoolean(false), AppPayloadConfig.INSTANCE.getMainWithInfluensersChatPayload(), (Function1) null, 8, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, FeatureToggleKey.PREMIUM_TOPICS_ENABLED.getKey(), Boxing.boxBoolean(false), AppPayloadConfig.INSTANCE.getMainWithInfluensersChatPayload(), (Function1) null, 8, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, FeatureToggleKey.CONFIRM_EMAIL_PROMOTE_ENABLED.getKey(), Boxing.boxBoolean(false), (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, FeatureToggleKey.CONFIRM_EMAIL_BONUS_NEURONS.getKey(), Boxing.boxInt(0), (String) null, (Function1) null, 12, (Object) null);
        this.this$0.age(localDefaultsConfigBuilder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalDefaultsConfig.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder$FeatureBuilder;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.config.LocalDefaultsConfig$loadConfig$entities$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<LocalDefaultsConfigBuilder.FeatureBuilder<Boolean>, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> featureBuilder) {
            invoke2(featureBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> feature) {
            Intrinsics.checkNotNullParameter(feature, "$this$feature");
            feature.byTags(CollectionsKt.listOf("ai.avatar.disabled"), true);
            feature.addConditions(CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(HintConstants.AUTOFILL_HINT_GENDER, "female"), TuplesKt.to("ethnicity", "white")}));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalDefaultsConfig.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder$FeatureBuilder;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.config.LocalDefaultsConfig$loadConfig$entities$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<LocalDefaultsConfigBuilder.FeatureBuilder<Boolean>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> featureBuilder) {
            invoke2(featureBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> feature) {
            Intrinsics.checkNotNullParameter(feature, "$this$feature");
            feature.byTags(CollectionsKt.listOf("ai.user.request.sexting.exp"), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalDefaultsConfig.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder$FeatureBuilder;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.config.LocalDefaultsConfig$loadConfig$entities$1$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends Lambda implements Function1<LocalDefaultsConfigBuilder.FeatureBuilder<Boolean>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> featureBuilder) {
            invoke2(featureBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> feature) {
            Intrinsics.checkNotNullParameter(feature, "$this$feature");
            feature.byTags(CollectionsKt.listOf("ai.avatar.animate"), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalDefaultsConfig.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder$FeatureBuilder;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.config.LocalDefaultsConfig$loadConfig$entities$1$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass4 extends Lambda implements Function1<LocalDefaultsConfigBuilder.FeatureBuilder<Boolean>, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> featureBuilder) {
            invoke2(featureBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> feature) {
            Intrinsics.checkNotNullParameter(feature, "$this$feature");
            feature.byTags(CollectionsKt.listOf("ai.unique.pushes"), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalDefaultsConfig.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder$FeatureBuilder;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.config.LocalDefaultsConfig$loadConfig$entities$1$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass5 extends Lambda implements Function1<LocalDefaultsConfigBuilder.FeatureBuilder<Boolean>, Unit> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        AnonymousClass5() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> feature) {
            Intrinsics.checkNotNullParameter(feature, "$this$feature");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> featureBuilder) {
            invoke2(featureBuilder);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalDefaultsConfig.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder$FeatureBuilder;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.config.LocalDefaultsConfig$loadConfig$entities$1$6  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass6 extends Lambda implements Function1<LocalDefaultsConfigBuilder.FeatureBuilder<Boolean>, Unit> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        AnonymousClass6() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> featureBuilder) {
            invoke2(featureBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> feature) {
            Intrinsics.checkNotNullParameter(feature, "$this$feature");
            feature.byTags(CollectionsKt.listOf("ai.app.review.hide"), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalDefaultsConfig.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder$FeatureBuilder;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.config.LocalDefaultsConfig$loadConfig$entities$1$7  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass7 extends Lambda implements Function1<LocalDefaultsConfigBuilder.FeatureBuilder<Boolean>, Unit> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        AnonymousClass7() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> featureBuilder) {
            invoke2(featureBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> feature) {
            Intrinsics.checkNotNullParameter(feature, "$this$feature");
            feature.byTags(CollectionsKt.listOf("ai.avatar.background.android"), true);
            feature.byTags(CollectionsKt.listOf("ai.avatar.animate"), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalDefaultsConfig.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder$FeatureBuilder;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.config.LocalDefaultsConfig$loadConfig$entities$1$8  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass8 extends Lambda implements Function1<LocalDefaultsConfigBuilder.FeatureBuilder<String>, Unit> {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        AnonymousClass8() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LocalDefaultsConfigBuilder.FeatureBuilder<String> featureBuilder) {
            invoke2(featureBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LocalDefaultsConfigBuilder.FeatureBuilder<String> feature) {
            Intrinsics.checkNotNullParameter(feature, "$this$feature");
            feature.byTags(CollectionsKt.listOf("ai.diary"), "light");
            feature.byTags(CollectionsKt.listOf("ai.diary.dark.theme"), "dark");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalDefaultsConfig.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder$FeatureBuilder;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.config.LocalDefaultsConfig$loadConfig$entities$1$9  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass9 extends Lambda implements Function1<LocalDefaultsConfigBuilder.FeatureBuilder<Boolean>, Unit> {
        public static final AnonymousClass9 INSTANCE = new AnonymousClass9();

        AnonymousClass9() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> featureBuilder) {
            invoke2(featureBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> feature) {
            Intrinsics.checkNotNullParameter(feature, "$this$feature");
            feature.byTags(CollectionsKt.listOf("ai.gifts"), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalDefaultsConfig.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder$FeatureBuilder;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.config.LocalDefaultsConfig$loadConfig$entities$1$10  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass10 extends Lambda implements Function1<LocalDefaultsConfigBuilder.FeatureBuilder<Boolean>, Unit> {
        public static final AnonymousClass10 INSTANCE = new AnonymousClass10();

        AnonymousClass10() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> featureBuilder) {
            invoke2(featureBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> feature) {
            Intrinsics.checkNotNullParameter(feature, "$this$feature");
            feature.byTags(CollectionsKt.listOf("ai.answer.regenerate"), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalDefaultsConfig.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder$FeatureBuilder;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.config.LocalDefaultsConfig$loadConfig$entities$1$11  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass11 extends Lambda implements Function1<LocalDefaultsConfigBuilder.FeatureBuilder<Boolean>, Unit> {
        public static final AnonymousClass11 INSTANCE = new AnonymousClass11();

        AnonymousClass11() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> featureBuilder) {
            invoke2(featureBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LocalDefaultsConfigBuilder.FeatureBuilder<Boolean> feature) {
            Intrinsics.checkNotNullParameter(feature, "$this$feature");
            feature.byTags(CollectionsKt.listOf("ai.voice.call"), true);
        }
    }
}
