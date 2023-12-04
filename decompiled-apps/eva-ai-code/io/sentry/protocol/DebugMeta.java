package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public final class DebugMeta implements IUnknownPropertiesConsumer {
    private List<DebugImage> images;
    private SdkInfo sdkInfo;
    private Map<String, Object> unknown;

    public List<DebugImage> getImages() {
        return this.images;
    }

    public void setImages(List<DebugImage> list) {
        this.images = list != null ? new ArrayList(list) : null;
    }

    public SdkInfo getSdkInfo() {
        return this.sdkInfo;
    }

    public void setSdkInfo(SdkInfo sdkInfo) {
        this.sdkInfo = sdkInfo;
    }

    @Override // io.sentry.IUnknownPropertiesConsumer
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = map;
    }
}
