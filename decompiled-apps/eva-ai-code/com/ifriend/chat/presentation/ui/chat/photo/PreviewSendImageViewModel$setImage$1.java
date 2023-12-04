package com.ifriend.chat.presentation.ui.chat.photo;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: PreviewSendImageViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/chat/photo/PreviewSendImageState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PreviewSendImageViewModel$setImage$1 extends Lambda implements Function1<PreviewSendImageState, PreviewSendImageState> {
    final /* synthetic */ Bitmap $bitmap;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewSendImageViewModel$setImage$1(Bitmap bitmap) {
        super(1);
        this.$bitmap = bitmap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PreviewSendImageState invoke(PreviewSendImageState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new PreviewSendImageState(this.$bitmap);
    }
}
