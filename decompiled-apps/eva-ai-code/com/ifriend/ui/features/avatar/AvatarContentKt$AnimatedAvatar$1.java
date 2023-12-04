package com.ifriend.ui.features.avatar;

import android.content.Context;
import com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: AvatarContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarView;", "context", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AvatarContentKt$AnimatedAvatar$1 extends Lambda implements Function1<Context, AnimatedAvatarView> {
    public static final AvatarContentKt$AnimatedAvatar$1 INSTANCE = new AvatarContentKt$AnimatedAvatar$1();

    AvatarContentKt$AnimatedAvatar$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AnimatedAvatarView invoke(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new AnimatedAvatarView(context);
    }
}
