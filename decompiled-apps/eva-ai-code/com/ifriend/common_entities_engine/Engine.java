package com.ifriend.common_entities_engine;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.common_entities_engine.State;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: Engine.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\u0016\u0010\b\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\u001c\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u000bH&J\b\u0010\f\u001a\u00020\tH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH&J\u0016\u0010\u000f\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\b\u0010\u0010\u001a\u00020\tH&J\b\u0010\u0011\u001a\u00020\tH&¨\u0006\u0012"}, d2 = {"Lcom/ifriend/common_entities_engine/Engine;", ExifInterface.LATITUDE_SOUTH, "Lcom/ifriend/common_entities_engine/State;", "Lcom/ifriend/common_entities_engine/EventHandler;", "Lcom/ifriend/common_entities_engine/ExceptionListenerRegistry;", "attach", "system", "Lcom/ifriend/common_entities_engine/System;", "detach", "", "systems", "", "detachAll", "getState", "Lkotlinx/coroutines/flow/StateFlow;", "restart", "startAll", "stopAll", "common_entities_engine"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Engine<S extends State> extends EventHandler, ExceptionListenerRegistry<S> {
    Engine<S> attach(System<S> system);

    void detach(System<S> system);

    void detach(List<? extends System<S>> list);

    void detachAll();

    StateFlow<S> getState();

    void restart(System<S> system);

    void startAll();

    void stopAll();
}
