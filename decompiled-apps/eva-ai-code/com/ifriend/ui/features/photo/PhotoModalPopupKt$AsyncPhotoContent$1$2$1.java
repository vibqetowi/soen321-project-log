package com.ifriend.ui.features.photo;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PhotoModalPopup.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PhotoModalPopupKt$AsyncPhotoContent$1$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState<Offset> $offset$delegate;
    final /* synthetic */ MutableFloatState $scale$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoModalPopupKt$AsyncPhotoContent$1$2$1(MutableFloatState mutableFloatState, MutableState<Offset> mutableState) {
        super(0);
        this.$scale$delegate = mutableFloatState;
        this.$offset$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        float AsyncPhotoContent$lambda$9$lambda$1;
        AsyncPhotoContent$lambda$9$lambda$1 = PhotoModalPopupKt.AsyncPhotoContent$lambda$9$lambda$1(this.$scale$delegate);
        if (AsyncPhotoContent$lambda$9$lambda$1 > 1.0f) {
            this.$scale$delegate.setFloatValue(1.0f);
            PhotoModalPopupKt.AsyncPhotoContent$lambda$9$lambda$5(this.$offset$delegate, Offset.Companion.m3034getZeroF1C5BW0());
            return;
        }
        this.$scale$delegate.setFloatValue(1.5f);
    }
}
