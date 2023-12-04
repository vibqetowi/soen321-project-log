package com.ifriend.chat.presentation.ui.chat.photo;

import android.graphics.Bitmap;
import com.ifriend.ui.base.mvvm.BaseState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PreviewSendImageState.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/photo/PreviewSendImageState;", "Lcom/ifriend/ui/base/mvvm/BaseState;", "image", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "getImage", "()Landroid/graphics/Bitmap;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreviewSendImageState extends BaseState {
    private final Bitmap image;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ PreviewSendImageState copy$default(PreviewSendImageState previewSendImageState, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = previewSendImageState.image;
        }
        return previewSendImageState.copy(bitmap);
    }

    public final Bitmap component1() {
        return this.image;
    }

    public final PreviewSendImageState copy(Bitmap bitmap) {
        return new PreviewSendImageState(bitmap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreviewSendImageState) && Intrinsics.areEqual(this.image, ((PreviewSendImageState) obj).image);
    }

    public int hashCode() {
        Bitmap bitmap = this.image;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.hashCode();
    }

    public String toString() {
        Bitmap bitmap = this.image;
        return "PreviewSendImageState(image=" + bitmap + ")";
    }

    /* compiled from: PreviewSendImageState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/photo/PreviewSendImageState$Companion;", "", "()V", "getEmpty", "Lcom/ifriend/chat/presentation/ui/chat/photo/PreviewSendImageState;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PreviewSendImageState getEmpty() {
            return new PreviewSendImageState(null);
        }
    }

    public PreviewSendImageState(Bitmap bitmap) {
        this.image = bitmap;
    }

    public final Bitmap getImage() {
        return this.image;
    }
}
