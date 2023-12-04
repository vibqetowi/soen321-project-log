package com.ifriend.presentation.common.observers;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
/* compiled from: FlowObserver.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&¨\u0006\u0005"}, d2 = {"Lcom/ifriend/presentation/common/observers/FlowObserver;", ExifInterface.GPS_DIRECTION_TRUE, "", "subscribe", "Lkotlinx/coroutines/flow/Flow;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FlowObserver<T> {
    Flow<T> subscribe();
}
