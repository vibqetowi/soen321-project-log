package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.CollectionUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes4.dex */
public final class Gpu implements IUnknownPropertiesConsumer {
    public static final String TYPE = "gpu";
    private String apiType;
    private Integer id;
    private Integer memorySize;
    private Boolean multiThreadedRendering;
    private String name;
    private String npotSupport;
    private Map<String, Object> unknown;
    private Integer vendorId;
    private String vendorName;
    private String version;

    public Gpu() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Gpu(Gpu gpu) {
        this.name = gpu.name;
        this.id = gpu.id;
        this.vendorId = gpu.vendorId;
        this.vendorName = gpu.vendorName;
        this.memorySize = gpu.memorySize;
        this.apiType = gpu.apiType;
        this.multiThreadedRendering = gpu.multiThreadedRendering;
        this.version = gpu.version;
        this.npotSupport = gpu.npotSupport;
        this.unknown = CollectionUtils.newConcurrentHashMap(gpu.unknown);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer num) {
        this.id = num;
    }

    public Integer getVendorId() {
        return this.vendorId;
    }

    public void setVendorId(Integer num) {
        this.vendorId = num;
    }

    public String getVendorName() {
        return this.vendorName;
    }

    public void setVendorName(String str) {
        this.vendorName = str;
    }

    public Integer getMemorySize() {
        return this.memorySize;
    }

    public void setMemorySize(Integer num) {
        this.memorySize = num;
    }

    public String getApiType() {
        return this.apiType;
    }

    public void setApiType(String str) {
        this.apiType = str;
    }

    public Boolean isMultiThreadedRendering() {
        return this.multiThreadedRendering;
    }

    public void setMultiThreadedRendering(Boolean bool) {
        this.multiThreadedRendering = bool;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getNpotSupport() {
        return this.npotSupport;
    }

    public void setNpotSupport(String str) {
        this.npotSupport = str;
    }

    Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.IUnknownPropertiesConsumer
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = new ConcurrentHashMap(map);
    }
}
