package com.ifriend.presentation.common.uistate;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
/* compiled from: UiStateWatcher.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0004\"\u0004\b\u0000\u0010\u0002H\u0000*6\b\u0000\u0010\u0005\u001a\u0004\b\u0000\u0010\u0002\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0006"}, d2 = {"byValue", "Lkotlin/Function2;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/ifriend/presentation/common/uistate/DiffStrategy;", "DiffStrategy", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UiStateWatcherKt {
    public static final <T> Function2<T, T, Boolean> byValue() {
        return UiStateWatcherKt$byValue$1.INSTANCE;
    }
}
