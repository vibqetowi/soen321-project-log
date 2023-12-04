package io.sentry.protocol;

import com.facebook.internal.AnalyticsEvents;
import com.google.gson.annotations.SerializedName;
import io.sentry.IUnknownPropertiesConsumer;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public final class SentryStackFrame implements IUnknownPropertiesConsumer {
    @SerializedName(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE)
    private Boolean _native;
    @SerializedName("package")
    private String _package;
    private String absPath;
    private Integer colno;
    private String contextLine;
    private String filename;
    private List<Integer> framesOmitted;
    private String function;
    private String imageAddr;
    private Boolean inApp;
    private String instructionAddr;
    private Integer lineno;
    private String module;
    private String platform;
    private List<String> postContext;
    private List<String> preContext;
    private String rawFunction;
    private String symbolAddr;
    private Map<String, Object> unknown;
    private Map<String, String> vars;

    public List<String> getPreContext() {
        return this.preContext;
    }

    public void setPreContext(List<String> list) {
        this.preContext = list;
    }

    public List<String> getPostContext() {
        return this.postContext;
    }

    public void setPostContext(List<String> list) {
        this.postContext = list;
    }

    public Map<String, String> getVars() {
        return this.vars;
    }

    public void setVars(Map<String, String> map) {
        this.vars = map;
    }

    public List<Integer> getFramesOmitted() {
        return this.framesOmitted;
    }

    public void setFramesOmitted(List<Integer> list) {
        this.framesOmitted = list;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public String getFunction() {
        return this.function;
    }

    public void setFunction(String str) {
        this.function = str;
    }

    public String getModule() {
        return this.module;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public Integer getLineno() {
        return this.lineno;
    }

    public void setLineno(Integer num) {
        this.lineno = num;
    }

    public Integer getColno() {
        return this.colno;
    }

    public void setColno(Integer num) {
        this.colno = num;
    }

    public String getAbsPath() {
        return this.absPath;
    }

    public void setAbsPath(String str) {
        this.absPath = str;
    }

    public String getContextLine() {
        return this.contextLine;
    }

    public void setContextLine(String str) {
        this.contextLine = str;
    }

    public Boolean isInApp() {
        return this.inApp;
    }

    public void setInApp(Boolean bool) {
        this.inApp = bool;
    }

    public String getPackage() {
        return this._package;
    }

    public void setPackage(String str) {
        this._package = str;
    }

    public String getPlatform() {
        return this.platform;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public String getSymbolAddr() {
        return this.symbolAddr;
    }

    public void setSymbolAddr(String str) {
        this.symbolAddr = str;
    }

    public String getInstructionAddr() {
        return this.instructionAddr;
    }

    public void setInstructionAddr(String str) {
        this.instructionAddr = str;
    }

    public Boolean isNative() {
        return this._native;
    }

    public void setNative(Boolean bool) {
        this._native = bool;
    }

    @Override // io.sentry.IUnknownPropertiesConsumer
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = map;
    }

    public String getRawFunction() {
        return this.rawFunction;
    }

    public void setRawFunction(String str) {
        this.rawFunction = str;
    }
}
