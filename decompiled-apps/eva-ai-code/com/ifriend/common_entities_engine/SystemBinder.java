package com.ifriend.common_entities_engine;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.ifriend.common_entities_engine.State;
import kotlin.Metadata;
/* compiled from: SystemBinder.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\r\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0016\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH&J\u001e\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/ifriend/common_entities_engine/SystemBinder;", ExifInterface.LATITUDE_SOUTH, "Lcom/ifriend/common_entities_engine/State;", "", "currentState", "()Lcom/ifriend/common_entities_engine/State;", "postEvent", "", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/common_entities_engine/Event;", "reportUpdateState", "reportedSystem", "Lcom/ifriend/common_entities_engine/System;", "throwException", "system", "exception", "", "common_entities_engine"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SystemBinder<S extends State> {
    S currentState();

    void postEvent(Event event);

    void reportUpdateState(System<S> system);

    void throwException(System<S> system, Throwable th);
}
