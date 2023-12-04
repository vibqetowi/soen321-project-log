package com.ifriend.ui.features.avatar;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarView;
import com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: AvatarContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", ViewHierarchyConstants.VIEW_KEY, "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AvatarContentKt$AnimatedAvatar$2 extends Lambda implements Function1<AnimatedAvatarView, Unit> {
    final /* synthetic */ Function0<Unit> $onGenerationClick;
    final /* synthetic */ Function0<Unit> $onPauseClick;
    final /* synthetic */ Function0<Unit> $onPlayClick;
    final /* synthetic */ AnimatedAvatarViewState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarContentKt$AnimatedAvatar$2(AnimatedAvatarViewState animatedAvatarViewState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        super(1);
        this.$state = animatedAvatarViewState;
        this.$onGenerationClick = function0;
        this.$onPlayClick = function02;
        this.$onPauseClick = function03;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedAvatarView animatedAvatarView) {
        invoke2(animatedAvatarView);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AnimatedAvatarView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        AnimatedAvatarViewState animatedAvatarViewState = this.$state;
        Function0<Unit> function0 = this.$onGenerationClick;
        Function0<Unit> function02 = this.$onPlayClick;
        Function0<Unit> function03 = this.$onPauseClick;
        view.update(animatedAvatarViewState);
        view.setListeners(function0, function02, function03);
    }
}
