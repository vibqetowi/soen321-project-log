package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.CollectionUtils;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes4.dex */
public final class Device implements IUnknownPropertiesConsumer {
    public static final String TYPE = "device";
    private String[] archs;
    private Float batteryLevel;
    private Float batteryTemperature;
    private Date bootTime;
    private String brand;
    private Boolean charging;
    private String connectionType;
    private Long externalFreeStorage;
    private Long externalStorageSize;
    private String family;
    private Long freeMemory;
    private Long freeStorage;
    private String id;
    @Deprecated
    private String language;
    private String locale;
    private Boolean lowMemory;
    private String manufacturer;
    private Long memorySize;
    private String model;
    private String modelId;
    private String name;
    private Boolean online;
    private DeviceOrientation orientation;
    private Float screenDensity;
    private Integer screenDpi;
    private Integer screenHeightPixels;
    private Integer screenWidthPixels;
    private Boolean simulator;
    private Long storageSize;
    private TimeZone timezone;
    private Map<String, Object> unknown;
    private Long usableMemory;

    /* loaded from: classes4.dex */
    public enum DeviceOrientation {
        PORTRAIT,
        LANDSCAPE
    }

    public Device() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Device(Device device) {
        this.name = device.name;
        this.manufacturer = device.manufacturer;
        this.brand = device.brand;
        this.family = device.family;
        this.model = device.model;
        this.modelId = device.modelId;
        this.charging = device.charging;
        this.online = device.online;
        this.orientation = device.orientation;
        this.simulator = device.simulator;
        this.memorySize = device.memorySize;
        this.freeMemory = device.freeMemory;
        this.usableMemory = device.usableMemory;
        this.lowMemory = device.lowMemory;
        this.storageSize = device.storageSize;
        this.freeStorage = device.freeStorage;
        this.externalStorageSize = device.externalStorageSize;
        this.externalFreeStorage = device.externalFreeStorage;
        this.screenWidthPixels = device.screenWidthPixels;
        this.screenHeightPixels = device.screenHeightPixels;
        this.screenDensity = device.screenDensity;
        this.screenDpi = device.screenDpi;
        this.bootTime = device.bootTime;
        this.id = device.id;
        this.language = device.language;
        this.connectionType = device.connectionType;
        this.batteryTemperature = device.batteryTemperature;
        this.batteryLevel = device.batteryLevel;
        String[] strArr = device.archs;
        this.archs = strArr != null ? (String[]) strArr.clone() : null;
        this.locale = device.locale;
        TimeZone timeZone = device.timezone;
        this.timezone = timeZone != null ? (TimeZone) timeZone.clone() : null;
        this.unknown = CollectionUtils.newConcurrentHashMap(device.unknown);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public String getFamily() {
        return this.family;
    }

    public void setFamily(String str) {
        this.family = str;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public String getModelId() {
        return this.modelId;
    }

    public void setModelId(String str) {
        this.modelId = str;
    }

    public Float getBatteryLevel() {
        return this.batteryLevel;
    }

    public void setBatteryLevel(Float f) {
        this.batteryLevel = f;
    }

    public Boolean isCharging() {
        return this.charging;
    }

    public void setCharging(Boolean bool) {
        this.charging = bool;
    }

    public Boolean isOnline() {
        return this.online;
    }

    public void setOnline(Boolean bool) {
        this.online = bool;
    }

    public DeviceOrientation getOrientation() {
        return this.orientation;
    }

    public void setOrientation(DeviceOrientation deviceOrientation) {
        this.orientation = deviceOrientation;
    }

    public Boolean isSimulator() {
        return this.simulator;
    }

    public void setSimulator(Boolean bool) {
        this.simulator = bool;
    }

    public Long getMemorySize() {
        return this.memorySize;
    }

    public void setMemorySize(Long l) {
        this.memorySize = l;
    }

    public Long getFreeMemory() {
        return this.freeMemory;
    }

    public void setFreeMemory(Long l) {
        this.freeMemory = l;
    }

    public Long getUsableMemory() {
        return this.usableMemory;
    }

    public void setUsableMemory(Long l) {
        this.usableMemory = l;
    }

    public Boolean isLowMemory() {
        return this.lowMemory;
    }

    public void setLowMemory(Boolean bool) {
        this.lowMemory = bool;
    }

    public Long getStorageSize() {
        return this.storageSize;
    }

    public void setStorageSize(Long l) {
        this.storageSize = l;
    }

    public Long getFreeStorage() {
        return this.freeStorage;
    }

    public void setFreeStorage(Long l) {
        this.freeStorage = l;
    }

    public Long getExternalStorageSize() {
        return this.externalStorageSize;
    }

    public void setExternalStorageSize(Long l) {
        this.externalStorageSize = l;
    }

    public Long getExternalFreeStorage() {
        return this.externalFreeStorage;
    }

    public void setExternalFreeStorage(Long l) {
        this.externalFreeStorage = l;
    }

    public Float getScreenDensity() {
        return this.screenDensity;
    }

    public void setScreenDensity(Float f) {
        this.screenDensity = f;
    }

    public Integer getScreenDpi() {
        return this.screenDpi;
    }

    public void setScreenDpi(Integer num) {
        this.screenDpi = num;
    }

    public Date getBootTime() {
        Date date = this.bootTime;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void setBootTime(Date date) {
        this.bootTime = date;
    }

    public TimeZone getTimezone() {
        return this.timezone;
    }

    public void setTimezone(TimeZone timeZone) {
        this.timezone = timeZone;
    }

    public String[] getArchs() {
        return this.archs;
    }

    public void setArchs(String[] strArr) {
        this.archs = strArr;
    }

    public Integer getScreenWidthPixels() {
        return this.screenWidthPixels;
    }

    public void setScreenWidthPixels(Integer num) {
        this.screenWidthPixels = num;
    }

    public Integer getScreenHeightPixels() {
        return this.screenHeightPixels;
    }

    public void setScreenHeightPixels(Integer num) {
        this.screenHeightPixels = num;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public String getConnectionType() {
        return this.connectionType;
    }

    public void setConnectionType(String str) {
        this.connectionType = str;
    }

    public Float getBatteryTemperature() {
        return this.batteryTemperature;
    }

    public void setBatteryTemperature(Float f) {
        this.batteryTemperature = f;
    }

    public String getLocale() {
        return this.locale;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.IUnknownPropertiesConsumer
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = new ConcurrentHashMap(map);
    }
}
