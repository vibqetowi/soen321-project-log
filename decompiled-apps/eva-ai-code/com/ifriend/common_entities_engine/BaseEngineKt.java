package com.ifriend.common_entities_engine;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
/* compiled from: BaseEngine.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"restart", "", ExifInterface.LATITUDE_SOUTH, "Lcom/ifriend/common_entities_engine/State;", "Lcom/ifriend/common_entities_engine/SystemController;", "system", "Lcom/ifriend/common_entities_engine/System;", "common_entities_engine"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BaseEngineKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <S extends State> void restart(SystemController<S> systemController, System<S> system) {
        systemController.stop(system);
        systemController.start(system);
    }
}
